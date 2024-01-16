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
import org.openapitools.client.model.LoyaltyTiersExpirationAllExpirationDate;
import org.openapitools.client.model.LoyaltyTiersExpirationAllStartDate;

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
 * Defines the Loyalty Tiers Expiration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class LoyaltyTiersExpirationAll {
  /**
   * Tier qualification.     &#x60;BALANCE&#x60;: Points balance is based on the customer&#39;s current points balance. Customers qualify for the tier if their points balance is in the points range of the tier.   &#x60;POINTS_IN_PERIOD&#x60;: A customer qualifies for the tier only if the sum of the accumulated points in a **defined time interval** reaches the tier threshold.
   */
  @JsonAdapter(QualificationTypeEnum.Adapter.class)
  public enum QualificationTypeEnum {
    BALANCE("BALANCE"),
    
    POINTS_IN_PERIOD("POINTS_IN_PERIOD");

    private String value;

    QualificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualificationTypeEnum fromValue(String value) {
      for (QualificationTypeEnum b : QualificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualificationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUALIFICATION_TYPE = "qualification_type";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_TYPE)
  private QualificationTypeEnum qualificationType;

  /**
   * Customers can qualify for the tier if they collected enough points in a given time period. So, in addition to the customer having to reach a points range, they also need to have collected the points within a set time period.      | **Period** | **Definition** | |:---|:---| | **Calendar Month** | Points collected in one calendar month&lt;br&gt;January, February, March, etc. | | **Calendar Quarter** | Points collected in the quarter&lt;br&gt;- January - March&lt;br&gt;- April - June&lt;br&gt;- July - September&lt;br&gt;- October - December | | **Calendar Half-year** | Points collected in the half-year&lt;br&gt;- January - June&lt;br&gt;- July - December | | **Calendar Year** | Points collected in one calendar year&lt;br&gt;January - December |
   */
  @JsonAdapter(QualificationPeriodEnum.Adapter.class)
  public enum QualificationPeriodEnum {
    MONTH("MONTH"),
    
    QUARTER("QUARTER"),
    
    HALF_YEAR("HALF_YEAR"),
    
    YEAR("YEAR");

    private String value;

    QualificationPeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualificationPeriodEnum fromValue(String value) {
      for (QualificationPeriodEnum b : QualificationPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualificationPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualificationPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualificationPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualificationPeriodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUALIFICATION_PERIOD = "qualification_period";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_PERIOD)
  private QualificationPeriodEnum qualificationPeriod;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LoyaltyTiersExpirationAllStartDate startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private LoyaltyTiersExpirationAllExpirationDate expirationDate;

  public LoyaltyTiersExpirationAll() {
  }

  public LoyaltyTiersExpirationAll qualificationType(QualificationTypeEnum qualificationType) {
    
    this.qualificationType = qualificationType;
    return this;
  }

   /**
   * Tier qualification.     &#x60;BALANCE&#x60;: Points balance is based on the customer&#39;s current points balance. Customers qualify for the tier if their points balance is in the points range of the tier.   &#x60;POINTS_IN_PERIOD&#x60;: A customer qualifies for the tier only if the sum of the accumulated points in a **defined time interval** reaches the tier threshold.
   * @return qualificationType
  **/
  @javax.annotation.Nonnull
  public QualificationTypeEnum getQualificationType() {
    return qualificationType;
  }


  public void setQualificationType(QualificationTypeEnum qualificationType) {
    this.qualificationType = qualificationType;
  }


  public LoyaltyTiersExpirationAll qualificationPeriod(QualificationPeriodEnum qualificationPeriod) {
    
    this.qualificationPeriod = qualificationPeriod;
    return this;
  }

   /**
   * Customers can qualify for the tier if they collected enough points in a given time period. So, in addition to the customer having to reach a points range, they also need to have collected the points within a set time period.      | **Period** | **Definition** | |:---|:---| | **Calendar Month** | Points collected in one calendar month&lt;br&gt;January, February, March, etc. | | **Calendar Quarter** | Points collected in the quarter&lt;br&gt;- January - March&lt;br&gt;- April - June&lt;br&gt;- July - September&lt;br&gt;- October - December | | **Calendar Half-year** | Points collected in the half-year&lt;br&gt;- January - June&lt;br&gt;- July - December | | **Calendar Year** | Points collected in one calendar year&lt;br&gt;January - December |
   * @return qualificationPeriod
  **/
  @javax.annotation.Nullable
  public QualificationPeriodEnum getQualificationPeriod() {
    return qualificationPeriod;
  }


  public void setQualificationPeriod(QualificationPeriodEnum qualificationPeriod) {
    this.qualificationPeriod = qualificationPeriod;
  }


  public LoyaltyTiersExpirationAll startDate(LoyaltyTiersExpirationAllStartDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public LoyaltyTiersExpirationAllStartDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LoyaltyTiersExpirationAllStartDate startDate) {
    this.startDate = startDate;
  }


  public LoyaltyTiersExpirationAll expirationDate(LoyaltyTiersExpirationAllExpirationDate expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nonnull
  public LoyaltyTiersExpirationAllExpirationDate getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(LoyaltyTiersExpirationAllExpirationDate expirationDate) {
    this.expirationDate = expirationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTiersExpirationAll loyaltyTiersExpirationAll = (LoyaltyTiersExpirationAll) o;
    return Objects.equals(this.qualificationType, loyaltyTiersExpirationAll.qualificationType) &&
        Objects.equals(this.qualificationPeriod, loyaltyTiersExpirationAll.qualificationPeriod) &&
        Objects.equals(this.startDate, loyaltyTiersExpirationAll.startDate) &&
        Objects.equals(this.expirationDate, loyaltyTiersExpirationAll.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualificationType, qualificationPeriod, startDate, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTiersExpirationAll {\n");
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    qualificationPeriod: ").append(toIndentedString(qualificationPeriod)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("qualification_type");
    openapiFields.add("qualification_period");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("qualification_type");
    openapiRequiredFields.add("start_date");
    openapiRequiredFields.add("expiration_date");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltyTiersExpirationAll
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltyTiersExpirationAll.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltyTiersExpirationAll is not found in the empty JSON string", LoyaltyTiersExpirationAll.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltyTiersExpirationAll.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltyTiersExpirationAll` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltyTiersExpirationAll.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("qualification_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualification_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualification_type").toString()));
      }
      if ((jsonObj.get("qualification_period") != null && !jsonObj.get("qualification_period").isJsonNull()) && !jsonObj.get("qualification_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qualification_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qualification_period").toString()));
      }
      // validate the required field `start_date`
      LoyaltyTiersExpirationAllStartDate.validateJsonElement(jsonObj.get("start_date"));
      // validate the required field `expiration_date`
      LoyaltyTiersExpirationAllExpirationDate.validateJsonElement(jsonObj.get("expiration_date"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltyTiersExpirationAll.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltyTiersExpirationAll' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltyTiersExpirationAll> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltyTiersExpirationAll.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltyTiersExpirationAll>() {
           @Override
           public void write(JsonWriter out, LoyaltyTiersExpirationAll value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltyTiersExpirationAll read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltyTiersExpirationAll given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltyTiersExpirationAll
  * @throws IOException if the JSON string is invalid with respect to LoyaltyTiersExpirationAll
  */
  public static LoyaltyTiersExpirationAll fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltyTiersExpirationAll.class);
  }

 /**
  * Convert an instance of LoyaltyTiersExpirationAll to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

