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
 * SimpleOrderItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SimpleOrderItem {
  /**
   * The type of object represented by JSON. This object stores information about the &#x60;order_item&#x60;.
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
  private ObjectEnum _object = ObjectEnum.ORDER_ITEM;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

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

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_SKU_ID = "sku_id";
  @SerializedName(SERIALIZED_NAME_SKU_ID)
  private String skuId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_DISCOUNT_QUANTITY = "discount_quantity";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_QUANTITY)
  private Integer discountQuantity;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Integer discountAmount;

  public static final String SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT = "applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT)
  private Integer appliedDiscountAmount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public SimpleOrderItem() {
  }

  public SimpleOrderItem _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON. This object stores information about the &#x60;order_item&#x60;.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public SimpleOrderItem sourceId(String sourceId) {
    
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


  public SimpleOrderItem relatedObject(RelatedObjectEnum relatedObject) {
    
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


  public SimpleOrderItem productId(String productId) {
    
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


  public SimpleOrderItem skuId(String skuId) {
    
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


  public SimpleOrderItem quantity(Integer quantity) {
    
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


  public SimpleOrderItem discountQuantity(Integer discountQuantity) {
    
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


  public SimpleOrderItem amount(Integer amount) {
    
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


  public SimpleOrderItem discountAmount(Integer discountAmount) {
    
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


  public SimpleOrderItem appliedDiscountAmount(Integer appliedDiscountAmount) {
    
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


  public SimpleOrderItem price(Integer price) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleOrderItem simpleOrderItem = (SimpleOrderItem) o;
    return Objects.equals(this._object, simpleOrderItem._object) &&
        Objects.equals(this.sourceId, simpleOrderItem.sourceId) &&
        Objects.equals(this.relatedObject, simpleOrderItem.relatedObject) &&
        Objects.equals(this.productId, simpleOrderItem.productId) &&
        Objects.equals(this.skuId, simpleOrderItem.skuId) &&
        Objects.equals(this.quantity, simpleOrderItem.quantity) &&
        Objects.equals(this.discountQuantity, simpleOrderItem.discountQuantity) &&
        Objects.equals(this.amount, simpleOrderItem.amount) &&
        Objects.equals(this.discountAmount, simpleOrderItem.discountAmount) &&
        Objects.equals(this.appliedDiscountAmount, simpleOrderItem.appliedDiscountAmount) &&
        Objects.equals(this.price, simpleOrderItem.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, sourceId, relatedObject, productId, skuId, quantity, discountQuantity, amount, discountAmount, appliedDiscountAmount, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleOrderItem {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    discountQuantity: ").append(toIndentedString(discountQuantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    appliedDiscountAmount: ").append(toIndentedString(appliedDiscountAmount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("source_id");
    openapiFields.add("related_object");
    openapiFields.add("product_id");
    openapiFields.add("sku_id");
    openapiFields.add("quantity");
    openapiFields.add("discount_quantity");
    openapiFields.add("amount");
    openapiFields.add("discount_amount");
    openapiFields.add("applied_discount_amount");
    openapiFields.add("price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SimpleOrderItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimpleOrderItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimpleOrderItem is not found in the empty JSON string", SimpleOrderItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimpleOrderItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimpleOrderItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
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
      if ((jsonObj.get("product_id") != null && !jsonObj.get("product_id").isJsonNull()) && !jsonObj.get("product_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_id").toString()));
      }
      if ((jsonObj.get("sku_id") != null && !jsonObj.get("sku_id").isJsonNull()) && !jsonObj.get("sku_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimpleOrderItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimpleOrderItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimpleOrderItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimpleOrderItem.class));

       return (TypeAdapter<T>) new TypeAdapter<SimpleOrderItem>() {
           @Override
           public void write(JsonWriter out, SimpleOrderItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimpleOrderItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimpleOrderItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimpleOrderItem
  * @throws IOException if the JSON string is invalid with respect to SimpleOrderItem
  */
  public static SimpleOrderItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimpleOrderItem.class);
  }

 /**
  * Convert an instance of SimpleOrderItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

