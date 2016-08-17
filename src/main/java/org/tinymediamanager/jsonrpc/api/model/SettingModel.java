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
import org.codehaus.jackson.node.BooleanNode;
import org.codehaus.jackson.node.DoubleNode;
import org.codehaus.jackson.node.IntNode;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.TextNode;
import org.tinymediamanager.jsonrpc.api.AbstractModel;

public final class SettingModel {

  /**
   * API Name: <tt>Setting.Details.Base</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class BaseDetail extends AbstractModel {
    public final static String API_TYPE = "Setting.Details.Base";

    // field names
    public static final String HELP     = "help";
    public static final String ID       = "id";
    public static final String LABEL    = "label";

    // class members
    public final String        help;
    public final String        id;
    public final String        label;

    /**
     * @param help
     * @param id
     * @param label
     */
    public BaseDetail(String help, String id, String label) {
      this.help = help;
      this.id = id;
      this.label = label;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a BaseDetail object
     */
    public BaseDetail(JsonNode node) {
      help = parseString(node, HELP);
      id = node.get(ID).getTextValue(); // required value
      label = node.get(LABEL).getTextValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(HELP, help);
      node.put(ID, id);
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
    static List<BaseDetail> getSettingModelBaseDetailList(JsonNode node, String key) {
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

  /**
   * API Name: <tt>Setting.Details.Category</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class CategoryDetail extends BaseDetail {
    public final static String     API_TYPE = "Setting.Details.Category";

    // field names
    public static final String     GROUPS   = "groups";

    // class members
    public final List<GroupDetail> groups;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a CategoryDetail object
     */
    public CategoryDetail(JsonNode node) {
      super(node);
      groups = GroupDetail.getSettingModelGroupDetailList(node, GROUPS);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode groupsArray = OM.createArrayNode();
      for (GroupDetail item : groups) {
        groupsArray.add(item.toJsonNode());
      }
      node.put(GROUPS, groupsArray);
      return node;
    }

    /**
     * Extracts a list of {@link CategoryDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<CategoryDetail> getSettingModelCategoryDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<CategoryDetail> l = new ArrayList<CategoryDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new CategoryDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<CategoryDetail>(0);
    }

  }

  /**
   * API Name: <tt>Setting.Details.Control</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlDetail extends AbstractModel {
    public final static String          API_TYPE = "Setting.Details.Control";

    // class members
    public final ControlButtonDetail    detailsControlButton;
    public final ControlCheckmarkDetail detailsControlCheckmark;
    public final ControlEditDetail      detailsControlEdit;
    public final ControlListDetail      detailsControlList;
    public final ControlRangeDetail     detailsControlRange;
    public final ControlSliderDetail    detailsControlSlider;
    public final ControlSpinnerDetail   detailsControlSpinner;

    /**
     * @param detailsControlButton
     */
    public ControlDetail(ControlButtonDetail detailsControlButton) {
      this.detailsControlButton = detailsControlButton;
      this.detailsControlCheckmark = null;
      this.detailsControlEdit = null;
      this.detailsControlList = null;
      this.detailsControlRange = null;
      this.detailsControlSlider = null;
      this.detailsControlSpinner = null;
    }

    /**
     * @param detailsControlCheckmark
     */
    public ControlDetail(ControlCheckmarkDetail detailsControlCheckmark) {
      this.detailsControlCheckmark = detailsControlCheckmark;
      this.detailsControlButton = null;
      this.detailsControlEdit = null;
      this.detailsControlList = null;
      this.detailsControlRange = null;
      this.detailsControlSlider = null;
      this.detailsControlSpinner = null;
    }

    /**
     * @param detailsControlEdit
     */
    public ControlDetail(ControlEditDetail detailsControlEdit) {
      this.detailsControlEdit = detailsControlEdit;
      this.detailsControlButton = null;
      this.detailsControlCheckmark = null;
      this.detailsControlList = null;
      this.detailsControlRange = null;
      this.detailsControlSlider = null;
      this.detailsControlSpinner = null;
    }

    /**
     * @param detailsControlList
     */
    public ControlDetail(ControlListDetail detailsControlList) {
      this.detailsControlList = detailsControlList;
      this.detailsControlButton = null;
      this.detailsControlCheckmark = null;
      this.detailsControlEdit = null;
      this.detailsControlRange = null;
      this.detailsControlSlider = null;
      this.detailsControlSpinner = null;
    }

    /**
     * @param detailsControlRange
     */
    public ControlDetail(ControlRangeDetail detailsControlRange) {
      this.detailsControlRange = detailsControlRange;
      this.detailsControlButton = null;
      this.detailsControlCheckmark = null;
      this.detailsControlEdit = null;
      this.detailsControlList = null;
      this.detailsControlSlider = null;
      this.detailsControlSpinner = null;
    }

    /**
     * @param detailsControlSlider
     */
    public ControlDetail(ControlSliderDetail detailsControlSlider) {
      this.detailsControlSlider = detailsControlSlider;
      this.detailsControlButton = null;
      this.detailsControlCheckmark = null;
      this.detailsControlEdit = null;
      this.detailsControlList = null;
      this.detailsControlRange = null;
      this.detailsControlSpinner = null;
    }

    /**
     * @param detailsControlSpinner
     */
    public ControlDetail(ControlSpinnerDetail detailsControlSpinner) {
      this.detailsControlSpinner = detailsControlSpinner;
      this.detailsControlButton = null;
      this.detailsControlCheckmark = null;
      this.detailsControlEdit = null;
      this.detailsControlList = null;
      this.detailsControlRange = null;
      this.detailsControlSlider = null;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlDetail object
     */
    public ControlDetail(JsonNode node) {
      if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsControlButton = null;
        detailsControlCheckmark = null;
        detailsControlEdit = null;
        detailsControlList = null;
        detailsControlRange = null;
        detailsControlSlider = null;
        detailsControlSpinner = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsControlButton = null;
        detailsControlCheckmark = null;
        detailsControlEdit = null;
        detailsControlList = null;
        detailsControlRange = null;
        detailsControlSlider = null;
        detailsControlSpinner = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsControlButton = null;
        detailsControlCheckmark = null;
        detailsControlEdit = null;
        detailsControlList = null;
        detailsControlRange = null;
        detailsControlSlider = null;
        detailsControlSpinner = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsControlButton = null;
        detailsControlCheckmark = null;
        detailsControlEdit = null;
        detailsControlList = null;
        detailsControlRange = null;
        detailsControlSlider = null;
        detailsControlSpinner = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsControlButton = null;
        detailsControlCheckmark = null;
        detailsControlEdit = null;
        detailsControlList = null;
        detailsControlRange = null;
        detailsControlSlider = null;
        detailsControlSpinner = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsControlButton = null;
        detailsControlCheckmark = null;
        detailsControlEdit = null;
        detailsControlList = null;
        detailsControlRange = null;
        detailsControlSlider = null;
        detailsControlSpinner = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsControlButton = null;
        detailsControlCheckmark = null;
        detailsControlEdit = null;
        detailsControlList = null;
        detailsControlRange = null;
        detailsControlSlider = null;
        detailsControlSpinner = null;
      }
      else {
        throw new RuntimeException("Weird type for \"Details.Control\", I'm confused!");
      }
    }

    @Override
    public JsonNode toJsonNode() {
      if (detailsControlButton != null) {
        return detailsControlButton.toJsonNode();
      }
      if (detailsControlCheckmark != null) {
        return detailsControlCheckmark.toJsonNode();
      }
      if (detailsControlEdit != null) {
        return detailsControlEdit.toJsonNode();
      }
      if (detailsControlList != null) {
        return detailsControlList.toJsonNode();
      }
      if (detailsControlRange != null) {
        return detailsControlRange.toJsonNode();
      }
      if (detailsControlSlider != null) {
        return detailsControlSlider.toJsonNode();
      }
      if (detailsControlSpinner != null) {
        return detailsControlSpinner.toJsonNode();
      }
      return null; // this is completely excluded. theoretically.
    }

    /**
     * Extracts a list of {@link ControlDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlDetail> getSettingModelControlDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlDetail> l = new ArrayList<ControlDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlDetail>(0);
    }

  }

  /**
   * API Name: <tt>Setting.Details.ControlBase</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlBaseDetail extends AbstractModel {
    public final static String API_TYPE = "Setting.Details.ControlBase";

    // field names
    public static final String DELAYED  = "delayed";
    public static final String FORMAT   = "format";
    public static final String TYPE     = "type";

    // class members
    public final Boolean       delayed;
    public final String        format;
    public final String        type;

    /**
     * @param delayed
     * @param format
     * @param type
     */
    public ControlBaseDetail(Boolean delayed, String format, String type) {
      this.delayed = delayed;
      this.format = format;
      this.type = type;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlBaseDetail object
     */
    public ControlBaseDetail(JsonNode node) {
      delayed = node.get(DELAYED).getBooleanValue(); // required value
      format = node.get(FORMAT).getTextValue(); // required value
      type = node.get(TYPE).getTextValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(DELAYED, delayed);
      node.put(FORMAT, format);
      node.put(TYPE, type);
      return node;
    }

    /**
     * Extracts a list of {@link ControlBaseDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlBaseDetail> getSettingModelControlBaseDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlBaseDetail> l = new ArrayList<ControlBaseDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlBaseDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlBaseDetail>(0);
    }

  }

  /**
   * API Name: <tt>Setting.Details.ControlButton</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlButtonDetail extends ControlHeadingDetail {
    public final static String API_TYPE = "Setting.Details.ControlButton";

    // field names
    public static final String TYPE     = "type";

    // class members
    public final String        type;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlButtonDetail object
     */
    public ControlButtonDetail(JsonNode node) {
      super(node);
      type = parseString(node, TYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(TYPE, type); // enum
      return node;
    }

    /**
     * Extracts a list of {@link ControlButtonDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlButtonDetail> getSettingModelControlButtonDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlButtonDetail> l = new ArrayList<ControlButtonDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlButtonDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlButtonDetail>(0);
    }

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             BUTTON = "button";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(BUTTON));
    }
  }

  /**
   * API Name: <tt>Setting.Details.ControlCheckmark</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlCheckmarkDetail extends ControlBaseDetail {
    public final static String API_TYPE = "Setting.Details.ControlCheckmark";

    // field names
    public static final String FORMAT   = "format";
    public static final String TYPE     = "type";

    // class members
    public final String        format;
    public final String        type;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlCheckmarkDetail object
     */
    public ControlCheckmarkDetail(JsonNode node) {
      super(node);
      format = parseString(node, FORMAT);
      type = parseString(node, TYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(FORMAT, format); // enum
      node.put(TYPE, type); // enum
      return node;
    }

    /**
     * Extracts a list of {@link ControlCheckmarkDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlCheckmarkDetail> getSettingModelControlCheckmarkDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlCheckmarkDetail> l = new ArrayList<ControlCheckmarkDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlCheckmarkDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlCheckmarkDetail>(0);
    }

    /**
     * API Name: <tt>format</tt>
     */
    public interface Format {

      public final String             BOOLEAN = "boolean";

      public final static Set<String> values  = new HashSet<String>(Arrays.asList(BOOLEAN));
    }

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             TOGGLE = "toggle";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(TOGGLE));
    }
  }

  /**
   * API Name: <tt>Setting.Details.ControlEdit</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlEditDetail extends ControlHeadingDetail {
    public final static String API_TYPE       = "Setting.Details.ControlEdit";

    // field names
    public static final String HIDDEN         = "hidden";
    public static final String TYPE           = "type";
    public static final String VERIFYNEWVALUE = "verifynewvalue";

    // class members
    public final Boolean       hidden;
    public final String        type;
    public final Boolean       verifynewvalue;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlEditDetail object
     */
    public ControlEditDetail(JsonNode node) {
      super(node);
      hidden = node.get(HIDDEN).getBooleanValue(); // required value
      type = parseString(node, TYPE);
      verifynewvalue = node.get(VERIFYNEWVALUE).getBooleanValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(HIDDEN, hidden);
      node.put(TYPE, type); // enum
      node.put(VERIFYNEWVALUE, verifynewvalue);
      return node;
    }

    /**
     * Extracts a list of {@link ControlEditDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlEditDetail> getSettingModelControlEditDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlEditDetail> l = new ArrayList<ControlEditDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlEditDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlEditDetail>(0);
    }

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             EDIT   = "edit";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(EDIT));
    }
  }

  /**
   * API Name: <tt>Setting.Details.ControlHeading</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlHeadingDetail extends ControlBaseDetail {
    public final static String API_TYPE = "Setting.Details.ControlHeading";

    // field names
    public static final String HEADING  = "heading";

    // class members
    public final String        heading;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlHeadingDetail object
     */
    public ControlHeadingDetail(JsonNode node) {
      super(node);
      heading = parseString(node, HEADING);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(HEADING, heading);
      return node;
    }

    /**
     * Extracts a list of {@link ControlHeadingDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlHeadingDetail> getSettingModelControlHeadingDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlHeadingDetail> l = new ArrayList<ControlHeadingDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlHeadingDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlHeadingDetail>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Details.ControlList</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlListDetail extends ControlHeadingDetail {
    public final static String API_TYPE    = "Setting.Details.ControlList";

    // field names
    public static final String MULTISELECT = "multiselect";
    public static final String TYPE        = "type";

    // class members
    public final Boolean       multiselect;
    public final String        type;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlListDetail object
     */
    public ControlListDetail(JsonNode node) {
      super(node);
      multiselect = node.get(MULTISELECT).getBooleanValue(); // required value
      type = parseString(node, TYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(MULTISELECT, multiselect);
      node.put(TYPE, type); // enum
      return node;
    }

    /**
     * Extracts a list of {@link ControlListDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlListDetail> getSettingModelControlListDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlListDetail> l = new ArrayList<ControlListDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlListDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlListDetail>(0);
    }

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             LIST   = "list";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(LIST));
    }
  }

  /**
   * API Name: <tt>Setting.Details.ControlRange</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlRangeDetail extends ControlBaseDetail {
    public final static String API_TYPE    = "Setting.Details.ControlRange";

    // field names
    public static final String FORMATLABEL = "formatlabel";
    public static final String FORMATVALUE = "formatvalue";
    public static final String TYPE        = "type";

    // class members
    public final String        formatlabel;
    public final String        formatvalue;
    public final String        type;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlRangeDetail object
     */
    public ControlRangeDetail(JsonNode node) {
      super(node);
      formatlabel = node.get(FORMATLABEL).getTextValue(); // required value
      formatvalue = node.get(FORMATVALUE).getTextValue(); // required value
      type = parseString(node, TYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(FORMATLABEL, formatlabel);
      node.put(FORMATVALUE, formatvalue);
      node.put(TYPE, type); // enum
      return node;
    }

    /**
     * Extracts a list of {@link ControlRangeDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlRangeDetail> getSettingModelControlRangeDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlRangeDetail> l = new ArrayList<ControlRangeDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlRangeDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlRangeDetail>(0);
    }

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             RANGE  = "range";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(RANGE));
    }
  }

  /**
   * API Name: <tt>Setting.Details.ControlSlider</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlSliderDetail extends ControlHeadingDetail {
    public final static String API_TYPE    = "Setting.Details.ControlSlider";

    // field names
    public static final String FORMATLABEL = "formatlabel";
    public static final String POPUP       = "popup";
    public static final String TYPE        = "type";

    // class members
    public final String        formatlabel;
    public final Boolean       popup;
    public final String        type;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlSliderDetail object
     */
    public ControlSliderDetail(JsonNode node) {
      super(node);
      formatlabel = node.get(FORMATLABEL).getTextValue(); // required value
      popup = node.get(POPUP).getBooleanValue(); // required value
      type = parseString(node, TYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(FORMATLABEL, formatlabel);
      node.put(POPUP, popup);
      node.put(TYPE, type); // enum
      return node;
    }

    /**
     * Extracts a list of {@link ControlSliderDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlSliderDetail> getSettingModelControlSliderDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlSliderDetail> l = new ArrayList<ControlSliderDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlSliderDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlSliderDetail>(0);
    }

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             SLIDER = "slider";

      public final static Set<String> values = new HashSet<String>(Arrays.asList(SLIDER));
    }
  }

  /**
   * API Name: <tt>Setting.Details.ControlSpinner</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ControlSpinnerDetail extends ControlBaseDetail {
    public final static String API_TYPE     = "Setting.Details.ControlSpinner";

    // field names
    public static final String FORMATLABEL  = "formatlabel";
    public static final String MINIMUMLABEL = "minimumlabel";
    public static final String TYPE         = "type";

    // class members
    public final String        formatlabel;
    public final String        minimumlabel;
    public final String        type;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ControlSpinnerDetail object
     */
    public ControlSpinnerDetail(JsonNode node) {
      super(node);
      formatlabel = parseString(node, FORMATLABEL);
      minimumlabel = parseString(node, MINIMUMLABEL);
      type = parseString(node, TYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(FORMATLABEL, formatlabel);
      node.put(MINIMUMLABEL, minimumlabel);
      node.put(TYPE, type); // enum
      return node;
    }

    /**
     * Extracts a list of {@link ControlSpinnerDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ControlSpinnerDetail> getSettingModelControlSpinnerDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ControlSpinnerDetail> l = new ArrayList<ControlSpinnerDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ControlSpinnerDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ControlSpinnerDetail>(0);
    }

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             SPINNER = "spinner";

      public final static Set<String> values  = new HashSet<String>(Arrays.asList(SPINNER));
    }
  }

  /**
   * API Name: <tt>Setting.Details.Group</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GroupDetail extends AbstractModel {
    public final static String       API_TYPE = "Setting.Details.Group";

    // field names
    public static final String       ID       = "id";
    public static final String       SETTINGS = "settings";

    // class members
    public final String              id;
    public final List<SettingDetail> settings;

    /**
     * @param id
     * @param settings
     */
    public GroupDetail(String id, List<SettingDetail> settings) {
      this.id = id;
      this.settings = settings;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a GroupDetail object
     */
    public GroupDetail(JsonNode node) {
      id = node.get(ID).getTextValue(); // required value
      settings = SettingDetail.getSettingModelSettingDetailList(node, SETTINGS);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = OM.createObjectNode();
      node.put(ID, id);
      final ArrayNode settingsArray = OM.createArrayNode();
      for (SettingDetail item : settings) {
        settingsArray.add(item.toJsonNode());
      }
      node.put(SETTINGS, settingsArray);
      return node;
    }

    /**
     * Extracts a list of {@link GroupDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<GroupDetail> getSettingModelGroupDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<GroupDetail> l = new ArrayList<GroupDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new GroupDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<GroupDetail>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Details.Section</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SectionDetail extends BaseDetail {
    public final static String        API_TYPE   = "Setting.Details.Section";

    // field names
    public static final String        CATEGORIES = "categories";

    // class members
    public final List<CategoryDetail> categories;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SectionDetail object
     */
    public SectionDetail(JsonNode node) {
      super(node);
      categories = CategoryDetail.getSettingModelCategoryDetailList(node, CATEGORIES);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode categoriesArray = OM.createArrayNode();
      for (CategoryDetail item : categories) {
        categoriesArray.add(item.toJsonNode());
      }
      node.put(CATEGORIES, categoriesArray);
      return node;
    }

    /**
     * Extracts a list of {@link SectionDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SectionDetail> getSettingModelSectionDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SectionDetail> l = new ArrayList<SectionDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SectionDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SectionDetail>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Details.Setting</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingDetail extends AbstractModel {
    public final static String       API_TYPE = "Setting.Details.Setting";

    // class members
    public final SettingActionDetail detailsSettingAction;
    public final SettingAddonDetail  detailsSettingAddon;
    public final SettingBoolDetail   detailsSettingBool;
    public final SettingIntDetail    detailsSettingInt;
    public final SettingListDetail   detailsSettingList;
    public final SettingNumberDetail detailsSettingNumber;
    public final SettingPathDetail   detailsSettingPath;
    public final SettingStringDetail detailsSettingString;

    /**
     * @param detailsSettingAction
     */
    public SettingDetail(SettingActionDetail detailsSettingAction) {
      this.detailsSettingAction = detailsSettingAction;
      this.detailsSettingAddon = null;
      this.detailsSettingBool = null;
      this.detailsSettingInt = null;
      this.detailsSettingList = null;
      this.detailsSettingNumber = null;
      this.detailsSettingPath = null;
      this.detailsSettingString = null;
    }

    /**
     * @param detailsSettingAddon
     */
    public SettingDetail(SettingAddonDetail detailsSettingAddon) {
      this.detailsSettingAddon = detailsSettingAddon;
      this.detailsSettingAction = null;
      this.detailsSettingBool = null;
      this.detailsSettingInt = null;
      this.detailsSettingList = null;
      this.detailsSettingNumber = null;
      this.detailsSettingPath = null;
      this.detailsSettingString = null;
    }

    /**
     * @param detailsSettingBool
     */
    public SettingDetail(SettingBoolDetail detailsSettingBool) {
      this.detailsSettingBool = detailsSettingBool;
      this.detailsSettingAction = null;
      this.detailsSettingAddon = null;
      this.detailsSettingInt = null;
      this.detailsSettingList = null;
      this.detailsSettingNumber = null;
      this.detailsSettingPath = null;
      this.detailsSettingString = null;
    }

    /**
     * @param detailsSettingInt
     */
    public SettingDetail(SettingIntDetail detailsSettingInt) {
      this.detailsSettingInt = detailsSettingInt;
      this.detailsSettingAction = null;
      this.detailsSettingAddon = null;
      this.detailsSettingBool = null;
      this.detailsSettingList = null;
      this.detailsSettingNumber = null;
      this.detailsSettingPath = null;
      this.detailsSettingString = null;
    }

    /**
     * @param detailsSettingList
     */
    public SettingDetail(SettingListDetail detailsSettingList) {
      this.detailsSettingList = detailsSettingList;
      this.detailsSettingAction = null;
      this.detailsSettingAddon = null;
      this.detailsSettingBool = null;
      this.detailsSettingInt = null;
      this.detailsSettingNumber = null;
      this.detailsSettingPath = null;
      this.detailsSettingString = null;
    }

    /**
     * @param detailsSettingNumber
     */
    public SettingDetail(SettingNumberDetail detailsSettingNumber) {
      this.detailsSettingNumber = detailsSettingNumber;
      this.detailsSettingAction = null;
      this.detailsSettingAddon = null;
      this.detailsSettingBool = null;
      this.detailsSettingInt = null;
      this.detailsSettingList = null;
      this.detailsSettingPath = null;
      this.detailsSettingString = null;
    }

    /**
     * @param detailsSettingPath
     */
    public SettingDetail(SettingPathDetail detailsSettingPath) {
      this.detailsSettingPath = detailsSettingPath;
      this.detailsSettingAction = null;
      this.detailsSettingAddon = null;
      this.detailsSettingBool = null;
      this.detailsSettingInt = null;
      this.detailsSettingList = null;
      this.detailsSettingNumber = null;
      this.detailsSettingString = null;
    }

    /**
     * @param detailsSettingString
     */
    public SettingDetail(SettingStringDetail detailsSettingString) {
      this.detailsSettingString = detailsSettingString;
      this.detailsSettingAction = null;
      this.detailsSettingAddon = null;
      this.detailsSettingBool = null;
      this.detailsSettingInt = null;
      this.detailsSettingList = null;
      this.detailsSettingNumber = null;
      this.detailsSettingPath = null;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingDetail object
     */
    public SettingDetail(JsonNode node) {
      if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsSettingAction = null;
        detailsSettingAddon = null;
        detailsSettingBool = null;
        detailsSettingInt = null;
        detailsSettingList = null;
        detailsSettingNumber = null;
        detailsSettingPath = null;
        detailsSettingString = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsSettingAction = null;
        detailsSettingAddon = null;
        detailsSettingBool = null;
        detailsSettingInt = null;
        detailsSettingList = null;
        detailsSettingNumber = null;
        detailsSettingPath = null;
        detailsSettingString = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsSettingAction = null;
        detailsSettingAddon = null;
        detailsSettingBool = null;
        detailsSettingInt = null;
        detailsSettingList = null;
        detailsSettingNumber = null;
        detailsSettingPath = null;
        detailsSettingString = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsSettingAction = null;
        detailsSettingAddon = null;
        detailsSettingBool = null;
        detailsSettingInt = null;
        detailsSettingList = null;
        detailsSettingNumber = null;
        detailsSettingPath = null;
        detailsSettingString = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsSettingAction = null;
        detailsSettingAddon = null;
        detailsSettingBool = null;
        detailsSettingInt = null;
        detailsSettingList = null;
        detailsSettingNumber = null;
        detailsSettingPath = null;
        detailsSettingString = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsSettingAction = null;
        detailsSettingAddon = null;
        detailsSettingBool = null;
        detailsSettingInt = null;
        detailsSettingList = null;
        detailsSettingNumber = null;
        detailsSettingPath = null;
        detailsSettingString = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsSettingAction = null;
        detailsSettingAddon = null;
        detailsSettingBool = null;
        detailsSettingInt = null;
        detailsSettingList = null;
        detailsSettingNumber = null;
        detailsSettingPath = null;
        detailsSettingString = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        detailsSettingAction = null;
        detailsSettingAddon = null;
        detailsSettingBool = null;
        detailsSettingInt = null;
        detailsSettingList = null;
        detailsSettingNumber = null;
        detailsSettingPath = null;
        detailsSettingString = null;
      }
      else {
        throw new RuntimeException("Weird type for \"Details.Setting\", I'm confused!");
      }
    }

    @Override
    public JsonNode toJsonNode() {
      if (detailsSettingAction != null) {
        return detailsSettingAction.toJsonNode();
      }
      if (detailsSettingAddon != null) {
        return detailsSettingAddon.toJsonNode();
      }
      if (detailsSettingBool != null) {
        return detailsSettingBool.toJsonNode();
      }
      if (detailsSettingInt != null) {
        return detailsSettingInt.toJsonNode();
      }
      if (detailsSettingList != null) {
        return detailsSettingList.toJsonNode();
      }
      if (detailsSettingNumber != null) {
        return detailsSettingNumber.toJsonNode();
      }
      if (detailsSettingPath != null) {
        return detailsSettingPath.toJsonNode();
      }
      if (detailsSettingString != null) {
        return detailsSettingString.toJsonNode();
      }
      return null; // this is completely excluded. theoretically.
    }

    /**
     * Extracts a list of {@link SettingDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingDetail> getSettingModelSettingDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingDetail> l = new ArrayList<SettingDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingDetail>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingAction</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingActionDetail extends SettingBaseDetail {
    public final static String API_TYPE = "Setting.Details.SettingAction";

    // field names

    // class members

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingActionDetail object
     */
    public SettingActionDetail(JsonNode node) {
      super(node);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      return node;
    }

    /**
     * Extracts a list of {@link SettingActionDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingActionDetail> getSettingModelSettingActionDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingActionDetail> l = new ArrayList<SettingActionDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingActionDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingActionDetail>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingAddon</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingAddonDetail extends SettingStringDetail {
    public final static String API_TYPE  = "Setting.Details.SettingAddon";

    // field names
    public static final String ADDONTYPE = "addontype";

    // class members
    public final String        addontype;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingAddonDetail object
     */
    public SettingAddonDetail(JsonNode node) {
      super(node);
      addontype = parseString(node, ADDONTYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(ADDONTYPE, addontype); // enum
      return node;
    }

    /**
     * Extracts a list of {@link SettingAddonDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingAddonDetail> getSettingModelSettingAddonDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingAddonDetail> l = new ArrayList<SettingAddonDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingAddonDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingAddonDetail>(0);
    }

    /**
     * API Name: <tt>addontype</tt>
     */
    public interface Addontype {

      public final String             UNKNOWN                           = "unknown";
      public final String             XBMC_PLAYER_MUSICVIZ              = "xbmc.player.musicviz";
      public final String             XBMC_GUI_SKIN                     = "xbmc.gui.skin";
      public final String             XBMC_PVRCLIENT                    = "xbmc.pvrclient";
      public final String             KODI_ADSP                         = "kodi.adsp";
      public final String             XBMC_PYTHON_SCRIPT                = "xbmc.python.script";
      public final String             XBMC_PYTHON_WEATHER               = "xbmc.python.weather";
      public final String             XBMC_SUBTITLE_MODULE              = "xbmc.subtitle.module";
      public final String             XBMC_PYTHON_LYRICS                = "xbmc.python.lyrics";
      public final String             XBMC_METADATA_SCRAPER_ALBUMS      = "xbmc.metadata.scraper.albums";
      public final String             XBMC_METADATA_SCRAPER_ARTISTS     = "xbmc.metadata.scraper.artists";
      public final String             XBMC_METADATA_SCRAPER_MOVIES      = "xbmc.metadata.scraper.movies";
      public final String             XBMC_METADATA_SCRAPER_MUSICVIDEOS = "xbmc.metadata.scraper.musicvideos";
      public final String             XBMC_METADATA_SCRAPER_TVSHOWS     = "xbmc.metadata.scraper.tvshows";
      public final String             XBMC_UI_SCREENSAVER               = "xbmc.ui.screensaver";
      public final String             XBMC_PYTHON_PLUGINSOURCE          = "xbmc.python.pluginsource";
      public final String             XBMC_ADDON_REPOSITORY             = "xbmc.addon.repository";
      public final String             XBMC_WEBINTERFACE                 = "xbmc.webinterface";
      public final String             XBMC_SERVICE                      = "xbmc.service";
      public final String             XBMC_AUDIOENCODER                 = "xbmc.audioencoder";
      public final String             KODI_CONTEXT_ITEM                 = "kodi.context.item";
      public final String             KODI_AUDIODECODER                 = "kodi.audiodecoder";
      public final String             KODI_RESOURCE_IMAGES              = "kodi.resource.images";
      public final String             KODI_RESOURCE_LANGUAGE            = "kodi.resource.language";
      public final String             KODI_RESOURCE_UISOUNDS            = "kodi.resource.uisounds";
      public final String             XBMC_ADDON_VIDEO                  = "xbmc.addon.video";
      public final String             XBMC_ADDON_AUDIO                  = "xbmc.addon.audio";
      public final String             XBMC_ADDON_IMAGE                  = "xbmc.addon.image";
      public final String             XBMC_ADDON_EXECUTABLE             = "xbmc.addon.executable";
      public final String             VISUALIZATION_LIBRARY             = "visualization-library";
      public final String             XBMC_METADATA_SCRAPER_LIBRARY     = "xbmc.metadata.scraper.library";
      public final String             XBMC_PYTHON_LIBRARY               = "xbmc.python.library";
      public final String             XBMC_PYTHON_MODULE                = "xbmc.python.module";

      public final static Set<String> values                            = new HashSet<String>(
          Arrays.asList(UNKNOWN, XBMC_PLAYER_MUSICVIZ, XBMC_GUI_SKIN, XBMC_PVRCLIENT, KODI_ADSP, XBMC_PYTHON_SCRIPT, XBMC_PYTHON_WEATHER,
              XBMC_SUBTITLE_MODULE, XBMC_PYTHON_LYRICS, XBMC_METADATA_SCRAPER_ALBUMS, XBMC_METADATA_SCRAPER_ARTISTS, XBMC_METADATA_SCRAPER_MOVIES,
              XBMC_METADATA_SCRAPER_MUSICVIDEOS, XBMC_METADATA_SCRAPER_TVSHOWS, XBMC_UI_SCREENSAVER, XBMC_PYTHON_PLUGINSOURCE, XBMC_ADDON_REPOSITORY,
              XBMC_WEBINTERFACE, XBMC_SERVICE, XBMC_AUDIOENCODER, KODI_CONTEXT_ITEM, KODI_AUDIODECODER, KODI_RESOURCE_IMAGES, KODI_RESOURCE_LANGUAGE,
              KODI_RESOURCE_UISOUNDS, XBMC_ADDON_VIDEO, XBMC_ADDON_AUDIO, XBMC_ADDON_IMAGE, XBMC_ADDON_EXECUTABLE, VISUALIZATION_LIBRARY,
              XBMC_METADATA_SCRAPER_LIBRARY, XBMC_PYTHON_LIBRARY, XBMC_PYTHON_MODULE));
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingBase</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingBaseDetail extends BaseDetail {
    public final static String API_TYPE = "Setting.Details.SettingBase";

    // field names
    public static final String CONTROL  = "control";
    public static final String ENABLED  = "enabled";
    public static final String LEVEL    = "level";
    public static final String PARENT   = "parent";
    public static final String TYPE     = "type";

    // class members
    public final ControlDetail control;
    public final Boolean       enabled;
    public final String        level;
    public final String        parent;
    public final String        type;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingBaseDetail object
     */
    public SettingBaseDetail(JsonNode node) {
      super(node);
      control = node.has(CONTROL) ? new ControlDetail(node.get(CONTROL)) : null;
      enabled = node.get(ENABLED).getBooleanValue(); // required value
      level = parseString(node, LEVEL);
      parent = parseString(node, PARENT);
      type = parseString(node, TYPE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(CONTROL, control == null ? null : control.toJsonNode());
      node.put(ENABLED, enabled);
      node.put(LEVEL, level); // enum
      node.put(PARENT, parent);
      node.put(TYPE, type); // enum
      return node;
    }

    /**
     * Extracts a list of {@link SettingBaseDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingBaseDetail> getSettingModelSettingBaseDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingBaseDetail> l = new ArrayList<SettingBaseDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingBaseDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingBaseDetail>(0);
    }

    /**
     * API Name: <tt>level</tt>
     */
    public interface Level {

      public final String             BASIC    = "basic";
      public final String             STANDARD = "standard";
      public final String             ADVANCED = "advanced";
      public final String             EXPERT   = "expert";

      public final static Set<String> values   = new HashSet<String>(Arrays.asList(BASIC, STANDARD, ADVANCED, EXPERT));
    }

    /**
     * API Name: <tt>type</tt>
     */
    public interface Type {

      public final String             BOOLEAN = "boolean";
      public final String             INTEGER = "integer";
      public final String             NUMBER  = "number";
      public final String             STRING  = "string";
      public final String             ACTION  = "action";
      public final String             LIST    = "list";
      public final String             PATH    = "path";
      public final String             ADDON   = "addon";

      public final static Set<String> values  = new HashSet<String>(Arrays.asList(BOOLEAN, INTEGER, NUMBER, STRING, ACTION, LIST, PATH, ADDON));
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingBool</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingBoolDetail extends SettingBaseDetail {
    public final static String API_TYPE = "Setting.Details.SettingBool";

    // field names
    public static final String DEFAULT  = "default";
    public static final String VALUE    = "value";

    // class members
    public final Boolean       defaultb;
    public final Boolean       value;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingBoolDetail object
     */
    public SettingBoolDetail(JsonNode node) {
      super(node);
      defaultb = node.get(DEFAULT).getBooleanValue(); // required value
      value = node.get(VALUE).getBooleanValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(DEFAULT, defaultb);
      node.put(VALUE, value);
      return node;
    }

    /**
     * Extracts a list of {@link SettingBoolDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingBoolDetail> getSettingModelSettingBoolDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingBoolDetail> l = new ArrayList<SettingBoolDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingBoolDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingBoolDetail>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingInt</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingIntDetail extends SettingBaseDetail {
    public final static String API_TYPE = "Setting.Details.SettingInt";

    // field names
    public static final String DEFAULT  = "default";
    public static final String MAXIMUM  = "maximum";
    public static final String MINIMUM  = "minimum";
    public static final String OPTIONS  = "options";
    public static final String STEP     = "step";
    public static final String VALUE    = "value";

    // class members
    public final Integer       defaulti;
    public final Integer       maximum;
    public final Integer       minimum;
    public final List<Option>  options;
    public final Integer       step;
    public final Integer       value;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingIntDetail object
     */
    public SettingIntDetail(JsonNode node) {
      super(node);
      defaulti = node.get(DEFAULT).getIntValue(); // required value
      maximum = parseInt(node, MAXIMUM);
      minimum = parseInt(node, MINIMUM);
      options = Option.getSettingModelOptionList(node, OPTIONS);
      step = parseInt(node, STEP);
      value = node.get(VALUE).getIntValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(DEFAULT, defaulti);
      node.put(MAXIMUM, maximum);
      node.put(MINIMUM, minimum);
      final ArrayNode optionsArray = OM.createArrayNode();
      for (Option item : options) {
        optionsArray.add(item.toJsonNode());
      }
      node.put(OPTIONS, optionsArray);
      node.put(STEP, step);
      node.put(VALUE, value);
      return node;
    }

    /**
     * Extracts a list of {@link SettingIntDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingIntDetail> getSettingModelSettingIntDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingIntDetail> l = new ArrayList<SettingIntDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingIntDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingIntDetail>(0);
    }

    /**
     * Note: This class is used as result only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Option extends AbstractModel {

      // field names
      public static final String LABEL = "label";
      public static final String VALUE = "value";

      // class members
      public final String        label;
      public final Integer       value;

      /**
       * @param label
       * @param value
       */
      public Option(String label, Integer value) {
        this.label = label;
        this.value = value;
      }

      /**
       * Construct from JSON object.
       * 
       * @param node
       *          JSON object representing a Option object
       */
      public Option(JsonNode node) {
        label = node.get(LABEL).getTextValue(); // required value
        value = node.get(VALUE).getIntValue(); // required value
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(LABEL, label);
        node.put(VALUE, value);
        return node;
      }

      /**
       * Extracts a list of {@link Option} objects from a JSON array.
       * 
       * @param node
       *          ObjectNode containing the list of objects.
       * @param key
       *          Key pointing to the node where the list is stored.
       */
      static List<Option> getSettingModelOptionList(JsonNode node, String key) {
        if (node.has(key)) {
          final ArrayNode a = (ArrayNode) node.get(key);
          final List<Option> l = new ArrayList<Option>(a.size());
          for (int i = 0; i < a.size(); i++) {
            l.add(new Option((JsonNode) a.get(i)));
          }
          return l;
        }
        return new ArrayList<Option>(0);
      }
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingList</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingListDetail extends SettingBaseDetail {
    public final static String API_TYPE     = "Setting.Details.SettingList";

    // field names
    public static final String DEFAULT      = "default";
    public static final String DEFINITION   = "definition";
    public static final String DELIMITER    = "delimiter";
    public static final String ELEMENTTYPE  = "elementtype";
    public static final String MAXIMUMITEMS = "maximumitems";
    public static final String MINIMUMITEMS = "minimumitems";
    public static final String VALUE        = "value";

    // class members
    public final List<Value>   defaultl;
    public final SettingDetail definition;
    public final String        delimiter;
    public final String        elementtype;
    public final Integer       maximumitems;
    public final Integer       minimumitems;
    public final List<Value>   value;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingListDetail object
     */
    public SettingListDetail(JsonNode node) {
      super(node);
      defaultl = Value.getSettingModelValueList(node, DEFAULT);
      definition = node.has(DEFINITION) ? new SettingDetail(node.get(DEFINITION)) : null;
      delimiter = node.get(DELIMITER).getTextValue(); // required value
      elementtype = parseString(node, ELEMENTTYPE);
      maximumitems = parseInt(node, MAXIMUMITEMS);
      minimumitems = parseInt(node, MINIMUMITEMS);
      value = Value.getSettingModelValueList(node, VALUE);
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode defaultArray = OM.createArrayNode();
      for (Value item : defaultl) {
        defaultArray.add(item.toJsonNode());
      }
      node.put(DEFAULT, defaultArray);
      node.put(DEFINITION, definition == null ? null : definition.toJsonNode());
      node.put(DELIMITER, delimiter);
      node.put(ELEMENTTYPE, elementtype); // enum
      node.put(MAXIMUMITEMS, maximumitems);
      node.put(MINIMUMITEMS, minimumitems);
      final ArrayNode valueArray = OM.createArrayNode();
      for (Value item : value) {
        valueArray.add(item.toJsonNode());
      }
      node.put(VALUE, valueArray);
      return node;
    }

    /**
     * Extracts a list of {@link SettingListDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingListDetail> getSettingModelSettingListDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingListDetail> l = new ArrayList<SettingListDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingListDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingListDetail>(0);
    }

    /**
     * API Name: <tt>elementtype</tt>
     */
    public interface Elementtype {

      public final String             BOOLEAN = "boolean";
      public final String             INTEGER = "integer";
      public final String             NUMBER  = "number";
      public final String             STRING  = "string";
      public final String             ACTION  = "action";
      public final String             LIST    = "list";
      public final String             PATH    = "path";
      public final String             ADDON   = "addon";

      public final static Set<String> values  = new HashSet<String>(Arrays.asList(BOOLEAN, INTEGER, NUMBER, STRING, ACTION, LIST, PATH, ADDON));
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingNumber</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingNumberDetail extends SettingBaseDetail {
    public final static String API_TYPE = "Setting.Details.SettingNumber";

    // field names
    public static final String DEFAULT  = "default";
    public static final String MAXIMUM  = "maximum";
    public static final String MINIMUM  = "minimum";
    public static final String STEP     = "step";
    public static final String VALUE    = "value";

    // class members
    public final Double        defaultd;
    public final Double        maximum;
    public final Double        minimum;
    public final Double        step;
    public final Double        value;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingNumberDetail object
     */
    public SettingNumberDetail(JsonNode node) {
      super(node);
      defaultd = node.get(DEFAULT).getDoubleValue(); // required value
      maximum = node.get(MAXIMUM).getDoubleValue(); // required value
      minimum = node.get(MINIMUM).getDoubleValue(); // required value
      step = node.get(STEP).getDoubleValue(); // required value
      value = node.get(VALUE).getDoubleValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(DEFAULT, defaultd);
      node.put(MAXIMUM, maximum);
      node.put(MINIMUM, minimum);
      node.put(STEP, step);
      node.put(VALUE, value);
      return node;
    }

    /**
     * Extracts a list of {@link SettingNumberDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingNumberDetail> getSettingModelSettingNumberDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingNumberDetail> l = new ArrayList<SettingNumberDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingNumberDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingNumberDetail>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingPath</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingPathDetail extends SettingStringDetail {
    public final static String API_TYPE = "Setting.Details.SettingPath";

    // field names
    public static final String SOURCES  = "sources";
    public static final String WRITABLE = "writable";

    // class members
    public final List<String>  sources;
    public final Boolean       writable;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingPathDetail object
     */
    public SettingPathDetail(JsonNode node) {
      super(node);
      sources = getStringArray(node, SOURCES);
      writable = node.get(WRITABLE).getBooleanValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      final ArrayNode sourcesArray = OM.createArrayNode();
      for (String item : sources) {
        sourcesArray.add(item);
      }
      node.put(SOURCES, sourcesArray);
      node.put(WRITABLE, writable);
      return node;
    }

    /**
     * Extracts a list of {@link SettingPathDetail} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<SettingPathDetail> getSettingModelSettingPathDetailList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<SettingPathDetail> l = new ArrayList<SettingPathDetail>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new SettingPathDetail((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<SettingPathDetail>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Details.SettingString</tt>
   * <p/>
   * Note: This class is used as result only.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SettingStringDetail extends SettingBaseDetail {
    public final static String API_TYPE   = "Setting.Details.SettingString";

    // field names
    public static final String ALLOWEMPTY = "allowempty";
    public static final String DEFAULT    = "default";
    public static final String OPTIONS    = "options";
    public static final String VALUE      = "value";

    // class members
    public final Boolean       allowempty;
    public final String        defaults;
    public final List<Option>  options;
    public final String        value;

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a SettingStringDetail object
     */
    public SettingStringDetail(JsonNode node) {
      super(node);
      allowempty = node.get(ALLOWEMPTY).getBooleanValue(); // required value
      defaults = node.get(DEFAULT).getTextValue(); // required value
      options = Option.getSettingModelOptionList(node, OPTIONS);
      value = node.get(VALUE).getTextValue(); // required value
    }

    @Override
    public JsonNode toJsonNode() {
      final ObjectNode node = (ObjectNode) super.toJsonNode();
      node.put(ALLOWEMPTY, allowempty);
      node.put(DEFAULT, defaults);
      final ArrayNode optionsArray = OM.createArrayNode();
      for (Option item : options) {
        optionsArray.add(item.toJsonNode());
      }
      node.put(OPTIONS, optionsArray);
      node.put(VALUE, value);
      return node;
    }

    /**
     * Note: This class is used as result only.<br/>
     * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
     */
    public static class Option extends AbstractModel {

      // field names
      public static final String LABEL = "label";
      public static final String VALUE = "value";

      // class members
      public final String        label;
      public final String        value;

      /**
       * @param label
       * @param value
       */
      public Option(String label, String value) {
        this.label = label;
        this.value = value;
      }

      /**
       * Construct from JSON object.
       * 
       * @param node
       *          JSON object representing a Option object
       */
      public Option(JsonNode node) {
        label = node.get(LABEL).getTextValue(); // required value
        value = node.get(VALUE).getTextValue(); // required value
      }

      @Override
      public JsonNode toJsonNode() {
        final ObjectNode node = OM.createObjectNode();
        node.put(LABEL, label);
        node.put(VALUE, value);
        return node;
      }

      /**
       * Extracts a list of {@link Option} objects from a JSON array.
       * 
       * @param node
       *          ObjectNode containing the list of objects.
       * @param key
       *          Key pointing to the node where the list is stored.
       */
      static List<Option> getSettingModelOptionList(JsonNode node, String key) {
        if (node.has(key)) {
          final ArrayNode a = (ArrayNode) node.get(key);
          final List<Option> l = new ArrayList<Option>(a.size());
          for (int i = 0; i < a.size(); i++) {
            l.add(new Option((JsonNode) a.get(i)));
          }
          return l;
        }
        return new ArrayList<Option>(0);
      }
    }
  }

  /**
   * API Name: <tt>Setting.Value</tt>
   * <p/>
   * Note: This class is used as parameter as well as result.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class Value extends AbstractModel {
    public final static String API_TYPE = "Setting.Value";

    // class members
    public final Boolean       booleanArg;
    public final Integer       integerArg;
    public final Double        numberArg;
    public final String        stringArg;

    /**
     * @param booleanArg
     */
    public Value(Boolean booleanArg) {
      this.booleanArg = booleanArg;
      this.integerArg = null;
      this.numberArg = null;
      this.stringArg = null;
    }

    /**
     * @param integerArg
     */
    public Value(Integer integerArg) {
      this.integerArg = integerArg;
      this.booleanArg = null;
      this.numberArg = null;
      this.stringArg = null;
    }

    /**
     * @param numberArg
     */
    public Value(Double numberArg) {
      this.numberArg = numberArg;
      this.booleanArg = null;
      this.integerArg = null;
      this.stringArg = null;
    }

    /**
     * @param stringArg
     */
    public Value(String stringArg) {
      this.stringArg = stringArg;
      this.booleanArg = null;
      this.integerArg = null;
      this.numberArg = null;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a Value object
     */
    public Value(JsonNode node) {
      if (node.isBoolean()) {
        booleanArg = node.getBooleanValue();
        integerArg = null;
        numberArg = null;
        stringArg = null;
      }
      else if (node.isInt()) {
        integerArg = node.getIntValue();
        booleanArg = null;
        numberArg = null;
        stringArg = null;
      }
      else if (node.isDouble()) {
        numberArg = node.getDoubleValue();
        booleanArg = null;
        integerArg = null;
        stringArg = null;
      }
      else if (node.isTextual()) {
        stringArg = node.getTextValue();
        booleanArg = null;
        integerArg = null;
        numberArg = null;
      }
      else {
        throw new RuntimeException("Weird type for \"Value\", I'm confused!");
      }
    }

    @Override
    public JsonNode toJsonNode() {
      if (booleanArg != null) {
        return booleanArg ? BooleanNode.TRUE : BooleanNode.FALSE;
      }
      if (integerArg != null) {
        return new IntNode(integerArg);
      }
      if (numberArg != null) {
        return new DoubleNode(numberArg);
      }
      if (stringArg != null) {
        return new TextNode(stringArg);
      }
      return null; // this is completely excluded. theoretically.
    }

    /**
     * Extracts a list of {@link Value} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<Value> getSettingModelValueList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<Value> l = new ArrayList<Value>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new Value((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<Value>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Value.Extended</tt>
   * <p/>
   * Note: This class is used as parameter as well as result.<br/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ValueExtended extends AbstractModel {
    public final static String API_TYPE = "Setting.Value.Extended";

    // class members
    public final Boolean       booleanArg;
    public final Integer       integerArg;
    public final Double        numberArg;
    public final String        stringArg;
    public final List<Value>   valueList;

    /**
     * @param booleanArg
     */
    public ValueExtended(Boolean booleanArg) {
      this.booleanArg = booleanArg;
      this.integerArg = null;
      this.numberArg = null;
      this.stringArg = null;
      this.valueList = null;
    }

    /**
     * @param integerArg
     */
    public ValueExtended(Integer integerArg) {
      this.integerArg = integerArg;
      this.booleanArg = null;
      this.numberArg = null;
      this.stringArg = null;
      this.valueList = null;
    }

    /**
     * @param numberArg
     */
    public ValueExtended(Double numberArg) {
      this.numberArg = numberArg;
      this.booleanArg = null;
      this.integerArg = null;
      this.stringArg = null;
      this.valueList = null;
    }

    /**
     * @param stringArg
     */
    public ValueExtended(String stringArg) {
      this.stringArg = stringArg;
      this.booleanArg = null;
      this.integerArg = null;
      this.numberArg = null;
      this.valueList = null;
    }

    /**
     * @param valueList
     */
    public ValueExtended(List<Value> valueList) {
      this.valueList = valueList;
      this.booleanArg = null;
      this.integerArg = null;
      this.numberArg = null;
      this.stringArg = null;
    }

    /**
     * Construct from JSON object.
     * 
     * @param node
     *          JSON object representing a ValueExtended object
     */
    public ValueExtended(JsonNode node) {
      if (node.isBoolean()) {
        booleanArg = node.getBooleanValue();
        integerArg = null;
        numberArg = null;
        stringArg = null;
        valueList = null;
      }
      else if (node.isInt()) {
        integerArg = node.getIntValue();
        booleanArg = null;
        numberArg = null;
        stringArg = null;
        valueList = null;
      }
      else if (node.isDouble()) {
        numberArg = node.getDoubleValue();
        booleanArg = null;
        integerArg = null;
        stringArg = null;
        valueList = null;
      }
      else if (node.isTextual()) {
        stringArg = node.getTextValue();
        booleanArg = null;
        integerArg = null;
        numberArg = null;
        valueList = null;
      }
      else if (node.isObject()) { // check what's returned and see if we can match by name rather than type.
        booleanArg = null;
        integerArg = null;
        numberArg = null;
        stringArg = null;
        valueList = null;
      }
      else {
        throw new RuntimeException("Weird type for \"Value.Extended\", I'm confused!");
      }
    }

    @Override
    public JsonNode toJsonNode() {
      if (booleanArg != null) {
        return booleanArg ? BooleanNode.TRUE : BooleanNode.FALSE;
      }
      if (integerArg != null) {
        return new IntNode(integerArg);
      }
      if (numberArg != null) {
        return new DoubleNode(numberArg);
      }
      if (stringArg != null) {
        return new TextNode(stringArg);
      }
      if (valueList != null) {
        final ArrayNode an = OM.createArrayNode();
        for (Value item : valueList) {
          an.add(item.toString()); // FIXME: item not valid, toString?!
        }
        ;
        return an;
      }
      return null; // this is completely excluded. theoretically.
    }

    /**
     * Extracts a list of {@link ValueExtended} objects from a JSON array.
     * 
     * @param node
     *          ObjectNode containing the list of objects.
     * @param key
     *          Key pointing to the node where the list is stored.
     */
    static List<ValueExtended> getSettingModelValueExtendedList(JsonNode node, String key) {
      if (node.has(key)) {
        final ArrayNode a = (ArrayNode) node.get(key);
        final List<ValueExtended> l = new ArrayList<ValueExtended>(a.size());
        for (int i = 0; i < a.size(); i++) {
          l.add(new ValueExtended((JsonNode) a.get(i)));
        }
        return l;
      }
      return new ArrayList<ValueExtended>(0);
    }
  }

  /**
   * API Name: <tt>Setting.Level</tt>
   */
  public interface Level {

    public final String             BASIC    = "basic";
    public final String             STANDARD = "standard";
    public final String             ADVANCED = "advanced";
    public final String             EXPERT   = "expert";

    public final static Set<String> values   = new HashSet<String>(Arrays.asList(BASIC, STANDARD, ADVANCED, EXPERT));
  }

  /**
   * API Name: <tt>Setting.Type</tt>
   */
  public interface Type {

    public final String             BOOLEAN = "boolean";
    public final String             INTEGER = "integer";
    public final String             NUMBER  = "number";
    public final String             STRING  = "string";
    public final String             ACTION  = "action";
    public final String             LIST    = "list";
    public final String             PATH    = "path";
    public final String             ADDON   = "addon";

    public final static Set<String> values  = new HashSet<String>(Arrays.asList(BOOLEAN, INTEGER, NUMBER, STRING, ACTION, LIST, PATH, ADDON));
  }
}
