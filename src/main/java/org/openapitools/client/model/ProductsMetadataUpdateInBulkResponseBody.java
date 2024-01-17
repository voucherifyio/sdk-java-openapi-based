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
 * Response body schema for **POST** &#x60;/products/metadata/async&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class ProductsMetadataUpdateInBulkResponseBody {
  public static final String SERIALIZED_NAME_ASYNC_ACTION_ID = "async_action_id";
  @SerializedName(SERIALIZED_NAME_ASYNC_ACTION_ID)
  private String asyncActionId;

  public ProductsMetadataUpdateInBulkResponseBody() {
  }

  public ProductsMetadataUpdateInBulkResponseBody asyncActionId(String asyncActionId) {
    
    this.asyncActionId = asyncActionId;
    return this;
  }

   /**
   * The ID of the scheduled asynchronous action.
   * @return asyncActionId
  **/
  @javax.annotation.Nonnull
  public String getAsyncActionId() {
    return asyncActionId;
  }


  public void setAsyncActionId(String asyncActionId) {
    this.asyncActionId = asyncActionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsMetadataUpdateInBulkResponseBody productsMetadataUpdateInBulkResponseBody = (ProductsMetadataUpdateInBulkResponseBody) o;
    return Objects.equals(this.asyncActionId, productsMetadataUpdateInBulkResponseBody.asyncActionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asyncActionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsMetadataUpdateInBulkResponseBody {\n");
    sb.append("    asyncActionId: ").append(toIndentedString(asyncActionId)).append("\n");
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
    openapiFields.add("async_action_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("async_action_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductsMetadataUpdateInBulkResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductsMetadataUpdateInBulkResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductsMetadataUpdateInBulkResponseBody is not found in the empty JSON string", ProductsMetadataUpdateInBulkResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductsMetadataUpdateInBulkResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductsMetadataUpdateInBulkResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductsMetadataUpdateInBulkResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("async_action_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `async_action_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("async_action_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductsMetadataUpdateInBulkResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductsMetadataUpdateInBulkResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductsMetadataUpdateInBulkResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductsMetadataUpdateInBulkResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductsMetadataUpdateInBulkResponseBody>() {
           @Override
           public void write(JsonWriter out, ProductsMetadataUpdateInBulkResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductsMetadataUpdateInBulkResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductsMetadataUpdateInBulkResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductsMetadataUpdateInBulkResponseBody
  * @throws IOException if the JSON string is invalid with respect to ProductsMetadataUpdateInBulkResponseBody
  */
  public static ProductsMetadataUpdateInBulkResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductsMetadataUpdateInBulkResponseBody.class);
  }

 /**
  * Convert an instance of ProductsMetadataUpdateInBulkResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

