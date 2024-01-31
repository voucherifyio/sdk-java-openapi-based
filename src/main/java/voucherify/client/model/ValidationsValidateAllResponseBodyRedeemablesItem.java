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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import voucherify.client.model.ApplicableToResultList;
import voucherify.client.model.Category;
import voucherify.client.model.InapplicableToResultList;
import voucherify.client.model.OrderCalculated;
import voucherify.client.model.ValidationsRedeemableApplicable;
import voucherify.client.model.ValidationsRedeemableInapplicable;
import voucherify.client.model.ValidationsRedeemableSkipped;



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

public class ValidationsValidateAllResponseBodyRedeemablesItem extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ValidationsValidateAllResponseBodyRedeemablesItem.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ValidationsValidateAllResponseBodyRedeemablesItem.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ValidationsValidateAllResponseBodyRedeemablesItem' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ValidationsRedeemableApplicable> adapterValidationsRedeemableApplicable = gson.getDelegateAdapter(this, TypeToken.get(ValidationsRedeemableApplicable.class));
            final TypeAdapter<ValidationsRedeemableInapplicable> adapterValidationsRedeemableInapplicable = gson.getDelegateAdapter(this, TypeToken.get(ValidationsRedeemableInapplicable.class));
            final TypeAdapter<ValidationsRedeemableSkipped> adapterValidationsRedeemableSkipped = gson.getDelegateAdapter(this, TypeToken.get(ValidationsRedeemableSkipped.class));

            return (TypeAdapter<T>) new TypeAdapter<ValidationsValidateAllResponseBodyRedeemablesItem>() {
                @Override
                public void write(JsonWriter out, ValidationsValidateAllResponseBodyRedeemablesItem value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ValidationsRedeemableApplicable`
                    if (value.getActualInstance() instanceof ValidationsRedeemableApplicable) {
                      JsonElement element = adapterValidationsRedeemableApplicable.toJsonTree((ValidationsRedeemableApplicable)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ValidationsRedeemableInapplicable`
                    if (value.getActualInstance() instanceof ValidationsRedeemableInapplicable) {
                      JsonElement element = adapterValidationsRedeemableInapplicable.toJsonTree((ValidationsRedeemableInapplicable)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ValidationsRedeemableSkipped`
                    if (value.getActualInstance() instanceof ValidationsRedeemableSkipped) {
                      JsonElement element = adapterValidationsRedeemableSkipped.toJsonTree((ValidationsRedeemableSkipped)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ValidationsRedeemableApplicable, ValidationsRedeemableInapplicable, ValidationsRedeemableSkipped");
                }

                @Override
                public ValidationsValidateAllResponseBodyRedeemablesItem read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ValidationsRedeemableApplicable
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ValidationsRedeemableApplicable.validateJsonElement(jsonElement);
                      actualAdapter = adapterValidationsRedeemableApplicable;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ValidationsRedeemableApplicable'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ValidationsRedeemableApplicable failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ValidationsRedeemableApplicable'", e);
                    }
                    // deserialize ValidationsRedeemableInapplicable
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ValidationsRedeemableInapplicable.validateJsonElement(jsonElement);
                      actualAdapter = adapterValidationsRedeemableInapplicable;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ValidationsRedeemableInapplicable'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ValidationsRedeemableInapplicable failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ValidationsRedeemableInapplicable'", e);
                    }
                    // deserialize ValidationsRedeemableSkipped
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ValidationsRedeemableSkipped.validateJsonElement(jsonElement);
                      actualAdapter = adapterValidationsRedeemableSkipped;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ValidationsRedeemableSkipped'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ValidationsRedeemableSkipped failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ValidationsRedeemableSkipped'", e);
                    }

                    if (match == 1) {
                        ValidationsValidateAllResponseBodyRedeemablesItem ret = new ValidationsValidateAllResponseBodyRedeemablesItem();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ValidationsValidateAllResponseBodyRedeemablesItem: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ValidationsValidateAllResponseBodyRedeemablesItem() {
        super("oneOf", Boolean.FALSE);
    }

    public ValidationsValidateAllResponseBodyRedeemablesItem(ValidationsRedeemableApplicable o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ValidationsValidateAllResponseBodyRedeemablesItem(ValidationsRedeemableInapplicable o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ValidationsValidateAllResponseBodyRedeemablesItem(ValidationsRedeemableSkipped o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ValidationsRedeemableApplicable", ValidationsRedeemableApplicable.class);
        schemas.put("ValidationsRedeemableInapplicable", ValidationsRedeemableInapplicable.class);
        schemas.put("ValidationsRedeemableSkipped", ValidationsRedeemableSkipped.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ValidationsValidateAllResponseBodyRedeemablesItem.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ValidationsRedeemableApplicable, ValidationsRedeemableInapplicable, ValidationsRedeemableSkipped
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ValidationsRedeemableApplicable) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ValidationsRedeemableInapplicable) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ValidationsRedeemableSkipped) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ValidationsRedeemableApplicable, ValidationsRedeemableInapplicable, ValidationsRedeemableSkipped");
    }

    /**
     * Get the actual instance, which can be the following:
     * ValidationsRedeemableApplicable, ValidationsRedeemableInapplicable, ValidationsRedeemableSkipped
     *
     * @return The actual instance (ValidationsRedeemableApplicable, ValidationsRedeemableInapplicable, ValidationsRedeemableSkipped)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ValidationsRedeemableApplicable`. If the actual instance is not `ValidationsRedeemableApplicable`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValidationsRedeemableApplicable`
     * @throws ClassCastException if the instance is not `ValidationsRedeemableApplicable`
     */
    public ValidationsRedeemableApplicable getValidationsRedeemableApplicable() throws ClassCastException {
        return (ValidationsRedeemableApplicable)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ValidationsRedeemableInapplicable`. If the actual instance is not `ValidationsRedeemableInapplicable`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValidationsRedeemableInapplicable`
     * @throws ClassCastException if the instance is not `ValidationsRedeemableInapplicable`
     */
    public ValidationsRedeemableInapplicable getValidationsRedeemableInapplicable() throws ClassCastException {
        return (ValidationsRedeemableInapplicable)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ValidationsRedeemableSkipped`. If the actual instance is not `ValidationsRedeemableSkipped`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValidationsRedeemableSkipped`
     * @throws ClassCastException if the instance is not `ValidationsRedeemableSkipped`
     */
    public ValidationsRedeemableSkipped getValidationsRedeemableSkipped() throws ClassCastException {
        return (ValidationsRedeemableSkipped)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValidationsValidateAllResponseBodyRedeemablesItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ValidationsRedeemableApplicable
    try {
      ValidationsRedeemableApplicable.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ValidationsRedeemableApplicable failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ValidationsRedeemableInapplicable
    try {
      ValidationsRedeemableInapplicable.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ValidationsRedeemableInapplicable failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ValidationsRedeemableSkipped
    try {
      ValidationsRedeemableSkipped.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ValidationsRedeemableSkipped failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ValidationsValidateAllResponseBodyRedeemablesItem with oneOf schemas: ValidationsRedeemableApplicable, ValidationsRedeemableInapplicable, ValidationsRedeemableSkipped. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ValidationsValidateAllResponseBodyRedeemablesItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationsValidateAllResponseBodyRedeemablesItem
  * @throws IOException if the JSON string is invalid with respect to ValidationsValidateAllResponseBodyRedeemablesItem
  */
  public static ValidationsValidateAllResponseBodyRedeemablesItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationsValidateAllResponseBodyRedeemablesItem.class);
  }

 /**
  * Convert an instance of ValidationsValidateAllResponseBodyRedeemablesItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
