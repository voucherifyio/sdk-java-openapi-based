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
import java.util.Arrays;
import org.openapitools.client.model.FilterConditionsString;
import org.openapitools.client.model.Junction;

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
 * Result, i.e. &#x60;SUCCESS&#x60; or &#x60;FAILURE&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class ParameterFiltersListRedemptionsResult {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private FilterConditionsString conditions;

  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public ParameterFiltersListRedemptionsResult() {
  }

  public ParameterFiltersListRedemptionsResult conditions(FilterConditionsString conditions) {
    
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nullable
  public FilterConditionsString getConditions() {
    return conditions;
  }


  public void setConditions(FilterConditionsString conditions) {
    this.conditions = conditions;
  }


  public ParameterFiltersListRedemptionsResult junction(Junction junction) {
    
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
    ParameterFiltersListRedemptionsResult parameterFiltersListRedemptionsResult = (ParameterFiltersListRedemptionsResult) o;
    return Objects.equals(this.conditions, parameterFiltersListRedemptionsResult.conditions) &&
        Objects.equals(this.junction, parameterFiltersListRedemptionsResult.junction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, junction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterFiltersListRedemptionsResult {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to ParameterFiltersListRedemptionsResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParameterFiltersListRedemptionsResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParameterFiltersListRedemptionsResult is not found in the empty JSON string", ParameterFiltersListRedemptionsResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParameterFiltersListRedemptionsResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParameterFiltersListRedemptionsResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `conditions`
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        FilterConditionsString.validateJsonElement(jsonObj.get("conditions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterFiltersListRedemptionsResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterFiltersListRedemptionsResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterFiltersListRedemptionsResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterFiltersListRedemptionsResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterFiltersListRedemptionsResult>() {
           @Override
           public void write(JsonWriter out, ParameterFiltersListRedemptionsResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterFiltersListRedemptionsResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterFiltersListRedemptionsResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterFiltersListRedemptionsResult
  * @throws IOException if the JSON string is invalid with respect to ParameterFiltersListRedemptionsResult
  */
  public static ParameterFiltersListRedemptionsResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterFiltersListRedemptionsResult.class);
  }

 /**
  * Convert an instance of ParameterFiltersListRedemptionsResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

