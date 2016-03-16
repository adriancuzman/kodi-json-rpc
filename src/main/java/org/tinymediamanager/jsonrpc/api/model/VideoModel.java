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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.tinymediamanager.jsonrpc.api.AbstractModel;

public final class VideoModel {

  /**
   * API Name: <tt>null</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Cast extends AbstractModel {

    // field names
    public static final String NAME      = "name";
    public static final String ORDER     = "order";
    public static final String ROLE      = "role";
    public static final String THUMBNAIL = "thumbnail";

    // class members
    public final String        name;
    public final Integer       order;
    public final String        role;
    public final String        thumbnail;

    /**
     * @param name
     * @param order
     * @param role
     * @param thumbnail
     */
    public Cast(String name, Integer order, String role, String thumbnail) {
      this.name = name;
      this.order = order;
      this.role = role;
      this.thumbnail = thumbnail;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a Cast object
     */
    public Cast(JsonNode node) {
      name = node.get(NAME).getTextValue(); // required value
      order = node.get(ORDER).getIntValue(); // required value
      role = node.get(ROLE).getTextValue(); // required value
      thumbnail = parseString(node, THUMBNAIL);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(NAME, name);
      node.put(ORDER, order);
      node.put(ROLE, role);
      node.put(THUMBNAIL, thumbnail);
      return node;
    }

    /**
     * Extracts a list of {@link Cast} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<Cast> getVideoModelCastList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<Cast> l = new ArrayList<Cast>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new Cast((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<Cast>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.Base</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class BaseDetail extends MediaModel.BaseDetail {
    public final static String      API_TYPE  = "Video.Details.Base";

    // field names
    public static final String      ART       = "art";
    public static final String      PLAYCOUNT = "playcount";

    // class members
    public final MediaModel.Artwork art;
    public final Integer            playcount;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a BaseDetail object
     */
    public BaseDetail(JsonNode node) {
      super(node);
      art = node.has(ART) ? new MediaModel.Artwork(node.get(ART)) : null;
      playcount = parseInt(node, PLAYCOUNT);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(ART, art.toJsonNode());
      node.put(PLAYCOUNT, playcount);
      return node;
    }

    /**
     * Extracts a list of {@link BaseDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<BaseDetail> getVideoModelBaseDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<BaseDetail> l = new ArrayList<BaseDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new BaseDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<BaseDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.Episode</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class EpisodeDetail extends FileDetail {
    public final static String           API_TYPE           = "Video.Details.Episode";

    // field names
    public static final String           CAST               = "cast";
    public static final String           EPISODE            = "episode";
    public static final String           EPISODEID          = "episodeid";
    public static final String           FIRSTAIRED         = "firstaired";
    public static final String           ORIGINALTITLE      = "originaltitle";
    public static final String           PRODUCTIONCODE     = "productioncode";
    public static final String           RATING             = "rating";
    public static final String           SEASON             = "season";
    public static final String           SEASONID           = "seasonid";
    public static final String           SHOWTITLE          = "showtitle";
    public static final String           SPECIALSORTEPISODE = "specialsortepisode";
    public static final String           SPECIALSORTSEASON  = "specialsortseason";
    public static final String           TVSHOWID           = "tvshowid";
    public static final String           UNIQUEID           = "uniqueid";
    public static final String           USERRATING         = "userrating";
    public static final String           VOTES              = "votes";
    public static final String           WRITER             = "writer";

    // class members
    public final List<Cast>              cast;
    public final Integer                 episode;
    public final Integer                 episodeid;
    public final String                  firstaired;
    public final String                  originaltitle;
    public final String                  productioncode;
    public final Double                  rating;
    public final Integer                 season;
    public final Integer                 seasonid;
    public final String                  showtitle;
    public final Integer                 specialsortepisode;
    public final Integer                 specialsortseason;
    public final Integer                 tvshowid;
    public final HashMap<String, String> uniqueid;
    public final Integer                 userrating;
    public final String                  votes;
    public final List<String>            writer;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a EpisodeDetail object
     */
    public EpisodeDetail(JsonNode node) {
      super(node);
      cast = Cast.getVideoModelCastList(node, CAST);
      episode = parseInt(node, EPISODE);
      episodeid = parseInt(node, EPISODEID);
      firstaired = parseString(node, FIRSTAIRED);
      originaltitle = parseString(node, ORIGINALTITLE);
      productioncode = parseString(node, PRODUCTIONCODE);
      rating = parseDouble(node, RATING);
      season = parseInt(node, SEASON);
      seasonid = parseInt(node, SEASONID);
      showtitle = parseString(node, SHOWTITLE);
      specialsortepisode = parseInt(node, SPECIALSORTEPISODE);
      specialsortseason = parseInt(node, SPECIALSORTSEASON);
      tvshowid = parseInt(node, TVSHOWID);
      uniqueid = getStringMap(node, UNIQUEID);
      userrating = parseInt(node, USERRATING);
      votes = parseString(node, VOTES);
      writer = getStringArray(node, WRITER);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode castArray = OM.createArrayNode();
      for (Cast item : cast) {
        castArray.add(item.toJsonNode());
      }
      node.put(CAST, castArray);
      node.put(EPISODE, episode);
      node.put(EPISODEID, episodeid);
      node.put(FIRSTAIRED, firstaired);
      node.put(ORIGINALTITLE, originaltitle);
      node.put(PRODUCTIONCODE, productioncode);
      node.put(RATING, rating);
      node.put(SEASON, season);
      node.put(SEASONID, seasonid);
      node.put(SHOWTITLE, showtitle);
      node.put(SPECIALSORTEPISODE, specialsortepisode);
      node.put(SPECIALSORTSEASON, specialsortseason);
      node.put(TVSHOWID, tvshowid);
      final ObjectNode uniqueidMap = OM.createObjectNode();
      for (String key : uniqueid.values()) {
        uniqueidMap.put(key, uniqueid.get(key));
      }
      node.put(UNIQUEID, uniqueidMap);
      node.put(USERRATING, userrating);
      node.put(VOTES, votes);
      final ArrayNode writerArray = OM.createArrayNode();
      for (String item : writer) {
        writerArray.add(item);
      }
      node.put(WRITER, writerArray);
      return node;
    }

    /**
     * Extracts a list of {@link EpisodeDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<EpisodeDetail> getVideoModelEpisodeDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<EpisodeDetail> l = new ArrayList<EpisodeDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new EpisodeDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<EpisodeDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.File</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class FileDetail extends ItemDetail {
    public final static String API_TYPE      = "Video.Details.File";

    // field names
    public static final String DIRECTOR      = "director";
    public static final String RESUME        = "resume";
    public static final String RUNTIME       = "runtime";
    public static final String STREAMDETAILS = "streamdetails";

    // class members
    public final List<String>  director;
    public final Resume        resume;
    public final Integer       runtime;
    public final Streams       streamdetails;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a FileDetail object
     */
    public FileDetail(JsonNode node) {
      super(node);
      director = getStringArray(node, DIRECTOR);
      resume = node.has(RESUME) ? new Resume(node.get(RESUME)) : null;
      runtime = parseInt(node, RUNTIME);
      streamdetails = node.has(STREAMDETAILS) ? new Streams(node.get(STREAMDETAILS)) : null;
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode directorArray = OM.createArrayNode();
      for (String item : director) {
        directorArray.add(item);
      }
      node.put(DIRECTOR, directorArray);
      node.put(RESUME, resume.toJsonNode());
      node.put(RUNTIME, runtime);
      node.put(STREAMDETAILS, streamdetails.toJsonNode());
      return node;
    }

    /**
     * Extracts a list of {@link FileDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<FileDetail> getVideoModelFileDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<FileDetail> l = new ArrayList<FileDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new FileDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<FileDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.Item</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ItemDetail extends MediaDetail {
    public final static String API_TYPE   = "Video.Details.Item";

    // field names
    public static final String DATEADDED  = "dateadded";
    public static final String FILE       = "file";
    public static final String LASTPLAYED = "lastplayed";
    public static final String PLOT       = "plot";

    // class members
    public final String        dateadded;
    public final String        file;
    public final String        lastplayed;
    public final String        plot;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ItemDetail object
     */
    public ItemDetail(JsonNode node) {
      super(node);
      dateadded = parseString(node, DATEADDED);
      file = parseString(node, FILE);
      lastplayed = parseString(node, LASTPLAYED);
      plot = parseString(node, PLOT);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(DATEADDED, dateadded);
      node.put(FILE, file);
      node.put(LASTPLAYED, lastplayed);
      node.put(PLOT, plot);
      return node;
    }

    /**
     * Extracts a list of {@link ItemDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ItemDetail> getVideoModelItemDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ItemDetail> l = new ArrayList<ItemDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ItemDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ItemDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.Media</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class MediaDetail extends BaseDetail {
    public final static String API_TYPE = "Video.Details.Media";

    // field names
    public static final String TITLE    = "title";

    // class members
    public final String        title;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a MediaDetail object
     */
    public MediaDetail(JsonNode node) {
      super(node);
      title = parseString(node, TITLE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(TITLE, title);
      return node;
    }

    /**
     * Extracts a list of {@link MediaDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<MediaDetail> getVideoModelMediaDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<MediaDetail> l = new ArrayList<MediaDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new MediaDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<MediaDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.Movie</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class MovieDetail extends FileDetail {
    public final static String API_TYPE      = "Video.Details.Movie";

    // field names
    public static final String CAST          = "cast";
    public static final String COUNTRY       = "country";
    public static final String GENRE         = "genre";
    public static final String IMDBNUMBER    = "imdbnumber";
    public static final String MOVIEID       = "movieid";
    public static final String MPAA          = "mpaa";
    public static final String ORIGINALTITLE = "originaltitle";
    public static final String PLOTOUTLINE   = "plotoutline";
    public static final String RATING        = "rating";
    public static final String SET           = "set";
    public static final String SETID         = "setid";
    public static final String SHOWLINK      = "showlink";
    public static final String SORTTITLE     = "sorttitle";
    public static final String STUDIO        = "studio";
    public static final String TAG           = "tag";
    public static final String TAGLINE       = "tagline";
    public static final String TOP250        = "top250";
    public static final String TRAILER       = "trailer";
    public static final String USERRATING    = "userrating";
    public static final String VOTES         = "votes";
    public static final String WRITER        = "writer";
    public static final String YEAR          = "year";

    // class members
    public final List<Cast>    cast;
    public final List<String>  country;
    public final List<String>  genre;
    public final String        imdbnumber;
    public final Integer       movieid;
    public final String        mpaa;
    public final String        originaltitle;
    public final String        plotoutline;
    public final Double        rating;
    public final String        set;
    public final Integer       setid;
    public final List<String>  showlink;
    public final String        sorttitle;
    public final List<String>  studio;
    public final List<String>  tag;
    public final String        tagline;
    public final Integer       top250;
    public final String        trailer;
    public final Integer       userrating;
    public final String        votes;
    public final List<String>  writer;
    public final Integer       year;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a MovieDetail object
     */
    public MovieDetail(JsonNode node) {
      super(node);
      cast = Cast.getVideoModelCastList(node, CAST);
      country = getStringArray(node, COUNTRY);
      genre = getStringArray(node, GENRE);
      imdbnumber = parseString(node, IMDBNUMBER);
      movieid = parseInt(node, MOVIEID);
      mpaa = parseString(node, MPAA);
      originaltitle = parseString(node, ORIGINALTITLE);
      plotoutline = parseString(node, PLOTOUTLINE);
      rating = parseDouble(node, RATING);
      set = parseString(node, SET);
      setid = parseInt(node, SETID);
      showlink = getStringArray(node, SHOWLINK);
      sorttitle = parseString(node, SORTTITLE);
      studio = getStringArray(node, STUDIO);
      tag = getStringArray(node, TAG);
      tagline = parseString(node, TAGLINE);
      top250 = parseInt(node, TOP250);
      trailer = parseString(node, TRAILER);
      userrating = parseInt(node, USERRATING);
      votes = parseString(node, VOTES);
      writer = getStringArray(node, WRITER);
      year = parseInt(node, YEAR);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode castArray = OM.createArrayNode();
      for (Cast item : cast) {
        castArray.add(item.toJsonNode());
      }
      node.put(CAST, castArray);
      final ArrayNode countryArray = OM.createArrayNode();
      for (String item : country) {
        countryArray.add(item);
      }
      node.put(COUNTRY, countryArray);
      final ArrayNode genreArray = OM.createArrayNode();
      for (String item : genre) {
        genreArray.add(item);
      }
      node.put(GENRE, genreArray);
      node.put(IMDBNUMBER, imdbnumber);
      node.put(MOVIEID, movieid);
      node.put(MPAA, mpaa);
      node.put(ORIGINALTITLE, originaltitle);
      node.put(PLOTOUTLINE, plotoutline);
      node.put(RATING, rating);
      node.put(SET, set);
      node.put(SETID, setid);
      final ArrayNode showlinkArray = OM.createArrayNode();
      for (String item : showlink) {
        showlinkArray.add(item);
      }
      node.put(SHOWLINK, showlinkArray);
      node.put(SORTTITLE, sorttitle);
      final ArrayNode studioArray = OM.createArrayNode();
      for (String item : studio) {
        studioArray.add(item);
      }
      node.put(STUDIO, studioArray);
      final ArrayNode tagArray = OM.createArrayNode();
      for (String item : tag) {
        tagArray.add(item);
      }
      node.put(TAG, tagArray);
      node.put(TAGLINE, tagline);
      node.put(TOP250, top250);
      node.put(TRAILER, trailer);
      node.put(USERRATING, userrating);
      node.put(VOTES, votes);
      final ArrayNode writerArray = OM.createArrayNode();
      for (String item : writer) {
        writerArray.add(item);
      }
      node.put(WRITER, writerArray);
      node.put(YEAR, year);
      return node;
    }

    /**
     * Extracts a list of {@link MovieDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<MovieDetail> getVideoModelMovieDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<MovieDetail> l = new ArrayList<MovieDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new MovieDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<MovieDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.MovieSet</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class MovieSetDetail extends MediaDetail {
    public final static String API_TYPE = "Video.Details.MovieSet";

    // field names
    public static final String PLOT     = "plot";
    public static final String SETID    = "setid";

    // class members
    public final String        plot;
    public final Integer       setid;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a MovieSetDetail object
     */
    public MovieSetDetail(JsonNode node) {
      super(node);
      plot = parseString(node, PLOT);
      setid = parseInt(node, SETID);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(PLOT, plot);
      node.put(SETID, setid);
      return node;
    }

    /**
     * Extracts a list of {@link MovieSetDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<MovieSetDetail> getVideoModelMovieSetDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<MovieSetDetail> l = new ArrayList<MovieSetDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new MovieSetDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<MovieSetDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.MovieSet.Extended</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class MovieSetExtendedDetail extends MovieSetDetail {
    public final static String            API_TYPE = "Video.Details.MovieSet.Extended";

    // field names
    public static final String            LIMITS   = "limits";
    public static final String            MOVIES   = "movies";

    // class members
    public final ListModel.LimitsReturned limits;
    public final List<MovieDetail>        movies;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a MovieSetExtendedDetail object
     */
    public MovieSetExtendedDetail(JsonNode node) {
      super(node);
      limits = node.has(LIMITS) ? new ListModel.LimitsReturned(node.get(LIMITS)) : null;
      movies = MovieDetail.getVideoModelMovieDetailList(node, MOVIES);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(LIMITS, limits.toJsonNode());
      final ArrayNode moviesArray = OM.createArrayNode();
      for (MovieDetail item : movies) {
        moviesArray.add(item.toJsonNode());
      }
      node.put(MOVIES, moviesArray);
      return node;
    }

    /**
     * Extracts a list of {@link MovieSetExtendedDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<MovieSetExtendedDetail> getVideoModelMovieSetExtendedDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<MovieSetExtendedDetail> l = new ArrayList<MovieSetExtendedDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new MovieSetExtendedDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<MovieSetExtendedDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.MusicVideo</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class MusicVideoDetail extends FileDetail {
    public final static String API_TYPE     = "Video.Details.MusicVideo";

    // field names
    public static final String ALBUM        = "album";
    public static final String ARTIST       = "artist";
    public static final String GENRE        = "genre";
    public static final String MUSICVIDEOID = "musicvideoid";
    public static final String STUDIO       = "studio";
    public static final String TAG          = "tag";
    public static final String TRACK        = "track";
    public static final String USERRATING   = "userrating";
    public static final String YEAR         = "year";

    // class members
    public final String        album;
    public final List<String>  artist;
    public final List<String>  genre;
    public final Integer       musicvideoid;
    public final List<String>  studio;
    public final List<String>  tag;
    public final Integer       track;
    public final Integer       userrating;
    public final Integer       year;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a MusicVideoDetail object
     */
    public MusicVideoDetail(JsonNode node) {
      super(node);
      album = parseString(node, ALBUM);
      artist = getStringArray(node, ARTIST);
      genre = getStringArray(node, GENRE);
      musicvideoid = parseInt(node, MUSICVIDEOID);
      studio = getStringArray(node, STUDIO);
      tag = getStringArray(node, TAG);
      track = parseInt(node, TRACK);
      userrating = parseInt(node, USERRATING);
      year = parseInt(node, YEAR);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(ALBUM, album);
      final ArrayNode artistArray = OM.createArrayNode();
      for (String item : artist) {
        artistArray.add(item);
      }
      node.put(ARTIST, artistArray);
      final ArrayNode genreArray = OM.createArrayNode();
      for (String item : genre) {
        genreArray.add(item);
      }
      node.put(GENRE, genreArray);
      node.put(MUSICVIDEOID, musicvideoid);
      final ArrayNode studioArray = OM.createArrayNode();
      for (String item : studio) {
        studioArray.add(item);
      }
      node.put(STUDIO, studioArray);
      final ArrayNode tagArray = OM.createArrayNode();
      for (String item : tag) {
        tagArray.add(item);
      }
      node.put(TAG, tagArray);
      node.put(TRACK, track);
      node.put(USERRATING, userrating);
      node.put(YEAR, year);
      return node;
    }

    /**
     * Extracts a list of {@link MusicVideoDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<MusicVideoDetail> getVideoModelMusicVideoDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<MusicVideoDetail> l = new ArrayList<MusicVideoDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new MusicVideoDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<MusicVideoDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.Season</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SeasonDetail extends BaseDetail {
    public final static String API_TYPE        = "Video.Details.Season";

    // field names
    public static final String EPISODE         = "episode";
    public static final String SEASON          = "season";
    public static final String SEASONID        = "seasonid";
    public static final String SHOWTITLE       = "showtitle";
    public static final String TVSHOWID        = "tvshowid";
    public static final String WATCHEDEPISODES = "watchedepisodes";

    // class members
    public final Integer       episode;
    public final Integer       season;
    public final Integer       seasonid;
    public final String        showtitle;
    public final Integer       tvshowid;
    public final Integer       watchedepisodes;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SeasonDetail object
     */
    public SeasonDetail(JsonNode node) {
      super(node);
      episode = parseInt(node, EPISODE);
      season = node.get(SEASON).getIntValue(); // required value
      seasonid = parseInt(node, SEASONID);
      showtitle = parseString(node, SHOWTITLE);
      tvshowid = parseInt(node, TVSHOWID);
      watchedepisodes = parseInt(node, WATCHEDEPISODES);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(EPISODE, episode);
      node.put(SEASON, season);
      node.put(SEASONID, seasonid);
      node.put(SHOWTITLE, showtitle);
      node.put(TVSHOWID, tvshowid);
      node.put(WATCHEDEPISODES, watchedepisodes);
      return node;
    }

    /**
     * Extracts a list of {@link SeasonDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SeasonDetail> getVideoModelSeasonDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SeasonDetail> l = new ArrayList<SeasonDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SeasonDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SeasonDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Details.TVShow</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class TVShowDetail extends ItemDetail {
    public final static String API_TYPE        = "Video.Details.TVShow";

    // field names
    public static final String CAST            = "cast";
    public static final String EPISODE         = "episode";
    public static final String EPISODEGUIDE    = "episodeguide";
    public static final String GENRE           = "genre";
    public static final String IMDBNUMBER      = "imdbnumber";
    public static final String MPAA            = "mpaa";
    public static final String ORIGINALTITLE   = "originaltitle";
    public static final String PREMIERED       = "premiered";
    public static final String RATING          = "rating";
    public static final String SEASON          = "season";
    public static final String SORTTITLE       = "sorttitle";
    public static final String STUDIO          = "studio";
    public static final String TAG             = "tag";
    public static final String TVSHOWID        = "tvshowid";
    public static final String USERRATING      = "userrating";
    public static final String VOTES           = "votes";
    public static final String WATCHEDEPISODES = "watchedepisodes";
    public static final String YEAR            = "year";

    // class members
    public final List<Cast>    cast;
    public final Integer       episode;
    public final String        episodeguide;
    public final List<String>  genre;
    public final String        imdbnumber;
    public final String        mpaa;
    public final String        originaltitle;
    public final String        premiered;
    public final Double        rating;
    public final Integer       season;
    public final String        sorttitle;
    public final List<String>  studio;
    public final List<String>  tag;
    public final Integer       tvshowid;
    public final Integer       userrating;
    public final String        votes;
    public final Integer       watchedepisodes;
    public final Integer       year;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a TVShowDetail object
     */
    public TVShowDetail(JsonNode node) {
      super(node);
      cast = Cast.getVideoModelCastList(node, CAST);
      episode = parseInt(node, EPISODE);
      episodeguide = parseString(node, EPISODEGUIDE);
      genre = getStringArray(node, GENRE);
      imdbnumber = parseString(node, IMDBNUMBER);
      mpaa = parseString(node, MPAA);
      originaltitle = parseString(node, ORIGINALTITLE);
      premiered = parseString(node, PREMIERED);
      rating = parseDouble(node, RATING);
      season = parseInt(node, SEASON);
      sorttitle = parseString(node, SORTTITLE);
      studio = getStringArray(node, STUDIO);
      tag = getStringArray(node, TAG);
      tvshowid = parseInt(node, TVSHOWID);
      userrating = parseInt(node, USERRATING);
      votes = parseString(node, VOTES);
      watchedepisodes = parseInt(node, WATCHEDEPISODES);
      year = parseInt(node, YEAR);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode castArray = OM.createArrayNode();
      for (Cast item : cast) {
        castArray.add(item.toJsonNode());
      }
      node.put(CAST, castArray);
      node.put(EPISODE, episode);
      node.put(EPISODEGUIDE, episodeguide);
      final ArrayNode genreArray = OM.createArrayNode();
      for (String item : genre) {
        genreArray.add(item);
      }
      node.put(GENRE, genreArray);
      node.put(IMDBNUMBER, imdbnumber);
      node.put(MPAA, mpaa);
      node.put(ORIGINALTITLE, originaltitle);
      node.put(PREMIERED, premiered);
      node.put(RATING, rating);
      node.put(SEASON, season);
      node.put(SORTTITLE, sorttitle);
      final ArrayNode studioArray = OM.createArrayNode();
      for (String item : studio) {
        studioArray.add(item);
      }
      node.put(STUDIO, studioArray);
      final ArrayNode tagArray = OM.createArrayNode();
      for (String item : tag) {
        tagArray.add(item);
      }
      node.put(TAG, tagArray);
      node.put(TVSHOWID, tvshowid);
      node.put(USERRATING, userrating);
      node.put(VOTES, votes);
      node.put(WATCHEDEPISODES, watchedepisodes);
      node.put(YEAR, year);
      return node;
    }

    /**
     * Extracts a list of {@link TVShowDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<TVShowDetail> getVideoModelTVShowDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<TVShowDetail> l = new ArrayList<TVShowDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new TVShowDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<TVShowDetail>(0);
    }

  }

  /**
   * API Name: <tt>Video.Resume</tt>
   * <p/>
   * Note: This class is used as parameter as well as result.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Resume extends AbstractModel {
    public final static String API_TYPE = "Video.Resume";

    // field names
    public static final String POSITION = "position";
    public static final String TOTAL    = "total";

    // class members
    public final Double        position;
    public final Double        total;

    /**
     * @param position
     * @param total
     */
    public Resume(Double position, Double total) {
      this.position = position;
      this.total = total;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a Resume object
     */
    public Resume(JsonNode node) {
      position = parseDouble(node, POSITION);
      total = parseDouble(node, TOTAL);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(POSITION, position);
      node.put(TOTAL, total);
      return node;
    }

    /**
     * Extracts a list of {@link Resume} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<Resume> getVideoModelResumeList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<Resume> l = new ArrayList<Resume>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new Resume((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<Resume>(0);
    }

  }

  /**
   * API Name: <tt>Video.Streams</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Streams extends AbstractModel {
    public final static String  API_TYPE = "Video.Streams";

    // field names
    public static final String  AUDIO    = "audio";
    public static final String  SUBTITLE = "subtitle";
    public static final String  VIDEO    = "video";

    // class members
    public final List<Audio>    audio;
    public final List<Subtitle> subtitle;
    public final List<Video>    video;

    /**
     * @param audio
     * @param subtitle
     * @param video
     */
    public Streams(List<Audio> audio, List<Subtitle> subtitle, List<Video> video) {
      this.audio = audio;
      this.subtitle = subtitle;
      this.video = video;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a Streams object
     */
    public Streams(JsonNode node) {
      audio = Audio.getVideoModelAudioList(node, AUDIO);
      subtitle = Subtitle.getVideoModelSubtitleList(node, SUBTITLE);
      video = Video.getVideoModelVideoList(node, VIDEO);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      final ArrayNode audioArray = OM.createArrayNode();
      for (Audio item : audio) {
        audioArray.add(item.toJsonNode());
      }
      node.put(AUDIO, audioArray);
      final ArrayNode subtitleArray = OM.createArrayNode();
      for (Subtitle item : subtitle) {
        subtitleArray.add(item.toJsonNode());
      }
      node.put(SUBTITLE, subtitleArray);
      final ArrayNode videoArray = OM.createArrayNode();
      for (Video item : video) {
        videoArray.add(item.toJsonNode());
      }
      node.put(VIDEO, videoArray);
      return node;
    }

    /**
     * Extracts a list of {@link Streams} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<Streams> getVideoModelStreamsList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<Streams> l = new ArrayList<Streams>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new Streams((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<Streams>(0);
    }

    /**
     * Note: This class is used as result only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Audio extends AbstractModel {

      // field names
      public static final String CHANNELS = "channels";
      public static final String CODEC    = "codec";
      public static final String LANGUAGE = "language";

      // class members
      public final Integer       channels;
      public final String        codec;
      public final String        language;

      /**
       * @param channels
       * @param codec
       * @param language
       */
      public Audio(Integer channels, String codec, String language) {
        this.channels = channels;
        this.codec = codec;
        this.language = language;
      }

      /**
       * Construct from JSON object.
       * 
       * @param node
       *          JSON object representing a Audio object
       */
      public Audio(JsonNode node) {
        channels = parseInt(node, CHANNELS);
        codec = parseString(node, CODEC);
        language = parseString(node, LANGUAGE);
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(CHANNELS, channels);
        node.put(CODEC, codec);
        node.put(LANGUAGE, language);
        return node;
      }

      /**
       * Extracts a list of {@link Audio} objects from a JSON array.
       * 
       * @param node
       *          ObjectNode containing the list of objects.
       * @param key
       *          Key pointing to the node where the list is stored.
       */
      static List<Audio> getVideoModelAudioList(JsonNode node, String key) {
        if (node.has(key)) {
          final ArrayNode a = (ArrayNode) node.get(key);
          final List<Audio> l = new ArrayList<Audio>(a.size());
          for (int i = 0; i < a.size(); i++) {
            l.add(new Audio((JsonNode) a.get(i)));
          }
          return l;
        }
        return new ArrayList<Audio>(0);
      }

    }

    /**
     * Note: This class is used as result only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Subtitle extends AbstractModel {

      // field names
      public static final String LANGUAGE = "language";

      // class members
      public final String        language;

      /**
       * @param language
       */
      public Subtitle(String language) {
        this.language = language;
      }

      /**
       * Construct from JSON object.
       * 
       * @param node
       *          JSON object representing a Subtitle object
       */
      public Subtitle(JsonNode node) {
        language = parseString(node, LANGUAGE);
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(LANGUAGE, language);
        return node;
      }

      /**
       * Extracts a list of {@link Subtitle} objects from a JSON array.
       * 
       * @param node
       *          ObjectNode containing the list of objects.
       * @param key
       *          Key pointing to the node where the list is stored.
       */
      static List<Subtitle> getVideoModelSubtitleList(JsonNode node, String key) {
        if (node.has(key)) {
          final ArrayNode a = (ArrayNode) node.get(key);
          final List<Subtitle> l = new ArrayList<Subtitle>(a.size());
          for (int i = 0; i < a.size(); i++) {
            l.add(new Subtitle((JsonNode) a.get(i)));
          }
          return l;
        }
        return new ArrayList<Subtitle>(0);
      }

    }

    /**
     * Note: This class is used as result only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Video extends AbstractModel {

      // field names
      public static final String ASPECT   = "aspect";
      public static final String CODEC    = "codec";
      public static final String DURATION = "duration";
      public static final String HEIGHT   = "height";
      public static final String WIDTH    = "width";

      // class members
      public final Double        aspect;
      public final String        codec;
      public final Integer       duration;
      public final Integer       height;
      public final Integer       width;

      /**
       * @param aspect
       * @param codec
       * @param duration
       * @param height
       * @param width
       */
      public Video(Double aspect, String codec, Integer duration, Integer height, Integer width) {
        this.aspect = aspect;
        this.codec = codec;
        this.duration = duration;
        this.height = height;
        this.width = width;
      }

      /**
       * Construct from JSON object.
       * 
       * @param node
       *          JSON object representing a Video object
       */
      public Video(JsonNode node) {
        aspect = parseDouble(node, ASPECT);
        codec = parseString(node, CODEC);
        duration = parseInt(node, DURATION);
        height = parseInt(node, HEIGHT);
        width = parseInt(node, WIDTH);
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(ASPECT, aspect);
        node.put(CODEC, codec);
        node.put(DURATION, duration);
        node.put(HEIGHT, height);
        node.put(WIDTH, width);
        return node;
      }

      /**
       * Extracts a list of {@link Video} objects from a JSON array.
       * 
       * @param node
       *          ObjectNode containing the list of objects.
       * @param key
       *          Key pointing to the node where the list is stored.
       */
      static List<Video> getVideoModelVideoList(JsonNode node, String key) {
        if (node.has(key)) {
          final ArrayNode a = (ArrayNode) node.get(key);
          final List<Video> l = new ArrayList<Video>(a.size());
          for (int i = 0; i < a.size(); i++) {
            l.add(new Video((JsonNode) a.get(i)));
          }
          return l;
        }
        return new ArrayList<Video>(0);
      }

    }
  }

