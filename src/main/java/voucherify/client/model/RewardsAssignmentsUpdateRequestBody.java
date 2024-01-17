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
import voucherify.client.model.RewardsAssignmentsUpdateRequestBodyParameters;

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
 * Request body schema for **PUT** &#x60;/loyalties/{campaignId}/rewards/{assignmentId}&#x60; and **PUT** &#x60;/rewards/{rewardId}/assignments/{assignmentId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class RewardsAssignmentsUpdateRequestBody {
  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private RewardsAssignmentsUpdateRequestBodyParameters parameters;

  public RewardsAssignmentsUpdateRequestBody() {
  }

  public RewardsAssignmentsUpdateRequestBody parameters(RewardsAssignmentsUpdateRequestBodyParameters parameters) {
    
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public RewardsAssignmentsUpdateRequestBodyParameters getParameters() {
    return parameters;
  }


  public void setParameters(RewardsAssignmentsUpdateRequestBodyParameters parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardsAssignmentsUpdateRequestBody rewardsAssignmentsUpdateRequestBody = (RewardsAssignmentsUpdateRequestBody) o;
    return Objects.equals(this.parameters, rewardsAssignmentsUpdateRequestBody.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardsAssignmentsUpdateRequestBody {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RewardsAssignmentsUpdateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RewardsAssignmentsUpdateRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RewardsAssignmentsUpdateRequestBody is not found in the empty JSON string", RewardsAssignmentsUpdateRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RewardsAssignmentsUpdateRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RewardsAssignmentsUpdateRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `parameters`
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        RewardsAssignmentsUpdateRequestBodyParameters.validateJsonElement(jsonObj.get("parameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RewardsAssignmentsUpdateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RewardsAssignmentsUpdateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RewardsAssignmentsUpdateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RewardsAssignmentsUpdateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<RewardsAssignmentsUpdateRequestBody>() {
           @Override
           public void write(JsonWriter out, RewardsAssignmentsUpdateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RewardsAssignmentsUpdateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RewardsAssignmentsUpdateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardsAssignmentsUpdateRequestBody
  * @throws IOException if the JSON string is invalid with respect to RewardsAssignmentsUpdateRequestBody
  */
  public static RewardsAssignmentsUpdateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardsAssignmentsUpdateRequestBody.class);
  }

 /**
  * Convert an instance of RewardsAssignmentsUpdateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

