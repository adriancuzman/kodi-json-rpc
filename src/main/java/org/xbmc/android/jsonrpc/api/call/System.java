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
package org.xbmc.android.jsonrpc.api.call;

import org.codehaus.jackson.JsonNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.model.SystemModel;

public final class System {

  /**
   * Ejects or closes the optical disc drive (if available).
   * <p/>
   * This class represents the API method <tt>System.EjectOpticalDrive</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class EjectOpticalDrive extends AbstractCall<String> {
    public final static String API_TYPE = "System.EjectOpticalDrive";

    /**
     * Ejects or closes the optical disc drive (if available).
     */
    public EjectOpticalDrive() {
      super();
    }

    @Override
    protected String parseOne(JsonNode node) {
      return node.getTextValue();
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return false;
    }
  }

  /**
   * Retrieves the values of the given properties.
   * <p/>
   * This class represents the API method <tt>System.GetProperties</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetProperties extends AbstractCall<SystemModel.PropertyValue> {
    public final static String API_TYPE = "System.GetProperties";

    /**
     * Retrieves the values of the given properties.
     * 
     * @param properties
     *          One or more of: <tt>canshutdown</tt>, <tt>cansuspend</tt>, <tt>canhibernate</tt>, <tt>canreboot</tt>. See constants at
     *          {@link SystemModel.PropertyName}.
     */
    public GetProperties(String... properties) {
      super();
      addParameter("properties", properties);
    }

    @Override
    protected SystemModel.PropertyValue parseOne(JsonNode node) {
      return new SystemModel.PropertyValue(node);
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return false;
    }
  }

  /**
   * Puts the system running Kodi into hibernate mode.
   * <p/>
   * This class represents the API method <tt>System.Hibernate</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Hibernate extends AbstractCall<String> {
    public final static String API_TYPE = "System.Hibernate";

    /**
     * Construct via parcel.
     */
    public Hibernate() {
      super();
    }

    @Override
    protected String parseOne(JsonNode node) {
      return node.getTextValue();
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return false;
    }
  }

  /**
   * Reboots the system running Kodi.
   * <p/>
   * This class represents the API method <tt>System.Reboot</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Reboot extends AbstractCall<String> {
    public final static String API_TYPE = "System.Reboot";

    /**
     * Reboots the system running XBMC.
     */
    public Reboot() {
      super();
    }

    @Override
    protected String parseOne(JsonNode node) {
      return node.getTextValue();
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return false;
    }
  }

  /**
   * Shuts the system running Kodi down.
   * <p/>
   * This class represents the API method <tt>System.Shutdown</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Shutdown extends AbstractCall<String> {
    public final static String API_TYPE = "System.Shutdown";

    /**
     * Construct via parcel.
     */
    public Shutdown() {
      super();
    }

    @Override
    protected String parseOne(JsonNode node) {
      return node.getTextValue();
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return false;
    }
  }

  /**
   * Suspends the system running Kodi.
   * <p/>
   * This class represents the API method <tt>System.Suspend</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Suspend extends AbstractCall<String> {
    public final static String API_TYPE = "System.Suspend";

    /**
     * Suspends the system running XBMC.
     */
    public Suspend() {
      super();
    }

    @Override
    protected String parseOne(JsonNode node) {
      return node.getTextValue();
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return false;
    }
  }
}
