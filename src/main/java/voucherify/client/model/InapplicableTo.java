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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.ApplicableToEffect;

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
 * InapplicableTo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class InapplicableTo {
  /**
   * This object stores information about the product collection.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    PRODUCT("product"),
    
    SKU("sku"),
    
    PRODUCTS_COLLECTION("products_collection");

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
  private ObjectEnum _object;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PRODUCT_SOURCE_ID = "product_source_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SOURCE_ID)
  private String productSourceId;

  public static final String SERIALIZED_NAME_STRICT = "strict";
  @SerializedName(SERIALIZED_NAME_STRICT)
  private Boolean strict;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_PRICE_FORMULA = "price_formula";
  @SerializedName(SERIALIZED_NAME_PRICE_FORMULA)
  private BigDecimal priceFormula;

  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private ApplicableToEffect effect;

  public static final String SERIALIZED_NAME_QUANTITY_LIMIT = "quantity_limit";
  @SerializedName(SERIALIZED_NAME_QUANTITY_LIMIT)
  private Integer quantityLimit;

  public static final String SERIALIZED_NAME_AGGREGATED_QUANTITY_LIMIT = "aggregated_quantity_limit";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_QUANTITY_LIMIT)
  private Integer aggregatedQuantityLimit;

  public static final String SERIALIZED_NAME_AMOUNT_LIMIT = "amount_limit";
  @SerializedName(SERIALIZED_NAME_AMOUNT_LIMIT)
  private Integer amountLimit;

  public static final String SERIALIZED_NAME_AGGREGATED_AMOUNT_LIMIT = "aggregated_amount_limit";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_AMOUNT_LIMIT)
  private Integer aggregatedAmountLimit;

  public static final String SERIALIZED_NAME_ORDER_ITEM_INDICES = "order_item_indices";
  @SerializedName(SERIALIZED_NAME_ORDER_ITEM_INDICES)
  private List<Integer> orderItemIndices;

  public InapplicableTo() {
  }

  public InapplicableTo _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * This object stores information about the product collection.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public InapplicableTo id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique product collection ID assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public InapplicableTo sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The source ID from your inventory system.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public InapplicableTo productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Parent product&#39;s unique ID assigned by Voucherify.
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public InapplicableTo productSourceId(String productSourceId) {
    
    this.productSourceId = productSourceId;
    return this;
  }

   /**
   * Parent product&#39;s source ID from your inventory system.
   * @return productSourceId
  **/
  @javax.annotation.Nullable
  public String getProductSourceId() {
    return productSourceId;
  }


  public void setProductSourceId(String productSourceId) {
    this.productSourceId = productSourceId;
  }


  public InapplicableTo strict(Boolean strict) {
    
    this.strict = strict;
    return this;
  }

   /**
   * Get strict
   * @return strict
  **/
  @javax.annotation.Nullable
  public Boolean getStrict() {
    return strict;
  }


  public void setStrict(Boolean strict) {
    this.strict = strict;
  }


  public InapplicableTo price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * New fixed price of an item. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $10 price is written as 1000. In case of the fixed price being calculated by the formula, i.e. the price_formula parameter is present in the fixed price definition, this value becomes the fallback value. Such that in a case where the formula cannot be calculated due to missing metadata, for example, this value will be used as the fixed price.
   * @return price
  **/
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public InapplicableTo priceFormula(BigDecimal priceFormula) {
    
    this.priceFormula = priceFormula;
    return this;
  }

   /**
   * Formula used to calculate the discounted price of an item.
   * @return priceFormula
  **/
  @javax.annotation.Nullable
  public BigDecimal getPriceFormula() {
    return priceFormula;
  }


  public void setPriceFormula(BigDecimal priceFormula) {
    this.priceFormula = priceFormula;
  }


  public InapplicableTo effect(ApplicableToEffect effect) {
    
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @javax.annotation.Nonnull
  public ApplicableToEffect getEffect() {
    return effect;
  }


  public void setEffect(ApplicableToEffect effect) {
    this.effect = effect;
  }


  public InapplicableTo quantityLimit(Integer quantityLimit) {
    
    this.quantityLimit = quantityLimit;
    return this;
  }

   /**
   * The maximum number of units allowed to be discounted per order line item.
   * @return quantityLimit
  **/
  @javax.annotation.Nullable
  public Integer getQuantityLimit() {
    return quantityLimit;
  }


  public void setQuantityLimit(Integer quantityLimit) {
    this.quantityLimit = quantityLimit;
  }


  public InapplicableTo aggregatedQuantityLimit(Integer aggregatedQuantityLimit) {
    
    this.aggregatedQuantityLimit = aggregatedQuantityLimit;
    return this;
  }

   /**
   * The maximum number of units allowed to be discounted combined across all matched order line items.
   * @return aggregatedQuantityLimit
  **/
  @javax.annotation.Nullable
  public Integer getAggregatedQuantityLimit() {
    return aggregatedQuantityLimit;
  }


  public void setAggregatedQuantityLimit(Integer aggregatedQuantityLimit) {
    this.aggregatedQuantityLimit = aggregatedQuantityLimit;
  }


  public InapplicableTo amountLimit(Integer amountLimit) {
    
    this.amountLimit = amountLimit;
    return this;
  }

   /**
   * Upper limit allowed to be applied as a discount per order line item. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount is written as 600.
   * @return amountLimit
  **/
  @javax.annotation.Nullable
  public Integer getAmountLimit() {
    return amountLimit;
  }


  public void setAmountLimit(Integer amountLimit) {
    this.amountLimit = amountLimit;
  }


  public InapplicableTo aggregatedAmountLimit(Integer aggregatedAmountLimit) {
    
    this.aggregatedAmountLimit = aggregatedAmountLimit;
    return this;
  }

   /**
   * Maximum discount amount per order. Value is multiplied by 100 to precisely represent 2 decimal places. For example, a $6 maximum discount on the entire order is written as 600. This value is definable for the following discount effects: - &#x60;APPLY_TO_ITEMS&#x60; (each item subtotal is discounted equally) - &#x60;APPLY_TO_ITEMS_BY_QUANTITY&#x60; (each unit of matched products has the same discount value)
   * @return aggregatedAmountLimit
  **/
  @javax.annotation.Nullable
  public Integer getAggregatedAmountLimit() {
    return aggregatedAmountLimit;
  }


  public void setAggregatedAmountLimit(Integer aggregatedAmountLimit) {
    this.aggregatedAmountLimit = aggregatedAmountLimit;
  }


  public InapplicableTo orderItemIndices(List<Integer> orderItemIndices) {
    
    this.orderItemIndices = orderItemIndices;
    return this;
  }

  public InapplicableTo addOrderItemIndicesItem(Integer orderItemIndicesItem) {
    if (this.orderItemIndices == null) {
      this.orderItemIndices = new ArrayList<>();
    }
    this.orderItemIndices.add(orderItemIndicesItem);
    return this;
  }

   /**
   * Get orderItemIndices
   * @return orderItemIndices
  **/
  @javax.annotation.Nullable
  public List<Integer> getOrderItemIndices() {
    return orderItemIndices;
  }


  public void setOrderItemIndices(List<Integer> orderItemIndices) {
    this.orderItemIndices = orderItemIndices;
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
   * @return the InapplicableTo instance itself
   */
  public InapplicableTo putAdditionalProperty(String key, Object value) {
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
    InapplicableTo inapplicableTo = (InapplicableTo) o;
    return Objects.equals(this._object, inapplicableTo._object) &&
        Objects.equals(this.id, inapplicableTo.id) &&
        Objects.equals(this.sourceId, inapplicableTo.sourceId) &&
        Objects.equals(this.productId, inapplicableTo.productId) &&
        Objects.equals(this.productSourceId, inapplicableTo.productSourceId) &&
        Objects.equals(this.strict, inapplicableTo.strict) &&
        Objects.equals(this.price, inapplicableTo.price) &&
        Objects.equals(this.priceFormula, inapplicableTo.priceFormula) &&
        Objects.equals(this.effect, inapplicableTo.effect) &&
        Objects.equals(this.quantityLimit, inapplicableTo.quantityLimit) &&
        Objects.equals(this.aggregatedQuantityLimit, inapplicableTo.aggregatedQuantityLimit) &&
        Objects.equals(this.amountLimit, inapplicableTo.amountLimit) &&
        Objects.equals(this.aggregatedAmountLimit, inapplicableTo.aggregatedAmountLimit) &&
        Objects.equals(this.orderItemIndices, inapplicableTo.orderItemIndices)&&
        Objects.equals(this.additionalProperties, inapplicableTo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, sourceId, productId, productSourceId, strict, price, priceFormula, effect, quantityLimit, aggregatedQuantityLimit, amountLimit, aggregatedAmountLimit, orderItemIndices, additionalProperties);
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
    sb.append("class InapplicableTo {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productSourceId: ").append(toIndentedString(productSourceId)).append("\n");
    sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceFormula: ").append(toIndentedString(priceFormula)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    quantityLimit: ").append(toIndentedString(quantityLimit)).append("\n");
    sb.append("    aggregatedQuantityLimit: ").append(toIndentedString(aggregatedQuantityLimit)).append("\n");
    sb.append("    amountLimit: ").append(toIndentedString(amountLimit)).append("\n");
    sb.append("    aggregatedAmountLimit: ").append(toIndentedString(aggregatedAmountLimit)).append("\n");
    sb.append("    orderItemIndices: ").append(toIndentedString(orderItemIndices)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("id");
    openapiFields.add("source_id");
    openapiFields.add("product_id");
    openapiFields.add("product_source_id");
    openapiFields.add("strict");
    openapiFields.add("price");
    openapiFields.add("price_formula");
    openapiFields.add("effect");
    openapiFields.add("quantity_limit");
    openapiFields.add("aggregated_quantity_limit");
    openapiFields.add("amount_limit");
    openapiFields.add("aggregated_amount_limit");
    openapiFields.add("order_item_indices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("effect");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InapplicableTo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InapplicableTo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InapplicableTo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InapplicableTo.class));

       return (TypeAdapter<T>) new TypeAdapter<InapplicableTo>() {
           @Override
           public void write(JsonWriter out, InapplicableTo value) throws IOException {
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
           public InapplicableTo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             InapplicableTo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InapplicableTo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InapplicableTo
  * @throws IOException if the JSON string is invalid with respect to InapplicableTo
  */
  public static InapplicableTo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InapplicableTo.class);
  }

 /**
  * Convert an instance of InapplicableTo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

