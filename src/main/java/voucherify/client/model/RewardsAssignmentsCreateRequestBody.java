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
import voucherify.client.model.RewardAssignmentsCreateCoinRewardRequestBody;
import voucherify.client.model.RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody;
import voucherify.client.model.RewardAssignmentsCreateDigitalOrMaterialRewardRequestBodyParameters;



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

public class RewardsAssignmentsCreateRequestBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RewardsAssignmentsCreateRequestBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RewardsAssignmentsCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RewardsAssignmentsCreateRequestBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody> adapterRewardAssignmentsCreateDigitalOrMaterialRewardRequestBody = gson.getDelegateAdapter(this, TypeToken.get(RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody.class));
            final TypeAdapter<RewardAssignmentsCreateCoinRewardRequestBody> adapterRewardAssignmentsCreateCoinRewardRequestBody = gson.getDelegateAdapter(this, TypeToken.get(RewardAssignmentsCreateCoinRewardRequestBody.class));

            return (TypeAdapter<T>) new TypeAdapter<RewardsAssignmentsCreateRequestBody>() {
                @Override
                public void write(JsonWriter out, RewardsAssignmentsCreateRequestBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody`
                    if (value.getActualInstance() instanceof RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody) {
                      JsonElement element = adapterRewardAssignmentsCreateDigitalOrMaterialRewardRequestBody.toJsonTree((RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RewardAssignmentsCreateCoinRewardRequestBody`
                    if (value.getActualInstance() instanceof RewardAssignmentsCreateCoinRewardRequestBody) {
                      JsonElement element = adapterRewardAssignmentsCreateCoinRewardRequestBody.toJsonTree((RewardAssignmentsCreateCoinRewardRequestBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RewardAssignmentsCreateCoinRewardRequestBody, RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody");
                }

                @Override
                public RewardsAssignmentsCreateRequestBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterRewardAssignmentsCreateDigitalOrMaterialRewardRequestBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody'", e);
                    }
                    // deserialize RewardAssignmentsCreateCoinRewardRequestBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RewardAssignmentsCreateCoinRewardRequestBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterRewardAssignmentsCreateCoinRewardRequestBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RewardAssignmentsCreateCoinRewardRequestBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RewardAssignmentsCreateCoinRewardRequestBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RewardAssignmentsCreateCoinRewardRequestBody'", e);
                    }

                    if (match == 1) {
                        RewardsAssignmentsCreateRequestBody ret = new RewardsAssignmentsCreateRequestBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RewardsAssignmentsCreateRequestBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RewardsAssignmentsCreateRequestBody() {
        super("oneOf", Boolean.FALSE);
    }

    public RewardsAssignmentsCreateRequestBody(RewardAssignmentsCreateCoinRewardRequestBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RewardsAssignmentsCreateRequestBody(RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody", RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody.class);
        schemas.put("RewardAssignmentsCreateCoinRewardRequestBody", RewardAssignmentsCreateCoinRewardRequestBody.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RewardsAssignmentsCreateRequestBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RewardAssignmentsCreateCoinRewardRequestBody, RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RewardAssignmentsCreateCoinRewardRequestBody) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RewardAssignmentsCreateCoinRewardRequestBody, RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody");
    }

    /**
     * Get the actual instance, which can be the following:
     * RewardAssignmentsCreateCoinRewardRequestBody, RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody
     *
     * @return The actual instance (RewardAssignmentsCreateCoinRewardRequestBody, RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody`. If the actual instance is not `RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody`
     * @throws ClassCastException if the instance is not `RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody`
     */
    public RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody getRewardAssignmentsCreateDigitalOrMaterialRewardRequestBody() throws ClassCastException {
        return (RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RewardAssignmentsCreateCoinRewardRequestBody`. If the actual instance is not `RewardAssignmentsCreateCoinRewardRequestBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RewardAssignmentsCreateCoinRewardRequestBody`
     * @throws ClassCastException if the instance is not `RewardAssignmentsCreateCoinRewardRequestBody`
     */
    public RewardAssignmentsCreateCoinRewardRequestBody getRewardAssignmentsCreateCoinRewardRequestBody() throws ClassCastException {
        return (RewardAssignmentsCreateCoinRewardRequestBody)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RewardsAssignmentsCreateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody
    try {
      RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RewardAssignmentsCreateCoinRewardRequestBody
    try {
      RewardAssignmentsCreateCoinRewardRequestBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RewardAssignmentsCreateCoinRewardRequestBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RewardsAssignmentsCreateRequestBody with oneOf schemas: RewardAssignmentsCreateCoinRewardRequestBody, RewardAssignmentsCreateDigitalOrMaterialRewardRequestBody. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of RewardsAssignmentsCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RewardsAssignmentsCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to RewardsAssignmentsCreateRequestBody
  */
  public static RewardsAssignmentsCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RewardsAssignmentsCreateRequestBody.class);
  }

 /**
  * Convert an instance of RewardsAssignmentsCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

