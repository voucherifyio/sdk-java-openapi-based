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


package io.voucherify.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.voucherify.client.model.Customer;
import io.voucherify.client.model.Order;
import io.voucherify.client.model.QualificationsOption;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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

import io.voucherify.client.JSON;

/**
 * Request body schema for **POST** &#x60;/qualifications&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QualificationsCheckEligibilityRequestBody {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  /**
   * Defines the scenario Voucherify should consider during the qualification process.  - &#x60;ALL&#x60; - Scenario that returns all redeemables available for the customer in one API request. This scenario is used by default when no value is selected. - &#x60;CUSTOMER_WALLET&#x60; - returns vouchers applicable to the customer’s cart based on the vouchers assigned to the customer’s profile. - &#x60;AUDIENCE_ONLY&#x60; - returns all vouchers, promotion tiers, and campaigns available to the customer. Voucherify validates the rules based on the customer profile only. - &#x60;PRODUCTS&#x60; - returns all promotions available for the products (when a discount is defined to be applied to the item or when the item is required in the validation rule). - &#x60;PRODUCTS_DISCOUNT&#x60; - returns all promotions available for products when a discount is defined as applicable to specific item(s). - &#x60;PROMOTION_STACKS&#x60; - returns the applicable promotion stacks. - &#x60;PRODUCTS_BY_CUSTOMER&#x60; - returns all promotions available for a customer for the products (when a discount is defined to be applied to the item or when the item is required in the validation rule). - &#x60;PRODUCTS_DISCOUNT_BY_CUSTOMER&#x60; - returns all promotions available for a customer for products when a discount is defined as applicable to specific item(s).
   */
  @JsonAdapter(ScenarioEnum.Adapter.class)
  public enum ScenarioEnum {
    ALL("ALL"),
    
    CUSTOMER_WALLET("CUSTOMER_WALLET"),
    
    AUDIENCE_ONLY("AUDIENCE_ONLY"),
    
    PRODUCTS("PRODUCTS"),
    
    PRODUCTS_DISCOUNT("PRODUCTS_DISCOUNT"),
    
    PROMOTION_STACKS("PROMOTION_STACKS"),
    
    PRODUCTS_BY_CUSTOMER("PRODUCTS_BY_CUSTOMER"),
    
    PRODUCTS_DISCOUNT_BY_CUSTOMER("PRODUCTS_DISCOUNT_BY_CUSTOMER");

    private String value;

    ScenarioEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScenarioEnum fromValue(String value) {
      for (ScenarioEnum b : ScenarioEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ScenarioEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScenarioEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScenarioEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScenarioEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SCENARIO = "scenario";
  @SerializedName(SERIALIZED_NAME_SCENARIO)
  private ScenarioEnum scenario;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private QualificationsOption options;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public QualificationsCheckEligibilityRequestBody() {
  }

  public QualificationsCheckEligibilityRequestBody customer(Customer customer) {
    
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


  public QualificationsCheckEligibilityRequestBody order(Order order) {
    
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


  public QualificationsCheckEligibilityRequestBody trackingId(String trackingId) {
    
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


  public QualificationsCheckEligibilityRequestBody scenario(ScenarioEnum scenario) {
    
    this.scenario = scenario;
    return this;
  }

   /**
   * Defines the scenario Voucherify should consider during the qualification process.  - &#x60;ALL&#x60; - Scenario that returns all redeemables available for the customer in one API request. This scenario is used by default when no value is selected. - &#x60;CUSTOMER_WALLET&#x60; - returns vouchers applicable to the customer’s cart based on the vouchers assigned to the customer’s profile. - &#x60;AUDIENCE_ONLY&#x60; - returns all vouchers, promotion tiers, and campaigns available to the customer. Voucherify validates the rules based on the customer profile only. - &#x60;PRODUCTS&#x60; - returns all promotions available for the products (when a discount is defined to be applied to the item or when the item is required in the validation rule). - &#x60;PRODUCTS_DISCOUNT&#x60; - returns all promotions available for products when a discount is defined as applicable to specific item(s). - &#x60;PROMOTION_STACKS&#x60; - returns the applicable promotion stacks. - &#x60;PRODUCTS_BY_CUSTOMER&#x60; - returns all promotions available for a customer for the products (when a discount is defined to be applied to the item or when the item is required in the validation rule). - &#x60;PRODUCTS_DISCOUNT_BY_CUSTOMER&#x60; - returns all promotions available for a customer for products when a discount is defined as applicable to specific item(s).
   * @return scenario
  **/
  @javax.annotation.Nullable
  public ScenarioEnum getScenario() {
    return scenario;
  }


  public void setScenario(ScenarioEnum scenario) {
    this.scenario = scenario;
  }


  public QualificationsCheckEligibilityRequestBody options(QualificationsOption options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  public QualificationsOption getOptions() {
    return options;
  }


  public void setOptions(QualificationsOption options) {
    this.options = options;
  }


  public QualificationsCheckEligibilityRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of key/value pairs that you can send in the request body to check against redeemables requiring **redemption** metadata validation rules to be satisfied. The validation runs against rules that are defined through the &lt;!-- [Create Validation Rules](https://docs.voucherify.io/reference/create-validation-rules) --&gt;[Create Validation Rules](ref:create-validation-rules) endpoint or via the Dashboard; in the _Advanced Rule Builder_ &amp;rarr; _Advanced_ &amp;rarr; _Redemption metadata satisfy_ or _Basic Builder_ &amp;rarr; _Attributes match_ &amp;rarr; _REDEMPTION METADATA_. [Read more](https://support.voucherify.io/article/148-how-to-build-a-rule).
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
   * @return the QualificationsCheckEligibilityRequestBody instance itself
   */
  public QualificationsCheckEligibilityRequestBody putAdditionalProperty(String key, Object value) {
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
    QualificationsCheckEligibilityRequestBody qualificationsCheckEligibilityRequestBody = (QualificationsCheckEligibilityRequestBody) o;
    return Objects.equals(this.customer, qualificationsCheckEligibilityRequestBody.customer) &&
        Objects.equals(this.order, qualificationsCheckEligibilityRequestBody.order) &&
        Objects.equals(this.trackingId, qualificationsCheckEligibilityRequestBody.trackingId) &&
        Objects.equals(this.scenario, qualificationsCheckEligibilityRequestBody.scenario) &&
        Objects.equals(this.options, qualificationsCheckEligibilityRequestBody.options) &&
        Objects.equals(this.metadata, qualificationsCheckEligibilityRequestBody.metadata)&&
        Objects.equals(this.additionalProperties, qualificationsCheckEligibilityRequestBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, order, trackingId, scenario, options, metadata, additionalProperties);
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
    sb.append("class QualificationsCheckEligibilityRequestBody {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("order");
    openapiFields.add("tracking_id");
    openapiFields.add("scenario");
    openapiFields.add("options");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationsCheckEligibilityRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationsCheckEligibilityRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationsCheckEligibilityRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationsCheckEligibilityRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationsCheckEligibilityRequestBody>() {
           @Override
           public void write(JsonWriter out, QualificationsCheckEligibilityRequestBody value) throws IOException {
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
           public QualificationsCheckEligibilityRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             QualificationsCheckEligibilityRequestBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QualificationsCheckEligibilityRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationsCheckEligibilityRequestBody
  * @throws IOException if the JSON string is invalid with respect to QualificationsCheckEligibilityRequestBody
  */
  public static QualificationsCheckEligibilityRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationsCheckEligibilityRequestBody.class);
  }

 /**
  * Convert an instance of QualificationsCheckEligibilityRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
