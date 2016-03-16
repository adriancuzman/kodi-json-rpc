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

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.model.ListModel;
import org.xbmc.android.jsonrpc.api.model.ProfilesModel;

public final class Profiles {

	/**
	 * Retrieve the current profile.
	 * <p/>
	 * This class represents the API method <tt>Profiles.GetCurrentProfile</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetCurrentProfile extends AbstractCall<ProfilesModel.ProfileDetail> {
		public final static String API_TYPE = "Profiles.GetCurrentProfile";

		/**
		 * Retrieve the current profile.
		 * @param properties  One or more of: <tt>thumbnail</tt>, <tt>lockmode</tt>. See constants at {@link ProfilesModel.ProfileFields}.
		 */
		public GetCurrentProfile(String... properties) {
			super();
			addParameter("properties", properties);
		}

		@Override
		protected ProfilesModel.ProfileDetail parseOne(JsonNode node) {
			return new ProfilesModel.ProfileDetail(node);
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
	 * Retrieve all profiles.
	 * <p/>
	 * This class represents the API method <tt>Profiles.GetProfiles</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetProfiles extends AbstractCall<ProfilesModel.ProfileDetail> {
		public final static String API_TYPE = "Profiles.GetProfiles";
		public final static String RESULT = "profiles";

		/**
		 * Retrieve all profiles.
		 * @param limits 
		 * @param sort 
		 * @param properties  One or more of: <tt>thumbnail</tt>, <tt>lockmode</tt>. See constants at {@link ProfilesModel.ProfileFields}.
		 */
		public GetProfiles(ListModel.Limits limits, ListModel.Sort sort, String... properties) {
			super();
			addParameter("limits", limits);
			addParameter("sort", sort);
			addParameter("properties", properties);
		}

		/**
		 * Retrieve all profiles.
		 * @param properties  One or more of: <tt>thumbnail</tt>, <tt>lockmode</tt>. See constants at {@link ProfilesModel.ProfileFields}.
		 */
		public GetProfiles(String... properties) {
			super();
			addParameter("properties", properties);
		}

		/**
		 * Retrieve all profiles.
		 * @param limits 
		 * @param properties  One or more of: <tt>thumbnail</tt>, <tt>lockmode</tt>. See constants at {@link ProfilesModel.ProfileFields}.
		 */
		public GetProfiles(ListModel.Limits limits, String... properties) {
			super();
			addParameter("limits", limits);
			addParameter("properties", properties);
		}

		@Override
		protected ArrayList<ProfilesModel.ProfileDetail> parseMany(JsonNode node) {
			final ArrayNode profiles = parseResults(node, RESULT);
			if (profiles != null) {
				final ArrayList<ProfilesModel.ProfileDetail> ret = new ArrayList<ProfilesModel.ProfileDetail>(profiles.size());
				for (int i = 0; i < profiles.size(); i++) {
					final ObjectNode item = (ObjectNode)profiles.get(i);
					ret.add(new ProfilesModel.ProfileDetail(item));
				}
				return ret;
			} else {
				return new ArrayList<ProfilesModel.ProfileDetail>(0);
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
	 * Load the specified profile.
	 * <p/>
	 * This class represents the API method <tt>Profiles.LoadProfile</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class LoadProfile extends AbstractCall<String> {
		public final static String API_TYPE = "Profiles.LoadProfile";

		/**
		 * Load the specified profile.
		 * @param profile Profile name.
		 * @param prompt Prompt for password.
		 * @param password 
		 */
		public LoadProfile(String profile, Boolean prompt, ProfilesModel.Password password) {
			super();
			addParameter("profile", profile);
			addParameter("prompt", prompt);
			addParameter("password", password);
		}

		/**
		 * Load the specified profile.
		 * @param profile Profile name.
		 */
		public LoadProfile(String profile) {
			super();
			addParameter("profile", profile);
		}

		/**
		 * Load the specified profile.
		 * @param profile Profile name.
		 * @param prompt Prompt for password.
		 */
		public LoadProfile(String profile, Boolean prompt) {
			super();
			addParameter("profile", profile);
			addParameter("prompt", prompt);
		}

		/**
		 * Load the specified profile.
		 * @param profile Profile name.
		 * @param password 
		 */
		public LoadProfile(String profile, ProfilesModel.Password password) {
			super();
			addParameter("profile", profile);
			addParameter("password", password);
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
