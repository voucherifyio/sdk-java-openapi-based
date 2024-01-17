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
import java.util.Arrays;
import org.openapitools.client.model.EarningRuleProportionalOrderAmount;
import org.openapitools.client.model.EarningRuleProportionalOrderMetadata;
import org.openapitools.client.model.EarningRuleProportionalOrderMetadataOrder;
import org.openapitools.client.model.EarningRuleProportionalOrderTotalAmount;



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

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class EarningRuleProportionalOrder extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EarningRuleProportionalOrder.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EarningRuleProportionalOrder.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EarningRuleProportionalOrder' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EarningRuleProportionalOrderAmount> adapterEarningRuleProportionalOrderAmount = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalOrderAmount.class));
            final TypeAdapter<EarningRuleProportionalOrderTotalAmount> adapterEarningRuleProportionalOrderTotalAmount = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalOrderTotalAmount.class));
            final TypeAdapter<EarningRuleProportionalOrderMetadata> adapterEarningRuleProportionalOrderMetadata = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalOrderMetadata.class));

            return (TypeAdapter<T>) new TypeAdapter<EarningRuleProportionalOrder>() {
                @Override
                public void write(JsonWriter out, EarningRuleProportionalOrder value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `EarningRuleProportionalOrderAmount`
                    if (value.getActualInstance() instanceof EarningRuleProportionalOrderAmount) {
                      JsonElement element = adapterEarningRuleProportionalOrderAmount.toJsonTree((EarningRuleProportionalOrderAmount)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EarningRuleProportionalOrderTotalAmount`
                    if (value.getActualInstance() instanceof EarningRuleProportionalOrderTotalAmount) {
                      JsonElement element = adapterEarningRuleProportionalOrderTotalAmount.toJsonTree((EarningRuleProportionalOrderTotalAmount)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EarningRuleProportionalOrderMetadata`
                    if (value.getActualInstance() instanceof EarningRuleProportionalOrderMetadata) {
                      JsonElement element = adapterEarningRuleProportionalOrderMetadata.toJsonTree((EarningRuleProportionalOrderMetadata)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: EarningRuleProportionalOrderAmount, EarningRuleProportionalOrderMetadata, EarningRuleProportionalOrderTotalAmount");
                }

                @Override
                public EarningRuleProportionalOrder read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize EarningRuleProportionalOrderAmount
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EarningRuleProportionalOrderAmount.validateJsonElement(jsonElement);
                      actualAdapter = adapterEarningRuleProportionalOrderAmount;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EarningRuleProportionalOrderAmount'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrderAmount failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EarningRuleProportionalOrderAmount'", e);
                    }
                    // deserialize EarningRuleProportionalOrderTotalAmount
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EarningRuleProportionalOrderTotalAmount.validateJsonElement(jsonElement);
                      actualAdapter = adapterEarningRuleProportionalOrderTotalAmount;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EarningRuleProportionalOrderTotalAmount'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrderTotalAmount failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EarningRuleProportionalOrderTotalAmount'", e);
                    }
                    // deserialize EarningRuleProportionalOrderMetadata
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EarningRuleProportionalOrderMetadata.validateJsonElement(jsonElement);
                      actualAdapter = adapterEarningRuleProportionalOrderMetadata;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EarningRuleProportionalOrderMetadata'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrderMetadata failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EarningRuleProportionalOrderMetadata'", e);
                    }

                    if (match == 1) {
                        EarningRuleProportionalOrder ret = new EarningRuleProportionalOrder();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for EarningRuleProportionalOrder: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public EarningRuleProportionalOrder() {
        super("oneOf", Boolean.FALSE);
    }

    public EarningRuleProportionalOrder(EarningRuleProportionalOrderAmount o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EarningRuleProportionalOrder(EarningRuleProportionalOrderMetadata o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EarningRuleProportionalOrder(EarningRuleProportionalOrderTotalAmount o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EarningRuleProportionalOrderAmount", EarningRuleProportionalOrderAmount.class);
        schemas.put("EarningRuleProportionalOrderTotalAmount", EarningRuleProportionalOrderTotalAmount.class);
        schemas.put("EarningRuleProportionalOrderMetadata", EarningRuleProportionalOrderMetadata.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return EarningRuleProportionalOrder.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EarningRuleProportionalOrderAmount, EarningRuleProportionalOrderMetadata, EarningRuleProportionalOrderTotalAmount
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof EarningRuleProportionalOrderAmount) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EarningRuleProportionalOrderTotalAmount) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EarningRuleProportionalOrderMetadata) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EarningRuleProportionalOrderAmount, EarningRuleProportionalOrderMetadata, EarningRuleProportionalOrderTotalAmount");
    }

    /**
     * Get the actual instance, which can be the following:
     * EarningRuleProportionalOrderAmount, EarningRuleProportionalOrderMetadata, EarningRuleProportionalOrderTotalAmount
     *
     * @return The actual instance (EarningRuleProportionalOrderAmount, EarningRuleProportionalOrderMetadata, EarningRuleProportionalOrderTotalAmount)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EarningRuleProportionalOrderAmount`. If the actual instance is not `EarningRuleProportionalOrderAmount`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EarningRuleProportionalOrderAmount`
     * @throws ClassCastException if the instance is not `EarningRuleProportionalOrderAmount`
     */
    public EarningRuleProportionalOrderAmount getEarningRuleProportionalOrderAmount() throws ClassCastException {
        return (EarningRuleProportionalOrderAmount)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EarningRuleProportionalOrderTotalAmount`. If the actual instance is not `EarningRuleProportionalOrderTotalAmount`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EarningRuleProportionalOrderTotalAmount`
     * @throws ClassCastException if the instance is not `EarningRuleProportionalOrderTotalAmount`
     */
    public EarningRuleProportionalOrderTotalAmount getEarningRuleProportionalOrderTotalAmount() throws ClassCastException {
        return (EarningRuleProportionalOrderTotalAmount)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EarningRuleProportionalOrderMetadata`. If the actual instance is not `EarningRuleProportionalOrderMetadata`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EarningRuleProportionalOrderMetadata`
     * @throws ClassCastException if the instance is not `EarningRuleProportionalOrderMetadata`
     */
    public EarningRuleProportionalOrderMetadata getEarningRuleProportionalOrderMetadata() throws ClassCastException {
        return (EarningRuleProportionalOrderMetadata)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EarningRuleProportionalOrder
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with EarningRuleProportionalOrderAmount
    try {
      EarningRuleProportionalOrderAmount.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrderAmount failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EarningRuleProportionalOrderTotalAmount
    try {
      EarningRuleProportionalOrderTotalAmount.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrderTotalAmount failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EarningRuleProportionalOrderMetadata
    try {
      EarningRuleProportionalOrderMetadata.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrderMetadata failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for EarningRuleProportionalOrder with oneOf schemas: EarningRuleProportionalOrderAmount, EarningRuleProportionalOrderMetadata, EarningRuleProportionalOrderTotalAmount. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of EarningRuleProportionalOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EarningRuleProportionalOrder
  * @throws IOException if the JSON string is invalid with respect to EarningRuleProportionalOrder
  */
  public static EarningRuleProportionalOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EarningRuleProportionalOrder.class);
  }

 /**
  * Convert an instance of EarningRuleProportionalOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

