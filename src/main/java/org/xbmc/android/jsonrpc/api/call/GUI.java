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
import java.util.HashSet;
import java.util.Set;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.model.GUIModel;
import org.xbmc.android.jsonrpc.api.model.GlobalModel;

public final class GUI {

	/**
	 * Activates the given window.
	 * <p/>
	 * This class represents the API method <tt>GUI.ActivateWindow</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ActivateWindow extends AbstractCall<String> {
		public final static String API_TYPE = "GUI.ActivateWindow";

		/**
		 * Activates the given window.
		 * @param window  One of: <tt>home</tt>, <tt>programs</tt>, <tt>pictures</tt>, <tt>filemanager</tt>, <tt>files</tt>, <tt>settings</tt>, <tt>music</tt>, <tt>video</tt>, <tt>videos</tt>, <tt>pvr</tt>, <tt>tvchannels</tt>, <tt>tvrecordings</tt>, <tt>tvguide</tt>, <tt>tvtimers</tt>, <tt>tvsearch</tt>, <tt>radiochannels</tt>, <tt>radiorecordings</tt>, <tt>radioguide</tt>, <tt>radiotimers</tt>, <tt>radiosearch</tt>, <tt>pvrguideinfo</tt>, <tt>pvrrecordinginfo</tt>, <tt>pvrradiordsinfo</tt>, <tt>pvrtimersetting</tt>, <tt>pvrgroupmanager</tt>, <tt>pvrchannelmanager</tt>, <tt>pvrguidesearch</tt>, <tt>pvrchannelscan</tt>, <tt>pvrupdateprogress</tt>, <tt>pvrosdchannels</tt>, <tt>pvrosdguide</tt>, <tt>pvrosdteletext</tt>, <tt>systeminfo</tt>, <tt>testpattern</tt>, <tt>screencalibration</tt>, <tt>guicalibration</tt>, <tt>picturessettings</tt>, <tt>programssettings</tt>, <tt>weathersettings</tt>, <tt>musicsettings</tt>, <tt>systemsettings</tt>, <tt>videossettings</tt>, <tt>networksettings</tt>, <tt>servicesettings</tt>, <tt>appearancesettings</tt>, <tt>pvrsettings</tt>, <tt>tvsettings</tt>, <tt>scripts</tt>, <tt>videofiles</tt>, <tt>videolibrary</tt>, <tt>videoplaylist</tt>, <tt>loginscreen</tt>, <tt>profiles</tt>, <tt>skinsettings</tt>, <tt>addonbrowser</tt>, <tt>yesnodialog</tt>, <tt>progressdialog</tt>, <tt>virtualkeyboard</tt>, <tt>volumebar</tt>, <tt>submenu</tt>, <tt>favourites</tt>, <tt>contextmenu</tt>, <tt>infodialog</tt>, <tt>numericinput</tt>, <tt>gamepadinput</tt>, <tt>shutdownmenu</tt>, <tt>mutebug</tt>, <tt>playercontrols</tt>, <tt>seekbar</tt>, <tt>musicosd</tt>, <tt>addonsettings</tt>, <tt>visualisationsettings</tt>, <tt>visualisationpresetlist</tt>, <tt>osdvideosettings</tt>, <tt>osdaudiosettings</tt>, <tt>audiodspmanager</tt>, <tt>osdaudiodspsettings</tt>, <tt>videobookmarks</tt>, <tt>filebrowser</tt>, <tt>networksetup</tt>, <tt>mediasource</tt>, <tt>profilesettings</tt>, <tt>locksettings</tt>, <tt>contentsettings</tt>, <tt>songinformation</tt>, <tt>smartplaylisteditor</tt>, <tt>smartplaylistrule</tt>, <tt>busydialog</tt>, <tt>pictureinfo</tt>, <tt>accesspoints</tt>, <tt>fullscreeninfo</tt>, <tt>sliderdialog</tt>, <tt>addoninformation</tt>, <tt>subtitlesearch</tt>, <tt>musicplaylist</tt>, <tt>musicfiles</tt>, <tt>musiclibrary</tt>, <tt>musicplaylisteditor</tt>, <tt>teletext</tt>, <tt>selectdialog</tt>, <tt>musicinformation</tt>, <tt>okdialog</tt>, <tt>movieinformation</tt>, <tt>textviewer</tt>, <tt>fullscreenvideo</tt>, <tt>fullscreenlivetv</tt>, <tt>fullscreenradio</tt>, <tt>visualisation</tt>, <tt>slideshow</tt>, <tt>weather</tt>, <tt>screensaver</tt>, <tt>videoosd</tt>, <tt>videomenu</tt>, <tt>videotimeseek</tt>, <tt>startwindow</tt>, <tt>startup</tt>, <tt>peripheralsettings</tt>, <tt>extendedprogressdialog</tt>, <tt>mediafilter</tt>, <tt>addon</tt>, <tt>eventlog</tt>. See constants at {@link GUIModel.Window}.
		 * @param parameters 
		 */
		public ActivateWindow(String window, String... parameters) {
			super();
			addParameter("window", window);
			addParameter("parameters", parameters);
		}

