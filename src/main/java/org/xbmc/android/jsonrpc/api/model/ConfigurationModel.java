/*
 *      Copyright (C) 2005-2013 Team XBMC
 *      http://xbmc.org
 *
 *  This Program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2, or (at your option)
 *  any later version.
 *
 *  This Program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with XBMC Remote; see the file license.  If not, write to
 *  the Free Software Foundation, 675 Mass Ave, Cambridge, MA 02139, USA.
 *  http://www.gnu.org/copyleft/gpl.html
 *
 */
package org.xbmc.android.jsonrpc.api.model;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class ConfigurationModel {

  /**
   * API Name: <tt>Configuration</tt>
   * <p/>
   * Note: Seems this class isn't used yet in the API.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Configuration extends AbstractModel {
    public final static String API_TYPE      = "Configuration";

    // field names
    public static final String NOTIFICATIONS = "notifications";

    // class members
    public final Notifications notifications;

    /**
     * @param notifications
     */
    public Configuration(Notifications notifications) {
      this.notifications = notifications;
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(NOTIFICATIONS, notifications.toJsonNode());
      return node;
    }
  }

  /**
   * API Name: <tt>Configuration.Notifications</tt>
   * <p/>
   * Note: Seems this class isn't used yet in the API.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Notifications extends AbstractModel {
    public final static String API_TYPE     = "Configuration.Notifications";

    // field names
    public static final String APPLICATION  = "application";
    public static final String AUDIOLIBRARY = "audiolibrary";
    public static final String GUI          = "gui";
    public static final String INPUT        = "input";
    public static final String OTHER        = "other";
    public static final String PLAYER       = "player";
    public static final String PLAYLIST     = "playlist";
    public static final String PVR          = "pvr";
    public static final String SYSTEM       = "system";
    public static final String VIDEOLIBRARY = "videolibrary";

    // class members
    public final Boolean       application;
    public final Boolean       audiolibrary;
    public final Boolean       gui;
    public final Boolean       input;
    public final Boolean       other;
    public final Boolean       player;
    public final Boolean       playlist;
    public final Boolean       pvr;
    public final Boolean       system;
    public final Boolean       videolibrary;

    /**
     * @param application
     * @param audiolibrary
     * @param gui
     * @param input
     * @param other
     * @param player
     * @param playlist
     * @param pvr
     * @param system
     * @param videolibrary
     */
    public Notifications(Boolean application, Boolean audiolibrary, Boolean gui, Boolean input, Boolean other, Boolean player, Boolean playlist,
        Boolean pvr, Boolean system, Boolean videolibrary) {
      this.application = application;
      this.audiolibrary = audiolibrary;
      this.gui = gui;
      this.input = input;
      this.other = other;
      this.player = player;
      this.playlist = playlist;
      this.pvr = pvr;
      this.system = system;
      this.videolibrary = videolibrary;
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(APPLICATION, application);
      node.put(AUDIOLIBRARY, audiolibrary);
      node.put(GUI, gui);
      node.put(INPUT, input);
      node.put(OTHER, other);
      node.put(PLAYER, player);
      node.put(PLAYLIST, playlist);
      node.put(PVR, pvr);
      node.put(SYSTEM, system);
      node.put(VIDEOLIBRARY, videolibrary);
      return node;
    }
  }
}
