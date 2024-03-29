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
import voucherify.client.model.DiscountAmount;
import voucherify.client.model.DiscountFixed;
import voucherify.client.model.DiscountFixedVouchersEffectTypes;
import voucherify.client.model.DiscountPercent;
import voucherify.client.model.DiscountUnit;
import voucherify.client.model.DiscountUnitMultiple;
import voucherify.client.model.DiscountUnitMultipleOneUnit;
import voucherify.client.model.SimpleProductDiscountUnit;
import voucherify.client.model.SimpleSkuDiscountUnit;



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

public class Discount extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Discount.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Discount.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Discount' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DiscountAmount> adapterDiscountAmount = gson.getDelegateAdapter(this, TypeToken.get(DiscountAmount.class));
            final TypeAdapter<DiscountUnit> adapterDiscountUnit = gson.getDelegateAdapter(this, TypeToken.get(DiscountUnit.class));
            final TypeAdapter<DiscountUnitMultiple> adapterDiscountUnitMultiple = gson.getDelegateAdapter(this, TypeToken.get(DiscountUnitMultiple.class));
            final TypeAdapter<DiscountPercent> adapterDiscountPercent = gson.getDelegateAdapter(this, TypeToken.get(DiscountPercent.class));
            final TypeAdapter<DiscountFixed> adapterDiscountFixed = gson.getDelegateAdapter(this, TypeToken.get(DiscountFixed.class));

            return (TypeAdapter<T>) new TypeAdapter<Discount>() {
                @Override
                public void write(JsonWriter out, Discount value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `DiscountAmount`
                    if (value.getActualInstance() instanceof DiscountAmount) {
                      JsonElement element = adapterDiscountAmount.toJsonTree((DiscountAmount)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `DiscountUnit`
                    if (value.getActualInstance() instanceof DiscountUnit) {
                      JsonElement element = adapterDiscountUnit.toJsonTree((DiscountUnit)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `DiscountUnitMultiple`
                    if (value.getActualInstance() instanceof DiscountUnitMultiple) {
                      JsonElement element = adapterDiscountUnitMultiple.toJsonTree((DiscountUnitMultiple)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `DiscountPercent`
                    if (value.getActualInstance() instanceof DiscountPercent) {
                      JsonElement element = adapterDiscountPercent.toJsonTree((DiscountPercent)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `DiscountFixed`
                    if (value.getActualInstance() instanceof DiscountFixed) {
                      JsonElement element = adapterDiscountFixed.toJsonTree((DiscountFixed)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: DiscountAmount, DiscountFixed, DiscountPercent, DiscountUnit, DiscountUnitMultiple");
                }

                @Override
                public Discount read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize DiscountAmount
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DiscountAmount.validateJsonElement(jsonElement);
                      actualAdapter = adapterDiscountAmount;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'DiscountAmount'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DiscountAmount failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DiscountAmount'", e);
                    }
                    // deserialize DiscountUnit
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DiscountUnit.validateJsonElement(jsonElement);
                      actualAdapter = adapterDiscountUnit;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'DiscountUnit'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DiscountUnit failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DiscountUnit'", e);
                    }
                    // deserialize DiscountUnitMultiple
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DiscountUnitMultiple.validateJsonElement(jsonElement);
                      actualAdapter = adapterDiscountUnitMultiple;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'DiscountUnitMultiple'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DiscountUnitMultiple failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DiscountUnitMultiple'", e);
                    }
                    // deserialize DiscountPercent
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DiscountPercent.validateJsonElement(jsonElement);
                      actualAdapter = adapterDiscountPercent;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'DiscountPercent'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DiscountPercent failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DiscountPercent'", e);
                    }
                    // deserialize DiscountFixed
                    try {
                      // validate the JSON object to see if any exception is thrown
                      DiscountFixed.validateJsonElement(jsonElement);
                      actualAdapter = adapterDiscountFixed;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'DiscountFixed'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for DiscountFixed failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'DiscountFixed'", e);
                    }

                    if (match == 1) {
                        Discount ret = new Discount();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Discount: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Discount() {
        super("oneOf", Boolean.FALSE);
    }

    public Discount(DiscountAmount o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Discount(DiscountFixed o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Discount(DiscountPercent o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Discount(DiscountUnit o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Discount(DiscountUnitMultiple o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("DiscountAmount", DiscountAmount.class);
        schemas.put("DiscountUnit", DiscountUnit.class);
        schemas.put("DiscountUnitMultiple", DiscountUnitMultiple.class);
        schemas.put("DiscountPercent", DiscountPercent.class);
        schemas.put("DiscountFixed", DiscountFixed.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Discount.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * DiscountAmount, DiscountFixed, DiscountPercent, DiscountUnit, DiscountUnitMultiple
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof DiscountAmount) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DiscountUnit) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DiscountUnitMultiple) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DiscountPercent) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof DiscountFixed) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be DiscountAmount, DiscountFixed, DiscountPercent, DiscountUnit, DiscountUnitMultiple");
    }

    /**
     * Get the actual instance, which can be the following:
     * DiscountAmount, DiscountFixed, DiscountPercent, DiscountUnit, DiscountUnitMultiple
     *
     * @return The actual instance (DiscountAmount, DiscountFixed, DiscountPercent, DiscountUnit, DiscountUnitMultiple)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `DiscountAmount`. If the actual instance is not `DiscountAmount`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DiscountAmount`
     * @throws ClassCastException if the instance is not `DiscountAmount`
     */
    public DiscountAmount getDiscountAmount() throws ClassCastException {
        return (DiscountAmount)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DiscountUnit`. If the actual instance is not `DiscountUnit`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DiscountUnit`
     * @throws ClassCastException if the instance is not `DiscountUnit`
     */
    public DiscountUnit getDiscountUnit() throws ClassCastException {
        return (DiscountUnit)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DiscountUnitMultiple`. If the actual instance is not `DiscountUnitMultiple`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DiscountUnitMultiple`
     * @throws ClassCastException if the instance is not `DiscountUnitMultiple`
     */
    public DiscountUnitMultiple getDiscountUnitMultiple() throws ClassCastException {
        return (DiscountUnitMultiple)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DiscountPercent`. If the actual instance is not `DiscountPercent`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DiscountPercent`
     * @throws ClassCastException if the instance is not `DiscountPercent`
     */
    public DiscountPercent getDiscountPercent() throws ClassCastException {
        return (DiscountPercent)super.getActualInstance();
    }
    /**
     * Get the actual instance of `DiscountFixed`. If the actual instance is not `DiscountFixed`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `DiscountFixed`
     * @throws ClassCastException if the instance is not `DiscountFixed`
     */
    public DiscountFixed getDiscountFixed() throws ClassCastException {
        return (DiscountFixed)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Discount
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with DiscountAmount
    try {
      DiscountAmount.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DiscountAmount failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DiscountUnit
    try {
      DiscountUnit.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DiscountUnit failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DiscountUnitMultiple
    try {
      DiscountUnitMultiple.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DiscountUnitMultiple failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DiscountPercent
    try {
      DiscountPercent.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DiscountPercent failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with DiscountFixed
    try {
      DiscountFixed.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for DiscountFixed failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for Discount with oneOf schemas: DiscountAmount, DiscountFixed, DiscountPercent, DiscountUnit, DiscountUnitMultiple. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of Discount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Discount
  * @throws IOException if the JSON string is invalid with respect to Discount
  */
  public static Discount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Discount.class);
  }

 /**
  * Convert an instance of Discount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

