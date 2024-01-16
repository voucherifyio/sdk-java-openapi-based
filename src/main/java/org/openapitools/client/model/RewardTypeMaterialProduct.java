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
 * Contains information about the product given as a reward.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class RewardTypeMaterialProduct {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SKU_ID = "sku_id";
  @SerializedName(SERIALIZED_NAME_SKU_ID)
  private String skuId;

  public RewardTypeMaterialProduct() {
  }

  public RewardTypeMaterialProduct id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique product ID, assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RewardTypeMaterialProduct skuId(String skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * Unique SKU ID, assigned by Voucherify, of the SKU given as a reward.
   * @return skuId
  **/
  @javax.annotation.Nullable
  public String getSkuId() {
    return skuId;
  }


  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardTypeMaterialProduct rewardTypeMaterialProduct = (RewardTypeMaterialProduct) o;
    return Objects.equals(this.id, rewardTypeMaterialProduct.id) &&
        Objects.equals(this.skuId, rewardTypeMaterialProduct.skuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, skuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardTypeMaterialProduct {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("sku_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("sku_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RewardTypeMaterialProduct
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RewardTypeMaterialProduct.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RewardTypeMaterialProduct is not found in the empty JSON string", RewardTypeMaterialProduct.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RewardTypeMaterialProduct.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RewardTypeMaterialProduct` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RewardTypeMaterialProduct.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("sku_id") != null && !jsonObj.get("sku_id").isJsonNull()) && !jsonObj.get("sku_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RewardTypeMaterialProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RewardTypeMaterialProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RewardTypeMaterialProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RewardTypeMaterialProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<RewardTypeMaterialProduct>() {
           @Override
           public void write(JsonWriter out, RewardTypeMaterialProduct value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RewardTypeMaterialProduct read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RewardTypeMaterialProduct given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardTypeMaterialProduct
  * @throws IOException if the JSON string is invalid with respect to RewardTypeMaterialProduct
  */
  public static RewardTypeMaterialProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardTypeMaterialProduct.class);
  }

 /**
  * Convert an instance of RewardTypeMaterialProduct to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

