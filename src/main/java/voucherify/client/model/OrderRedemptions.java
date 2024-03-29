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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * OrderRedemptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrderRedemptions {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROLLBACK_ID = "rollback_id";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_ID)
  private String rollbackId;

  public static final String SERIALIZED_NAME_ROLLBACK_DATE = "rollback_date";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_DATE)
  private OffsetDateTime rollbackDate;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "related_object_type";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  private String relatedObjectType = "redemption";

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private String relatedObjectId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_PARENT_ID = "related_object_parent_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_PARENT_ID)
  private String relatedObjectParentId;

  public static final String SERIALIZED_NAME_STACKED = "stacked";
  @SerializedName(SERIALIZED_NAME_STACKED)
  private List<String> stacked;

  public static final String SERIALIZED_NAME_ROLLBACK_STACKED = "rollback_stacked";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_STACKED)
  private List<String> rollbackStacked;

  public OrderRedemptions() {
  }

  public OrderRedemptions date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Timestamp representing the date and time when the redemption was created in ISO 8601 format.
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public OrderRedemptions rollbackId(String rollbackId) {
    
    this.rollbackId = rollbackId;
    return this;
  }

   /**
   * Unique ID of the redemption rollback.
   * @return rollbackId
  **/
  @javax.annotation.Nullable
  public String getRollbackId() {
    return rollbackId;
  }


  public void setRollbackId(String rollbackId) {
    this.rollbackId = rollbackId;
  }


  public OrderRedemptions rollbackDate(OffsetDateTime rollbackDate) {
    
    this.rollbackDate = rollbackDate;
    return this;
  }

   /**
   * Timestamp representing the date and tiem when the redemption rollback was created in ISO 8601 format.
   * @return rollbackDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRollbackDate() {
    return rollbackDate;
  }


  public void setRollbackDate(OffsetDateTime rollbackDate) {
    this.rollbackDate = rollbackDate;
  }


  public OrderRedemptions relatedObjectType(String relatedObjectType) {
    
    this.relatedObjectType = relatedObjectType;
    return this;
  }

   /**
   * The source of the incentive.
   * @return relatedObjectType
  **/
  @javax.annotation.Nullable
  public String getRelatedObjectType() {
    return relatedObjectType;
  }


  public void setRelatedObjectType(String relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public OrderRedemptions relatedObjectId(String relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * Unique ID of the parent redemption.
   * @return relatedObjectId
  **/
  @javax.annotation.Nullable
  public String getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public OrderRedemptions relatedObjectParentId(String relatedObjectParentId) {
    
    this.relatedObjectParentId = relatedObjectParentId;
    return this;
  }

   /**
   * Represent&#39;s the campaign ID of the voucher if the redemption was based on a voucher that was part of bulk codes generated within a campaign. In case of a promotion tier, this represents the campaign ID of the promotion tier&#39;s parent campaign.
   * @return relatedObjectParentId
  **/
  @javax.annotation.Nullable
  public String getRelatedObjectParentId() {
    return relatedObjectParentId;
  }


  public void setRelatedObjectParentId(String relatedObjectParentId) {
    this.relatedObjectParentId = relatedObjectParentId;
  }


  public OrderRedemptions stacked(List<String> stacked) {
    
    this.stacked = stacked;
    return this;
  }

  public OrderRedemptions addStackedItem(String stackedItem) {
    if (this.stacked == null) {
      this.stacked = new ArrayList<>();
    }
    this.stacked.add(stackedItem);
    return this;
  }

   /**
   * Contains a list of unique IDs of child redemptions, which belong to the stacked incentives.
   * @return stacked
  **/
  @javax.annotation.Nullable
  public List<String> getStacked() {
    return stacked;
  }


  public void setStacked(List<String> stacked) {
    this.stacked = stacked;
  }


  public OrderRedemptions rollbackStacked(List<String> rollbackStacked) {
    
    this.rollbackStacked = rollbackStacked;
    return this;
  }

  public OrderRedemptions addRollbackStackedItem(String rollbackStackedItem) {
    if (this.rollbackStacked == null) {
      this.rollbackStacked = new ArrayList<>();
    }
    this.rollbackStacked.add(rollbackStackedItem);
    return this;
  }

   /**
   * Lists the rollback redemption IDs of the particular child redemptions.
   * @return rollbackStacked
  **/
  @javax.annotation.Nullable
  public List<String> getRollbackStacked() {
    return rollbackStacked;
  }


  public void setRollbackStacked(List<String> rollbackStacked) {
    this.rollbackStacked = rollbackStacked;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRedemptions orderRedemptions = (OrderRedemptions) o;
    return Objects.equals(this.date, orderRedemptions.date) &&
        Objects.equals(this.rollbackId, orderRedemptions.rollbackId) &&
        Objects.equals(this.rollbackDate, orderRedemptions.rollbackDate) &&
        Objects.equals(this.relatedObjectType, orderRedemptions.relatedObjectType) &&
        Objects.equals(this.relatedObjectId, orderRedemptions.relatedObjectId) &&
        Objects.equals(this.relatedObjectParentId, orderRedemptions.relatedObjectParentId) &&
        Objects.equals(this.stacked, orderRedemptions.stacked) &&
        Objects.equals(this.rollbackStacked, orderRedemptions.rollbackStacked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, rollbackId, rollbackDate, relatedObjectType, relatedObjectId, relatedObjectParentId, stacked, rollbackStacked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRedemptions {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    rollbackId: ").append(toIndentedString(rollbackId)).append("\n");
    sb.append("    rollbackDate: ").append(toIndentedString(rollbackDate)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    relatedObjectParentId: ").append(toIndentedString(relatedObjectParentId)).append("\n");
    sb.append("    stacked: ").append(toIndentedString(stacked)).append("\n");
    sb.append("    rollbackStacked: ").append(toIndentedString(rollbackStacked)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("rollback_id");
    openapiFields.add("rollback_date");
    openapiFields.add("related_object_type");
    openapiFields.add("related_object_id");
    openapiFields.add("related_object_parent_id");
    openapiFields.add("stacked");
    openapiFields.add("rollback_stacked");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderRedemptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderRedemptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderRedemptions is not found in the empty JSON string", OrderRedemptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderRedemptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderRedemptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("rollback_id") != null && !jsonObj.get("rollback_id").isJsonNull()) && !jsonObj.get("rollback_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rollback_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rollback_id").toString()));
      }
      if ((jsonObj.get("related_object_type") != null && !jsonObj.get("related_object_type").isJsonNull()) && !jsonObj.get("related_object_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_object_type").toString()));
      }
      if ((jsonObj.get("related_object_id") != null && !jsonObj.get("related_object_id").isJsonNull()) && !jsonObj.get("related_object_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_object_id").toString()));
      }
      if ((jsonObj.get("related_object_parent_id") != null && !jsonObj.get("related_object_parent_id").isJsonNull()) && !jsonObj.get("related_object_parent_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object_parent_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_object_parent_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("stacked") != null && !jsonObj.get("stacked").isJsonNull() && !jsonObj.get("stacked").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `stacked` to be an array in the JSON string but got `%s`", jsonObj.get("stacked").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rollback_stacked") != null && !jsonObj.get("rollback_stacked").isJsonNull() && !jsonObj.get("rollback_stacked").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rollback_stacked` to be an array in the JSON string but got `%s`", jsonObj.get("rollback_stacked").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderRedemptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderRedemptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderRedemptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderRedemptions.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderRedemptions>() {
           @Override
           public void write(JsonWriter out, OrderRedemptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderRedemptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderRedemptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderRedemptions
  * @throws IOException if the JSON string is invalid with respect to OrderRedemptions
  */
  public static OrderRedemptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderRedemptions.class);
  }

 /**
  * Convert an instance of OrderRedemptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

