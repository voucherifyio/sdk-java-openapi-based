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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CampaignBaseValidityTimeframe;
import org.openapitools.client.model.CampaignsUpdateDiscountCouponsCampaign;
import org.openapitools.client.model.CampaignsUpdateGiftCampaign;
import org.openapitools.client.model.CampaignsUpdateGiveawayCampaign;
import org.openapitools.client.model.CampaignsUpdateLoyaltyCampaign;
import org.openapitools.client.model.CampaignsUpdatePromotionCampaign;
import org.openapitools.client.model.CampaignsUpdateReferralCampaign;
import org.openapitools.client.model.Discount;
import org.openapitools.client.model.Gift;
import org.openapitools.client.model.LoyaltyTiersExpirationAll;
import org.openapitools.client.model.PropertiesForLoyaltyCampaignOptions;
import org.openapitools.client.model.ReferralProgram;
import org.openapitools.jackson.nullable.JsonNullable;



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
public class CampaignsUpdateRequestBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CampaignsUpdateRequestBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CampaignsUpdateRequestBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CampaignsUpdateRequestBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CampaignsUpdateDiscountCouponsCampaign> adapterCampaignsUpdateDiscountCouponsCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdateDiscountCouponsCampaign.class));
            final TypeAdapter<CampaignsUpdateReferralCampaign> adapterCampaignsUpdateReferralCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdateReferralCampaign.class));
            final TypeAdapter<CampaignsUpdateGiftCampaign> adapterCampaignsUpdateGiftCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdateGiftCampaign.class));
            final TypeAdapter<CampaignsUpdateLoyaltyCampaign> adapterCampaignsUpdateLoyaltyCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdateLoyaltyCampaign.class));
            final TypeAdapter<CampaignsUpdatePromotionCampaign> adapterCampaignsUpdatePromotionCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdatePromotionCampaign.class));
            final TypeAdapter<CampaignsUpdateGiveawayCampaign> adapterCampaignsUpdateGiveawayCampaign = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdateGiveawayCampaign.class));

            return (TypeAdapter<T>) new TypeAdapter<CampaignsUpdateRequestBody>() {
                @Override
                public void write(JsonWriter out, CampaignsUpdateRequestBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CampaignsUpdateDiscountCouponsCampaign`
                    if (value.getActualInstance() instanceof CampaignsUpdateDiscountCouponsCampaign) {
                      JsonElement element = adapterCampaignsUpdateDiscountCouponsCampaign.toJsonTree((CampaignsUpdateDiscountCouponsCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsUpdateReferralCampaign`
                    if (value.getActualInstance() instanceof CampaignsUpdateReferralCampaign) {
                      JsonElement element = adapterCampaignsUpdateReferralCampaign.toJsonTree((CampaignsUpdateReferralCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsUpdateGiftCampaign`
                    if (value.getActualInstance() instanceof CampaignsUpdateGiftCampaign) {
                      JsonElement element = adapterCampaignsUpdateGiftCampaign.toJsonTree((CampaignsUpdateGiftCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsUpdateLoyaltyCampaign`
                    if (value.getActualInstance() instanceof CampaignsUpdateLoyaltyCampaign) {
                      JsonElement element = adapterCampaignsUpdateLoyaltyCampaign.toJsonTree((CampaignsUpdateLoyaltyCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsUpdatePromotionCampaign`
                    if (value.getActualInstance() instanceof CampaignsUpdatePromotionCampaign) {
                      JsonElement element = adapterCampaignsUpdatePromotionCampaign.toJsonTree((CampaignsUpdatePromotionCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsUpdateGiveawayCampaign`
                    if (value.getActualInstance() instanceof CampaignsUpdateGiveawayCampaign) {
                      JsonElement element = adapterCampaignsUpdateGiveawayCampaign.toJsonTree((CampaignsUpdateGiveawayCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CampaignsUpdateDiscountCouponsCampaign, CampaignsUpdateGiftCampaign, CampaignsUpdateGiveawayCampaign, CampaignsUpdateLoyaltyCampaign, CampaignsUpdatePromotionCampaign, CampaignsUpdateReferralCampaign");
                }

                @Override
                public CampaignsUpdateRequestBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CampaignsUpdateDiscountCouponsCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsUpdateDiscountCouponsCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsUpdateDiscountCouponsCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsUpdateDiscountCouponsCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsUpdateDiscountCouponsCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsUpdateDiscountCouponsCampaign'", e);
                    }
                    // deserialize CampaignsUpdateReferralCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsUpdateReferralCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsUpdateReferralCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsUpdateReferralCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsUpdateReferralCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsUpdateReferralCampaign'", e);
                    }
                    // deserialize CampaignsUpdateGiftCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsUpdateGiftCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsUpdateGiftCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsUpdateGiftCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsUpdateGiftCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsUpdateGiftCampaign'", e);
                    }
                    // deserialize CampaignsUpdateLoyaltyCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsUpdateLoyaltyCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsUpdateLoyaltyCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsUpdateLoyaltyCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsUpdateLoyaltyCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsUpdateLoyaltyCampaign'", e);
                    }
                    // deserialize CampaignsUpdatePromotionCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsUpdatePromotionCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsUpdatePromotionCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsUpdatePromotionCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsUpdatePromotionCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsUpdatePromotionCampaign'", e);
                    }
                    // deserialize CampaignsUpdateGiveawayCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsUpdateGiveawayCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsUpdateGiveawayCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsUpdateGiveawayCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsUpdateGiveawayCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsUpdateGiveawayCampaign'", e);
                    }

                    if (match == 1) {
                        CampaignsUpdateRequestBody ret = new CampaignsUpdateRequestBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CampaignsUpdateRequestBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CampaignsUpdateRequestBody() {
        super("oneOf", Boolean.FALSE);
    }

    public CampaignsUpdateRequestBody(CampaignsUpdateDiscountCouponsCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsUpdateRequestBody(CampaignsUpdateGiftCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsUpdateRequestBody(CampaignsUpdateGiveawayCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsUpdateRequestBody(CampaignsUpdateLoyaltyCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsUpdateRequestBody(CampaignsUpdatePromotionCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsUpdateRequestBody(CampaignsUpdateReferralCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CampaignsUpdateDiscountCouponsCampaign", CampaignsUpdateDiscountCouponsCampaign.class);
        schemas.put("CampaignsUpdateReferralCampaign", CampaignsUpdateReferralCampaign.class);
        schemas.put("CampaignsUpdateGiftCampaign", CampaignsUpdateGiftCampaign.class);
        schemas.put("CampaignsUpdateLoyaltyCampaign", CampaignsUpdateLoyaltyCampaign.class);
        schemas.put("CampaignsUpdatePromotionCampaign", CampaignsUpdatePromotionCampaign.class);
        schemas.put("CampaignsUpdateGiveawayCampaign", CampaignsUpdateGiveawayCampaign.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CampaignsUpdateRequestBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CampaignsUpdateDiscountCouponsCampaign, CampaignsUpdateGiftCampaign, CampaignsUpdateGiveawayCampaign, CampaignsUpdateLoyaltyCampaign, CampaignsUpdatePromotionCampaign, CampaignsUpdateReferralCampaign
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CampaignsUpdateDiscountCouponsCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsUpdateReferralCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsUpdateGiftCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsUpdateLoyaltyCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsUpdatePromotionCampaign) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsUpdateGiveawayCampaign) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CampaignsUpdateDiscountCouponsCampaign, CampaignsUpdateGiftCampaign, CampaignsUpdateGiveawayCampaign, CampaignsUpdateLoyaltyCampaign, CampaignsUpdatePromotionCampaign, CampaignsUpdateReferralCampaign");
    }

    /**
     * Get the actual instance, which can be the following:
     * CampaignsUpdateDiscountCouponsCampaign, CampaignsUpdateGiftCampaign, CampaignsUpdateGiveawayCampaign, CampaignsUpdateLoyaltyCampaign, CampaignsUpdatePromotionCampaign, CampaignsUpdateReferralCampaign
     *
     * @return The actual instance (CampaignsUpdateDiscountCouponsCampaign, CampaignsUpdateGiftCampaign, CampaignsUpdateGiveawayCampaign, CampaignsUpdateLoyaltyCampaign, CampaignsUpdatePromotionCampaign, CampaignsUpdateReferralCampaign)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CampaignsUpdateDiscountCouponsCampaign`. If the actual instance is not `CampaignsUpdateDiscountCouponsCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsUpdateDiscountCouponsCampaign`
     * @throws ClassCastException if the instance is not `CampaignsUpdateDiscountCouponsCampaign`
     */
    public CampaignsUpdateDiscountCouponsCampaign getCampaignsUpdateDiscountCouponsCampaign() throws ClassCastException {
        return (CampaignsUpdateDiscountCouponsCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsUpdateReferralCampaign`. If the actual instance is not `CampaignsUpdateReferralCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsUpdateReferralCampaign`
     * @throws ClassCastException if the instance is not `CampaignsUpdateReferralCampaign`
     */
    public CampaignsUpdateReferralCampaign getCampaignsUpdateReferralCampaign() throws ClassCastException {
        return (CampaignsUpdateReferralCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsUpdateGiftCampaign`. If the actual instance is not `CampaignsUpdateGiftCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsUpdateGiftCampaign`
     * @throws ClassCastException if the instance is not `CampaignsUpdateGiftCampaign`
     */
    public CampaignsUpdateGiftCampaign getCampaignsUpdateGiftCampaign() throws ClassCastException {
        return (CampaignsUpdateGiftCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsUpdateLoyaltyCampaign`. If the actual instance is not `CampaignsUpdateLoyaltyCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsUpdateLoyaltyCampaign`
     * @throws ClassCastException if the instance is not `CampaignsUpdateLoyaltyCampaign`
     */
    public CampaignsUpdateLoyaltyCampaign getCampaignsUpdateLoyaltyCampaign() throws ClassCastException {
        return (CampaignsUpdateLoyaltyCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsUpdatePromotionCampaign`. If the actual instance is not `CampaignsUpdatePromotionCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsUpdatePromotionCampaign`
     * @throws ClassCastException if the instance is not `CampaignsUpdatePromotionCampaign`
     */
    public CampaignsUpdatePromotionCampaign getCampaignsUpdatePromotionCampaign() throws ClassCastException {
        return (CampaignsUpdatePromotionCampaign)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsUpdateGiveawayCampaign`. If the actual instance is not `CampaignsUpdateGiveawayCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsUpdateGiveawayCampaign`
     * @throws ClassCastException if the instance is not `CampaignsUpdateGiveawayCampaign`
     */
    public CampaignsUpdateGiveawayCampaign getCampaignsUpdateGiveawayCampaign() throws ClassCastException {
        return (CampaignsUpdateGiveawayCampaign)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsUpdateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CampaignsUpdateDiscountCouponsCampaign
    try {
      CampaignsUpdateDiscountCouponsCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsUpdateDiscountCouponsCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsUpdateReferralCampaign
    try {
      CampaignsUpdateReferralCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsUpdateReferralCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsUpdateGiftCampaign
    try {
      CampaignsUpdateGiftCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsUpdateGiftCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsUpdateLoyaltyCampaign
    try {
      CampaignsUpdateLoyaltyCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsUpdateLoyaltyCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsUpdatePromotionCampaign
    try {
      CampaignsUpdatePromotionCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsUpdatePromotionCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsUpdateGiveawayCampaign
    try {
      CampaignsUpdateGiveawayCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsUpdateGiveawayCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CampaignsUpdateRequestBody with oneOf schemas: CampaignsUpdateDiscountCouponsCampaign, CampaignsUpdateGiftCampaign, CampaignsUpdateGiveawayCampaign, CampaignsUpdateLoyaltyCampaign, CampaignsUpdatePromotionCampaign, CampaignsUpdateReferralCampaign. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of CampaignsUpdateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsUpdateRequestBody
  * @throws IOException if the JSON string is invalid with respect to CampaignsUpdateRequestBody
  */
  public static CampaignsUpdateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsUpdateRequestBody.class);
  }

 /**
  * Convert an instance of CampaignsUpdateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