  /**
   * API Name: <tt>Video.Fields.Episode</tt>
   */
  public interface EpisodeFields {

    public final String             TITLE              = "title";
    public final String             PLOT               = "plot";
    public final String             VOTES              = "votes";
    public final String             RATING             = "rating";
    public final String             WRITER             = "writer";
    public final String             FIRSTAIRED         = "firstaired";
    public final String             PLAYCOUNT          = "playcount";
    public final String             RUNTIME            = "runtime";
    public final String             DIRECTOR           = "director";
    public final String             PRODUCTIONCODE     = "productioncode";
    public final String             SEASON             = "season";
    public final String             EPISODE            = "episode";
    public final String             ORIGINALTITLE      = "originaltitle";
    public final String             SHOWTITLE          = "showtitle";
    public final String             CAST               = "cast";
    public final String             STREAMDETAILS      = "streamdetails";
    public final String             LASTPLAYED         = "lastplayed";
    public final String             FANART             = "fanart";
    public final String             THUMBNAIL          = "thumbnail";
    public final String             FILE               = "file";
    public final String             RESUME             = "resume";
    public final String             TVSHOWID           = "tvshowid";
    public final String             DATEADDED          = "dateadded";
    public final String             UNIQUEID           = "uniqueid";
    public final String             ART                = "art";
    public final String             SPECIALSORTSEASON  = "specialsortseason";
    public final String             SPECIALSORTEPISODE = "specialsortepisode";
    public final String             USERRATING         = "userrating";
    public final String             SEASONID           = "seasonid";

