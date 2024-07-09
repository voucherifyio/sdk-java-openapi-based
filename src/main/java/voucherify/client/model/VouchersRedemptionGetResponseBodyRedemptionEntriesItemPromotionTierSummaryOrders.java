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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Integer totalAmount;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT = "total_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT)
  private Integer totalDiscountAmount;

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders() {
  }

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders totalAmount(Integer totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Sum of order totals.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders totalDiscountAmount(Integer totalDiscountAmount) {
    
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * Sum of total discount applied using the promotion tier.
   * @return totalDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalDiscountAmount() {
    return totalDiscountAmount;
  }


  public void setTotalDiscountAmount(Integer totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders instance itself
   */
  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders vouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders = (VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders) o;
    return Objects.equals(this.totalAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders.totalAmount) &&
        Objects.equals(this.totalDiscountAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders.totalDiscountAmount)&&
        Objects.equals(this.additionalProperties, vouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, totalDiscountAmount, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders {\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("total_amount");
    openapiFields.add("total_discount_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders.class));

       return (TypeAdapter<T>) new TypeAdapter<VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders>() {
           @Override
           public void write(JsonWriter out, VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     return null;
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders
  * @throws IOException if the JSON string is invalid with respect to VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders
  */
  public static VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders.class);
  }

 /**
  * Convert an instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemPromotionTierSummaryOrders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

