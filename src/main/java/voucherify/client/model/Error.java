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
 * Error details
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Error {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private String resourceType;

  public Error() {
  }

  public Error code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Error&#39;s HTTP status code.
   * @return code
  **/
  @javax.annotation.Nullable
  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public Error key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Short string describing the kind of error which occurred.
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public Error message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human-readable message providing a short description about the error.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Error details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * A human-readable message providing more details about the error.
   * @return details
  **/
  @javax.annotation.Nullable
  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public Error requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * This ID is useful when troubleshooting and/or finding the root cause of an error response by our support team.
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public Error resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Unique resource ID that can be used in another endpoint to get more details.
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public Error resourceType(String resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * The resource type.
   * @return resourceType
  **/
  @javax.annotation.Nullable
  public String getResourceType() {
    return resourceType;
  }


  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Error instance itself
   */
  public Error putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.key, error.key) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.details, error.details) &&
        Objects.equals(this.requestId, error.requestId) &&
        Objects.equals(this.resourceId, error.resourceId) &&
        Objects.equals(this.resourceType, error.resourceType)&&
        Objects.equals(this.additionalProperties, error.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, key, message, details, requestId, resourceId, resourceType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("key");
    openapiFields.add("message");
    openapiFields.add("details");
    openapiFields.add("request_id");
    openapiFields.add("resource_id");
    openapiFields.add("resource_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Error
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Error.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error is not found in the empty JSON string", Error.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if ((jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonNull()) && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      if ((jsonObj.get("resource_id") != null && !jsonObj.get("resource_id").isJsonNull()) && !jsonObj.get("resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_id").toString()));
      }
      if ((jsonObj.get("resource_type") != null && !jsonObj.get("resource_type").isJsonNull()) && !jsonObj.get("resource_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error.class));

       return (TypeAdapter<T>) new TypeAdapter<Error>() {
           @Override
           public void write(JsonWriter out, Error value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Error read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Error instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Error given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error
  * @throws IOException if the JSON string is invalid with respect to Error
  */
  public static Error fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error.class);
  }

 /**
  * Convert an instance of Error to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

