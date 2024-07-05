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
 * ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct() {
  }

  public ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct id(String id) {
    
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


  public ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Product&#39;s source ID.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Product name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct validationsValidateResponseBodyRedeemablesItemResultDiscountProduct = (ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct) o;
    return Objects.equals(this.id, validationsValidateResponseBodyRedeemablesItemResultDiscountProduct.id) &&
        Objects.equals(this.sourceId, validationsValidateResponseBodyRedeemablesItemResultDiscountProduct.sourceId) &&
        Objects.equals(this.name, validationsValidateResponseBodyRedeemablesItemResultDiscountProduct.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("source_id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct is not found in the empty JSON string", ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct>() {
           @Override
           public void write(JsonWriter out, ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct
  * @throws IOException if the JSON string is invalid with respect to ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct
  */
  public static ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct.class);
  }

 /**
  * Convert an instance of ValidationsValidateResponseBodyRedeemablesItemResultDiscountProduct to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