    public final static Set<String> values             = new HashSet<String>(Arrays.asList(TITLE, PLOT, VOTES, RATING, WRITER, FIRSTAIRED, PLAYCOUNT,
        RUNTIME, DIRECTOR, PRODUCTIONCODE, SEASON, EPISODE, ORIGINALTITLE, SHOWTITLE, CAST, STREAMDETAILS, LASTPLAYED, FANART, THUMBNAIL, FILE,
        RESUME, TVSHOWID, DATEADDED, UNIQUEID, ART, SPECIALSORTSEASON, SPECIALSORTEPISODE, USERRATING, SEASONID));
  }

  /**
   * API Name: <tt>Video.Fields.Movie</tt>
   */
  public interface MovieFields {

    public final String             TITLE         = "title";
    public final String             GENRE         = "genre";
    public final String             YEAR          = "year";
    public final String             RATING        = "rating";
    public final String             DIRECTOR      = "director";
    public final String             TRAILER       = "trailer";
    public final String             TAGLINE       = "tagline";
    public final String             PLOT          = "plot";
    public final String             PLOTOUTLINE   = "plotoutline";
    public final String             ORIGINALTITLE = "originaltitle";
    public final String             LASTPLAYED    = "lastplayed";
    public final String             PLAYCOUNT     = "playcount";
    public final String             WRITER        = "writer";
    public final String             STUDIO        = "studio";
    public final String             MPAA          = "mpaa";
    public final String             CAST          = "cast";
    public final String             COUNTRY       = "country";
    public final String             IMDBNUMBER    = "imdbnumber";
    public final String             RUNTIME       = "runtime";
    public final String             SET           = "set";
    public final String             SHOWLINK      = "showlink";
    public final String             STREAMDETAILS = "streamdetails";
    public final String             TOP250        = "top250";
    public final String             VOTES         = "votes";
    public final String             FANART        = "fanart";
    public final String             THUMBNAIL     = "thumbnail";
    public final String             FILE          = "file";
    public final String             SORTTITLE     = "sorttitle";
    public final String             RESUME        = "resume";
    public final String             SETID         = "setid";
    public final String             DATEADDED     = "dateadded";
    public final String             TAG           = "tag";
    public final String             ART           = "art";
    public final String             USERRATING    = "userrating";

