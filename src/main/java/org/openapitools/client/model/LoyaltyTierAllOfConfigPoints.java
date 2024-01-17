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
 * Defines range of loyalty tier in points.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class LoyaltyTierAllOfConfigPoints {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Integer from;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private Integer to;

  public LoyaltyTierAllOfConfigPoints() {
  }

  public LoyaltyTierAllOfConfigPoints from(Integer from) {
    
    this.from = from;
    return this;
  }

   /**
   * Bottom points threshold value.
   * @return from
  **/
  @javax.annotation.Nullable
  public Integer getFrom() {
    return from;
  }


  public void setFrom(Integer from) {
    this.from = from;
  }


  public LoyaltyTierAllOfConfigPoints to(Integer to) {
    
    this.to = to;
    return this;
  }

   /**
   * Top points threshold value.
   * @return to
  **/
  @javax.annotation.Nullable
  public Integer getTo() {
    return to;
  }


  public void setTo(Integer to) {
    this.to = to;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTierAllOfConfigPoints loyaltyTierAllOfConfigPoints = (LoyaltyTierAllOfConfigPoints) o;
    return Objects.equals(this.from, loyaltyTierAllOfConfigPoints.from) &&
        Objects.equals(this.to, loyaltyTierAllOfConfigPoints.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTierAllOfConfigPoints {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
    openapiFields.add("from");
    openapiFields.add("to");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltyTierAllOfConfigPoints
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltyTierAllOfConfigPoints.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltyTierAllOfConfigPoints is not found in the empty JSON string", LoyaltyTierAllOfConfigPoints.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltyTierAllOfConfigPoints.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltyTierAllOfConfigPoints` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltyTierAllOfConfigPoints.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltyTierAllOfConfigPoints' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltyTierAllOfConfigPoints> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltyTierAllOfConfigPoints.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltyTierAllOfConfigPoints>() {
           @Override
           public void write(JsonWriter out, LoyaltyTierAllOfConfigPoints value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltyTierAllOfConfigPoints read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltyTierAllOfConfigPoints given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltyTierAllOfConfigPoints
  * @throws IOException if the JSON string is invalid with respect to LoyaltyTierAllOfConfigPoints
  */
  public static LoyaltyTierAllOfConfigPoints fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltyTierAllOfConfigPoints.class);
  }

 /**
  * Convert an instance of LoyaltyTierAllOfConfigPoints to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

