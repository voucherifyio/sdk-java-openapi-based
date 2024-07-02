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
 * Simplified loyalty card data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SimpleLoyaltyCard {
  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_NEXT_EXPIRATION_DATE = "next_expiration_date";
  @SerializedName(SERIALIZED_NAME_NEXT_EXPIRATION_DATE)
  private String nextExpirationDate;

  public static final String SERIALIZED_NAME_NEXT_EXPIRATION_POINTS = "next_expiration_points";
  @SerializedName(SERIALIZED_NAME_NEXT_EXPIRATION_POINTS)
  private Integer nextExpirationPoints;

  public SimpleLoyaltyCard() {
  }

  public SimpleLoyaltyCard points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Total points incurred over lifespan of loyalty card.
   * @return points
  **/
  @javax.annotation.Nonnull
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public SimpleLoyaltyCard balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Points available for reward redemption.
   * @return balance
  **/
  @javax.annotation.Nonnull
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public SimpleLoyaltyCard nextExpirationDate(String nextExpirationDate) {
    
    this.nextExpirationDate = nextExpirationDate;
    return this;
  }

   /**
   * The next closest date when the next set of points are due to expire.
   * @return nextExpirationDate
  **/
  @javax.annotation.Nullable
  public String getNextExpirationDate() {
    return nextExpirationDate;
  }


  public void setNextExpirationDate(String nextExpirationDate) {
    this.nextExpirationDate = nextExpirationDate;
  }


  public SimpleLoyaltyCard nextExpirationPoints(Integer nextExpirationPoints) {
    
    this.nextExpirationPoints = nextExpirationPoints;
    return this;
  }

   /**
   * The amount of points that are set to expire next.
   * @return nextExpirationPoints
  **/
  @javax.annotation.Nullable
  public Integer getNextExpirationPoints() {
    return nextExpirationPoints;
  }


  public void setNextExpirationPoints(Integer nextExpirationPoints) {
    this.nextExpirationPoints = nextExpirationPoints;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleLoyaltyCard simpleLoyaltyCard = (SimpleLoyaltyCard) o;
    return Objects.equals(this.points, simpleLoyaltyCard.points) &&
        Objects.equals(this.balance, simpleLoyaltyCard.balance) &&
        Objects.equals(this.nextExpirationDate, simpleLoyaltyCard.nextExpirationDate) &&
        Objects.equals(this.nextExpirationPoints, simpleLoyaltyCard.nextExpirationPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, balance, nextExpirationDate, nextExpirationPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleLoyaltyCard {\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    nextExpirationDate: ").append(toIndentedString(nextExpirationDate)).append("\n");
    sb.append("    nextExpirationPoints: ").append(toIndentedString(nextExpirationPoints)).append("\n");
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
    openapiFields.add("points");
    openapiFields.add("balance");
    openapiFields.add("next_expiration_date");
    openapiFields.add("next_expiration_points");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("points");
    openapiRequiredFields.add("balance");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SimpleLoyaltyCard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimpleLoyaltyCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimpleLoyaltyCard is not found in the empty JSON string", SimpleLoyaltyCard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimpleLoyaltyCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimpleLoyaltyCard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimpleLoyaltyCard.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("next_expiration_date") != null && !jsonObj.get("next_expiration_date").isJsonNull()) && !jsonObj.get("next_expiration_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_expiration_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_expiration_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimpleLoyaltyCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimpleLoyaltyCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimpleLoyaltyCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimpleLoyaltyCard.class));

       return (TypeAdapter<T>) new TypeAdapter<SimpleLoyaltyCard>() {
           @Override
           public void write(JsonWriter out, SimpleLoyaltyCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimpleLoyaltyCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimpleLoyaltyCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimpleLoyaltyCard
  * @throws IOException if the JSON string is invalid with respect to SimpleLoyaltyCard
  */
  public static SimpleLoyaltyCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimpleLoyaltyCard.class);
  }

 /**
  * Convert an instance of SimpleLoyaltyCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