    public final static Set<String> values        = new HashSet<String>(Arrays.asList(TITLE, GENRE, YEAR, RATING, DIRECTOR, TRAILER, TAGLINE, PLOT,
        PLOTOUTLINE, ORIGINALTITLE, LASTPLAYED, PLAYCOUNT, WRITER, STUDIO, MPAA, CAST, COUNTRY, IMDBNUMBER, RUNTIME, SET, SHOWLINK, STREAMDETAILS,
        TOP250, VOTES, FANART, THUMBNAIL, FILE, SORTTITLE, RESUME, SETID, DATEADDED, TAG, ART, USERRATING));
  }

  /**
   * API Name: <tt>Video.Fields.MovieSet</tt>
   */
  public interface MovieSetFields {

    public final String             TITLE     = "title";
    public final String             PLAYCOUNT = "playcount";
    public final String             FANART    = "fanart";
    public final String             THUMBNAIL = "thumbnail";
    public final String             ART       = "art";
    public final String             PLOT      = "plot";

    public final static Set<String> values    = new HashSet<String>(Arrays.asList(TITLE, PLAYCOUNT, FANART, THUMBNAIL, ART, PLOT));
  }

  /**
   * API Name: <tt>Video.Fields.MusicVideo</tt>
   */
  public interface MusicVideoFields {

