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
import java.util.Arrays;
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
 * Event data object schema for &#x60;customer.activecampaign.sent&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventCustomerActiveCampaignSent {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_DISTRIBUTION = "distribution";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION)
  private Object distribution;

  public static final String SERIALIZED_NAME_SENT_AT = "sent_at";
  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private OffsetDateTime sentAt;

  public EventCustomerActiveCampaignSent() {
  }

  public EventCustomerActiveCampaignSent customer(SimpleCustomer customer) {
    
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


  public EventCustomerActiveCampaignSent distribution(Object distribution) {
    
    this.distribution = distribution;
    return this;
  }

   /**
   * Get distribution
   * @return distribution
  **/
  @javax.annotation.Nullable
  public Object getDistribution() {
    return distribution;
  }


  public void setDistribution(Object distribution) {
    this.distribution = distribution;
  }


  public EventCustomerActiveCampaignSent sentAt(OffsetDateTime sentAt) {
    
    this.sentAt = sentAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the distribution was sent in ISO 8601 format.
   * @return sentAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getSentAt() {
    return sentAt;
  }


  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerActiveCampaignSent eventCustomerActiveCampaignSent = (EventCustomerActiveCampaignSent) o;
    return Objects.equals(this.customer, eventCustomerActiveCampaignSent.customer) &&
        Objects.equals(this.distribution, eventCustomerActiveCampaignSent.distribution) &&
        Objects.equals(this.sentAt, eventCustomerActiveCampaignSent.sentAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, distribution, sentAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerActiveCampaignSent {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
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
    openapiFields.add("distribution");
    openapiFields.add("sent_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sent_at");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerActiveCampaignSent
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerActiveCampaignSent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerActiveCampaignSent is not found in the empty JSON string", EventCustomerActiveCampaignSent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerActiveCampaignSent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerActiveCampaignSent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventCustomerActiveCampaignSent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("customer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerActiveCampaignSent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerActiveCampaignSent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerActiveCampaignSent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerActiveCampaignSent.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerActiveCampaignSent>() {
           @Override
           public void write(JsonWriter out, EventCustomerActiveCampaignSent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerActiveCampaignSent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerActiveCampaignSent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerActiveCampaignSent
  * @throws IOException if the JSON string is invalid with respect to EventCustomerActiveCampaignSent
  */
  public static EventCustomerActiveCampaignSent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerActiveCampaignSent.class);
  }

 /**
  * Convert an instance of EventCustomerActiveCampaignSent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

