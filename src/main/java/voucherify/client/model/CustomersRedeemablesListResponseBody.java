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
import voucherify.client.model.CustomerRedeemable;

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
 * Response body schema for **GET** &#x60;/customers/{customerId}/redeemables&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomersRedeemablesListResponseBody {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "list";

  public static final String SERIALIZED_NAME_DATA_REF = "data_ref";
  @SerializedName(SERIALIZED_NAME_DATA_REF)
  private String dataRef = "data";

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<CustomerRedeemable> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public static final String SERIALIZED_NAME_MORE_STARTING_AFTER = "more_starting_after";
  @SerializedName(SERIALIZED_NAME_MORE_STARTING_AFTER)
  private String moreStartingAfter;

  public CustomersRedeemablesListResponseBody() {
  }

  public CustomersRedeemablesListResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. This object stores information about customer redeemables.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public CustomersRedeemablesListResponseBody dataRef(String dataRef) {
    
    this.dataRef = dataRef;
    return this;
  }

   /**
   * Identifies the name of the JSON property that contains the array of redeemables.
   * @return dataRef
  **/
  @javax.annotation.Nonnull
  public String getDataRef() {
    return dataRef;
  }


  public void setDataRef(String dataRef) {
    this.dataRef = dataRef;
  }


  public CustomersRedeemablesListResponseBody data(List<CustomerRedeemable> data) {
    
    this.data = data;
    return this;
  }

  public CustomersRedeemablesListResponseBody addDataItem(CustomerRedeemable dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * A dictionary that contains an array of redeemables.
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<CustomerRedeemable> getData() {
    return data;
  }


  public void setData(List<CustomerRedeemable> data) {
    this.data = data;
  }


  public CustomersRedeemablesListResponseBody total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of results returned.
   * @return total
  **/
  @javax.annotation.Nonnull
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public CustomersRedeemablesListResponseBody hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * As query results are always limited (by the limit parameter), the &#x60;has_more&#x60; flag indicates if there are more records for given filter parameters. This lets you know if you can run another request with a &#x60;starting_after_id&#x60; query or a different limit to get more records returned in the results.
   * @return hasMore
  **/
  @javax.annotation.Nonnull
  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public CustomersRedeemablesListResponseBody moreStartingAfter(String moreStartingAfter) {
    
    this.moreStartingAfter = moreStartingAfter;
    return this;
  }

   /**
   * Returns an ID that can be used to return another page of results. Use the ID in the &#x60;starting_after_id&#x60; query parameter to display another page of the results occuring after the field with that ID.
   * @return moreStartingAfter
  **/
  @javax.annotation.Nullable
  public String getMoreStartingAfter() {
    return moreStartingAfter;
  }


  public void setMoreStartingAfter(String moreStartingAfter) {
    this.moreStartingAfter = moreStartingAfter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersRedeemablesListResponseBody customersRedeemablesListResponseBody = (CustomersRedeemablesListResponseBody) o;
    return Objects.equals(this._object, customersRedeemablesListResponseBody._object) &&
        Objects.equals(this.dataRef, customersRedeemablesListResponseBody.dataRef) &&
        Objects.equals(this.data, customersRedeemablesListResponseBody.data) &&
        Objects.equals(this.total, customersRedeemablesListResponseBody.total) &&
        Objects.equals(this.hasMore, customersRedeemablesListResponseBody.hasMore) &&
        Objects.equals(this.moreStartingAfter, customersRedeemablesListResponseBody.moreStartingAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, dataRef, data, total, hasMore, moreStartingAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersRedeemablesListResponseBody {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    dataRef: ").append(toIndentedString(dataRef)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    moreStartingAfter: ").append(toIndentedString(moreStartingAfter)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("data_ref");
    openapiFields.add("data");
    openapiFields.add("total");
    openapiFields.add("has_more");
    openapiFields.add("more_starting_after");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("data_ref");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("total");
    openapiRequiredFields.add("has_more");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomersRedeemablesListResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomersRedeemablesListResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomersRedeemablesListResponseBody is not found in the empty JSON string", CustomersRedeemablesListResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomersRedeemablesListResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomersRedeemablesListResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomersRedeemablesListResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("data_ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_ref").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }

      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      // validate the required field `data` (array)
      for (int i = 0; i < jsonArraydata.size(); i++) {
        CustomerRedeemable.validateJsonElement(jsonArraydata.get(i));
      };
      if ((jsonObj.get("more_starting_after") != null && !jsonObj.get("more_starting_after").isJsonNull()) && !jsonObj.get("more_starting_after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `more_starting_after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("more_starting_after").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomersRedeemablesListResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomersRedeemablesListResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomersRedeemablesListResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomersRedeemablesListResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomersRedeemablesListResponseBody>() {
           @Override
           public void write(JsonWriter out, CustomersRedeemablesListResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomersRedeemablesListResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomersRedeemablesListResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomersRedeemablesListResponseBody
  * @throws IOException if the JSON string is invalid with respect to CustomersRedeemablesListResponseBody
  */
  public static CustomersRedeemablesListResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomersRedeemablesListResponseBody.class);
  }

 /**
  * Convert an instance of CustomersRedeemablesListResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

