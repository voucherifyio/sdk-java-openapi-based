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
import voucherify.client.model.OrderItemProduct;
import voucherify.client.model.OrderItemSku;

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
 * OrderItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrderItem {
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public static final String SERIALIZED_NAME_INITIAL_AMOUNT = "initial_amount";
  @SerializedName(SERIALIZED_NAME_INITIAL_AMOUNT)
  private Integer initialAmount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private OrderItemProduct product;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private OrderItemSku sku;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public OrderItem() {
  }

  public OrderItem skuId(String skuId) {
    
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


  public OrderItem productId(String productId) {
    
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


  public OrderItem relatedObject(RelatedObjectEnum relatedObject) {
    
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


  public OrderItem sourceId(String sourceId) {
    
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


  public OrderItem quantity(Integer quantity) {
    
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


  public OrderItem discountQuantity(Integer discountQuantity) {
    
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


  public OrderItem initialQuantity(Integer initialQuantity) {
    
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


  public OrderItem amount(Integer amount) {
    
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


  public OrderItem discountAmount(Integer discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   *  Sum of all order-item-level discounts applied to the order.
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  public Integer getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Integer discountAmount) {
    this.discountAmount = discountAmount;
  }


  public OrderItem initialAmount(Integer initialAmount) {
    
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


  public OrderItem price(Integer price) {
    
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


  public OrderItem product(OrderItemProduct product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  public OrderItemProduct getProduct() {
    return product;
  }


  public void setProduct(OrderItemProduct product) {
    this.product = product;
  }


  public OrderItem sku(OrderItemSku sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  public OrderItemSku getSku() {
    return sku;
  }


  public void setSku(OrderItemSku sku) {
    this.sku = sku;
  }


  public OrderItem metadata(Object metadata) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.skuId, orderItem.skuId) &&
        Objects.equals(this.productId, orderItem.productId) &&
        Objects.equals(this.relatedObject, orderItem.relatedObject) &&
        Objects.equals(this.sourceId, orderItem.sourceId) &&
        Objects.equals(this.quantity, orderItem.quantity) &&
        Objects.equals(this.discountQuantity, orderItem.discountQuantity) &&
        Objects.equals(this.initialQuantity, orderItem.initialQuantity) &&
        Objects.equals(this.amount, orderItem.amount) &&
        Objects.equals(this.discountAmount, orderItem.discountAmount) &&
        Objects.equals(this.initialAmount, orderItem.initialAmount) &&
        Objects.equals(this.price, orderItem.price) &&
        Objects.equals(this.product, orderItem.product) &&
        Objects.equals(this.sku, orderItem.sku) &&
        Objects.equals(this.metadata, orderItem.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, productId, relatedObject, sourceId, quantity, discountQuantity, initialQuantity, amount, discountAmount, initialAmount, price, product, sku, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    discountQuantity: ").append(toIndentedString(discountQuantity)).append("\n");
    sb.append("    initialQuantity: ").append(toIndentedString(initialQuantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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
    openapiFields.add("sku_id");
    openapiFields.add("product_id");
    openapiFields.add("related_object");
    openapiFields.add("source_id");
    openapiFields.add("quantity");
    openapiFields.add("discount_quantity");
    openapiFields.add("initial_quantity");
    openapiFields.add("amount");
    openapiFields.add("discount_amount");
    openapiFields.add("initial_amount");
    openapiFields.add("price");
    openapiFields.add("product");
    openapiFields.add("sku");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderItem is not found in the empty JSON string", OrderItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sku_id") != null && !jsonObj.get("sku_id").isJsonNull()) && !jsonObj.get("sku_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku_id").toString()));
      }
      if ((jsonObj.get("product_id") != null && !jsonObj.get("product_id").isJsonNull()) && !jsonObj.get("product_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_id").toString()));
      }
      if ((jsonObj.get("related_object") != null && !jsonObj.get("related_object").isJsonNull()) && !jsonObj.get("related_object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_object").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("related_object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          RelatedObjectEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `related_object` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("related_object") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `related_object` to be a valid element of RelatedObjectEnum enum got `%s` instead", jsonObj.get("related_object").toString()));
        }
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      // validate the optional field `product`
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonNull()) {
        OrderItemProduct.validateJsonElement(jsonObj.get("product"));
      }
      // validate the optional field `sku`
      if (jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) {
        OrderItemSku.validateJsonElement(jsonObj.get("sku"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItem>() {
           @Override
           public void write(JsonWriter out, OrderItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItem
  * @throws IOException if the JSON string is invalid with respect to OrderItem
  */
  public static OrderItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItem.class);
  }

 /**
  * Convert an instance of OrderItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
