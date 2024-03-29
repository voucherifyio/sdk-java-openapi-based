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
import voucherify.client.model.Session;
import voucherify.client.model.StackingRules;
import voucherify.client.model.ValidationsRedeemableInapplicable;
import voucherify.client.model.ValidationsValidateAllResponseBodyRedeemablesItem;

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
 * Response body schema for POST &#x60;/validations&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ClientValidationsValidateResponseBody {
  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_REDEEMABLES = "redeemables";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES)
  private List<ValidationsValidateAllResponseBodyRedeemablesItem> redeemables = new ArrayList<>();

  public static final String SERIALIZED_NAME_SKIPPED_REDEEMABLES = "skipped_redeemables";
  @SerializedName(SERIALIZED_NAME_SKIPPED_REDEEMABLES)
  private List<ValidationsRedeemableInapplicable> skippedRedeemables;

  public static final String SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES = "inapplicable_redeemables";
  @SerializedName(SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES)
  private List<ValidationsRedeemableInapplicable> inapplicableRedeemables;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_STACKING_RULES = "stacking_rules";
  @SerializedName(SERIALIZED_NAME_STACKING_RULES)
  private StackingRules stackingRules;

  public ClientValidationsValidateResponseBody() {
  }

  public ClientValidationsValidateResponseBody valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * The result of the validation. It takes all of the redeemables into account and returns a &#x60;false&#x60; if at least one redeemable is inapplicable. Returns &#x60;true&#x60; if all redeemables are applicable.
   * @return valid
  **/
  @javax.annotation.Nonnull
  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public ClientValidationsValidateResponseBody redeemables(List<ValidationsValidateAllResponseBodyRedeemablesItem> redeemables) {
    
    this.redeemables = redeemables;
    return this;
  }

  public ClientValidationsValidateResponseBody addRedeemablesItem(ValidationsValidateAllResponseBodyRedeemablesItem redeemablesItem) {
    if (this.redeemables == null) {
      this.redeemables = new ArrayList<>();
    }
    this.redeemables.add(redeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each redeemable. If redeemables_application_mode&#x3D;\&quot;PARTIAL\&quot; all redeemables here will be \&quot;APPLICABLE\&quot;
   * @return redeemables
  **/
  @javax.annotation.Nonnull
  public List<ValidationsValidateAllResponseBodyRedeemablesItem> getRedeemables() {
    return redeemables;
  }


  public void setRedeemables(List<ValidationsValidateAllResponseBodyRedeemablesItem> redeemables) {
    this.redeemables = redeemables;
  }


  public ClientValidationsValidateResponseBody skippedRedeemables(List<ValidationsRedeemableInapplicable> skippedRedeemables) {
    
    this.skippedRedeemables = skippedRedeemables;
    return this;
  }

  public ClientValidationsValidateResponseBody addSkippedRedeemablesItem(ValidationsRedeemableInapplicable skippedRedeemablesItem) {
    if (this.skippedRedeemables == null) {
      this.skippedRedeemables = new ArrayList<>();
    }
    this.skippedRedeemables.add(skippedRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each skipped redeemable.
   * @return skippedRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableInapplicable> getSkippedRedeemables() {
    return skippedRedeemables;
  }


  public void setSkippedRedeemables(List<ValidationsRedeemableInapplicable> skippedRedeemables) {
    this.skippedRedeemables = skippedRedeemables;
  }


  public ClientValidationsValidateResponseBody inapplicableRedeemables(List<ValidationsRedeemableInapplicable> inapplicableRedeemables) {
    
    this.inapplicableRedeemables = inapplicableRedeemables;
    return this;
  }

  public ClientValidationsValidateResponseBody addInapplicableRedeemablesItem(ValidationsRedeemableInapplicable inapplicableRedeemablesItem) {
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


  public ClientValidationsValidateResponseBody order(OrderCalculated order) {
    
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


  public ClientValidationsValidateResponseBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Hashed customer source ID.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public ClientValidationsValidateResponseBody session(Session session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  public Session getSession() {
    return session;
  }


  public void setSession(Session session) {
    this.session = session;
  }


  public ClientValidationsValidateResponseBody stackingRules(StackingRules stackingRules) {
    
    this.stackingRules = stackingRules;
    return this;
  }

   /**
   * Get stackingRules
   * @return stackingRules
  **/
  @javax.annotation.Nullable
  public StackingRules getStackingRules() {
    return stackingRules;
  }


  public void setStackingRules(StackingRules stackingRules) {
    this.stackingRules = stackingRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientValidationsValidateResponseBody clientValidationsValidateResponseBody = (ClientValidationsValidateResponseBody) o;
    return Objects.equals(this.valid, clientValidationsValidateResponseBody.valid) &&
        Objects.equals(this.redeemables, clientValidationsValidateResponseBody.redeemables) &&
        Objects.equals(this.skippedRedeemables, clientValidationsValidateResponseBody.skippedRedeemables) &&
        Objects.equals(this.inapplicableRedeemables, clientValidationsValidateResponseBody.inapplicableRedeemables) &&
        Objects.equals(this.order, clientValidationsValidateResponseBody.order) &&
        Objects.equals(this.trackingId, clientValidationsValidateResponseBody.trackingId) &&
        Objects.equals(this.session, clientValidationsValidateResponseBody.session) &&
        Objects.equals(this.stackingRules, clientValidationsValidateResponseBody.stackingRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, redeemables, skippedRedeemables, inapplicableRedeemables, order, trackingId, session, stackingRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientValidationsValidateResponseBody {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    redeemables: ").append(toIndentedString(redeemables)).append("\n");
    sb.append("    skippedRedeemables: ").append(toIndentedString(skippedRedeemables)).append("\n");
    sb.append("    inapplicableRedeemables: ").append(toIndentedString(inapplicableRedeemables)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    stackingRules: ").append(toIndentedString(stackingRules)).append("\n");
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
    openapiFields.add("valid");
    openapiFields.add("redeemables");
    openapiFields.add("skipped_redeemables");
    openapiFields.add("inapplicable_redeemables");
    openapiFields.add("order");
    openapiFields.add("tracking_id");
    openapiFields.add("session");
    openapiFields.add("stacking_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("valid");
    openapiRequiredFields.add("redeemables");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClientValidationsValidateResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientValidationsValidateResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientValidationsValidateResponseBody is not found in the empty JSON string", ClientValidationsValidateResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientValidationsValidateResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientValidationsValidateResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientValidationsValidateResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("redeemables").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redeemables` to be an array in the JSON string but got `%s`", jsonObj.get("redeemables").toString()));
      }

      JsonArray jsonArrayredeemables = jsonObj.getAsJsonArray("redeemables");
      // validate the required field `redeemables` (array)
      for (int i = 0; i < jsonArrayredeemables.size(); i++) {
        ValidationsValidateAllResponseBodyRedeemablesItem.validateJsonElement(jsonArrayredeemables.get(i));
      };
      if (jsonObj.get("skipped_redeemables") != null && !jsonObj.get("skipped_redeemables").isJsonNull()) {
        JsonArray jsonArrayskippedRedeemables = jsonObj.getAsJsonArray("skipped_redeemables");
        if (jsonArrayskippedRedeemables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("skipped_redeemables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `skipped_redeemables` to be an array in the JSON string but got `%s`", jsonObj.get("skipped_redeemables").toString()));
          }

          // validate the optional field `skipped_redeemables` (array)
          for (int i = 0; i < jsonArrayskippedRedeemables.size(); i++) {
            ValidationsRedeemableInapplicable.validateJsonElement(jsonArrayskippedRedeemables.get(i));
          };
        }
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
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        OrderCalculated.validateJsonElement(jsonObj.get("order"));
      }
      if ((jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) && !jsonObj.get("tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_id").toString()));
      }
      // validate the optional field `session`
      if (jsonObj.get("session") != null && !jsonObj.get("session").isJsonNull()) {
        Session.validateJsonElement(jsonObj.get("session"));
      }
      // validate the optional field `stacking_rules`
      if (jsonObj.get("stacking_rules") != null && !jsonObj.get("stacking_rules").isJsonNull()) {
        StackingRules.validateJsonElement(jsonObj.get("stacking_rules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientValidationsValidateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientValidationsValidateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientValidationsValidateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientValidationsValidateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientValidationsValidateResponseBody>() {
           @Override
           public void write(JsonWriter out, ClientValidationsValidateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientValidationsValidateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientValidationsValidateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientValidationsValidateResponseBody
  * @throws IOException if the JSON string is invalid with respect to ClientValidationsValidateResponseBody
  */
  public static ClientValidationsValidateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientValidationsValidateResponseBody.class);
  }

 /**
  * Convert an instance of ClientValidationsValidateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

