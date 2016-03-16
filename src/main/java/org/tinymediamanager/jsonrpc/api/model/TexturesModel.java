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
package org.tinymediamanager.jsonrpc.api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.tinymediamanager.jsonrpc.api.AbstractModel;

public final class TexturesModel {

  /**
   * API Name: <tt>Textures.Details.Size</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SizeDetail extends AbstractModel {
    public final static String API_TYPE = "Textures.Details.Size";

    // field names
    public static final String HEIGHT   = "height";
    public static final String LASTUSED = "lastused";
    public static final String SIZE     = "size";
    public static final String USECOUNT = "usecount";
    public static final String WIDTH    = "width";

    // class members
    public final Integer       height;
    public final String        lastused;
    public final Integer       size;
    public final Integer       usecount;
    public final Integer       width;

    /**
     * @param height
     * @param lastused
     * @param size
     * @param usecount
     * @param width
     */
    public SizeDetail(Integer height, String lastused, Integer size, Integer usecount, Integer width) {
      this.height = height;
      this.lastused = lastused;
      this.size = size;
      this.usecount = usecount;
      this.width = width;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SizeDetail object
     */
    public SizeDetail(JsonNode node) {
      height = parseInt(node, HEIGHT);
      lastused = parseString(node, LASTUSED);
      size = parseInt(node, SIZE);
      usecount = parseInt(node, USECOUNT);
      width = parseInt(node, WIDTH);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(HEIGHT, height);
      node.put(LASTUSED, lastused);
      node.put(SIZE, size);
      node.put(USECOUNT, usecount);
      node.put(WIDTH, width);
      return node;
    }

    /**
     * Extracts a list of {@link SizeDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SizeDetail> getTexturesModelSizeDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SizeDetail> l = new ArrayList<SizeDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SizeDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SizeDetail>(0);
    }
  }

  /**
   * API Name: <tt>Textures.Details.Texture</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class TextureDetail extends AbstractModel {
    public final static String    API_TYPE      = "Textures.Details.Texture";

    // field names
    public static final String    CACHEDURL     = "cachedurl";
    public static final String    IMAGEHASH     = "imagehash";
    public static final String    LASTHASHCHECK = "lasthashcheck";
    public static final String    SIZES         = "sizes";
    public static final String    TEXTUREID     = "textureid";
    public static final String    URL           = "url";

    // class members
    public final String           cachedurl;
    public final String           imagehash;
    public final String           lasthashcheck;
    public final List<SizeDetail> sizes;
    public final Integer          textureid;
    public final String           url;

    /**
     * @param cachedurl
     * @param imagehash
     * @param lasthashcheck
     * @param sizes
     * @param textureid
     * @param url
     */
    public TextureDetail(String cachedurl, String imagehash, String lasthashcheck, List<SizeDetail> sizes, Integer textureid, String url) {
      this.cachedurl = cachedurl;
      this.imagehash = imagehash;
      this.lasthashcheck = lasthashcheck;
      this.sizes = sizes;
      this.textureid = textureid;
      this.url = url;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a TextureDetail object
     */
    public TextureDetail(JsonNode node) {
      cachedurl = parseString(node, CACHEDURL);
      imagehash = parseString(node, IMAGEHASH);
      lasthashcheck = parseString(node, LASTHASHCHECK);
      sizes = SizeDetail.getTexturesModelSizeDetailList(node, SIZES);
      textureid = parseInt(node, TEXTUREID);
      url = parseString(node, URL);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(CACHEDURL, cachedurl);
      node.put(IMAGEHASH, imagehash);
      node.put(LASTHASHCHECK, lasthashcheck);
      final ArrayNode sizesArray = OM.createArrayNode();
      for (SizeDetail item : sizes) {
        sizesArray.add(item.toJsonNode());
      }
      node.put(SIZES, sizesArray);
      node.put(TEXTUREID, textureid);
      node.put(URL, url);
      return node;
    }

    /**
     * Extracts a list of {@link TextureDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<TextureDetail> getTexturesModelTextureDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<TextureDetail> l = new ArrayList<TextureDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new TextureDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<TextureDetail>(0);
    }
  }

  /**
   * API Name: <tt>Textures.Fields.Texture</tt>
   */
  public interface TextureFields {

    public final String             URL           = "url";
    public final String             CACHEDURL     = "cachedurl";
    public final String             LASTHASHCHECK = "lasthashcheck";
    public final String             IMAGEHASH     = "imagehash";
    public final String             SIZES         = "sizes";

    public final static Set<String> values        = new HashSet<String>(Arrays.asList(URL, CACHEDURL, LASTHASHCHECK, IMAGEHASH, SIZES));
  }
}
