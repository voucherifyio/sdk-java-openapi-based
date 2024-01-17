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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.SimpleCustomer;

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
 * Event data object schema for &#x60;customer.batch.recovered&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class EventCustomerBatchRecovered {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_DISTRIBUTION = "distribution";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION)
  private Object distribution;

  public static final String SERIALIZED_NAME_RECOVERED_AT = "recovered_at";
  @SerializedName(SERIALIZED_NAME_RECOVERED_AT)
  private OffsetDateTime recoveredAt;

  public EventCustomerBatchRecovered() {
  }

  public EventCustomerBatchRecovered customer(SimpleCustomer customer) {
    
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


  public EventCustomerBatchRecovered distribution(Object distribution) {
    
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


  public EventCustomerBatchRecovered recoveredAt(OffsetDateTime recoveredAt) {
    
    this.recoveredAt = recoveredAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the distribution was recovered in ISO 8601 format.
   * @return recoveredAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getRecoveredAt() {
    return recoveredAt;
  }


  public void setRecoveredAt(OffsetDateTime recoveredAt) {
    this.recoveredAt = recoveredAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerBatchRecovered eventCustomerBatchRecovered = (EventCustomerBatchRecovered) o;
    return Objects.equals(this.customer, eventCustomerBatchRecovered.customer) &&
        Objects.equals(this.distribution, eventCustomerBatchRecovered.distribution) &&
        Objects.equals(this.recoveredAt, eventCustomerBatchRecovered.recoveredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, distribution, recoveredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerBatchRecovered {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    recoveredAt: ").append(toIndentedString(recoveredAt)).append("\n");
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
    openapiFields.add("recovered_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recovered_at");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerBatchRecovered
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerBatchRecovered.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerBatchRecovered is not found in the empty JSON string", EventCustomerBatchRecovered.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerBatchRecovered.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerBatchRecovered` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EventCustomerBatchRecovered.openapiRequiredFields) {
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
       if (!EventCustomerBatchRecovered.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerBatchRecovered' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerBatchRecovered> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerBatchRecovered.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerBatchRecovered>() {
           @Override
           public void write(JsonWriter out, EventCustomerBatchRecovered value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerBatchRecovered read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerBatchRecovered given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerBatchRecovered
  * @throws IOException if the JSON string is invalid with respect to EventCustomerBatchRecovered
  */
  public static EventCustomerBatchRecovered fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerBatchRecovered.class);
  }

 /**
  * Convert an instance of EventCustomerBatchRecovered to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

