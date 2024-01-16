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
import org.openapitools.client.model.ClientEventsCreateRequestBodyLoyalty;
import org.openapitools.client.model.ClientEventsCreateRequestBodyReferral;
import org.openapitools.client.model.Customer;

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
 * Request body schema for **POST** &#x60;/events&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class ClientEventsCreateRequestBody {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_REFERRAL = "referral";
  @SerializedName(SERIALIZED_NAME_REFERRAL)
  private ClientEventsCreateRequestBodyReferral referral;

  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private ClientEventsCreateRequestBodyLoyalty loyalty;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public ClientEventsCreateRequestBody() {
  }

  public ClientEventsCreateRequestBody event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * Event name. This is the same name that you used to define a custom event in the **Dashboard** &gt; **Project Settings** &gt; **Event Schema**.
   * @return event
  **/
  @javax.annotation.Nonnull
  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    this.event = event;
  }


  public ClientEventsCreateRequestBody customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public ClientEventsCreateRequestBody referral(ClientEventsCreateRequestBodyReferral referral) {
    
    this.referral = referral;
    return this;
  }

   /**
   * Get referral
   * @return referral
  **/
  @javax.annotation.Nullable
  public ClientEventsCreateRequestBodyReferral getReferral() {
    return referral;
  }


  public void setReferral(ClientEventsCreateRequestBodyReferral referral) {
    this.referral = referral;
  }


  public ClientEventsCreateRequestBody loyalty(ClientEventsCreateRequestBodyLoyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nullable
  public ClientEventsCreateRequestBodyLoyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(ClientEventsCreateRequestBodyLoyalty loyalty) {
    this.loyalty = loyalty;
  }


  public ClientEventsCreateRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the event. A set of key/value pairs that you can attach to an event object. It can be useful for storing additional information about the event in a structured format. Event metadata schema is defined in the **Dashboard** &gt; **Project Settings** &gt; **Event Schema** &gt; **Edit particular event** &gt; **Metadata property definition**.
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
    ClientEventsCreateRequestBody clientEventsCreateRequestBody = (ClientEventsCreateRequestBody) o;
    return Objects.equals(this.event, clientEventsCreateRequestBody.event) &&
        Objects.equals(this.customer, clientEventsCreateRequestBody.customer) &&
        Objects.equals(this.referral, clientEventsCreateRequestBody.referral) &&
        Objects.equals(this.loyalty, clientEventsCreateRequestBody.loyalty) &&
        Objects.equals(this.metadata, clientEventsCreateRequestBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, customer, referral, loyalty, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientEventsCreateRequestBody {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    referral: ").append(toIndentedString(referral)).append("\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("customer");
    openapiFields.add("referral");
    openapiFields.add("loyalty");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("customer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClientEventsCreateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientEventsCreateRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientEventsCreateRequestBody is not found in the empty JSON string", ClientEventsCreateRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientEventsCreateRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientEventsCreateRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientEventsCreateRequestBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      // validate the required field `customer`
      Customer.validateJsonElement(jsonObj.get("customer"));
      // validate the optional field `referral`
      if (jsonObj.get("referral") != null && !jsonObj.get("referral").isJsonNull()) {
        ClientEventsCreateRequestBodyReferral.validateJsonElement(jsonObj.get("referral"));
      }
      // validate the optional field `loyalty`
      if (jsonObj.get("loyalty") != null && !jsonObj.get("loyalty").isJsonNull()) {
        ClientEventsCreateRequestBodyLoyalty.validateJsonElement(jsonObj.get("loyalty"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientEventsCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientEventsCreateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientEventsCreateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientEventsCreateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientEventsCreateRequestBody>() {
           @Override
           public void write(JsonWriter out, ClientEventsCreateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientEventsCreateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientEventsCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientEventsCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to ClientEventsCreateRequestBody
  */
  public static ClientEventsCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientEventsCreateRequestBody.class);
  }

 /**
  * Convert an instance of ClientEventsCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

