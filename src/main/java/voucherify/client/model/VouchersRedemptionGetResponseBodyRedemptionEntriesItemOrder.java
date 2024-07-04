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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.CustomerId;
import voucherify.client.model.OrderItemCalculated;
import voucherify.client.model.ReferrerId;

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
 * VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

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

  public static final String SERIALIZED_NAME_INITIAL_AMOUNT = "initial_amount";
  @SerializedName(SERIALIZED_NAME_INITIAL_AMOUNT)
  private Integer initialAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Integer discountAmount;

  public static final String SERIALIZED_NAME_ITEMS_DISCOUNT_AMOUNT = "items_discount_amount";
  @SerializedName(SERIALIZED_NAME_ITEMS_DISCOUNT_AMOUNT)
  private Integer itemsDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT = "total_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT)
  private Integer totalDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Integer totalAmount;

  public static final String SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT = "applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT)
  private Integer appliedDiscountAmount;

  public static final String SERIALIZED_NAME_ITEMS_APPLIED_DISCOUNT_AMOUNT = "items_applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_ITEMS_APPLIED_DISCOUNT_AMOUNT)
  private Integer itemsAppliedDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_APPLIED_DISCOUNT_AMOUNT = "total_applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_APPLIED_DISCOUNT_AMOUNT)
  private Integer totalAppliedDiscountAmount;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderItemCalculated> items;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_REFERRER_ID = "referrer_id";
  @SerializedName(SERIALIZED_NAME_REFERRER_ID)
  private String referrerId;

  /**
   * The type of the object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    ORDER("order");

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
  private ObjectEnum _object = ObjectEnum.ORDER;

  public static final String SERIALIZED_NAME_REDEMPTIONS = "redemptions";
  @SerializedName(SERIALIZED_NAME_REDEMPTIONS)
  private Object redemptions;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerId customer;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private ReferrerId referrer;

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder() {
  }

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder id(String id) {
    
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


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder sourceId(String sourceId) {
    
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


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the order was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the order was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder status(StatusEnum status) {
    
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


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder amount(Integer amount) {
    
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


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder initialAmount(Integer initialAmount) {
    
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


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder discountAmount(Integer discountAmount) {
    
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


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder itemsDiscountAmount(Integer itemsDiscountAmount) {
    
    this.itemsDiscountAmount = itemsDiscountAmount;
    return this;
  }

   /**
   * Sum of all product-specific discounts applied to the order.
   * @return itemsDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getItemsDiscountAmount() {
    return itemsDiscountAmount;
  }


  public void setItemsDiscountAmount(Integer itemsDiscountAmount) {
    this.itemsDiscountAmount = itemsDiscountAmount;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder totalDiscountAmount(Integer totalDiscountAmount) {
    
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * Sum of all order-level AND all product-specific discounts applied to the order.
   * @return totalDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalDiscountAmount() {
    return totalDiscountAmount;
  }


  public void setTotalDiscountAmount(Integer totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder totalAmount(Integer totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Order amount after undoing all the discounts through the rollback redemption.
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder appliedDiscountAmount(Integer appliedDiscountAmount) {
    
    this.appliedDiscountAmount = appliedDiscountAmount;
    return this;
  }

   /**
   * This field shows the order-level discount applied.
   * @return appliedDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getAppliedDiscountAmount() {
    return appliedDiscountAmount;
  }


  public void setAppliedDiscountAmount(Integer appliedDiscountAmount) {
    this.appliedDiscountAmount = appliedDiscountAmount;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder itemsAppliedDiscountAmount(Integer itemsAppliedDiscountAmount) {
    
    this.itemsAppliedDiscountAmount = itemsAppliedDiscountAmount;
    return this;
  }

   /**
   * Sum of all product-specific discounts applied in a particular request.   &#x60;sum(items, i &#x3D;&gt; i.applied_discount_amount)&#x60;
   * @return itemsAppliedDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getItemsAppliedDiscountAmount() {
    return itemsAppliedDiscountAmount;
  }


  public void setItemsAppliedDiscountAmount(Integer itemsAppliedDiscountAmount) {
    this.itemsAppliedDiscountAmount = itemsAppliedDiscountAmount;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder totalAppliedDiscountAmount(Integer totalAppliedDiscountAmount) {
    
    this.totalAppliedDiscountAmount = totalAppliedDiscountAmount;
    return this;
  }

   /**
   * Sum of all order-level AND all product-specific discounts applied in a particular request.   &#x60;total_applied_discount_amount&#x60; &#x3D; &#x60;applied_discount_amount&#x60; + &#x60;items_applied_discount_amount&#x60;
   * @return totalAppliedDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getTotalAppliedDiscountAmount() {
    return totalAppliedDiscountAmount;
  }


  public void setTotalAppliedDiscountAmount(Integer totalAppliedDiscountAmount) {
    this.totalAppliedDiscountAmount = totalAppliedDiscountAmount;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder items(List<OrderItemCalculated> items) {
    
    this.items = items;
    return this;
  }

  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder addItemsItem(OrderItemCalculated itemsItem) {
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
  public List<OrderItemCalculated> getItems() {
    return items;
  }


  public void setItems(List<OrderItemCalculated> items) {
    this.items = items;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder customerId(String customerId) {
    
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


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder referrerId(String referrerId) {
    
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


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder redemptions(Object redemptions) {
    
    this.redemptions = redemptions;
    return this;
  }

   /**
   * Get redemptions
   * @return redemptions
  **/
  @javax.annotation.Nullable
  public Object getRedemptions() {
    return redemptions;
  }


  public void setRedemptions(Object redemptions) {
    this.redemptions = redemptions;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder customer(CustomerId customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public CustomerId getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerId customer) {
    this.customer = customer;
  }


  public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder referrer(ReferrerId referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @javax.annotation.Nullable
  public ReferrerId getReferrer() {
    return referrer;
  }


  public void setReferrer(ReferrerId referrer) {
    this.referrer = referrer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder = (VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder) o;
    return Objects.equals(this.id, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.id) &&
        Objects.equals(this.sourceId, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.sourceId) &&
        Objects.equals(this.createdAt, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.createdAt) &&
        Objects.equals(this.updatedAt, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.updatedAt) &&
        Objects.equals(this.status, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.status) &&
        Objects.equals(this.amount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.amount) &&
        Objects.equals(this.initialAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.initialAmount) &&
        Objects.equals(this.discountAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.discountAmount) &&
        Objects.equals(this.itemsDiscountAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.itemsDiscountAmount) &&
        Objects.equals(this.totalDiscountAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.totalDiscountAmount) &&
        Objects.equals(this.totalAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.totalAmount) &&
        Objects.equals(this.appliedDiscountAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.appliedDiscountAmount) &&
        Objects.equals(this.itemsAppliedDiscountAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.itemsAppliedDiscountAmount) &&
        Objects.equals(this.totalAppliedDiscountAmount, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.totalAppliedDiscountAmount) &&
        Objects.equals(this.items, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.items) &&
        Objects.equals(this.metadata, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.metadata) &&
        Objects.equals(this.customerId, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.customerId) &&
        Objects.equals(this.referrerId, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.referrerId) &&
        Objects.equals(this._object, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder._object) &&
        Objects.equals(this.redemptions, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.redemptions) &&
        Objects.equals(this.customer, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.customer) &&
        Objects.equals(this.referrer, vouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.referrer);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceId, createdAt, updatedAt, status, amount, initialAmount, discountAmount, itemsDiscountAmount, totalDiscountAmount, totalAmount, appliedDiscountAmount, itemsAppliedDiscountAmount, totalAppliedDiscountAmount, items, metadata, customerId, referrerId, _object, redemptions, customer, referrer);
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
    sb.append("class VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    itemsDiscountAmount: ").append(toIndentedString(itemsDiscountAmount)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    appliedDiscountAmount: ").append(toIndentedString(appliedDiscountAmount)).append("\n");
    sb.append("    itemsAppliedDiscountAmount: ").append(toIndentedString(itemsAppliedDiscountAmount)).append("\n");
    sb.append("    totalAppliedDiscountAmount: ").append(toIndentedString(totalAppliedDiscountAmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    referrerId: ").append(toIndentedString(referrerId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("status");
    openapiFields.add("amount");
    openapiFields.add("initial_amount");
    openapiFields.add("discount_amount");
    openapiFields.add("items_discount_amount");
    openapiFields.add("total_discount_amount");
    openapiFields.add("total_amount");
    openapiFields.add("applied_discount_amount");
    openapiFields.add("items_applied_discount_amount");
    openapiFields.add("total_applied_discount_amount");
    openapiFields.add("items");
    openapiFields.add("metadata");
    openapiFields.add("customer_id");
    openapiFields.add("referrer_id");
    openapiFields.add("object");
    openapiFields.add("redemptions");
    openapiFields.add("customer");
    openapiFields.add("referrer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder is not found in the empty JSON string", VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      try {
        JsonElement objectElement = jsonObj.get("status");

        if (objectElement != null && !objectElement.isJsonNull()) {
          StatusEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `status` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("status") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a valid element of StatusEnum enum got `%s` instead", jsonObj.get("status").toString()));
        }
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
            OrderItemCalculated.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
      if ((jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) && !jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("referrer_id") != null && !jsonObj.get("referrer_id").isJsonNull()) && !jsonObj.get("referrer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referrer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referrer_id").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ObjectEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `object` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("object") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `object` to be a valid element of ObjectEnum enum got `%s` instead", jsonObj.get("object").toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder>() {
           @Override
           public void write(JsonWriter out, VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder
  * @throws IOException if the JSON string is invalid with respect to VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder
  */
  public static VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder.class);
  }

 /**
  * Convert an instance of VouchersRedemptionGetResponseBodyRedemptionEntriesItemOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

