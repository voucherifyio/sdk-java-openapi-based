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
 * List of available fields and filters that can be exported with a gift card or loyalty card transactions export along with the sorting order of the returned data.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VoucherTransactionsExportParameters {
  /**
   * How the export is filtered, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order.
   */
  @JsonAdapter(OrderEnum.Adapter.class)
  public enum OrderEnum {
    _CREATED_AT("-created_at"),
    
    CREATED_AT("created_at");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderEnum fromValue(String value) {
      for (OrderEnum b : OrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderEnum order;

  /**
   * Gets or Sets fields
   */
  @JsonAdapter(FieldsEnum.Adapter.class)
  public enum FieldsEnum {
    ID("id"),
    
    TYPE("type"),
    
    SOURCE_ID("source_id"),
    
    REASON("reason"),
    
    BALANCE("balance"),
    
    AMOUNT("amount"),
    
    CREATED_AT("created_at"),
    
    VOUCHER_ID("voucher_id"),
    
    CAMPAIGN_ID("campaign_id"),
    
    SOURCE("source"),
    
    DETAILS("details"),
    
    RELATED_TRANSACTION_ID("related_transaction_id");

    private String value;

    FieldsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldsEnum fromValue(String value) {
      for (FieldsEnum b : FieldsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FieldsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FieldsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FieldsEnum> fields;

  public VoucherTransactionsExportParameters() {
  }

  public VoucherTransactionsExportParameters order(OrderEnum order) {
    
    this.order = order;
    return this;
  }

   /**
   * How the export is filtered, where the dash &#x60;-&#x60; preceding a sorting option means sorting in a descending order.
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderEnum getOrder() {
    return order;
  }


  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  public VoucherTransactionsExportParameters fields(List<FieldsEnum> fields) {
    
    this.fields = fields;
    return this;
  }

  public VoucherTransactionsExportParameters addFieldsItem(FieldsEnum fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Array of strings containing the data in the export. These fields define the headers in the CSV file. The array can be a combination of any of the following available fields:  | **Field** | **Definition** | **Example Export** | |:---|:---|:---| | id | Unique transaction ID. | vtx_0cb7811f1c07765800 | | type | Transaction type. | - &#x60;CREDITS_REMOVAL&#x60; &lt;br&gt; - &#x60;CREDITS_ADDITION&#x60; &lt;br&gt; - &#x60;CREDITS_REFUND&#x60; &lt;br&gt; - &#x60;CREDITS_REDEMPTION&#x60; &lt;br&gt; - &#x60;POINTS_ACCRUAL&#x60; &lt;br&gt; - &#x60;POINTS_CANCELLATION&#x60; &lt;br&gt; - &#x60;POINTS_REDEMPTION&#x60;&lt;br&gt; - &#x60;POINTS_REFUND&#x60;&lt;br&gt; - &#x60;POINTS_ADDITION&#x60;&lt;br&gt; - &#x60;POINTS_REMOVAL&#x60;&lt;br&gt; - &#x60;POINTS_EXPIRATION&#x60;&lt;br&gt; - &#x60;POINTS_TRANSFER_IN&#x60;&lt;br&gt; - &#x60;POINTS_TRANSFER_OUT&#x60; | | source_id | Unique transaction source ID. | 8638 | | reason | Contains the reason for the transaction if one was included originally. |  | | balance | The gift card or loyalty card balance after the transaction. |  | | amount | The amount of gift card or loyalty card credits being allocated during the transaction. This value can either be negative or positive depending on the nature of the transaction. |  | | created_at | Timestamp in ISO 8601 format representing the date and time when the transaction was created. | 2022-03-09T09:16:32.521Z  | | voucher_id | Unique Voucher ID. | v_dky7ksKfPX50Wb2Bxvcoeb1xT20b6tcp | | campaign_id | Parent campaign ID. | camp_FNYR4jhqZBM9xTptxDGgeNBV | | source|  Channel through which the transaction was initiated. | API | | details | More detailed information stored in the form of a JSON. | Provides more details related to the transaction in the form of an object. | | related_transaction_id | Unique transaction ID related to a receiver/donor card in the case of a points transfer from/to another card. | vtx_0c9afe802593b34b80 |
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<FieldsEnum> getFields() {
    return fields;
  }


  public void setFields(List<FieldsEnum> fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherTransactionsExportParameters voucherTransactionsExportParameters = (VoucherTransactionsExportParameters) o;
    return Objects.equals(this.order, voucherTransactionsExportParameters.order) &&
        Objects.equals(this.fields, voucherTransactionsExportParameters.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherTransactionsExportParameters {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VoucherTransactionsExportParameters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VoucherTransactionsExportParameters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherTransactionsExportParameters is not found in the empty JSON string", VoucherTransactionsExportParameters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VoucherTransactionsExportParameters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherTransactionsExportParameters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("order");

        if (objectElement != null && !objectElement.isJsonNull()) {
          OrderEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `order` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("order") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `order` to be a valid element of OrderEnum enum got `%s` instead", jsonObj.get("order").toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull() && !jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherTransactionsExportParameters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherTransactionsExportParameters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherTransactionsExportParameters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherTransactionsExportParameters.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherTransactionsExportParameters>() {
           @Override
           public void write(JsonWriter out, VoucherTransactionsExportParameters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherTransactionsExportParameters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherTransactionsExportParameters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherTransactionsExportParameters
  * @throws IOException if the JSON string is invalid with respect to VoucherTransactionsExportParameters
  */
  public static VoucherTransactionsExportParameters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherTransactionsExportParameters.class);
  }

 /**
  * Convert an instance of VoucherTransactionsExportParameters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
