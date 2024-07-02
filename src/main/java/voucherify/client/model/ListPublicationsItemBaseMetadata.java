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
 * The metadata object stores all custom attributes assigned to the publication. A set of key/value pairs that you can attach to a publication object. It can be useful for storing additional information about the publication in a structured format.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ListPublicationsItemBaseMetadata {
  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_DISTRIBUTION_ID = "distribution_id";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_ID)
  private String distributionId;

  public ListPublicationsItemBaseMetadata() {
  }

  public ListPublicationsItemBaseMetadata sourceType(String sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Defines the type of the distribution source.
   * @return sourceType
  **/
  @javax.annotation.Nonnull
  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public ListPublicationsItemBaseMetadata sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Unique identifier of the distribution source.
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public ListPublicationsItemBaseMetadata distributionId(String distributionId) {
    
    this.distributionId = distributionId;
    return this;
  }

   /**
   * Unique identifier of the distribution.
   * @return distributionId
  **/
  @javax.annotation.Nonnull
  public String getDistributionId() {
    return distributionId;
  }


  public void setDistributionId(String distributionId) {
    this.distributionId = distributionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPublicationsItemBaseMetadata listPublicationsItemBaseMetadata = (ListPublicationsItemBaseMetadata) o;
    return Objects.equals(this.sourceType, listPublicationsItemBaseMetadata.sourceType) &&
        Objects.equals(this.sourceId, listPublicationsItemBaseMetadata.sourceId) &&
        Objects.equals(this.distributionId, listPublicationsItemBaseMetadata.distributionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, sourceId, distributionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPublicationsItemBaseMetadata {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    distributionId: ").append(toIndentedString(distributionId)).append("\n");
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
    openapiFields.add("source_type");
    openapiFields.add("source_id");
    openapiFields.add("distribution_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source_type");
    openapiRequiredFields.add("source_id");
    openapiRequiredFields.add("distribution_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListPublicationsItemBaseMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListPublicationsItemBaseMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPublicationsItemBaseMetadata is not found in the empty JSON string", ListPublicationsItemBaseMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListPublicationsItemBaseMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPublicationsItemBaseMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListPublicationsItemBaseMetadata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("source_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_type").toString()));
      }
      if (!jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if (!jsonObj.get("distribution_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distribution_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distribution_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPublicationsItemBaseMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPublicationsItemBaseMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPublicationsItemBaseMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPublicationsItemBaseMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPublicationsItemBaseMetadata>() {
           @Override
           public void write(JsonWriter out, ListPublicationsItemBaseMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPublicationsItemBaseMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPublicationsItemBaseMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPublicationsItemBaseMetadata
  * @throws IOException if the JSON string is invalid with respect to ListPublicationsItemBaseMetadata
  */
  public static ListPublicationsItemBaseMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPublicationsItemBaseMetadata.class);
  }

 /**
  * Convert an instance of ListPublicationsItemBaseMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
