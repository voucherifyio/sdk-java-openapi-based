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
import voucherify.client.model.CreatePublicationCampaign;
import voucherify.client.model.CreatePublicationWithCampaign;
import voucherify.client.model.CreatePublicationWithSpecificVoucher;
import voucherify.client.model.Customer;



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
public class PublicationsCreateRequestBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PublicationsCreateRequestBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PublicationsCreateRequestBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PublicationsCreateRequestBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreatePublicationWithSpecificVoucher> adapterCreatePublicationWithSpecificVoucher = gson.getDelegateAdapter(this, TypeToken.get(CreatePublicationWithSpecificVoucher.class));
            final TypeAdapter<CreatePublicationWithCampaign> adapterCreatePublicationWithCampaign = gson.getDelegateAdapter(this, TypeToken.get(CreatePublicationWithCampaign.class));

            return (TypeAdapter<T>) new TypeAdapter<PublicationsCreateRequestBody>() {
                @Override
                public void write(JsonWriter out, PublicationsCreateRequestBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreatePublicationWithSpecificVoucher`
                    if (value.getActualInstance() instanceof CreatePublicationWithSpecificVoucher) {
                      JsonElement element = adapterCreatePublicationWithSpecificVoucher.toJsonTree((CreatePublicationWithSpecificVoucher)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreatePublicationWithCampaign`
                    if (value.getActualInstance() instanceof CreatePublicationWithCampaign) {
                      JsonElement element = adapterCreatePublicationWithCampaign.toJsonTree((CreatePublicationWithCampaign)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreatePublicationWithCampaign, CreatePublicationWithSpecificVoucher");
                }

                @Override
                public PublicationsCreateRequestBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreatePublicationWithSpecificVoucher
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreatePublicationWithSpecificVoucher.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreatePublicationWithSpecificVoucher;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreatePublicationWithSpecificVoucher'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreatePublicationWithSpecificVoucher failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreatePublicationWithSpecificVoucher'", e);
                    }
                    // deserialize CreatePublicationWithCampaign
                    try {
                      // validate the JSON object to see if any exception is thrown
                      CreatePublicationWithCampaign.validateJsonElement(jsonElement);
                      actualAdapter = adapterCreatePublicationWithCampaign;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreatePublicationWithCampaign'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreatePublicationWithCampaign failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreatePublicationWithCampaign'", e);
                    }

                    if (match == 1) {
                        PublicationsCreateRequestBody ret = new PublicationsCreateRequestBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PublicationsCreateRequestBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public PublicationsCreateRequestBody() {
        super("oneOf", Boolean.FALSE);
    }

    public PublicationsCreateRequestBody(CreatePublicationWithCampaign o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PublicationsCreateRequestBody(CreatePublicationWithSpecificVoucher o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreatePublicationWithSpecificVoucher", CreatePublicationWithSpecificVoucher.class);
        schemas.put("CreatePublicationWithCampaign", CreatePublicationWithCampaign.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return PublicationsCreateRequestBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreatePublicationWithCampaign, CreatePublicationWithSpecificVoucher
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreatePublicationWithSpecificVoucher) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreatePublicationWithCampaign) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreatePublicationWithCampaign, CreatePublicationWithSpecificVoucher");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreatePublicationWithCampaign, CreatePublicationWithSpecificVoucher
     *
     * @return The actual instance (CreatePublicationWithCampaign, CreatePublicationWithSpecificVoucher)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreatePublicationWithSpecificVoucher`. If the actual instance is not `CreatePublicationWithSpecificVoucher`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreatePublicationWithSpecificVoucher`
     * @throws ClassCastException if the instance is not `CreatePublicationWithSpecificVoucher`
     */
    public CreatePublicationWithSpecificVoucher getCreatePublicationWithSpecificVoucher() throws ClassCastException {
        return (CreatePublicationWithSpecificVoucher)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreatePublicationWithCampaign`. If the actual instance is not `CreatePublicationWithCampaign`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreatePublicationWithCampaign`
     * @throws ClassCastException if the instance is not `CreatePublicationWithCampaign`
     */
    public CreatePublicationWithCampaign getCreatePublicationWithCampaign() throws ClassCastException {
        return (CreatePublicationWithCampaign)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PublicationsCreateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreatePublicationWithSpecificVoucher
    try {
      CreatePublicationWithSpecificVoucher.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreatePublicationWithSpecificVoucher failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreatePublicationWithCampaign
    try {
      CreatePublicationWithCampaign.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreatePublicationWithCampaign failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for PublicationsCreateRequestBody with oneOf schemas: CreatePublicationWithCampaign, CreatePublicationWithSpecificVoucher. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of PublicationsCreateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicationsCreateRequestBody
  * @throws IOException if the JSON string is invalid with respect to PublicationsCreateRequestBody
  */
  public static PublicationsCreateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicationsCreateRequestBody.class);
  }

 /**
  * Convert an instance of PublicationsCreateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