		/**
		 * Activates the given window.
		 * @param window  One of: <tt>home</tt>, <tt>programs</tt>, <tt>pictures</tt>, <tt>filemanager</tt>, <tt>files</tt>, <tt>settings</tt>, <tt>music</tt>, <tt>video</tt>, <tt>videos</tt>, <tt>pvr</tt>, <tt>tvchannels</tt>, <tt>tvrecordings</tt>, <tt>tvguide</tt>, <tt>tvtimers</tt>, <tt>tvsearch</tt>, <tt>radiochannels</tt>, <tt>radiorecordings</tt>, <tt>radioguide</tt>, <tt>radiotimers</tt>, <tt>radiosearch</tt>, <tt>pvrguideinfo</tt>, <tt>pvrrecordinginfo</tt>, <tt>pvrradiordsinfo</tt>, <tt>pvrtimersetting</tt>, <tt>pvrgroupmanager</tt>, <tt>pvrchannelmanager</tt>, <tt>pvrguidesearch</tt>, <tt>pvrchannelscan</tt>, <tt>pvrupdateprogress</tt>, <tt>pvrosdchannels</tt>, <tt>pvrosdguide</tt>, <tt>pvrosdteletext</tt>, <tt>systeminfo</tt>, <tt>testpattern</tt>, <tt>screencalibration</tt>, <tt>guicalibration</tt>, <tt>picturessettings</tt>, <tt>programssettings</tt>, <tt>weathersettings</tt>, <tt>musicsettings</tt>, <tt>systemsettings</tt>, <tt>videossettings</tt>, <tt>networksettings</tt>, <tt>servicesettings</tt>, <tt>appearancesettings</tt>, <tt>pvrsettings</tt>, <tt>tvsettings</tt>, <tt>scripts</tt>, <tt>videofiles</tt>, <tt>videolibrary</tt>, <tt>videoplaylist</tt>, <tt>loginscreen</tt>, <tt>profiles</tt>, <tt>skinsettings</tt>, <tt>addonbrowser</tt>, <tt>yesnodialog</tt>, <tt>progressdialog</tt>, <tt>virtualkeyboard</tt>, <tt>volumebar</tt>, <tt>submenu</tt>, <tt>favourites</tt>, <tt>contextmenu</tt>, <tt>infodialog</tt>, <tt>numericinput</tt>, <tt>gamepadinput</tt>, <tt>shutdownmenu</tt>, <tt>mutebug</tt>, <tt>playercontrols</tt>, <tt>seekbar</tt>, <tt>musicosd</tt>, <tt>addonsettings</tt>, <tt>visualisationsettings</tt>, <tt>visualisationpresetlist</tt>, <tt>osdvideosettings</tt>, <tt>osdaudiosettings</tt>, <tt>audiodspmanager</tt>, <tt>osdaudiodspsettings</tt>, <tt>videobookmarks</tt>, <tt>filebrowser</tt>, <tt>networksetup</tt>, <tt>mediasource</tt>, <tt>profilesettings</tt>, <tt>locksettings</tt>, <tt>contentsettings</tt>, <tt>songinformation</tt>, <tt>smartplaylisteditor</tt>, <tt>smartplaylistrule</tt>, <tt>busydialog</tt>, <tt>pictureinfo</tt>, <tt>accesspoints</tt>, <tt>fullscreeninfo</tt>, <tt>sliderdialog</tt>, <tt>addoninformation</tt>, <tt>subtitlesearch</tt>, <tt>musicplaylist</tt>, <tt>musicfiles</tt>, <tt>musiclibrary</tt>, <tt>musicplaylisteditor</tt>, <tt>teletext</tt>, <tt>selectdialog</tt>, <tt>musicinformation</tt>, <tt>okdialog</tt>, <tt>movieinformation</tt>, <tt>textviewer</tt>, <tt>fullscreenvideo</tt>, <tt>fullscreenlivetv</tt>, <tt>fullscreenradio</tt>, <tt>visualisation</tt>, <tt>slideshow</tt>, <tt>weather</tt>, <tt>screensaver</tt>, <tt>videoosd</tt>, <tt>videomenu</tt>, <tt>videotimeseek</tt>, <tt>startwindow</tt>, <tt>startup</tt>, <tt>peripheralsettings</tt>, <tt>extendedprogressdialog</tt>, <tt>mediafilter</tt>, <tt>addon</tt>, <tt>eventlog</tt>. See constants at {@link GUIModel.Window}.
		 */
		public ActivateWindow(String window) {
			super();
			addParameter("window", window);
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
	 * This class represents the API method <tt>GUI.GetProperties</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProperties extends AbstractCall<GUIModel.PropertyValue> {
		public final static String API_TYPE = "GUI.GetProperties";

		/**
		 * Retrieves the values of the given properties.
		 * @param properties  One or more of: <tt>currentwindow</tt>, <tt>currentcontrol</tt>, <tt>skin</tt>, <tt>fullscreen</tt>, <tt>stereoscopicmode</tt>. See constants at {@link GUIModel.PropertyName}.
		 */
		public GetProperties(String... properties) {
			super();
			addParameter("properties", properties);
		}

		@Override
		protected GUIModel.PropertyValue parseOne(JsonNode node) {
			return new GUIModel.PropertyValue(node);
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
	 * Returns the supported stereoscopic modes of the GUI.
	 * <p/>
	 * This class represents the API method <tt>GUI.GetStereoscopicModes</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetStereoscopicModes extends AbstractCall<GUIModel.StereoscopyMode> {
		public final static String API_TYPE = "GUI.GetStereoscopicModes";
		public final static String RESULT = "stereoscopicmodes";

		/**
		 * Returns the supported stereoscopic modes of the GUI.
		 */
		public GetStereoscopicModes() {
			super();
		}

		@Override
		protected ArrayList<GUIModel.StereoscopyMode> parseMany(JsonNode node) {
			final ArrayNode stereoscopicmodes = parseResults(node, RESULT);
			if (stereoscopicmodes != null) {
				final ArrayList<GUIModel.StereoscopyMode> ret = new ArrayList<GUIModel.StereoscopyMode>(stereoscopicmodes.size());
				for (int i = 0; i < stereoscopicmodes.size(); i++) {
					final ObjectNode item = (ObjectNode)stereoscopicmodes.get(i);
					ret.add(new GUIModel.StereoscopyMode(item));
				}
				return ret;
			} else {
				return new ArrayList<GUIModel.StereoscopyMode>(0);
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
	 * Toggle fullscreen/GUI.
	 * <p/>
	 * This class represents the API method <tt>GUI.SetFullscreen</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetFullscreen extends AbstractCall<Boolean> {
		public final static String API_TYPE = "GUI.SetFullscreen";

		/**
		 * Toggle fullscreen/GUI.
		 * @param fullscreen 
		 */
		public SetFullscreen(GlobalModel.Toggle fullscreen) {
			super();
			addParameter("fullscreen", fullscreen);
		}

		@Override
		protected Boolean parseOne(JsonNode node) {
			return node.getBooleanValue();
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
	 * Sets the stereoscopic mode of the GUI to the given mode.
	 * <p/>
	 * This class represents the API method <tt>GUI.SetStereoscopicMode</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetStereoscopicMode extends AbstractCall<String> {
		public final static String API_TYPE = "GUI.SetStereoscopicMode";

		/**
		 * Sets the stereoscopic mode of the GUI to the given mode.
		 * @param mode  One of: <tt>toggle</tt>, <tt>tomono</tt>, <tt>next</tt>, <tt>previous</tt>, <tt>select</tt>, <tt>off</tt>, <tt>split_vertical</tt>, <tt>split_horizontal</tt>, <tt>row_interleaved</tt>, <tt>hardware_based</tt>, <tt>anaglyph_cyan_red</tt>, <tt>anaglyph_green_magenta</tt>, <tt>monoscopic</tt>. See constants at {@link GUI.SetStereoscopicMode.Mode}.
		 */
		public SetStereoscopicMode(String mode) {
			super();
			addParameter("mode", mode);
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
		 * API Name: <tt>mode</tt>
		 */
		public interface Mode {

			public final String TOGGLE = "toggle";
			public final String TOMONO = "tomono";
			public final String NEXT = "next";
			public final String PREVIOUS = "previous";
			public final String SELECT = "select";
			public final String OFF = "off";
			public final String SPLIT_VERTICAL = "split_vertical";
			public final String SPLIT_HORIZONTAL = "split_horizontal";
			public final String ROW_INTERLEAVED = "row_interleaved";
			public final String HARDWARE_BASED = "hardware_based";
			public final String ANAGLYPH_CYAN_RED = "anaglyph_cyan_red";
			public final String ANAGLYPH_GREEN_MAGENTA = "anaglyph_green_magenta";
			public final String MONOSCOPIC = "monoscopic";

			public final static Set<String> values = new HashSet<String>(Arrays.asList(TOGGLE, TOMONO, NEXT, PREVIOUS, SELECT, OFF, SPLIT_VERTICAL, SPLIT_HORIZONTAL, ROW_INTERLEAVED, HARDWARE_BASED, ANAGLYPH_CYAN_RED, ANAGLYPH_GREEN_MAGENTA, MONOSCOPIC));
		}
	}

	/**
	 * Shows a GUI notification.
	 * <p/>
	 * This class represents the API method <tt>GUI.ShowNotification</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class ShowNotification extends AbstractCall<String> {
		public final static String API_TYPE = "GUI.ShowNotification";

		/**
		 * Shows a GUI notification.
		 * @param title 
		 * @param message 
		 * @param image 
		 * @param displaytime The time in milliseconds the notification will be visible.
		 */
		public ShowNotification(String title, String message, String image, Integer displaytime) {
			super();
			addParameter("title", title);
			addParameter("message", message);
			addParameter("image", image);
			addParameter("displaytime", displaytime);
		}

		/**
		 * Shows a GUI notification.
		 * @param title 
		 * @param message 
		 */
		public ShowNotification(String title, String message) {
			super();
			addParameter("title", title);
			addParameter("message", message);
		}

		/**
		 * Shows a GUI notification.
		 * @param title 
		 * @param message 
		 * @param image 
		 */
		public ShowNotification(String title, String message, String image) {
			super();
			addParameter("title", title);
			addParameter("message", message);
			addParameter("image", image);
		}

		/**
		 * Shows a GUI notification.
		 * @param title 
		 * @param message 
		 * @param displaytime The time in milliseconds the notification will be visible.
		 */
		public ShowNotification(String title, String message, Integer displaytime) {
			super();
			addParameter("title", title);
			addParameter("message", message);
			addParameter("displaytime", displaytime);
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
