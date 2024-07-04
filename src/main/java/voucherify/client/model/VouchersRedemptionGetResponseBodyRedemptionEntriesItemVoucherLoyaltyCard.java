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
import java.time.LocalDate;
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
 * VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard {
  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_NEXT_EXPIRATION_DATE = "next_expiration_date";
  @SerializedName(SERIALIZED_NAME_NEXT_EXPIRATION_DATE)
  private LocalDate nextExpirationDate;

  public static final String SERIALIZED_NAME_NEXT_EXPIRATION_POINTS = "next_expiration_points";
  @SerializedName(SERIALIZED_NAME_NEXT_EXPIRATION_POINTS)
  private Integer nextExpirationPoints;

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard() {
  }

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Total points incurred over lifespan of loyalty card.
   * @return points
  **/
  @javax.annotation.Nullable
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Points available for reward redemption.
   * @return balance
  **/
  @javax.annotation.Nullable
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard nextExpirationDate(LocalDate nextExpirationDate) {
    
    this.nextExpirationDate = nextExpirationDate;
    return this;
  }

   /**
   * The next closest date when the next set of points are due to expire.
   * @return nextExpirationDate
  **/
  @javax.annotation.Nullable
  public LocalDate getNextExpirationDate() {
    return nextExpirationDate;
  }


  public void setNextExpirationDate(LocalDate nextExpirationDate) {
    this.nextExpirationDate = nextExpirationDate;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard nextExpirationPoints(Integer nextExpirationPoints) {
    
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
    VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard = (VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard) o;
    return Objects.equals(this.points, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.points) &&
        Objects.equals(this.balance, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.balance) &&
        Objects.equals(this.nextExpirationDate, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.nextExpirationDate) &&
        Objects.equals(this.nextExpirationPoints, vouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.nextExpirationPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, balance, nextExpirationDate, nextExpirationPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard {\n");
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
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard is not found in the empty JSON string", VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.class));

       return (TypeAdapter<T>) new TypeAdapter<VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard>() {
           @Override
           public void write(JsonWriter out, VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard
  * @throws IOException if the JSON string is invalid with respect to VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard
  */
  public static VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard.class);
  }

 /**
  * Convert an instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemVoucherLoyaltyCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

