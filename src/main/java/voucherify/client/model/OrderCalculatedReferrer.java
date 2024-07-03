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
import voucherify.client.model.ReferrerId;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrderCalculatedReferrer extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(OrderCalculatedReferrer.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrderCalculatedReferrer.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrderCalculatedReferrer' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ReferrerId> adapterReferrerId = gson.getDelegateAdapter(this, TypeToken.get(ReferrerId.class));

            return (TypeAdapter<T>) new TypeAdapter<OrderCalculatedReferrer>() {
                @Override
                public void write(JsonWriter out, OrderCalculatedReferrer value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ReferrerId`
                    if (value.getActualInstance() instanceof ReferrerId) {
                      JsonElement element = adapterReferrerId.toJsonTree((ReferrerId)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ReferrerId");
                }

                @Override
                public OrderCalculatedReferrer read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ReferrerId
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ReferrerId.validateJsonElement(jsonElement);
                      actualAdapter = adapterReferrerId;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ReferrerId'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ReferrerId failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ReferrerId'", e);
                    }

                    if (match == 1) {
                        OrderCalculatedReferrer ret = new OrderCalculatedReferrer();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for OrderCalculatedReferrer: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public OrderCalculatedReferrer() {
        super("oneOf", Boolean.FALSE);
    }

    public OrderCalculatedReferrer(ReferrerId o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ReferrerId", ReferrerId.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return OrderCalculatedReferrer.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ReferrerId
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ReferrerId) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ReferrerId");
    }

    /**
     * Get the actual instance, which can be the following:
     * ReferrerId
     *
     * @return The actual instance (ReferrerId)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ReferrerId`. If the actual instance is not `ReferrerId`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ReferrerId`
     * @throws ClassCastException if the instance is not `ReferrerId`
     */
    public ReferrerId getReferrerId() throws ClassCastException {
        return (ReferrerId)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCalculatedReferrer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ReferrerId
    try {
      ReferrerId.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ReferrerId failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for OrderCalculatedReferrer with oneOf schemas: ReferrerId. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of OrderCalculatedReferrer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCalculatedReferrer
  * @throws IOException if the JSON string is invalid with respect to OrderCalculatedReferrer
  */
  public static OrderCalculatedReferrer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCalculatedReferrer.class);
  }

 /**
  * Convert an instance of OrderCalculatedReferrer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

