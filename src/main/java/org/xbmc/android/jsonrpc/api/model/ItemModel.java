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
import java.util.List;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.xbmc.android.jsonrpc.api.AbstractModel;

public final class ItemModel {

  /**
   * API Name: <tt>Item.Details.Base</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class BaseDetail extends AbstractModel {
    public final static String API_TYPE = "Item.Details.Base";

    // field names
    public static final String LABEL    = "label";

    // class members
    public final String        label;

    /**
     * @param label
     */
    public BaseDetail(String label) {
      this.label = label;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a BaseDetail object
     */
    public BaseDetail(JsonNode node) {
      label = node.get(LABEL).getTextValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(LABEL, label);
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
    static List<BaseDetail> getItemModelBaseDetailList(JsonNode node, String key) {
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
}
