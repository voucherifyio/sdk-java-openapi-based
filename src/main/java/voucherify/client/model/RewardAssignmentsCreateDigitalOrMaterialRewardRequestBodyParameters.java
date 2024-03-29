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
import voucherify.client.model.RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParametersLoyalty;

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
 * Defines the cost of the reward.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters {
  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParametersLoyalty loyalty;

  public RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters() {
  }

  public RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters loyalty(RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParametersLoyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nonnull
  public RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParametersLoyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParametersLoyalty loyalty) {
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
    RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters rewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters = (RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters) o;
    return Objects.equals(this.loyalty, rewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters.loyalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyalty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters {\n");
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
    openapiRequiredFields.add("loyalty");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters is not found in the empty JSON string", RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `loyalty`
      RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParametersLoyalty.validateJsonElement(jsonObj.get("loyalty"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters>() {
           @Override
           public void write(JsonWriter out, RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters
  * @throws IOException if the JSON string is invalid with respect to RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters
  */
  public static RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters.class);
  }

 /**
  * Convert an instance of RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

