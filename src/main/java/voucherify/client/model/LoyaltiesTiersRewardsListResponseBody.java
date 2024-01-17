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
import voucherify.client.model.LoyaltiesLoyaltyTierReward;

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
 * Response body schema for **GET** &#x60;/loyalties/{campaignId}/tiers/{loyaltyTierId}/rewards&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class LoyaltiesTiersRewardsListResponseBody {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "list";

  public static final String SERIALIZED_NAME_DATA_REF = "data_ref";
  @SerializedName(SERIALIZED_NAME_DATA_REF)
  private String dataRef = "data";

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<LoyaltiesLoyaltyTierReward> data = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public LoyaltiesTiersRewardsListResponseBody() {
  }

  public LoyaltiesTiersRewardsListResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON. This object stores information about loyalty tier rewards in a dictionary.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public LoyaltiesTiersRewardsListResponseBody dataRef(String dataRef) {
    
    this.dataRef = dataRef;
    return this;
  }

   /**
   * Identifies the name of the attribute that contains the array of loyalty tier reward objects.
   * @return dataRef
  **/
  @javax.annotation.Nonnull
  public String getDataRef() {
    return dataRef;
  }


  public void setDataRef(String dataRef) {
    this.dataRef = dataRef;
  }


  public LoyaltiesTiersRewardsListResponseBody data(List<LoyaltiesLoyaltyTierReward> data) {
    
    this.data = data;
    return this;
  }

  public LoyaltiesTiersRewardsListResponseBody addDataItem(LoyaltiesLoyaltyTierReward dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Contains array of loyalty tier reward objects.
   * @return data
  **/
  @javax.annotation.Nonnull
  public List<LoyaltiesLoyaltyTierReward> getData() {
    return data;
  }


  public void setData(List<LoyaltiesLoyaltyTierReward> data) {
    this.data = data;
  }


  public LoyaltiesTiersRewardsListResponseBody total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total number of loyalty tier reward objects.
   * @return total
  **/
  @javax.annotation.Nonnull
  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesTiersRewardsListResponseBody loyaltiesTiersRewardsListResponseBody = (LoyaltiesTiersRewardsListResponseBody) o;
    return Objects.equals(this._object, loyaltiesTiersRewardsListResponseBody._object) &&
        Objects.equals(this.dataRef, loyaltiesTiersRewardsListResponseBody.dataRef) &&
        Objects.equals(this.data, loyaltiesTiersRewardsListResponseBody.data) &&
        Objects.equals(this.total, loyaltiesTiersRewardsListResponseBody.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, dataRef, data, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltiesTiersRewardsListResponseBody {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    dataRef: ").append(toIndentedString(dataRef)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("data_ref");
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesTiersRewardsListResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesTiersRewardsListResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesTiersRewardsListResponseBody is not found in the empty JSON string", LoyaltiesTiersRewardsListResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesTiersRewardsListResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesTiersRewardsListResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltiesTiersRewardsListResponseBody.openapiRequiredFields) {
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
        LoyaltiesLoyaltyTierReward.validateJsonElement(jsonArraydata.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesTiersRewardsListResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesTiersRewardsListResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesTiersRewardsListResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesTiersRewardsListResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesTiersRewardsListResponseBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesTiersRewardsListResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesTiersRewardsListResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesTiersRewardsListResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesTiersRewardsListResponseBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesTiersRewardsListResponseBody
  */
  public static LoyaltiesTiersRewardsListResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesTiersRewardsListResponseBody.class);
  }

 /**
  * Convert an instance of LoyaltiesTiersRewardsListResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

