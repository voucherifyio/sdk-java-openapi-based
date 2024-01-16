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

import org.openapitools.client.JSON;

/**
 * Request body schema for **POST** &#x60;/customers/metadata/async&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class CustomersMetadataUpdateInBulkRequestBody {
  public static final String SERIALIZED_NAME_SOURCE_IDS = "source_ids";
  @SerializedName(SERIALIZED_NAME_SOURCE_IDS)
  private List<String> sourceIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public CustomersMetadataUpdateInBulkRequestBody() {
  }

  public CustomersMetadataUpdateInBulkRequestBody sourceIds(List<String> sourceIds) {
    
    this.sourceIds = sourceIds;
    return this;
  }

  public CustomersMetadataUpdateInBulkRequestBody addSourceIdsItem(String sourceIdsItem) {
    if (this.sourceIds == null) {
      this.sourceIds = new ArrayList<>();
    }
    this.sourceIds.add(sourceIdsItem);
    return this;
  }

   /**
   * An array of customer &#x60;source_id&#x60;&#39;s.
   * @return sourceIds
  **/
  @javax.annotation.Nonnull
  public List<String> getSourceIds() {
    return sourceIds;
  }


  public void setSourceIds(List<String> sourceIds) {
    this.sourceIds = sourceIds;
  }


  public CustomersMetadataUpdateInBulkRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata key value pairs to be updated. A set of custom key/value pairs that you can attach to a customer. The metadata object stores all custom attributes assigned to the customer. It can be useful for storing additional information about the customer in a structured format. This metadata can be used for validating whether the customer qualifies for a discount or it can be used in building customer segments.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
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
    CustomersMetadataUpdateInBulkRequestBody customersMetadataUpdateInBulkRequestBody = (CustomersMetadataUpdateInBulkRequestBody) o;
    return Objects.equals(this.sourceIds, customersMetadataUpdateInBulkRequestBody.sourceIds) &&
        Objects.equals(this.metadata, customersMetadataUpdateInBulkRequestBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceIds, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersMetadataUpdateInBulkRequestBody {\n");
    sb.append("    sourceIds: ").append(toIndentedString(sourceIds)).append("\n");
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
    openapiFields.add("source_ids");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source_ids");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomersMetadataUpdateInBulkRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomersMetadataUpdateInBulkRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomersMetadataUpdateInBulkRequestBody is not found in the empty JSON string", CustomersMetadataUpdateInBulkRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomersMetadataUpdateInBulkRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomersMetadataUpdateInBulkRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomersMetadataUpdateInBulkRequestBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("source_ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("source_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_ids` to be an array in the JSON string but got `%s`", jsonObj.get("source_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomersMetadataUpdateInBulkRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomersMetadataUpdateInBulkRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomersMetadataUpdateInBulkRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomersMetadataUpdateInBulkRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomersMetadataUpdateInBulkRequestBody>() {
           @Override
           public void write(JsonWriter out, CustomersMetadataUpdateInBulkRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomersMetadataUpdateInBulkRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomersMetadataUpdateInBulkRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomersMetadataUpdateInBulkRequestBody
  * @throws IOException if the JSON string is invalid with respect to CustomersMetadataUpdateInBulkRequestBody
  */
  public static CustomersMetadataUpdateInBulkRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomersMetadataUpdateInBulkRequestBody.class);
  }

 /**
  * Convert an instance of CustomersMetadataUpdateInBulkRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

