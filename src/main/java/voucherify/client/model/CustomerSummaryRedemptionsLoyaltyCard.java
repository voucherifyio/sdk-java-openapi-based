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
 * Summary of loyalty points.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomerSummaryRedemptionsLoyaltyCard {
  public static final String SERIALIZED_NAME_REDEEMED_POINTS = "redeemed_points";
  @SerializedName(SERIALIZED_NAME_REDEEMED_POINTS)
  private Integer redeemedPoints;

  public static final String SERIALIZED_NAME_POINTS_TO_GO = "points_to_go";
  @SerializedName(SERIALIZED_NAME_POINTS_TO_GO)
  private Integer pointsToGo;

  public CustomerSummaryRedemptionsLoyaltyCard() {
  }

  public CustomerSummaryRedemptionsLoyaltyCard redeemedPoints(Integer redeemedPoints) {
    
    this.redeemedPoints = redeemedPoints;
    return this;
  }

   /**
   * Total number of loyalty points redeemed by the customer.
   * @return redeemedPoints
  **/
  @javax.annotation.Nonnull
  public Integer getRedeemedPoints() {
    return redeemedPoints;
  }


  public void setRedeemedPoints(Integer redeemedPoints) {
    this.redeemedPoints = redeemedPoints;
  }


  public CustomerSummaryRedemptionsLoyaltyCard pointsToGo(Integer pointsToGo) {
    
    this.pointsToGo = pointsToGo;
    return this;
  }

   /**
   * Sum of remaining available point balance across all loyalty cards.
   * @return pointsToGo
  **/
  @javax.annotation.Nonnull
  public Integer getPointsToGo() {
    return pointsToGo;
  }


  public void setPointsToGo(Integer pointsToGo) {
    this.pointsToGo = pointsToGo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSummaryRedemptionsLoyaltyCard customerSummaryRedemptionsLoyaltyCard = (CustomerSummaryRedemptionsLoyaltyCard) o;
    return Objects.equals(this.redeemedPoints, customerSummaryRedemptionsLoyaltyCard.redeemedPoints) &&
        Objects.equals(this.pointsToGo, customerSummaryRedemptionsLoyaltyCard.pointsToGo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redeemedPoints, pointsToGo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSummaryRedemptionsLoyaltyCard {\n");
    sb.append("    redeemedPoints: ").append(toIndentedString(redeemedPoints)).append("\n");
    sb.append("    pointsToGo: ").append(toIndentedString(pointsToGo)).append("\n");
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
    openapiFields.add("redeemed_points");
    openapiFields.add("points_to_go");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("redeemed_points");
    openapiRequiredFields.add("points_to_go");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerSummaryRedemptionsLoyaltyCard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerSummaryRedemptionsLoyaltyCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerSummaryRedemptionsLoyaltyCard is not found in the empty JSON string", CustomerSummaryRedemptionsLoyaltyCard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerSummaryRedemptionsLoyaltyCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerSummaryRedemptionsLoyaltyCard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerSummaryRedemptionsLoyaltyCard.openapiRequiredFields) {
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
       if (!CustomerSummaryRedemptionsLoyaltyCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerSummaryRedemptionsLoyaltyCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerSummaryRedemptionsLoyaltyCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerSummaryRedemptionsLoyaltyCard.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerSummaryRedemptionsLoyaltyCard>() {
           @Override
           public void write(JsonWriter out, CustomerSummaryRedemptionsLoyaltyCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerSummaryRedemptionsLoyaltyCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerSummaryRedemptionsLoyaltyCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerSummaryRedemptionsLoyaltyCard
  * @throws IOException if the JSON string is invalid with respect to CustomerSummaryRedemptionsLoyaltyCard
  */
  public static CustomerSummaryRedemptionsLoyaltyCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerSummaryRedemptionsLoyaltyCard.class);
  }

 /**
  * Convert an instance of CustomerSummaryRedemptionsLoyaltyCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

