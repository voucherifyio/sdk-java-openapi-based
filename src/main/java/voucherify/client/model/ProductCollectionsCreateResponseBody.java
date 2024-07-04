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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import voucherify.client.model.ProductCollectionsCreateRequestBodyFilter;
import voucherify.client.model.ProductCollectionsItemProductsItem;

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
 * Response body schema for **POST** &#x60;/product-collections&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ProductCollectionsCreateResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Describes whether the product collection is dynamic (products come in and leave based on set criteria) or static (manually selected products).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STATIC("STATIC"),
    
    AUTO_UPDATE("AUTO_UPDATE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private ProductCollectionsCreateRequestBodyFilter filter;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ProductCollectionsItemProductsItem> products;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * The type of the object represented by JSON. This object stores information about the static product collection.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    PRODUCTS_COLLECTION("products_collection");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.PRODUCTS_COLLECTION;

  public ProductCollectionsCreateResponseBody() {
  }

  public ProductCollectionsCreateResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Product collection ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProductCollectionsCreateResponseBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Unique user-defined product collection name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductCollectionsCreateResponseBody type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Describes whether the product collection is dynamic (products come in and leave based on set criteria) or static (manually selected products).
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ProductCollectionsCreateResponseBody filter(ProductCollectionsCreateRequestBodyFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  public ProductCollectionsCreateRequestBodyFilter getFilter() {
    return filter;
  }


  public void setFilter(ProductCollectionsCreateRequestBodyFilter filter) {
    this.filter = filter;
  }


  public ProductCollectionsCreateResponseBody products(List<ProductCollectionsItemProductsItem> products) {
    
    this.products = products;
    return this;
  }

  public ProductCollectionsCreateResponseBody addProductsItem(ProductCollectionsItemProductsItem productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Defines a set of products for a &#x60;STATIC&#x60; product collection type.
   * @return products
  **/
  @javax.annotation.Nullable
  public List<ProductCollectionsItemProductsItem> getProducts() {
    return products;
  }


  public void setProducts(List<ProductCollectionsItemProductsItem> products) {
    this.products = products;
  }


  public ProductCollectionsCreateResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the product collection was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ProductCollectionsCreateResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. This object stores information about the static product collection.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCollectionsCreateResponseBody productCollectionsCreateResponseBody = (ProductCollectionsCreateResponseBody) o;
    return Objects.equals(this.id, productCollectionsCreateResponseBody.id) &&
        Objects.equals(this.name, productCollectionsCreateResponseBody.name) &&
        Objects.equals(this.type, productCollectionsCreateResponseBody.type) &&
        Objects.equals(this.filter, productCollectionsCreateResponseBody.filter) &&
        Objects.equals(this.products, productCollectionsCreateResponseBody.products) &&
        Objects.equals(this.createdAt, productCollectionsCreateResponseBody.createdAt) &&
        Objects.equals(this._object, productCollectionsCreateResponseBody._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, filter, products, createdAt, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCollectionsCreateResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("filter");
    openapiFields.add("products");
    openapiFields.add("created_at");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductCollectionsCreateResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductCollectionsCreateResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductCollectionsCreateResponseBody is not found in the empty JSON string", ProductCollectionsCreateResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductCollectionsCreateResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductCollectionsCreateResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductCollectionsCreateResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          TypeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `type` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("type") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a valid element of TypeEnum enum got `%s` instead", jsonObj.get("type").toString()));
        }
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        ProductCollectionsCreateRequestBodyFilter.validateJsonElement(jsonObj.get("filter"));
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            ProductCollectionsItemProductsItem.validateJsonElement(jsonArrayproducts.get(i));
          };
        }
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ObjectEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `object` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("object") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `object` to be a valid element of ObjectEnum enum got `%s` instead", jsonObj.get("object").toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductCollectionsCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductCollectionsCreateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductCollectionsCreateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductCollectionsCreateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductCollectionsCreateResponseBody>() {
           @Override
           public void write(JsonWriter out, ProductCollectionsCreateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductCollectionsCreateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductCollectionsCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductCollectionsCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to ProductCollectionsCreateResponseBody
  */
  public static ProductCollectionsCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductCollectionsCreateResponseBody.class);
  }

 /**
  * Convert an instance of ProductCollectionsCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

