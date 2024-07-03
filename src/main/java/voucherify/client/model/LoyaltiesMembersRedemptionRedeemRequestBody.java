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
import voucherify.client.model.LoyaltiesMembersRedemptionRedeemRequestBodyReward;
import voucherify.client.model.Order;

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
 * Request body schema for **POST** &#x60;/loyalties/{campaignId}/members/{memberId}/redemption&#x60; and for **POST** &#x60;/loyalties/members/{memberId}/redemption&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesMembersRedemptionRedeemRequestBody {
  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private LoyaltiesMembersRedemptionRedeemRequestBodyReward reward;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public LoyaltiesMembersRedemptionRedeemRequestBody() {
  }

  public LoyaltiesMembersRedemptionRedeemRequestBody reward(LoyaltiesMembersRedemptionRedeemRequestBodyReward reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nullable
  public LoyaltiesMembersRedemptionRedeemRequestBodyReward getReward() {
    return reward;
  }


  public void setReward(LoyaltiesMembersRedemptionRedeemRequestBodyReward reward) {
    this.reward = reward;
  }


  public LoyaltiesMembersRedemptionRedeemRequestBody order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public LoyaltiesMembersRedemptionRedeemRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of key/value pairs that you can send in the request body to check against vouchers requiring **redemption** metadata validation rules to be satisfied. The validation runs against rules that are defined through the &lt;!-- [Create Validation Rules](https://docs.voucherify.io/reference/create-validation-rules) --&gt;[Create Validation Rules](ref:create-validation-rules) endpoint or via the Dashboard; in the _Advanced Rule Builder_ &amp;rarr; _Advanced_ &amp;rarr; _Redemption metadata satisfy_ or _Basic Builder_ &amp;rarr; _Attributes match_ &amp;rarr; _REDEMPTION METADATA_. [Read more](https://support.voucherify.io/article/148-how-to-build-a-rule).
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesMembersRedemptionRedeemRequestBody loyaltiesMembersRedemptionRedeemRequestBody = (LoyaltiesMembersRedemptionRedeemRequestBody) o;
    return Objects.equals(this.reward, loyaltiesMembersRedemptionRedeemRequestBody.reward) &&
        Objects.equals(this.order, loyaltiesMembersRedemptionRedeemRequestBody.order) &&
        Objects.equals(this.metadata, loyaltiesMembersRedemptionRedeemRequestBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reward, order, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltiesMembersRedemptionRedeemRequestBody {\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("reward");
    openapiFields.add("order");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesMembersRedemptionRedeemRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesMembersRedemptionRedeemRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesMembersRedemptionRedeemRequestBody is not found in the empty JSON string", LoyaltiesMembersRedemptionRedeemRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesMembersRedemptionRedeemRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesMembersRedemptionRedeemRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `reward`
      if (jsonObj.get("reward") != null && !jsonObj.get("reward").isJsonNull()) {
        LoyaltiesMembersRedemptionRedeemRequestBodyReward.validateJsonElement(jsonObj.get("reward"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Order.validateJsonElement(jsonObj.get("order"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesMembersRedemptionRedeemRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesMembersRedemptionRedeemRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesMembersRedemptionRedeemRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesMembersRedemptionRedeemRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesMembersRedemptionRedeemRequestBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesMembersRedemptionRedeemRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesMembersRedemptionRedeemRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesMembersRedemptionRedeemRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesMembersRedemptionRedeemRequestBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesMembersRedemptionRedeemRequestBody
  */
  public static LoyaltiesMembersRedemptionRedeemRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesMembersRedemptionRedeemRequestBody.class);
  }

 /**
  * Convert an instance of LoyaltiesMembersRedemptionRedeemRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

