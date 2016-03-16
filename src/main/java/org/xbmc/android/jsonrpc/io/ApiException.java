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

package org.xbmc.android.jsonrpc.io;

import org.codehaus.jackson.JsonNode;

/**
 * Stuff that breaks while accessing the API
 * 
 * @author freezy <freezy@xbmc.org>
 * @author Joel Stemmer <stemmertech@gmail.com>
 */
public class ApiException extends Exception {

  private final static String TAG                        = ApiException.class.getSimpleName();

  /**
   * The URL of the API could not be parsed. See logs for more info.
   */
  public static final int     MALFORMED_URL              = 0x01;
  /**
   * Connection problem, please check logs.
   */
  public static final int     IO_EXCEPTION               = 0x02;
  /**
   * Data could not been read from server.
   */
  public static final int     IO_EXCEPTION_WHILE_READING = 0x03;
  /**
   * Data could not been sent to server.
   */
  public static final int     IO_EXCEPTION_WHILE_WRITING = 0x04;
  /**
   * Error while connecting to server.
   */
  public static final int     IO_EXCEPTION_WHILE_OPENING = 0x05;
  /**
   * Connection timed out.
   */
  public static final int     IO_SOCKETTIMEOUT           = 0x06;
  /**
   * Host not found.
   */
  public static final int     IO_UNKNOWN_HOST            = 0x07;
  /**
   * Connection was terminated unexpectedly.
   */
  public static final int     IO_DISCONNECTED            = 0x08;
  /**
   * Unsupported encoding.
   */
  public static final int     UNSUPPORTED_ENCODING       = 0x09;
  /**
   * Error when serializing JSON data.
   */
  public static final int     JSON_EXCEPTION             = 0x0a;
  /**
   * Received different response than expected.
   */
  public static final int     RESPONSE_ERROR             = 0x0b;
  /**
   * JSON-RPC returned an error.
   */
  public static final int     API_ERROR                  = 0x0c;
  /**
   * Unknown HTTP status code received (not in between 100 and 599).
   */
  public static final int     HTTP_UNKNOWN               = 0x0d;
  /**
   * Informational HTTP code received (100 - 199).
   */
  public static final int     HTTP_INFO                  = 0x0e;
  /**
   * Success HTTP code received (200 - 299).
   */
  public static final int     HTTP_SUCCESS               = 0x0f;
  /**
   * Redirection HTTP code received (300 - 399).
   */
  public static final int     HTTP_REDIRECTION           = 0x10;
  /**
   * Client error HTTP code received (400 - 499).
   */
  public static final int     HTTP_CLIENT_ERROR          = 0x11;
  /**
   * Server error HTTP code received (500 - 599).
   */
  public static final int     HTTP_SERVER_ERROR          = 0x12;
  /**
   * Bad request HTTP code received (400).
   */
  public static final int     HTTP_BAD_REQUEST           = 0x13;
  /**
   * Unauthorized HTTP code received (401).
   */
  public static final int     HTTP_UNAUTHORIZED          = 0x14;
  /**
   * Forbidden HTTP code received (403).
   */
  public static final int     HTTP_FORBIDDEN             = 0x15;
  /**
   * Not found HTTP code received (404).
   */
  public static final int     HTTP_NOT_FOUND             = 0x16;

  public static final String  EXTRA_ERROR_CODE           = "org.xbmc.android.jsonprc.extra.ERROR_CODE";
  public static final String  EXTRA_ERROR_MESSAGE        = "org.xbmc.android.jsonprc.extra.ERROR_MESSAGE";
  public static final String  EXTRA_ERROR_HINT           = "org.xbmc.android.jsonprc.extra.ERROR_HINT";

  private int                 code;

  public ApiException(int code, String message) {
    super(message);
    this.code = code;
  }

  public ApiException(int code, String message, Throwable cause) {
    super(message, cause);
    this.code = code;
  }

  public ApiException(JsonNode node) {
    super(node.get("error").get("message").getValueAsText());
    final StringBuilder sb = new StringBuilder("API Error: ");
    try {
      this.code = API_ERROR;
      sb.append("Error in ");
      sb.append(node.get("error").get("data").get("method").getValueAsText());
      sb.append(" for ");
      sb.append(node.get("error").get("data").get("stack").get("name").getValueAsText());
      sb.append(": ");
      sb.append(node.get("error").get("data").get("stack").get("property").get("message").getValueAsText());
    }
    catch (NullPointerException e) {
      // this message didn't conform to our expected format
      throw new RuntimeException(node.toString());
    }
  }

  public int getCode() {
    return code;
  }

  private static final long serialVersionUID = -8668163106123710291L;
}
