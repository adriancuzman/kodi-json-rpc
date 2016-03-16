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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class NotificationsModel {

	/**
	 * API Name: <tt>Notifications.Item</tt>
	 * <p/>
	 * Note: Seems this class isn't used yet in the API.<br/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Item extends AbstractModel {
		public final static String API_TYPE = "Notifications.Item";

		// class members
		public final FileType fileType;
		public final IdTitleChanneltypeType idTitleChanneltypeType;
		public final IdType idType;
		public final TitleAlbumArtistType titleAlbumArtistType;
		public final TitleAlbumTrackArtistType titleAlbumTrackArtistType;
		public final TitleEpisodeSeasonTypeShowtitle titleEpisodeSeasonTypeShowtitle;
		public final TitleYearType titleYearType;
		public final Type type;

		/**
		 * @param fileType
		 */
		public Item(FileType fileType) {
			this.fileType = fileType;
			this.idTitleChanneltypeType = null;
			this.idType = null;
			this.titleAlbumArtistType = null;
			this.titleAlbumTrackArtistType = null;
			this.titleEpisodeSeasonTypeShowtitle = null;
			this.titleYearType = null;
			this.type = null;
		}

		/**
		 * @param idTitleChanneltypeType
		 */
		public Item(IdTitleChanneltypeType idTitleChanneltypeType) {
			this.idTitleChanneltypeType = idTitleChanneltypeType;
			this.fileType = null;
			this.idType = null;
			this.titleAlbumArtistType = null;
			this.titleAlbumTrackArtistType = null;
			this.titleEpisodeSeasonTypeShowtitle = null;
			this.titleYearType = null;
			this.type = null;
		}

		/**
		 * @param idType
		 */
		public Item(IdType idType) {
			this.idType = idType;
			this.fileType = null;
			this.idTitleChanneltypeType = null;
			this.titleAlbumArtistType = null;
			this.titleAlbumTrackArtistType = null;
			this.titleEpisodeSeasonTypeShowtitle = null;
			this.titleYearType = null;
			this.type = null;
		}

		/**
		 * @param titleAlbumArtistType
		 */
		public Item(TitleAlbumArtistType titleAlbumArtistType) {
			this.titleAlbumArtistType = titleAlbumArtistType;
			this.fileType = null;
			this.idTitleChanneltypeType = null;
			this.idType = null;
			this.titleAlbumTrackArtistType = null;
			this.titleEpisodeSeasonTypeShowtitle = null;
			this.titleYearType = null;
			this.type = null;
		}

		/**
		 * @param titleAlbumTrackArtistType
		 */
		public Item(TitleAlbumTrackArtistType titleAlbumTrackArtistType) {
			this.titleAlbumTrackArtistType = titleAlbumTrackArtistType;
			this.fileType = null;
			this.idTitleChanneltypeType = null;
			this.idType = null;
			this.titleAlbumArtistType = null;
			this.titleEpisodeSeasonTypeShowtitle = null;
			this.titleYearType = null;
			this.type = null;
		}

		/**
		 * @param titleEpisodeSeasonTypeShowtitle
		 */
		public Item(TitleEpisodeSeasonTypeShowtitle titleEpisodeSeasonTypeShowtitle) {
			this.titleEpisodeSeasonTypeShowtitle = titleEpisodeSeasonTypeShowtitle;
			this.fileType = null;
			this.idTitleChanneltypeType = null;
			this.idType = null;
			this.titleAlbumArtistType = null;
			this.titleAlbumTrackArtistType = null;
			this.titleYearType = null;
			this.type = null;
		}

		/**
		 * @param titleYearType
		 */
		public Item(TitleYearType titleYearType) {
			this.titleYearType = titleYearType;
			this.fileType = null;
			this.idTitleChanneltypeType = null;
			this.idType = null;
			this.titleAlbumArtistType = null;
			this.titleAlbumTrackArtistType = null;
			this.titleEpisodeSeasonTypeShowtitle = null;
			this.type = null;
		}

		/**
		 * @param type
		 */
		public Item(Type type) {
			this.type = type;
			this.fileType = null;
			this.idTitleChanneltypeType = null;
			this.idType = null;
			this.titleAlbumArtistType = null;
			this.titleAlbumTrackArtistType = null;
			this.titleEpisodeSeasonTypeShowtitle = null;
			this.titleYearType = null;
		}

		@Override
		public JsonNode toJsonNode() {
			if (fileType != null) {
				return fileType.toJsonNode();
			}
			if (idTitleChanneltypeType != null) {
				return idTitleChanneltypeType.toJsonNode();
			}
			if (idType != null) {
				return idType.toJsonNode();
			}
			if (titleAlbumArtistType != null) {
				return titleAlbumArtistType.toJsonNode();
			}
			if (titleAlbumTrackArtistType != null) {
				return titleAlbumTrackArtistType.toJsonNode();
			}
			if (titleEpisodeSeasonTypeShowtitle != null) {
				return titleEpisodeSeasonTypeShowtitle.toJsonNode();
			}
			if (titleYearType != null) {
				return titleYearType.toJsonNode();
			}
			if (type != null) {
				return type.toJsonNode();
			}
			return null; // this is completely excluded. theoretically.
		}

		/**
		 * An unknown item does not have any additional information.
		 * <p/>
		 * Note: Seems this class isn't used yet in the API.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class Type extends AbstractModel {

			// field names
			public static final String TYPE = "type";

			// class members
			public final String type;

			/**
			 * An unknown item does not have any additional information.
			 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link NotificationsModel.Type.TypeValue}.
			 */
			public Type(String type) {
				this.type = type;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * API Name: <tt>type</tt>
			 */
			public interface TypeValue {

				public final String UNKNOWN = "unknown";
				public final String MOVIE = "movie";
				public final String EPISODE = "episode";
				public final String MUSICVIDEO = "musicvideo";
				public final String SONG = "song";
				public final String PICTURE = "picture";
				public final String CHANNEL = "channel";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
			}
		}

		/**
		 * An item known to the database has an identification.
		 * <p/>
		 * Note: Seems this class isn't used yet in the API.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class IdType extends AbstractModel {

			// field names
			public static final String ID = "id";
			public static final String TYPE = "type";

			// class members
			public final Integer id;
			public final String type;

			/**
			 * An item known to the database has an identification.
			 * @param id
			 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link NotificationsModel.IdType.Type}.
			 */
			public IdType(Integer id, String type) {
				this.id = id;
				this.type = type;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(ID, id);
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * API Name: <tt>type</tt>
			 */
			public interface Type {

				public final String UNKNOWN = "unknown";
				public final String MOVIE = "movie";
				public final String EPISODE = "episode";
				public final String MUSICVIDEO = "musicvideo";
				public final String SONG = "song";
				public final String PICTURE = "picture";
				public final String CHANNEL = "channel";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
			}
		}

		/**
		 * A movie item has a title and may have a release year.
		 * <p/>
		 * Note: Seems this class isn't used yet in the API.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class TitleYearType extends AbstractModel {

			// field names
			public static final String TITLE = "title";
			public static final String TYPE = "type";
			public static final String YEAR = "year";

			// class members
			public final String title;
			public final String type;
			public final Integer year;

			/**
			 * A movie item has a title and may have a release year.
			 * @param title
			 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link NotificationsModel.TitleYearType.Type}.
			 * @param year
			 */
			public TitleYearType(String title, String type, Integer year) {
				this.title = title;
				this.type = type;
				this.year = year;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(TITLE, title);
				node.put(TYPE, type); // enum
				node.put(YEAR, year);
				return node;
			}
			
			/**
			 * API Name: <tt>type</tt>
			 */
			public interface Type {

				public final String UNKNOWN = "unknown";
				public final String MOVIE = "movie";
				public final String EPISODE = "episode";
				public final String MUSICVIDEO = "musicvideo";
				public final String SONG = "song";
				public final String PICTURE = "picture";
				public final String CHANNEL = "channel";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
			}
		}

		/**
		 * A tv episode has a title and may have an episode number, season number and the title of the show it belongs to.
		 * <p/>
		 * Note: Seems this class isn't used yet in the API.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class TitleEpisodeSeasonTypeShowtitle extends AbstractModel {

			// field names
			public static final String EPISODE = "episode";
			public static final String SEASON = "season";
			public static final String SHOWTITLE = "showtitle";
			public static final String TITLE = "title";
			public static final String TYPE = "type";

			// class members
			public final Integer episode;
			public final Integer season;
			public final String showtitle;
			public final String title;
			public final String type;

			/**
			 * A tv episode has a title and may have an episode number, season number and the title of the show it belongs to.
			 * @param episode
			 * @param season
			 * @param showtitle
			 * @param title
			 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link NotificationsModel.TitleEpisodeSeasonTypeShowtitle.Type}.
			 */
			public TitleEpisodeSeasonTypeShowtitle(Integer episode, Integer season, String showtitle, String title, String type) {
				this.episode = episode;
				this.season = season;
				this.showtitle = showtitle;
				this.title = title;
				this.type = type;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(EPISODE, episode);
				node.put(SEASON, season);
				node.put(SHOWTITLE, showtitle);
				node.put(TITLE, title);
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * API Name: <tt>type</tt>
			 */
			public interface Type {

				public final String UNKNOWN = "unknown";
				public final String MOVIE = "movie";
				public final String EPISODE = "episode";
				public final String MUSICVIDEO = "musicvideo";
				public final String SONG = "song";
				public final String PICTURE = "picture";
				public final String CHANNEL = "channel";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
			}
		}

		/**
		 * A music video has a title and may have an album and an artist.
		 * <p/>
		 * Note: Seems this class isn't used yet in the API.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class TitleAlbumArtistType extends AbstractModel {

			// field names
			public static final String ALBUM = "album";
			public static final String ARTIST = "artist";
			public static final String TITLE = "title";
			public static final String TYPE = "type";

			// class members
			public final String album;
			public final String artist;
			public final String title;
			public final String type;

			/**
			 * A music video has a title and may have an album and an artist.
			 * @param album
			 * @param artist
			 * @param title
			 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link NotificationsModel.TitleAlbumArtistType.Type}.
			 */
			public TitleAlbumArtistType(String album, String artist, String title, String type) {
				this.album = album;
				this.artist = artist;
				this.title = title;
				this.type = type;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(ALBUM, album);
				node.put(ARTIST, artist);
				node.put(TITLE, title);
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * API Name: <tt>type</tt>
			 */
			public interface Type {

				public final String UNKNOWN = "unknown";
				public final String MOVIE = "movie";
				public final String EPISODE = "episode";
				public final String MUSICVIDEO = "musicvideo";
				public final String SONG = "song";
				public final String PICTURE = "picture";
				public final String CHANNEL = "channel";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
			}
		}

		/**
		 * A song has a title and may have an album, an artist and a track number.
		 * <p/>
		 * Note: Seems this class isn't used yet in the API.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class TitleAlbumTrackArtistType extends AbstractModel {

			// field names
			public static final String ALBUM = "album";
			public static final String ARTIST = "artist";
			public static final String TITLE = "title";
			public static final String TRACK = "track";
			public static final String TYPE = "type";

			// class members
			public final String album;
			public final String artist;
			public final String title;
			public final Integer track;
			public final String type;

			/**
			 * A song has a title and may have an album, an artist and a track number.
			 * @param album
			 * @param artist
			 * @param title
			 * @param track
			 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link NotificationsModel.TitleAlbumTrackArtistType.Type}.
			 */
			public TitleAlbumTrackArtistType(String album, String artist, String title, Integer track, String type) {
				this.album = album;
				this.artist = artist;
				this.title = title;
				this.track = track;
				this.type = type;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(ALBUM, album);
				node.put(ARTIST, artist);
				node.put(TITLE, title);
				node.put(TRACK, track);
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * API Name: <tt>type</tt>
			 */
			public interface Type {

				public final String UNKNOWN = "unknown";
				public final String MOVIE = "movie";
				public final String EPISODE = "episode";
				public final String MUSICVIDEO = "musicvideo";
				public final String SONG = "song";
				public final String PICTURE = "picture";
				public final String CHANNEL = "channel";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
			}
		}

		/**
		 * A picture has a file path.
		 * <p/>
		 * Note: Seems this class isn't used yet in the API.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class FileType extends AbstractModel {

			// field names
			public static final String FILE = "file";
			public static final String TYPE = "type";

			// class members
			public final String file;
			public final String type;

			/**
			 * A picture has a file path.
			 * @param file
			 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link NotificationsModel.FileType.Type}.
			 */
			public FileType(String file, String type) {
				this.file = file;
				this.type = type;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(FILE, file);
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * API Name: <tt>type</tt>
			 */
			public interface Type {

				public final String UNKNOWN = "unknown";
				public final String MOVIE = "movie";
				public final String EPISODE = "episode";
				public final String MUSICVIDEO = "musicvideo";
				public final String SONG = "song";
				public final String PICTURE = "picture";
				public final String CHANNEL = "channel";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
			}
		}

		/**
		 * A PVR channel is either a radio or tv channel and has a title.
		 * <p/>
		 * Note: Seems this class isn't used yet in the API.<br/>
		 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
		 */
		public static class IdTitleChanneltypeType extends AbstractModel {

			// field names
			public static final String CHANNELTYPE = "channeltype";
			public static final String ID = "id";
			public static final String TITLE = "title";
			public static final String TYPE = "type";

			// class members
			public final String channeltype;
			public final Integer id;
			public final String title;
			public final String type;

			/**
			 * A PVR channel is either a radio or tv channel and has a title.
			 * @param channeltype One of: <tt>tv</tt>, <tt>radio</tt>. See constants at {@link NotificationsModel.IdTitleChanneltypeType.Channeltype}.
			 * @param id
			 * @param title
			 * @param type One of: <tt>unknown</tt>, <tt>movie</tt>, <tt>episode</tt>, <tt>musicvideo</tt>, <tt>song</tt>, <tt>picture</tt>, <tt>channel</tt>. See constants at {@link NotificationsModel.IdTitleChanneltypeType.Type}.
			 */
			public IdTitleChanneltypeType(String channeltype, Integer id, String title, String type) {
				this.channeltype = channeltype;
				this.id = id;
				this.title = title;
				this.type = type;
			}

			@Override
			public JsonNode toJsonNode() {
				final ObjectNode node = OM.createObjectNode();
				node.put(CHANNELTYPE, channeltype); // enum
				node.put(ID, id);
				node.put(TITLE, title);
				node.put(TYPE, type); // enum
				return node;
			}

			/**
			 * API Name: <tt>channeltype</tt>
			 */
			public interface Channeltype {

				public final String TV = "tv";
				public final String RADIO = "radio";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(TV, RADIO));
			}

			/**
			 * API Name: <tt>type</tt>
			 */
			public interface Type {

				public final String UNKNOWN = "unknown";
				public final String MOVIE = "movie";
				public final String EPISODE = "episode";
				public final String MUSICVIDEO = "musicvideo";
				public final String SONG = "song";
				public final String PICTURE = "picture";
				public final String CHANNEL = "channel";

				public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
			}
		}
	}

	/**
	 * API Name: <tt>Notifications.Item.Type</tt>
	 */
	public interface ItemType {

		public final String UNKNOWN = "unknown";
		public final String MOVIE = "movie";
		public final String EPISODE = "episode";
		public final String MUSICVIDEO = "musicvideo";
		public final String SONG = "song";
		public final String PICTURE = "picture";
		public final String CHANNEL = "channel";

		public final static Set<String> values = new HashSet<String>(Arrays.asList(UNKNOWN, MOVIE, EPISODE, MUSICVIDEO, SONG, PICTURE, CHANNEL));
	}
}
