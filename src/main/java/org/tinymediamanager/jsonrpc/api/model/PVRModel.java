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
package org.tinymediamanager.jsonrpc.api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.IntNode;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.TextNode;
import org.tinymediamanager.jsonrpc.api.AbstractModel;

public final class PVRModel {

  /**
   * API Name: <tt>PVR.ChannelGroup.Id</tt>
   * <p/>
   * Note: This class is used as parameter only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ChannelGroupId extends AbstractModel {
    public final static String API_TYPE = "PVR.ChannelGroup.Id";

    // class members
    public final Integer       id;
    public final String        stringArg;

    /**
     * @param id
     */
    public ChannelGroupId(Integer id) {
      this.id = id;
      this.stringArg = null;
    }

    /**
     * @param stringArg
     *          One of: <tt>alltv</tt>, <tt>allradio</tt>. See constants at {@link PVRModel.ChannelGroupId.StringArg}.
     */
    public ChannelGroupId(String stringArg) {
      this.stringArg = stringArg;
      this.id = null;
    }

    @Override
    public JsonNode toJsonNode() {
      if (id != null) {
        return new IntNode(id);
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

      public final String             ALLTV    = "alltv";
      public final String             ALLRADIO = "allradio";

      public final static Set<String> values   = new HashSet<String>(Arrays.asList(ALLTV, ALLRADIO));
    }
  }

