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
 * CampaignLoyaltyCardExpirationRules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class CampaignLoyaltyCardExpirationRules {
  public static final String SERIALIZED_NAME_PERIOD_TYPE = "period_type";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private String periodType;

  public static final String SERIALIZED_NAME_PERIOD_VALUE = "period_value";
  @SerializedName(SERIALIZED_NAME_PERIOD_VALUE)
  private Integer periodValue;

  public static final String SERIALIZED_NAME_ROUNDING_TYPE = "rounding_type";
  @SerializedName(SERIALIZED_NAME_ROUNDING_TYPE)
  private String roundingType;

  public static final String SERIALIZED_NAME_ROUNDING_VALUE = "rounding_value";
  @SerializedName(SERIALIZED_NAME_ROUNDING_VALUE)
  private Integer roundingValue;

  public CampaignLoyaltyCardExpirationRules() {
  }

  public CampaignLoyaltyCardExpirationRules periodType(String periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * Type of period
   * @return periodType
  **/
  @javax.annotation.Nonnull
  public String getPeriodType() {
    return periodType;
  }


  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }


  public CampaignLoyaltyCardExpirationRules periodValue(Integer periodValue) {
    
    this.periodValue = periodValue;
    return this;
  }

   /**
   * Value of the period
   * @return periodValue
  **/
  @javax.annotation.Nonnull
  public Integer getPeriodValue() {
    return periodValue;
  }


  public void setPeriodValue(Integer periodValue) {
    this.periodValue = periodValue;
  }


  public CampaignLoyaltyCardExpirationRules roundingType(String roundingType) {
    
    this.roundingType = roundingType;
    return this;
  }

   /**
   * Type of rounding
   * @return roundingType
  **/
  @javax.annotation.Nonnull
  public String getRoundingType() {
    return roundingType;
  }


  public void setRoundingType(String roundingType) {
    this.roundingType = roundingType;
  }


  public CampaignLoyaltyCardExpirationRules roundingValue(Integer roundingValue) {
    
    this.roundingValue = roundingValue;
    return this;
  }

   /**
   * Value of rounding
   * @return roundingValue
  **/
  @javax.annotation.Nonnull
  public Integer getRoundingValue() {
    return roundingValue;
  }


  public void setRoundingValue(Integer roundingValue) {
    this.roundingValue = roundingValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignLoyaltyCardExpirationRules campaignLoyaltyCardExpirationRules = (CampaignLoyaltyCardExpirationRules) o;
    return Objects.equals(this.periodType, campaignLoyaltyCardExpirationRules.periodType) &&
        Objects.equals(this.periodValue, campaignLoyaltyCardExpirationRules.periodValue) &&
        Objects.equals(this.roundingType, campaignLoyaltyCardExpirationRules.roundingType) &&
        Objects.equals(this.roundingValue, campaignLoyaltyCardExpirationRules.roundingValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodType, periodValue, roundingType, roundingValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignLoyaltyCardExpirationRules {\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    periodValue: ").append(toIndentedString(periodValue)).append("\n");
    sb.append("    roundingType: ").append(toIndentedString(roundingType)).append("\n");
    sb.append("    roundingValue: ").append(toIndentedString(roundingValue)).append("\n");
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
    openapiFields.add("period_type");
    openapiFields.add("period_value");
    openapiFields.add("rounding_type");
    openapiFields.add("rounding_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("period_type");
    openapiRequiredFields.add("period_value");
    openapiRequiredFields.add("rounding_type");
    openapiRequiredFields.add("rounding_value");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignLoyaltyCardExpirationRules
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignLoyaltyCardExpirationRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignLoyaltyCardExpirationRules is not found in the empty JSON string", CampaignLoyaltyCardExpirationRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CampaignLoyaltyCardExpirationRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignLoyaltyCardExpirationRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CampaignLoyaltyCardExpirationRules.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_type").toString()));
      }
      if (!jsonObj.get("rounding_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rounding_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rounding_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignLoyaltyCardExpirationRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignLoyaltyCardExpirationRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignLoyaltyCardExpirationRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignLoyaltyCardExpirationRules.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignLoyaltyCardExpirationRules>() {
           @Override
           public void write(JsonWriter out, CampaignLoyaltyCardExpirationRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignLoyaltyCardExpirationRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignLoyaltyCardExpirationRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignLoyaltyCardExpirationRules
  * @throws IOException if the JSON string is invalid with respect to CampaignLoyaltyCardExpirationRules
  */
  public static CampaignLoyaltyCardExpirationRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignLoyaltyCardExpirationRules.class);
  }

 /**
  * Convert an instance of CampaignLoyaltyCardExpirationRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

