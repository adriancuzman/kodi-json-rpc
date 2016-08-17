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
package org.tinymediamanager.jsonrpc.api.call;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.tinymediamanager.jsonrpc.api.AbstractCall;
import org.tinymediamanager.jsonrpc.api.AbstractModel;
import org.tinymediamanager.jsonrpc.api.model.GlobalModel;
import org.tinymediamanager.jsonrpc.api.model.ListModel;
import org.tinymediamanager.jsonrpc.api.model.PVRModel;

public final class PVR {

  /**
   * Retrieves the details of a specific broadcast.
   * <p/>
   * This class represents the API method <tt>PVR.GetBroadcastDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetBroadcastDetails extends AbstractCall<PVRModel.BroadcastDetail> {
    public final static String API_TYPE = "PVR.GetBroadcastDetails";
    public final static String RESULT   = "broadcastdetails";

    /**
     * Retrieves the details of a specific broadcast.
     * 
     * @param broadcastid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>starttime</tt>, <tt>endtime</tt>, <tt>runtime</tt>,
     *          <tt>progress</tt>, <tt>progresspercentage</tt>, <tt>genre</tt>, <tt>episodename</tt>, <tt>episodenum</tt>, <tt>episodepart</tt>,
     *          <tt>firstaired</tt>, <tt>hastimer</tt>, <tt>isactive</tt>, <tt>parentalrating</tt>, <tt>wasactive</tt>, <tt>thumbnail</tt>,
     *          <tt>rating</tt>. See constants at {@link PVRModel.BroadcastFields}.
     */
    public GetBroadcastDetails(Integer broadcastid, String... properties) {
      super();
      addParameter("broadcastid", broadcastid);
      addParameter("properties", properties);
    }

