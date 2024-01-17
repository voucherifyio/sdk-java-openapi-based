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
import voucherify.client.model.ExportCustomerScheduled;
import voucherify.client.model.ExportOrderScheduled;
import voucherify.client.model.ExportPointsExpirationScheduled;
import voucherify.client.model.ExportPublicationScheduled;
import voucherify.client.model.ExportRedemptionScheduled;
import voucherify.client.model.ExportVoucherScheduled;
import voucherify.client.model.ExportVoucherTransactionsScheduled;
import voucherify.client.model.LoyaltiesMembersTransactionsExportCreateRequestBodyParameters;



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
public class ExportsCreateResponseBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ExportsCreateResponseBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ExportsCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ExportsCreateResponseBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExportVoucherScheduled> adapterExportVoucherScheduled = gson.getDelegateAdapter(this, TypeToken.get(ExportVoucherScheduled.class));
            final TypeAdapter<ExportRedemptionScheduled> adapterExportRedemptionScheduled = gson.getDelegateAdapter(this, TypeToken.get(ExportRedemptionScheduled.class));
            final TypeAdapter<ExportCustomerScheduled> adapterExportCustomerScheduled = gson.getDelegateAdapter(this, TypeToken.get(ExportCustomerScheduled.class));
            final TypeAdapter<ExportPublicationScheduled> adapterExportPublicationScheduled = gson.getDelegateAdapter(this, TypeToken.get(ExportPublicationScheduled.class));
            final TypeAdapter<ExportOrderScheduled> adapterExportOrderScheduled = gson.getDelegateAdapter(this, TypeToken.get(ExportOrderScheduled.class));
            final TypeAdapter<ExportPointsExpirationScheduled> adapterExportPointsExpirationScheduled = gson.getDelegateAdapter(this, TypeToken.get(ExportPointsExpirationScheduled.class));
            final TypeAdapter<ExportVoucherTransactionsScheduled> adapterExportVoucherTransactionsScheduled = gson.getDelegateAdapter(this, TypeToken.get(ExportVoucherTransactionsScheduled.class));

            return (TypeAdapter<T>) new TypeAdapter<ExportsCreateResponseBody>() {
                @Override
                public void write(JsonWriter out, ExportsCreateResponseBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ExportVoucherScheduled`
                    if (value.getActualInstance() instanceof ExportVoucherScheduled) {
                      JsonElement element = adapterExportVoucherScheduled.toJsonTree((ExportVoucherScheduled)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ExportRedemptionScheduled`
                    if (value.getActualInstance() instanceof ExportRedemptionScheduled) {
                      JsonElement element = adapterExportRedemptionScheduled.toJsonTree((ExportRedemptionScheduled)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ExportCustomerScheduled`
                    if (value.getActualInstance() instanceof ExportCustomerScheduled) {
                      JsonElement element = adapterExportCustomerScheduled.toJsonTree((ExportCustomerScheduled)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ExportPublicationScheduled`
                    if (value.getActualInstance() instanceof ExportPublicationScheduled) {
                      JsonElement element = adapterExportPublicationScheduled.toJsonTree((ExportPublicationScheduled)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ExportOrderScheduled`
                    if (value.getActualInstance() instanceof ExportOrderScheduled) {
                      JsonElement element = adapterExportOrderScheduled.toJsonTree((ExportOrderScheduled)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ExportPointsExpirationScheduled`
                    if (value.getActualInstance() instanceof ExportPointsExpirationScheduled) {
                      JsonElement element = adapterExportPointsExpirationScheduled.toJsonTree((ExportPointsExpirationScheduled)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `ExportVoucherTransactionsScheduled`
                    if (value.getActualInstance() instanceof ExportVoucherTransactionsScheduled) {
                      JsonElement element = adapterExportVoucherTransactionsScheduled.toJsonTree((ExportVoucherTransactionsScheduled)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ExportCustomerScheduled, ExportOrderScheduled, ExportPointsExpirationScheduled, ExportPublicationScheduled, ExportRedemptionScheduled, ExportVoucherScheduled, ExportVoucherTransactionsScheduled");
                }

                @Override
                public ExportsCreateResponseBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ExportVoucherScheduled
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ExportVoucherScheduled.validateJsonElement(jsonElement);
                      actualAdapter = adapterExportVoucherScheduled;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ExportVoucherScheduled'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ExportVoucherScheduled failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ExportVoucherScheduled'", e);
                    }
                    // deserialize ExportRedemptionScheduled
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ExportRedemptionScheduled.validateJsonElement(jsonElement);
                      actualAdapter = adapterExportRedemptionScheduled;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ExportRedemptionScheduled'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ExportRedemptionScheduled failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ExportRedemptionScheduled'", e);
                    }
                    // deserialize ExportCustomerScheduled
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ExportCustomerScheduled.validateJsonElement(jsonElement);
                      actualAdapter = adapterExportCustomerScheduled;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ExportCustomerScheduled'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ExportCustomerScheduled failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ExportCustomerScheduled'", e);
                    }
                    // deserialize ExportPublicationScheduled
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ExportPublicationScheduled.validateJsonElement(jsonElement);
                      actualAdapter = adapterExportPublicationScheduled;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ExportPublicationScheduled'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ExportPublicationScheduled failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ExportPublicationScheduled'", e);
                    }
                    // deserialize ExportOrderScheduled
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ExportOrderScheduled.validateJsonElement(jsonElement);
                      actualAdapter = adapterExportOrderScheduled;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ExportOrderScheduled'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ExportOrderScheduled failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ExportOrderScheduled'", e);
                    }
                    // deserialize ExportPointsExpirationScheduled
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ExportPointsExpirationScheduled.validateJsonElement(jsonElement);
                      actualAdapter = adapterExportPointsExpirationScheduled;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ExportPointsExpirationScheduled'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ExportPointsExpirationScheduled failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ExportPointsExpirationScheduled'", e);
                    }
                    // deserialize ExportVoucherTransactionsScheduled
                    try {
                      // validate the JSON object to see if any exception is thrown
                      ExportVoucherTransactionsScheduled.validateJsonElement(jsonElement);
                      actualAdapter = adapterExportVoucherTransactionsScheduled;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'ExportVoucherTransactionsScheduled'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for ExportVoucherTransactionsScheduled failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'ExportVoucherTransactionsScheduled'", e);
                    }

                    if (match == 1) {
                        ExportsCreateResponseBody ret = new ExportsCreateResponseBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ExportsCreateResponseBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ExportsCreateResponseBody() {
        super("oneOf", Boolean.FALSE);
    }

    public ExportsCreateResponseBody(ExportCustomerScheduled o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ExportsCreateResponseBody(ExportOrderScheduled o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ExportsCreateResponseBody(ExportPointsExpirationScheduled o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ExportsCreateResponseBody(ExportPublicationScheduled o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ExportsCreateResponseBody(ExportRedemptionScheduled o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ExportsCreateResponseBody(ExportVoucherScheduled o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ExportsCreateResponseBody(ExportVoucherTransactionsScheduled o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ExportVoucherScheduled", ExportVoucherScheduled.class);
        schemas.put("ExportRedemptionScheduled", ExportRedemptionScheduled.class);
        schemas.put("ExportCustomerScheduled", ExportCustomerScheduled.class);
        schemas.put("ExportPublicationScheduled", ExportPublicationScheduled.class);
        schemas.put("ExportOrderScheduled", ExportOrderScheduled.class);
        schemas.put("ExportPointsExpirationScheduled", ExportPointsExpirationScheduled.class);
        schemas.put("ExportVoucherTransactionsScheduled", ExportVoucherTransactionsScheduled.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ExportsCreateResponseBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ExportCustomerScheduled, ExportOrderScheduled, ExportPointsExpirationScheduled, ExportPublicationScheduled, ExportRedemptionScheduled, ExportVoucherScheduled, ExportVoucherTransactionsScheduled
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ExportVoucherScheduled) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ExportRedemptionScheduled) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ExportCustomerScheduled) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ExportPublicationScheduled) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ExportOrderScheduled) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ExportPointsExpirationScheduled) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ExportVoucherTransactionsScheduled) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ExportCustomerScheduled, ExportOrderScheduled, ExportPointsExpirationScheduled, ExportPublicationScheduled, ExportRedemptionScheduled, ExportVoucherScheduled, ExportVoucherTransactionsScheduled");
    }

    /**
     * Get the actual instance, which can be the following:
     * ExportCustomerScheduled, ExportOrderScheduled, ExportPointsExpirationScheduled, ExportPublicationScheduled, ExportRedemptionScheduled, ExportVoucherScheduled, ExportVoucherTransactionsScheduled
     *
     * @return The actual instance (ExportCustomerScheduled, ExportOrderScheduled, ExportPointsExpirationScheduled, ExportPublicationScheduled, ExportRedemptionScheduled, ExportVoucherScheduled, ExportVoucherTransactionsScheduled)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ExportVoucherScheduled`. If the actual instance is not `ExportVoucherScheduled`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExportVoucherScheduled`
     * @throws ClassCastException if the instance is not `ExportVoucherScheduled`
     */
    public ExportVoucherScheduled getExportVoucherScheduled() throws ClassCastException {
        return (ExportVoucherScheduled)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ExportRedemptionScheduled`. If the actual instance is not `ExportRedemptionScheduled`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExportRedemptionScheduled`
     * @throws ClassCastException if the instance is not `ExportRedemptionScheduled`
     */
    public ExportRedemptionScheduled getExportRedemptionScheduled() throws ClassCastException {
        return (ExportRedemptionScheduled)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ExportCustomerScheduled`. If the actual instance is not `ExportCustomerScheduled`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExportCustomerScheduled`
     * @throws ClassCastException if the instance is not `ExportCustomerScheduled`
     */
    public ExportCustomerScheduled getExportCustomerScheduled() throws ClassCastException {
        return (ExportCustomerScheduled)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ExportPublicationScheduled`. If the actual instance is not `ExportPublicationScheduled`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExportPublicationScheduled`
     * @throws ClassCastException if the instance is not `ExportPublicationScheduled`
     */
    public ExportPublicationScheduled getExportPublicationScheduled() throws ClassCastException {
        return (ExportPublicationScheduled)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ExportOrderScheduled`. If the actual instance is not `ExportOrderScheduled`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExportOrderScheduled`
     * @throws ClassCastException if the instance is not `ExportOrderScheduled`
     */
    public ExportOrderScheduled getExportOrderScheduled() throws ClassCastException {
        return (ExportOrderScheduled)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ExportPointsExpirationScheduled`. If the actual instance is not `ExportPointsExpirationScheduled`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExportPointsExpirationScheduled`
     * @throws ClassCastException if the instance is not `ExportPointsExpirationScheduled`
     */
    public ExportPointsExpirationScheduled getExportPointsExpirationScheduled() throws ClassCastException {
        return (ExportPointsExpirationScheduled)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ExportVoucherTransactionsScheduled`. If the actual instance is not `ExportVoucherTransactionsScheduled`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExportVoucherTransactionsScheduled`
     * @throws ClassCastException if the instance is not `ExportVoucherTransactionsScheduled`
     */
    public ExportVoucherTransactionsScheduled getExportVoucherTransactionsScheduled() throws ClassCastException {
        return (ExportVoucherTransactionsScheduled)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportsCreateResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ExportVoucherScheduled
    try {
      ExportVoucherScheduled.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ExportVoucherScheduled failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ExportRedemptionScheduled
    try {
      ExportRedemptionScheduled.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ExportRedemptionScheduled failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ExportCustomerScheduled
    try {
      ExportCustomerScheduled.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ExportCustomerScheduled failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ExportPublicationScheduled
    try {
      ExportPublicationScheduled.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ExportPublicationScheduled failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ExportOrderScheduled
    try {
      ExportOrderScheduled.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ExportOrderScheduled failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ExportPointsExpirationScheduled
    try {
      ExportPointsExpirationScheduled.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ExportPointsExpirationScheduled failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ExportVoucherTransactionsScheduled
    try {
      ExportVoucherTransactionsScheduled.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ExportVoucherTransactionsScheduled failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ExportsCreateResponseBody with oneOf schemas: ExportCustomerScheduled, ExportOrderScheduled, ExportPointsExpirationScheduled, ExportPublicationScheduled, ExportRedemptionScheduled, ExportVoucherScheduled, ExportVoucherTransactionsScheduled. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of ExportsCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportsCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to ExportsCreateResponseBody
  */
  public static ExportsCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportsCreateResponseBody.class);
  }

 /**
  * Convert an instance of ExportsCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

