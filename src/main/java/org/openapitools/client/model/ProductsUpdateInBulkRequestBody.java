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
 * Request schema for **POST** &#x60;/products/bulk/async&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class ProductsUpdateInBulkRequestBody {
  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<String> attributes;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public ProductsUpdateInBulkRequestBody() {
  }

  public ProductsUpdateInBulkRequestBody sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Unique product source ID from your inventory system.
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public ProductsUpdateInBulkRequestBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Unique user-defined product name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductsUpdateInBulkRequestBody price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * Unit price. It is represented by a value multiplied by 100 to accurately reflect 2 decimal places, such as &#x60;$100.00&#x60; being expressed as &#x60;10000&#x60;.
   * @return price
  **/
  @javax.annotation.Nullable
  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public ProductsUpdateInBulkRequestBody attributes(List<String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public ProductsUpdateInBulkRequestBody addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * A list of product attributes whose values you can customize for given SKUs: &#x60;[\&quot;color\&quot;,\&quot;size\&quot;,\&quot;ranking\&quot;]&#x60;. Each child SKU can have a unique value for a given attribute.
   * @return attributes
  **/
  @javax.annotation.Nullable
  public List<String> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<String> attributes) {
    this.attributes = attributes;
  }


  public ProductsUpdateInBulkRequestBody imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The HTTPS URL pointing to the .png or .jpg file that will be used to render the product image.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public ProductsUpdateInBulkRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the product. A set of key/value pairs that you can attach to a product object. It can be useful for storing additional information about the product in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
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
    ProductsUpdateInBulkRequestBody productsUpdateInBulkRequestBody = (ProductsUpdateInBulkRequestBody) o;
    return Objects.equals(this.sourceId, productsUpdateInBulkRequestBody.sourceId) &&
        Objects.equals(this.name, productsUpdateInBulkRequestBody.name) &&
        Objects.equals(this.price, productsUpdateInBulkRequestBody.price) &&
        Objects.equals(this.attributes, productsUpdateInBulkRequestBody.attributes) &&
        Objects.equals(this.imageUrl, productsUpdateInBulkRequestBody.imageUrl) &&
        Objects.equals(this.metadata, productsUpdateInBulkRequestBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, name, price, attributes, imageUrl, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsUpdateInBulkRequestBody {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
    openapiFields.add("source_id");
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("attributes");
    openapiFields.add("image_url");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductsUpdateInBulkRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductsUpdateInBulkRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductsUpdateInBulkRequestBody is not found in the empty JSON string", ProductsUpdateInBulkRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductsUpdateInBulkRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductsUpdateInBulkRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductsUpdateInBulkRequestBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull() && !jsonObj.get("attributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
      }
      if ((jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonNull()) && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductsUpdateInBulkRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductsUpdateInBulkRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductsUpdateInBulkRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductsUpdateInBulkRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductsUpdateInBulkRequestBody>() {
           @Override
           public void write(JsonWriter out, ProductsUpdateInBulkRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductsUpdateInBulkRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductsUpdateInBulkRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductsUpdateInBulkRequestBody
  * @throws IOException if the JSON string is invalid with respect to ProductsUpdateInBulkRequestBody
  */
  public static ProductsUpdateInBulkRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductsUpdateInBulkRequestBody.class);
  }

 /**
  * Convert an instance of ProductsUpdateInBulkRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

