package org.tinymediamanager.jsonrpc.io;

import org.tinymediamanager.jsonrpc.notification.AbstractEvent;

public interface ConnectionListener {

  public void connected();

  public void disconnected();

  public void notificationReceived(AbstractEvent event);

}
