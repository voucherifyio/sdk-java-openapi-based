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
import voucherify.client.model.FieldConditions;
import voucherify.client.model.Junction;

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
 * Defines a set of criteria and boundary conditions for an &#x60;AUTO_UPDATE&#x60; product collection type.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ProductCollectionsCreateDynamicRequestBodyFilter {
  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private FieldConditions id;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private FieldConditions productId;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private FieldConditions sourceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private FieldConditions name;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private FieldConditions price;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private FieldConditions _object;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private FieldConditions attributes;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private FieldConditions metadata;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private FieldConditions imageUrl;

  public static final String SERIALIZED_NAME_SKUS = "skus";
  @SerializedName(SERIALIZED_NAME_SKUS)
  private FieldConditions skus;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private FieldConditions createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private FieldConditions updatedAt;

  public ProductCollectionsCreateDynamicRequestBodyFilter() {
  }

  public ProductCollectionsCreateDynamicRequestBodyFilter junction(Junction junction) {
    
    this.junction = junction;
    return this;
  }

   /**
   * Get junction
   * @return junction
  **/
  @javax.annotation.Nonnull
  public Junction getJunction() {
    return junction;
  }


  public void setJunction(Junction junction) {
    this.junction = junction;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter id(FieldConditions id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public FieldConditions getId() {
    return id;
  }


  public void setId(FieldConditions id) {
    this.id = id;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter productId(FieldConditions productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  public FieldConditions getProductId() {
    return productId;
  }


  public void setProductId(FieldConditions productId) {
    this.productId = productId;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter sourceId(FieldConditions sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public FieldConditions getSourceId() {
    return sourceId;
  }


  public void setSourceId(FieldConditions sourceId) {
    this.sourceId = sourceId;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter name(FieldConditions name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public FieldConditions getName() {
    return name;
  }


  public void setName(FieldConditions name) {
    this.name = name;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter price(FieldConditions price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  public FieldConditions getPrice() {
    return price;
  }


  public void setPrice(FieldConditions price) {
    this.price = price;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter _object(FieldConditions _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  public FieldConditions getObject() {
    return _object;
  }


  public void setObject(FieldConditions _object) {
    this._object = _object;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter attributes(FieldConditions attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  public FieldConditions getAttributes() {
    return attributes;
  }


  public void setAttributes(FieldConditions attributes) {
    this.attributes = attributes;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter metadata(FieldConditions metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public FieldConditions getMetadata() {
    return metadata;
  }


  public void setMetadata(FieldConditions metadata) {
    this.metadata = metadata;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter imageUrl(FieldConditions imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public FieldConditions getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(FieldConditions imageUrl) {
    this.imageUrl = imageUrl;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter skus(FieldConditions skus) {
    
    this.skus = skus;
    return this;
  }

   /**
   * Get skus
   * @return skus
  **/
  @javax.annotation.Nullable
  public FieldConditions getSkus() {
    return skus;
  }


  public void setSkus(FieldConditions skus) {
    this.skus = skus;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter createdAt(FieldConditions createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public FieldConditions getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(FieldConditions createdAt) {
    this.createdAt = createdAt;
  }


  public ProductCollectionsCreateDynamicRequestBodyFilter updatedAt(FieldConditions updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public FieldConditions getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(FieldConditions updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCollectionsCreateDynamicRequestBodyFilter productCollectionsCreateDynamicRequestBodyFilter = (ProductCollectionsCreateDynamicRequestBodyFilter) o;
    return Objects.equals(this.junction, productCollectionsCreateDynamicRequestBodyFilter.junction) &&
        Objects.equals(this.id, productCollectionsCreateDynamicRequestBodyFilter.id) &&
        Objects.equals(this.productId, productCollectionsCreateDynamicRequestBodyFilter.productId) &&
        Objects.equals(this.sourceId, productCollectionsCreateDynamicRequestBodyFilter.sourceId) &&
        Objects.equals(this.name, productCollectionsCreateDynamicRequestBodyFilter.name) &&
        Objects.equals(this.price, productCollectionsCreateDynamicRequestBodyFilter.price) &&
        Objects.equals(this._object, productCollectionsCreateDynamicRequestBodyFilter._object) &&
        Objects.equals(this.attributes, productCollectionsCreateDynamicRequestBodyFilter.attributes) &&
        Objects.equals(this.metadata, productCollectionsCreateDynamicRequestBodyFilter.metadata) &&
        Objects.equals(this.imageUrl, productCollectionsCreateDynamicRequestBodyFilter.imageUrl) &&
        Objects.equals(this.skus, productCollectionsCreateDynamicRequestBodyFilter.skus) &&
        Objects.equals(this.createdAt, productCollectionsCreateDynamicRequestBodyFilter.createdAt) &&
        Objects.equals(this.updatedAt, productCollectionsCreateDynamicRequestBodyFilter.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junction, id, productId, sourceId, name, price, _object, attributes, metadata, imageUrl, skus, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCollectionsCreateDynamicRequestBodyFilter {\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("junction");
    openapiFields.add("id");
    openapiFields.add("product_id");
    openapiFields.add("source_id");
    openapiFields.add("name");
    openapiFields.add("price");
    openapiFields.add("object");
    openapiFields.add("attributes");
    openapiFields.add("metadata");
    openapiFields.add("image_url");
    openapiFields.add("skus");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("junction");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductCollectionsCreateDynamicRequestBodyFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductCollectionsCreateDynamicRequestBodyFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductCollectionsCreateDynamicRequestBodyFilter is not found in the empty JSON string", ProductCollectionsCreateDynamicRequestBodyFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductCollectionsCreateDynamicRequestBodyFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductCollectionsCreateDynamicRequestBodyFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductCollectionsCreateDynamicRequestBodyFilter.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("id"));
      }
      // validate the optional field `product_id`
      if (jsonObj.get("product_id") != null && !jsonObj.get("product_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("product_id"));
      }
      // validate the optional field `source_id`
      if (jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("source_id"));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("name"));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("price"));
      }
      // validate the optional field `object`
      if (jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("object"));
      }
      // validate the optional field `attributes`
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("attributes"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("metadata"));
      }
      // validate the optional field `image_url`
      if (jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("image_url"));
      }
      // validate the optional field `skus`
      if (jsonObj.get("skus") != null && !jsonObj.get("skus").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("skus"));
      }
      // validate the optional field `created_at`
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("created_at"));
      }
      // validate the optional field `updated_at`
      if (jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("updated_at"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductCollectionsCreateDynamicRequestBodyFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductCollectionsCreateDynamicRequestBodyFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductCollectionsCreateDynamicRequestBodyFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductCollectionsCreateDynamicRequestBodyFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductCollectionsCreateDynamicRequestBodyFilter>() {
           @Override
           public void write(JsonWriter out, ProductCollectionsCreateDynamicRequestBodyFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductCollectionsCreateDynamicRequestBodyFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductCollectionsCreateDynamicRequestBodyFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductCollectionsCreateDynamicRequestBodyFilter
  * @throws IOException if the JSON string is invalid with respect to ProductCollectionsCreateDynamicRequestBodyFilter
  */
  public static ProductCollectionsCreateDynamicRequestBodyFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductCollectionsCreateDynamicRequestBodyFilter.class);
  }

 /**
  * Convert an instance of ProductCollectionsCreateDynamicRequestBodyFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

