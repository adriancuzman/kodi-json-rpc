package org.tinymediamanager.jsonrpc.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinymediamanager.jsonrpc.api.AbstractCall;
import org.tinymediamanager.jsonrpc.config.HostConfig;
import org.tinymediamanager.jsonrpc.notification.AbstractEvent;

public class JavaConnectionManager {
  private static final Logger                LOGGER             = LoggerFactory.getLogger(JavaConnectionManager.class);
  private final List<ConnectionListener>     connectionListener = new ArrayList<ConnectionListener>();
  /**
   * Since we can't return the de-serialized object from the service, put the response back into the received one and return the received one.
   */
  private final Map<String, CallRequest<?>>  mCallRequests      = new ConcurrentHashMap<String, CallRequest<?>>();

  private final Map<String, AbstractCall<?>> mCalls             = new ConcurrentHashMap<String, AbstractCall<?>>();

  private boolean                            isConnected        = false;

  private Socket                             socket;
  private BufferedWriter                     bufferedWriter;

  private HostConfig                         hostConfig;

  /**
   * Static reference to Jackson's object mapper.
   */
  private final static ObjectMapper          OM                 = new ObjectMapper();

  /**
   * Executes a JSON-RPC request with the full result in the callback.
   *
   * @param call
   *          Call to execute
   * @param callback
   * @return
   */
  public <T> JavaConnectionManager call(final AbstractCall<T> call, final ApiCallback<T> callback) {
    if (isConnected) {
      mCallRequests.put(call.getId(), new CallRequest<T>(call, callback));
      mCalls.put(call.getId(), call);
      writeSocket(call);
    }
    else {
      LOGGER.error("Cannot send call - NOT connected!");
    }
    return this;
  }

  public void registerConnectionListener(ConnectionListener listener) {
    if (listener != null) {
      connectionListener.add(listener);
    }
  }

  public void unregisterConnectionListener(ConnectionListener listener) {
    if (listener != null) {
      connectionListener.remove(listener);
    }
  }

  public boolean isConnected() {
    return isConnected;
  }

  public void connect(HostConfig config) throws ApiException {
    if (isConnected) {
      disconnect();
    }
    this.hostConfig = config;
    try {
      final InetSocketAddress address = new InetSocketAddress(config.mAddress, config.mTcpPort);
      socket = new Socket();
      socket.setSoTimeout(0);
      socket.connect(address);
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      startParsingIncomingMessages();
      isConnected = true;
      notifyConnected();
    }
    catch (UnknownHostException e) {
      disconnect();
      throw new ApiException(ApiException.IO_UNKNOWN_HOST, e.getMessage(), e);
    }
    catch (ConnectException e) {
      disconnect();
      throw new ApiException(ApiException.IO_EXCEPTION_WHILE_OPENING, e.getMessage(), e);
    }
    catch (IOException e) {
      disconnect();
      throw new ApiException(ApiException.IO_EXCEPTION, e.getMessage(), e);
    }
  }

  public HostConfig getHostConfig() {
    return hostConfig;
  }

  public void reconnect() throws ApiException {
    connect(hostConfig);
  }

  private void startParsingIncomingMessages() {
    new Thread() {

      @Override
      public void run() {
        final JsonFactory jf = OM.getJsonFactory();
        JsonParser jp;
        try {
          jp = jf.createJsonParser(socket.getInputStream());
          JsonNode node;
          while ((node = OM.readTree(jp)) != null) {
            notifyClients(node);
          }
        }
        catch (Exception e) {
          disconnect();
          LOGGER.error("", e);
          // e.printStackTrace();
        }
      };

    }.start();

  }

  public void disconnect() {
    if (isConnected) {
      try {
        if (bufferedWriter != null) {
          bufferedWriter.close();
        }
      }
      catch (Exception e) {
        e.printStackTrace();
      }
      try {
        if (socket != null) {
          socket.close();
        }
      }
      catch (Exception e) {
        e.printStackTrace();
      }
      notifyDisconnect();
      isConnected = false;
    }
    else {
      // TODO throw exception
    }
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  private void notifyClients(JsonNode node) {
    if (node.has("error")) {
      final String id = node.get("id").getValueAsText();
      if (mCallRequests.containsKey(id)) {
        CallRequest callRequest = mCallRequests.remove(id);
        mCalls.remove(id);
        ApiCallback callback = callRequest.mCallback;
        AbstractCall call = callRequest.mCall;
        JsonNode errorNode = node.get("error");
        int errorCode = -1;
        if (errorNode.has("code"))
          errorCode = errorNode.get("code").getIntValue();
        String message = "";
        if (errorNode.has("message"))
          message = errorNode.get("message").getTextValue();
        String hint = "";
        if (errorNode.has("data"))
          hint = errorNode.get("data").toString();
        callback.onError(errorCode, message, hint);
      }
      else {
        LOGGER.error("No such request for id {}: ERROR={}", id, node.toString());
      }
      // TODO
      // check if notification or api call
    }
    else if (node.has("id")) {
      // it's api call.
      final String id = node.get("id").getValueAsText();
      if (mCallRequests.containsKey(id)) {
        CallRequest callRequest = mCallRequests.remove(id);
        mCalls.remove(id);
        ApiCallback callback = callRequest.mCallback;
        AbstractCall call = callRequest.mCall;
        call.setResponse(node);
        callback.onResponse(call);
      }
      else {
        LOGGER.error("No such request for id {}: DATA={}", id, node.toString());
      }
    }
    else {
      // it's a notification.
      final AbstractEvent event = AbstractEvent.parse((ObjectNode) node);
      if (event != null) {
        for (ConnectionListener listener : connectionListener) {
          listener.notificationReceived(event);
        }
      }
      else {
        // Log.i(TAG, "Ignoring unknown notification " +
        // node.get("method").getTextValue() + ".");
      }
    }
  }

  /**
   * Serializes the API request and dumps it on the socket.
   *
   * @param call
   */
  private void writeSocket(AbstractCall<?> call) {
    final String data = call.getRequest().toString();
    LOGGER.debug("CALL: {}", data);
    try {
      bufferedWriter.write(data + "\n");
      bufferedWriter.flush();
    }
    catch (IOException e) {
      // TODO
    }
  }

  /**
   * A call request bundles an API call and its callback of the same type.
   *
   * @author freezy <freezy@xbmc.org>
   */
  private static class CallRequest<T> {
    private final AbstractCall<T> mCall;
    private final ApiCallback<T>  mCallback;

    public CallRequest(AbstractCall<T> call, ApiCallback<T> callback) {
      this.mCall = call;
      this.mCallback = callback;
    }

    public void update(AbstractCall<?> call) {
      mCall.copyResponse(call);
    }

    public void respond() {
      mCallback.onResponse(mCall);
    }

    public void error(int code, String message, String hint) {
      mCallback.onError(code, message, hint);
    }
  }

  private void notifyDisconnect() {
    for (ConnectionListener listener : connectionListener) {
      listener.disconnected();
    }
  }

  private void notifyConnected() {
    for (ConnectionListener listener : connectionListener) {
      listener.connected();
    }
  }

}
