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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.BooleanNode;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.TextNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class GlobalModel {

  /**
   * API Name: <tt>Global.Time</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Time extends AbstractModel {
    public final static String API_TYPE     = "Global.Time";

    // field names
    public static final String HOURS        = "hours";
    public static final String MILLISECONDS = "milliseconds";
    public static final String MINUTES      = "minutes";
    public static final String SECONDS      = "seconds";

    // class members
    public final Integer       hours;
    public final Integer       milliseconds;
    public final Integer       minutes;
    public final Integer       seconds;

    /**
     * @param hours
     * @param milliseconds
     * @param minutes
     * @param seconds
     */
    public Time(Integer hours, Integer milliseconds, Integer minutes, Integer seconds) {
      this.hours = hours;
      this.milliseconds = milliseconds;
      this.minutes = minutes;
      this.seconds = seconds;
    }

    /**
     * Returns the time in milliseconds
     * 
     * @return
     */
    public long getMilliseconds() {
      return hours * 3600000 + minutes * 60000 + seconds * 1000 + milliseconds;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a Time object
     */
    public Time(JsonNode node) {
      hours = node.get(HOURS).getIntValue(); // required value
      milliseconds = node.get(MILLISECONDS).getIntValue(); // required value
      minutes = node.get(MINUTES).getIntValue(); // required value
      seconds = node.get(SECONDS).getIntValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(HOURS, hours);
      node.put(MILLISECONDS, milliseconds);
      node.put(MINUTES, minutes);
      node.put(SECONDS, seconds);
      return node;
    }

    /**
     * Extracts a list of {@link Time} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<Time> getGlobalModelTimeList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<Time> l = new ArrayList<Time>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new Time((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<Time>(0);
    }
  }

  /**
   * API Name: <tt>Global.Toggle</tt>
   * <p/>
   * Note: This class is used as parameter only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Toggle extends AbstractModel {
    public final static String API_TYPE = "Global.Toggle";

    // class members
    public final Boolean       booleanArg;
    public final String        stringArg;

    /**
     * @param booleanArg
     */
    public Toggle(Boolean booleanArg) {
      this.booleanArg = booleanArg;
      this.stringArg = null;
    }

    /**
     * @param stringArg
     *          One of: <tt>toggle</tt>. See constants at {@link GlobalModel.Toggle.StringArg}.
     */
    public Toggle(String stringArg) {
      this.stringArg = stringArg;
      this.booleanArg = null;
    }

    @Override
    public JsonNode toJsonNode() {
      if (booleanArg != null) {
        return booleanArg ? BooleanNode.TRUE : BooleanNode.FALSE;
      }
      if (stringArg != null) {
        return new TextNode(stringArg); // 3num
      }
      return null; // this is completely excluded. theoretically.
    }

    /**
     * API Name: <tt>stringArg</tt>
     */
    public interface StringArg {

      public final String             TOGGLE = "toggle";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(TOGGLE));
    }
  }

  /**
   * API Name: <tt>Global.IncrementDecrement</tt>
   */
  public interface IncrementDecrement {

    public final String             INCREMENT = "increment";
    public final String             DECREMENT = "decrement";

    public final static Set<String> values    = new HashSet<String>(Arrays.asList(INCREMENT, DECREMENT));
  }

  /**
   * API Name: <tt>Global.Weekday</tt>
   */
  public interface Weekday {

    public final String             MONDAY    = "monday";
    public final String             TUESDAY   = "tuesday";
    public final String             WEDNESDAY = "wednesday";
    public final String             THURSDAY  = "thursday";
    public final String             FRIDAY    = "friday";
    public final String             SATURDAY  = "saturday";
    public final String             SUNDAY    = "sunday";

    public final static Set<String> values    = new HashSet<String>(Arrays.asList(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY));
  }
}
