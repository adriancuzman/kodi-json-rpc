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

import org.codehaus.jackson.JsonNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.model.ApplicationModel;
import org.xbmc.android.jsonrpc.api.model.GlobalModel;

public final class Application {

	/**
	 * Retrieves the values of the given properties.
	 * <p/>
	 * This class represents the API method <tt>Application.GetProperties</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProperties extends AbstractCall<ApplicationModel.PropertyValue> {
		public final static String API_TYPE = "Application.GetProperties";

		/**
		 * Retrieves the values of the given properties.
		 * @param properties  One or more of: <tt>volume</tt>, <tt>muted</tt>, <tt>name</tt>, <tt>version</tt>. See constants at {@link ApplicationModel.PropertyName}.
		 */
		public GetProperties(String... properties) {
			super();
			addParameter("properties", properties);
		}

		@Override
		protected ApplicationModel.PropertyValue parseOne(JsonNode node) {
			return new ApplicationModel.PropertyValue(node);
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
	 * Quit application.
	 * <p/>
	 * This class represents the API method <tt>Application.Quit</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class Quit extends AbstractCall<String> {
		public final static String API_TYPE = "Application.Quit";

		/**
		 * Quit application.
		 */
		public Quit() {
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

	/**
	 * Toggle mute/unmute.
	 * <p/>
	 * This class represents the API method <tt>Application.SetMute</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetMute extends AbstractCall<Boolean> {
		public final static String API_TYPE = "Application.SetMute";

		/**
		 * Toggle mute/unmute.
		 * @param mute 
		 */
		public SetMute(GlobalModel.Toggle mute) {
			super();
			addParameter("mute", mute);
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
	 * Set the current volume.
	 * <p/>
	 * This class represents the API method <tt>Application.SetVolume</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class SetVolume extends AbstractCall<Integer> {
		public final static String API_TYPE = "Application.SetVolume";

		/**
		 * Set the current volume.
		 * @param volume 
		 */
		public SetVolume(Integer volume) {
			super();
			addParameter("volume", volume);
		}

		/**
		 * Set the current volume.
		 * @param volume  One of: <tt>increment</tt>, <tt>decrement</tt>. See constants at {@link GlobalModel.IncrementDecrement}.
		 */
		public SetVolume(String volume) {
			super();
			addParameter("volume", volume);
		}

		@Override
		protected Integer parseOne(JsonNode node) {
			return node.getIntValue();
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
