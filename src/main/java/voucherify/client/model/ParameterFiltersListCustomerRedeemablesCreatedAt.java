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
import voucherify.client.model.FilterConditionsDateTimeConditions;
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
 * Timestamp representing the date and time when the customer redeemable was created. Timestamp is presented in the ISO 8601 format.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParameterFiltersListCustomerRedeemablesCreatedAt {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private FilterConditionsDateTimeConditions conditions;

  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public ParameterFiltersListCustomerRedeemablesCreatedAt() {
  }

  public ParameterFiltersListCustomerRedeemablesCreatedAt conditions(FilterConditionsDateTimeConditions conditions) {
    
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nullable
  public FilterConditionsDateTimeConditions getConditions() {
    return conditions;
  }


  public void setConditions(FilterConditionsDateTimeConditions conditions) {
    this.conditions = conditions;
  }


  public ParameterFiltersListCustomerRedeemablesCreatedAt junction(Junction junction) {
    
    this.junction = junction;
    return this;
  }

   /**
   * Get junction
   * @return junction
  **/
  @javax.annotation.Nullable
  public Junction getJunction() {
    return junction;
  }


  public void setJunction(Junction junction) {
    this.junction = junction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterFiltersListCustomerRedeemablesCreatedAt parameterFiltersListCustomerRedeemablesCreatedAt = (ParameterFiltersListCustomerRedeemablesCreatedAt) o;
    return Objects.equals(this.conditions, parameterFiltersListCustomerRedeemablesCreatedAt.conditions) &&
        Objects.equals(this.junction, parameterFiltersListCustomerRedeemablesCreatedAt.junction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, junction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterFiltersListCustomerRedeemablesCreatedAt {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("junction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ParameterFiltersListCustomerRedeemablesCreatedAt
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParameterFiltersListCustomerRedeemablesCreatedAt.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParameterFiltersListCustomerRedeemablesCreatedAt is not found in the empty JSON string", ParameterFiltersListCustomerRedeemablesCreatedAt.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParameterFiltersListCustomerRedeemablesCreatedAt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParameterFiltersListCustomerRedeemablesCreatedAt` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `conditions`
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        FilterConditionsDateTimeConditions.validateJsonElement(jsonObj.get("conditions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterFiltersListCustomerRedeemablesCreatedAt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterFiltersListCustomerRedeemablesCreatedAt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterFiltersListCustomerRedeemablesCreatedAt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterFiltersListCustomerRedeemablesCreatedAt.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterFiltersListCustomerRedeemablesCreatedAt>() {
           @Override
           public void write(JsonWriter out, ParameterFiltersListCustomerRedeemablesCreatedAt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterFiltersListCustomerRedeemablesCreatedAt read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterFiltersListCustomerRedeemablesCreatedAt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterFiltersListCustomerRedeemablesCreatedAt
  * @throws IOException if the JSON string is invalid with respect to ParameterFiltersListCustomerRedeemablesCreatedAt
  */
  public static ParameterFiltersListCustomerRedeemablesCreatedAt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterFiltersListCustomerRedeemablesCreatedAt.class);
  }

 /**
  * Convert an instance of ParameterFiltersListCustomerRedeemablesCreatedAt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

