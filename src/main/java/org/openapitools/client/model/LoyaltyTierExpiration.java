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
import java.time.OffsetDateTime;
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
 * Defines loyalty tier expiration date.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class LoyaltyTierExpiration {
  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_TIER_ID = "tier_id";
  @SerializedName(SERIALIZED_NAME_TIER_ID)
  private String tierId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public LoyaltyTierExpiration() {
  }

  public LoyaltyTierExpiration customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer ID of the customer making the purchase.
   * @return customerId
  **/
  @javax.annotation.Nonnull
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public LoyaltyTierExpiration campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Unique campaign ID, assigned by Voucherify.
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public LoyaltyTierExpiration tierId(String tierId) {
    
    this.tierId = tierId;
    return this;
  }

   /**
   * Unique tier ID, assigned by Voucherify.
   * @return tierId
  **/
  @javax.annotation.Nonnull
  public String getTierId() {
    return tierId;
  }


  public void setTierId(String tierId) {
    this.tierId = tierId;
  }


  public LoyaltyTierExpiration startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the loyalty tier starts to be active in ISO 8601 format. Loyalty tier is inactive before this date.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public LoyaltyTierExpiration expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration timestamp defines when the loyalty tier expires in ISO 8601 format. Loyalty tier is inactive after this date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public LoyaltyTierExpiration createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the loyalty tier was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LoyaltyTierExpiration updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the loyalty tier was updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTierExpiration loyaltyTierExpiration = (LoyaltyTierExpiration) o;
    return Objects.equals(this.customerId, loyaltyTierExpiration.customerId) &&
        Objects.equals(this.campaignId, loyaltyTierExpiration.campaignId) &&
        Objects.equals(this.tierId, loyaltyTierExpiration.tierId) &&
        Objects.equals(this.startDate, loyaltyTierExpiration.startDate) &&
        Objects.equals(this.expirationDate, loyaltyTierExpiration.expirationDate) &&
        Objects.equals(this.createdAt, loyaltyTierExpiration.createdAt) &&
        Objects.equals(this.updatedAt, loyaltyTierExpiration.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, campaignId, tierId, startDate, expirationDate, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTierExpiration {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    tierId: ").append(toIndentedString(tierId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("customer_id");
    openapiFields.add("campaign_id");
    openapiFields.add("tier_id");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customer_id");
    openapiRequiredFields.add("campaign_id");
    openapiRequiredFields.add("tier_id");
    openapiRequiredFields.add("created_at");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltyTierExpiration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltyTierExpiration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltyTierExpiration is not found in the empty JSON string", LoyaltyTierExpiration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltyTierExpiration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltyTierExpiration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltyTierExpiration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if (!jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      if (!jsonObj.get("tier_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tier_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tier_id").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("expiration_date") != null && !jsonObj.get("expiration_date").isJsonNull()) && !jsonObj.get("expiration_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltyTierExpiration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltyTierExpiration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltyTierExpiration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltyTierExpiration.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltyTierExpiration>() {
           @Override
           public void write(JsonWriter out, LoyaltyTierExpiration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltyTierExpiration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltyTierExpiration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltyTierExpiration
  * @throws IOException if the JSON string is invalid with respect to LoyaltyTierExpiration
  */
  public static LoyaltyTierExpiration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltyTierExpiration.class);
  }

 /**
  * Convert an instance of LoyaltyTierExpiration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

