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
import voucherify.client.model.Customer;
import voucherify.client.model.Order;
import voucherify.client.model.QualificationsOption;

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
 * Request body schema for **POST** &#x60;/qualifications&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:00:53.208514+01:00[Europe/Warsaw]")
public class ClientQualificationsCheckEligibilityRequestBody {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private Customer customer;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  /**
   * Defines which resources Voucherify will use. The &#x60;ADVANCED&#x60; mode is available after purchase only.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    BASIC("BASIC"),
    
    ADVANCED("ADVANCED");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public ClientQualificationsCheckEligibilityRequestBody() {
  }

  public ClientQualificationsCheckEligibilityRequestBody customer(Customer customer) {
    
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


  public ClientQualificationsCheckEligibilityRequestBody order(Order order) {
    
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


  public ClientQualificationsCheckEligibilityRequestBody mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Defines which resources Voucherify will use. The &#x60;ADVANCED&#x60; mode is available after purchase only.
   * @return mode
  **/
  @javax.annotation.Nullable
  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  public ClientQualificationsCheckEligibilityRequestBody trackingId(String trackingId) {
    
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


  public ClientQualificationsCheckEligibilityRequestBody scenario(ScenarioEnum scenario) {
    
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


  public ClientQualificationsCheckEligibilityRequestBody options(QualificationsOption options) {
    
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


  public ClientQualificationsCheckEligibilityRequestBody metadata(Object metadata) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientQualificationsCheckEligibilityRequestBody clientQualificationsCheckEligibilityRequestBody = (ClientQualificationsCheckEligibilityRequestBody) o;
    return Objects.equals(this.customer, clientQualificationsCheckEligibilityRequestBody.customer) &&
        Objects.equals(this.order, clientQualificationsCheckEligibilityRequestBody.order) &&
        Objects.equals(this.mode, clientQualificationsCheckEligibilityRequestBody.mode) &&
        Objects.equals(this.trackingId, clientQualificationsCheckEligibilityRequestBody.trackingId) &&
        Objects.equals(this.scenario, clientQualificationsCheckEligibilityRequestBody.scenario) &&
        Objects.equals(this.options, clientQualificationsCheckEligibilityRequestBody.options) &&
        Objects.equals(this.metadata, clientQualificationsCheckEligibilityRequestBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, order, mode, trackingId, scenario, options, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientQualificationsCheckEligibilityRequestBody {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("mode");
    openapiFields.add("tracking_id");
    openapiFields.add("scenario");
    openapiFields.add("options");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClientQualificationsCheckEligibilityRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientQualificationsCheckEligibilityRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientQualificationsCheckEligibilityRequestBody is not found in the empty JSON string", ClientQualificationsCheckEligibilityRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientQualificationsCheckEligibilityRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientQualificationsCheckEligibilityRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        Customer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        Order.validateJsonElement(jsonObj.get("order"));
      }
      if ((jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonNull()) && !jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      if ((jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) && !jsonObj.get("tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_id").toString()));
      }
      if ((jsonObj.get("scenario") != null && !jsonObj.get("scenario").isJsonNull()) && !jsonObj.get("scenario").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scenario` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scenario").toString()));
      }
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        QualificationsOption.validateJsonElement(jsonObj.get("options"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientQualificationsCheckEligibilityRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientQualificationsCheckEligibilityRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientQualificationsCheckEligibilityRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientQualificationsCheckEligibilityRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientQualificationsCheckEligibilityRequestBody>() {
           @Override
           public void write(JsonWriter out, ClientQualificationsCheckEligibilityRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientQualificationsCheckEligibilityRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientQualificationsCheckEligibilityRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientQualificationsCheckEligibilityRequestBody
  * @throws IOException if the JSON string is invalid with respect to ClientQualificationsCheckEligibilityRequestBody
  */
  public static ClientQualificationsCheckEligibilityRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientQualificationsCheckEligibilityRequestBody.class);
  }

 /**
  * Convert an instance of ClientQualificationsCheckEligibilityRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
