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
import voucherify.client.model.OrderItemCalculatedProduct;
import voucherify.client.model.OrderItemCalculatedSku;

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
 * OrderItemCalculated
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrderItemCalculated {
  public static final String SERIALIZED_NAME_SKU_ID = "sku_id";
  @SerializedName(SERIALIZED_NAME_SKU_ID)
  private String skuId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  /**
   * Used along with the source_id property, can be set to either sku or product.
   */
  @JsonAdapter(RelatedObjectEnum.Adapter.class)
  public enum RelatedObjectEnum {
    PRODUCT("product"),
    
    SKU("sku");

    private String value;

    RelatedObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelatedObjectEnum fromValue(String value) {
      for (RelatedObjectEnum b : RelatedObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<RelatedObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelatedObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelatedObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RelatedObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELATED_OBJECT = "related_object";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT)
  private RelatedObjectEnum relatedObject;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_DISCOUNT_QUANTITY = "discount_quantity";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_QUANTITY)
  private Integer discountQuantity;

  public static final String SERIALIZED_NAME_INITIAL_QUANTITY = "initial_quantity";
  @SerializedName(SERIALIZED_NAME_INITIAL_QUANTITY)
  private Integer initialQuantity;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Integer discountAmount;

  public static final String SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT = "applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT)
  private Integer appliedDiscountAmount;

  public static final String SERIALIZED_NAME_INITIAL_AMOUNT = "initial_amount";
  @SerializedName(SERIALIZED_NAME_INITIAL_AMOUNT)
  private Integer initialAmount;

  public static final String SERIALIZED_NAME_TOTAL_APPLIED_DISCOUNT_AMOUNT = "total_applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_APPLIED_DISCOUNT_AMOUNT)
  private Integer totalAppliedDiscountAmount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_SUBTOTAL_AMOUNT = "subtotal_amount";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL_AMOUNT)
  private Integer subtotalAmount;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private OrderItemCalculatedProduct product;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private OrderItemCalculatedSku sku;

  /**
   * The type of the object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    ORDER_ITEM("order_item");

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
        return null;
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
  private ObjectEnum _object = ObjectEnum.ORDER_ITEM;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public OrderItemCalculated() {
  }

  public OrderItemCalculated skuId(String skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * A unique SKU ID assigned by Voucherify.
   * @return skuId
  **/
  @javax.annotation.Nullable
  public String getSkuId() {
    return skuId;
  }


  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public OrderItemCalculated productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * A unique product ID assigned by Voucherify.
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public OrderItemCalculated relatedObject(RelatedObjectEnum relatedObject) {
    
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * Used along with the source_id property, can be set to either sku or product.
   * @return relatedObject
  **/
  @javax.annotation.Nullable
  public RelatedObjectEnum getRelatedObject() {
    return relatedObject;
  }


  public void setRelatedObject(RelatedObjectEnum relatedObject) {
    this.relatedObject = relatedObject;
  }


  public OrderItemCalculated sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The merchant’s product/SKU ID (if it is different from the Voucherify product/SKU ID). It is useful in the integration between multiple systems. It can be an ID from an eCommerce site, a database, or a third-party service.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public OrderItemCalculated quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the particular item in the cart.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrderItemCalculated discountQuantity(Integer discountQuantity) {
    
    this.discountQuantity = discountQuantity;
    return this;
  }

   /**
   * Number of dicounted items.
   * @return discountQuantity
  **/
  @javax.annotation.Nullable
  public Integer getDiscountQuantity() {
    return discountQuantity;
  }


  public void setDiscountQuantity(Integer discountQuantity) {
    this.discountQuantity = discountQuantity;
  }


  public OrderItemCalculated initialQuantity(Integer initialQuantity) {
    
    this.initialQuantity = initialQuantity;
    return this;
  }

   /**
   * A positive integer in the smallest unit quantity representing the total amount of the order; this is the sum of the order items&#39; quantity.
   * @return initialQuantity
  **/
  @javax.annotation.Nullable
  public Integer getInitialQuantity() {
    return initialQuantity;
  }


  public void setInitialQuantity(Integer initialQuantity) {
    this.initialQuantity = initialQuantity;
  }


  public OrderItemCalculated amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of the order item (price * quantity).
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public OrderItemCalculated discountAmount(Integer discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Sum of all order-item-level discounts applied to the order.
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  public Integer getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Integer discountAmount) {
    this.discountAmount = discountAmount;
  }


  public OrderItemCalculated appliedDiscountAmount(Integer appliedDiscountAmount) {
    
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


  public OrderItemCalculated initialAmount(Integer initialAmount) {
    
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


  public OrderItemCalculated totalAppliedDiscountAmount(Integer totalAppliedDiscountAmount) {
    
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


  public OrderItemCalculated price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * Unit price of an item. Value is multiplied by 100 to precisely represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;.
   * @return price
  **/
  @javax.annotation.Nullable
  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public OrderItemCalculated subtotalAmount(Integer subtotalAmount) {
    
    this.subtotalAmount = subtotalAmount;
    return this;
  }

   /**
   * Final order item amount after the applied item-level discount.  If there are no item-level discounts applied, this item is equal to the &#x60;amount&#x60;.    &#x60;subtotal_amount&#x60;&#x3D;&#x60;amount&#x60;-&#x60;applied_discount_amount&#x60;
   * @return subtotalAmount
  **/
  @javax.annotation.Nullable
  public Integer getSubtotalAmount() {
    return subtotalAmount;
  }


  public void setSubtotalAmount(Integer subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }


  public OrderItemCalculated product(OrderItemCalculatedProduct product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  public OrderItemCalculatedProduct getProduct() {
    return product;
  }


  public void setProduct(OrderItemCalculatedProduct product) {
    this.product = product;
  }


  public OrderItemCalculated sku(OrderItemCalculatedSku sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  public OrderItemCalculatedSku getSku() {
    return sku;
  }


  public void setSku(OrderItemCalculatedSku sku) {
    this.sku = sku;
  }


  public OrderItemCalculated _object(ObjectEnum _object) {
    
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


  public OrderItemCalculated metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of custom key/value pairs that you can attach to an SKU. It can be useful for storing additional information about the SKU in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
   * @return the OrderItemCalculated instance itself
   */
  public OrderItemCalculated putAdditionalProperty(String key, Object value) {
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
    OrderItemCalculated orderItemCalculated = (OrderItemCalculated) o;
    return Objects.equals(this.skuId, orderItemCalculated.skuId) &&
        Objects.equals(this.productId, orderItemCalculated.productId) &&
        Objects.equals(this.relatedObject, orderItemCalculated.relatedObject) &&
        Objects.equals(this.sourceId, orderItemCalculated.sourceId) &&
        Objects.equals(this.quantity, orderItemCalculated.quantity) &&
        Objects.equals(this.discountQuantity, orderItemCalculated.discountQuantity) &&
        Objects.equals(this.initialQuantity, orderItemCalculated.initialQuantity) &&
        Objects.equals(this.amount, orderItemCalculated.amount) &&
        Objects.equals(this.discountAmount, orderItemCalculated.discountAmount) &&
        Objects.equals(this.appliedDiscountAmount, orderItemCalculated.appliedDiscountAmount) &&
        Objects.equals(this.initialAmount, orderItemCalculated.initialAmount) &&
        Objects.equals(this.totalAppliedDiscountAmount, orderItemCalculated.totalAppliedDiscountAmount) &&
        Objects.equals(this.price, orderItemCalculated.price) &&
        Objects.equals(this.subtotalAmount, orderItemCalculated.subtotalAmount) &&
        Objects.equals(this.product, orderItemCalculated.product) &&
        Objects.equals(this.sku, orderItemCalculated.sku) &&
        Objects.equals(this._object, orderItemCalculated._object) &&
        Objects.equals(this.metadata, orderItemCalculated.metadata)&&
        Objects.equals(this.additionalProperties, orderItemCalculated.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, productId, relatedObject, sourceId, quantity, discountQuantity, initialQuantity, amount, discountAmount, appliedDiscountAmount, initialAmount, totalAppliedDiscountAmount, price, subtotalAmount, product, sku, _object, metadata, additionalProperties);
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
    sb.append("class OrderItemCalculated {\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    discountQuantity: ").append(toIndentedString(discountQuantity)).append("\n");
    sb.append("    initialQuantity: ").append(toIndentedString(initialQuantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    appliedDiscountAmount: ").append(toIndentedString(appliedDiscountAmount)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    totalAppliedDiscountAmount: ").append(toIndentedString(totalAppliedDiscountAmount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("sku_id");
    openapiFields.add("product_id");
    openapiFields.add("related_object");
    openapiFields.add("source_id");
    openapiFields.add("quantity");
    openapiFields.add("discount_quantity");
    openapiFields.add("initial_quantity");
    openapiFields.add("amount");
    openapiFields.add("discount_amount");
    openapiFields.add("applied_discount_amount");
    openapiFields.add("initial_amount");
    openapiFields.add("total_applied_discount_amount");
    openapiFields.add("price");
    openapiFields.add("subtotal_amount");
    openapiFields.add("product");
    openapiFields.add("sku");
    openapiFields.add("object");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderItemCalculated
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sku_id") != null && !jsonObj.get("sku_id").isJsonNull()) && !jsonObj.get("sku_id").isJsonPrimitive()) {
        return;
      }
      if ((jsonObj.get("product_id") != null && !jsonObj.get("product_id").isJsonNull()) && !jsonObj.get("product_id").isJsonPrimitive()) {
        return;
      }
      if ((jsonObj.get("related_object") != null && !jsonObj.get("related_object").isJsonNull()) && !jsonObj.get("related_object").isJsonPrimitive()) {
        return;
      }
      try {
        JsonElement objectElement = jsonObj.get("related_object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          RelatedObjectEnum.fromValue(objectElement.getAsString());
        } else {
          return;
        }
      } catch (IllegalArgumentException e) {
          return;
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        return;
      }
      // validate the optional field `product`
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) {
        OrderItemCalculatedProduct.validateJsonElement(jsonObj.get("product"));
      }
      // validate the optional field `sku`
      if (jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) {
        OrderItemCalculatedSku.validateJsonElement(jsonObj.get("sku"));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        return;
      }
      try {
        JsonElement objectElement = jsonObj.get("object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ObjectEnum.fromValue(objectElement.getAsString());
        } else {
          return;
        }
      } catch (IllegalArgumentException e) {
          return;
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemCalculated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemCalculated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemCalculated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemCalculated.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemCalculated>() {
           @Override
           public void write(JsonWriter out, OrderItemCalculated value) throws IOException {
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
           public OrderItemCalculated read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrderItemCalculated instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderItemCalculated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemCalculated
  * @throws IOException if the JSON string is invalid with respect to OrderItemCalculated
  */
  public static OrderItemCalculated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemCalculated.class);
  }

 /**
  * Convert an instance of OrderItemCalculated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

