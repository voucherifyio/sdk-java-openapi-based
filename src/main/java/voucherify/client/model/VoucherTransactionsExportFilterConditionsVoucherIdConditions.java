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
 * Data filters used to narrow the data records to be returned in the result.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VoucherTransactionsExportFilterConditionsVoucherIdConditions {
  public static final String SERIALIZED_NAME_$_IN = "$in";
  @SerializedName(SERIALIZED_NAME_$_IN)
  private List<String> $in = new ArrayList<>();

  public VoucherTransactionsExportFilterConditionsVoucherIdConditions() {
  }

  public VoucherTransactionsExportFilterConditionsVoucherIdConditions $in(List<String> $in) {
    
    this.$in = $in;
    return this;
  }

  public VoucherTransactionsExportFilterConditionsVoucherIdConditions add$InItem(String $inItem) {
    if (this.$in == null) {
      this.$in = new ArrayList<>();
    }
    this.$in.add($inItem);
    return this;
  }

   /**
   * Get $in
   * @return $in
  **/
  @javax.annotation.Nonnull
  public List<String> get$In() {
    return $in;
  }


  public void set$In(List<String> $in) {
    this.$in = $in;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherTransactionsExportFilterConditionsVoucherIdConditions voucherTransactionsExportFilterConditionsVoucherIdConditions = (VoucherTransactionsExportFilterConditionsVoucherIdConditions) o;
    return Objects.equals(this.$in, voucherTransactionsExportFilterConditionsVoucherIdConditions.$in);
  }

  @Override
  public int hashCode() {
    return Objects.hash($in);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherTransactionsExportFilterConditionsVoucherIdConditions {\n");
    sb.append("    $in: ").append(toIndentedString($in)).append("\n");
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
    openapiFields.add("$in");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("$in");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VoucherTransactionsExportFilterConditionsVoucherIdConditions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VoucherTransactionsExportFilterConditionsVoucherIdConditions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherTransactionsExportFilterConditionsVoucherIdConditions is not found in the empty JSON string", VoucherTransactionsExportFilterConditionsVoucherIdConditions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VoucherTransactionsExportFilterConditionsVoucherIdConditions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherTransactionsExportFilterConditionsVoucherIdConditions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VoucherTransactionsExportFilterConditionsVoucherIdConditions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("$in") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("$in").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `$in` to be an array in the JSON string but got `%s`", jsonObj.get("$in").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherTransactionsExportFilterConditionsVoucherIdConditions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherTransactionsExportFilterConditionsVoucherIdConditions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherTransactionsExportFilterConditionsVoucherIdConditions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherTransactionsExportFilterConditionsVoucherIdConditions.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherTransactionsExportFilterConditionsVoucherIdConditions>() {
           @Override
           public void write(JsonWriter out, VoucherTransactionsExportFilterConditionsVoucherIdConditions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherTransactionsExportFilterConditionsVoucherIdConditions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherTransactionsExportFilterConditionsVoucherIdConditions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherTransactionsExportFilterConditionsVoucherIdConditions
  * @throws IOException if the JSON string is invalid with respect to VoucherTransactionsExportFilterConditionsVoucherIdConditions
  */
  public static VoucherTransactionsExportFilterConditionsVoucherIdConditions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherTransactionsExportFilterConditionsVoucherIdConditions.class);
  }

 /**
  * Convert an instance of VoucherTransactionsExportFilterConditionsVoucherIdConditions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

