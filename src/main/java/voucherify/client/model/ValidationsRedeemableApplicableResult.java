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
import voucherify.client.model.RedeemableResultGiftCard;
import voucherify.client.model.RedeemableResultGiftCardGift;
import voucherify.client.model.RedeemableResultLoyaltyCard;
import voucherify.client.model.RedeemableResultLoyaltyCardLoyaltyCard;
import voucherify.client.model.RedeemableResultPromotionStack;
import voucherify.client.model.RedeemableResultPromotionTier;
import voucherify.client.model.RedeemableResultPromotionTierDiscount;
import voucherify.client.model.RedeemableResultVoucherCode;



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
public class ValidationsRedeemableApplicableResult extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ValidationsRedeemableApplicableResult.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ValidationsRedeemableApplicableResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ValidationsRedeemableApplicableResult' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RedeemableResultVoucherCode> adapterRedeemableResultVoucherCode = gson.getDelegateAdapter(this, TypeToken.get(RedeemableResultVoucherCode.class));
            final TypeAdapter<RedeemableResultGiftCard> adapterRedeemableResultGiftCard = gson.getDelegateAdapter(this, TypeToken.get(RedeemableResultGiftCard.class));
            final TypeAdapter<RedeemableResultLoyaltyCard> adapterRedeemableResultLoyaltyCard = gson.getDelegateAdapter(this, TypeToken.get(RedeemableResultLoyaltyCard.class));
            final TypeAdapter<RedeemableResultPromotionTier> adapterRedeemableResultPromotionTier = gson.getDelegateAdapter(this, TypeToken.get(RedeemableResultPromotionTier.class));
            final TypeAdapter<RedeemableResultPromotionStack> adapterRedeemableResultPromotionStack = gson.getDelegateAdapter(this, TypeToken.get(RedeemableResultPromotionStack.class));

            return (TypeAdapter<T>) new TypeAdapter<ValidationsRedeemableApplicableResult>() {
                @Override
                public void write(JsonWriter out, ValidationsRedeemableApplicableResult value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RedeemableResultVoucherCode`
                    if (value.getActualInstance() instanceof RedeemableResultVoucherCode) {
                      JsonElement element = adapterRedeemableResultVoucherCode.toJsonTree((RedeemableResultVoucherCode)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RedeemableResultGiftCard`
                    if (value.getActualInstance() instanceof RedeemableResultGiftCard) {
                      JsonElement element = adapterRedeemableResultGiftCard.toJsonTree((RedeemableResultGiftCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RedeemableResultLoyaltyCard`
                    if (value.getActualInstance() instanceof RedeemableResultLoyaltyCard) {
                      JsonElement element = adapterRedeemableResultLoyaltyCard.toJsonTree((RedeemableResultLoyaltyCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RedeemableResultPromotionTier`
                    if (value.getActualInstance() instanceof RedeemableResultPromotionTier) {
                      JsonElement element = adapterRedeemableResultPromotionTier.toJsonTree((RedeemableResultPromotionTier)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RedeemableResultPromotionStack`
                    if (value.getActualInstance() instanceof RedeemableResultPromotionStack) {
                      JsonElement element = adapterRedeemableResultPromotionStack.toJsonTree((RedeemableResultPromotionStack)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RedeemableResultGiftCard, RedeemableResultLoyaltyCard, RedeemableResultPromotionStack, RedeemableResultPromotionTier, RedeemableResultVoucherCode");
                }

                @Override
                public ValidationsRedeemableApplicableResult read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RedeemableResultVoucherCode
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RedeemableResultVoucherCode.validateJsonElement(jsonElement);
                      actualAdapter = adapterRedeemableResultVoucherCode;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RedeemableResultVoucherCode'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RedeemableResultVoucherCode failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RedeemableResultVoucherCode'", e);
                    }
                    // deserialize RedeemableResultGiftCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RedeemableResultGiftCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterRedeemableResultGiftCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RedeemableResultGiftCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RedeemableResultGiftCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RedeemableResultGiftCard'", e);
                    }
                    // deserialize RedeemableResultLoyaltyCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RedeemableResultLoyaltyCard.validateJsonElement(jsonElement);
                      actualAdapter = adapterRedeemableResultLoyaltyCard;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RedeemableResultLoyaltyCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RedeemableResultLoyaltyCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RedeemableResultLoyaltyCard'", e);
                    }
                    // deserialize RedeemableResultPromotionTier
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RedeemableResultPromotionTier.validateJsonElement(jsonElement);
                      actualAdapter = adapterRedeemableResultPromotionTier;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RedeemableResultPromotionTier'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RedeemableResultPromotionTier failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RedeemableResultPromotionTier'", e);
                    }
                    // deserialize RedeemableResultPromotionStack
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RedeemableResultPromotionStack.validateJsonElement(jsonElement);
                      actualAdapter = adapterRedeemableResultPromotionStack;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RedeemableResultPromotionStack'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RedeemableResultPromotionStack failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RedeemableResultPromotionStack'", e);
                    }

                    if (match == 1) {
                        ValidationsRedeemableApplicableResult ret = new ValidationsRedeemableApplicableResult();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ValidationsRedeemableApplicableResult: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ValidationsRedeemableApplicableResult() {
        super("oneOf", Boolean.FALSE);
    }

    public ValidationsRedeemableApplicableResult(RedeemableResultGiftCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ValidationsRedeemableApplicableResult(RedeemableResultLoyaltyCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ValidationsRedeemableApplicableResult(RedeemableResultPromotionStack o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ValidationsRedeemableApplicableResult(RedeemableResultPromotionTier o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ValidationsRedeemableApplicableResult(RedeemableResultVoucherCode o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RedeemableResultVoucherCode", RedeemableResultVoucherCode.class);
        schemas.put("RedeemableResultGiftCard", RedeemableResultGiftCard.class);
        schemas.put("RedeemableResultLoyaltyCard", RedeemableResultLoyaltyCard.class);
        schemas.put("RedeemableResultPromotionTier", RedeemableResultPromotionTier.class);
        schemas.put("RedeemableResultPromotionStack", RedeemableResultPromotionStack.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ValidationsRedeemableApplicableResult.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RedeemableResultGiftCard, RedeemableResultLoyaltyCard, RedeemableResultPromotionStack, RedeemableResultPromotionTier, RedeemableResultVoucherCode
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RedeemableResultVoucherCode) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RedeemableResultGiftCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RedeemableResultLoyaltyCard) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RedeemableResultPromotionTier) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RedeemableResultPromotionStack) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RedeemableResultGiftCard, RedeemableResultLoyaltyCard, RedeemableResultPromotionStack, RedeemableResultPromotionTier, RedeemableResultVoucherCode");
    }

    /**
     * Get the actual instance, which can be the following:
     * RedeemableResultGiftCard, RedeemableResultLoyaltyCard, RedeemableResultPromotionStack, RedeemableResultPromotionTier, RedeemableResultVoucherCode
     *
     * @return The actual instance (RedeemableResultGiftCard, RedeemableResultLoyaltyCard, RedeemableResultPromotionStack, RedeemableResultPromotionTier, RedeemableResultVoucherCode)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RedeemableResultVoucherCode`. If the actual instance is not `RedeemableResultVoucherCode`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RedeemableResultVoucherCode`
     * @throws ClassCastException if the instance is not `RedeemableResultVoucherCode`
     */
    public RedeemableResultVoucherCode getRedeemableResultVoucherCode() throws ClassCastException {
        return (RedeemableResultVoucherCode)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RedeemableResultGiftCard`. If the actual instance is not `RedeemableResultGiftCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RedeemableResultGiftCard`
     * @throws ClassCastException if the instance is not `RedeemableResultGiftCard`
     */
    public RedeemableResultGiftCard getRedeemableResultGiftCard() throws ClassCastException {
        return (RedeemableResultGiftCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RedeemableResultLoyaltyCard`. If the actual instance is not `RedeemableResultLoyaltyCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RedeemableResultLoyaltyCard`
     * @throws ClassCastException if the instance is not `RedeemableResultLoyaltyCard`
     */
    public RedeemableResultLoyaltyCard getRedeemableResultLoyaltyCard() throws ClassCastException {
        return (RedeemableResultLoyaltyCard)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RedeemableResultPromotionTier`. If the actual instance is not `RedeemableResultPromotionTier`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RedeemableResultPromotionTier`
     * @throws ClassCastException if the instance is not `RedeemableResultPromotionTier`
     */
    public RedeemableResultPromotionTier getRedeemableResultPromotionTier() throws ClassCastException {
        return (RedeemableResultPromotionTier)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RedeemableResultPromotionStack`. If the actual instance is not `RedeemableResultPromotionStack`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RedeemableResultPromotionStack`
     * @throws ClassCastException if the instance is not `RedeemableResultPromotionStack`
     */
    public RedeemableResultPromotionStack getRedeemableResultPromotionStack() throws ClassCastException {
        return (RedeemableResultPromotionStack)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValidationsRedeemableApplicableResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with RedeemableResultVoucherCode
    try {
      RedeemableResultVoucherCode.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RedeemableResultVoucherCode failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RedeemableResultGiftCard
    try {
      RedeemableResultGiftCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RedeemableResultGiftCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RedeemableResultLoyaltyCard
    try {
      RedeemableResultLoyaltyCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RedeemableResultLoyaltyCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RedeemableResultPromotionTier
    try {
      RedeemableResultPromotionTier.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RedeemableResultPromotionTier failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RedeemableResultPromotionStack
    try {
      RedeemableResultPromotionStack.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RedeemableResultPromotionStack failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ValidationsRedeemableApplicableResult with oneOf schemas: RedeemableResultGiftCard, RedeemableResultLoyaltyCard, RedeemableResultPromotionStack, RedeemableResultPromotionTier, RedeemableResultVoucherCode. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ValidationsRedeemableApplicableResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationsRedeemableApplicableResult
  * @throws IOException if the JSON string is invalid with respect to ValidationsRedeemableApplicableResult
  */
  public static ValidationsRedeemableApplicableResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationsRedeemableApplicableResult.class);
  }

 /**
  * Convert an instance of ValidationsRedeemableApplicableResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