    @Override
    protected PVRModel.BroadcastDetail parseOne(JsonNode node) {
      return new PVRModel.BroadcastDetail((ObjectNode) node.get(RESULT));
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
   * Retrieves the program of a specific channel.
   * <p/>
   * This class represents the API method <tt>PVR.GetBroadcasts</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetBroadcasts extends AbstractCall<PVRModel.BroadcastDetail> {
    public final static String API_TYPE = "PVR.GetBroadcasts";
    public final static String RESULT   = "broadcasts";

    /**
     * Retrieves the program of a specific channel.
     * 
     * @param channelid
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>starttime</tt>, <tt>endtime</tt>, <tt>runtime</tt>,
     *          <tt>progress</tt>, <tt>progresspercentage</tt>, <tt>genre</tt>, <tt>episodename</tt>, <tt>episodenum</tt>, <tt>episodepart</tt>,
     *          <tt>firstaired</tt>, <tt>hastimer</tt>, <tt>isactive</tt>, <tt>parentalrating</tt>, <tt>wasactive</tt>, <tt>thumbnail</tt>,
     *          <tt>rating</tt>. See constants at {@link PVRModel.BroadcastFields}.
     */
    public GetBroadcasts(Integer channelid, ListModel.Limits limits, String... properties) {
      super();
      addParameter("channelid", channelid);
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieves the program of a specific channel.
     * 
     * @param channelid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>starttime</tt>, <tt>endtime</tt>, <tt>runtime</tt>,
     *          <tt>progress</tt>, <tt>progresspercentage</tt>, <tt>genre</tt>, <tt>episodename</tt>, <tt>episodenum</tt>, <tt>episodepart</tt>,
     *          <tt>firstaired</tt>, <tt>hastimer</tt>, <tt>isactive</tt>, <tt>parentalrating</tt>, <tt>wasactive</tt>, <tt>thumbnail</tt>,
     *          <tt>rating</tt>. See constants at {@link PVRModel.BroadcastFields}.
     */
    public GetBroadcasts(Integer channelid, String... properties) {
      super();
      addParameter("channelid", channelid);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<PVRModel.BroadcastDetail> parseMany(JsonNode node) {
      final ArrayNode broadcasts = parseResults(node, RESULT);
      if (broadcasts != null) {
        final ArrayList<PVRModel.BroadcastDetail> ret = new ArrayList<PVRModel.BroadcastDetail>(broadcasts.size());
        for (int i = 0; i < broadcasts.size(); i++) {
          final ObjectNode item = (ObjectNode) broadcasts.get(i);
          ret.add(new PVRModel.BroadcastDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<PVRModel.BroadcastDetail>(0);
      }
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return true;
    }
  }

  /**
   * Retrieves the details of a specific channel.
   * <p/>
   * This class represents the API method <tt>PVR.GetChannelDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetChannelDetails extends AbstractCall<PVRModel.ChannelDetail> {
    public final static String API_TYPE = "PVR.GetChannelDetails";
    public final static String RESULT   = "channeldetails";

    /**
     * Retrieves the details of a specific channel.
     * 
     * @param channelid
     * @param properties
     *          One or more of: <tt>thumbnail</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channel</tt>, <tt>lastplayed</tt>,
     *          <tt>broadcastnow</tt>, <tt>broadcastnext</tt>. See constants at {@link PVRModel.ChannelFields}.
     */
    public GetChannelDetails(Integer channelid, String... properties) {
      super();
      addParameter("channelid", channelid);
      addParameter("properties", properties);
    }

    @Override
    protected PVRModel.ChannelDetail parseOne(JsonNode node) {
      return new PVRModel.ChannelDetail((ObjectNode) node.get(RESULT));
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
   * Retrieves the details of a specific channel group.
   * <p/>
   * This class represents the API method <tt>PVR.GetChannelGroupDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetChannelGroupDetails extends AbstractCall<PVRModel.ChannelGroupExtendedDetail> {
    public final static String API_TYPE = "PVR.GetChannelGroupDetails";
    public final static String RESULT   = "channelgroupdetails";

    /**
     * Retrieves the details of a specific channel group.
     * 
     * @param channelgroupid
     * @param channels
     */
    public GetChannelGroupDetails(PVRModel.ChannelGroupId channelgroupid, Channel channels) {
      super();
      addParameter("channelgroupid", channelgroupid);
      addParameter("channels", channels);
    }

    /**
     * Retrieves the details of a specific channel group.
     * 
     * @param channelgroupid
     */
    public GetChannelGroupDetails(PVRModel.ChannelGroupId channelgroupid) {
      super();
      addParameter("channelgroupid", channelgroupid);
    }

    @Override
    protected PVRModel.ChannelGroupExtendedDetail parseOne(JsonNode node) {
      return new PVRModel.ChannelGroupExtendedDetail((ObjectNode) node.get(RESULT));
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return false;
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Channel extends AbstractModel {

      // field names
      public static final String    LIMITS     = "limits";
      public static final String    PROPERTIES = "properties";

      // class members
      public final ListModel.Limits limits;
      public final String           properties;

      /**
       * @param limits
       * @param properties
       *          One or more of: <tt>thumbnail</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channel</tt>, <tt>lastplayed</tt>,
       *          <tt>broadcastnow</tt>, <tt>broadcastnext</tt>. See constants at {@link PVR.Channel.Property}.
       */
      public Channel(ListModel.Limits limits, String properties) {
        this.limits = limits;
        this.properties = properties;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(LIMITS, limits == null ? null : limits.toJsonNode());
        node.put(PROPERTIES, properties); // enum
        return node;
      }

      /**
       * API Name: <tt>properties</tt>
       */
      public interface Property {

        public final String             THUMBNAIL     = "thumbnail";
        public final String             CHANNELTYPE   = "channeltype";
        public final String             HIDDEN        = "hidden";
        public final String             LOCKED        = "locked";
        public final String             CHANNEL       = "channel";
        public final String             LASTPLAYED    = "lastplayed";
        public final String             BROADCASTNOW  = "broadcastnow";
        public final String             BROADCASTNEXT = "broadcastnext";

        public final static Set<String> values        = new HashSet<String>(
            Arrays.asList(THUMBNAIL, CHANNELTYPE, HIDDEN, LOCKED, CHANNEL, LASTPLAYED, BROADCASTNOW, BROADCASTNEXT));
      }
    }
  }

  /**
   * Retrieves the channel groups for the specified type.
   * <p/>
   * This class represents the API method <tt>PVR.GetChannelGroups</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetChannelGroups extends AbstractCall<PVRModel.ChannelGroupDetail> {
    public final static String API_TYPE = "PVR.GetChannelGroups";
    public final static String RESULT   = "channelgroups";

    /**
     * Retrieves the channel groups for the specified type.
     * 
     * @param channeltype
     *          One of: <tt>tv</tt>, <tt>radio</tt>. See constants at {@link PVRModel.ChannelType}.
     * @param limits
     */
    public GetChannelGroups(String channeltype, ListModel.Limits limits) {
      super();
      addParameter("channeltype", channeltype);
      addParameter("limits", limits);
    }

    /**
     * Retrieves the channel groups for the specified type.
     * 
     * @param channeltype
     *          One of: <tt>tv</tt>, <tt>radio</tt>. See constants at {@link PVRModel.ChannelType}.
     */
    public GetChannelGroups(String channeltype) {
      super();
      addParameter("channeltype", channeltype);
    }

    @Override
    protected ArrayList<PVRModel.ChannelGroupDetail> parseMany(JsonNode node) {
      final ArrayNode channelgroups = parseResults(node, RESULT);
      if (channelgroups != null) {
        final ArrayList<PVRModel.ChannelGroupDetail> ret = new ArrayList<PVRModel.ChannelGroupDetail>(channelgroups.size());
        for (int i = 0; i < channelgroups.size(); i++) {
          final ObjectNode item = (ObjectNode) channelgroups.get(i);
          ret.add(new PVRModel.ChannelGroupDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<PVRModel.ChannelGroupDetail>(0);
      }
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return true;
    }
  }

  /**
   * Retrieves the channel list.
   * <p/>
   * This class represents the API method <tt>PVR.GetChannels</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetChannels extends AbstractCall<PVRModel.ChannelDetail> {
    public final static String API_TYPE = "PVR.GetChannels";
    public final static String RESULT   = "channels";

    /**
     * Retrieves the channel list.
     * 
     * @param channelgroupid
     * @param limits
     * @param properties
     *          One or more of: <tt>thumbnail</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channel</tt>, <tt>lastplayed</tt>,
     *          <tt>broadcastnow</tt>, <tt>broadcastnext</tt>. See constants at {@link PVRModel.ChannelFields}.
     */
    public GetChannels(PVRModel.ChannelGroupId channelgroupid, ListModel.Limits limits, String... properties) {
      super();
      addParameter("channelgroupid", channelgroupid);
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieves the channel list.
     * 
     * @param channelgroupid
     * @param properties
     *          One or more of: <tt>thumbnail</tt>, <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channel</tt>, <tt>lastplayed</tt>,
     *          <tt>broadcastnow</tt>, <tt>broadcastnext</tt>. See constants at {@link PVRModel.ChannelFields}.
     */
    public GetChannels(PVRModel.ChannelGroupId channelgroupid, String... properties) {
      super();
      addParameter("channelgroupid", channelgroupid);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<PVRModel.ChannelDetail> parseMany(JsonNode node) {
      final ArrayNode channels = parseResults(node, RESULT);
      if (channels != null) {
        final ArrayList<PVRModel.ChannelDetail> ret = new ArrayList<PVRModel.ChannelDetail>(channels.size());
        for (int i = 0; i < channels.size(); i++) {
          final ObjectNode item = (ObjectNode) channels.get(i);
          ret.add(new PVRModel.ChannelDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<PVRModel.ChannelDetail>(0);
      }
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return true;
    }
  }

  /**
   * Retrieves the values of the given properties.
   * <p/>
   * This class represents the API method <tt>PVR.GetProperties</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetProperties extends AbstractCall<PVRModel.PropertyValue> {
    public final static String API_TYPE = "PVR.GetProperties";

    /**
     * Retrieves the values of the given properties.
     * 
     * @param properties
     *          One or more of: <tt>available</tt>, <tt>recording</tt>, <tt>scanning</tt>. See constants at {@link PVRModel.PropertyName}.
     */
    public GetProperties(String... properties) {
      super();
      addParameter("properties", properties);
    }

    @Override
    protected PVRModel.PropertyValue parseOne(JsonNode node) {
      return new PVRModel.PropertyValue(node);
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
   * Retrieves the details of a specific recording.
   * <p/>
   * This class represents the API method <tt>PVR.GetRecordingDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetRecordingDetails extends AbstractCall<PVRModel.RecordingDetail> {
    public final static String API_TYPE = "PVR.GetRecordingDetails";
    public final static String RESULT   = "recordingdetails";

    /**
     * Retrieves the details of a specific recording.
     * 
     * @param recordingid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>genre</tt>, <tt>playcount</tt>, <tt>resume</tt>,
     *          <tt>channel</tt>, <tt>starttime</tt>, <tt>endtime</tt>, <tt>runtime</tt>, <tt>lifetime</tt>, <tt>icon</tt>, <tt>art</tt>,
     *          <tt>streamurl</tt>, <tt>file</tt>, <tt>directory</tt>. See constants at {@link PVRModel.RecordingFields}.
     */
    public GetRecordingDetails(Integer recordingid, String... properties) {
      super();
      addParameter("recordingid", recordingid);
      addParameter("properties", properties);
    }

    @Override
    protected PVRModel.RecordingDetail parseOne(JsonNode node) {
      return new PVRModel.RecordingDetail((ObjectNode) node.get(RESULT));
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
   * Retrieves the recordings.
   * <p/>
   * This class represents the API method <tt>PVR.GetRecordings</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetRecordings extends AbstractCall<PVRModel.RecordingDetail> {
    public final static String API_TYPE = "PVR.GetRecordings";
    public final static String RESULT   = "recordings";

    /**
     * Retrieves the recordings.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>genre</tt>, <tt>playcount</tt>, <tt>resume</tt>,
     *          <tt>channel</tt>, <tt>starttime</tt>, <tt>endtime</tt>, <tt>runtime</tt>, <tt>lifetime</tt>, <tt>icon</tt>, <tt>art</tt>,
     *          <tt>streamurl</tt>, <tt>file</tt>, <tt>directory</tt>. See constants at {@link PVRModel.RecordingFields}.
     */
    public GetRecordings(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<PVRModel.RecordingDetail> parseMany(JsonNode node) {
      final ArrayNode recordings = parseResults(node, RESULT);
      if (recordings != null) {
        final ArrayList<PVRModel.RecordingDetail> ret = new ArrayList<PVRModel.RecordingDetail>(recordings.size());
        for (int i = 0; i < recordings.size(); i++) {
          final ObjectNode item = (ObjectNode) recordings.get(i);
          ret.add(new PVRModel.RecordingDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<PVRModel.RecordingDetail>(0);
      }
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return true;
    }
  }

  /**
   * Retrieves the details of a specific timer.
   * <p/>
   * This class represents the API method <tt>PVR.GetTimerDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetTimerDetails extends AbstractCall<PVRModel.TimerDetail> {
    public final static String API_TYPE = "PVR.GetTimerDetails";
    public final static String RESULT   = "timerdetails";

    /**
     * Retrieves the details of a specific timer.
     * 
     * @param timerid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>summary</tt>, <tt>channelid</tt>, <tt>isradio</tt>, <tt>repeating</tt>, <tt>starttime</tt>,
     *          <tt>endtime</tt>, <tt>runtime</tt>, <tt>lifetime</tt>, <tt>firstday</tt>, <tt>weekdays</tt>, <tt>priority</tt>, <tt>startmargin</tt>,
     *          <tt>endmargin</tt>, <tt>state</tt>, <tt>file</tt>, <tt>directory</tt>. See constants at {@link PVRModel.TimerFields}.
     */
    public GetTimerDetails(Integer timerid, String... properties) {
      super();
      addParameter("timerid", timerid);
      addParameter("properties", properties);
    }

    @Override
    protected PVRModel.TimerDetail parseOne(JsonNode node) {
      return new PVRModel.TimerDetail((ObjectNode) node.get(RESULT));
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
   * Retrieves the timers.
   * <p/>
   * This class represents the API method <tt>PVR.GetTimers</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetTimers extends AbstractCall<PVRModel.TimerDetail> {
    public final static String API_TYPE = "PVR.GetTimers";
    public final static String RESULT   = "timers";

    /**
     * Retrieves the timers.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>summary</tt>, <tt>channelid</tt>, <tt>isradio</tt>, <tt>repeating</tt>, <tt>starttime</tt>,
     *          <tt>endtime</tt>, <tt>runtime</tt>, <tt>lifetime</tt>, <tt>firstday</tt>, <tt>weekdays</tt>, <tt>priority</tt>, <tt>startmargin</tt>,
     *          <tt>endmargin</tt>, <tt>state</tt>, <tt>file</tt>, <tt>directory</tt>. See constants at {@link PVRModel.TimerFields}.
     */
    public GetTimers(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<PVRModel.TimerDetail> parseMany(JsonNode node) {
      final ArrayNode timers = parseResults(node, RESULT);
      if (timers != null) {
        final ArrayList<PVRModel.TimerDetail> ret = new ArrayList<PVRModel.TimerDetail>(timers.size());
        for (int i = 0; i < timers.size(); i++) {
          final ObjectNode item = (ObjectNode) timers.get(i);
          ret.add(new PVRModel.TimerDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<PVRModel.TimerDetail>(0);
      }
    }

    @Override
    public String getName() {
      return API_TYPE;
    }

    @Override
    protected boolean returnsList() {
      return true;
    }
  }

  /**
   * Toggle recording of a channel.
   * <p/>
   * This class represents the API method <tt>PVR.Record</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Record extends AbstractCall<String> {
    public final static String API_TYPE = "PVR.Record";

    /**
     * Toggle recording of a channel.
     * 
     * @param record
     * @param channel
     *          One of: <tt>current</tt>. See constants at {@link PVR.Record.Channel}.
     */
    public Record(GlobalModel.Toggle record, String channel) {
      super();
      addParameter("record", record);
      addParameter("channel", channel);
    }

    /**
     * Toggle recording of a channel.
     * 
     * @param record
     * @param channel
     */
    public Record(GlobalModel.Toggle record, Integer channel) {
      super();
      addParameter("record", record);
      addParameter("channel", channel);
    }

    /**
     * Toggle recording of a channel.
     */
    public Record() {
      super();
    }

    /**
     * Toggle recording of a channel.
     * 
     * @param record
     */
    public Record(GlobalModel.Toggle record) {
      super();
      addParameter("record", record);
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

    /**
     * API Name: <tt>channel</tt>
     */
    public interface Channel {

      public final String             CURRENT = "current";

      public final static Set<String> values  = new HashSet<String>(Arrays.asList(CURRENT));
    }
  }

  /**
   * Starts a channel scan.
   * <p/>
   * This class represents the API method <tt>PVR.Scan</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Scan extends AbstractCall<String> {
    public final static String API_TYPE = "PVR.Scan";

    /**
     * Starts a channel scan.
     */
    public Scan() {
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
