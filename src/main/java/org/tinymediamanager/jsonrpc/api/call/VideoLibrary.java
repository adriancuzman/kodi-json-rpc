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
import org.tinymediamanager.jsonrpc.api.model.LibraryModel;
import org.tinymediamanager.jsonrpc.api.model.ListModel;
import org.tinymediamanager.jsonrpc.api.model.MediaModel;
import org.tinymediamanager.jsonrpc.api.model.VideoModel;

public final class VideoLibrary {

  /**
   * Cleans the video library from non-existent items.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.Clean</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Clean extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.Clean";

    /**
     * Cleans the video library from non-existent items.
     * 
     * @param showdialogs
     *          Whether or not to show the progress bar or any other GUI dialog.
     */
    public Clean(Boolean showdialogs) {
      super();
      addParameter("showdialogs", showdialogs);
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
   * Exports all items from the video library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.Export</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Export extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.Export";

    /**
     * Exports all items from the video library.
     * 
     * @param options
     */
    public Export(OptionsPath options) {
      super();
      addParameter("options", options);
    }

    /**
     * Exports all items from the video library.
     * 
     * @param options
     */
    public Export(OptionsActorthumbsImagesOverwrite options) {
      super();
      addParameter("options", options);
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
    public static class OptionsPath extends AbstractModel {

      // field names
      public static final String PATH = "path";

      // class members
      public final String        path;

      /**
       * @param path
       */
      public OptionsPath(String path) {
        this.path = path;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(PATH, path);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class OptionsActorthumbsImagesOverwrite extends AbstractModel {

      // field names
      public static final String ACTORTHUMBS = "actorthumbs";
      public static final String IMAGES      = "images";
      public static final String OVERWRITE   = "overwrite";

      // class members
      public final Boolean       actorthumbs;
      public final Boolean       images;
      public final Boolean       overwrite;

      /**
       * @param actorthumbs
       * @param images
       * @param overwrite
       */
      public OptionsActorthumbsImagesOverwrite(Boolean actorthumbs, Boolean images, Boolean overwrite) {
        this.actorthumbs = actorthumbs;
        this.images = images;
        this.overwrite = overwrite;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(ACTORTHUMBS, actorthumbs);
        node.put(IMAGES, images);
        node.put(OVERWRITE, overwrite);
        return node;
      }
    }
  }

  /**
   * Retrieve details about a specific tv show episode.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetEpisodeDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetEpisodeDetails extends AbstractCall<VideoModel.EpisodeDetail> {
    public final static String API_TYPE = "VideoLibrary.GetEpisodeDetails";

    public final static String RESULT   = "episodedetails";

    /**
     * Retrieve details about a specific tv show episode.
     * 
     * @param episodeid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodeDetails(Integer episodeid, String... properties) {
      super();
      addParameter("episodeid", episodeid);
      addParameter("properties", properties);
    }

    @Override
    protected VideoModel.EpisodeDetail parseOne(JsonNode node) {
      return new VideoModel.EpisodeDetail((ObjectNode) node.get(RESULT));
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
   * Retrieve all tv show episodes.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetEpisodes</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetEpisodes extends AbstractCall<VideoModel.EpisodeDetail> {
    public final static String API_TYPE = "VideoLibrary.GetEpisodes";

    public final static String RESULT   = "episodes";

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, ListModel.Sort sort, FilterActor filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, ListModel.Sort sort, FilterDirector filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, ListModel.Sort sort, ListModel.EpisodeFilter filter,
        String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(String... properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Sort sort, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Sort sort, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Sort sort, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(FilterGenreId filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, FilterGenreId filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, FilterGenreId filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, FilterGenreId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, FilterGenreId filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, FilterGenreId filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(FilterGenre filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, FilterGenre filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, FilterGenre filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, FilterGenre filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, FilterGenre filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, FilterGenre filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(FilterYear filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, FilterYear filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, FilterYear filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, FilterYear filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, FilterYear filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, FilterYear filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(FilterActor filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, FilterActor filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, FilterActor filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, FilterActor filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, FilterActor filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, FilterActor filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Sort sort, FilterActor filter, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Sort sort, FilterActor filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Sort sort, FilterActor filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, ListModel.Sort sort, FilterActor filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, ListModel.Sort sort, FilterActor filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(FilterDirector filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, FilterDirector filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, FilterDirector filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, FilterDirector filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, FilterDirector filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, FilterDirector filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Sort sort, FilterDirector filter, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Sort sort, FilterDirector filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Sort sort, FilterDirector filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, ListModel.Sort sort, FilterDirector filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, ListModel.Sort sort, FilterDirector filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Limits limits, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Sort sort, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Sort sort, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param season
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, Integer season, ListModel.Sort sort, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("season", season);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(ListModel.Limits limits, ListModel.Sort sort, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv show episodes.
     * 
     * @param tvshowid
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetEpisodes(Integer tvshowid, ListModel.Limits limits, ListModel.Sort sort, ListModel.EpisodeFilter filter, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.EpisodeDetail> parseMany(JsonNode node) {
      final ArrayNode episodes = parseResults(node, RESULT);
      if (episodes != null) {
        final ArrayList<VideoModel.EpisodeDetail> ret = new ArrayList<VideoModel.EpisodeDetail>(episodes.size());
        for (int i = 0; i < episodes.size(); i++) {
          final ObjectNode item = (ObjectNode) episodes.get(i);
          ret.add(new VideoModel.EpisodeDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.EpisodeDetail>(0);
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
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterGenreId extends AbstractModel {

      // field names
      public static final String GENREID = "genreid";

      // class members
      public final Integer       genreid;

      /**
       * @param genreid
       */
      public FilterGenreId(Integer genreid) {
        this.genreid = genreid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENREID, genreid);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterGenre extends AbstractModel {

      // field names
      public static final String GENRE = "genre";

      // class members
      public final String        genre;

      /**
       * @param genre
       */
      public FilterGenre(String genre) {
        this.genre = genre;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENRE, genre);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterYear extends AbstractModel {

      // field names
      public static final String YEAR = "year";

      // class members
      public final Integer       year;

      /**
       * @param year
       */
      public FilterYear(Integer year) {
        this.year = year;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(YEAR, year);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterActor extends AbstractModel {

      // field names
      public static final String ACTOR = "actor";

      // class members
      public final String        actor;

      /**
       * @param actor
       */
      public FilterActor(String actor) {
        this.actor = actor;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(ACTOR, actor);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterDirector extends AbstractModel {

      // field names
      public static final String DIRECTOR = "director";

      // class members
      public final String        director;

      /**
       * @param director
       */
      public FilterDirector(String director) {
        this.director = director;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(DIRECTOR, director);
        return node;
      }

    }
  }

  /**
   * Retrieve all genres.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetGenres</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetGenres extends AbstractCall<LibraryModel.GenreDetail> {
    public final static String API_TYPE = "VideoLibrary.GetGenres";
    public final static String RESULT   = "genres";

    /**
     * Retrieve all genres.
     * 
     * @param type
     *          One of: <tt>movie</tt>, <tt>tvshow</tt>, <tt>musicvideo</tt>. See constants at {@link VideoLibrary.GetGenres.Type}.
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>thumbnail</tt>. See constants at {@link LibraryModel.GenreFields}.
     */
    public GetGenres(String type, ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("type", type);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all genres.
     * 
     * @param type
     *          One of: <tt>movie</tt>, <tt>tvshow</tt>, <tt>musicvideo</tt>. See constants at {@link VideoLibrary.GetGenres.Type}.
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>thumbnail</tt>. See constants at {@link LibraryModel.GenreFields}.
     */
    public GetGenres(String type, String... properties) {
      super();
      addParameter("type", type);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all genres.
     * 
     * @param type
     *          One of: <tt>movie</tt>, <tt>tvshow</tt>, <tt>musicvideo</tt>. See constants at {@link VideoLibrary.GetGenres.Type}.
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>thumbnail</tt>. See constants at {@link LibraryModel.GenreFields}.
     */
    public GetGenres(String type, ListModel.Limits limits, String... properties) {
      super();
      addParameter("type", type);
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<LibraryModel.GenreDetail> parseMany(JsonNode node) {
      final ArrayNode genres = parseResults(node, RESULT);
      if (genres != null) {
        final ArrayList<LibraryModel.GenreDetail> ret = new ArrayList<LibraryModel.GenreDetail>(genres.size());
        for (int i = 0; i < genres.size(); i++) {
          final ObjectNode item = (ObjectNode) genres.get(i);
          ret.add(new LibraryModel.GenreDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<LibraryModel.GenreDetail>(0);
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
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             MOVIE      = "movie";
      public final String             TVSHOW     = "tvshow";
      public final String             MUSICVIDEO = "musicvideo";

      public final static Set<String> values     = new HashSet<String>(Arrays.asList(MOVIE, TVSHOW, MUSICVIDEO));
    }
  }

  /**
   * Retrieve details about a specific movie.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetMovieDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetMovieDetails extends AbstractCall<VideoModel.MovieDetail> {
    public final static String API_TYPE = "VideoLibrary.GetMovieDetails";
    public final static String RESULT   = "moviedetails";

    /**
     * Retrieve details about a specific movie.
     * 
     * @param movieid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovieDetails(Integer movieid, String... properties) {
      super();
      addParameter("movieid", movieid);
      addParameter("properties", properties);
    }

    @Override
    protected VideoModel.MovieDetail parseOne(JsonNode node) {
      return new VideoModel.MovieDetail((ObjectNode) node.get(RESULT));
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
   * Retrieve details about a specific movie set.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetMovieSetDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetMovieSetDetails extends AbstractCall<VideoModel.MovieSetExtendedDetail> {
    public final static String API_TYPE = "VideoLibrary.GetMovieSetDetails";
    public final static String RESULT   = "setdetails";

    /**
     * Retrieve details about a specific movie set.
     * 
     * @param setid
     * @param movies
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>art</tt>, <tt>plot</tt>. See constants at
     *          {@link VideoModel.MovieSetFields}.
     */
    public GetMovieSetDetails(Integer setid, Movie movies, String... properties) {
      super();
      addParameter("setid", setid);
      addParameter("movies", movies);
      addParameter("properties", properties);
    }

    /**
     * Retrieve details about a specific movie set.
     * 
     * @param setid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>art</tt>, <tt>plot</tt>. See constants at
     *          {@link VideoModel.MovieSetFields}.
     */
    public GetMovieSetDetails(Integer setid, String... properties) {
      super();
      addParameter("setid", setid);
      addParameter("properties", properties);
    }

    @Override
    protected VideoModel.MovieSetExtendedDetail parseOne(JsonNode node) {
      return new VideoModel.MovieSetExtendedDetail((ObjectNode) node.get(RESULT));
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
    public static class Movie extends AbstractModel {

      // field names
      public static final String    LIMITS     = "limits";
      public static final String    PROPERTIES = "properties";
      public static final String    SORT       = "sort";

      // class members
      public final ListModel.Limits limits;
      public final String           properties;
      public final ListModel.Sort   sort;

      /**
       * @param limits
       * @param properties
       *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>,
       *          <tt>tagline</tt>, <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>,
       *          <tt>writer</tt>, <tt>studio</tt>, <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>,
       *          <tt>set</tt>, <tt>showlink</tt>, <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>,
       *          <tt>file</tt>, <tt>sorttitle</tt>, <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>,
       *          <tt>userrating</tt>. See constants at {@link VideoLibrary.Movie.Property}.
       * @param sort
       */
      public Movie(ListModel.Limits limits, String properties, ListModel.Sort sort) {
        this.limits = limits;
        this.properties = properties;
        this.sort = sort;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(LIMITS, limits.toJsonNode());
        node.put(PROPERTIES, properties); // enum
        node.put(SORT, sort.toJsonNode());
        return node;
      }

      /**
       * API Name: <tt>properties</tt>
       */
      public interface Property {

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

        public final static Set<String> values        = new HashSet<String>(Arrays.asList(TITLE, GENRE, YEAR, RATING, DIRECTOR, TRAILER, TAGLINE,
            PLOT, PLOTOUTLINE, ORIGINALTITLE, LASTPLAYED, PLAYCOUNT, WRITER, STUDIO, MPAA, CAST, COUNTRY, IMDBNUMBER, RUNTIME, SET, SHOWLINK,
            STREAMDETAILS, TOP250, VOTES, FANART, THUMBNAIL, FILE, SORTTITLE, RESUME, SETID, DATEADDED, TAG, ART, USERRATING));
      }
    }
  }

  /**
   * Retrieve all movie sets.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetMovieSets</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetMovieSets extends AbstractCall<VideoModel.MovieSetDetail> {
    public final static String API_TYPE = "VideoLibrary.GetMovieSets";
    public final static String RESULT   = "sets";

    /**
     * Retrieve all movie sets.
     * 
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>art</tt>, <tt>plot</tt>. See constants at
     *          {@link VideoModel.MovieSetFields}.
     */
    public GetMovieSets(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movie sets.
     * 
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>art</tt>, <tt>plot</tt>. See constants at
     *          {@link VideoModel.MovieSetFields}.
     */
    public GetMovieSets(String... properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movie sets.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>art</tt>, <tt>plot</tt>. See constants at
     *          {@link VideoModel.MovieSetFields}.
     */
    public GetMovieSets(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.MovieSetDetail> parseMany(JsonNode node) {
      final ArrayNode sets = parseResults(node, RESULT);
      if (sets != null) {
        final ArrayList<VideoModel.MovieSetDetail> ret = new ArrayList<VideoModel.MovieSetDetail>(sets.size());
        for (int i = 0; i < sets.size(); i++) {
          final ObjectNode item = (ObjectNode) sets.get(i);
          ret.add(new VideoModel.MovieSetDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.MovieSetDetail>(0);
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
   * Retrieve all movies.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetMovies</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetMovies extends AbstractCall<VideoModel.MovieDetail> {
    public final static String API_TYPE = "VideoLibrary.GetMovies";
    public final static String RESULT   = "movies";

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterActor filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterDirector filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterStudio filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterCountry filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterSetId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterSet filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, FilterTag filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, ListModel.MovieFilter filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(String... properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Sort sort, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterGenreId filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterGenreId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterGenre filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterGenre filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterYear filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterYear filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterActor filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterActor filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterDirector filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterDirector filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterStudio filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterStudio filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterCountry filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterCountry filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterSetId filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterSetId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterSet filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterSet filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(FilterTag filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, FilterTag filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.MovieFilter filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all movies.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetMovies(ListModel.Limits limits, ListModel.MovieFilter filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.MovieDetail> parseMany(JsonNode node) {
      final ArrayNode movies = parseResults(node, RESULT);
      if (movies != null) {
        final ArrayList<VideoModel.MovieDetail> ret = new ArrayList<VideoModel.MovieDetail>(movies.size());
        for (int i = 0; i < movies.size(); i++) {
          final ObjectNode item = (ObjectNode) movies.get(i);
          ret.add(new VideoModel.MovieDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.MovieDetail>(0);
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
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterGenreId extends AbstractModel {

      // field names
      public static final String GENREID = "genreid";

      // class members
      public final Integer       genreid;

      /**
       * @param genreid
       */
      public FilterGenreId(Integer genreid) {
        this.genreid = genreid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENREID, genreid);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterGenre extends AbstractModel {

      // field names
      public static final String GENRE = "genre";

      // class members
      public final String        genre;

      /**
       * @param genre
       */
      public FilterGenre(String genre) {
        this.genre = genre;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENRE, genre);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterYear extends AbstractModel {

      // field names
      public static final String YEAR = "year";

      // class members
      public final Integer       year;

      /**
       * @param year
       */
      public FilterYear(Integer year) {
        this.year = year;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(YEAR, year);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterActor extends AbstractModel {

      // field names
      public static final String ACTOR = "actor";

      // class members
      public final String        actor;

      /**
       * @param actor
       */
      public FilterActor(String actor) {
        this.actor = actor;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(ACTOR, actor);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterDirector extends AbstractModel {

      // field names
      public static final String DIRECTOR = "director";

      // class members
      public final String        director;

      /**
       * @param director
       */
      public FilterDirector(String director) {
        this.director = director;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(DIRECTOR, director);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterStudio extends AbstractModel {

      // field names
      public static final String STUDIO = "studio";

      // class members
      public final String        studio;

      /**
       * @param studio
       */
      public FilterStudio(String studio) {
        this.studio = studio;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(STUDIO, studio);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterCountry extends AbstractModel {

      // field names
      public static final String COUNTRY = "country";

      // class members
      public final String        country;

      /**
       * @param country
       */
      public FilterCountry(String country) {
        this.country = country;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(COUNTRY, country);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterSetId extends AbstractModel {

      // field names
      public static final String SETID = "setid";

      // class members
      public final Integer       setid;

      /**
       * @param setid
       */
      public FilterSetId(Integer setid) {
        this.setid = setid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(SETID, setid);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterSet extends AbstractModel {

      // field names
      public static final String SET = "set";

      // class members
      public final String        set;

      /**
       * @param set
       */
      public FilterSet(String set) {
        this.set = set;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(SET, set);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterTag extends AbstractModel {

      // field names
      public static final String TAG = "tag";

      // class members
      public final String        tag;

      /**
       * @param tag
       */
      public FilterTag(String tag) {
        this.tag = tag;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(TAG, tag);
        return node;
      }
    }
  }

  /**
   * Retrieve details about a specific music video.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetMusicVideoDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetMusicVideoDetails extends AbstractCall<VideoModel.MusicVideoDetail> {
    public final static String API_TYPE = "VideoLibrary.GetMusicVideoDetails";
    public final static String RESULT   = "musicvideodetails";

    /**
     * Retrieve details about a specific music video.
     * 
     * @param musicvideoid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideoDetails(Integer musicvideoid, String... properties) {
      super();
      addParameter("musicvideoid", musicvideoid);
      addParameter("properties", properties);
    }

    @Override
    protected VideoModel.MusicVideoDetail parseOne(JsonNode node) {
      return new VideoModel.MusicVideoDetail((ObjectNode) node.get(RESULT));
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
   * Retrieve all music videos.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetMusicVideos</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetMusicVideos extends AbstractCall<VideoModel.MusicVideoDetail> {
    public final static String API_TYPE = "VideoLibrary.GetMusicVideos";
    public final static String RESULT   = "musicvideos";

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, FilterArtist filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, FilterDirector filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, FilterStudio filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, FilterTag filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, ListModel.MusicVideoFilter filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(String... properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Sort sort, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(FilterArtist filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, FilterArtist filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(FilterGenreId filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, FilterGenreId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(FilterGenre filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, FilterGenre filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(FilterYear filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, FilterYear filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(FilterDirector filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, FilterDirector filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(FilterStudio filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, FilterStudio filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(FilterTag filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, FilterTag filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.MusicVideoFilter filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all music videos.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetMusicVideos(ListModel.Limits limits, ListModel.MusicVideoFilter filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.MusicVideoDetail> parseMany(JsonNode node) {
      final ArrayNode musicvideos = parseResults(node, RESULT);
      if (musicvideos != null) {
        final ArrayList<VideoModel.MusicVideoDetail> ret = new ArrayList<VideoModel.MusicVideoDetail>(musicvideos.size());
        for (int i = 0; i < musicvideos.size(); i++) {
          final ObjectNode item = (ObjectNode) musicvideos.get(i);
          ret.add(new VideoModel.MusicVideoDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.MusicVideoDetail>(0);
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
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterArtist extends AbstractModel {

      // field names
      public static final String ARTIST = "artist";

      // class members
      public final String        artist;

      /**
       * @param artist
       */
      public FilterArtist(String artist) {
        this.artist = artist;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(ARTIST, artist);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterGenreId extends AbstractModel {

      // field names
      public static final String GENREID = "genreid";

      // class members
      public final Integer       genreid;

      /**
       * @param genreid
       */
      public FilterGenreId(Integer genreid) {
        this.genreid = genreid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENREID, genreid);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterGenre extends AbstractModel {

      // field names
      public static final String GENRE = "genre";

      // class members
      public final String        genre;

      /**
       * @param genre
       */
      public FilterGenre(String genre) {
        this.genre = genre;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENRE, genre);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterYear extends AbstractModel {

      // field names
      public static final String YEAR = "year";

      // class members
      public final Integer       year;

      /**
       * @param year
       */
      public FilterYear(Integer year) {
        this.year = year;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(YEAR, year);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterDirector extends AbstractModel {

      // field names
      public static final String DIRECTOR = "director";

      // class members
      public final String        director;

      /**
       * @param director
       */
      public FilterDirector(String director) {
        this.director = director;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(DIRECTOR, director);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterStudio extends AbstractModel {

      // field names
      public static final String STUDIO = "studio";

      // class members
      public final String        studio;

      /**
       * @param studio
       */
      public FilterStudio(String studio) {
        this.studio = studio;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(STUDIO, studio);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterTag extends AbstractModel {

      // field names
      public static final String TAG = "tag";

      // class members
      public final String        tag;

      /**
       * @param tag
       */
      public FilterTag(String tag) {
        this.tag = tag;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(TAG, tag);
        return node;
      }
    }
  }

  /**
   * Retrieve all recently added tv episodes.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetRecentlyAddedEpisodes</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetRecentlyAddedEpisodes extends AbstractCall<VideoModel.EpisodeDetail> {
    public final static String API_TYPE = "VideoLibrary.GetRecentlyAddedEpisodes";
    public final static String RESULT   = "episodes";

    /**
     * Retrieve all recently added tv episodes.
     * 
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetRecentlyAddedEpisodes(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all recently added tv episodes.
     * 
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetRecentlyAddedEpisodes(String... properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieve all recently added tv episodes.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>plot</tt>, <tt>votes</tt>, <tt>rating</tt>, <tt>writer</tt>, <tt>firstaired</tt>,
     *          <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>productioncode</tt>, <tt>season</tt>, <tt>episode</tt>,
     *          <tt>originaltitle</tt>, <tt>showtitle</tt>, <tt>cast</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>tvshowid</tt>, <tt>dateadded</tt>, <tt>uniqueid</tt>, <tt>art</tt>,
     *          <tt>specialsortseason</tt>, <tt>specialsortepisode</tt>, <tt>userrating</tt>, <tt>seasonid</tt>. See constants at
     *          {@link VideoModel.EpisodeFields}.
     */
    public GetRecentlyAddedEpisodes(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.EpisodeDetail> parseMany(JsonNode node) {
      final ArrayNode episodes = parseResults(node, RESULT);
      if (episodes != null) {
        final ArrayList<VideoModel.EpisodeDetail> ret = new ArrayList<VideoModel.EpisodeDetail>(episodes.size());
        for (int i = 0; i < episodes.size(); i++) {
          final ObjectNode item = (ObjectNode) episodes.get(i);
          ret.add(new VideoModel.EpisodeDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.EpisodeDetail>(0);
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
   * Retrieve all recently added movies.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetRecentlyAddedMovies</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetRecentlyAddedMovies extends AbstractCall<VideoModel.MovieDetail> {
    public final static String API_TYPE = "VideoLibrary.GetRecentlyAddedMovies";
    public final static String RESULT   = "movies";

    /**
     * Retrieve all recently added movies.
     * 
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetRecentlyAddedMovies(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all recently added movies.
     * 
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetRecentlyAddedMovies(String... properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieve all recently added movies.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>director</tt>, <tt>trailer</tt>, <tt>tagline</tt>,
     *          <tt>plot</tt>, <tt>plotoutline</tt>, <tt>originaltitle</tt>, <tt>lastplayed</tt>, <tt>playcount</tt>, <tt>writer</tt>, <tt>studio</tt>
     *          , <tt>mpaa</tt>, <tt>cast</tt>, <tt>country</tt>, <tt>imdbnumber</tt>, <tt>runtime</tt>, <tt>set</tt>, <tt>showlink</tt>,
     *          <tt>streamdetails</tt>, <tt>top250</tt>, <tt>votes</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>sorttitle</tt>,
     *          <tt>resume</tt>, <tt>setid</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.MovieFields}.
     */
    public GetRecentlyAddedMovies(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.MovieDetail> parseMany(JsonNode node) {
      final ArrayNode movies = parseResults(node, RESULT);
      if (movies != null) {
        final ArrayList<VideoModel.MovieDetail> ret = new ArrayList<VideoModel.MovieDetail>(movies.size());
        for (int i = 0; i < movies.size(); i++) {
          final ObjectNode item = (ObjectNode) movies.get(i);
          ret.add(new VideoModel.MovieDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.MovieDetail>(0);
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
   * Retrieve all recently added music videos.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetRecentlyAddedMusicVideos</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetRecentlyAddedMusicVideos extends AbstractCall<VideoModel.MusicVideoDetail> {
    public final static String API_TYPE = "VideoLibrary.GetRecentlyAddedMusicVideos";
    public final static String RESULT   = "musicvideos";

    /**
     * Retrieve all recently added music videos.
     * 
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetRecentlyAddedMusicVideos(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all recently added music videos.
     * 
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetRecentlyAddedMusicVideos(String... properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieve all recently added music videos.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>playcount</tt>, <tt>runtime</tt>, <tt>director</tt>, <tt>studio</tt>, <tt>year</tt>, <tt>plot</tt>
     *          , <tt>album</tt>, <tt>artist</tt>, <tt>genre</tt>, <tt>track</tt>, <tt>streamdetails</tt>, <tt>lastplayed</tt>, <tt>fanart</tt>,
     *          <tt>thumbnail</tt>, <tt>file</tt>, <tt>resume</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants
     *          at {@link VideoModel.MusicVideoFields}.
     */
    public GetRecentlyAddedMusicVideos(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.MusicVideoDetail> parseMany(JsonNode node) {
      final ArrayNode musicvideos = parseResults(node, RESULT);
      if (musicvideos != null) {
        final ArrayList<VideoModel.MusicVideoDetail> ret = new ArrayList<VideoModel.MusicVideoDetail>(musicvideos.size());
        for (int i = 0; i < musicvideos.size(); i++) {
          final ObjectNode item = (ObjectNode) musicvideos.get(i);
          ret.add(new VideoModel.MusicVideoDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.MusicVideoDetail>(0);
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
   * Retrieve all tv seasons.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetSeasons</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetSeasons extends AbstractCall<VideoModel.SeasonDetail> {
    public final static String API_TYPE = "VideoLibrary.GetSeasons";
    public final static String RESULT   = "seasons";

    /**
     * Retrieve all tv seasons.
     * 
     * @param tvshowid
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>season</tt>, <tt>showtitle</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>,
     *          <tt>tvshowid</tt>, <tt>watchedepisodes</tt>, <tt>art</tt>. See constants at {@link VideoModel.SeasonFields}.
     */
    public GetSeasons(Integer tvshowid, ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv seasons.
     * 
     * @param tvshowid
     * @param properties
     *          One or more of: <tt>season</tt>, <tt>showtitle</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>,
     *          <tt>tvshowid</tt>, <tt>watchedepisodes</tt>, <tt>art</tt>. See constants at {@link VideoModel.SeasonFields}.
     */
    public GetSeasons(Integer tvshowid, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv seasons.
     * 
     * @param tvshowid
     * @param limits
     * @param properties
     *          One or more of: <tt>season</tt>, <tt>showtitle</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>,
     *          <tt>tvshowid</tt>, <tt>watchedepisodes</tt>, <tt>art</tt>. See constants at {@link VideoModel.SeasonFields}.
     */
    public GetSeasons(Integer tvshowid, ListModel.Limits limits, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv seasons.
     * 
     * @param tvshowid
     * @param sort
     * @param properties
     *          One or more of: <tt>season</tt>, <tt>showtitle</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>fanart</tt>, <tt>thumbnail</tt>,
     *          <tt>tvshowid</tt>, <tt>watchedepisodes</tt>, <tt>art</tt>. See constants at {@link VideoModel.SeasonFields}.
     */
    public GetSeasons(Integer tvshowid, ListModel.Sort sort, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.SeasonDetail> parseMany(JsonNode node) {
      final ArrayNode seasons = parseResults(node, RESULT);
      if (seasons != null) {
        final ArrayList<VideoModel.SeasonDetail> ret = new ArrayList<VideoModel.SeasonDetail>(seasons.size());
        for (int i = 0; i < seasons.size(); i++) {
          final ObjectNode item = (ObjectNode) seasons.get(i);
          ret.add(new VideoModel.SeasonDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.SeasonDetail>(0);
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
   * Retrieve details about a specific tv show.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetTVShowDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetTVShowDetails extends AbstractCall<VideoModel.TVShowDetail> {
    public final static String API_TYPE = "VideoLibrary.GetTVShowDetails";
    public final static String RESULT   = "tvshowdetails";

    /**
     * Retrieve details about a specific tv show.
     * 
     * @param tvshowid
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShowDetails(Integer tvshowid, String... properties) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("properties", properties);
    }

    @Override
    protected VideoModel.TVShowDetail parseOne(JsonNode node) {
      return new VideoModel.TVShowDetail((ObjectNode) node.get(RESULT));
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
   * Retrieve all tv shows.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.GetTVShows</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetTVShows extends AbstractCall<VideoModel.TVShowDetail> {
    public final static String API_TYPE = "VideoLibrary.GetTVShows";
    public final static String RESULT   = "tvshows";

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.Sort sort, FilterGenreId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.Sort sort, FilterGenre filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.Sort sort, FilterYear filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.Sort sort, FilterActor filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.Sort sort, FilterStudio filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.Sort sort, FilterTag filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param sort
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.Sort sort, ListModel.TVShowFilter filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(String... properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Sort sort, String... properties) {
      super();
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param sort
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("sort", sort);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(FilterGenreId filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, FilterGenreId filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(FilterGenre filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, FilterGenre filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(FilterYear filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, FilterYear filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(FilterActor filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, FilterActor filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(FilterStudio filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, FilterStudio filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(FilterTag filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, FilterTag filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.TVShowFilter filter, String... properties) {
      super();
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    /**
     * Retrieve all tv shows.
     * 
     * @param limits
     * @param filter
     * @param properties
     *          One or more of: <tt>title</tt>, <tt>genre</tt>, <tt>year</tt>, <tt>rating</tt>, <tt>plot</tt>, <tt>studio</tt>, <tt>mpaa</tt>,
     *          <tt>cast</tt>, <tt>playcount</tt>, <tt>episode</tt>, <tt>imdbnumber</tt>, <tt>premiered</tt>, <tt>votes</tt>, <tt>lastplayed</tt>,
     *          <tt>fanart</tt>, <tt>thumbnail</tt>, <tt>file</tt>, <tt>originaltitle</tt>, <tt>sorttitle</tt>, <tt>episodeguide</tt>, <tt>season</tt>
     *          , <tt>watchedepisodes</tt>, <tt>dateadded</tt>, <tt>tag</tt>, <tt>art</tt>, <tt>userrating</tt>. See constants at
     *          {@link VideoModel.TVShowFields}.
     */
    public GetTVShows(ListModel.Limits limits, ListModel.TVShowFilter filter, String... properties) {
      super();
      addParameter("limits", limits);
      addParameter("filter", filter);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<VideoModel.TVShowDetail> parseMany(JsonNode node) {
      final ArrayNode tvshows = parseResults(node, RESULT);
      if (tvshows != null) {
        final ArrayList<VideoModel.TVShowDetail> ret = new ArrayList<VideoModel.TVShowDetail>(tvshows.size());
        for (int i = 0; i < tvshows.size(); i++) {
          final ObjectNode item = (ObjectNode) tvshows.get(i);
          ret.add(new VideoModel.TVShowDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<VideoModel.TVShowDetail>(0);
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
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterGenreId extends AbstractModel {

      // field names
      public static final String GENREID = "genreid";

      // class members
      public final Integer       genreid;

      /**
       * @param genreid
       */
      public FilterGenreId(Integer genreid) {
        this.genreid = genreid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENREID, genreid);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterGenre extends AbstractModel {

      // field names
      public static final String GENRE = "genre";

      // class members
      public final String        genre;

      /**
       * @param genre
       */
      public FilterGenre(String genre) {
        this.genre = genre;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENRE, genre);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterYear extends AbstractModel {

      // field names
      public static final String YEAR = "year";

      // class members
      public final Integer       year;

      /**
       * @param year
       */
      public FilterYear(Integer year) {
        this.year = year;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(YEAR, year);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterActor extends AbstractModel {

      // field names
      public static final String ACTOR = "actor";

      // class members
      public final String        actor;

      /**
       * @param actor
       */
      public FilterActor(String actor) {
        this.actor = actor;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(ACTOR, actor);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterStudio extends AbstractModel {

      // field names
      public static final String STUDIO = "studio";

      // class members
      public final String        studio;

      /**
       * @param studio
       */
      public FilterStudio(String studio) {
        this.studio = studio;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(STUDIO, studio);
        return node;
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class FilterTag extends AbstractModel {

      // field names
      public static final String TAG = "tag";

      // class members
      public final String        tag;

      /**
       * @param tag
       */
      public FilterTag(String tag) {
        this.tag = tag;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(TAG, tag);
        return node;
      }
    }
  }

  /**
   * Refresh the given episode in the library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.RefreshEpisode</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RefreshEpisode extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.RefreshEpisode";

    /**
     * Refresh the given episode in the library.
     * 
     * @param episodeid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshEpisode(Integer episodeid, Boolean ignorenfo, String title) {
      super();
      addParameter("episodeid", episodeid);
      addParameter("ignorenfo", ignorenfo);
      addParameter("title", title);
    }

    /**
     * Refresh the given episode in the library.
     * 
     * @param episodeid
     */
    public RefreshEpisode(Integer episodeid) {
      super();
      addParameter("episodeid", episodeid);
    }

    /**
     * Refresh the given episode in the library.
     * 
     * @param episodeid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     */
    public RefreshEpisode(Integer episodeid, Boolean ignorenfo) {
      super();
      addParameter("episodeid", episodeid);
      addParameter("ignorenfo", ignorenfo);
    }

    /**
     * Refresh the given episode in the library.
     * 
     * @param episodeid
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshEpisode(Integer episodeid, String title) {
      super();
      addParameter("episodeid", episodeid);
      addParameter("title", title);
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
   * Refresh the given movie in the library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.RefreshMovie</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RefreshMovie extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.RefreshMovie";

    /**
     * Refresh the given movie in the library.
     * 
     * @param movieid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshMovie(Integer movieid, Boolean ignorenfo, String title) {
      super();
      addParameter("movieid", movieid);
      addParameter("ignorenfo", ignorenfo);
      addParameter("title", title);
    }

    /**
     * Refresh the given movie in the library.
     * 
     * @param movieid
     */
    public RefreshMovie(Integer movieid) {
      super();
      addParameter("movieid", movieid);
    }

    /**
     * Refresh the given movie in the library.
     * 
     * @param movieid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     */
    public RefreshMovie(Integer movieid, Boolean ignorenfo) {
      super();
      addParameter("movieid", movieid);
      addParameter("ignorenfo", ignorenfo);
    }

    /**
     * Refresh the given movie in the library.
     * 
     * @param movieid
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshMovie(Integer movieid, String title) {
      super();
      addParameter("movieid", movieid);
      addParameter("title", title);
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
   * Refresh the given music video in the library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.RefreshMusicVideo</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RefreshMusicVideo extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.RefreshMusicVideo";

    /**
     * Refresh the given music video in the library.
     * 
     * @param musicvideoid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshMusicVideo(Integer musicvideoid, Boolean ignorenfo, String title) {
      super();
      addParameter("musicvideoid", musicvideoid);
      addParameter("ignorenfo", ignorenfo);
      addParameter("title", title);
    }

    /**
     * Refresh the given music video in the library.
     * 
     * @param musicvideoid
     */
    public RefreshMusicVideo(Integer musicvideoid) {
      super();
      addParameter("musicvideoid", musicvideoid);
    }

    /**
     * Refresh the given music video in the library.
     * 
     * @param musicvideoid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     */
    public RefreshMusicVideo(Integer musicvideoid, Boolean ignorenfo) {
      super();
      addParameter("musicvideoid", musicvideoid);
      addParameter("ignorenfo", ignorenfo);
    }

    /**
     * Refresh the given music video in the library.
     * 
     * @param musicvideoid
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshMusicVideo(Integer musicvideoid, String title) {
      super();
      addParameter("musicvideoid", musicvideoid);
      addParameter("title", title);
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
   * Refresh the given tv show in the library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.RefreshTVShow</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RefreshTVShow extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.RefreshTVShow";

    /**
     * Refresh the given tv show in the library.
     * 
     * @param tvshowid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     * @param refreshepisodes
     *          Whether or not to refresh all episodes belonging to the TV show.
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshTVShow(Integer tvshowid, Boolean ignorenfo, Boolean refreshepisodes, String title) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("ignorenfo", ignorenfo);
      addParameter("refreshepisodes", refreshepisodes);
      addParameter("title", title);
    }

    /**
     * Refresh the given tv show in the library.
     * 
     * @param tvshowid
     */
    public RefreshTVShow(Integer tvshowid) {
      super();
      addParameter("tvshowid", tvshowid);
    }

    /**
     * Refresh the given tv show in the library.
     * 
     * @param tvshowid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     */
    public RefreshTVShow(Integer tvshowid, Boolean ignorenfo) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("ignorenfo", ignorenfo);
    }

    /**
     * Refresh the given tv show in the library.
     * 
     * @param tvshowid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     * @param refreshepisodes
     *          Whether or not to refresh all episodes belonging to the TV show.
     */
    public RefreshTVShow(Integer tvshowid, Boolean ignorenfo, Boolean refreshepisodes) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("ignorenfo", ignorenfo);
      addParameter("refreshepisodes", refreshepisodes);
    }

    /**
     * Refresh the given tv show in the library.
     * 
     * @param tvshowid
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshTVShow(Integer tvshowid, String title) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("title", title);
    }

    /**
     * Refresh the given tv show in the library.
     * 
     * @param tvshowid
     * @param ignorenfo
     *          Whether or not to ignore a local NFO if present.
     * @param title
     *          Title to use for searching (instead of determining it from the item's filename/path).
     */
    public RefreshTVShow(Integer tvshowid, Boolean ignorenfo, String title) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("ignorenfo", ignorenfo);
      addParameter("title", title);
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
   * Removes the given episode from the library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.RemoveEpisode</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RemoveEpisode extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.RemoveEpisode";

    /**
     * Removes the given episode from the library.
     * 
     * @param episodeid
     */
    public RemoveEpisode(Integer episodeid) {
      super();
      addParameter("episodeid", episodeid);
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
   * Removes the given movie from the library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.RemoveMovie</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RemoveMovie extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.RemoveMovie";

    /**
     * Removes the given movie from the library.
     * 
     * @param movieid
     */
    public RemoveMovie(Integer movieid) {
      super();
      addParameter("movieid", movieid);
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
   * Removes the given music video from the library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.RemoveMusicVideo</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RemoveMusicVideo extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.RemoveMusicVideo";

    /**
     * Removes the given music video from the library.
     * 
     * @param musicvideoid
     */
    public RemoveMusicVideo(Integer musicvideoid) {
      super();
      addParameter("musicvideoid", musicvideoid);
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
   * Removes the given tv show from the library.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.RemoveTVShow</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class RemoveTVShow extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.RemoveTVShow";

    /**
     * Removes the given tv show from the library.
     * 
     * @param tvshowid
     */
    public RemoveTVShow(Integer tvshowid) {
      super();
      addParameter("tvshowid", tvshowid);
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
   * Scans the video sources for new library items.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.Scan</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Scan extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.Scan";

    /**
     * Scans the video sources for new library items.
     * 
     * @param directory
     * @param showdialogs
     *          Whether or not to show the progress bar or any other GUI dialog.
     */
    public Scan(String directory, Boolean showdialogs) {
      super();
      addParameter("directory", directory);
      addParameter("showdialogs", showdialogs);
    }

    /**
     * Scans the video sources for new library items.
     */
    public Scan() {
      super();
    }

    /**
     * Scans the video sources for new library items.
     * 
     * @param directory
     */
    public Scan(String directory) {
      super();
      addParameter("directory", directory);
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
   * Update the given episode with the given details.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.SetEpisodeDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetEpisodeDetails extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.SetEpisodeDetails";

    /**
     * Update the given episode with the given details.
     * 
     * @param episodeid
     * @param title
     * @param playcount
     * @param runtime
     *          Runtime in seconds.
     * @param director
     * @param plot
     * @param rating
     * @param votes
     * @param lastplayed
     * @param writer
     * @param firstaired
     * @param productioncode
     * @param season
     * @param episode
     * @param originaltitle
     * @param thumbnail
     * @param fanart
     * @param art
     * @param resume
     * @param userrating
     */
    public SetEpisodeDetails(Integer episodeid, String title, Integer playcount, Integer runtime, String[] director, String plot, Double rating,
        String votes, String lastplayed, String[] writer, String firstaired, String productioncode, Integer season, Integer episode,
        String originaltitle, String thumbnail, String fanart, MediaModel.ArtworkSet art, VideoModel.Resume resume, Integer userrating) {
      super();
      addParameter("episodeid", episodeid);
      addParameter("title", title);
      addParameter("playcount", playcount);
      addParameter("runtime", runtime);
      addParameter("director", director);
      addParameter("plot", plot);
      addParameter("rating", rating);
      addParameter("votes", votes);
      addParameter("lastplayed", lastplayed);
      addParameter("writer", writer);
      addParameter("firstaired", firstaired);
      addParameter("productioncode", productioncode);
      addParameter("season", season);
      addParameter("episode", episode);
      addParameter("originaltitle", originaltitle);
      addParameter("thumbnail", thumbnail);
      addParameter("fanart", fanart);
      addParameter("art", art);
      addParameter("resume", resume);
      addParameter("userrating", userrating);
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
   * Update the given movie with the given details.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.SetMovieDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetMovieDetails extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.SetMovieDetails";

    /**
     * Update the given movie with the given details.
     * 
     * @param movieid
     * @param title
     * @param playcount
     * @param runtime
     *          Runtime in seconds.
     * @param director
     * @param studio
     * @param year
     * @param plot
     * @param genre
     * @param rating
     * @param mpaa
     * @param imdbnumber
     * @param votes
     * @param lastplayed
     * @param originaltitle
     * @param trailer
     * @param tagline
     * @param plotoutline
     * @param writer
     * @param country
     * @param top250
     * @param sorttitle
     * @param set
     * @param showlink
     * @param thumbnail
     * @param fanart
     * @param tag
     * @param art
     * @param resume
     * @param userrating
     */
    public SetMovieDetails(Integer movieid, String title, Integer playcount, Integer runtime, String[] director, String[] studio, Integer year,
        String plot, String[] genre, Double rating, String mpaa, String imdbnumber, String votes, String lastplayed, String originaltitle,
        String trailer, String tagline, String plotoutline, String[] writer, String[] country, Integer top250, String sorttitle, String set,
        String[] showlink, String thumbnail, String fanart, String[] tag, MediaModel.ArtworkSet art, VideoModel.Resume resume, Integer userrating) {
      super();
      addParameter("movieid", movieid);
      addParameter("title", title);
      addParameter("playcount", playcount);
      addParameter("runtime", runtime);
      addParameter("director", director);
      addParameter("studio", studio);
      addParameter("year", year);
      addParameter("plot", plot);
      addParameter("genre", genre);
      addParameter("rating", rating);
      addParameter("mpaa", mpaa);
      addParameter("imdbnumber", imdbnumber);
      addParameter("votes", votes);
      addParameter("lastplayed", lastplayed);
      addParameter("originaltitle", originaltitle);
      addParameter("trailer", trailer);
      addParameter("tagline", tagline);
      addParameter("plotoutline", plotoutline);
      addParameter("writer", writer);
      addParameter("country", country);
      addParameter("top250", top250);
      addParameter("sorttitle", sorttitle);
      addParameter("set", set);
      addParameter("showlink", showlink);
      addParameter("thumbnail", thumbnail);
      addParameter("fanart", fanart);
      addParameter("tag", tag);
      addParameter("art", art);
      addParameter("resume", resume);
      addParameter("userrating", userrating);
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
   * Update the given movie set with the given details.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.SetMovieSetDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetMovieSetDetails extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.SetMovieSetDetails";

    /**
     * Update the given movie set with the given details.
     * 
     * @param setid
     * @param title
     * @param art
     */
    public SetMovieSetDetails(Integer setid, String title, MediaModel.ArtworkSet art) {
      super();
      addParameter("setid", setid);
      addParameter("title", title);
      addParameter("art", art);
    }

    /**
     * Update the given movie set with the given details.
     * 
     * @param setid
     */
    public SetMovieSetDetails(Integer setid) {
      super();
      addParameter("setid", setid);
    }

    /**
     * Update the given movie set with the given details.
     * 
     * @param setid
     * @param title
     */
    public SetMovieSetDetails(Integer setid, String title) {
      super();
      addParameter("setid", setid);
      addParameter("title", title);
    }

    /**
     * Update the given movie set with the given details.
     * 
     * @param setid
     * @param art
     */
    public SetMovieSetDetails(Integer setid, MediaModel.ArtworkSet art) {
      super();
      addParameter("setid", setid);
      addParameter("art", art);
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
   * Update the given music video with the given details.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.SetMusicVideoDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetMusicVideoDetails extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.SetMusicVideoDetails";

    /**
     * Update the given music video with the given details.
     * 
     * @param musicvideoid
     * @param title
     * @param playcount
     * @param runtime
     *          Runtime in seconds.
     * @param director
     * @param studio
     * @param year
     * @param plot
     * @param album
     * @param artist
     * @param genre
     * @param track
     * @param lastplayed
     * @param thumbnail
     * @param fanart
     * @param tag
     * @param art
     * @param resume
     * @param userrating
     */
    public SetMusicVideoDetails(Integer musicvideoid, String title, Integer playcount, Integer runtime, String[] director, String[] studio,
        Integer year, String plot, String album, String[] artist, String[] genre, Integer track, String lastplayed, String thumbnail, String fanart,
        String[] tag, MediaModel.ArtworkSet art, VideoModel.Resume resume, Integer userrating) {
      super();
      addParameter("musicvideoid", musicvideoid);
      addParameter("title", title);
      addParameter("playcount", playcount);
      addParameter("runtime", runtime);
      addParameter("director", director);
      addParameter("studio", studio);
      addParameter("year", year);
      addParameter("plot", plot);
      addParameter("album", album);
      addParameter("artist", artist);
      addParameter("genre", genre);
      addParameter("track", track);
      addParameter("lastplayed", lastplayed);
      addParameter("thumbnail", thumbnail);
      addParameter("fanart", fanart);
      addParameter("tag", tag);
      addParameter("art", art);
      addParameter("resume", resume);
      addParameter("userrating", userrating);
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
   * Update the given season with the given details.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.SetSeasonDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetSeasonDetails extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.SetSeasonDetails";

    /**
     * Update the given season with the given details.
     * 
     * @param seasonid
     * @param art
     */
    public SetSeasonDetails(Integer seasonid, MediaModel.ArtworkSet art) {
      super();
      addParameter("seasonid", seasonid);
      addParameter("art", art);
    }

    /**
     * Update the given season with the given details.
     * 
     * @param seasonid
     */
    public SetSeasonDetails(Integer seasonid) {
      super();
      addParameter("seasonid", seasonid);
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
   * Update the given tvshow with the given details.
   * <p/>
   * This class represents the API method <tt>VideoLibrary.SetTVShowDetails</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetTVShowDetails extends AbstractCall<String> {
    public final static String API_TYPE = "VideoLibrary.SetTVShowDetails";

    /**
     * Update the given tvshow with the given details.
     * 
     * @param tvshowid
     * @param title
     * @param playcount
     * @param studio
     * @param plot
     * @param genre
     * @param rating
     * @param mpaa
     * @param imdbnumber
     * @param premiered
     * @param votes
     * @param lastplayed
     * @param originaltitle
     * @param sorttitle
     * @param episodeguide
     * @param thumbnail
     * @param fanart
     * @param tag
     * @param art
     * @param userrating
     */
    public SetTVShowDetails(Integer tvshowid, String title, Integer playcount, String[] studio, String plot, String[] genre, Double rating,
        String mpaa, String imdbnumber, String premiered, String votes, String lastplayed, String originaltitle, String sorttitle,
        String episodeguide, String thumbnail, String fanart, String[] tag, MediaModel.ArtworkSet art, Integer userrating) {
      super();
      addParameter("tvshowid", tvshowid);
      addParameter("title", title);
      addParameter("playcount", playcount);
      addParameter("studio", studio);
      addParameter("plot", plot);
      addParameter("genre", genre);
      addParameter("rating", rating);
      addParameter("mpaa", mpaa);
      addParameter("imdbnumber", imdbnumber);
      addParameter("premiered", premiered);
      addParameter("votes", votes);
      addParameter("lastplayed", lastplayed);
      addParameter("originaltitle", originaltitle);
      addParameter("sorttitle", sorttitle);
      addParameter("episodeguide", episodeguide);
      addParameter("thumbnail", thumbnail);
      addParameter("fanart", fanart);
      addParameter("tag", tag);
      addParameter("art", art);
      addParameter("userrating", userrating);
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
