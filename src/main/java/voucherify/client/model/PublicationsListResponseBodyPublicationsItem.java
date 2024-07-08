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
import voucherify.client.model.ListPublicationsItemVoucher;
import voucherify.client.model.PublicationsListResponseBodyPublicationsItemMetadata;

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
 * PublicationsListResponseBodyPublicationsItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PublicationsListResponseBodyPublicationsItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of the object represented by the JSON. This object stores information about the &#x60;publication&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    PUBLICATION("publication");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.PUBLICATION;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private PublicationsListResponseBodyPublicationsItemMetadata metadata;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerWithSummaryLoyaltyReferrals customer;

  public static final String SERIALIZED_NAME_VOUCHERS = "vouchers";
  @SerializedName(SERIALIZED_NAME_VOUCHERS)
  private List<String> vouchers;

  public static final String SERIALIZED_NAME_VOUCHERS_ID = "vouchers_id";
  @SerializedName(SERIALIZED_NAME_VOUCHERS_ID)
  private List<String> vouchersId;

  /**
   * Gets or Sets result
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private ListPublicationsItemVoucher voucher;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  public PublicationsListResponseBodyPublicationsItem() {
  }

  public PublicationsListResponseBodyPublicationsItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique publication ID, assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PublicationsListResponseBodyPublicationsItem _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by the JSON. This object stores information about the &#x60;publication&#x60;.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public PublicationsListResponseBodyPublicationsItem createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the publication was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PublicationsListResponseBodyPublicationsItem customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer ID of the customer receiving the publication.
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public PublicationsListResponseBodyPublicationsItem trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Customer&#39;s &#x60;source_id&#x60;.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public PublicationsListResponseBodyPublicationsItem metadata(PublicationsListResponseBodyPublicationsItemMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public PublicationsListResponseBodyPublicationsItemMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(PublicationsListResponseBodyPublicationsItemMetadata metadata) {
    this.metadata = metadata;
  }


  public PublicationsListResponseBodyPublicationsItem channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * How the publication was originated. It can be your own custom channel or an example value provided here.
   * @return channel
  **/
  @javax.annotation.Nullable
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public PublicationsListResponseBodyPublicationsItem sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The merchant’s publication ID if it is different from the Voucherify publication ID. It&#39;s an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service. 
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public PublicationsListResponseBodyPublicationsItem customer(CustomerWithSummaryLoyaltyReferrals customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public CustomerWithSummaryLoyaltyReferrals getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerWithSummaryLoyaltyReferrals customer) {
    this.customer = customer;
  }


  public PublicationsListResponseBodyPublicationsItem vouchers(List<String> vouchers) {
    
    this.vouchers = vouchers;
    return this;
  }

  public PublicationsListResponseBodyPublicationsItem addVouchersItem(String vouchersItem) {
    if (this.vouchers == null) {
      this.vouchers = new ArrayList<>();
    }
    this.vouchers.add(vouchersItem);
    return this;
  }

   /**
   * Contains the voucher IDs that was assigned by Voucherify. and Contains the unique voucher codes that was assigned by Voucherify.
   * @return vouchers
  **/
  @javax.annotation.Nullable
  public List<String> getVouchers() {
    return vouchers;
  }


  public void setVouchers(List<String> vouchers) {
    this.vouchers = vouchers;
  }


  public PublicationsListResponseBodyPublicationsItem vouchersId(List<String> vouchersId) {
    
    this.vouchersId = vouchersId;
    return this;
  }

  public PublicationsListResponseBodyPublicationsItem addVouchersIdItem(String vouchersIdItem) {
    if (this.vouchersId == null) {
      this.vouchersId = new ArrayList<>();
    }
    this.vouchersId.add(vouchersIdItem);
    return this;
  }

   /**
   * Contains the unique internal voucher IDs that was assigned by Voucherify.
   * @return vouchersId
  **/
  @javax.annotation.Nullable
  public List<String> getVouchersId() {
    return vouchersId;
  }


  public void setVouchersId(List<String> vouchersId) {
    this.vouchersId = vouchersId;
  }


  public PublicationsListResponseBodyPublicationsItem result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public PublicationsListResponseBodyPublicationsItem voucher(ListPublicationsItemVoucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public ListPublicationsItemVoucher getVoucher() {
    return voucher;
  }


  public void setVoucher(ListPublicationsItemVoucher voucher) {
    this.voucher = voucher;
  }


  public PublicationsListResponseBodyPublicationsItem failureCode(String failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * Generic reason as to why the create publication operation failed.
   * @return failureCode
  **/
  @javax.annotation.Nullable
  public String getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public PublicationsListResponseBodyPublicationsItem failureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * This parameter will provide more expanded reason as to why the create publication operation failed.
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  public String getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
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
   * @return the PublicationsListResponseBodyPublicationsItem instance itself
   */
  public PublicationsListResponseBodyPublicationsItem putAdditionalProperty(String key, Object value) {
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
    PublicationsListResponseBodyPublicationsItem publicationsListResponseBodyPublicationsItem = (PublicationsListResponseBodyPublicationsItem) o;
    return Objects.equals(this.id, publicationsListResponseBodyPublicationsItem.id) &&
        Objects.equals(this._object, publicationsListResponseBodyPublicationsItem._object) &&
        Objects.equals(this.createdAt, publicationsListResponseBodyPublicationsItem.createdAt) &&
        Objects.equals(this.customerId, publicationsListResponseBodyPublicationsItem.customerId) &&
        Objects.equals(this.trackingId, publicationsListResponseBodyPublicationsItem.trackingId) &&
        Objects.equals(this.metadata, publicationsListResponseBodyPublicationsItem.metadata) &&
        Objects.equals(this.channel, publicationsListResponseBodyPublicationsItem.channel) &&
        Objects.equals(this.sourceId, publicationsListResponseBodyPublicationsItem.sourceId) &&
        Objects.equals(this.customer, publicationsListResponseBodyPublicationsItem.customer) &&
        Objects.equals(this.vouchers, publicationsListResponseBodyPublicationsItem.vouchers) &&
        Objects.equals(this.vouchersId, publicationsListResponseBodyPublicationsItem.vouchersId) &&
        Objects.equals(this.result, publicationsListResponseBodyPublicationsItem.result) &&
        Objects.equals(this.voucher, publicationsListResponseBodyPublicationsItem.voucher) &&
        Objects.equals(this.failureCode, publicationsListResponseBodyPublicationsItem.failureCode) &&
        Objects.equals(this.failureMessage, publicationsListResponseBodyPublicationsItem.failureMessage)&&
        Objects.equals(this.additionalProperties, publicationsListResponseBodyPublicationsItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, customerId, trackingId, metadata, channel, sourceId, customer, vouchers, vouchersId, result, voucher, failureCode, failureMessage, additionalProperties);
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
    sb.append("class PublicationsListResponseBodyPublicationsItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    vouchers: ").append(toIndentedString(vouchers)).append("\n");
    sb.append("    vouchersId: ").append(toIndentedString(vouchersId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("created_at");
    openapiFields.add("customer_id");
    openapiFields.add("tracking_id");
    openapiFields.add("metadata");
    openapiFields.add("channel");
    openapiFields.add("source_id");
    openapiFields.add("customer");
    openapiFields.add("vouchers");
    openapiFields.add("vouchers_id");
    openapiFields.add("result");
    openapiFields.add("voucher");
    openapiFields.add("failure_code");
    openapiFields.add("failure_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PublicationsListResponseBodyPublicationsItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PublicationsListResponseBodyPublicationsItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicationsListResponseBodyPublicationsItem is not found in the empty JSON string", PublicationsListResponseBodyPublicationsItem.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("object");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ObjectEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `object` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("object") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `object` to be a valid element of ObjectEnum enum got `%s` instead", jsonObj.get("object").toString()));
        }
      }
      if ((jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) && !jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) && !jsonObj.get("tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_id").toString()));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        PublicationsListResponseBodyPublicationsItemMetadata.validateJsonElement(jsonObj.get("metadata"));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        CustomerWithSummaryLoyaltyReferrals.validateJsonElement(jsonObj.get("customer"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("vouchers") != null && !jsonObj.get("vouchers").isJsonNull() && !jsonObj.get("vouchers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vouchers` to be an array in the JSON string but got `%s`", jsonObj.get("vouchers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("vouchers_id") != null && !jsonObj.get("vouchers_id").isJsonNull() && !jsonObj.get("vouchers_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vouchers_id` to be an array in the JSON string but got `%s`", jsonObj.get("vouchers_id").toString()));
      }
      if ((jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("result");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ResultEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `result` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("result") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `result` to be a valid element of ResultEnum enum got `%s` instead", jsonObj.get("result").toString()));
        }
      }
      // validate the optional field `voucher`
      if (jsonObj.get("voucher") != null && !jsonObj.get("voucher").isJsonNull()) {
        ListPublicationsItemVoucher.validateJsonElement(jsonObj.get("voucher"));
      }
      if ((jsonObj.get("failure_code") != null && !jsonObj.get("failure_code").isJsonNull()) && !jsonObj.get("failure_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_code").toString()));
      }
      if ((jsonObj.get("failure_message") != null && !jsonObj.get("failure_message").isJsonNull()) && !jsonObj.get("failure_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicationsListResponseBodyPublicationsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicationsListResponseBodyPublicationsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicationsListResponseBodyPublicationsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicationsListResponseBodyPublicationsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicationsListResponseBodyPublicationsItem>() {
           @Override
           public void write(JsonWriter out, PublicationsListResponseBodyPublicationsItem value) throws IOException {
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
           public PublicationsListResponseBodyPublicationsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PublicationsListResponseBodyPublicationsItem instance = thisAdapter.fromJsonTree(jsonObj);
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
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
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
  * Create an instance of PublicationsListResponseBodyPublicationsItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicationsListResponseBodyPublicationsItem
  * @throws IOException if the JSON string is invalid with respect to PublicationsListResponseBodyPublicationsItem
  */
  public static PublicationsListResponseBodyPublicationsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicationsListResponseBodyPublicationsItem.class);
  }

 /**
  * Convert an instance of PublicationsListResponseBodyPublicationsItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

