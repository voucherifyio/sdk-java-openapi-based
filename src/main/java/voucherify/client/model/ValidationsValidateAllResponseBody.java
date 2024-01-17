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
 * Response body schema for POST &#x60;/validations&#x60; where all promotion must be valid
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:00:53.208514+01:00[Europe/Warsaw]")
public class ValidationsValidateAllResponseBody {
  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_REDEEMABLES = "redeemables";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES)
  private List<ValidationsValidateAllResponseBodyRedeemablesItem> redeemables = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  /**
   * Gets or Sets applicationMode
   */
  @JsonAdapter(ApplicationModeEnum.Adapter.class)
  public enum ApplicationModeEnum {
    ALL("ALL");

    private String value;

    ApplicationModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicationModeEnum fromValue(String value) {
      for (ApplicationModeEnum b : ApplicationModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApplicationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApplicationModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPLICATION_MODE = "application_mode";
  @SerializedName(SERIALIZED_NAME_APPLICATION_MODE)
  private ApplicationModeEnum applicationMode = ApplicationModeEnum.ALL;

  public ValidationsValidateAllResponseBody() {
  }

  public ValidationsValidateAllResponseBody valid(Boolean valid) {
    
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


  public ValidationsValidateAllResponseBody redeemables(List<ValidationsValidateAllResponseBodyRedeemablesItem> redeemables) {
    
    this.redeemables = redeemables;
    return this;
  }

  public ValidationsValidateAllResponseBody addRedeemablesItem(ValidationsValidateAllResponseBodyRedeemablesItem redeemablesItem) {
    if (this.redeemables == null) {
      this.redeemables = new ArrayList<>();
    }
    this.redeemables.add(redeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each redeemable. If a redeemable can be applied, the API returns &#x60;\&quot;status\&quot;: \&quot;APPLICABLE\&quot;&#x60;.
   * @return redeemables
  **/
  @javax.annotation.Nonnull
  public List<ValidationsValidateAllResponseBodyRedeemablesItem> getRedeemables() {
    return redeemables;
  }


  public void setRedeemables(List<ValidationsValidateAllResponseBodyRedeemablesItem> redeemables) {
    this.redeemables = redeemables;
  }


  public ValidationsValidateAllResponseBody order(OrderCalculated order) {
    
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


  public ValidationsValidateAllResponseBody trackingId(String trackingId) {
    
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


  public ValidationsValidateAllResponseBody session(Session session) {
    
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


  public ValidationsValidateAllResponseBody applicationMode(ApplicationModeEnum applicationMode) {
    
    this.applicationMode = applicationMode;
    return this;
  }

   /**
   * Get applicationMode
   * @return applicationMode
  **/
  @javax.annotation.Nonnull
  public ApplicationModeEnum getApplicationMode() {
    return applicationMode;
  }


  public void setApplicationMode(ApplicationModeEnum applicationMode) {
    this.applicationMode = applicationMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationsValidateAllResponseBody validationsValidateAllResponseBody = (ValidationsValidateAllResponseBody) o;
    return Objects.equals(this.valid, validationsValidateAllResponseBody.valid) &&
        Objects.equals(this.redeemables, validationsValidateAllResponseBody.redeemables) &&
        Objects.equals(this.order, validationsValidateAllResponseBody.order) &&
        Objects.equals(this.trackingId, validationsValidateAllResponseBody.trackingId) &&
        Objects.equals(this.session, validationsValidateAllResponseBody.session) &&
        Objects.equals(this.applicationMode, validationsValidateAllResponseBody.applicationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, redeemables, order, trackingId, session, applicationMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationsValidateAllResponseBody {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    redeemables: ").append(toIndentedString(redeemables)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    applicationMode: ").append(toIndentedString(applicationMode)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("tracking_id");
    openapiFields.add("session");
    openapiFields.add("application_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("valid");
    openapiRequiredFields.add("redeemables");
    openapiRequiredFields.add("application_mode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValidationsValidateAllResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValidationsValidateAllResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidationsValidateAllResponseBody is not found in the empty JSON string", ValidationsValidateAllResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValidationsValidateAllResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidationsValidateAllResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ValidationsValidateAllResponseBody.openapiRequiredFields) {
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
      if (!jsonObj.get("application_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_mode").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("application_mode");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ApplicationModeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `application_mode` to be not null");
        }
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Expected the field `application_mode` to be a valid element of ApplicationModeEnum enum got `%s` instead", jsonObj.get("application_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidationsValidateAllResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidationsValidateAllResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidationsValidateAllResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidationsValidateAllResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidationsValidateAllResponseBody>() {
           @Override
           public void write(JsonWriter out, ValidationsValidateAllResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidationsValidateAllResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidationsValidateAllResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationsValidateAllResponseBody
  * @throws IOException if the JSON string is invalid with respect to ValidationsValidateAllResponseBody
  */
  public static ValidationsValidateAllResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationsValidateAllResponseBody.class);
  }

 /**
  * Convert an instance of ValidationsValidateAllResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
