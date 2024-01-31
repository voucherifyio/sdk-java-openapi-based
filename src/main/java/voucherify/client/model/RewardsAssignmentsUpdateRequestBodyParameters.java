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
import voucherify.client.model.RewardsAssignmentsUpdateRequestBodyParametersLoyalty;

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
 * An object that defines the price of the reward in loyalty points.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RewardsAssignmentsUpdateRequestBodyParameters {
  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private RewardsAssignmentsUpdateRequestBodyParametersLoyalty loyalty;

  public RewardsAssignmentsUpdateRequestBodyParameters() {
  }

  public RewardsAssignmentsUpdateRequestBodyParameters loyalty(RewardsAssignmentsUpdateRequestBodyParametersLoyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nullable
  public RewardsAssignmentsUpdateRequestBodyParametersLoyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(RewardsAssignmentsUpdateRequestBodyParametersLoyalty loyalty) {
    this.loyalty = loyalty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardsAssignmentsUpdateRequestBodyParameters rewardsAssignmentsUpdateRequestBodyParameters = (RewardsAssignmentsUpdateRequestBodyParameters) o;
    return Objects.equals(this.loyalty, rewardsAssignmentsUpdateRequestBodyParameters.loyalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyalty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardsAssignmentsUpdateRequestBodyParameters {\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
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
    openapiFields.add("loyalty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RewardsAssignmentsUpdateRequestBodyParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RewardsAssignmentsUpdateRequestBodyParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RewardsAssignmentsUpdateRequestBodyParameters is not found in the empty JSON string", RewardsAssignmentsUpdateRequestBodyParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RewardsAssignmentsUpdateRequestBodyParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RewardsAssignmentsUpdateRequestBodyParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `loyalty`
      if (jsonObj.get("loyalty") != null && !jsonObj.get("loyalty").isJsonNull()) {
        RewardsAssignmentsUpdateRequestBodyParametersLoyalty.validateJsonElement(jsonObj.get("loyalty"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RewardsAssignmentsUpdateRequestBodyParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RewardsAssignmentsUpdateRequestBodyParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RewardsAssignmentsUpdateRequestBodyParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RewardsAssignmentsUpdateRequestBodyParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<RewardsAssignmentsUpdateRequestBodyParameters>() {
           @Override
           public void write(JsonWriter out, RewardsAssignmentsUpdateRequestBodyParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RewardsAssignmentsUpdateRequestBodyParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RewardsAssignmentsUpdateRequestBodyParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardsAssignmentsUpdateRequestBodyParameters
  * @throws IOException if the JSON string is invalid with respect to RewardsAssignmentsUpdateRequestBodyParameters
  */
  public static RewardsAssignmentsUpdateRequestBodyParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardsAssignmentsUpdateRequestBodyParameters.class);
  }

 /**
  * Convert an instance of RewardsAssignmentsUpdateRequestBodyParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
