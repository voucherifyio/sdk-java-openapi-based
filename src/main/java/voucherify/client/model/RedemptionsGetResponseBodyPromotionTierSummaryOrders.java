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
 * RedemptionsGetResponseBodyPromotionTierSummaryOrders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsGetResponseBodyPromotionTierSummaryOrders {
  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Integer totalAmount;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT = "total_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT)
  private Integer totalDiscountAmount;

  public RedemptionsGetResponseBodyPromotionTierSummaryOrders() {
  }

  public RedemptionsGetResponseBodyPromotionTierSummaryOrders totalAmount(Integer totalAmount) {
    
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


  public RedemptionsGetResponseBodyPromotionTierSummaryOrders totalDiscountAmount(Integer totalDiscountAmount) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionsGetResponseBodyPromotionTierSummaryOrders redemptionsGetResponseBodyPromotionTierSummaryOrders = (RedemptionsGetResponseBodyPromotionTierSummaryOrders) o;
    return Objects.equals(this.totalAmount, redemptionsGetResponseBodyPromotionTierSummaryOrders.totalAmount) &&
        Objects.equals(this.totalDiscountAmount, redemptionsGetResponseBodyPromotionTierSummaryOrders.totalDiscountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, totalDiscountAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionsGetResponseBodyPromotionTierSummaryOrders {\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
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
  * @throws IOException if the JSON Element is invalid with respect to RedemptionsGetResponseBodyPromotionTierSummaryOrders
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedemptionsGetResponseBodyPromotionTierSummaryOrders.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedemptionsGetResponseBodyPromotionTierSummaryOrders is not found in the empty JSON string", RedemptionsGetResponseBodyPromotionTierSummaryOrders.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RedemptionsGetResponseBodyPromotionTierSummaryOrders.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RedemptionsGetResponseBodyPromotionTierSummaryOrders` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsGetResponseBodyPromotionTierSummaryOrders.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsGetResponseBodyPromotionTierSummaryOrders' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsGetResponseBodyPromotionTierSummaryOrders> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsGetResponseBodyPromotionTierSummaryOrders.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsGetResponseBodyPromotionTierSummaryOrders>() {
           @Override
           public void write(JsonWriter out, RedemptionsGetResponseBodyPromotionTierSummaryOrders value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedemptionsGetResponseBodyPromotionTierSummaryOrders read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedemptionsGetResponseBodyPromotionTierSummaryOrders given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsGetResponseBodyPromotionTierSummaryOrders
  * @throws IOException if the JSON string is invalid with respect to RedemptionsGetResponseBodyPromotionTierSummaryOrders
  */
  public static RedemptionsGetResponseBodyPromotionTierSummaryOrders fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsGetResponseBodyPromotionTierSummaryOrders.class);
  }

 /**
  * Convert an instance of RedemptionsGetResponseBodyPromotionTierSummaryOrders to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
