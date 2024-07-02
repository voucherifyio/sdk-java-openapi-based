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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import voucherify.client.model.ApplicableTo;

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
 * ApplicableToResultList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ApplicableToResultList {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<ApplicableTo> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  /**
   * The type of the object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    LIST("list");

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
  private ObjectEnum _object = ObjectEnum.LIST;

  /**
   * The type of the object represented by JSON.
   */
  @JsonAdapter(DataRefEnum.Adapter.class)
  public enum DataRefEnum {
    DATA("data");

    private String value;

    DataRefEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataRefEnum fromValue(String value) {
      for (DataRefEnum b : DataRefEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataRefEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataRefEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataRefEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataRefEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_REF = "data_ref";
  @SerializedName(SERIALIZED_NAME_DATA_REF)
  private DataRefEnum dataRef = DataRefEnum.DATA;

  public ApplicableToResultList() {
  }

  public ApplicableToResultList data(List<ApplicableTo> data) {
    
    this.data = data;
    return this;
  }

  public ApplicableToResultList addDataItem(ApplicableTo dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Contains array of items to which the discount can apply.
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<ApplicableTo> getData() {
    return data;
  }


  public void setData(List<ApplicableTo> data) {
    this.data = data;
  }


  public ApplicableToResultList total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of objects defining included products, SKUs, or product collections.
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nonnull
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public ApplicableToResultList _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public ApplicableToResultList dataRef(DataRefEnum dataRef) {
    
    this.dataRef = dataRef;
    return this;
  }

   /**
   * The type of the object represented by JSON.
   * @return dataRef
  **/
  @javax.annotation.Nonnull
  public DataRefEnum getDataRef() {
    return dataRef;
  }


  public void setDataRef(DataRefEnum dataRef) {
    this.dataRef = dataRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicableToResultList applicableToResultList = (ApplicableToResultList) o;
    return Objects.equals(this.data, applicableToResultList.data) &&
        Objects.equals(this.total, applicableToResultList.total) &&
        Objects.equals(this._object, applicableToResultList._object) &&
        Objects.equals(this.dataRef, applicableToResultList.dataRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, total, _object, dataRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicableToResultList {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    dataRef: ").append(toIndentedString(dataRef)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("total");
    openapiFields.add("object");
    openapiFields.add("data_ref");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("data_ref");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApplicableToResultList
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApplicableToResultList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicableToResultList is not found in the empty JSON string", ApplicableToResultList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApplicableToResultList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicableToResultList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicableToResultList.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        ApplicableTo.validateJsonElement(jsonArraydata.get(i));
      };
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
      if (!jsonObj.get("data_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_ref").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("data_ref");

        if (objectElement != null && !objectElement.isJsonNull()) {
          DataRefEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `data_ref` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("data_ref") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `data_ref` to be a valid element of DataRefEnum enum got `%s` instead", jsonObj.get("data_ref").toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicableToResultList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicableToResultList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicableToResultList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicableToResultList.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicableToResultList>() {
           @Override
           public void write(JsonWriter out, ApplicableToResultList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicableToResultList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicableToResultList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicableToResultList
  * @throws IOException if the JSON string is invalid with respect to ApplicableToResultList
  */
  public static ApplicableToResultList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicableToResultList.class);
  }

 /**
  * Convert an instance of ApplicableToResultList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

