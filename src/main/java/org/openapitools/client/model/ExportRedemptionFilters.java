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
import org.openapitools.client.model.FieldConditions;
import org.openapitools.client.model.Junction;

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
 * ExportRedemptionFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class ExportRedemptionFilters {
  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private FieldConditions id;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private FieldConditions _object;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private FieldConditions date;

  public static final String SERIALIZED_NAME_VOUCHER_CODE = "voucher_code";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODE)
  private FieldConditions voucherCode;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private FieldConditions campaign;

  public static final String SERIALIZED_NAME_PROMOTION_TIER_ID = "promotion_tier_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_TIER_ID)
  private FieldConditions promotionTierId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private FieldConditions customerId;

  public static final String SERIALIZED_NAME_CUSTOMER_SOURCE_ID = "customer_source_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SOURCE_ID)
  private FieldConditions customerSourceId;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private FieldConditions customerName;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private FieldConditions trackingId;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private FieldConditions orderAmount;

  public static final String SERIALIZED_NAME_GIFT_AMOUNT = "gift_amount";
  @SerializedName(SERIALIZED_NAME_GIFT_AMOUNT)
  private FieldConditions giftAmount;

  public static final String SERIALIZED_NAME_LOYALTY_POINTS = "loyalty_points";
  @SerializedName(SERIALIZED_NAME_LOYALTY_POINTS)
  private FieldConditions loyaltyPoints;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private FieldConditions result;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private FieldConditions failureCode;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private FieldConditions failureMessage;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private FieldConditions metadata;

  public ExportRedemptionFilters() {
  }

  public ExportRedemptionFilters junction(Junction junction) {
    
    this.junction = junction;
    return this;
  }

   /**
   * Get junction
   * @return junction
  **/
  @javax.annotation.Nullable
  public Junction getJunction() {
    return junction;
  }


  public void setJunction(Junction junction) {
    this.junction = junction;
  }


  public ExportRedemptionFilters id(FieldConditions id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public FieldConditions getId() {
    return id;
  }


  public void setId(FieldConditions id) {
    this.id = id;
  }


  public ExportRedemptionFilters _object(FieldConditions _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  public FieldConditions getObject() {
    return _object;
  }


  public void setObject(FieldConditions _object) {
    this._object = _object;
  }


  public ExportRedemptionFilters date(FieldConditions date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  public FieldConditions getDate() {
    return date;
  }


  public void setDate(FieldConditions date) {
    this.date = date;
  }


  public ExportRedemptionFilters voucherCode(FieldConditions voucherCode) {
    
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * Get voucherCode
   * @return voucherCode
  **/
  @javax.annotation.Nullable
  public FieldConditions getVoucherCode() {
    return voucherCode;
  }


  public void setVoucherCode(FieldConditions voucherCode) {
    this.voucherCode = voucherCode;
  }


  public ExportRedemptionFilters campaign(FieldConditions campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  public FieldConditions getCampaign() {
    return campaign;
  }


  public void setCampaign(FieldConditions campaign) {
    this.campaign = campaign;
  }


  public ExportRedemptionFilters promotionTierId(FieldConditions promotionTierId) {
    
    this.promotionTierId = promotionTierId;
    return this;
  }

   /**
   * Get promotionTierId
   * @return promotionTierId
  **/
  @javax.annotation.Nullable
  public FieldConditions getPromotionTierId() {
    return promotionTierId;
  }


  public void setPromotionTierId(FieldConditions promotionTierId) {
    this.promotionTierId = promotionTierId;
  }


  public ExportRedemptionFilters customerId(FieldConditions customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  public FieldConditions getCustomerId() {
    return customerId;
  }


  public void setCustomerId(FieldConditions customerId) {
    this.customerId = customerId;
  }


  public ExportRedemptionFilters customerSourceId(FieldConditions customerSourceId) {
    
    this.customerSourceId = customerSourceId;
    return this;
  }

   /**
   * Get customerSourceId
   * @return customerSourceId
  **/
  @javax.annotation.Nullable
  public FieldConditions getCustomerSourceId() {
    return customerSourceId;
  }


  public void setCustomerSourceId(FieldConditions customerSourceId) {
    this.customerSourceId = customerSourceId;
  }


  public ExportRedemptionFilters customerName(FieldConditions customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @javax.annotation.Nullable
  public FieldConditions getCustomerName() {
    return customerName;
  }


  public void setCustomerName(FieldConditions customerName) {
    this.customerName = customerName;
  }


  public ExportRedemptionFilters trackingId(FieldConditions trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public FieldConditions getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(FieldConditions trackingId) {
    this.trackingId = trackingId;
  }


  public ExportRedemptionFilters orderAmount(FieldConditions orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * Get orderAmount
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  public FieldConditions getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(FieldConditions orderAmount) {
    this.orderAmount = orderAmount;
  }


  public ExportRedemptionFilters giftAmount(FieldConditions giftAmount) {
    
    this.giftAmount = giftAmount;
    return this;
  }

   /**
   * Get giftAmount
   * @return giftAmount
  **/
  @javax.annotation.Nullable
  public FieldConditions getGiftAmount() {
    return giftAmount;
  }


  public void setGiftAmount(FieldConditions giftAmount) {
    this.giftAmount = giftAmount;
  }


  public ExportRedemptionFilters loyaltyPoints(FieldConditions loyaltyPoints) {
    
    this.loyaltyPoints = loyaltyPoints;
    return this;
  }

   /**
   * Get loyaltyPoints
   * @return loyaltyPoints
  **/
  @javax.annotation.Nullable
  public FieldConditions getLoyaltyPoints() {
    return loyaltyPoints;
  }


  public void setLoyaltyPoints(FieldConditions loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
  }


  public ExportRedemptionFilters result(FieldConditions result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public FieldConditions getResult() {
    return result;
  }


  public void setResult(FieldConditions result) {
    this.result = result;
  }


  public ExportRedemptionFilters failureCode(FieldConditions failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Get failureCode
   * @return failureCode
  **/
  @javax.annotation.Nullable
  public FieldConditions getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(FieldConditions failureCode) {
    this.failureCode = failureCode;
  }


  public ExportRedemptionFilters failureMessage(FieldConditions failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * Get failureMessage
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  public FieldConditions getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(FieldConditions failureMessage) {
    this.failureMessage = failureMessage;
  }


  public ExportRedemptionFilters metadata(FieldConditions metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public FieldConditions getMetadata() {
    return metadata;
  }


  public void setMetadata(FieldConditions metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportRedemptionFilters exportRedemptionFilters = (ExportRedemptionFilters) o;
    return Objects.equals(this.junction, exportRedemptionFilters.junction) &&
        Objects.equals(this.id, exportRedemptionFilters.id) &&
        Objects.equals(this._object, exportRedemptionFilters._object) &&
        Objects.equals(this.date, exportRedemptionFilters.date) &&
        Objects.equals(this.voucherCode, exportRedemptionFilters.voucherCode) &&
        Objects.equals(this.campaign, exportRedemptionFilters.campaign) &&
        Objects.equals(this.promotionTierId, exportRedemptionFilters.promotionTierId) &&
        Objects.equals(this.customerId, exportRedemptionFilters.customerId) &&
        Objects.equals(this.customerSourceId, exportRedemptionFilters.customerSourceId) &&
        Objects.equals(this.customerName, exportRedemptionFilters.customerName) &&
        Objects.equals(this.trackingId, exportRedemptionFilters.trackingId) &&
        Objects.equals(this.orderAmount, exportRedemptionFilters.orderAmount) &&
        Objects.equals(this.giftAmount, exportRedemptionFilters.giftAmount) &&
        Objects.equals(this.loyaltyPoints, exportRedemptionFilters.loyaltyPoints) &&
        Objects.equals(this.result, exportRedemptionFilters.result) &&
        Objects.equals(this.failureCode, exportRedemptionFilters.failureCode) &&
        Objects.equals(this.failureMessage, exportRedemptionFilters.failureMessage) &&
        Objects.equals(this.metadata, exportRedemptionFilters.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junction, id, _object, date, voucherCode, campaign, promotionTierId, customerId, customerSourceId, customerName, trackingId, orderAmount, giftAmount, loyaltyPoints, result, failureCode, failureMessage, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportRedemptionFilters {\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    promotionTierId: ").append(toIndentedString(promotionTierId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerSourceId: ").append(toIndentedString(customerSourceId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    giftAmount: ").append(toIndentedString(giftAmount)).append("\n");
    sb.append("    loyaltyPoints: ").append(toIndentedString(loyaltyPoints)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("junction");
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("date");
    openapiFields.add("voucher_code");
    openapiFields.add("campaign");
    openapiFields.add("promotion_tier_id");
    openapiFields.add("customer_id");
    openapiFields.add("customer_source_id");
    openapiFields.add("customer_name");
    openapiFields.add("tracking_id");
    openapiFields.add("order_amount");
    openapiFields.add("gift_amount");
    openapiFields.add("loyalty_points");
    openapiFields.add("result");
    openapiFields.add("failure_code");
    openapiFields.add("failure_message");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportRedemptionFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportRedemptionFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportRedemptionFilters is not found in the empty JSON string", ExportRedemptionFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportRedemptionFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportRedemptionFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("id"));
      }
      // validate the optional field `object`
      if (jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("object"));
      }
      // validate the optional field `date`
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("date"));
      }
      // validate the optional field `voucher_code`
      if (jsonObj.get("voucher_code") != null && !jsonObj.get("voucher_code").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("voucher_code"));
      }
      // validate the optional field `campaign`
      if (jsonObj.get("campaign") != null && !jsonObj.get("campaign").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("campaign"));
      }
      // validate the optional field `promotion_tier_id`
      if (jsonObj.get("promotion_tier_id") != null && !jsonObj.get("promotion_tier_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("promotion_tier_id"));
      }
      // validate the optional field `customer_id`
      if (jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("customer_id"));
      }
      // validate the optional field `customer_source_id`
      if (jsonObj.get("customer_source_id") != null && !jsonObj.get("customer_source_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("customer_source_id"));
      }
      // validate the optional field `customer_name`
      if (jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("customer_name"));
      }
      // validate the optional field `tracking_id`
      if (jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("tracking_id"));
      }
      // validate the optional field `order_amount`
      if (jsonObj.get("order_amount") != null && !jsonObj.get("order_amount").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("order_amount"));
      }
      // validate the optional field `gift_amount`
      if (jsonObj.get("gift_amount") != null && !jsonObj.get("gift_amount").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("gift_amount"));
      }
      // validate the optional field `loyalty_points`
      if (jsonObj.get("loyalty_points") != null && !jsonObj.get("loyalty_points").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("loyalty_points"));
      }
      // validate the optional field `result`
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("result"));
      }
      // validate the optional field `failure_code`
      if (jsonObj.get("failure_code") != null && !jsonObj.get("failure_code").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("failure_code"));
      }
      // validate the optional field `failure_message`
      if (jsonObj.get("failure_message") != null && !jsonObj.get("failure_message").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("failure_message"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportRedemptionFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportRedemptionFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportRedemptionFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportRedemptionFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportRedemptionFilters>() {
           @Override
           public void write(JsonWriter out, ExportRedemptionFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportRedemptionFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportRedemptionFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportRedemptionFilters
  * @throws IOException if the JSON string is invalid with respect to ExportRedemptionFilters
  */
  public static ExportRedemptionFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportRedemptionFilters.class);
  }

 /**
  * Convert an instance of ExportRedemptionFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

