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
 * Contains details about the point balances left on loyalty cards and the number of referred customers in each campaign.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class CustomerLoyaltyCampaignsValue {
  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_LOYALTY_TIER = "loyalty_tier";
  @SerializedName(SERIALIZED_NAME_LOYALTY_TIER)
  private String loyaltyTier;

  public static final String SERIALIZED_NAME_REFERRED_CUSTOMERS = "referred_customers";
  @SerializedName(SERIALIZED_NAME_REFERRED_CUSTOMERS)
  private Integer referredCustomers;

  public CustomerLoyaltyCampaignsValue() {
  }

  public CustomerLoyaltyCampaignsValue points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Remaining point balance in campaign.
   * @return points
  **/
  @javax.annotation.Nullable
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public CustomerLoyaltyCampaignsValue loyaltyTier(String loyaltyTier) {
    
    this.loyaltyTier = loyaltyTier;
    return this;
  }

   /**
   * Customer&#39;s loyalty tier within the campaign.
   * @return loyaltyTier
  **/
  @javax.annotation.Nullable
  public String getLoyaltyTier() {
    return loyaltyTier;
  }


  public void setLoyaltyTier(String loyaltyTier) {
    this.loyaltyTier = loyaltyTier;
  }


  public CustomerLoyaltyCampaignsValue referredCustomers(Integer referredCustomers) {
    
    this.referredCustomers = referredCustomers;
    return this;
  }

   /**
   * Number of customers referred by the customer in campaign.
   * @return referredCustomers
  **/
  @javax.annotation.Nullable
  public Integer getReferredCustomers() {
    return referredCustomers;
  }


  public void setReferredCustomers(Integer referredCustomers) {
    this.referredCustomers = referredCustomers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLoyaltyCampaignsValue customerLoyaltyCampaignsValue = (CustomerLoyaltyCampaignsValue) o;
    return Objects.equals(this.points, customerLoyaltyCampaignsValue.points) &&
        Objects.equals(this.loyaltyTier, customerLoyaltyCampaignsValue.loyaltyTier) &&
        Objects.equals(this.referredCustomers, customerLoyaltyCampaignsValue.referredCustomers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, loyaltyTier, referredCustomers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLoyaltyCampaignsValue {\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    loyaltyTier: ").append(toIndentedString(loyaltyTier)).append("\n");
    sb.append("    referredCustomers: ").append(toIndentedString(referredCustomers)).append("\n");
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
    openapiFields.add("loyalty_tier");
    openapiFields.add("referred_customers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerLoyaltyCampaignsValue
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerLoyaltyCampaignsValue.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerLoyaltyCampaignsValue is not found in the empty JSON string", CustomerLoyaltyCampaignsValue.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerLoyaltyCampaignsValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerLoyaltyCampaignsValue` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("loyalty_tier") != null && !jsonObj.get("loyalty_tier").isJsonNull()) && !jsonObj.get("loyalty_tier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loyalty_tier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loyalty_tier").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerLoyaltyCampaignsValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerLoyaltyCampaignsValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerLoyaltyCampaignsValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerLoyaltyCampaignsValue.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerLoyaltyCampaignsValue>() {
           @Override
           public void write(JsonWriter out, CustomerLoyaltyCampaignsValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerLoyaltyCampaignsValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerLoyaltyCampaignsValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerLoyaltyCampaignsValue
  * @throws IOException if the JSON string is invalid with respect to CustomerLoyaltyCampaignsValue
  */
  public static CustomerLoyaltyCampaignsValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerLoyaltyCampaignsValue.class);
  }

 /**
  * Convert an instance of CustomerLoyaltyCampaignsValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

