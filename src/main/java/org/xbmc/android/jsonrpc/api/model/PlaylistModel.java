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
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class PlaylistModel {

  /**
   * API Name: <tt>Playlist.Item</tt>
   * <p/>
   * Note: This class is used as parameter only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Item extends AbstractModel {
    public final static String           API_TYPE = "Playlist.Item";

    // class members
    public final Albumid                 albumid;
    public final Artistid                artistid;
    public final Episodeid               episodeid;
    public final File                    file;
    public final Genreid                 genreid;
    public final Movieid                 movieid;
    public final Musicvideoid            musicvideoid;
    public final RecursiveDirectoryMedia recursiveDirectoryMedia;
    public final Songid                  songid;

    /**
     * @param albumid
     */
    public Item(Albumid albumid) {
      this.albumid = albumid;
      this.artistid = null;
      this.episodeid = null;
      this.file = null;
      this.genreid = null;
      this.movieid = null;
      this.musicvideoid = null;
      this.recursiveDirectoryMedia = null;
      this.songid = null;
    }

    /**
     * @param artistid
     */
    public Item(Artistid artistid) {
      this.artistid = artistid;
      this.albumid = null;
      this.episodeid = null;
      this.file = null;
      this.genreid = null;
      this.movieid = null;
      this.musicvideoid = null;
      this.recursiveDirectoryMedia = null;
      this.songid = null;
    }

    /**
     * @param episodeid
     */
    public Item(Episodeid episodeid) {
      this.episodeid = episodeid;
      this.albumid = null;
      this.artistid = null;
      this.file = null;
      this.genreid = null;
      this.movieid = null;
      this.musicvideoid = null;
      this.recursiveDirectoryMedia = null;
      this.songid = null;
    }

    /**
     * @param file
     */
    public Item(File file) {
      this.file = file;
      this.albumid = null;
      this.artistid = null;
      this.episodeid = null;
      this.genreid = null;
      this.movieid = null;
      this.musicvideoid = null;
      this.recursiveDirectoryMedia = null;
      this.songid = null;
    }

    /**
     * @param genreid
     */
    public Item(Genreid genreid) {
      this.genreid = genreid;
      this.albumid = null;
      this.artistid = null;
      this.episodeid = null;
      this.file = null;
      this.movieid = null;
      this.musicvideoid = null;
      this.recursiveDirectoryMedia = null;
      this.songid = null;
    }

    /**
     * @param movieid
     */
    public Item(Movieid movieid) {
      this.movieid = movieid;
      this.albumid = null;
      this.artistid = null;
      this.episodeid = null;
      this.file = null;
      this.genreid = null;
      this.musicvideoid = null;
      this.recursiveDirectoryMedia = null;
      this.songid = null;
    }

    /**
     * @param musicvideoid
     */
    public Item(Musicvideoid musicvideoid) {
      this.musicvideoid = musicvideoid;
      this.albumid = null;
      this.artistid = null;
      this.episodeid = null;
      this.file = null;
      this.genreid = null;
      this.movieid = null;
      this.recursiveDirectoryMedia = null;
      this.songid = null;
    }

    /**
     * @param recursiveDirectoryMedia
     */
    public Item(RecursiveDirectoryMedia recursiveDirectoryMedia) {
      this.recursiveDirectoryMedia = recursiveDirectoryMedia;
      this.albumid = null;
      this.artistid = null;
      this.episodeid = null;
      this.file = null;
      this.genreid = null;
      this.movieid = null;
      this.musicvideoid = null;
      this.songid = null;
    }

    /**
     * @param songid
     */
    public Item(Songid songid) {
      this.songid = songid;
      this.albumid = null;
      this.artistid = null;
      this.episodeid = null;
      this.file = null;
      this.genreid = null;
      this.movieid = null;
      this.musicvideoid = null;
      this.recursiveDirectoryMedia = null;
    }

    @Override
    public JsonNode toJsonNode() {
      if (albumid != null) {
        return albumid.toJsonNode();
      }
      if (artistid != null) {
        return artistid.toJsonNode();
      }
      if (episodeid != null) {
        return episodeid.toJsonNode();
      }
      if (file != null) {
        return file.toJsonNode();
      }
      if (genreid != null) {
        return genreid.toJsonNode();
      }
      if (movieid != null) {
        return movieid.toJsonNode();
      }
      if (musicvideoid != null) {
        return musicvideoid.toJsonNode();
      }
      if (recursiveDirectoryMedia != null) {
        return recursiveDirectoryMedia.toJsonNode();
      }
      if (songid != null) {
        return songid.toJsonNode();
      }
      return null; // this is completely excluded. theoretically.
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class File extends AbstractModel {

      // field names
      public static final String FILE = "file";

      // class members
      public final String        file;

      /**
       * @param file
       */
      public File(String file) {
        this.file = file;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(FILE, file);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class RecursiveDirectoryMedia extends AbstractModel {

      // field names
      public static final String DIRECTORY = "directory";
      public static final String MEDIA     = "media";
      public static final String RECURSIVE = "recursive";

      // class members
      public final String        directory;
      public final String        media;
      public final Boolean       recursive;

      /**
       * @param directory
       * @param media
       *          One of: <tt>video</tt>, <tt>music</tt>, <tt>pictures</tt>, <tt>files</tt>, <tt>programs</tt>. See constants at
       *          {@link PlaylistModel.RecursiveDirectoryMedia.Media}.
       * @param recursive
       */
      public RecursiveDirectoryMedia(String directory, String media, Boolean recursive) {
        this.directory = directory;
        this.media = media;
        this.recursive = recursive;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(DIRECTORY, directory);
        node.put(MEDIA, media); // enum
        node.put(RECURSIVE, recursive);
        return node;
      }

      /**
       * API Name: <tt>media</tt>
       */
      public interface Media {

        public final String             VIDEO    = "video";
        public final String             MUSIC    = "music";
        public final String             PICTURES = "pictures";
        public final String             FILES    = "files";
        public final String             PROGRAMS = "programs";

        public final static Set<String> values   = new HashSet<String>(Arrays.asList(VIDEO, MUSIC, PICTURES, FILES, PROGRAMS));
      }
    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Movieid extends AbstractModel {

      // field names
      public static final String MOVIEID = "movieid";

      // class members
      public final Integer       movieid;

      /**
       * @param movieid
       */
      public Movieid(Integer movieid) {
        this.movieid = movieid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(MOVIEID, movieid);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Episodeid extends AbstractModel {

      // field names
      public static final String EPISODEID = "episodeid";

      // class members
      public final Integer       episodeid;

      /**
       * @param episodeid
       */
      public Episodeid(Integer episodeid) {
        this.episodeid = episodeid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(EPISODEID, episodeid);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Musicvideoid extends AbstractModel {

      // field names
      public static final String MUSICVIDEOID = "musicvideoid";

      // class members
      public final Integer       musicvideoid;

      /**
       * @param musicvideoid
       */
      public Musicvideoid(Integer musicvideoid) {
        this.musicvideoid = musicvideoid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(MUSICVIDEOID, musicvideoid);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Artistid extends AbstractModel {

      // field names
      public static final String ARTISTID = "artistid";

      // class members
      public final Integer       artistid;

      /**
       * @param artistid
       */
      public Artistid(Integer artistid) {
        this.artistid = artistid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(ARTISTID, artistid);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Albumid extends AbstractModel {

      // field names
      public static final String ALBUMID = "albumid";

      // class members
      public final Integer       albumid;

      /**
       * @param albumid
       */
      public Albumid(Integer albumid) {
        this.albumid = albumid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(ALBUMID, albumid);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Songid extends AbstractModel {

      // field names
      public static final String SONGID = "songid";

      // class members
      public final Integer       songid;

      /**
       * @param songid
       */
      public Songid(Integer songid) {
        this.songid = songid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(SONGID, songid);
        return node;
      }

    }

    /**
     * Note: This class is used as parameter only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Genreid extends AbstractModel {

      // field names
      public static final String GENREID = "genreid";

      // class members
      public final Integer       genreid;

      /**
       * @param genreid
       */
      public Genreid(Integer genreid) {
        this.genreid = genreid;
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(GENREID, genreid);
        return node;
      }

    }
  }

  /**
   * API Name: <tt>Playlist.Property.Value</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class PropertyValue extends AbstractModel {
    public final static String API_TYPE = "Playlist.Property.Value";

    // field names
    public static final String SIZE     = "size";
    public static final String TYPE     = "type";

    // class members
    public final Integer       size;
    public final String        type;

    /**
     * @param size
     * @param type
     *          One of: <tt>unknown</tt>, <tt>video</tt>, <tt>audio</tt>, <tt>picture</tt>, <tt>mixed</tt>. See constants at
     *          {@link PlaylistModel.PropertyValue.Type}.
     */
    public PropertyValue(Integer size, String type) {
      this.size = size;
      this.type = type;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a PropertyValue object
     */
    public PropertyValue(JsonNode node) {
      size = parseInt(node, SIZE);
      type = parseString(node, TYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(SIZE, size);
      node.put(TYPE, type); // enum
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
    static List<PropertyValue> getPlaylistModelPropertyValueList(JsonNode node, String key) {
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

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             UNKNOWN = "unknown";
      public final String             VIDEO   = "video";
      public final String             AUDIO   = "audio";
      public final String             PICTURE = "picture";
      public final String             MIXED   = "mixed";

      public final static Set<String> values  = new HashSet<String>(Arrays.asList(UNKNOWN, VIDEO, AUDIO, PICTURE, MIXED));
    }
  }

  /**
   * API Name: <tt>Playlist.Property.Name</tt>
   */
  public interface PropertyName {

    public final String             TYPE   = "type";
    public final String             SIZE   = "size";

    public final static Set<String> values = new HashSet<String>(Arrays.asList(TYPE, SIZE));
  }

  /**
   * API Name: <tt>Playlist.Type</tt>
   */
  public interface Type {

    public final String             UNKNOWN = "unknown";
    public final String             VIDEO   = "video";
    public final String             AUDIO   = "audio";
    public final String             PICTURE = "picture";
    public final String             MIXED   = "mixed";

    public final static Set<String> values  = new HashSet<String>(Arrays.asList(UNKNOWN, VIDEO, AUDIO, PICTURE, MIXED));
  }
}
