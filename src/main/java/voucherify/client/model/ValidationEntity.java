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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import voucherify.client.model.ValidationsRedeemableApplicable;
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
 * ValidationEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class ValidationEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  /**
   * The validation status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VALID("VALID"),
    
    INVALID("INVALID");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_REDEEMABLES = "redeemables";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES)
  private List<ValidationsRedeemableApplicable> redeemables;

  public static final String SERIALIZED_NAME_SKIPPED_REDEEMABLES = "skipped_redeemables";
  @SerializedName(SERIALIZED_NAME_SKIPPED_REDEEMABLES)
  private List<ValidationsRedeemableInapplicable> skippedRedeemables;

  public static final String SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES = "inapplicable_redeemables";
  @SerializedName(SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES)
  private List<ValidationsRedeemableSkipped> inapplicableRedeemables;

  public ValidationEntity() {
  }

  public ValidationEntity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique validation id.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ValidationEntity sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Unique session id.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public ValidationEntity status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The validation status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ValidationEntity createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the validation was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ValidationEntity customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer ID of the customer making the purchase.
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public ValidationEntity redeemables(List<ValidationsRedeemableApplicable> redeemables) {
    
    this.redeemables = redeemables;
    return this;
  }

  public ValidationEntity addRedeemablesItem(ValidationsRedeemableApplicable redeemablesItem) {
    if (this.redeemables == null) {
      this.redeemables = new ArrayList<>();
    }
    this.redeemables.add(redeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each redeemable.
   * @return redeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableApplicable> getRedeemables() {
    return redeemables;
  }


  public void setRedeemables(List<ValidationsRedeemableApplicable> redeemables) {
    this.redeemables = redeemables;
  }


  public ValidationEntity skippedRedeemables(List<ValidationsRedeemableInapplicable> skippedRedeemables) {
    
    this.skippedRedeemables = skippedRedeemables;
    return this;
  }

  public ValidationEntity addSkippedRedeemablesItem(ValidationsRedeemableInapplicable skippedRedeemablesItem) {
    if (this.skippedRedeemables == null) {
      this.skippedRedeemables = new ArrayList<>();
    }
    this.skippedRedeemables.add(skippedRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each redeemable.
   * @return skippedRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableInapplicable> getSkippedRedeemables() {
    return skippedRedeemables;
  }


  public void setSkippedRedeemables(List<ValidationsRedeemableInapplicable> skippedRedeemables) {
    this.skippedRedeemables = skippedRedeemables;
  }


  public ValidationEntity inapplicableRedeemables(List<ValidationsRedeemableSkipped> inapplicableRedeemables) {
    
    this.inapplicableRedeemables = inapplicableRedeemables;
    return this;
  }

  public ValidationEntity addInapplicableRedeemablesItem(ValidationsRedeemableSkipped inapplicableRedeemablesItem) {
    if (this.inapplicableRedeemables == null) {
      this.inapplicableRedeemables = new ArrayList<>();
    }
    this.inapplicableRedeemables.add(inapplicableRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each redeemable.
   * @return inapplicableRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableSkipped> getInapplicableRedeemables() {
    return inapplicableRedeemables;
  }


  public void setInapplicableRedeemables(List<ValidationsRedeemableSkipped> inapplicableRedeemables) {
    this.inapplicableRedeemables = inapplicableRedeemables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationEntity validationEntity = (ValidationEntity) o;
    return Objects.equals(this.id, validationEntity.id) &&
        Objects.equals(this.sessionId, validationEntity.sessionId) &&
        Objects.equals(this.status, validationEntity.status) &&
        Objects.equals(this.createdAt, validationEntity.createdAt) &&
        Objects.equals(this.customerId, validationEntity.customerId) &&
        Objects.equals(this.redeemables, validationEntity.redeemables) &&
        Objects.equals(this.skippedRedeemables, validationEntity.skippedRedeemables) &&
        Objects.equals(this.inapplicableRedeemables, validationEntity.inapplicableRedeemables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sessionId, status, createdAt, customerId, redeemables, skippedRedeemables, inapplicableRedeemables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    redeemables: ").append(toIndentedString(redeemables)).append("\n");
    sb.append("    skippedRedeemables: ").append(toIndentedString(skippedRedeemables)).append("\n");
    sb.append("    inapplicableRedeemables: ").append(toIndentedString(inapplicableRedeemables)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("session_id");
    openapiFields.add("status");
    openapiFields.add("created_at");
    openapiFields.add("customer_id");
    openapiFields.add("redeemables");
    openapiFields.add("skipped_redeemables");
    openapiFields.add("inapplicable_redeemables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValidationEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValidationEntity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidationEntity is not found in the empty JSON string", ValidationEntity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValidationEntity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidationEntity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("session_id") != null && !jsonObj.get("session_id").isJsonNull()) && !jsonObj.get("session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) && !jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if (jsonObj.get("redeemables") != null && !jsonObj.get("redeemables").isJsonNull()) {
        JsonArray jsonArrayredeemables = jsonObj.getAsJsonArray("redeemables");
        if (jsonArrayredeemables != null) {
          // ensure the json data is an array
          if (!jsonObj.get("redeemables").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `redeemables` to be an array in the JSON string but got `%s`", jsonObj.get("redeemables").toString()));
          }

          // validate the optional field `redeemables` (array)
          for (int i = 0; i < jsonArrayredeemables.size(); i++) {
            ValidationsRedeemableApplicable.validateJsonElement(jsonArrayredeemables.get(i));
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
            ValidationsRedeemableSkipped.validateJsonElement(jsonArrayinapplicableRedeemables.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidationEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidationEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidationEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidationEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidationEntity>() {
           @Override
           public void write(JsonWriter out, ValidationEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidationEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValidationEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationEntity
  * @throws IOException if the JSON string is invalid with respect to ValidationEntity
  */
  public static ValidationEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationEntity.class);
  }

 /**
  * Convert an instance of ValidationEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