  /**
   * API Name: <tt>PVR.Details.Broadcast</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class BroadcastDetail extends ItemModel.BaseDetail {
    public final static String API_TYPE           = "PVR.Details.Broadcast";

    // field names
    public static final String BROADCASTID        = "broadcastid";
    public static final String ENDTIME            = "endtime";
    public static final String EPISODENAME        = "episodename";
    public static final String EPISODENUM         = "episodenum";
    public static final String EPISODEPART        = "episodepart";
    public static final String FIRSTAIRED         = "firstaired";
    public static final String GENRE              = "genre";
    public static final String HASTIMER           = "hastimer";
    public static final String ISACTIVE           = "isactive";
    public static final String PARENTALRATING     = "parentalrating";
    public static final String PLOT               = "plot";
    public static final String PLOTOUTLINE        = "plotoutline";
    public static final String PROGRESS           = "progress";
    public static final String PROGRESSPERCENTAGE = "progresspercentage";
    public static final String RATING             = "rating";
    public static final String RUNTIME            = "runtime";
    public static final String STARTTIME          = "starttime";
    public static final String THUMBNAIL          = "thumbnail";
    public static final String TITLE              = "title";
    public static final String WASACTIVE          = "wasactive";

    // class members
    public final Integer       broadcastid;
    public final String        endtime;
    public final String        episodename;
    public final Integer       episodenum;
    public final Integer       episodepart;
    public final String        firstaired;
    public final String        genre;
    public final Boolean       hastimer;
    public final Boolean       isactive;
    public final Integer       parentalrating;
    public final String        plot;
    public final String        plotoutline;
    public final Integer       progress;
    public final Double        progresspercentage;
    public final Integer       rating;
    public final Integer       runtime;
    public final String        starttime;
    public final String        thumbnail;
    public final String        title;
    public final Boolean       wasactive;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a BroadcastDetail object
     */
    public BroadcastDetail(JsonNode node) {
      super(node);
      broadcastid = parseInt(node, BROADCASTID);
      endtime = parseString(node, ENDTIME);
      episodename = parseString(node, EPISODENAME);
      episodenum = parseInt(node, EPISODENUM);
      episodepart = parseInt(node, EPISODEPART);
      firstaired = parseString(node, FIRSTAIRED);
      genre = parseString(node, GENRE);
      hastimer = parseBoolean(node, HASTIMER);
      isactive = parseBoolean(node, ISACTIVE);
      parentalrating = parseInt(node, PARENTALRATING);
      plot = parseString(node, PLOT);
      plotoutline = parseString(node, PLOTOUTLINE);
      progress = parseInt(node, PROGRESS);
      progresspercentage = parseDouble(node, PROGRESSPERCENTAGE);
      rating = parseInt(node, RATING);
      runtime = parseInt(node, RUNTIME);
      starttime = parseString(node, STARTTIME);
      thumbnail = parseString(node, THUMBNAIL);
      title = parseString(node, TITLE);
      wasactive = parseBoolean(node, WASACTIVE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(BROADCASTID, broadcastid);
      node.put(ENDTIME, endtime);
      node.put(EPISODENAME, episodename);
      node.put(EPISODENUM, episodenum);
      node.put(EPISODEPART, episodepart);
      node.put(FIRSTAIRED, firstaired);
      node.put(GENRE, genre);
      node.put(HASTIMER, hastimer);
      node.put(ISACTIVE, isactive);
      node.put(PARENTALRATING, parentalrating);
      node.put(PLOT, plot);
      node.put(PLOTOUTLINE, plotoutline);
      node.put(PROGRESS, progress);
      node.put(PROGRESSPERCENTAGE, progresspercentage);
      node.put(RATING, rating);
      node.put(RUNTIME, runtime);
      node.put(STARTTIME, starttime);
      node.put(THUMBNAIL, thumbnail);
      node.put(TITLE, title);
      node.put(WASACTIVE, wasactive);
      return node;
    }

    /**
     * Extracts a list of {@link BroadcastDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<BroadcastDetail> getPVRModelBroadcastDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<BroadcastDetail> l = new ArrayList<BroadcastDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new BroadcastDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<BroadcastDetail>(0);
    }
  }

  /**
   * API Name: <tt>PVR.Details.Channel</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ChannelDetail extends ItemModel.BaseDetail {
    public final static String   API_TYPE      = "PVR.Details.Channel";

    // field names
    public static final String   BROADCASTNEXT = "broadcastnext";
    public static final String   BROADCASTNOW  = "broadcastnow";
    public static final String   CHANNEL       = "channel";
    public static final String   CHANNELID     = "channelid";
    public static final String   CHANNELTYPE   = "channeltype";
    public static final String   HIDDEN        = "hidden";
    public static final String   LASTPLAYED    = "lastplayed";
    public static final String   LOCKED        = "locked";
    public static final String   THUMBNAIL     = "thumbnail";

    // class members
    public final BroadcastDetail broadcastnext;
    public final BroadcastDetail broadcastnow;
    public final String          channel;
    public final Integer         channelid;
    public final String          channeltype;
    public final Boolean         hidden;
    public final String          lastplayed;
    public final Boolean         locked;
    public final String          thumbnail;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ChannelDetail object
     */
    public ChannelDetail(JsonNode node) {
      super(node);
      broadcastnext = node.has(BROADCASTNEXT) ? new BroadcastDetail(node.get(BROADCASTNEXT)) : null;
      broadcastnow = node.has(BROADCASTNOW) ? new BroadcastDetail(node.get(BROADCASTNOW)) : null;
      channel = parseString(node, CHANNEL);
      channelid = parseInt(node, CHANNELID);
      channeltype = parseString(node, CHANNELTYPE);
      hidden = parseBoolean(node, HIDDEN);
      lastplayed = parseString(node, LASTPLAYED);
      locked = parseBoolean(node, LOCKED);
      thumbnail = parseString(node, THUMBNAIL);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(BROADCASTNEXT, broadcastnext == null ? null : broadcastnext.toJsonNode());
      node.put(BROADCASTNOW, broadcastnow == null ? null : broadcastnow.toJsonNode());
      node.put(CHANNEL, channel);
      node.put(CHANNELID, channelid);
      node.put(CHANNELTYPE, channeltype); // enum
      node.put(HIDDEN, hidden);
      node.put(LASTPLAYED, lastplayed);
      node.put(LOCKED, locked);
      node.put(THUMBNAIL, thumbnail);
      return node;
    }

    /**
     * Extracts a list of {@link ChannelDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ChannelDetail> getPVRModelChannelDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ChannelDetail> l = new ArrayList<ChannelDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ChannelDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ChannelDetail>(0);
    }

    /**
     * API Name: <tt>channeltype</tt>
     */
    public interface Channeltype {

      public final String             TV     = "tv";
      public final String             RADIO  = "radio";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(TV, RADIO));
    }
  }

  /**
   * API Name: <tt>PVR.Details.ChannelGroup</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ChannelGroupDetail extends ItemModel.BaseDetail {
    public final static String API_TYPE       = "PVR.Details.ChannelGroup";

    // field names
    public static final String CHANNELGROUPID = "channelgroupid";
    public static final String CHANNELTYPE    = "channeltype";

    // class members
    public final Integer       channelgroupid;
    public final String        channeltype;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ChannelGroupDetail object
     */
    public ChannelGroupDetail(JsonNode node) {
      super(node);
      channelgroupid = parseInt(node, CHANNELGROUPID);
      channeltype = parseString(node, CHANNELTYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(CHANNELGROUPID, channelgroupid);
      node.put(CHANNELTYPE, channeltype); // enum
      return node;
    }

    /**
     * Extracts a list of {@link ChannelGroupDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ChannelGroupDetail> getPVRModelChannelGroupDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ChannelGroupDetail> l = new ArrayList<ChannelGroupDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ChannelGroupDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ChannelGroupDetail>(0);
    }

    /**
     * API Name: <tt>channeltype</tt>
     */
    public interface Channeltype {

      public final String             TV     = "tv";
      public final String             RADIO  = "radio";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(TV, RADIO));
    }
  }

  /**
   * API Name: <tt>PVR.Details.ChannelGroup.Extended</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ChannelGroupExtendedDetail extends ChannelGroupDetail {
    public final static String            API_TYPE = "PVR.Details.ChannelGroup.Extended";

    // field names
    public static final String            CHANNELS = "channels";
    public static final String            LIMITS   = "limits";

    // class members
    public final List<ChannelDetail>      channels;
    public final ListModel.LimitsReturned limits;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ChannelGroupExtendedDetail object
     */
    public ChannelGroupExtendedDetail(JsonNode node) {
      super(node);
      channels = ChannelDetail.getPVRModelChannelDetailList(node, CHANNELS);
      limits = node.has(LIMITS) ? new ListModel.LimitsReturned(node.get(LIMITS)) : null;
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode channelsArray = OM.createArrayNode();
      for (ChannelDetail item : channels) {
        channelsArray.add(item.toJsonNode());
      }
      node.put(CHANNELS, channelsArray);
      node.put(LIMITS, limits == null ? null : limits.toJsonNode());
      return node;
    }

    /**
     * Extracts a list of {@link ChannelGroupExtendedDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ChannelGroupExtendedDetail> getPVRModelChannelGroupExtendedDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ChannelGroupExtendedDetail> l = new ArrayList<ChannelGroupExtendedDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ChannelGroupExtendedDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ChannelGroupExtendedDetail>(0);
    }
  }

  /**
   * API Name: <tt>PVR.Details.Recording</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RecordingDetail extends ItemModel.BaseDetail {
    public final static String      API_TYPE    = "PVR.Details.Recording";

    // field names
    public static final String      ART         = "art";
    public static final String      CHANNEL     = "channel";
    public static final String      DIRECTORY   = "directory";
    public static final String      ENDTIME     = "endtime";
    public static final String      FILE        = "file";
    public static final String      GENRE       = "genre";
    public static final String      ICON        = "icon";
    public static final String      LIFETIME    = "lifetime";
    public static final String      PLAYCOUNT   = "playcount";
    public static final String      PLOT        = "plot";
    public static final String      PLOTOUTLINE = "plotoutline";
    public static final String      RECORDINGID = "recordingid";
    public static final String      RESUME      = "resume";
    public static final String      RUNTIME     = "runtime";
    public static final String      STARTTIME   = "starttime";
    public static final String      STREAMURL   = "streamurl";
    public static final String      TITLE       = "title";

    // class members
    public final MediaModel.Artwork art;
    public final String             channel;
    public final String             directory;
    public final String             endtime;
    public final String             file;
    public final String             genre;
    public final String             icon;
    public final Integer            lifetime;
    public final Integer            playcount;
    public final String             plot;
    public final String             plotoutline;
    public final Integer            recordingid;
    public final VideoModel.Resume  resume;
    public final Integer            runtime;
    public final String             starttime;
    public final String             streamurl;
    public final String             title;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a RecordingDetail object
     */
    public RecordingDetail(JsonNode node) {
      super(node);
      art = node.has(ART) ? new MediaModel.Artwork(node.get(ART)) : null;
      channel = parseString(node, CHANNEL);
      directory = parseString(node, DIRECTORY);
      endtime = parseString(node, ENDTIME);
      file = parseString(node, FILE);
      genre = parseString(node, GENRE);
      icon = parseString(node, ICON);
      lifetime = parseInt(node, LIFETIME);
      playcount = parseInt(node, PLAYCOUNT);
      plot = parseString(node, PLOT);
      plotoutline = parseString(node, PLOTOUTLINE);
      recordingid = parseInt(node, RECORDINGID);
      resume = node.has(RESUME) ? new VideoModel.Resume(node.get(RESUME)) : null;
      runtime = parseInt(node, RUNTIME);
      starttime = parseString(node, STARTTIME);
      streamurl = parseString(node, STREAMURL);
      title = parseString(node, TITLE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(ART, art == null ? null : art.toJsonNode());
      node.put(CHANNEL, channel);
      node.put(DIRECTORY, directory);
      node.put(ENDTIME, endtime);
      node.put(FILE, file);
      node.put(GENRE, genre);
      node.put(ICON, icon);
      node.put(LIFETIME, lifetime);
      node.put(PLAYCOUNT, playcount);
      node.put(PLOT, plot);
      node.put(PLOTOUTLINE, plotoutline);
      node.put(RECORDINGID, recordingid);
      node.put(RESUME, resume == null ? null : resume.toJsonNode());
      node.put(RUNTIME, runtime);
      node.put(STARTTIME, starttime);
      node.put(STREAMURL, streamurl);
      node.put(TITLE, title);
      return node;
    }

    /**
     * Extracts a list of {@link RecordingDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<RecordingDetail> getPVRModelRecordingDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<RecordingDetail> l = new ArrayList<RecordingDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new RecordingDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<RecordingDetail>(0);
    }
  }

  /**
   * API Name: <tt>PVR.Details.Timer</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class TimerDetail extends ItemModel.BaseDetail {
    public final static String API_TYPE    = "PVR.Details.Timer";

    // field names
    public static final String CHANNELID   = "channelid";
    public static final String DIRECTORY   = "directory";
    public static final String ENDMARGIN   = "endmargin";
    public static final String ENDTIME     = "endtime";
    public static final String FILE        = "file";
    public static final String FIRSTDAY    = "firstday";
    public static final String ISRADIO     = "isradio";
    public static final String LIFETIME    = "lifetime";
    public static final String PRIORITY    = "priority";
    public static final String REPEATING   = "repeating";
    public static final String RUNTIME     = "runtime";
    public static final String STARTMARGIN = "startmargin";
    public static final String STARTTIME   = "starttime";
    public static final String STATE       = "state";
    public static final String SUMMARY     = "summary";
    public static final String TIMERID     = "timerid";
    public static final String TITLE       = "title";
    public static final String WEEKDAYS    = "weekdays";

    // class members
    public final Integer       channelid;
    public final String        directory;
    public final Integer       endmargin;
    public final String        endtime;
    public final String        file;
    public final String        firstday;
    public final Boolean       isradio;
    public final Integer       lifetime;
    public final Integer       priority;
    public final Boolean       repeating;
    public final Integer       runtime;
    public final Integer       startmargin;
    public final String        starttime;
    public final String        state;
    public final String        summary;
    public final Integer       timerid;
    public final String        title;
    public final String        weekdays;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a TimerDetail object
     */
    public TimerDetail(JsonNode node) {
      super(node);
      channelid = parseInt(node, CHANNELID);
      directory = parseString(node, DIRECTORY);
      endmargin = parseInt(node, ENDMARGIN);
      endtime = parseString(node, ENDTIME);
      file = parseString(node, FILE);
      firstday = parseString(node, FIRSTDAY);
      isradio = parseBoolean(node, ISRADIO);
      lifetime = parseInt(node, LIFETIME);
      priority = parseInt(node, PRIORITY);
      repeating = parseBoolean(node, REPEATING);
      runtime = parseInt(node, RUNTIME);
      startmargin = parseInt(node, STARTMARGIN);
      starttime = parseString(node, STARTTIME);
      state = parseString(node, STATE);
      summary = parseString(node, SUMMARY);
      timerid = parseInt(node, TIMERID);
      title = parseString(node, TITLE);
      weekdays = parseString(node, WEEKDAYS);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(CHANNELID, channelid);
      node.put(DIRECTORY, directory);
      node.put(ENDMARGIN, endmargin);
      node.put(ENDTIME, endtime);
      node.put(FILE, file);
      node.put(FIRSTDAY, firstday);
      node.put(ISRADIO, isradio);
      node.put(LIFETIME, lifetime);
      node.put(PRIORITY, priority);
      node.put(REPEATING, repeating);
      node.put(RUNTIME, runtime);
      node.put(STARTMARGIN, startmargin);
      node.put(STARTTIME, starttime);
      node.put(STATE, state); // enum
      node.put(SUMMARY, summary);
      node.put(TIMERID, timerid);
      node.put(TITLE, title);
      node.put(WEEKDAYS, weekdays); // enum
      return node;
    }

    /**
     * Extracts a list of {@link TimerDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<TimerDetail> getPVRModelTimerDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<TimerDetail> l = new ArrayList<TimerDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new TimerDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<TimerDetail>(0);
    }

    /**
     * API Name: <tt>state</tt>
     */
    public interface State {

      public final String             UNKNOWN        = "unknown";
      public final String             NEW            = "new";
      public final String             SCHEDULED      = "scheduled";
      public final String             RECORDING      = "recording";
      public final String             COMPLETED      = "completed";
      public final String             ABORTED        = "aborted";
      public final String             CANCELLED      = "cancelled";
      public final String             CONFLICT_OK    = "conflict_ok";
      public final String             CONFLICT_NOTOK = "conflict_notok";
      public final String             ERROR          = "error";

      public final static Set<String> values         = new HashSet<String>(
          Arrays.asList(UNKNOWN, NEW, SCHEDULED, RECORDING, COMPLETED, ABORTED, CANCELLED, CONFLICT_OK, CONFLICT_NOTOK, ERROR));
    }

    /**
     * API Name: <tt>weekdays</tt>
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

  /**
   * API Name: <tt>PVR.Property.Value</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class PropertyValue extends AbstractModel {
    public final static String API_TYPE  = "PVR.Property.Value";

    // field names
    public static final String AVAILABLE = "available";
    public static final String RECORDING = "recording";
    public static final String SCANNING  = "scanning";

    // class members
    public final Boolean       available;
    public final Boolean       recording;
    public final Boolean       scanning;

    /**
     * @param available
     * @param recording
     * @param scanning
     */
    public PropertyValue(Boolean available, Boolean recording, Boolean scanning) {
      this.available = available;
      this.recording = recording;
      this.scanning = scanning;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a PropertyValue object
     */
    public PropertyValue(JsonNode node) {
      available = parseBoolean(node, AVAILABLE);
      recording = parseBoolean(node, RECORDING);
      scanning = parseBoolean(node, SCANNING);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(AVAILABLE, available);
      node.put(RECORDING, recording);
      node.put(SCANNING, scanning);
      return node;
    }

    /**
     * Extracts a list of {@link PropertyValue} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<PropertyValue> getPVRModelPropertyValueList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<PropertyValue> l = new ArrayList<PropertyValue>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new PropertyValue((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<PropertyValue>(0);
    }

  }

  /**
   * API Name: <tt>PVR.Channel.Type</tt>
   */
  public interface ChannelType {

    public final String             TV     = "tv";
    public final String             RADIO  = "radio";

    public final static Set<String> values = new HashSet<String>(Arrays.asList(TV, RADIO));
  }

  /**
   * API Name: <tt>PVR.Fields.Broadcast</tt>
   */
  public interface BroadcastFields {

    public final String             TITLE              = "title";
    public final String             PLOT               = "plot";
    public final String             PLOTOUTLINE        = "plotoutline";
    public final String             STARTTIME          = "starttime";
    public final String             ENDTIME            = "endtime";
    public final String             RUNTIME            = "runtime";
    public final String             PROGRESS           = "progress";
    public final String             PROGRESSPERCENTAGE = "progresspercentage";
    public final String             GENRE              = "genre";
    public final String             EPISODENAME        = "episodename";
    public final String             EPISODENUM         = "episodenum";
    public final String             EPISODEPART        = "episodepart";
    public final String             FIRSTAIRED         = "firstaired";
    public final String             HASTIMER           = "hastimer";
    public final String             ISACTIVE           = "isactive";
    public final String             PARENTALRATING     = "parentalrating";
    public final String             WASACTIVE          = "wasactive";
    public final String             THUMBNAIL          = "thumbnail";
    public final String             RATING             = "rating";

    public final static Set<String> values             = new HashSet<String>(
        Arrays.asList(TITLE, PLOT, PLOTOUTLINE, STARTTIME, ENDTIME, RUNTIME, PROGRESS, PROGRESSPERCENTAGE, GENRE, EPISODENAME, EPISODENUM,
            EPISODEPART, FIRSTAIRED, HASTIMER, ISACTIVE, PARENTALRATING, WASACTIVE, THUMBNAIL, RATING));
  }

  /**
   * API Name: <tt>PVR.Fields.Channel</tt>
   */
  public interface ChannelFields {

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

  /**
   * API Name: <tt>PVR.Fields.Recording</tt>
   */
  public interface RecordingFields {

    public final String             TITLE       = "title";
    public final String             PLOT        = "plot";
    public final String             PLOTOUTLINE = "plotoutline";
    public final String             GENRE       = "genre";
    public final String             PLAYCOUNT   = "playcount";
    public final String             RESUME      = "resume";
    public final String             CHANNEL     = "channel";
    public final String             STARTTIME   = "starttime";
    public final String             ENDTIME     = "endtime";
    public final String             RUNTIME     = "runtime";
    public final String             LIFETIME    = "lifetime";
    public final String             ICON        = "icon";
    public final String             ART         = "art";
    public final String             STREAMURL   = "streamurl";
    public final String             FILE        = "file";
    public final String             DIRECTORY   = "directory";

    public final static Set<String> values      = new HashSet<String>(Arrays.asList(TITLE, PLOT, PLOTOUTLINE, GENRE, PLAYCOUNT, RESUME, CHANNEL,
        STARTTIME, ENDTIME, RUNTIME, LIFETIME, ICON, ART, STREAMURL, FILE, DIRECTORY));
  }

  /**
   * API Name: <tt>PVR.Fields.Timer</tt>
   */
  public interface TimerFields {

    public final String             TITLE       = "title";
    public final String             SUMMARY     = "summary";
    public final String             CHANNELID   = "channelid";
    public final String             ISRADIO     = "isradio";
    public final String             REPEATING   = "repeating";
    public final String             STARTTIME   = "starttime";
    public final String             ENDTIME     = "endtime";
    public final String             RUNTIME     = "runtime";
    public final String             LIFETIME    = "lifetime";
    public final String             FIRSTDAY    = "firstday";
    public final String             WEEKDAYS    = "weekdays";
    public final String             PRIORITY    = "priority";
    public final String             STARTMARGIN = "startmargin";
    public final String             ENDMARGIN   = "endmargin";
    public final String             STATE       = "state";
    public final String             FILE        = "file";
    public final String             DIRECTORY   = "directory";

    public final static Set<String> values      = new HashSet<String>(Arrays.asList(TITLE, SUMMARY, CHANNELID, ISRADIO, REPEATING, STARTTIME, ENDTIME,
        RUNTIME, LIFETIME, FIRSTDAY, WEEKDAYS, PRIORITY, STARTMARGIN, ENDMARGIN, STATE, FILE, DIRECTORY));
  }

  /**
   * API Name: <tt>PVR.Property.Name</tt>
   */
  public interface PropertyName {

    public final String             AVAILABLE = "available";
    public final String             RECORDING = "recording";
    public final String             SCANNING  = "scanning";

    public final static Set<String> values    = new HashSet<String>(Arrays.asList(AVAILABLE, RECORDING, SCANNING));
  }

  /**
   * API Name: <tt>PVR.TimerState</tt>
   */
  public interface TimerState {

    public final String             UNKNOWN        = "unknown";
    public final String             NEW            = "new";
    public final String             SCHEDULED      = "scheduled";
    public final String             RECORDING      = "recording";
    public final String             COMPLETED      = "completed";
    public final String             ABORTED        = "aborted";
    public final String             CANCELLED      = "cancelled";
    public final String             CONFLICT_OK    = "conflict_ok";
    public final String             CONFLICT_NOTOK = "conflict_notok";
    public final String             ERROR          = "error";

    public final static Set<String> values         = new HashSet<String>(
        Arrays.asList(UNKNOWN, NEW, SCHEDULED, RECORDING, COMPLETED, ABORTED, CANCELLED, CONFLICT_OK, CONFLICT_NOTOK, ERROR));
  }
}
