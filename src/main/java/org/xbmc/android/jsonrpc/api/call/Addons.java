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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.model.AddonModel;
import org.xbmc.android.jsonrpc.api.model.GlobalModel;
import org.xbmc.android.jsonrpc.api.model.ListModel;

public final class Addons {

	/**
	 * Executes the given addon with the given parameters (if possible).
	 * <p/>
	 * This class represents the API method <tt>Addons.ExecuteAddon</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ExecuteAddon extends AbstractCall<String> {
		public final static String API_TYPE = "Addons.ExecuteAddon";

		/**
		 * Executes the given addon with the given parameters (if possible).
		 * @param addonid 
		 * @param params 
		 * @param wait 
		 */
		public ExecuteAddon(String addonid, HashMap<String, String> params, Boolean wait) {
			super();
			addParameter("addonid", addonid);
			addParameter("params", params);
			addParameter("wait", wait);
		}

		/**
		 * Executes the given addon with the given parameters (if possible).
		 * @param addonid 
		 * @param params 
		 * @param wait 
		 */
		public ExecuteAddon(String addonid, String[] params, Boolean wait) {
			super();
			addParameter("addonid", addonid);
			addParameter("params", params);
			addParameter("wait", wait);
		}

		/**
		 * Executes the given addon with the given parameters (if possible).
		 * @param addonid 
		 * @param params URL path (must start with / or ?.
		 * @param wait 
		 */
		public ExecuteAddon(String addonid, String params, Boolean wait) {
			super();
			addParameter("addonid", addonid);
			addParameter("params", params);
			addParameter("wait", wait);
		}

		/**
		 * Executes the given addon with the given parameters (if possible).
		 * @param addonid 
		 */
		public ExecuteAddon(String addonid) {
			super();
			addParameter("addonid", addonid);
		}

		/**
		 * Executes the given addon with the given parameters (if possible).
		 * @param addonid 
		 * @param params 
		 */
		public ExecuteAddon(String addonid, HashMap<String, String> params) {
			super();
			addParameter("addonid", addonid);
			addParameter("params", params);
		}

		/**
		 * Executes the given addon with the given parameters (if possible).
		 * @param addonid 
		 * @param wait 
		 */
		public ExecuteAddon(String addonid, Boolean wait) {
			super();
			addParameter("addonid", addonid);
			addParameter("wait", wait);
		}

		/**
		 * Executes the given addon with the given parameters (if possible).
		 * @param addonid 
		 * @param params 
		 */
		public ExecuteAddon(String addonid, String... params) {
			super();
			addParameter("addonid", addonid);
			addParameter("params", params);
		}

