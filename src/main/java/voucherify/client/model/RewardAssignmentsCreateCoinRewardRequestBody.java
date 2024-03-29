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
 * Request body schema for **POST** &#x60;/rewards/{rewardID}/assignments&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RewardAssignmentsCreateCoinRewardRequestBody {
  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private String campaign;

  public static final String SERIALIZED_NAME_VALIDATION_RULES = "validation_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES)
  private List<String> validationRules;

  public RewardAssignmentsCreateCoinRewardRequestBody() {
  }

  public RewardAssignmentsCreateCoinRewardRequestBody campaign(String campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * The campaign ID of the campaign to which the reward is to be assigned.
   * @return campaign
  **/
  @javax.annotation.Nonnull
  public String getCampaign() {
    return campaign;
  }


  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }


  public RewardAssignmentsCreateCoinRewardRequestBody validationRules(List<String> validationRules) {
    
    this.validationRules = validationRules;
    return this;
  }

  public RewardAssignmentsCreateCoinRewardRequestBody addValidationRulesItem(String validationRulesItem) {
    if (this.validationRules == null) {
      this.validationRules = new ArrayList<>();
    }
    this.validationRules.add(validationRulesItem);
    return this;
  }

   /**
   * Get validationRules
   * @return validationRules
  **/
  @javax.annotation.Nullable
  public List<String> getValidationRules() {
    return validationRules;
  }


  public void setValidationRules(List<String> validationRules) {
    this.validationRules = validationRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardAssignmentsCreateCoinRewardRequestBody rewardAssignmentsCreateCoinRewardRequestBody = (RewardAssignmentsCreateCoinRewardRequestBody) o;
    return Objects.equals(this.campaign, rewardAssignmentsCreateCoinRewardRequestBody.campaign) &&
        Objects.equals(this.validationRules, rewardAssignmentsCreateCoinRewardRequestBody.validationRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, validationRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardAssignmentsCreateCoinRewardRequestBody {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    validationRules: ").append(toIndentedString(validationRules)).append("\n");
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
    openapiFields.add("campaign");
    openapiFields.add("validation_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("campaign");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RewardAssignmentsCreateCoinRewardRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RewardAssignmentsCreateCoinRewardRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RewardAssignmentsCreateCoinRewardRequestBody is not found in the empty JSON string", RewardAssignmentsCreateCoinRewardRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RewardAssignmentsCreateCoinRewardRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RewardAssignmentsCreateCoinRewardRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RewardAssignmentsCreateCoinRewardRequestBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("campaign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validation_rules") != null && !jsonObj.get("validation_rules").isJsonNull() && !jsonObj.get("validation_rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_rules` to be an array in the JSON string but got `%s`", jsonObj.get("validation_rules").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RewardAssignmentsCreateCoinRewardRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RewardAssignmentsCreateCoinRewardRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RewardAssignmentsCreateCoinRewardRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RewardAssignmentsCreateCoinRewardRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<RewardAssignmentsCreateCoinRewardRequestBody>() {
           @Override
           public void write(JsonWriter out, RewardAssignmentsCreateCoinRewardRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RewardAssignmentsCreateCoinRewardRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RewardAssignmentsCreateCoinRewardRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardAssignmentsCreateCoinRewardRequestBody
  * @throws IOException if the JSON string is invalid with respect to RewardAssignmentsCreateCoinRewardRequestBody
  */
  public static RewardAssignmentsCreateCoinRewardRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardAssignmentsCreateCoinRewardRequestBody.class);
  }

 /**
  * Convert an instance of RewardAssignmentsCreateCoinRewardRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

