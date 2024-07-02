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
import java.util.Arrays;

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
 * ParameterCreatedBeforeAfter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParameterCreatedBeforeAfter {
  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private OffsetDateTime before;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private OffsetDateTime after;

  public ParameterCreatedBeforeAfter() {
  }

  public ParameterCreatedBeforeAfter before(OffsetDateTime before) {
    
    this.before = before;
    return this;
  }

   /**
   * Timestamp representing the date and time before the voucher was created. The value is shown in the ISO 8601 format.
   * @return before
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getBefore() {
    return before;
  }


  public void setBefore(OffsetDateTime before) {
    this.before = before;
  }


  public ParameterCreatedBeforeAfter after(OffsetDateTime after) {
    
    this.after = after;
    return this;
  }

   /**
   * Timestamp representing the date and time after the voucher was created. The value is shown in the ISO 8601 format.
   * @return after
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getAfter() {
    return after;
  }


  public void setAfter(OffsetDateTime after) {
    this.after = after;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterCreatedBeforeAfter parameterCreatedBeforeAfter = (ParameterCreatedBeforeAfter) o;
    return Objects.equals(this.before, parameterCreatedBeforeAfter.before) &&
        Objects.equals(this.after, parameterCreatedBeforeAfter.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(before, after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterCreatedBeforeAfter {\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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
    openapiFields.add("before");
    openapiFields.add("after");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ParameterCreatedBeforeAfter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParameterCreatedBeforeAfter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParameterCreatedBeforeAfter is not found in the empty JSON string", ParameterCreatedBeforeAfter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParameterCreatedBeforeAfter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParameterCreatedBeforeAfter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterCreatedBeforeAfter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterCreatedBeforeAfter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterCreatedBeforeAfter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterCreatedBeforeAfter.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterCreatedBeforeAfter>() {
           @Override
           public void write(JsonWriter out, ParameterCreatedBeforeAfter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterCreatedBeforeAfter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterCreatedBeforeAfter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterCreatedBeforeAfter
  * @throws IOException if the JSON string is invalid with respect to ParameterCreatedBeforeAfter
  */
  public static ParameterCreatedBeforeAfter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterCreatedBeforeAfter.class);
  }

 /**
  * Convert an instance of ParameterCreatedBeforeAfter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

