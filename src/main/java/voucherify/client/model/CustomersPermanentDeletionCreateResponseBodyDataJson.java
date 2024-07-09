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
 * Statistics summarizing the number of related information that was deleted.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomersPermanentDeletionCreateResponseBodyDataJson {
  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private Integer events;

  public static final String SERIALIZED_NAME_CUSTOMER_EVENTS = "customer_events";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_EVENTS)
  private Integer customerEvents;

  public static final String SERIALIZED_NAME_DAILY_EVENTS = "daily_events";
  @SerializedName(SERIALIZED_NAME_DAILY_EVENTS)
  private Integer dailyEvents;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private Integer segments;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private Integer orders;

  public static final String SERIALIZED_NAME_ORDER_EVENTS = "order_events";
  @SerializedName(SERIALIZED_NAME_ORDER_EVENTS)
  private Integer orderEvents;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Integer customer = 1;

  public CustomersPermanentDeletionCreateResponseBodyDataJson() {
  }

  public CustomersPermanentDeletionCreateResponseBodyDataJson events(Integer events) {
    
    this.events = events;
    return this;
  }

   /**
   * Number of events deleted.
   * @return events
  **/
  @javax.annotation.Nullable
  public Integer getEvents() {
    return events;
  }


  public void setEvents(Integer events) {
    this.events = events;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson customerEvents(Integer customerEvents) {
    
    this.customerEvents = customerEvents;
    return this;
  }

   /**
   * Number of customer events deleted.
   * @return customerEvents
  **/
  @javax.annotation.Nullable
  public Integer getCustomerEvents() {
    return customerEvents;
  }


  public void setCustomerEvents(Integer customerEvents) {
    this.customerEvents = customerEvents;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson dailyEvents(Integer dailyEvents) {
    
    this.dailyEvents = dailyEvents;
    return this;
  }

   /**
   * Number of daily events deleted.
   * @return dailyEvents
  **/
  @javax.annotation.Nullable
  public Integer getDailyEvents() {
    return dailyEvents;
  }


  public void setDailyEvents(Integer dailyEvents) {
    this.dailyEvents = dailyEvents;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson segments(Integer segments) {
    
    this.segments = segments;
    return this;
  }

   /**
   * Number of segments deleted.
   * @return segments
  **/
  @javax.annotation.Nullable
  public Integer getSegments() {
    return segments;
  }


  public void setSegments(Integer segments) {
    this.segments = segments;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson orders(Integer orders) {
    
    this.orders = orders;
    return this;
  }

   /**
   * Number of orders deleted.
   * @return orders
  **/
  @javax.annotation.Nullable
  public Integer getOrders() {
    return orders;
  }


  public void setOrders(Integer orders) {
    this.orders = orders;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson orderEvents(Integer orderEvents) {
    
    this.orderEvents = orderEvents;
    return this;
  }

   /**
   * Number of order events deleted.
   * @return orderEvents
  **/
  @javax.annotation.Nullable
  public Integer getOrderEvents() {
    return orderEvents;
  }


  public void setOrderEvents(Integer orderEvents) {
    this.orderEvents = orderEvents;
  }


  public CustomersPermanentDeletionCreateResponseBodyDataJson customer(Integer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Number of customers deleted.
   * @return customer
  **/
  @javax.annotation.Nullable
  public Integer getCustomer() {
    return customer;
  }


  public void setCustomer(Integer customer) {
    this.customer = customer;
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
   * @return the CustomersPermanentDeletionCreateResponseBodyDataJson instance itself
   */
  public CustomersPermanentDeletionCreateResponseBodyDataJson putAdditionalProperty(String key, Object value) {
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
    CustomersPermanentDeletionCreateResponseBodyDataJson customersPermanentDeletionCreateResponseBodyDataJson = (CustomersPermanentDeletionCreateResponseBodyDataJson) o;
    return Objects.equals(this.events, customersPermanentDeletionCreateResponseBodyDataJson.events) &&
        Objects.equals(this.customerEvents, customersPermanentDeletionCreateResponseBodyDataJson.customerEvents) &&
        Objects.equals(this.dailyEvents, customersPermanentDeletionCreateResponseBodyDataJson.dailyEvents) &&
        Objects.equals(this.segments, customersPermanentDeletionCreateResponseBodyDataJson.segments) &&
        Objects.equals(this.orders, customersPermanentDeletionCreateResponseBodyDataJson.orders) &&
        Objects.equals(this.orderEvents, customersPermanentDeletionCreateResponseBodyDataJson.orderEvents) &&
        Objects.equals(this.customer, customersPermanentDeletionCreateResponseBodyDataJson.customer)&&
        Objects.equals(this.additionalProperties, customersPermanentDeletionCreateResponseBodyDataJson.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, customerEvents, dailyEvents, segments, orders, orderEvents, customer, additionalProperties);
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
    sb.append("class CustomersPermanentDeletionCreateResponseBodyDataJson {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    customerEvents: ").append(toIndentedString(customerEvents)).append("\n");
    sb.append("    dailyEvents: ").append(toIndentedString(dailyEvents)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    orderEvents: ").append(toIndentedString(orderEvents)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
    openapiFields.add("events");
    openapiFields.add("customer_events");
    openapiFields.add("daily_events");
    openapiFields.add("segments");
    openapiFields.add("orders");
    openapiFields.add("order_events");
    openapiFields.add("customer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomersPermanentDeletionCreateResponseBodyDataJson
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomersPermanentDeletionCreateResponseBodyDataJson.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomersPermanentDeletionCreateResponseBodyDataJson' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomersPermanentDeletionCreateResponseBodyDataJson> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomersPermanentDeletionCreateResponseBodyDataJson.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomersPermanentDeletionCreateResponseBodyDataJson>() {
           @Override
           public void write(JsonWriter out, CustomersPermanentDeletionCreateResponseBodyDataJson value) throws IOException {
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
           public CustomersPermanentDeletionCreateResponseBodyDataJson read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CustomersPermanentDeletionCreateResponseBodyDataJson instance = thisAdapter.fromJsonTree(jsonObj);
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
                     return null;
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
  * Create an instance of CustomersPermanentDeletionCreateResponseBodyDataJson given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomersPermanentDeletionCreateResponseBodyDataJson
  * @throws IOException if the JSON string is invalid with respect to CustomersPermanentDeletionCreateResponseBodyDataJson
  */
  public static CustomersPermanentDeletionCreateResponseBodyDataJson fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomersPermanentDeletionCreateResponseBodyDataJson.class);
  }

 /**
  * Convert an instance of CustomersPermanentDeletionCreateResponseBodyDataJson to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