    public final String             TITLE         = "title";
    public final String             PLAYCOUNT     = "playcount";
    public final String             RUNTIME       = "runtime";
    public final String             DIRECTOR      = "director";
    public final String             STUDIO        = "studio";
    public final String             YEAR          = "year";
    public final String             PLOT          = "plot";
    public final String             ALBUM         = "album";
    public final String             ARTIST        = "artist";
    public final String             GENRE         = "genre";
    public final String             TRACK         = "track";
    public final String             STREAMDETAILS = "streamdetails";
    public final String             LASTPLAYED    = "lastplayed";
    public final String             FANART        = "fanart";
    public final String             THUMBNAIL     = "thumbnail";
    public final String             FILE          = "file";
    public final String             RESUME        = "resume";
    public final String             DATEADDED     = "dateadded";
    public final String             TAG           = "tag";
    public final String             ART           = "art";
    public final String             USERRATING    = "userrating";

    public final static Set<String> values        = new HashSet<String>(Arrays.asList(TITLE, PLAYCOUNT, RUNTIME, DIRECTOR, STUDIO, YEAR, PLOT, ALBUM,
        ARTIST, GENRE, TRACK, STREAMDETAILS, LASTPLAYED, FANART, THUMBNAIL, FILE, RESUME, DATEADDED, TAG, ART, USERRATING));
  }

