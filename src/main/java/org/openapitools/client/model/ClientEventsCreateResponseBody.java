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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.SimpleCustomerRequiredObjectType;

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

import org.openapitools.client.JSON;

/**
 * Response body schema for **POST** &#x60;/events&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class ClientEventsCreateResponseBody {
  /**
   * The object represented is an &#x60;event&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    EVENT("event");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.EVENT;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomerRequiredObjectType customer;

  public static final String SERIALIZED_NAME_REFERRAL = "referral";
  @SerializedName(SERIALIZED_NAME_REFERRAL)
  private Object referral;

  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private Object loyalty;

  public ClientEventsCreateResponseBody() {
  }

  public ClientEventsCreateResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The object represented is an &#x60;event&#x60;.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public ClientEventsCreateResponseBody type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The event name.
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ClientEventsCreateResponseBody customer(SimpleCustomerRequiredObjectType customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public SimpleCustomerRequiredObjectType getCustomer() {
    return customer;
  }


  public void setCustomer(SimpleCustomerRequiredObjectType customer) {
    this.customer = customer;
  }


  public ClientEventsCreateResponseBody referral(Object referral) {
    
    this.referral = referral;
    return this;
  }

   /**
   * A &#x60;null&#x60; referral object.
   * @return referral
  **/
  @javax.annotation.Nullable
  public Object getReferral() {
    return referral;
  }


  public void setReferral(Object referral) {
    this.referral = referral;
  }


  public ClientEventsCreateResponseBody loyalty(Object loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * A &#x60;null&#x60; loyalty object.
   * @return loyalty
  **/
  @javax.annotation.Nullable
  public Object getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(Object loyalty) {
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
    ClientEventsCreateResponseBody clientEventsCreateResponseBody = (ClientEventsCreateResponseBody) o;
    return Objects.equals(this._object, clientEventsCreateResponseBody._object) &&
        Objects.equals(this.type, clientEventsCreateResponseBody.type) &&
        Objects.equals(this.customer, clientEventsCreateResponseBody.customer) &&
        Objects.equals(this.referral, clientEventsCreateResponseBody.referral) &&
        Objects.equals(this.loyalty, clientEventsCreateResponseBody.loyalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, type, customer, referral, loyalty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientEventsCreateResponseBody {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    referral: ").append(toIndentedString(referral)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("type");
    openapiFields.add("customer");
    openapiFields.add("referral");
    openapiFields.add("loyalty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("referral");
    openapiRequiredFields.add("loyalty");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClientEventsCreateResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientEventsCreateResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientEventsCreateResponseBody is not found in the empty JSON string", ClientEventsCreateResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientEventsCreateResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientEventsCreateResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientEventsCreateResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `customer`
      SimpleCustomerRequiredObjectType.validateJsonElement(jsonObj.get("customer"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientEventsCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientEventsCreateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientEventsCreateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientEventsCreateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientEventsCreateResponseBody>() {
           @Override
           public void write(JsonWriter out, ClientEventsCreateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientEventsCreateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientEventsCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientEventsCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to ClientEventsCreateResponseBody
  */
  public static ClientEventsCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientEventsCreateResponseBody.class);
  }

 /**
  * Convert an instance of ClientEventsCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

