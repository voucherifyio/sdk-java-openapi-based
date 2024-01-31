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
import voucherify.client.model.ParameterFiltersListRedemptionsCampaignName;
import voucherify.client.model.ParameterFiltersListRedemptionsCustomerId;
import voucherify.client.model.ParameterFiltersListRedemptionsFailureCode;
import voucherify.client.model.ParameterFiltersListRedemptionsObject;
import voucherify.client.model.ParameterFiltersListRedemptionsParentRedemptionId;
import voucherify.client.model.ParameterFiltersListRedemptionsRelatedObjectId;
import voucherify.client.model.ParameterFiltersListRedemptionsRelatedObjectParentId;
import voucherify.client.model.ParameterFiltersListRedemptionsResult;
import voucherify.client.model.ParameterFiltersListRedemptionsUserLogin;
import voucherify.client.model.ParameterFiltersListRedemptionsVoucherCode;

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
 * ParameterFiltersListRedemptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParameterFiltersListRedemptions {
  public static final String SERIALIZED_NAME_VOUCHER_CODE = "voucher_code";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODE)
  private ParameterFiltersListRedemptionsVoucherCode voucherCode;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private ParameterFiltersListRedemptionsRelatedObjectId relatedObjectId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_PARENT_ID = "related_object_parent_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_PARENT_ID)
  private ParameterFiltersListRedemptionsRelatedObjectParentId relatedObjectParentId;

  public static final String SERIALIZED_NAME_PARENT_REDEMPTION_ID = "parent_redemption_id";
  @SerializedName(SERIALIZED_NAME_PARENT_REDEMPTION_ID)
  private ParameterFiltersListRedemptionsParentRedemptionId parentRedemptionId;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private ParameterFiltersListRedemptionsFailureCode failureCode;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ParameterFiltersListRedemptionsResult result;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ParameterFiltersListRedemptionsObject _object;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private ParameterFiltersListRedemptionsCustomerId customerId;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private ParameterFiltersListRedemptionsCampaignName campaignName;

  public static final String SERIALIZED_NAME_USER_LOGIN = "user_login";
  @SerializedName(SERIALIZED_NAME_USER_LOGIN)
  private ParameterFiltersListRedemptionsUserLogin userLogin;

  public ParameterFiltersListRedemptions() {
  }

  public ParameterFiltersListRedemptions voucherCode(ParameterFiltersListRedemptionsVoucherCode voucherCode) {
    
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * Get voucherCode
   * @return voucherCode
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsVoucherCode getVoucherCode() {
    return voucherCode;
  }


  public void setVoucherCode(ParameterFiltersListRedemptionsVoucherCode voucherCode) {
    this.voucherCode = voucherCode;
  }


  public ParameterFiltersListRedemptions relatedObjectId(ParameterFiltersListRedemptionsRelatedObjectId relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * Get relatedObjectId
   * @return relatedObjectId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsRelatedObjectId getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(ParameterFiltersListRedemptionsRelatedObjectId relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public ParameterFiltersListRedemptions relatedObjectParentId(ParameterFiltersListRedemptionsRelatedObjectParentId relatedObjectParentId) {
    
    this.relatedObjectParentId = relatedObjectParentId;
    return this;
  }

   /**
   * Get relatedObjectParentId
   * @return relatedObjectParentId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsRelatedObjectParentId getRelatedObjectParentId() {
    return relatedObjectParentId;
  }


  public void setRelatedObjectParentId(ParameterFiltersListRedemptionsRelatedObjectParentId relatedObjectParentId) {
    this.relatedObjectParentId = relatedObjectParentId;
  }


  public ParameterFiltersListRedemptions parentRedemptionId(ParameterFiltersListRedemptionsParentRedemptionId parentRedemptionId) {
    
    this.parentRedemptionId = parentRedemptionId;
    return this;
  }

   /**
   * Get parentRedemptionId
   * @return parentRedemptionId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsParentRedemptionId getParentRedemptionId() {
    return parentRedemptionId;
  }


  public void setParentRedemptionId(ParameterFiltersListRedemptionsParentRedemptionId parentRedemptionId) {
    this.parentRedemptionId = parentRedemptionId;
  }


  public ParameterFiltersListRedemptions failureCode(ParameterFiltersListRedemptionsFailureCode failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Get failureCode
   * @return failureCode
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsFailureCode getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(ParameterFiltersListRedemptionsFailureCode failureCode) {
    this.failureCode = failureCode;
  }


  public ParameterFiltersListRedemptions result(ParameterFiltersListRedemptionsResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsResult getResult() {
    return result;
  }


  public void setResult(ParameterFiltersListRedemptionsResult result) {
    this.result = result;
  }


  public ParameterFiltersListRedemptions _object(ParameterFiltersListRedemptionsObject _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsObject getObject() {
    return _object;
  }


  public void setObject(ParameterFiltersListRedemptionsObject _object) {
    this._object = _object;
  }


  public ParameterFiltersListRedemptions customerId(ParameterFiltersListRedemptionsCustomerId customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsCustomerId getCustomerId() {
    return customerId;
  }


  public void setCustomerId(ParameterFiltersListRedemptionsCustomerId customerId) {
    this.customerId = customerId;
  }


  public ParameterFiltersListRedemptions campaignName(ParameterFiltersListRedemptionsCampaignName campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Get campaignName
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsCampaignName getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(ParameterFiltersListRedemptionsCampaignName campaignName) {
    this.campaignName = campaignName;
  }


  public ParameterFiltersListRedemptions userLogin(ParameterFiltersListRedemptionsUserLogin userLogin) {
    
    this.userLogin = userLogin;
    return this;
  }

   /**
   * Get userLogin
   * @return userLogin
  **/
  @javax.annotation.Nullable
  public ParameterFiltersListRedemptionsUserLogin getUserLogin() {
    return userLogin;
  }


  public void setUserLogin(ParameterFiltersListRedemptionsUserLogin userLogin) {
    this.userLogin = userLogin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterFiltersListRedemptions parameterFiltersListRedemptions = (ParameterFiltersListRedemptions) o;
    return Objects.equals(this.voucherCode, parameterFiltersListRedemptions.voucherCode) &&
        Objects.equals(this.relatedObjectId, parameterFiltersListRedemptions.relatedObjectId) &&
        Objects.equals(this.relatedObjectParentId, parameterFiltersListRedemptions.relatedObjectParentId) &&
        Objects.equals(this.parentRedemptionId, parameterFiltersListRedemptions.parentRedemptionId) &&
        Objects.equals(this.failureCode, parameterFiltersListRedemptions.failureCode) &&
        Objects.equals(this.result, parameterFiltersListRedemptions.result) &&
        Objects.equals(this._object, parameterFiltersListRedemptions._object) &&
        Objects.equals(this.customerId, parameterFiltersListRedemptions.customerId) &&
        Objects.equals(this.campaignName, parameterFiltersListRedemptions.campaignName) &&
        Objects.equals(this.userLogin, parameterFiltersListRedemptions.userLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherCode, relatedObjectId, relatedObjectParentId, parentRedemptionId, failureCode, result, _object, customerId, campaignName, userLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterFiltersListRedemptions {\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    relatedObjectParentId: ").append(toIndentedString(relatedObjectParentId)).append("\n");
    sb.append("    parentRedemptionId: ").append(toIndentedString(parentRedemptionId)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    userLogin: ").append(toIndentedString(userLogin)).append("\n");
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
    openapiFields.add("voucher_code");
    openapiFields.add("related_object_id");
    openapiFields.add("related_object_parent_id");
    openapiFields.add("parent_redemption_id");
    openapiFields.add("failure_code");
    openapiFields.add("result");
    openapiFields.add("object");
    openapiFields.add("customer_id");
    openapiFields.add("campaign_name");
    openapiFields.add("user_login");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ParameterFiltersListRedemptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParameterFiltersListRedemptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParameterFiltersListRedemptions is not found in the empty JSON string", ParameterFiltersListRedemptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParameterFiltersListRedemptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParameterFiltersListRedemptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `voucher_code`
      if (jsonObj.get("voucher_code") != null && !jsonObj.get("voucher_code").isJsonNull()) {
        ParameterFiltersListRedemptionsVoucherCode.validateJsonElement(jsonObj.get("voucher_code"));
      }
      // validate the optional field `related_object_id`
      if (jsonObj.get("related_object_id") != null && !jsonObj.get("related_object_id").isJsonNull()) {
        ParameterFiltersListRedemptionsRelatedObjectId.validateJsonElement(jsonObj.get("related_object_id"));
      }
      // validate the optional field `related_object_parent_id`
      if (jsonObj.get("related_object_parent_id") != null && !jsonObj.get("related_object_parent_id").isJsonNull()) {
        ParameterFiltersListRedemptionsRelatedObjectParentId.validateJsonElement(jsonObj.get("related_object_parent_id"));
      }
      // validate the optional field `parent_redemption_id`
      if (jsonObj.get("parent_redemption_id") != null && !jsonObj.get("parent_redemption_id").isJsonNull()) {
        ParameterFiltersListRedemptionsParentRedemptionId.validateJsonElement(jsonObj.get("parent_redemption_id"));
      }
      // validate the optional field `failure_code`
      if (jsonObj.get("failure_code") != null && !jsonObj.get("failure_code").isJsonNull()) {
        ParameterFiltersListRedemptionsFailureCode.validateJsonElement(jsonObj.get("failure_code"));
      }
      // validate the optional field `result`
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        ParameterFiltersListRedemptionsResult.validateJsonElement(jsonObj.get("result"));
      }
      // validate the optional field `object`
      if (jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) {
        ParameterFiltersListRedemptionsObject.validateJsonElement(jsonObj.get("object"));
      }
      // validate the optional field `customer_id`
      if (jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) {
        ParameterFiltersListRedemptionsCustomerId.validateJsonElement(jsonObj.get("customer_id"));
      }
      // validate the optional field `campaign_name`
      if (jsonObj.get("campaign_name") != null && !jsonObj.get("campaign_name").isJsonNull()) {
        ParameterFiltersListRedemptionsCampaignName.validateJsonElement(jsonObj.get("campaign_name"));
      }
      // validate the optional field `user_login`
      if (jsonObj.get("user_login") != null && !jsonObj.get("user_login").isJsonNull()) {
        ParameterFiltersListRedemptionsUserLogin.validateJsonElement(jsonObj.get("user_login"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterFiltersListRedemptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterFiltersListRedemptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterFiltersListRedemptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterFiltersListRedemptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterFiltersListRedemptions>() {
           @Override
           public void write(JsonWriter out, ParameterFiltersListRedemptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterFiltersListRedemptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterFiltersListRedemptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterFiltersListRedemptions
  * @throws IOException if the JSON string is invalid with respect to ParameterFiltersListRedemptions
  */
  public static ParameterFiltersListRedemptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterFiltersListRedemptions.class);
  }

 /**
  * Convert an instance of ParameterFiltersListRedemptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

