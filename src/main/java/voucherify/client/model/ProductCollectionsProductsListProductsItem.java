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
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.ProductWithoutSkus;
import voucherify.client.model.SkuWithProduct;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import voucherify.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:00:53.208514+01:00[Europe/Warsaw]")
public class ProductCollectionsProductsListProductsItem extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ProductCollectionsProductsListProductsItem.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ProductCollectionsProductsListProductsItem.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ProductCollectionsProductsListProductsItem' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ProductWithoutSkus> adapterProductWithoutSkus = gson.getDelegateAdapter(this, TypeToken.get(ProductWithoutSkus.class));
            final TypeAdapter<SkuWithProduct> adapterSkuWithProduct = gson.getDelegateAdapter(this, TypeToken.get(SkuWithProduct.class));

            return (TypeAdapter<T>) new TypeAdapter<ProductCollectionsProductsListProductsItem>() {
                @Override
                public void write(JsonWriter out, ProductCollectionsProductsListProductsItem value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ProductWithoutSkus`
                    if (value.getActualInstance() instanceof ProductWithoutSkus) {
                      JsonElement element = adapterProductWithoutSkus.toJsonTree((ProductWithoutSkus)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `SkuWithProduct`
                    if (value.getActualInstance() instanceof SkuWithProduct) {
                      JsonElement element = adapterSkuWithProduct.toJsonTree((SkuWithProduct)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ProductWithoutSkus, SkuWithProduct");
                }

                @Override
                public ProductCollectionsProductsListProductsItem read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ProductWithoutSkus
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ProductWithoutSkus.validateJsonElement(jsonElement);
                      actualAdapter = adapterProductWithoutSkus;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ProductWithoutSkus'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ProductWithoutSkus failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ProductWithoutSkus'", e);
                    }
                    // deserialize SkuWithProduct
                    try {
                      // validate the JSON object to see if any exception is thrown
                      SkuWithProduct.validateJsonElement(jsonElement);
                      actualAdapter = adapterSkuWithProduct;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'SkuWithProduct'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for SkuWithProduct failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'SkuWithProduct'", e);
                    }

                    if (match == 1) {
                        ProductCollectionsProductsListProductsItem ret = new ProductCollectionsProductsListProductsItem();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ProductCollectionsProductsListProductsItem: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ProductCollectionsProductsListProductsItem() {
        super("oneOf", Boolean.FALSE);
    }

    public ProductCollectionsProductsListProductsItem(ProductWithoutSkus o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ProductCollectionsProductsListProductsItem(SkuWithProduct o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ProductWithoutSkus", ProductWithoutSkus.class);
        schemas.put("SkuWithProduct", SkuWithProduct.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ProductCollectionsProductsListProductsItem.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ProductWithoutSkus, SkuWithProduct
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ProductWithoutSkus) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SkuWithProduct) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ProductWithoutSkus, SkuWithProduct");
    }

    /**
     * Get the actual instance, which can be the following:
     * ProductWithoutSkus, SkuWithProduct
     *
     * @return The actual instance (ProductWithoutSkus, SkuWithProduct)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ProductWithoutSkus`. If the actual instance is not `ProductWithoutSkus`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ProductWithoutSkus`
     * @throws ClassCastException if the instance is not `ProductWithoutSkus`
     */
    public ProductWithoutSkus getProductWithoutSkus() throws ClassCastException {
        return (ProductWithoutSkus)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SkuWithProduct`. If the actual instance is not `SkuWithProduct`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SkuWithProduct`
     * @throws ClassCastException if the instance is not `SkuWithProduct`
     */
    public SkuWithProduct getSkuWithProduct() throws ClassCastException {
        return (SkuWithProduct)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductCollectionsProductsListProductsItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ProductWithoutSkus
    try {
      ProductWithoutSkus.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ProductWithoutSkus failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SkuWithProduct
    try {
      SkuWithProduct.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SkuWithProduct failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ProductCollectionsProductsListProductsItem with oneOf schemas: ProductWithoutSkus, SkuWithProduct. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ProductCollectionsProductsListProductsItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductCollectionsProductsListProductsItem
  * @throws IOException if the JSON string is invalid with respect to ProductCollectionsProductsListProductsItem
  */
  public static ProductCollectionsProductsListProductsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductCollectionsProductsListProductsItem.class);
  }

 /**
  * Convert an instance of ProductCollectionsProductsListProductsItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
