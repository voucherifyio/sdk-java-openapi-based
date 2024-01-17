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
import voucherify.client.model.OrderCalculatedNoCustomerData;
import voucherify.client.model.PromotionTier;
import voucherify.client.model.Redemption;
import voucherify.client.model.RedemptionChannel;
import voucherify.client.model.RedemptionGift;
import voucherify.client.model.RedemptionLoyaltyCard;
import voucherify.client.model.RedemptionRewardResult;
import voucherify.client.model.RedemptionRollback;
import voucherify.client.model.RedemptionRollbackRelatedRedemptions;
import voucherify.client.model.SimpleCustomer;
import voucherify.client.model.Voucher;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class RedemptionsGetResponseBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RedemptionsGetResponseBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RedemptionsGetResponseBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RedemptionsGetResponseBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Redemption> adapterRedemption = gson.getDelegateAdapter(this, TypeToken.get(Redemption.class));
            final TypeAdapter<RedemptionRollback> adapterRedemptionRollback = gson.getDelegateAdapter(this, TypeToken.get(RedemptionRollback.class));

            return (TypeAdapter<T>) new TypeAdapter<RedemptionsGetResponseBody>() {
                @Override
                public void write(JsonWriter out, RedemptionsGetResponseBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Redemption`
                    if (value.getActualInstance() instanceof Redemption) {
                      JsonElement element = adapterRedemption.toJsonTree((Redemption)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RedemptionRollback`
                    if (value.getActualInstance() instanceof RedemptionRollback) {
                      JsonElement element = adapterRedemptionRollback.toJsonTree((RedemptionRollback)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Redemption, RedemptionRollback");
                }

                @Override
                public RedemptionsGetResponseBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Redemption
                    try {
                      // validate the JSON object to see if any exception is thrown
                      Redemption.validateJsonElement(jsonElement);
                      actualAdapter = adapterRedemption;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'Redemption'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for Redemption failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'Redemption'", e);
                    }
                    // deserialize RedemptionRollback
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RedemptionRollback.validateJsonElement(jsonElement);
                      actualAdapter = adapterRedemptionRollback;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RedemptionRollback'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RedemptionRollback failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RedemptionRollback'", e);
                    }

                    if (match == 1) {
                        RedemptionsGetResponseBody ret = new RedemptionsGetResponseBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RedemptionsGetResponseBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RedemptionsGetResponseBody() {
        super("oneOf", Boolean.FALSE);
    }

    public RedemptionsGetResponseBody(Redemption o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RedemptionsGetResponseBody(RedemptionRollback o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Redemption", Redemption.class);
        schemas.put("RedemptionRollback", RedemptionRollback.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RedemptionsGetResponseBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Redemption, RedemptionRollback
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Redemption) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RedemptionRollback) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Redemption, RedemptionRollback");
    }

    /**
     * Get the actual instance, which can be the following:
     * Redemption, RedemptionRollback
     *
     * @return The actual instance (Redemption, RedemptionRollback)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Redemption`. If the actual instance is not `Redemption`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Redemption`
     * @throws ClassCastException if the instance is not `Redemption`
     */
    public Redemption getRedemption() throws ClassCastException {
        return (Redemption)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RedemptionRollback`. If the actual instance is not `RedemptionRollback`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RedemptionRollback`
     * @throws ClassCastException if the instance is not `RedemptionRollback`
     */
    public RedemptionRollback getRedemptionRollback() throws ClassCastException {
        return (RedemptionRollback)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedemptionsGetResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with Redemption
    try {
      Redemption.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Redemption failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RedemptionRollback
    try {
      RedemptionRollback.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RedemptionRollback failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RedemptionsGetResponseBody with oneOf schemas: Redemption, RedemptionRollback. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of RedemptionsGetResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsGetResponseBody
  * @throws IOException if the JSON string is invalid with respect to RedemptionsGetResponseBody
  */
  public static RedemptionsGetResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsGetResponseBody.class);
  }

 /**
  * Convert an instance of RedemptionsGetResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

