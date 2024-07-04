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


package voucherify.client.model;

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

import voucherify.client.JSON;

/**
 * Defines the ratio by mapping the number of loyalty points in points_ratio to a predefined cash amount in exchange_ratio.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RewardTypeCoin {
  public static final String SERIALIZED_NAME_EXCHANGE_RATIO = "exchange_ratio";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATIO)
  private BigDecimal exchangeRatio;

  public static final String SERIALIZED_NAME_POINTS_RATIO = "points_ratio";
  @SerializedName(SERIALIZED_NAME_POINTS_RATIO)
  private Integer pointsRatio;

  public RewardTypeCoin() {
  }

  public RewardTypeCoin exchangeRatio(BigDecimal exchangeRatio) {
    
    this.exchangeRatio = exchangeRatio;
    return this;
  }

   /**
   * The cash equivalent of the points defined in the points_ratio property.
   * @return exchangeRatio
  **/
  @javax.annotation.Nonnull
  public BigDecimal getExchangeRatio() {
    return exchangeRatio;
  }


  public void setExchangeRatio(BigDecimal exchangeRatio) {
    this.exchangeRatio = exchangeRatio;
  }


  public RewardTypeCoin pointsRatio(Integer pointsRatio) {
    
    this.pointsRatio = pointsRatio;
    return this;
  }

   /**
   * The number of loyalty points that will map to the predefined cash amount defined by the exchange_ratio property.
   * @return pointsRatio
  **/
  @javax.annotation.Nullable
  public Integer getPointsRatio() {
    return pointsRatio;
  }


  public void setPointsRatio(Integer pointsRatio) {
    this.pointsRatio = pointsRatio;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardTypeCoin rewardTypeCoin = (RewardTypeCoin) o;
    return Objects.equals(this.exchangeRatio, rewardTypeCoin.exchangeRatio) &&
        Objects.equals(this.pointsRatio, rewardTypeCoin.pointsRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRatio, pointsRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardTypeCoin {\n");
    sb.append("    exchangeRatio: ").append(toIndentedString(exchangeRatio)).append("\n");
    sb.append("    pointsRatio: ").append(toIndentedString(pointsRatio)).append("\n");
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
    openapiFields.add("exchange_ratio");
    openapiFields.add("points_ratio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("exchange_ratio");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RewardTypeCoin
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RewardTypeCoin.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RewardTypeCoin is not found in the empty JSON string", RewardTypeCoin.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RewardTypeCoin.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RewardTypeCoin` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RewardTypeCoin.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RewardTypeCoin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RewardTypeCoin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RewardTypeCoin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RewardTypeCoin.class));

       return (TypeAdapter<T>) new TypeAdapter<RewardTypeCoin>() {
           @Override
           public void write(JsonWriter out, RewardTypeCoin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RewardTypeCoin read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RewardTypeCoin given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardTypeCoin
  * @throws IOException if the JSON string is invalid with respect to RewardTypeCoin
  */
  public static RewardTypeCoin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardTypeCoin.class);
  }

 /**
  * Convert an instance of RewardTypeCoin to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

