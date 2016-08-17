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
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.BooleanNode;
import org.codehaus.jackson.node.DoubleNode;
import org.codehaus.jackson.node.IntNode;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.TextNode;
import org.tinymediamanager.jsonrpc.api.AbstractCall;
import org.tinymediamanager.jsonrpc.api.AbstractModel;
import org.tinymediamanager.jsonrpc.api.model.GlobalModel;
import org.tinymediamanager.jsonrpc.api.model.ListModel;
import org.tinymediamanager.jsonrpc.api.model.PlayerModel;
import org.tinymediamanager.jsonrpc.api.model.PlaylistModel;

public final class Player {

  /**
   * Returns all active players.
   * <p/>
   * This class represents the API method <tt>Player.GetActivePlayers</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetActivePlayers extends AbstractCall<GetActivePlayers.GetActivePlayersResult> {
    public final static String API_TYPE = "Player.GetActivePlayers";

    /**
     * Returns all active players.
     */
    public GetActivePlayers() {
      super();
    }

    @Override
    protected ArrayList<GetActivePlayersResult> parseMany(JsonNode node) {
      final ArrayNode results = (ArrayNode) node;
      if (results != null) {
        final ArrayList<GetActivePlayersResult> ret = new ArrayList<GetActivePlayersResult>(results.size());
        for (int i = 0; i < results.size(); i++) {
          final ObjectNode item = (ObjectNode) results.get(i);
          ret.add(new GetActivePlayersResult(item));
        }
        return ret;
      }
      else {
        return new ArrayList<GetActivePlayersResult>(0);
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

    /**
     * Note: This class is used as result only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class GetActivePlayersResult extends AbstractModel {

      // field names
      public static final String PLAYERID = "playerid";
      public static final String TYPE     = "type";

      // class members
      public final Integer       playerid;
      public final String        type;

      /**
       * @param playerid
       * @param type
       *          One of: <tt>video</tt>, <tt>audio</tt>, <tt>picture</tt>. See constants at {@link Player.GetActivePlayersResult.Type}.
       */
      public GetActivePlayersResult(Integer playerid, String type) {
        this.playerid = playerid;
        this.type = type;
      }

      /**
       * Construct from JSON object.
       * 
       * @param node
       *          JSON object representing a GetActivePlayersResult object
       */
      public GetActivePlayersResult(JsonNode node) {
        playerid = parseInt(node, PLAYERID);
        type = parseString(node, TYPE);
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(PLAYERID, playerid);
        node.put(TYPE, type); // enum
        return node;
      }

      /**
       * Extracts a list of {@link GetActivePlayersResult} objects from a JSON array.
       * 
       * @param node
       *          ObjectNode containing the list of objects.
       * @param key
       *          Key pointing to the node where the list is stored.
       */
      static List<GetActivePlayersResult> getPlayerGetActivePlayersResultList(JsonNode node, String key) {
        if (node.has(key)) {
          final ArrayNode a = (ArrayNode) node.get(key);
          final List<GetActivePlayersResult> l = new ArrayList<GetActivePlayersResult>(a.size());
          for (int i = 0; i < a.size(); i++) {
            l.add(new GetActivePlayersResult((JsonNode) a.get(i)));
          }
          return l;
        }
        return new ArrayList<GetActivePlayersResult>(0);
      }

      /**
       * API Name: <tt>type</tt>
       */
      public interface Type {

        public final String             VIDEO   = "video";
        public final String             AUDIO   = "audio";
        public final String             PICTURE = "picture";

        public final static Set<String> values  = new HashSet<String>(Arrays.asList(VIDEO, AUDIO, PICTURE));
      }
    }
  }

  /**
   * Retrieves the currently played item.
   * <p/>
   * This class represents the API method <tt>Player.GetItem</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetItem extends AbstractCall<ListModel.AllItems> {
    public final static String API_TYPE = "Player.GetItem";
    public final static String RESULT   = "item";

    /**
     * Retrieves the currently played item.
     * 
     * @param playerid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>artist</tt>, <tt>albumartist</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>album</tt>,
     *          <tt>track</tt>, <tt>duration</tt>, <tt>comment</tt>, <tt>lyrics</tt>, <tt>musicbrainztrackid</tt>, <tt>musicbrainzartistid</tt>,
     *          <tt>musicbrainzalbumid</tt>, <tt>musicbrainzalbumartistid</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>director</tt>,
     *          <tt>trailer</tt>, <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>writer</tt>,
     *          <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>productioncode</tt>,
     *          <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>firstaired</tt>,
     *          <tt>season</tt>, <tt>episode</tt>, <tt>showtitle</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>artistid</tt>,
     *          <tt>albumid</tt>, <tt>tvshowid</tt>, <tt>setid</tt>, <tt>watchedepisodes</tt>, <tt>disc</tt>, <tt>tag</tt>, <tt>art</tt>,
     *          <tt>genreid</tt>, <tt>displayartist</tt>, <tt>albumartistid</tt>, <tt>description</tt>, <tt>theme</tt>, <tt>mood</tt>, <tt>style</tt>,
     *          <tt>albumlabel</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>uniqueid</tt>, <tt>dateadded</tt>, <tt>channel</tt>,
     *          <tt>channeltype</tt>, <tt>hidden</tt>, <tt>locked</tt>, <tt>channelnumber</tt>, <tt>starttime</tt>, <tt>endtime</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>compilation</tt>, <tt>releasetype</tt>, <tt>albumreleasetype</tt>. See
     *          constants at {@link ListModel.AllFields}.
     */
    public GetItem(Integer playerid, String... properties) {
      super();
      addParameter("playerid", playerid);
      addParameter("properties", properties);
    }