  /**
   * API Name: <tt>Video.Fields.Season</tt>
   */
  public interface SeasonFields {

    public final String             SEASON          = "season";
    public final String             SHOWTITLE       = "showtitle";
    public final String             PLAYCOUNT       = "playcount";
    public final String             EPISODE         = "episode";
    public final String             FANART          = "fanart";
    public final String             THUMBNAIL       = "thumbnail";
    public final String             TVSHOWID        = "tvshowid";
    public final String             WATCHEDEPISODES = "watchedepisodes";
    public final String             ART             = "art";

    public final static Set<String> values          = new HashSet<String>(
        Arrays.asList(SEASON, SHOWTITLE, PLAYCOUNT, EPISODE, FANART, THUMBNAIL, TVSHOWID, WATCHEDEPISODES, ART));
  }

  /**
   * API Name: <tt>Video.Fields.TVShow</tt>
   */
  public interface TVShowFields {

    public final String             TITLE           = "title";
    public final String             GENRE           = "genre";
    public final String             YEAR            = "year";
    public final String             RATING          = "rating";
    public final String             PLOT            = "plot";
    public final String             STUDIO          = "studio";
    public final String             MPAA            = "mpaa";
    public final String             CAST            = "cast";
    public final String             PLAYCOUNT       = "playcount";
    public final String             EPISODE         = "episode";
    public final String             IMDBNUMBER      = "imdbnumber";
    public final String             PREMIERED       = "premiered";
    public final String             VOTES           = "votes";
    public final String             LASTPLAYED      = "lastplayed";
    public final String             FANART          = "fanart";
    public final String             THUMBNAIL       = "thumbnail";
    public final String             FILE            = "file";
    public final String             ORIGINALTITLE   = "originaltitle";
    public final String             SORTTITLE       = "sorttitle";
    public final String             EPISODEGUIDE    = "episodeguide";
    public final String             SEASON          = "season";
    public final String             WATCHEDEPISODES = "watchedepisodes";
    public final String             DATEADDED       = "dateadded";
    public final String             TAG             = "tag";
    public final String             ART             = "art";
    public final String             USERRATING      = "userrating";

    public final static Set<String> values          = new HashSet<String>(
        Arrays.asList(TITLE, GENRE, YEAR, RATING, PLOT, STUDIO, MPAA, CAST, PLAYCOUNT, EPISODE, IMDBNUMBER, PREMIERED, VOTES, LASTPLAYED, FANART,
            THUMBNAIL, FILE, ORIGINALTITLE, SORTTITLE, EPISODEGUIDE, SEASON, WATCHEDEPISODES, DATEADDED, TAG, ART, USERRATING));
  }
}
