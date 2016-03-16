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
package org.tinymediamanager.jsonrpc.api.call;

import java.util.ArrayList;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.tinymediamanager.jsonrpc.api.AbstractCall;
import org.tinymediamanager.jsonrpc.api.model.SettingModel;

public final class Settings {

  /**
   * Retrieves all setting categories.
   * <p/>
   * This class represents the API method <tt>Settings.GetCategories</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetCategories extends AbstractCall<SettingModel.CategoryDetail> {
    public final static String API_TYPE = "Settings.GetCategories";
    public final static String RESULT   = "categories";

    /**
     * Retrieves all setting categories.
     * 
     * @param level
     *          One of: <tt>basic</tt>, <tt>standard</tt>, <tt>advanced</tt>, <tt>expert</tt>. See constants at {@link SettingModel.Level}.
     * @param section
     * @param properties
     */
    public GetCategories(String level, String section, String... properties) {
      super();
      addParameter("level", level);
      addParameter("section", section);
      addParameter("properties", properties);
    }

    /**
     * Retrieves all setting categories.
     * 
     * @param properties
     */
    public GetCategories(String properties) {
      super();
      addParameter("properties", properties);
    }

    /**
     * Retrieves all setting categories.
     * 
     * @param level
     *          One of: <tt>basic</tt>, <tt>standard</tt>, <tt>advanced</tt>, <tt>expert</tt>. See constants at {@link SettingModel.Level}.
     * @param properties
     */
    public GetCategories(String level, String properties) {
      super();
      addParameter("level", level);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<SettingModel.CategoryDetail> parseMany(JsonNode node) {
      final ArrayNode categories = parseResults(node, RESULT);
      if (categories != null) {
        final ArrayList<SettingModel.CategoryDetail> ret = new ArrayList<SettingModel.CategoryDetail>(categories.size());
        for (int i = 0; i < categories.size(); i++) {
          final ObjectNode item = (ObjectNode) categories.get(i);
          ret.add(new SettingModel.CategoryDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<SettingModel.CategoryDetail>(0);
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
   * Retrieves all setting sections.
   * <p/>
   * This class represents the API method <tt>Settings.GetSections</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetSections extends AbstractCall<SettingModel.SectionDetail> {
    public final static String API_TYPE = "Settings.GetSections";
    public final static String RESULT   = "sections";

    /**
     * Retrieves all setting sections.
     * 
     * @param level
     *          One of: <tt>basic</tt>, <tt>standard</tt>, <tt>advanced</tt>, <tt>expert</tt>. See constants at {@link SettingModel.Level}.
     * @param properties
     */
    public GetSections(String level, String... properties) {
      super();
      addParameter("level", level);
      addParameter("properties", properties);
    }

    @Override
    protected ArrayList<SettingModel.SectionDetail> parseMany(JsonNode node) {
      final ArrayNode sections = parseResults(node, RESULT);
      if (sections != null) {
        final ArrayList<SettingModel.SectionDetail> ret = new ArrayList<SettingModel.SectionDetail>(sections.size());
        for (int i = 0; i < sections.size(); i++) {
          final ObjectNode item = (ObjectNode) sections.get(i);
          ret.add(new SettingModel.SectionDetail(item));
        }
        return ret;
      }
      else {
        return new ArrayList<SettingModel.SectionDetail>(0);
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
   * Retrieves the value of a setting.
   * <p/>
   * This class represents the API method <tt>Settings.GetSettingValue</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class GetSettingValue extends AbstractCall<SettingModel.ValueExtended> {
    public final static String API_TYPE = "Settings.GetSettingValue";
    public final static String RESULT   = "value";

    /**
     * Retrieves the value of a setting.
     * 
     * @param setting
     */
    public GetSettingValue(String setting) {
      super();
      addParameter("setting", setting);
    }

    @Override
    protected SettingModel.ValueExtended parseOne(JsonNode node) {
      return new SettingModel.ValueExtended((ObjectNode) node.get(RESULT));
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
   * Resets the value of a setting.
   * <p/>
   * This class represents the API method <tt>Settings.ResetSettingValue</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class ResetSettingValue extends AbstractCall<String> {
    public final static String API_TYPE = "Settings.ResetSettingValue";

    /**
     * Resets the value of a setting.
     * 
     * @param setting
     */
    public ResetSettingValue(String setting) {
      super();
      addParameter("setting", setting);
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
   * Changes the value of a setting.
   * <p/>
   * This class represents the API method <tt>Settings.SetSettingValue</tt>
   * <p/>
   * <i>This class was generated automatically from XBMC's JSON-RPC introspect.</i>
   */
  public static class SetSettingValue extends AbstractCall<Boolean> {
    public final static String API_TYPE = "Settings.SetSettingValue";

    /**
     * Changes the value of a setting.
     * 
     * @param setting
     * @param value
     */
    public SetSettingValue(String setting, SettingModel.ValueExtended value) {
      super();
      addParameter("setting", setting);
      addParameter("value", value);
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
}
