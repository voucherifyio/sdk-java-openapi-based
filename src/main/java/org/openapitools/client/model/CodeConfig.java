/*
 * Voucherify API
 * Voucherify promotion engine REST API. Please see https://docs.voucherify.io/docs for more details.
 *
 * The version of the OpenAPI document: v2018-08-01
 * Contact: support@voucherify.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Schema containing information about config used for voucher. Defines code&#39;s pattern (prefix, suffix, length, charset, etc).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class CodeConfig {
  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private BigDecimal length;

  public static final String SERIALIZED_NAME_CHARSET = "charset";
  @SerializedName(SERIALIZED_NAME_CHARSET)
  private String charset;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_POSTFIX = "postfix";
  @SerializedName(SERIALIZED_NAME_POSTFIX)
  private String postfix;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_INITIAL_COUNT = "initial_count";
  @SerializedName(SERIALIZED_NAME_INITIAL_COUNT)
  private Integer initialCount;

  public CodeConfig() {
  }

  public CodeConfig length(BigDecimal length) {
    
    this.length = length;
    return this;
  }

   /**
   * Number of characters in a generated code (excluding prefix and postfix).
   * @return length
  **/
  @javax.annotation.Nullable
  public BigDecimal getLength() {
    return length;
  }


  public void setLength(BigDecimal length) {
    this.length = length;
  }


  public CodeConfig charset(String charset) {
    
    this.charset = charset;
    return this;
  }

   /**
   * Characters that can appear in the code.    Examples:  - Alphanumeric: &#x60;0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Alphabetic: &#x60;abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Alphabetic Lowercase: &#x60;abcdefghijklmnopqrstuvwxyz&#x60;  - Alphabetic Uppercase: &#x60;ABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Numbers: &#x60;0123456789&#x60;   - Custom: a custom character set
   * @return charset
  **/
  @javax.annotation.Nullable
  public String getCharset() {
    return charset;
  }


  public void setCharset(String charset) {
    this.charset = charset;
  }


  public CodeConfig prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * A text appended before the code.
   * @return prefix
  **/
  @javax.annotation.Nullable
  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public CodeConfig postfix(String postfix) {
    
    this.postfix = postfix;
    return this;
  }

   /**
   * A text appended after the code.
   * @return postfix
  **/
  @javax.annotation.Nullable
  public String getPostfix() {
    return postfix;
  }


  public void setPostfix(String postfix) {
    this.postfix = postfix;
  }


  public CodeConfig pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * A pattern for codes where hashes (#) will be replaced with random characters. Overrides &#x60;length&#x60;.
   * @return pattern
  **/
  @javax.annotation.Nullable
  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public CodeConfig initialCount(Integer initialCount) {
    
    this.initialCount = initialCount;
    return this;
  }

   /**
   * The initial count
   * @return initialCount
  **/
  @javax.annotation.Nullable
  public Integer getInitialCount() {
    return initialCount;
  }


  public void setInitialCount(Integer initialCount) {
    this.initialCount = initialCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeConfig codeConfig = (CodeConfig) o;
    return Objects.equals(this.length, codeConfig.length) &&
        Objects.equals(this.charset, codeConfig.charset) &&
        Objects.equals(this.prefix, codeConfig.prefix) &&
        Objects.equals(this.postfix, codeConfig.postfix) &&
        Objects.equals(this.pattern, codeConfig.pattern) &&
        Objects.equals(this.initialCount, codeConfig.initialCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, charset, prefix, postfix, pattern, initialCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeConfig {\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    postfix: ").append(toIndentedString(postfix)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    initialCount: ").append(toIndentedString(initialCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("length");
    openapiFields.add("charset");
    openapiFields.add("prefix");
    openapiFields.add("postfix");
    openapiFields.add("pattern");
    openapiFields.add("initial_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CodeConfig
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CodeConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CodeConfig is not found in the empty JSON string", CodeConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CodeConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CodeConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("charset") != null && !jsonObj.get("charset").isJsonNull()) && !jsonObj.get("charset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charset").toString()));
      }
      if ((jsonObj.get("prefix") != null && !jsonObj.get("prefix").isJsonNull()) && !jsonObj.get("prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prefix").toString()));
      }
      if ((jsonObj.get("postfix") != null && !jsonObj.get("postfix").isJsonNull()) && !jsonObj.get("postfix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postfix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postfix").toString()));
      }
      if ((jsonObj.get("pattern") != null && !jsonObj.get("pattern").isJsonNull()) && !jsonObj.get("pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pattern").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CodeConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CodeConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CodeConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CodeConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CodeConfig>() {
           @Override
           public void write(JsonWriter out, CodeConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CodeConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CodeConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CodeConfig
  * @throws IOException if the JSON string is invalid with respect to CodeConfig
  */
  public static CodeConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CodeConfig.class);
  }

 /**
  * Convert an instance of CodeConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