    @Override
    protected ListModel.AllItems parseOne(JsonNode node) {
      return new ListModel.AllItems((ObjectNode) node.get(RESULT));
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
   * Get a list of available players.
   * <p/>
   * This class represents the API method <tt>Player.GetPlayers</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetPlayers extends AbstractCall<GetPlayers.GetPlayersResult> {
    public final static String API_TYPE = "Player.GetPlayers";

    /**
     * Get a list of available players.
     * 
     * @param media
     *          One of: <tt>all</tt>, <tt>video</tt>, <tt>audio</tt>. See constants at {@link Player.GetPlayers.Media}.
     */
    public GetPlayers(String media) {
      super();
      addParameter("media", media);
    }

    @Override
    protected ArrayList<GetPlayersResult> parseMany(JsonNode node) {
      final ArrayNode results = (ArrayNode) node;
      if (results != null) {
        final ArrayList<GetPlayersResult> ret = new ArrayList<GetPlayersResult>(results.size());
        for (int i = 0; i < results.size(); i++) {
          final ObjectNode item = (ObjectNode) results.get(i);
          ret.add(new GetPlayersResult(item));
        }
        return ret;
      }
      else {
        return new ArrayList<GetPlayersResult>(0);
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

    /**
     * Note: This class is used as result only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class GetPlayersResult extends AbstractModel {

      // field names
      public static final String NAME         = "name";
      public static final String PLAYERCOREID = "playercoreid";
      public static final String PLAYSAUDIO   = "playsaudio";
      public static final String PLAYSVIDEO   = "playsvideo";
      public static final String TYPE         = "type";

      // class members
      public final String        name;
      public final Integer       playercoreid;
      public final Boolean       playsaudio;
      public final Boolean       playsvideo;
      public final String        type;

      /**
       * @param name
       * @param playercoreid
       * @param playsaudio
       * @param playsvideo
       * @param type
       *          One of: <tt>internal</tt>, <tt>external</tt>, <tt>remote</tt>. See constants at {@link Player.GetPlayersResult.Type}.
       */
      public GetPlayersResult(String name, Integer playercoreid, Boolean playsaudio, Boolean playsvideo, String type) {
        this.name = name;
        this.playercoreid = playercoreid;
        this.playsaudio = playsaudio;
        this.playsvideo = playsvideo;
        this.type = type;
      }

      /**
       * Construct from JSON object.
       * 
       * @param node
       *          JSON object representing a GetPlayersResult object
       */
      public GetPlayersResult(JsonNode node) {
        name = parseString(node, NAME);
        playercoreid = node.get(PLAYERCOREID).getIntValue(); // required value
        playsaudio = node.get(PLAYSAUDIO).getBooleanValue(); // required value
        playsvideo = node.get(PLAYSVIDEO).getBooleanValue(); // required value
        type = parseString(node, TYPE);
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(NAME, name);
        node.put(PLAYERCOREID, playercoreid);
        node.put(PLAYSAUDIO, playsaudio);
        node.put(PLAYSVIDEO, playsvideo);
        node.put(TYPE, type); // enum
        return node;
      }

      /**
       * Extracts a list of {@link GetPlayersResult} objects from a JSON array.
       * 
       * @param node
       *          ObjectNode containing the list of objects.
       * @param key
       *          Key pointing to the node where the list is stored.
       */
      static List<GetPlayersResult> getPlayerGetPlayersResultList(JsonNode node, String key) {
        if (node.has(key)) {
          final ArrayNode a = (ArrayNode) node.get(key);
          final List<GetPlayersResult> l = new ArrayList<GetPlayersResult>(a.size());
          for (int i = 0; i < a.size(); i++) {
            l.add(new GetPlayersResult((JsonNode) a.get(i)));
          }
          return l;
        }
        return new ArrayList<GetPlayersResult>(0);
      }

      /**
       * API Name: <tt>type</tt>
       */
      public interface Type {

        public final String             INTERNAL = "internal";
        public final String             EXTERNAL = "external";
        public final String             REMOTE   = "remote";

        public final static Set<String> values   = new HashSet<String>(Arrays.asList(INTERNAL, EXTERNAL, REMOTE));
      }
    }

    /**
     * API Name: <tt>media</tt>
     */
    public interface Media {

      public final String             ALL    = "all";
      public final String             VIDEO  = "video";
      public final String             AUDIO  = "audio";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(ALL, VIDEO, AUDIO));
    }
  }

  /**
   * Retrieves the values of the given properties.
   * <p/>
   * This class represents the API method <tt>Player.GetProperties</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetProperties extends AbstractCall<PlayerModel.PropertyValue> {
    public final static String API_TYPE = "Player.GetProperties";

    /**
     * Retrieves the values of the given properties.
     * 
     * @param playerid
     * @param properties
     *          One or more of: <tt>type</tt>, <tt>partymode</tt>, <tt>speed</tt>, <tt>time</tt>, <tt>percentage</tt>, <tt>totaltime</tt>,
     *          <tt>playlistid</tt>, <tt>position</tt>, <tt>repeat</tt>, <tt>shuffled</tt>, <tt>canseek</tt>, <tt>canchangespeed</tt>,
     *          <tt>canmove</tt>, <tt>canzoom</tt>, <tt>canrotate</tt>, <tt>canshuffle</tt>, <tt>canrepeat</tt>, <tt>currentaudiostream</tt>,
     *          <tt>audiostreams</tt>, <tt>subtitleenabled</tt>, <tt>currentsubtitle</tt>, <tt>subtitles</tt>, <tt>live</tt>. See constants at
     *          {@link PlayerModel.PropertyName}.
     */
    public GetProperties(Integer playerid, String... properties) {
      super();
      addParameter("playerid", playerid);
      addParameter("properties", properties);
    }

    @Override
    protected PlayerModel.PropertyValue parseOne(JsonNode node) {
      return new PlayerModel.PropertyValue(node);
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
   * Go to previous/next/specific item in the playlist.
   * <p/>
   * This class represents the API method <tt>Player.GoTo</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GoTo extends AbstractCall<String> {
    public final static String API_TYPE = "Player.GoTo";

    /**
     * Go to previous/next/specific item in the playlist.
     * 
     * @param playerid
     * @param to
     *          One of: <tt>previous</tt>, <tt>next</tt>. See constants at {@link Player.GoTo.To}.
     */
    public GoTo(Integer playerid, String to) {
      super();
      addParameter("playerid", playerid);
      addParameter("to", to);
    }

    /**
     * Go to previous/next/specific item in the playlist.
     * 
     * @param playerid
     * @param to
     *          position in playlist.
     */
    public GoTo(Integer playerid, Integer to) {
      super();
      addParameter("playerid", playerid);
      addParameter("to", to);
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
     * API Name: <tt>to</tt>
     */
    public interface To {

      public final String             PREVIOUS = "previous";
      public final String             NEXT     = "next";

      public final static Set<String> values   = new HashSet<String>(Arrays.asList(PREVIOUS, NEXT));
    }
  }

  /**
   * If picture is zoomed move viewport left/right/up/down otherwise skip previous/next.
   * <p/>
   * This class represents the API method <tt>Player.Move</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Move extends AbstractCall<String> {
    public final static String API_TYPE = "Player.Move";

    /**
     * If picture is zoomed move viewport left/right/up/down otherwise skip previous/next.
     * 
     * @param playerid
     * @param direction
     *          One of: <tt>left</tt>, <tt>right</tt>, <tt>up</tt>, <tt>down</tt>. See constants at {@link Player.Move.Direction}.
     */
    public Move(Integer playerid, String direction) {
      super();
      addParameter("playerid", playerid);
      addParameter("direction", direction);
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
     * API Name: <tt>direction</tt>
     */
    public interface Direction {

      public final String             LEFT   = "left";
      public final String             RIGHT  = "right";
      public final String             UP     = "up";
      public final String             DOWN   = "down";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(LEFT, RIGHT, UP, DOWN));
    }
  }

  /**
   * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item from
   * the database.
   * <p/>
   * This class represents the API method <tt>Player.Open</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Open extends AbstractCall<String> {
    public final static String API_TYPE = "Player.Open";

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     * @param options
     */
    public Open(ItemPlaylistIdPosition item, Option options) {
      super();
      addParameter("item", item);
      addParameter("options", options);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     * @param options
     */
    public Open(PlaylistModel.Item item, Option options) {
      super();
      addParameter("item", item);
      addParameter("options", options);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     * @param options
     */
    public Open(ItemPathRandomRecursive item, Option options) {
      super();
      addParameter("item", item);
      addParameter("options", options);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     * @param options
     */
    public Open(ItemPartymode item, Option options) {
      super();
      addParameter("item", item);
      addParameter("options", options);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     * @param options
     */
    public Open(ItemChannelId item, Option options) {
      super();
      addParameter("item", item);
      addParameter("options", options);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     * @param options
     */
    public Open(ItemRecordingId item, Option options) {
      super();
      addParameter("item", item);
      addParameter("options", options);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     */
    public Open() {
      super();
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     */
    public Open(ItemPlaylistIdPosition item) {
      super();
      addParameter("item", item);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     */
    public Open(PlaylistModel.Item item) {
      super();
      addParameter("item", item);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     */
    public Open(ItemPathRandomRecursive item) {
      super();
      addParameter("item", item);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     */
    public Open(ItemPartymode item) {
      super();
      addParameter("item", item);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     */
    public Open(ItemChannelId item) {
      super();
      addParameter("item", item);
    }

    /**
     * Start playback of either the playlist with the given ID, a slideshow with the pictures from the given directory or a single file or an item
     * from the database.
     * 
     * @param item
     */
    public Open(ItemRecordingId item) {
      super();
      addParameter("item", item);
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
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class ItemPlaylistIdPosition extends AbstractModel {

      // field names
      public static final String PLAYLISTID = "playlistid";
      public static final String POSITION   = "position";

      // class members
      public final Integer       playlistid;
      public final Integer       position;

      /**
       * @param playlistid
       * @param position
       */
      public ItemPlaylistIdPosition(Integer playlistid, Integer position) {
        this.playlistid = playlistid;
        this.position = position;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(PLAYLISTID, playlistid);
        node.put(POSITION, position);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class ItemPathRandomRecursive extends AbstractModel {

      // field names
      public static final String PATH      = "path";
      public static final String RANDOM    = "random";
      public static final String RECURSIVE = "recursive";

      // class members
      public final String        path;
      public final Boolean       random;
      public final Boolean       recursive;

      /**
       * @param path
       * @param random
       * @param recursive
       */
      public ItemPathRandomRecursive(String path, Boolean random, Boolean recursive) {
        this.path = path;
        this.random = random;
        this.recursive = recursive;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(PATH, path);
        node.put(RANDOM, random);
        node.put(RECURSIVE, recursive);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class ItemPartymode extends AbstractModel {

      // field names
      public static final String PARTYMODE = "partymode";

      // class members
      public final String        partymode;

      /**
       * @param partymode
       */
      public ItemPartymode(String partymode) {
        this.partymode = partymode;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(PARTYMODE, partymode);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class ItemChannelId extends AbstractModel {

      // field names
      public static final String CHANNELID = "channelid";

      // class members
      public final Integer       channelid;

      /**
       * @param channelid
       */
      public ItemChannelId(Integer channelid) {
        this.channelid = channelid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(CHANNELID, channelid);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class ItemRecordingId extends AbstractModel {

      // field names
      public static final String RECORDINGID = "recordingid";

      // class members
      public final Integer       recordingid;

      /**
       * @param recordingid
       */
      public ItemRecordingId(Integer recordingid) {
        this.recordingid = recordingid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(RECORDINGID, recordingid);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Option extends AbstractModel {

      // field names
      public static final String PLAYERCOREID = "playercoreid";
      public static final String REPEAT       = "repeat";
      public static final String RESUME       = "resume";
      public static final String SHUFFLED     = "shuffled";

      // class members
      public final Playercoreid  playercoreid;
      public final String        repeat;
      public final Resume        resume;
      public final Boolean       shuffled;

      /**
       * @param playercoreid
       * @param repeat
       *          One of: <tt>off</tt>, <tt>one</tt>, <tt>all</tt>. See constants at {@link PlayerModel.Repeat}.
       * @param resume
       * @param shuffled
       */
      public Option(Playercoreid playercoreid, String repeat, Resume resume, Boolean shuffled) {
        this.playercoreid = playercoreid;
        this.repeat = repeat;
        this.resume = resume;
        this.shuffled = shuffled;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(PLAYERCOREID, playercoreid == null ? null : playercoreid.toJsonNode());
        node.put(REPEAT, repeat); // enum
        node.put(RESUME, resume == null ? null : resume.toJsonNode());
        node.put(SHUFFLED, shuffled);
        return node;
      }

      /**
       * Note: This class is used as parameter only.<br/>
       * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
       */
      public static class Resume extends AbstractModel {

        // class members
        public final Boolean                  booleanArg;
        public final Double                   positionPercentage;
        public final PlayerModel.PositionTime positionTime;

        /**
         * @param booleanArg
         */
        public Resume(Boolean booleanArg) {
          this.booleanArg = booleanArg;
          this.positionPercentage = null;
          this.positionTime = null;
        }

        /**
         * @param positionPercentage
         */
        public Resume(Double positionPercentage) {
          this.positionPercentage = positionPercentage;
          this.booleanArg = null;
          this.positionTime = null;
        }

        /**
         * @param positionTime
         */
        public Resume(PlayerModel.PositionTime positionTime) {
          this.positionTime = positionTime;
          this.booleanArg = null;
          this.positionPercentage = null;
        }

        @Override
        public JsonNode toJsonNode() {
          if (booleanArg != null) {
            return booleanArg ? BooleanNode.TRUE : BooleanNode.FALSE;
          }
          if (positionPercentage != null) {
            return new DoubleNode(positionPercentage);
          }
          if (positionTime != null) {
            return positionTime.toJsonNode();
          }
          return null; // this is completely excluded. theoretically.
        }
      }

      /**
       * Note: This class is used as parameter only.<br/>
       * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
       */
      public static class Playercoreid extends AbstractModel {

        // class members
        public final Integer integerArg;
        public final String  stringArg;

        /**
         * @param integerArg
         */
        public Playercoreid(Integer integerArg) {
          this.integerArg = integerArg;
          this.stringArg = null;
        }

        /**
         * @param stringArg
         *          One of: <tt>default</tt>. See constants at {@link Player.Playercoreid.StringArg}.
         */
        public Playercoreid(String stringArg) {
          this.stringArg = stringArg;
          this.integerArg = null;
        }

        @Override
        public JsonNode toJsonNode() {
          if (integerArg != null) {
            return new IntNode(integerArg);
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

          public final String             DEFAULT = "default";

          public final static Set<String> values  = new HashSet<String>(Arrays.asList(DEFAULT));
        }
      }
    }
  }

  /**
   * Pauses or unpause playback and returns the new state.
   * <p/>
   * This class represents the API method <tt>Player.PlayPause</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class PlayPause extends AbstractCall<PlayerModel.Speed> {
    public final static String API_TYPE = "Player.PlayPause";

    /**
     * Pauses or unpause playback and returns the new state.
     * 
     * @param playerid
     * @param play
     */
    public PlayPause(Integer playerid, GlobalModel.Toggle play) {
      super();
      addParameter("playerid", playerid);
      addParameter("play", play);
    }

    /**
     * Pauses or unpause playback and returns the new state.
     * 
     * @param playerid
     */
    public PlayPause(Integer playerid) {
      super();
      addParameter("playerid", playerid);
    }

    @Override
    protected PlayerModel.Speed parseOne(JsonNode node) {
      return new PlayerModel.Speed(node);
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
   * Rotates current picture.
   * <p/>
   * This class represents the API method <tt>Player.Rotate</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Rotate extends AbstractCall<String> {
    public final static String API_TYPE = "Player.Rotate";

    /**
     * Rotates current picture.
     * 
     * @param playerid
     * @param value
     *          One of: <tt>clockwise</tt>, <tt>counterclockwise</tt>. See constants at {@link Player.Rotate.Value}.
     */
    public Rotate(Integer playerid, String value) {
      super();
      addParameter("playerid", playerid);
      addParameter("value", value);
    }

    /**
     * Rotates current picture.
     * 
     * @param playerid
     */
    public Rotate(Integer playerid) {
      super();
      addParameter("playerid", playerid);
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
     * API Name: <tt>value</tt>
     */
    public interface Value {

      public final String             CLOCKWISE        = "clockwise";
      public final String             COUNTERCLOCKWISE = "counterclockwise";

      public final static Set<String> values           = new HashSet<String>(Arrays.asList(CLOCKWISE, COUNTERCLOCKWISE));
    }
  }

  /**
   * Seek through the playing item.
   * <p/>
   * This class represents the API method <tt>Player.Seek</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Seek extends AbstractCall<Seek.SeekResult> {
    public final static String API_TYPE = "Player.Seek";

    /**
     * Seek through the playing item.
     * 
     * @param playerid
     * @param value
     *          Percentage value to seek to.
     */
    public Seek(Integer playerid, Double value) {
      super();
      addParameter("playerid", playerid);
      addParameter("value", value);
    }

    /**
     * Seek through the playing item.
     * 
     * @param playerid
     * @param value
     *          Time to seek to.
     */
    public Seek(Integer playerid, PlayerModel.PositionTime value) {
      super();
      addParameter("playerid", playerid);
      addParameter("value", value);
    }

    /**
     * Seek through the playing item.
     * 
     * @param playerid
     * @param value
     *          Seek by predefined jumps. One of: <tt>smallforward</tt>, <tt>smallbackward</tt>, <tt>bigforward</tt>, <tt>bigbackward</tt>. See
     *          constants at {@link Player.Seek.Value}.
     */
    public Seek(Integer playerid, String value) {
      super();
      addParameter("playerid", playerid);
      addParameter("value", value);
    }

    /**
     * Seek through the playing item.
     * 
     * @param playerid
     * @param value
     */
    public Seek(Integer playerid, ValuePercentage value) {
      super();
      addParameter("playerid", playerid);
      addParameter("value", value);
    }

    /**
     * Seek through the playing item.
     * 
     * @param playerid
     * @param value
     */
    public Seek(Integer playerid, ValueTime value) {
      super();
      addParameter("playerid", playerid);
      addParameter("value", value);
    }

    /**
     * Seek through the playing item.
     * 
     * @param playerid
     * @param value
     */
    public Seek(Integer playerid, ValueStep value) {
      super();
      addParameter("playerid", playerid);
      addParameter("value", value);
    }

    /**
     * Seek through the playing item.
     * 
     * @param playerid
     * @param value
     */
    public Seek(Integer playerid, ValueSecond value) {
      super();
      addParameter("playerid", playerid);
      addParameter("value", value);
    }

    @Override
    protected SeekResult parseOne(JsonNode node) {
      return new SeekResult(node);
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
    public static class ValuePercentage extends AbstractModel {

      // field names
      public static final String PERCENTAGE = "percentage";

      // class members
      public final Double        percentage;

      /**
       * @param percentage
       */
      public ValuePercentage(Double percentage) {
        this.percentage = percentage;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(PERCENTAGE, percentage);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class ValueTime extends AbstractModel {

      // field names
      public static final String            TIME = "time";

      // class members
      public final PlayerModel.PositionTime time;

      /**
       * @param time
       */
      public ValueTime(PlayerModel.PositionTime time) {
        this.time = time;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(TIME, time == null ? null : time.toJsonNode());
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class ValueStep extends AbstractModel {

      // field names
      public static final String STEP = "step";

      // class members
      public final String        step;

      /**
       * @param step
       *          One of: <tt>smallforward</tt>, <tt>smallbackward</tt>, <tt>bigforward</tt>, <tt>bigbackward</tt>. See constants at
       *          {@link Player.ValueStep.Step}.
       */
      public ValueStep(String step) {
        this.step = step;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(STEP, step); // enum
        return node;
      }

      /**
       * API Name: <tt>step</tt>
       */
      public interface Step {

        public final String             SMALLFORWARD  = "smallforward";
        public final String             SMALLBACKWARD = "smallbackward";
        public final String             BIGFORWARD    = "bigforward";
        public final String             BIGBACKWARD   = "bigbackward";

        public final static Set<String> values        = new HashSet<String>(Arrays.asList(SMALLFORWARD, SMALLBACKWARD, BIGFORWARD, BIGBACKWARD));
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class ValueSecond extends AbstractModel {

      // field names
      public static final String SECONDS = "seconds";

      // class members
      public final Integer       seconds;

      /**
       * @param seconds
       */
      public ValueSecond(Integer seconds) {
        this.seconds = seconds;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(SECONDS, seconds);
        return node;
      }
    }

    /**
     * Note: This class is used as result only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class SeekResult extends AbstractModel {

      // field names
      public static final String    PERCENTAGE = "percentage";
      public static final String    TIME       = "time";
      public static final String    TOTALTIME  = "totaltime";

      // class members
      public final Double           percentage;
      public final GlobalModel.Time time;
      public final GlobalModel.Time totaltime;

      /**
       * @param percentage
       * @param time
       * @param totaltime
       */
      public SeekResult(Double percentage, GlobalModel.Time time, GlobalModel.Time totaltime) {
        this.percentage = percentage;
        this.time = time;
        this.totaltime = totaltime;
      }

      /**
       * Construct from JSON object.
       * 
       * @param node
       *          JSON object representing a SeekResult object
       */
      public SeekResult(JsonNode node) {
        percentage = parseDouble(node, PERCENTAGE);
        time = node.has(TIME) ? new GlobalModel.Time(node.get(TIME)) : null;
        totaltime = node.has(TOTALTIME) ? new GlobalModel.Time(node.get(TOTALTIME)) : null;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(PERCENTAGE, percentage);
        node.put(TIME, time == null ? null : time.toJsonNode());
        node.put(TOTALTIME, totaltime == null ? null : totaltime.toJsonNode());
        return node;
      }

      /**
       * Extracts a list of {@link SeekResult} objects from a JSON array.
       * 
       * @param node
       *          ObjectNode containing the list of objects.
       * @param key
       *          Key pointing to the node where the list is stored.
       */
      static List<SeekResult> getPlayerSeekResultList(JsonNode node, String key) {
        if (node.has(key)) {
          final ArrayNode a = (ArrayNode) node.get(key);
          final List<SeekResult> l = new ArrayList<SeekResult>(a.size());
          for (int i = 0; i < a.size(); i++) {
            l.add(new SeekResult((JsonNode) a.get(i)));
          }
          return l;
        }
        return new ArrayList<SeekResult>(0);
      }
    }

    /**
     * API Name: <tt>value</tt>
     */
    public interface Value {

      public final String             SMALLFORWARD  = "smallforward";
      public final String             SMALLBACKWARD = "smallbackward";
      public final String             BIGFORWARD    = "bigforward";
      public final String             BIGBACKWARD   = "bigbackward";

      public final static Set<String> values        = new HashSet<String>(Arrays.asList(SMALLFORWARD, SMALLBACKWARD, BIGFORWARD, BIGBACKWARD));
    }
  }

  /**
   * Set the audio stream played by the player.
   * <p/>
   * This class represents the API method <tt>Player.SetAudioStream</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetAudioStream extends AbstractCall<String> {
    public final static String API_TYPE = "Player.SetAudioStream";

    /**
     * Set the audio stream played by the player.
     * 
     * @param playerid
     * @param stream
     *          One of: <tt>previous</tt>, <tt>next</tt>. See constants at {@link Player.SetAudioStream.Stream}.
     */
    public SetAudioStream(Integer playerid, String stream) {
      super();
      addParameter("playerid", playerid);
      addParameter("stream", stream);
    }

    /**
     * Set the audio stream played by the player.
     * 
     * @param playerid
     * @param stream
     *          Index of the audio stream to play.
     */
    public SetAudioStream(Integer playerid, Integer stream) {
      super();
      addParameter("playerid", playerid);
      addParameter("stream", stream);
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
     * API Name: <tt>stream</tt>
     */
    public interface Stream {

      public final String             PREVIOUS = "previous";
      public final String             NEXT     = "next";

      public final static Set<String> values   = new HashSet<String>(Arrays.asList(PREVIOUS, NEXT));
    }
  }

  /**
   * Turn partymode on or off.
   * <p/>
   * This class represents the API method <tt>Player.SetPartymode</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetPartymode extends AbstractCall<String> {
    public final static String API_TYPE = "Player.SetPartymode";

    /**
     * Turn partymode on or off.
     * 
     * @param playerid
     * @param partymode
     */
    public SetPartymode(Integer playerid, GlobalModel.Toggle partymode) {
      super();
      addParameter("playerid", playerid);
      addParameter("partymode", partymode);
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
   * Set the repeat mode of the player.
   * <p/>
   * This class represents the API method <tt>Player.SetRepeat</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetRepeat extends AbstractCall<String> {
    public final static String API_TYPE = "Player.SetRepeat";

    /**
     * Set the repeat mode of the player.
     * 
     * @param playerid
     * @param repeat
     */
    public SetRepeat(Integer playerid, String repeat) {
      super();
      addParameter("playerid", playerid);
      addParameter("repeat", repeat);
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
   * Shuffle/Unshuffle items in the player.
   * <p/>
   * This class represents the API method <tt>Player.SetShuffle</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetShuffle extends AbstractCall<String> {
    public final static String API_TYPE = "Player.SetShuffle";

    /**
     * Shuffle/Unshuffle items in the player.
     * 
     * @param playerid
     * @param shuffle
     */
    public SetShuffle(Integer playerid, GlobalModel.Toggle shuffle) {
      super();
      addParameter("playerid", playerid);
      addParameter("shuffle", shuffle);
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
   * Set the speed of the current playback.
   * <p/>
   * This class represents the API method <tt>Player.SetSpeed</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetSpeed extends AbstractCall<PlayerModel.Speed> {
    public final static String API_TYPE = "Player.SetSpeed";

    /**
     * Set the speed of the current playback.
     * 
     * @param playerid
     * @param speed
     *          One of: <tt>-32</tt>, <tt>-16</tt>, <tt>-8</tt>, <tt>-4</tt>, <tt>-2</tt>, <tt>-1</tt>, <tt>0</tt>, <tt>1</tt>, <tt>2</tt>, <tt>4</tt>
     *          , <tt>8</tt>, <tt>16</tt>, <tt>32</tt>. See constants at {@link Player.SetSpeed.Speed}.
     */
    public SetSpeed(Integer playerid, Integer speed) {
      super();
      addParameter("playerid", playerid);
      addParameter("speed", speed);
    }

    @Override
    protected PlayerModel.Speed parseOne(JsonNode node) {
      return new PlayerModel.Speed(node);
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
     * API Name: <tt>speed</tt>
     */
    public interface Speed {

      public final Integer             MINUS_32 = -32;
      public final Integer             MINUS_16 = -16;
      public final Integer             MINUS_8  = -8;
      public final Integer             MINUS_4  = -4;
      public final Integer             MINUS_2  = -2;
      public final Integer             MINUS_1  = -1;
      public final Integer             ZERO     = 0;
      public final Integer             PLUS_1   = 1;
      public final Integer             PLUS_2   = 2;
      public final Integer             PLUS_4   = 4;
      public final Integer             PLUS_8   = 8;
      public final Integer             PLUS_16  = 16;
      public final Integer             PLUS_32  = 32;

      public final static Set<Integer> values   = new HashSet<Integer>(
          Arrays.asList(MINUS_32, MINUS_16, MINUS_8, MINUS_4, MINUS_2, MINUS_1, ZERO, PLUS_1, PLUS_2, PLUS_4, PLUS_8, PLUS_16, PLUS_32));
    }
  }

  /**
   * Set the subtitle displayed by the player.
   * <p/>
   * This class represents the API method <tt>Player.SetSubtitle</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetSubtitle extends AbstractCall<String> {
    public final static String API_TYPE = "Player.SetSubtitle";

    /**
     * Set the subtitle displayed by the player.
     * 
     * @param playerid
     * @param subtitle
     *          One of: <tt>previous</tt>, <tt>next</tt>, <tt>off</tt>, <tt>on</tt>. See constants at {@link Player.SetSubtitle.Subtitle}.
     * @param enable
     *          Whether to enable subtitles to be displayed after setting the new subtitle.
     */
    public SetSubtitle(Integer playerid, String subtitle, Boolean enable) {
      super();
      addParameter("playerid", playerid);
      addParameter("subtitle", subtitle);
      addParameter("enable", enable);
    }

    /**
     * Set the subtitle displayed by the player.
     * 
     * @param playerid
     * @param subtitle
     *          Index of the subtitle to display.
     * @param enable
     *          Whether to enable subtitles to be displayed after setting the new subtitle.
     */
    public SetSubtitle(Integer playerid, Integer subtitle, Boolean enable) {
      super();
      addParameter("playerid", playerid);
      addParameter("subtitle", subtitle);
      addParameter("enable", enable);
    }

    /**
     * Set the subtitle displayed by the player.
     * 
     * @param playerid
     * @param subtitle
     *          One of: <tt>previous</tt>, <tt>next</tt>, <tt>off</tt>, <tt>on</tt>. See constants at {@link Player.SetSubtitle.Subtitle}.
     */
    public SetSubtitle(Integer playerid, String subtitle) {
      super();
      addParameter("playerid", playerid);
      addParameter("subtitle", subtitle);
    }

    /**
     * Set the subtitle displayed by the player.
     * 
     * @param playerid
     * @param subtitle
     *          Index of the subtitle to display.
     */
    public SetSubtitle(Integer playerid, Integer subtitle) {
      super();
      addParameter("playerid", playerid);
      addParameter("subtitle", subtitle);
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
     * API Name: <tt>subtitle</tt>
     */
    public interface Subtitle {

      public final String             PREVIOUS = "previous";
      public final String             NEXT     = "next";
      public final String             OFF      = "off";
      public final String             ON       = "on";

      public final static Set<String> values   = new HashSet<String>(Arrays.asList(PREVIOUS, NEXT, OFF, ON));
    }
  }

  /**
   * Stops playback.
   * <p/>
   * This class represents the API method <tt>Player.Stop</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Stop extends AbstractCall<String> {
    public final static String API_TYPE = "Player.Stop";

    /**
     * Stops playback.
     * 
     * @param playerid
     */
    public Stop(Integer playerid) {
      super();
      addParameter("playerid", playerid);
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
   * Zoom current picture.
   * <p/>
   * This class represents the API method <tt>Player.Zoom</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Zoom extends AbstractCall<String> {
    public final static String API_TYPE = "Player.Zoom";

    /**
     * Zoom current picture.
     * 
     * @param playerid
     * @param zoom
     *          One of: <tt>in</tt>, <tt>out</tt>. See constants at {@link Player.Zoom.ZoomValue}.
     */
    public Zoom(Integer playerid, String zoom) {
      super();
      addParameter("playerid", playerid);
      addParameter("zoom", zoom);
    }

    /**
     * Zoom current picture.
     * 
     * @param playerid
     * @param zoom
     *          zoom level.
     */
    public Zoom(Integer playerid, Integer zoom) {
      super();
      addParameter("playerid", playerid);
      addParameter("zoom", zoom);
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
     * API Name: <tt>zoom</tt>
     */
    public interface ZoomValue {

      public final String             IN     = "in";
      public final String             OUT    = "out";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(IN, OUT));
    }
  }
}
