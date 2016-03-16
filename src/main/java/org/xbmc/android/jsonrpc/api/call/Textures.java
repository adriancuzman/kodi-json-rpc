/*
 *      Copyright (C) 2005-2016 Team XBMC
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
import java.util.List;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractCall;
import org.xbmc.android.jsonrpc.api.model.ListModel;
import org.xbmc.android.jsonrpc.api.model.TexturesModel;

public final class Textures {

	/**
	 * Retrieve all textures.
	 * <p/>
	 * This class represents the API method <tt>Textures.GetTextures</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class GetTextures extends AbstractCall<TexturesModel.TextureDetail> {
		public final static String API_TYPE = "Textures.GetTextures";
		public final static String RESULT = "textures";

		/**
		 * Retrieve all textures.
		 * @param filter 
		 * @param properties  One or more of: <tt>url</tt>, <tt>cachedurl</tt>, <tt>lasthashcheck</tt>, <tt>imagehash</tt>, <tt>sizes</tt>. See constants at {@link TexturesModel.TextureFields}.
		 */
		public GetTextures(ListModel.TextureFilter filter, String... properties) {
			super();
			addParameter("filter", filter);
			addParameter("properties", properties);
		}

		@Override
		protected ArrayList<TexturesModel.TextureDetail> parseMany(JsonNode node) {
			final ArrayNode textures = parseResults(node, RESULT);
			if (textures != null) {
				final ArrayList<TexturesModel.TextureDetail> ret = new ArrayList<TexturesModel.TextureDetail>(textures.size());
				for (int i = 0; i < textures.size(); i++) {
					final ObjectNode item = (ObjectNode)textures.get(i);
					ret.add(new TexturesModel.TextureDetail(item));
				}
				return ret;
			} else {
				return new ArrayList<TexturesModel.TextureDetail>(0);
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
	 * Remove the specified texture.
	 * <p/>
	 * This class represents the API method <tt>Textures.RemoveTexture</tt>
	 * <p/>
	 * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
	 */
	public static class RemoveTexture extends AbstractCall<String> {
		public final static String API_TYPE = "Textures.RemoveTexture";

		/**
		 * Remove the specified texture.
		 * @param textureid Texture database identifier.
		 */
		public RemoveTexture(Integer textureid) {
			super();
			addParameter("textureid", textureid);
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
