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
import org.openapitools.client.model.EarningRuleProportionalCustomEvent;
import org.openapitools.client.model.EarningRuleProportionalCustomEventCustomEvent;
import org.openapitools.client.model.EarningRuleProportionalCustomerMetadata;
import org.openapitools.client.model.EarningRuleProportionalCustomerMetadataCustomer;
import org.openapitools.client.model.EarningRuleProportionalOrder;
import org.openapitools.client.model.EarningRuleProportionalOrderItems;
import org.openapitools.client.model.EarningRuleProportionalOrderItemsSubtotalAmountOrderItems;
import org.openapitools.client.model.EarningRuleProportionalOrderMetadataOrder;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class EarningRuleProportional extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(EarningRuleProportional.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EarningRuleProportional.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EarningRuleProportional' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EarningRuleProportionalOrder> adapterEarningRuleProportionalOrder = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalOrder.class));
            final TypeAdapter<EarningRuleProportionalOrderItems> adapterEarningRuleProportionalOrderItems = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalOrderItems.class));
            final TypeAdapter<EarningRuleProportionalCustomerMetadata> adapterEarningRuleProportionalCustomerMetadata = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalCustomerMetadata.class));
            final TypeAdapter<EarningRuleProportionalCustomEvent> adapterEarningRuleProportionalCustomEvent = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalCustomEvent.class));

            return (TypeAdapter<T>) new TypeAdapter<EarningRuleProportional>() {
                @Override
                public void write(JsonWriter out, EarningRuleProportional value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `EarningRuleProportionalOrder`
                    if (value.getActualInstance() instanceof EarningRuleProportionalOrder) {
                      JsonElement element = adapterEarningRuleProportionalOrder.toJsonTree((EarningRuleProportionalOrder)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EarningRuleProportionalOrderItems`
                    if (value.getActualInstance() instanceof EarningRuleProportionalOrderItems) {
                      JsonElement element = adapterEarningRuleProportionalOrderItems.toJsonTree((EarningRuleProportionalOrderItems)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EarningRuleProportionalCustomerMetadata`
                    if (value.getActualInstance() instanceof EarningRuleProportionalCustomerMetadata) {
                      JsonElement element = adapterEarningRuleProportionalCustomerMetadata.toJsonTree((EarningRuleProportionalCustomerMetadata)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `EarningRuleProportionalCustomEvent`
                    if (value.getActualInstance() instanceof EarningRuleProportionalCustomEvent) {
                      JsonElement element = adapterEarningRuleProportionalCustomEvent.toJsonTree((EarningRuleProportionalCustomEvent)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: EarningRuleProportionalCustomEvent, EarningRuleProportionalCustomerMetadata, EarningRuleProportionalOrder, EarningRuleProportionalOrderItems");
                }

                @Override
                public EarningRuleProportional read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize EarningRuleProportionalOrder
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EarningRuleProportionalOrder.validateJsonElement(jsonElement);
                      actualAdapter = adapterEarningRuleProportionalOrder;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EarningRuleProportionalOrder'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrder failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EarningRuleProportionalOrder'", e);
                    }
                    // deserialize EarningRuleProportionalOrderItems
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EarningRuleProportionalOrderItems.validateJsonElement(jsonElement);
                      actualAdapter = adapterEarningRuleProportionalOrderItems;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EarningRuleProportionalOrderItems'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrderItems failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EarningRuleProportionalOrderItems'", e);
                    }
                    // deserialize EarningRuleProportionalCustomerMetadata
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EarningRuleProportionalCustomerMetadata.validateJsonElement(jsonElement);
                      actualAdapter = adapterEarningRuleProportionalCustomerMetadata;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EarningRuleProportionalCustomerMetadata'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EarningRuleProportionalCustomerMetadata failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EarningRuleProportionalCustomerMetadata'", e);
                    }
                    // deserialize EarningRuleProportionalCustomEvent
                    try {
                      // validate the JSON object to see if any exception is thrown
                      EarningRuleProportionalCustomEvent.validateJsonElement(jsonElement);
                      actualAdapter = adapterEarningRuleProportionalCustomEvent;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'EarningRuleProportionalCustomEvent'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for EarningRuleProportionalCustomEvent failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'EarningRuleProportionalCustomEvent'", e);
                    }

                    if (match == 1) {
                        EarningRuleProportional ret = new EarningRuleProportional();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for EarningRuleProportional: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public EarningRuleProportional() {
        super("oneOf", Boolean.FALSE);
    }

    public EarningRuleProportional(EarningRuleProportionalCustomEvent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EarningRuleProportional(EarningRuleProportionalCustomerMetadata o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EarningRuleProportional(EarningRuleProportionalOrder o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public EarningRuleProportional(EarningRuleProportionalOrderItems o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EarningRuleProportionalOrder", EarningRuleProportionalOrder.class);
        schemas.put("EarningRuleProportionalOrderItems", EarningRuleProportionalOrderItems.class);
        schemas.put("EarningRuleProportionalCustomerMetadata", EarningRuleProportionalCustomerMetadata.class);
        schemas.put("EarningRuleProportionalCustomEvent", EarningRuleProportionalCustomEvent.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return EarningRuleProportional.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EarningRuleProportionalCustomEvent, EarningRuleProportionalCustomerMetadata, EarningRuleProportionalOrder, EarningRuleProportionalOrderItems
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof EarningRuleProportionalOrder) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EarningRuleProportionalOrderItems) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EarningRuleProportionalCustomerMetadata) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EarningRuleProportionalCustomEvent) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EarningRuleProportionalCustomEvent, EarningRuleProportionalCustomerMetadata, EarningRuleProportionalOrder, EarningRuleProportionalOrderItems");
    }

    /**
     * Get the actual instance, which can be the following:
     * EarningRuleProportionalCustomEvent, EarningRuleProportionalCustomerMetadata, EarningRuleProportionalOrder, EarningRuleProportionalOrderItems
     *
     * @return The actual instance (EarningRuleProportionalCustomEvent, EarningRuleProportionalCustomerMetadata, EarningRuleProportionalOrder, EarningRuleProportionalOrderItems)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EarningRuleProportionalOrder`. If the actual instance is not `EarningRuleProportionalOrder`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EarningRuleProportionalOrder`
     * @throws ClassCastException if the instance is not `EarningRuleProportionalOrder`
     */
    public EarningRuleProportionalOrder getEarningRuleProportionalOrder() throws ClassCastException {
        return (EarningRuleProportionalOrder)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EarningRuleProportionalOrderItems`. If the actual instance is not `EarningRuleProportionalOrderItems`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EarningRuleProportionalOrderItems`
     * @throws ClassCastException if the instance is not `EarningRuleProportionalOrderItems`
     */
    public EarningRuleProportionalOrderItems getEarningRuleProportionalOrderItems() throws ClassCastException {
        return (EarningRuleProportionalOrderItems)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EarningRuleProportionalCustomerMetadata`. If the actual instance is not `EarningRuleProportionalCustomerMetadata`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EarningRuleProportionalCustomerMetadata`
     * @throws ClassCastException if the instance is not `EarningRuleProportionalCustomerMetadata`
     */
    public EarningRuleProportionalCustomerMetadata getEarningRuleProportionalCustomerMetadata() throws ClassCastException {
        return (EarningRuleProportionalCustomerMetadata)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EarningRuleProportionalCustomEvent`. If the actual instance is not `EarningRuleProportionalCustomEvent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EarningRuleProportionalCustomEvent`
     * @throws ClassCastException if the instance is not `EarningRuleProportionalCustomEvent`
     */
    public EarningRuleProportionalCustomEvent getEarningRuleProportionalCustomEvent() throws ClassCastException {
        return (EarningRuleProportionalCustomEvent)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EarningRuleProportional
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with EarningRuleProportionalOrder
    try {
      EarningRuleProportionalOrder.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrder failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EarningRuleProportionalOrderItems
    try {
      EarningRuleProportionalOrderItems.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EarningRuleProportionalOrderItems failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EarningRuleProportionalCustomerMetadata
    try {
      EarningRuleProportionalCustomerMetadata.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EarningRuleProportionalCustomerMetadata failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with EarningRuleProportionalCustomEvent
    try {
      EarningRuleProportionalCustomEvent.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for EarningRuleProportionalCustomEvent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for EarningRuleProportional with oneOf schemas: EarningRuleProportionalCustomEvent, EarningRuleProportionalCustomerMetadata, EarningRuleProportionalOrder, EarningRuleProportionalOrderItems. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of EarningRuleProportional given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EarningRuleProportional
  * @throws IOException if the JSON string is invalid with respect to EarningRuleProportional
  */
  public static EarningRuleProportional fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EarningRuleProportional.class);
  }

 /**
  * Convert an instance of EarningRuleProportional to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

