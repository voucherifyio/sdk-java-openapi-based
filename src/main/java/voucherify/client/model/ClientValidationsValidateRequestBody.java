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
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.ClientValidationsValidateRequestBodyAllOfOptions;
import voucherify.client.model.Customer;
import voucherify.client.model.Order;
import voucherify.client.model.Session;
import voucherify.client.model.StackableValidateRedeemBaseRedeemablesItem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import voucherify.client.JSON;

/**
 * Response body schema for **POST** &#x60;/validations&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ClientValidationsValidateRequestBody {
  public static final String SERIALIZED_NAME_REDEEMABLES = "redeemables";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES)
  private List<StackableValidateRedeemBaseRedeemablesItem> redeemables;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ClientValidationsValidateRequestBodyAllOfOptions options;

  public ClientValidationsValidateRequestBody() {
  }

  public ClientValidationsValidateRequestBody redeemables(List<StackableValidateRedeemBaseRedeemablesItem> redeemables) {
    
    this.redeemables = redeemables;
    return this;
  }

  public ClientValidationsValidateRequestBody addRedeemablesItem(StackableValidateRedeemBaseRedeemablesItem redeemablesItem) {
    if (this.redeemables == null) {
      this.redeemables = new ArrayList<>();
    }
    this.redeemables.add(redeemablesItem);
    return this;
  }

   /**
   * Get redeemables
   * @return redeemables
  **/
  @javax.annotation.Nullable
  public List<StackableValidateRedeemBaseRedeemablesItem> getRedeemables() {
    return redeemables;
  }


  public void setRedeemables(List<StackableValidateRedeemBaseRedeemablesItem> redeemables) {
    this.redeemables = redeemables;
  }


  public ClientValidationsValidateRequestBody order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public ClientValidationsValidateRequestBody customer(Customer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public Customer getCustomer() {
    return customer;
  }


  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public ClientValidationsValidateRequestBody session(Session session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  public Session getSession() {
    return session;
  }


  public void setSession(Session session) {
    this.session = session;
  }


  public ClientValidationsValidateRequestBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Is correspondent to Customer&#39;s source_id
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public ClientValidationsValidateRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of key/value pairs that you can attach to a redemption object. It can be useful for storing additional information about the redemption in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public ClientValidationsValidateRequestBody options(ClientValidationsValidateRequestBodyAllOfOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public ClientValidationsValidateRequestBodyAllOfOptions getOptions() {
    return options;
  }


  public void setOptions(ClientValidationsValidateRequestBodyAllOfOptions options) {
    this.options = options;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ClientValidationsValidateRequestBody instance itself
   */
  public ClientValidationsValidateRequestBody putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientValidationsValidateRequestBody clientValidationsValidateRequestBody = (ClientValidationsValidateRequestBody) o;
    return Objects.equals(this.redeemables, clientValidationsValidateRequestBody.redeemables) &&
        Objects.equals(this.order, clientValidationsValidateRequestBody.order) &&
        Objects.equals(this.customer, clientValidationsValidateRequestBody.customer) &&
        Objects.equals(this.session, clientValidationsValidateRequestBody.session) &&
        Objects.equals(this.trackingId, clientValidationsValidateRequestBody.trackingId) &&
        Objects.equals(this.metadata, clientValidationsValidateRequestBody.metadata) &&
        Objects.equals(this.options, clientValidationsValidateRequestBody.options)&&
        Objects.equals(this.additionalProperties, clientValidationsValidateRequestBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(redeemables, order, customer, session, trackingId, metadata, options, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientValidationsValidateRequestBody {\n");
    sb.append("    redeemables: ").append(toIndentedString(redeemables)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("redeemables");
    openapiFields.add("order");
    openapiFields.add("customer");
    openapiFields.add("session");
    openapiFields.add("tracking_id");
    openapiFields.add("metadata");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientValidationsValidateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientValidationsValidateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientValidationsValidateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientValidationsValidateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientValidationsValidateRequestBody>() {
           @Override
           public void write(JsonWriter out, ClientValidationsValidateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientValidationsValidateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ClientValidationsValidateRequestBody instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     return null;
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientValidationsValidateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientValidationsValidateRequestBody
  * @throws IOException if the JSON string is invalid with respect to ClientValidationsValidateRequestBody
  */
  public static ClientValidationsValidateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientValidationsValidateRequestBody.class);
  }

 /**
  * Convert an instance of ClientValidationsValidateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

