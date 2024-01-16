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
import org.openapitools.client.model.CampaignsVouchersCreateInBulkResponseBody;
import org.openapitools.client.model.CampaignsVouchersCreateResponseBody;
import org.openapitools.client.model.Category;
import org.openapitools.client.model.Discount;
import org.openapitools.client.model.SimpleCustomer;
import org.openapitools.client.model.ValidationRulesAssignmentsList;
import org.openapitools.client.model.VoucherAssets;
import org.openapitools.client.model.VoucherGift;
import org.openapitools.client.model.VoucherLoyaltyCard;
import org.openapitools.client.model.VoucherPublish;
import org.openapitools.client.model.VoucherRedemption;
import org.openapitools.client.model.VoucherValidityTimeframe;
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
public class CampaignsVouchersCreateCombinedResponseBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CampaignsVouchersCreateCombinedResponseBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CampaignsVouchersCreateCombinedResponseBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CampaignsVouchersCreateCombinedResponseBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CampaignsVouchersCreateResponseBody> adapterCampaignsVouchersCreateResponseBody = gson.getDelegateAdapter(this, TypeToken.get(CampaignsVouchersCreateResponseBody.class));
            final TypeAdapter<CampaignsVouchersCreateInBulkResponseBody> adapterCampaignsVouchersCreateInBulkResponseBody = gson.getDelegateAdapter(this, TypeToken.get(CampaignsVouchersCreateInBulkResponseBody.class));

            return (TypeAdapter<T>) new TypeAdapter<CampaignsVouchersCreateCombinedResponseBody>() {
                @Override
                public void write(JsonWriter out, CampaignsVouchersCreateCombinedResponseBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CampaignsVouchersCreateResponseBody`
                    if (value.getActualInstance() instanceof CampaignsVouchersCreateResponseBody) {
                      JsonElement element = adapterCampaignsVouchersCreateResponseBody.toJsonTree((CampaignsVouchersCreateResponseBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CampaignsVouchersCreateInBulkResponseBody`
                    if (value.getActualInstance() instanceof CampaignsVouchersCreateInBulkResponseBody) {
                      JsonElement element = adapterCampaignsVouchersCreateInBulkResponseBody.toJsonTree((CampaignsVouchersCreateInBulkResponseBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CampaignsVouchersCreateInBulkResponseBody, CampaignsVouchersCreateResponseBody");
                }

                @Override
                public CampaignsVouchersCreateCombinedResponseBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CampaignsVouchersCreateResponseBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsVouchersCreateResponseBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsVouchersCreateResponseBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsVouchersCreateResponseBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsVouchersCreateResponseBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsVouchersCreateResponseBody'", e);
                    }
                    // deserialize CampaignsVouchersCreateInBulkResponseBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CampaignsVouchersCreateInBulkResponseBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterCampaignsVouchersCreateInBulkResponseBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CampaignsVouchersCreateInBulkResponseBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CampaignsVouchersCreateInBulkResponseBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CampaignsVouchersCreateInBulkResponseBody'", e);
                    }

                    if (match == 1) {
                        CampaignsVouchersCreateCombinedResponseBody ret = new CampaignsVouchersCreateCombinedResponseBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CampaignsVouchersCreateCombinedResponseBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CampaignsVouchersCreateCombinedResponseBody() {
        super("oneOf", Boolean.FALSE);
    }

    public CampaignsVouchersCreateCombinedResponseBody(CampaignsVouchersCreateInBulkResponseBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CampaignsVouchersCreateCombinedResponseBody(CampaignsVouchersCreateResponseBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CampaignsVouchersCreateResponseBody", CampaignsVouchersCreateResponseBody.class);
        schemas.put("CampaignsVouchersCreateInBulkResponseBody", CampaignsVouchersCreateInBulkResponseBody.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CampaignsVouchersCreateCombinedResponseBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CampaignsVouchersCreateInBulkResponseBody, CampaignsVouchersCreateResponseBody
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CampaignsVouchersCreateResponseBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CampaignsVouchersCreateInBulkResponseBody) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CampaignsVouchersCreateInBulkResponseBody, CampaignsVouchersCreateResponseBody");
    }

    /**
     * Get the actual instance, which can be the following:
     * CampaignsVouchersCreateInBulkResponseBody, CampaignsVouchersCreateResponseBody
     *
     * @return The actual instance (CampaignsVouchersCreateInBulkResponseBody, CampaignsVouchersCreateResponseBody)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CampaignsVouchersCreateResponseBody`. If the actual instance is not `CampaignsVouchersCreateResponseBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsVouchersCreateResponseBody`
     * @throws ClassCastException if the instance is not `CampaignsVouchersCreateResponseBody`
     */
    public CampaignsVouchersCreateResponseBody getCampaignsVouchersCreateResponseBody() throws ClassCastException {
        return (CampaignsVouchersCreateResponseBody)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CampaignsVouchersCreateInBulkResponseBody`. If the actual instance is not `CampaignsVouchersCreateInBulkResponseBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CampaignsVouchersCreateInBulkResponseBody`
     * @throws ClassCastException if the instance is not `CampaignsVouchersCreateInBulkResponseBody`
     */
    public CampaignsVouchersCreateInBulkResponseBody getCampaignsVouchersCreateInBulkResponseBody() throws ClassCastException {
        return (CampaignsVouchersCreateInBulkResponseBody)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsVouchersCreateCombinedResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CampaignsVouchersCreateResponseBody
    try {
      CampaignsVouchersCreateResponseBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsVouchersCreateResponseBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CampaignsVouchersCreateInBulkResponseBody
    try {
      CampaignsVouchersCreateInBulkResponseBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CampaignsVouchersCreateInBulkResponseBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CampaignsVouchersCreateCombinedResponseBody with oneOf schemas: CampaignsVouchersCreateInBulkResponseBody, CampaignsVouchersCreateResponseBody. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of CampaignsVouchersCreateCombinedResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsVouchersCreateCombinedResponseBody
  * @throws IOException if the JSON string is invalid with respect to CampaignsVouchersCreateCombinedResponseBody
  */
  public static CampaignsVouchersCreateCombinedResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsVouchersCreateCombinedResponseBody.class);
  }

 /**
  * Convert an instance of CampaignsVouchersCreateCombinedResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

