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
import org.openapitools.client.model.CustomerWithSummaryLoyaltyReferrals;
import org.openapitools.client.model.EventCustomerConfirmedUnconfirmedCustomer;

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
 * Event data object schema for &#x60;customer.confirmed&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class EventCustomerConfirmed {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerWithSummaryLoyaltyReferrals customer;

  public static final String SERIALIZED_NAME_UNCONFIRMED_CUSTOMER = "unconfirmed_customer";
  @SerializedName(SERIALIZED_NAME_UNCONFIRMED_CUSTOMER)
  private EventCustomerConfirmedUnconfirmedCustomer unconfirmedCustomer;

  public EventCustomerConfirmed() {
  }

  public EventCustomerConfirmed customer(CustomerWithSummaryLoyaltyReferrals customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public CustomerWithSummaryLoyaltyReferrals getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerWithSummaryLoyaltyReferrals customer) {
    this.customer = customer;
  }


  public EventCustomerConfirmed unconfirmedCustomer(EventCustomerConfirmedUnconfirmedCustomer unconfirmedCustomer) {
    
    this.unconfirmedCustomer = unconfirmedCustomer;
    return this;
  }

   /**
   * Get unconfirmedCustomer
   * @return unconfirmedCustomer
  **/
  @javax.annotation.Nullable
  public EventCustomerConfirmedUnconfirmedCustomer getUnconfirmedCustomer() {
    return unconfirmedCustomer;
  }


  public void setUnconfirmedCustomer(EventCustomerConfirmedUnconfirmedCustomer unconfirmedCustomer) {
    this.unconfirmedCustomer = unconfirmedCustomer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerConfirmed eventCustomerConfirmed = (EventCustomerConfirmed) o;
    return Objects.equals(this.customer, eventCustomerConfirmed.customer) &&
        Objects.equals(this.unconfirmedCustomer, eventCustomerConfirmed.unconfirmedCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, unconfirmedCustomer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerConfirmed {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    unconfirmedCustomer: ").append(toIndentedString(unconfirmedCustomer)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("unconfirmed_customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerConfirmed
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerConfirmed.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerConfirmed is not found in the empty JSON string", EventCustomerConfirmed.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerConfirmed.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerConfirmed` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        CustomerWithSummaryLoyaltyReferrals.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `unconfirmed_customer`
      if (jsonObj.get("unconfirmed_customer") != null && !jsonObj.get("unconfirmed_customer").isJsonNull()) {
        EventCustomerConfirmedUnconfirmedCustomer.validateJsonElement(jsonObj.get("unconfirmed_customer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerConfirmed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerConfirmed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerConfirmed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerConfirmed.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerConfirmed>() {
           @Override
           public void write(JsonWriter out, EventCustomerConfirmed value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerConfirmed read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerConfirmed given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerConfirmed
  * @throws IOException if the JSON string is invalid with respect to EventCustomerConfirmed
  */
  public static EventCustomerConfirmed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerConfirmed.class);
  }

 /**
  * Convert an instance of EventCustomerConfirmed to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

