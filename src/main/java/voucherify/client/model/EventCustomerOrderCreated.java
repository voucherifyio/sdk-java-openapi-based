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
import voucherify.client.model.OrderCalculated;
import voucherify.client.model.RedemptionInternal;
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
 * Event data object schema for &#x60;customer.order.created&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventCustomerOrderCreated {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private SimpleCustomer referrer;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private RedemptionInternal redemption;

  public EventCustomerOrderCreated() {
  }

  public EventCustomerOrderCreated customer(SimpleCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public SimpleCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(SimpleCustomer customer) {
    this.customer = customer;
  }


  public EventCustomerOrderCreated referrer(SimpleCustomer referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @javax.annotation.Nullable
  public SimpleCustomer getReferrer() {
    return referrer;
  }


  public void setReferrer(SimpleCustomer referrer) {
    this.referrer = referrer;
  }


  public EventCustomerOrderCreated order(OrderCalculated order) {
    
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


  public EventCustomerOrderCreated redemption(RedemptionInternal redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public RedemptionInternal getRedemption() {
    return redemption;
  }


  public void setRedemption(RedemptionInternal redemption) {
    this.redemption = redemption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerOrderCreated eventCustomerOrderCreated = (EventCustomerOrderCreated) o;
    return Objects.equals(this.customer, eventCustomerOrderCreated.customer) &&
        Objects.equals(this.referrer, eventCustomerOrderCreated.referrer) &&
        Objects.equals(this.order, eventCustomerOrderCreated.order) &&
        Objects.equals(this.redemption, eventCustomerOrderCreated.redemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, referrer, order, redemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerOrderCreated {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
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
    openapiFields.add("referrer");
    openapiFields.add("order");
    openapiFields.add("redemption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerOrderCreated
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerOrderCreated.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerOrderCreated is not found in the empty JSON string", EventCustomerOrderCreated.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerOrderCreated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerOrderCreated` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `referrer`
      if (jsonObj.get("referrer") != null && !jsonObj.get("referrer").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("referrer"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        OrderCalculated.validateJsonElement(jsonObj.get("order"));
      }
      // validate the optional field `redemption`
      if (jsonObj.get("redemption") != null && !jsonObj.get("redemption").isJsonNull()) {
        RedemptionInternal.validateJsonElement(jsonObj.get("redemption"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerOrderCreated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerOrderCreated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerOrderCreated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerOrderCreated.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerOrderCreated>() {
           @Override
           public void write(JsonWriter out, EventCustomerOrderCreated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerOrderCreated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerOrderCreated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerOrderCreated
  * @throws IOException if the JSON string is invalid with respect to EventCustomerOrderCreated
  */
  public static EventCustomerOrderCreated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerOrderCreated.class);
  }

 /**
  * Convert an instance of EventCustomerOrderCreated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