		/**
		 * Executes the given addon with the given parameters (if possible).
		 * @param addonid 
		 * @param params URL path (must start with / or ?.
		 */
		public ExecuteAddon(String addonid, String params) {
			super();
			addParameter("addonid", addonid);
			addParameter("params", params);
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
	 * Gets the details of a specific addon.
	 * <p/>
	 * This class represents the API method <tt>Addons.GetAddonDetails</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetAddonDetails extends AbstractCall<AddonModel.Detail> {
		public final static String API_TYPE = "Addons.GetAddonDetails";

		public final static String RESULT = "addon";

		/**
		 * Gets the details of a specific addon.
		 * @param addonid 
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddonDetails(String addonid, String... properties) {
			super();
			addParameter("addonid", addonid);
			addParameter("properties", properties);
		}

		@Override
		protected AddonModel.Detail parseOne(JsonNode node) {
			return new AddonModel.Detail((ObjectNode)node.get(RESULT));
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
	 * Gets all available addons.
	 * <p/>
	 * This class represents the API method <tt>Addons.GetAddons</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetAddons extends AbstractCall<AddonModel.Detail> {
		public final static String API_TYPE = "Addons.GetAddons";

		public final static String RESULT = "addons";

		/**
		 * Gets all available addons.
		 * @param type  One of: <tt>unknown</tt>, <tt>xbmc.metadata.scraper.albums</tt>, <tt>xbmc.metadata.scraper.artists</tt>, <tt>xbmc.metadata.scraper.movies</tt>, <tt>xbmc.metadata.scraper.musicvideos</tt>, <tt>xbmc.metadata.scraper.tvshows</tt>, <tt>xbmc.ui.screensaver</tt>, <tt>xbmc.player.musicviz</tt>, <tt>xbmc.python.pluginsource</tt>, <tt>xbmc.python.script</tt>, <tt>xbmc.python.weather</tt>, <tt>xbmc.python.subtitles</tt>, <tt>xbmc.python.lyrics</tt>, <tt>xbmc.gui.skin</tt>, <tt>xbmc.gui.webinterface</tt>, <tt>xbmc.pvrclient</tt>, <tt>xbmc.addon.video</tt>, <tt>xbmc.addon.audio</tt>, <tt>xbmc.addon.image</tt>, <tt>xbmc.addon.executable</tt>, <tt>xbmc.service</tt>. See constants at {@link AddonModel.Types}.
		 * @param content Content provided by the addon. Only considered for plugins and scripts. One of: <tt>unknown</tt>, <tt>video</tt>, <tt>audio</tt>, <tt>image</tt>, <tt>executable</tt>. See constants at {@link AddonModel.Content}.
		 * @param enabled 
		 * @param limits 
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddons(String type, String content, Boolean enabled, ListModel.Limits limits, String... properties) {
			super();
			addParameter("type", type);
			addParameter("content", content);
			addParameter("enabled", enabled);
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		/**
		 * Gets all available addons.
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddons(String... properties) {
			super();
			addParameter("properties", properties);
		}

		/**
		 * Gets all available addons.
		 * @param type  One of: <tt>unknown</tt>, <tt>xbmc.player.musicviz</tt>, <tt>xbmc.gui.skin</tt>, <tt>xbmc.pvrclient</tt>, <tt>kodi.adsp</tt>, <tt>xbmc.python.script</tt>, <tt>xbmc.python.weather</tt>, <tt>xbmc.subtitle.module</tt>, <tt>xbmc.python.lyrics</tt>, <tt>xbmc.metadata.scraper.albums</tt>, <tt>xbmc.metadata.scraper.artists</tt>, <tt>xbmc.metadata.scraper.movies</tt>, <tt>xbmc.metadata.scraper.musicvideos</tt>, <tt>xbmc.metadata.scraper.tvshows</tt>, <tt>xbmc.ui.screensaver</tt>, <tt>xbmc.python.pluginsource</tt>, <tt>xbmc.addon.repository</tt>, <tt>xbmc.webinterface</tt>, <tt>xbmc.service</tt>, <tt>xbmc.audioencoder</tt>, <tt>kodi.context.item</tt>, <tt>kodi.audiodecoder</tt>, <tt>kodi.resource.images</tt>, <tt>kodi.resource.language</tt>, <tt>kodi.resource.uisounds</tt>, <tt>xbmc.addon.video</tt>, <tt>xbmc.addon.audio</tt>, <tt>xbmc.addon.image</tt>, <tt>xbmc.addon.executable</tt>, <tt>visualization-library</tt>, <tt>xbmc.metadata.scraper.library</tt>, <tt>xbmc.python.library</tt>, <tt>xbmc.python.module</tt>. See constants at {@link AddonModel.Types}.
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddons(String type, String... properties) {
			super();
			addParameter("type", type);
			addParameter("properties", properties);
		}

		/**
		 * Gets all available addons.
		 * @param type  One of: <tt>unknown</tt>, <tt>xbmc.player.musicviz</tt>, <tt>xbmc.gui.skin</tt>, <tt>xbmc.pvrclient</tt>, <tt>kodi.adsp</tt>, <tt>xbmc.python.script</tt>, <tt>xbmc.python.weather</tt>, <tt>xbmc.subtitle.module</tt>, <tt>xbmc.python.lyrics</tt>, <tt>xbmc.metadata.scraper.albums</tt>, <tt>xbmc.metadata.scraper.artists</tt>, <tt>xbmc.metadata.scraper.movies</tt>, <tt>xbmc.metadata.scraper.musicvideos</tt>, <tt>xbmc.metadata.scraper.tvshows</tt>, <tt>xbmc.ui.screensaver</tt>, <tt>xbmc.python.pluginsource</tt>, <tt>xbmc.addon.repository</tt>, <tt>xbmc.webinterface</tt>, <tt>xbmc.service</tt>, <tt>xbmc.audioencoder</tt>, <tt>kodi.context.item</tt>, <tt>kodi.audiodecoder</tt>, <tt>kodi.resource.images</tt>, <tt>kodi.resource.language</tt>, <tt>kodi.resource.uisounds</tt>, <tt>xbmc.addon.video</tt>, <tt>xbmc.addon.audio</tt>, <tt>xbmc.addon.image</tt>, <tt>xbmc.addon.executable</tt>, <tt>visualization-library</tt>, <tt>xbmc.metadata.scraper.library</tt>, <tt>xbmc.python.library</tt>, <tt>xbmc.python.module</tt>. See constants at {@link AddonModel.Types}.
		 * @param content Content provided by the addon. Only considered for plugins and scripts. One of: <tt>unknown</tt>, <tt>video</tt>, <tt>audio</tt>, <tt>image</tt>, <tt>executable</tt>. See constants at {@link AddonModel.Content}.
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddons(String type, String content, String... properties) {
			super();
			addParameter("type", type);
			addParameter("content", content);
			addParameter("properties", properties);
		}

		/**
		 * Gets all available addons.
		 * @param enabled 
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddons(Boolean enabled, String... properties) {
			super();
			addParameter("enabled", enabled);
			addParameter("properties", properties);
		}

		/**
		 * Gets all available addons.
		 * @param type  One of: <tt>unknown</tt>, <tt>xbmc.player.musicviz</tt>, <tt>xbmc.gui.skin</tt>, <tt>xbmc.pvrclient</tt>, <tt>kodi.adsp</tt>, <tt>xbmc.python.script</tt>, <tt>xbmc.python.weather</tt>, <tt>xbmc.subtitle.module</tt>, <tt>xbmc.python.lyrics</tt>, <tt>xbmc.metadata.scraper.albums</tt>, <tt>xbmc.metadata.scraper.artists</tt>, <tt>xbmc.metadata.scraper.movies</tt>, <tt>xbmc.metadata.scraper.musicvideos</tt>, <tt>xbmc.metadata.scraper.tvshows</tt>, <tt>xbmc.ui.screensaver</tt>, <tt>xbmc.python.pluginsource</tt>, <tt>xbmc.addon.repository</tt>, <tt>xbmc.webinterface</tt>, <tt>xbmc.service</tt>, <tt>xbmc.audioencoder</tt>, <tt>kodi.context.item</tt>, <tt>kodi.audiodecoder</tt>, <tt>kodi.resource.images</tt>, <tt>kodi.resource.language</tt>, <tt>kodi.resource.uisounds</tt>, <tt>xbmc.addon.video</tt>, <tt>xbmc.addon.audio</tt>, <tt>xbmc.addon.image</tt>, <tt>xbmc.addon.executable</tt>, <tt>visualization-library</tt>, <tt>xbmc.metadata.scraper.library</tt>, <tt>xbmc.python.library</tt>, <tt>xbmc.python.module</tt>. See constants at {@link AddonModel.Types}.
		 * @param content Content provided by the addon. Only considered for plugins and scripts. One of: <tt>unknown</tt>, <tt>video</tt>, <tt>audio</tt>, <tt>image</tt>, <tt>executable</tt>. See constants at {@link AddonModel.Content}.
		 * @param enabled 
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddons(String type, String content, Boolean enabled, String... properties) {
			super();
			addParameter("type", type);
			addParameter("content", content);
			addParameter("enabled", enabled);
			addParameter("properties", properties);
		}

		/**
		 * Gets all available addons.
		 * @param limits 
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddons(ListModel.Limits limits, String... properties) {
			super();
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		/**
		 * Gets all available addons.
		 * @param enabled 
		 * @param limits 
		 * @param properties  One or more of: <tt>name</tt>, <tt>version</tt>, <tt>summary</tt>, <tt>description</tt>, <tt>path</tt>, <tt>author</tt>, <tt>thumbnail</tt>, <tt>disclaimer</tt>, <tt>fanart</tt>, <tt>dependencies</tt>, <tt>broken</tt>, <tt>extrainfo</tt>, <tt>rating</tt>, <tt>enabled</tt>. See constants at {@link AddonModel.Fields}.
		 */
		public GetAddons(Boolean enabled, ListModel.Limits limits, String... properties) {
			super();
			addParameter("enabled", enabled);
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		@Override
		protected ArrayList<AddonModel.Detail> parseMany(JsonNode node) {
			final ArrayNode addons = parseResults(node, RESULT);
			if (addons != null) {
				final ArrayList<AddonModel.Detail> ret = new ArrayList<AddonModel.Detail>(addons.size());
				for (int i = 0; i < addons.size(); i++) {
					final ObjectNode item = (ObjectNode)addons.get(i);
					ret.add(new AddonModel.Detail(item));
				}
				return ret;
			} else {
				return new ArrayList<AddonModel.Detail>(0);
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
		 * API Name: <tt>enabled</tt>
		 */
		public interface Enabled {

			public final String ALL = "all";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(ALL));
		}
	}

	/**
	 * Enables/Disables a specific addon.
	 * <p/>
	 * This class represents the API method <tt>Addons.SetAddonEnabled</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetAddonEnabled extends AbstractCall<String> {
		public final static String API_TYPE = "Addons.SetAddonEnabled";

		/**
		 * Enables/Disables a specific addon.
		 * @param addonid 
		 * @param enabled 
		 */
		public SetAddonEnabled(String addonid, GlobalModel.Toggle enabled) {
			super();
			addParameter("addonid", addonid);
			addParameter("enabled", enabled);
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
