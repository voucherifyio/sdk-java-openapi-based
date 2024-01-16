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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Customer;
import org.openapitools.client.model.OrderItem;
import org.openapitools.client.model.Referrer;

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
 * Request body schema for **POST** &#x60;/orders&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class OrdersCreateRequestBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  /**
   * The order status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    
    PAID("PAID"),
    
    CANCELED("CANCELED"),
    
    FULFILLED("FULFILLED");

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

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Integer discountAmount;

  public static final String SERIALIZED_NAME_INITIAL_AMOUNT = "initial_amount";
  @SerializedName(SERIALIZED_NAME_INITIAL_AMOUNT)
  private Integer initialAmount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderItem> items;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private Referrer referrer;

  public static final String SERIALIZED_NAME_REFERRER_ID = "referrer_id";
  @SerializedName(SERIALIZED_NAME_REFERRER_ID)
  private String referrerId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public OrdersCreateRequestBody() {
  }

  public OrdersCreateRequestBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID assigned by Voucherify of an existing order that will be linked to the redemption of this request.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OrdersCreateRequestBody sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Unique source ID of an existing order that will be linked to the redemption of this request.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public OrdersCreateRequestBody status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The order status.
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public OrdersCreateRequestBody amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts.  
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public OrdersCreateRequestBody discountAmount(Integer discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Sum of all order-level discounts applied to the order.
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  public Integer getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Integer discountAmount) {
    this.discountAmount = discountAmount;
  }


  public OrdersCreateRequestBody initialAmount(Integer initialAmount) {
    
    this.initialAmount = initialAmount;
    return this;
  }

   /**
   * A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts.
   * @return initialAmount
  **/
  @javax.annotation.Nullable
  public Integer getInitialAmount() {
    return initialAmount;
  }


  public void setInitialAmount(Integer initialAmount) {
    this.initialAmount = initialAmount;
  }


  public OrdersCreateRequestBody items(List<OrderItem> items) {
    
    this.items = items;
    return this;
  }

  public OrdersCreateRequestBody addItemsItem(OrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of items applied to the order.
   * @return items
  **/
  @javax.annotation.Nullable
  public List<OrderItem> getItems() {
    return items;
  }


  public void setItems(List<OrderItem> items) {
    this.items = items;
  }


  public OrdersCreateRequestBody customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public OrdersCreateRequestBody customerId(String customerId) {
    
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


  public OrdersCreateRequestBody referrer(Referrer referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @javax.annotation.Nullable
  public Referrer getReferrer() {
    return referrer;
  }


  public void setReferrer(Referrer referrer) {
    this.referrer = referrer;
  }


  public OrdersCreateRequestBody referrerId(String referrerId) {
    
    this.referrerId = referrerId;
    return this;
  }

   /**
   * Unique referrer ID.
   * @return referrerId
  **/
  @javax.annotation.Nullable
  public String getReferrerId() {
    return referrerId;
  }


  public void setReferrerId(String referrerId) {
    this.referrerId = referrerId;
  }


  public OrdersCreateRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of custom key/value pairs that you can attach to an order. It can be useful for storing additional information about the order in a structured format.
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
    OrdersCreateRequestBody ordersCreateRequestBody = (OrdersCreateRequestBody) o;
    return Objects.equals(this.id, ordersCreateRequestBody.id) &&
        Objects.equals(this.sourceId, ordersCreateRequestBody.sourceId) &&
        Objects.equals(this.status, ordersCreateRequestBody.status) &&
        Objects.equals(this.amount, ordersCreateRequestBody.amount) &&
        Objects.equals(this.discountAmount, ordersCreateRequestBody.discountAmount) &&
        Objects.equals(this.initialAmount, ordersCreateRequestBody.initialAmount) &&
        Objects.equals(this.items, ordersCreateRequestBody.items) &&
        Objects.equals(this.customer, ordersCreateRequestBody.customer) &&
        Objects.equals(this.customerId, ordersCreateRequestBody.customerId) &&
        Objects.equals(this.referrer, ordersCreateRequestBody.referrer) &&
        Objects.equals(this.referrerId, ordersCreateRequestBody.referrerId) &&
        Objects.equals(this.metadata, ordersCreateRequestBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceId, status, amount, discountAmount, initialAmount, items, customer, customerId, referrer, referrerId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersCreateRequestBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    referrerId: ").append(toIndentedString(referrerId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("source_id");
    openapiFields.add("status");
    openapiFields.add("amount");
    openapiFields.add("discount_amount");
    openapiFields.add("initial_amount");
    openapiFields.add("items");
    openapiFields.add("customer");
    openapiFields.add("customer_id");
    openapiFields.add("referrer");
    openapiFields.add("referrer_id");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrdersCreateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrdersCreateRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrdersCreateRequestBody is not found in the empty JSON string", OrdersCreateRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrdersCreateRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrdersCreateRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            OrderItem.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        Customer.validateJsonElement(jsonObj.get("customer"));
      }
      if ((jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) && !jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      // validate the optional field `referrer`
      if (jsonObj.get("referrer") != null && !jsonObj.get("referrer").isJsonNull()) {
        Referrer.validateJsonElement(jsonObj.get("referrer"));
      }
      if ((jsonObj.get("referrer_id") != null && !jsonObj.get("referrer_id").isJsonNull()) && !jsonObj.get("referrer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referrer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referrer_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrdersCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrdersCreateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrdersCreateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrdersCreateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<OrdersCreateRequestBody>() {
           @Override
           public void write(JsonWriter out, OrdersCreateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrdersCreateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrdersCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrdersCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to OrdersCreateRequestBody
  */
  public static OrdersCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrdersCreateRequestBody.class);
  }

 /**
  * Convert an instance of OrdersCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

