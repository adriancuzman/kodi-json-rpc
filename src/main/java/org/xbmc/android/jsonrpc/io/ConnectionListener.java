package org.xbmc.android.jsonrpc.io;

import org.xbmc.android.jsonrpc.notification.AbstractEvent;

public interface ConnectionListener {

  public void connected();

  public void disconnected();

  public void notificationReceived(AbstractEvent event);

}
