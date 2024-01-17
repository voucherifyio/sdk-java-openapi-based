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
import voucherify.client.model.OrderCalculated;
import voucherify.client.model.QualificationsRedeemables;
import voucherify.client.model.QualificationsStackingRules;

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
 * Response body schema for **POST** &#x60;/qualifications&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:00:53.208514+01:00[Europe/Warsaw]")
public class QualificationsCheckEligibilityResponseBody {
  public static final String SERIALIZED_NAME_REDEEMABLES = "redeemables";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES)
  private QualificationsRedeemables redeemables;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_STACKING_RULES = "stacking_rules";
  @SerializedName(SERIALIZED_NAME_STACKING_RULES)
  private QualificationsStackingRules stackingRules;

  public QualificationsCheckEligibilityResponseBody() {
  }

  public QualificationsCheckEligibilityResponseBody redeemables(QualificationsRedeemables redeemables) {
    
    this.redeemables = redeemables;
    return this;
  }

   /**
   * Get redeemables
   * @return redeemables
  **/
  @javax.annotation.Nullable
  public QualificationsRedeemables getRedeemables() {
    return redeemables;
  }


  public void setRedeemables(QualificationsRedeemables redeemables) {
    this.redeemables = redeemables;
  }


  public QualificationsCheckEligibilityResponseBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * This identifier is generated during voucher qualification based on your internal id (e.g., email, database ID). This is a hashed customer source ID.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public QualificationsCheckEligibilityResponseBody order(OrderCalculated order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderCalculated getOrder() {
    return order;
  }


  public void setOrder(OrderCalculated order) {
    this.order = order;
  }


  public QualificationsCheckEligibilityResponseBody stackingRules(QualificationsStackingRules stackingRules) {
    
    this.stackingRules = stackingRules;
    return this;
  }

   /**
   * Get stackingRules
   * @return stackingRules
  **/
  @javax.annotation.Nullable
  public QualificationsStackingRules getStackingRules() {
    return stackingRules;
  }


  public void setStackingRules(QualificationsStackingRules stackingRules) {
    this.stackingRules = stackingRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationsCheckEligibilityResponseBody qualificationsCheckEligibilityResponseBody = (QualificationsCheckEligibilityResponseBody) o;
    return Objects.equals(this.redeemables, qualificationsCheckEligibilityResponseBody.redeemables) &&
        Objects.equals(this.trackingId, qualificationsCheckEligibilityResponseBody.trackingId) &&
        Objects.equals(this.order, qualificationsCheckEligibilityResponseBody.order) &&
        Objects.equals(this.stackingRules, qualificationsCheckEligibilityResponseBody.stackingRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redeemables, trackingId, order, stackingRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualificationsCheckEligibilityResponseBody {\n");
    sb.append("    redeemables: ").append(toIndentedString(redeemables)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    stackingRules: ").append(toIndentedString(stackingRules)).append("\n");
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
    openapiFields.add("redeemables");
    openapiFields.add("tracking_id");
    openapiFields.add("order");
    openapiFields.add("stacking_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QualificationsCheckEligibilityResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QualificationsCheckEligibilityResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QualificationsCheckEligibilityResponseBody is not found in the empty JSON string", QualificationsCheckEligibilityResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QualificationsCheckEligibilityResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QualificationsCheckEligibilityResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `redeemables`
      if (jsonObj.get("redeemables") != null && !jsonObj.get("redeemables").isJsonNull()) {
        QualificationsRedeemables.validateJsonElement(jsonObj.get("redeemables"));
      }
      if ((jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) && !jsonObj.get("tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_id").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        OrderCalculated.validateJsonElement(jsonObj.get("order"));
      }
      // validate the optional field `stacking_rules`
      if (jsonObj.get("stacking_rules") != null && !jsonObj.get("stacking_rules").isJsonNull()) {
        QualificationsStackingRules.validateJsonElement(jsonObj.get("stacking_rules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationsCheckEligibilityResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationsCheckEligibilityResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationsCheckEligibilityResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationsCheckEligibilityResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationsCheckEligibilityResponseBody>() {
           @Override
           public void write(JsonWriter out, QualificationsCheckEligibilityResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QualificationsCheckEligibilityResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QualificationsCheckEligibilityResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationsCheckEligibilityResponseBody
  * @throws IOException if the JSON string is invalid with respect to QualificationsCheckEligibilityResponseBody
  */
  public static QualificationsCheckEligibilityResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationsCheckEligibilityResponseBody.class);
  }

 /**
  * Convert an instance of QualificationsCheckEligibilityResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
