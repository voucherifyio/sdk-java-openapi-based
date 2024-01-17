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
 * Request body schema for **PUT** &#x60;/categories/{categoryId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:00:53.208514+01:00[Europe/Warsaw]")
public class CategoriesUpdateRequestBody {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HIERARCHY = "hierarchy";
  @SerializedName(SERIALIZED_NAME_HIERARCHY)
  private Integer hierarchy;

  public CategoriesUpdateRequestBody() {
  }

  public CategoriesUpdateRequestBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Category name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CategoriesUpdateRequestBody hierarchy(Integer hierarchy) {
    
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Category hierarchy.
   * @return hierarchy
  **/
  @javax.annotation.Nonnull
  public Integer getHierarchy() {
    return hierarchy;
  }


  public void setHierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoriesUpdateRequestBody categoriesUpdateRequestBody = (CategoriesUpdateRequestBody) o;
    return Objects.equals(this.name, categoriesUpdateRequestBody.name) &&
        Objects.equals(this.hierarchy, categoriesUpdateRequestBody.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoriesUpdateRequestBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("hierarchy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("hierarchy");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CategoriesUpdateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CategoriesUpdateRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CategoriesUpdateRequestBody is not found in the empty JSON string", CategoriesUpdateRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CategoriesUpdateRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CategoriesUpdateRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CategoriesUpdateRequestBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CategoriesUpdateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CategoriesUpdateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CategoriesUpdateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CategoriesUpdateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CategoriesUpdateRequestBody>() {
           @Override
           public void write(JsonWriter out, CategoriesUpdateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CategoriesUpdateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CategoriesUpdateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CategoriesUpdateRequestBody
  * @throws IOException if the JSON string is invalid with respect to CategoriesUpdateRequestBody
  */
  public static CategoriesUpdateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CategoriesUpdateRequestBody.class);
  }

 /**
  * Convert an instance of CategoriesUpdateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
