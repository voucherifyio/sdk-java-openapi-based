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
import voucherify.client.model.ProductCollectionsCreateDynamicRequestBodyFilter;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class ProductCollectionsCreateDynamicRequestBody {
  /**
   * Show that the product collection is dynamic (products come in and leave based on set criteria).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
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
  private TypeEnum type = TypeEnum.AUTO_UPDATE;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private ProductCollectionsCreateDynamicRequestBodyFilter filter;

  public ProductCollectionsCreateDynamicRequestBody() {
  }

  public ProductCollectionsCreateDynamicRequestBody type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Show that the product collection is dynamic (products come in and leave based on set criteria).
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ProductCollectionsCreateDynamicRequestBody name(String name) {
    
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


  public ProductCollectionsCreateDynamicRequestBody filter(ProductCollectionsCreateDynamicRequestBodyFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nonnull
  public ProductCollectionsCreateDynamicRequestBodyFilter getFilter() {
    return filter;
  }


  public void setFilter(ProductCollectionsCreateDynamicRequestBodyFilter filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCollectionsCreateDynamicRequestBody productCollectionsCreateDynamicRequestBody = (ProductCollectionsCreateDynamicRequestBody) o;
    return Objects.equals(this.type, productCollectionsCreateDynamicRequestBody.type) &&
        Objects.equals(this.name, productCollectionsCreateDynamicRequestBody.name) &&
        Objects.equals(this.filter, productCollectionsCreateDynamicRequestBody.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCollectionsCreateDynamicRequestBody {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("filter");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductCollectionsCreateDynamicRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductCollectionsCreateDynamicRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductCollectionsCreateDynamicRequestBody is not found in the empty JSON string", ProductCollectionsCreateDynamicRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductCollectionsCreateDynamicRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductCollectionsCreateDynamicRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProductCollectionsCreateDynamicRequestBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a valid element of TypeEnum enum got `%s` instead", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `filter`
      ProductCollectionsCreateDynamicRequestBodyFilter.validateJsonElement(jsonObj.get("filter"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductCollectionsCreateDynamicRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductCollectionsCreateDynamicRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductCollectionsCreateDynamicRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductCollectionsCreateDynamicRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductCollectionsCreateDynamicRequestBody>() {
           @Override
           public void write(JsonWriter out, ProductCollectionsCreateDynamicRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductCollectionsCreateDynamicRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductCollectionsCreateDynamicRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductCollectionsCreateDynamicRequestBody
  * @throws IOException if the JSON string is invalid with respect to ProductCollectionsCreateDynamicRequestBody
  */
  public static ProductCollectionsCreateDynamicRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductCollectionsCreateDynamicRequestBody.class);
  }

 /**
  * Convert an instance of ProductCollectionsCreateDynamicRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

