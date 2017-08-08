package org.tinymediamanager.rpc;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tinymediamanager.jsonrpc.api.AbstractCall;
import org.tinymediamanager.jsonrpc.api.call.Files;
import org.tinymediamanager.jsonrpc.api.call.VideoLibrary;
import org.tinymediamanager.jsonrpc.api.model.FilesModel;
import org.tinymediamanager.jsonrpc.api.model.ListModel;
import org.tinymediamanager.jsonrpc.api.model.VideoModel;
import org.tinymediamanager.jsonrpc.api.model.VideoModel.MovieDetail;
import org.tinymediamanager.jsonrpc.api.model.VideoModel.MovieFields;
import org.tinymediamanager.jsonrpc.api.model.VideoModel.TVShowDetail;
import org.tinymediamanager.jsonrpc.config.HostConfig;
import org.tinymediamanager.jsonrpc.io.ApiCallback;
import org.tinymediamanager.jsonrpc.io.ConnectionListener;
import org.tinymediamanager.jsonrpc.io.JavaConnectionManager;
import org.tinymediamanager.jsonrpc.notification.AbstractEvent;

public class JsonRpcTest {
  private static final Logger          LOGGER = LoggerFactory.getLogger(JsonRpcTest.class);

  // *************************************************************************************
  // you need to enable Kodi -> remote control from OTHER machines (to open TCP port 9090)
  // *************************************************************************************

  private static JavaConnectionManager cm     = new JavaConnectionManager();

  @Test
  public void events() {
    // do nothing, just wait for events...
    sleep(60);
  }

  @Test
  public void getDataSources() throws InterruptedException {
    final Files.GetSources f = new Files.GetSources(FilesModel.Media.VIDEO); // movies + tv !!!
    cm.call(f, new ApiCallback<ListModel.SourceItem>() {

      @Override
      public void onResponse(AbstractCall<ListModel.SourceItem> call) {
        LOGGER.info(" found " + call.getResults().size() + " sources");
        LOGGER.debug("RESPONSE < " + call);

        LOGGER.info("--- KODI DATASOURCES ---");
        for (ListModel.SourceItem res : call.getResults()) {
          LOGGER.info(res.file + " - " + Arrays.toString(getIpAndPath(res.file)));
        }

        String ds = "//server/asdf";
        LOGGER.info(ds + " - " + Arrays.toString(getIpAndPath(ds)));
      }

      @Override
      public void onError(int code, String message, String hint) {
        LOGGER.warn("Error " + code + ": " + message);
      }
    });
  }

  /**
   * gets the resolved IP address of UNC/SMB path<br>
   * \\hostname\asdf or smb://hostname/asdf will return the IP:asdf
   *
   * @param ds
   *          TMM/Kodi datasource
   * @return IP:path, or LOCAL:path
   */
  private String[] getIpAndPath(String ds) {
    String[] ret = { "", "" };
    URI u = null;
    try {
      u = new URI(ds);
    }
    catch (URISyntaxException e) {
      try {
        Path p = Paths.get(ds).toAbsolutePath();
        u = p.toUri();
      }
      catch (InvalidPathException e2) {
        e.printStackTrace();
      }
    }
    if (!(u.getHost() == null || u.getHost().isEmpty())) {
      ret[1] = u.getPath();
      if (ds.startsWith("upnp")) {
        ret[0] = getMacFromUpnpUUID(u.getHost());
      }
      else {
        try {
          InetAddress i = InetAddress.getByName(u.getHost());
          ret[0] = i.getHostAddress().toString();
        }
        catch (UnknownHostException e) {
          ret[0] = u.getHost();
        }
      }
    }
    else {
      ret[0] = "LOCAL";
      ret[1] = u.getPath();
    }
    return ret;
  }

  /**
   * gets the MAC from an upnp UUID string (= last 6 bytes reversed)<br>
   * like upnp://00113201-aac2-0011-c2aa-02aa01321100 -> 00113201AA02
   *
   * @param uuid
   * @return
   */
  private String getMacFromUpnpUUID(String uuid) {
    String s = uuid.substring(uuid.lastIndexOf('-') + 1);
    StringBuilder result = new StringBuilder();
    for (int i = s.length() - 2; i >= 0; i = i - 2) {
      result.append(new StringBuilder(s.substring(i, i + 2)));
    }
    return result.toString().toUpperCase();
  }

  @Test
  public void getAllMovies() {
    final VideoLibrary.GetMovies vl = new VideoLibrary.GetMovies();
    cm.call(vl, new ApiCallback<VideoModel.MovieDetail>() {

      @Override
      public void onResponse(AbstractCall<MovieDetail> call) {
        LOGGER.debug("RESPONSE < " + call);
        LOGGER.info(" found " + call.getResults().size() + " movies");
        for (MovieDetail res : call.getResults()) {
          getMovieDetails(res.movieid);
        }
      }

      @Override
      public void onError(int code, String message, String hint) {
        LOGGER.warn("Error " + code + ": " + message);
      }
    });
  }

  @Test
  public void getMovieDetails() {
    getMovieDetails(4);
  }

  private void getMovieDetails(int movieid) {
    // final VideoLibrary.GetMovieDetails vl = new VideoLibrary.GetMovieDetails(movieid, MovieFields.values.toArray(new String[0]));
    final VideoLibrary.GetMovieDetails vl = new VideoLibrary.GetMovieDetails(movieid, MovieFields.FILE);
    cm.call(vl, new ApiCallback<VideoModel.MovieDetail>() {

      @Override
      public void onResponse(AbstractCall<MovieDetail> call) {
        for (MovieDetail res : call.getResults()) {
          LOGGER.debug(" " + res);
        }
      }

      @Override
      public void onError(int code, String message, String hint) {
        LOGGER.warn("Error " + code + ": " + message);
      }
    });
  }

  @Test
  public void getAllTvShows() {
    final VideoLibrary.GetTVShows vl = new VideoLibrary.GetTVShows();
    cm.call(vl, new ApiCallback<VideoModel.TVShowDetail>() {

      @Override
      public void onResponse(AbstractCall<TVShowDetail> call) {
        LOGGER.info(" found " + call.getResults().size() + " shows");
        for (TVShowDetail res : call.getResults()) {
          LOGGER.debug(" " + res);
        }
      }

      @Override
      public void onError(int code, String message, String hint) {
        LOGGER.warn("Error " + code + ": " + message);
      }
    });
  }

  private static final int getDefaultHttpPort() {
    int ret = 80;
    if (!System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("windows")) {
      ret = 8080;
    }
    return ret;
  }

  @BeforeClass
  public static void setUp() {
    HostConfig config = new HostConfig("127.0.0.1", getDefaultHttpPort(), 9090);
    cm.registerConnectionListener(new ConnectionListener() {

      @Override
      public void notificationReceived(AbstractEvent event) {
        // LOGGER.debug("Event received: " + event.getClass().getCanonicalName());
        LOGGER.debug("Event received: " + event);
      }

      @Override
      public void disconnected() {
        LOGGER.debug("Event: Disconnected");

      }

      @Override
      public void connected() {
        LOGGER.debug("Event: Connected");

      }
    });
    LOGGER.info("Connecting...");
    cm.connect(config);
  }

  @AfterClass
  public static void tearDown() throws InterruptedException {
    sleep(1); // wait a bit - async
    LOGGER.info("Exiting...");
    cm.disconnect();
  }

  private static void sleep(int sec) {
    try {
      Thread.sleep(sec * 1000);
    }
    catch (Exception e) {
    }
  }
}
