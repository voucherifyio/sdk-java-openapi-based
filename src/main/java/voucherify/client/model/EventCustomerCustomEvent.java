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
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.CustomEvent;
import voucherify.client.model.EventCustomerCustomEventLoyalty;
import voucherify.client.model.EventCustomerCustomEventReferral;
import voucherify.client.model.SimpleCustomEvent;
import voucherify.client.model.SimpleCustomer;

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
 * Event data object schema for &#x60;customer.custom_event&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventCustomerCustomEvent {
  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private CustomEvent event;

  public static final String SERIALIZED_NAME_EVENT_SCHEMA = "event_schema";
  @SerializedName(SERIALIZED_NAME_EVENT_SCHEMA)
  private SimpleCustomEvent eventSchema;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_REFERRAL = "referral";
  @SerializedName(SERIALIZED_NAME_REFERRAL)
  private EventCustomerCustomEventReferral referral;

  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private EventCustomerCustomEventLoyalty loyalty;

  public EventCustomerCustomEvent() {
  }

  public EventCustomerCustomEvent event(CustomEvent event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nonnull
  public CustomEvent getEvent() {
    return event;
  }


  public void setEvent(CustomEvent event) {
    this.event = event;
  }


  public EventCustomerCustomEvent eventSchema(SimpleCustomEvent eventSchema) {
    
    this.eventSchema = eventSchema;
    return this;
  }

   /**
   * Get eventSchema
   * @return eventSchema
  **/
  @javax.annotation.Nonnull
  public SimpleCustomEvent getEventSchema() {
    return eventSchema;
  }


  public void setEventSchema(SimpleCustomEvent eventSchema) {
    this.eventSchema = eventSchema;
  }


  public EventCustomerCustomEvent customer(SimpleCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public SimpleCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(SimpleCustomer customer) {
    this.customer = customer;
  }


  public EventCustomerCustomEvent referral(EventCustomerCustomEventReferral referral) {
    
    this.referral = referral;
    return this;
  }

   /**
   * Get referral
   * @return referral
  **/
  @javax.annotation.Nullable
  public EventCustomerCustomEventReferral getReferral() {
    return referral;
  }


  public void setReferral(EventCustomerCustomEventReferral referral) {
    this.referral = referral;
  }


  public EventCustomerCustomEvent loyalty(EventCustomerCustomEventLoyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nullable
  public EventCustomerCustomEventLoyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(EventCustomerCustomEventLoyalty loyalty) {
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
    EventCustomerCustomEvent eventCustomerCustomEvent = (EventCustomerCustomEvent) o;
    return Objects.equals(this.event, eventCustomerCustomEvent.event) &&
        Objects.equals(this.eventSchema, eventCustomerCustomEvent.eventSchema) &&
        Objects.equals(this.customer, eventCustomerCustomEvent.customer) &&
        Objects.equals(this.referral, eventCustomerCustomEvent.referral) &&
        Objects.equals(this.loyalty, eventCustomerCustomEvent.loyalty);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, eventSchema, customer, referral, loyalty);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerCustomEvent {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventSchema: ").append(toIndentedString(eventSchema)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("event_schema");
    openapiFields.add("customer");
    openapiFields.add("referral");
    openapiFields.add("loyalty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("event_schema");
    openapiRequiredFields.add("customer");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerCustomEvent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerCustomEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerCustomEvent is not found in the empty JSON string", EventCustomerCustomEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerCustomEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerCustomEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventCustomerCustomEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `event`
      CustomEvent.validateJsonElement(jsonObj.get("event"));
      // validate the required field `event_schema`
      SimpleCustomEvent.validateJsonElement(jsonObj.get("event_schema"));
      // validate the required field `customer`
      SimpleCustomer.validateJsonElement(jsonObj.get("customer"));
      // validate the optional field `referral`
      if (jsonObj.get("referral") != null && !jsonObj.get("referral").isJsonNull()) {
        EventCustomerCustomEventReferral.validateJsonElement(jsonObj.get("referral"));
      }
      // validate the optional field `loyalty`
      if (jsonObj.get("loyalty") != null && !jsonObj.get("loyalty").isJsonNull()) {
        EventCustomerCustomEventLoyalty.validateJsonElement(jsonObj.get("loyalty"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerCustomEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerCustomEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerCustomEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerCustomEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerCustomEvent>() {
           @Override
           public void write(JsonWriter out, EventCustomerCustomEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerCustomEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerCustomEvent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerCustomEvent
  * @throws IOException if the JSON string is invalid with respect to EventCustomerCustomEvent
  */
  public static EventCustomerCustomEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerCustomEvent.class);
  }

 /**
  * Convert an instance of EventCustomerCustomEvent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

