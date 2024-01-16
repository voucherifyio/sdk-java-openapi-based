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
 * Object for defining detailed information about lucky draw should be applied
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class LuckyDraw {
  public static final String SERIALIZED_NAME_WINNERS_COUNT = "winners_count";
  @SerializedName(SERIALIZED_NAME_WINNERS_COUNT)
  private String winnersCount;

  public static final String SERIALIZED_NAME_UNIQUE_WINNERS_PER_DRAW = "unique_winners_per_draw";
  @SerializedName(SERIALIZED_NAME_UNIQUE_WINNERS_PER_DRAW)
  private String uniqueWinnersPerDraw;

  public static final String SERIALIZED_NAME_UNIQUE_WINNERS = "unique_winners";
  @SerializedName(SERIALIZED_NAME_UNIQUE_WINNERS)
  private String uniqueWinners;

  public LuckyDraw() {
  }

  public LuckyDraw winnersCount(String winnersCount) {
    
    this.winnersCount = winnersCount;
    return this;
  }

   /**
   * It represents the total number of winners in a lucky draw.
   * @return winnersCount
  **/
  @javax.annotation.Nullable
  public String getWinnersCount() {
    return winnersCount;
  }


  public void setWinnersCount(String winnersCount) {
    this.winnersCount = winnersCount;
  }


  public LuckyDraw uniqueWinnersPerDraw(String uniqueWinnersPerDraw) {
    
    this.uniqueWinnersPerDraw = uniqueWinnersPerDraw;
    return this;
  }

   /**
   * It indicates whether each winner in a draw is unique or not.
   * @return uniqueWinnersPerDraw
  **/
  @javax.annotation.Nullable
  public String getUniqueWinnersPerDraw() {
    return uniqueWinnersPerDraw;
  }


  public void setUniqueWinnersPerDraw(String uniqueWinnersPerDraw) {
    this.uniqueWinnersPerDraw = uniqueWinnersPerDraw;
  }


  public LuckyDraw uniqueWinners(String uniqueWinners) {
    
    this.uniqueWinners = uniqueWinners;
    return this;
  }

   /**
   * Specifies whether each participant can win only once across multiple draws.
   * @return uniqueWinners
  **/
  @javax.annotation.Nullable
  public String getUniqueWinners() {
    return uniqueWinners;
  }


  public void setUniqueWinners(String uniqueWinners) {
    this.uniqueWinners = uniqueWinners;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LuckyDraw luckyDraw = (LuckyDraw) o;
    return Objects.equals(this.winnersCount, luckyDraw.winnersCount) &&
        Objects.equals(this.uniqueWinnersPerDraw, luckyDraw.uniqueWinnersPerDraw) &&
        Objects.equals(this.uniqueWinners, luckyDraw.uniqueWinners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(winnersCount, uniqueWinnersPerDraw, uniqueWinners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LuckyDraw {\n");
    sb.append("    winnersCount: ").append(toIndentedString(winnersCount)).append("\n");
    sb.append("    uniqueWinnersPerDraw: ").append(toIndentedString(uniqueWinnersPerDraw)).append("\n");
    sb.append("    uniqueWinners: ").append(toIndentedString(uniqueWinners)).append("\n");
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
    openapiFields.add("winners_count");
    openapiFields.add("unique_winners_per_draw");
    openapiFields.add("unique_winners");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LuckyDraw
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LuckyDraw.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LuckyDraw is not found in the empty JSON string", LuckyDraw.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LuckyDraw.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LuckyDraw` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("winners_count") != null && !jsonObj.get("winners_count").isJsonNull()) && !jsonObj.get("winners_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `winners_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("winners_count").toString()));
      }
      if ((jsonObj.get("unique_winners_per_draw") != null && !jsonObj.get("unique_winners_per_draw").isJsonNull()) && !jsonObj.get("unique_winners_per_draw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_winners_per_draw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_winners_per_draw").toString()));
      }
      if ((jsonObj.get("unique_winners") != null && !jsonObj.get("unique_winners").isJsonNull()) && !jsonObj.get("unique_winners").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_winners` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_winners").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LuckyDraw.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LuckyDraw' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LuckyDraw> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LuckyDraw.class));

       return (TypeAdapter<T>) new TypeAdapter<LuckyDraw>() {
           @Override
           public void write(JsonWriter out, LuckyDraw value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LuckyDraw read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LuckyDraw given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LuckyDraw
  * @throws IOException if the JSON string is invalid with respect to LuckyDraw
  */
  public static LuckyDraw fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LuckyDraw.class);
  }

 /**
  * Convert an instance of LuckyDraw to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

