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
import voucherify.client.model.OrderCalculated;
import voucherify.client.model.Redemption;
import voucherify.client.model.ValidationsRedeemableInapplicable;
import voucherify.client.model.ValidationsRedeemableSkipped;

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
 * Response body schema for **POST** &#x60;/redemptions&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class ClientRedemptionsRedeemResponseBody {
  public static final String SERIALIZED_NAME_REDEMPTIONS = "redemptions";
  @SerializedName(SERIALIZED_NAME_REDEMPTIONS)
  private List<Redemption> redemptions;

  public static final String SERIALIZED_NAME_PARENT_REDEMPTION = "parent_redemption";
  @SerializedName(SERIALIZED_NAME_PARENT_REDEMPTION)
  private Redemption parentRedemption;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES = "inapplicable_redeemables";
  @SerializedName(SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES)
  private List<ValidationsRedeemableInapplicable> inapplicableRedeemables;

  public static final String SERIALIZED_NAME_SKIPPED_REDEEMABLES = "skipped_redeemables";
  @SerializedName(SERIALIZED_NAME_SKIPPED_REDEEMABLES)
  private List<ValidationsRedeemableSkipped> skippedRedeemables;

  public ClientRedemptionsRedeemResponseBody() {
  }

  public ClientRedemptionsRedeemResponseBody redemptions(List<Redemption> redemptions) {
    
    this.redemptions = redemptions;
    return this;
  }

  public ClientRedemptionsRedeemResponseBody addRedemptionsItem(Redemption redemptionsItem) {
    if (this.redemptions == null) {
      this.redemptions = new ArrayList<>();
    }
    this.redemptions.add(redemptionsItem);
    return this;
  }

   /**
   * Get redemptions
   * @return redemptions
  **/
  @javax.annotation.Nullable
  public List<Redemption> getRedemptions() {
    return redemptions;
  }


  public void setRedemptions(List<Redemption> redemptions) {
    this.redemptions = redemptions;
  }


  public ClientRedemptionsRedeemResponseBody parentRedemption(Redemption parentRedemption) {
    
    this.parentRedemption = parentRedemption;
    return this;
  }

   /**
   * Get parentRedemption
   * @return parentRedemption
  **/
  @javax.annotation.Nullable
  public Redemption getParentRedemption() {
    return parentRedemption;
  }


  public void setParentRedemption(Redemption parentRedemption) {
    this.parentRedemption = parentRedemption;
  }


  public ClientRedemptionsRedeemResponseBody order(OrderCalculated order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderCalculated getOrder() {
    return order;
  }


  public void setOrder(OrderCalculated order) {
    this.order = order;
  }


  public ClientRedemptionsRedeemResponseBody inapplicableRedeemables(List<ValidationsRedeemableInapplicable> inapplicableRedeemables) {
    
    this.inapplicableRedeemables = inapplicableRedeemables;
    return this;
  }

  public ClientRedemptionsRedeemResponseBody addInapplicableRedeemablesItem(ValidationsRedeemableInapplicable inapplicableRedeemablesItem) {
    if (this.inapplicableRedeemables == null) {
      this.inapplicableRedeemables = new ArrayList<>();
    }
    this.inapplicableRedeemables.add(inapplicableRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each inapplicable redeemable.
   * @return inapplicableRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableInapplicable> getInapplicableRedeemables() {
    return inapplicableRedeemables;
  }


  public void setInapplicableRedeemables(List<ValidationsRedeemableInapplicable> inapplicableRedeemables) {
    this.inapplicableRedeemables = inapplicableRedeemables;
  }


  public ClientRedemptionsRedeemResponseBody skippedRedeemables(List<ValidationsRedeemableSkipped> skippedRedeemables) {
    
    this.skippedRedeemables = skippedRedeemables;
    return this;
  }

  public ClientRedemptionsRedeemResponseBody addSkippedRedeemablesItem(ValidationsRedeemableSkipped skippedRedeemablesItem) {
    if (this.skippedRedeemables == null) {
      this.skippedRedeemables = new ArrayList<>();
    }
    this.skippedRedeemables.add(skippedRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each redeemable. If a redeemable can be applied, the API returns &#x60;\&quot;status\&quot;: \&quot;APPLICABLE\&quot;&#x60;.
   * @return skippedRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableSkipped> getSkippedRedeemables() {
    return skippedRedeemables;
  }


  public void setSkippedRedeemables(List<ValidationsRedeemableSkipped> skippedRedeemables) {
    this.skippedRedeemables = skippedRedeemables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientRedemptionsRedeemResponseBody clientRedemptionsRedeemResponseBody = (ClientRedemptionsRedeemResponseBody) o;
    return Objects.equals(this.redemptions, clientRedemptionsRedeemResponseBody.redemptions) &&
        Objects.equals(this.parentRedemption, clientRedemptionsRedeemResponseBody.parentRedemption) &&
        Objects.equals(this.order, clientRedemptionsRedeemResponseBody.order) &&
        Objects.equals(this.inapplicableRedeemables, clientRedemptionsRedeemResponseBody.inapplicableRedeemables) &&
        Objects.equals(this.skippedRedeemables, clientRedemptionsRedeemResponseBody.skippedRedeemables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redemptions, parentRedemption, order, inapplicableRedeemables, skippedRedeemables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientRedemptionsRedeemResponseBody {\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    parentRedemption: ").append(toIndentedString(parentRedemption)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    inapplicableRedeemables: ").append(toIndentedString(inapplicableRedeemables)).append("\n");
    sb.append("    skippedRedeemables: ").append(toIndentedString(skippedRedeemables)).append("\n");
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
    openapiFields.add("redemptions");
    openapiFields.add("parent_redemption");
    openapiFields.add("order");
    openapiFields.add("inapplicable_redeemables");
    openapiFields.add("skipped_redeemables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClientRedemptionsRedeemResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientRedemptionsRedeemResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientRedemptionsRedeemResponseBody is not found in the empty JSON string", ClientRedemptionsRedeemResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientRedemptionsRedeemResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientRedemptionsRedeemResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("redemptions") != null && !jsonObj.get("redemptions").isJsonNull()) {
        JsonArray jsonArrayredemptions = jsonObj.getAsJsonArray("redemptions");
        if (jsonArrayredemptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("redemptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `redemptions` to be an array in the JSON string but got `%s`", jsonObj.get("redemptions").toString()));
          }

          // validate the optional field `redemptions` (array)
          for (int i = 0; i < jsonArrayredemptions.size(); i++) {
            Redemption.validateJsonElement(jsonArrayredemptions.get(i));
          };
        }
      }
      // validate the optional field `parent_redemption`
      if (jsonObj.get("parent_redemption") != null && !jsonObj.get("parent_redemption").isJsonNull()) {
        Redemption.validateJsonElement(jsonObj.get("parent_redemption"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        OrderCalculated.validateJsonElement(jsonObj.get("order"));
      }
      if (jsonObj.get("inapplicable_redeemables") != null && !jsonObj.get("inapplicable_redeemables").isJsonNull()) {
        JsonArray jsonArrayinapplicableRedeemables = jsonObj.getAsJsonArray("inapplicable_redeemables");
        if (jsonArrayinapplicableRedeemables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inapplicable_redeemables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inapplicable_redeemables` to be an array in the JSON string but got `%s`", jsonObj.get("inapplicable_redeemables").toString()));
          }

          // validate the optional field `inapplicable_redeemables` (array)
          for (int i = 0; i < jsonArrayinapplicableRedeemables.size(); i++) {
            ValidationsRedeemableInapplicable.validateJsonElement(jsonArrayinapplicableRedeemables.get(i));
          };
        }
      }
      if (jsonObj.get("skipped_redeemables") != null && !jsonObj.get("skipped_redeemables").isJsonNull()) {
        JsonArray jsonArrayskippedRedeemables = jsonObj.getAsJsonArray("skipped_redeemables");
        if (jsonArrayskippedRedeemables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skipped_redeemables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skipped_redeemables` to be an array in the JSON string but got `%s`", jsonObj.get("skipped_redeemables").toString()));
          }

          // validate the optional field `skipped_redeemables` (array)
          for (int i = 0; i < jsonArrayskippedRedeemables.size(); i++) {
            ValidationsRedeemableSkipped.validateJsonElement(jsonArrayskippedRedeemables.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientRedemptionsRedeemResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientRedemptionsRedeemResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientRedemptionsRedeemResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientRedemptionsRedeemResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientRedemptionsRedeemResponseBody>() {
           @Override
           public void write(JsonWriter out, ClientRedemptionsRedeemResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientRedemptionsRedeemResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientRedemptionsRedeemResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientRedemptionsRedeemResponseBody
  * @throws IOException if the JSON string is invalid with respect to ClientRedemptionsRedeemResponseBody
  */
  public static ClientRedemptionsRedeemResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientRedemptionsRedeemResponseBody.class);
  }

 /**
  * Convert an instance of ClientRedemptionsRedeemResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

