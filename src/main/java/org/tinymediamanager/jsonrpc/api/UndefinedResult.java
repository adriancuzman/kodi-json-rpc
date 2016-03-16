/*
 *      Copyright (C) 2005-2015 Team XBMC
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

package org.tinymediamanager.jsonrpc.api;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

/**
 * Some methods return undefined results, this is their response container.
 * <p/>
 * For v3, the methods returning undefined results are:
 * <ul>
 * <li><tt>JSONRPC.Introspect</tt></li>
 * <li><tt>XBMC.GetInfoBooleans</tt></li>
 * <li><tt>XBMC.GetInfoLabels</tt></li>
 * </ul>
 *
 * It's up to the application to correctly parse those response types, if necessary.
 *
 * @author freezy <freezy@xbmc.org>
 */
public class UndefinedResult {

  private final static String       TAG = UndefinedResult.class.getSimpleName();
  private final static ObjectMapper OM  = new ObjectMapper();

  private final JsonNode            mResponse;

  /**
   * Class constructor.
   * 
   * @param node
   *          Root node of the response object.
   */
  public UndefinedResult(JsonNode node) {
    mResponse = node;
  }

  /**
   * Returns the root response object.
   *
   * @return Root object of the response.
   */
  public JsonNode getResponse() {
    return mResponse;
  }

  /**
   * Returns the <tt>result</tt> node of the response object.
   * 
   * @return The <tt>result</tt> node of the response object.
   */
  public ObjectNode getResult() {
    return (ObjectNode) mResponse.get("result");
  }

}
