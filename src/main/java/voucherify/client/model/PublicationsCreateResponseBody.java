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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.CustomerWithSummaryLoyaltyReferrals;
import voucherify.client.model.PublicationsCreateVoucherResponseBody;
import voucherify.client.model.PublicationsCreateVouchersResponseBody;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PublicationsCreateResponseBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PublicationsCreateResponseBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PublicationsCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PublicationsCreateResponseBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PublicationsCreateVoucherResponseBody> adapterPublicationsCreateVoucherResponseBody = gson.getDelegateAdapter(this, TypeToken.get(PublicationsCreateVoucherResponseBody.class));
            final TypeAdapter<PublicationsCreateVouchersResponseBody> adapterPublicationsCreateVouchersResponseBody = gson.getDelegateAdapter(this, TypeToken.get(PublicationsCreateVouchersResponseBody.class));

            return (TypeAdapter<T>) new TypeAdapter<PublicationsCreateResponseBody>() {
                @Override
                public void write(JsonWriter out, PublicationsCreateResponseBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PublicationsCreateVoucherResponseBody`
                    if (value.getActualInstance() instanceof PublicationsCreateVoucherResponseBody) {
                      JsonElement element = adapterPublicationsCreateVoucherResponseBody.toJsonTree((PublicationsCreateVoucherResponseBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PublicationsCreateVouchersResponseBody`
                    if (value.getActualInstance() instanceof PublicationsCreateVouchersResponseBody) {
                      JsonElement element = adapterPublicationsCreateVouchersResponseBody.toJsonTree((PublicationsCreateVouchersResponseBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PublicationsCreateVoucherResponseBody, PublicationsCreateVouchersResponseBody");
                }

                @Override
                public PublicationsCreateResponseBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PublicationsCreateVoucherResponseBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PublicationsCreateVoucherResponseBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterPublicationsCreateVoucherResponseBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PublicationsCreateVoucherResponseBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PublicationsCreateVoucherResponseBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PublicationsCreateVoucherResponseBody'", e);
                    }
                    // deserialize PublicationsCreateVouchersResponseBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PublicationsCreateVouchersResponseBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterPublicationsCreateVouchersResponseBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PublicationsCreateVouchersResponseBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PublicationsCreateVouchersResponseBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PublicationsCreateVouchersResponseBody'", e);
                    }

                    if (match == 1) {
                        PublicationsCreateResponseBody ret = new PublicationsCreateResponseBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PublicationsCreateResponseBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public PublicationsCreateResponseBody() {
        super("oneOf", Boolean.FALSE);
    }

    public PublicationsCreateResponseBody(PublicationsCreateVoucherResponseBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PublicationsCreateResponseBody(PublicationsCreateVouchersResponseBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PublicationsCreateVoucherResponseBody", PublicationsCreateVoucherResponseBody.class);
        schemas.put("PublicationsCreateVouchersResponseBody", PublicationsCreateVouchersResponseBody.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return PublicationsCreateResponseBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PublicationsCreateVoucherResponseBody, PublicationsCreateVouchersResponseBody
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PublicationsCreateVoucherResponseBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PublicationsCreateVouchersResponseBody) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PublicationsCreateVoucherResponseBody, PublicationsCreateVouchersResponseBody");
    }

    /**
     * Get the actual instance, which can be the following:
     * PublicationsCreateVoucherResponseBody, PublicationsCreateVouchersResponseBody
     *
     * @return The actual instance (PublicationsCreateVoucherResponseBody, PublicationsCreateVouchersResponseBody)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PublicationsCreateVoucherResponseBody`. If the actual instance is not `PublicationsCreateVoucherResponseBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PublicationsCreateVoucherResponseBody`
     * @throws ClassCastException if the instance is not `PublicationsCreateVoucherResponseBody`
     */
    public PublicationsCreateVoucherResponseBody getPublicationsCreateVoucherResponseBody() throws ClassCastException {
        return (PublicationsCreateVoucherResponseBody)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PublicationsCreateVouchersResponseBody`. If the actual instance is not `PublicationsCreateVouchersResponseBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PublicationsCreateVouchersResponseBody`
     * @throws ClassCastException if the instance is not `PublicationsCreateVouchersResponseBody`
     */
    public PublicationsCreateVouchersResponseBody getPublicationsCreateVouchersResponseBody() throws ClassCastException {
        return (PublicationsCreateVouchersResponseBody)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PublicationsCreateResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with PublicationsCreateVoucherResponseBody
    try {
      PublicationsCreateVoucherResponseBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PublicationsCreateVoucherResponseBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PublicationsCreateVouchersResponseBody
    try {
      PublicationsCreateVouchersResponseBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PublicationsCreateVouchersResponseBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for PublicationsCreateResponseBody with oneOf schemas: PublicationsCreateVoucherResponseBody, PublicationsCreateVouchersResponseBody. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of PublicationsCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicationsCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to PublicationsCreateResponseBody
  */
  public static PublicationsCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicationsCreateResponseBody.class);
  }

 /**
  * Convert an instance of PublicationsCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

