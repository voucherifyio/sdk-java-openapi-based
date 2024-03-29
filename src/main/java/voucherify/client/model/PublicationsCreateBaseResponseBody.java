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
 * PublicationsCreateBaseResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PublicationsCreateBaseResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of object represented by the JSON. This object stores information about the &#x60;publication&#x60;.
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
  private Object metadata;

  /**
   * How the publication was originated. It can be your own custom channel or an example value provided here.
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    API("API");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel = ChannelEnum.API;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  /**
   * Status of the publication attempt.
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    SUCCESS("SUCCESS");

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
  private ResultEnum result = ResultEnum.SUCCESS;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerWithSummaryLoyaltyReferrals customer;

  public static final String SERIALIZED_NAME_VOUCHERS_ID = "vouchers_id";
  @SerializedName(SERIALIZED_NAME_VOUCHERS_ID)
  private List<String> vouchersId = new ArrayList<>();

  public PublicationsCreateBaseResponseBody() {
  }

  public PublicationsCreateBaseResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique publication ID, assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PublicationsCreateBaseResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by the JSON. This object stores information about the &#x60;publication&#x60;.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public PublicationsCreateBaseResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the publication was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PublicationsCreateBaseResponseBody customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer ID of the customer receiving the publication.
   * @return customerId
  **/
  @javax.annotation.Nonnull
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public PublicationsCreateBaseResponseBody trackingId(String trackingId) {
    
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


  public PublicationsCreateBaseResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the publication. A set of key/value pairs that you can attach to a publication object. It can be useful for storing additional information about the publication in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public PublicationsCreateBaseResponseBody channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * How the publication was originated. It can be your own custom channel or an example value provided here.
   * @return channel
  **/
  @javax.annotation.Nonnull
  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  public PublicationsCreateBaseResponseBody sourceId(String sourceId) {
    
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


  public PublicationsCreateBaseResponseBody result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Status of the publication attempt.
   * @return result
  **/
  @javax.annotation.Nonnull
  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public PublicationsCreateBaseResponseBody customer(CustomerWithSummaryLoyaltyReferrals customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  public CustomerWithSummaryLoyaltyReferrals getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerWithSummaryLoyaltyReferrals customer) {
    this.customer = customer;
  }


  public PublicationsCreateBaseResponseBody vouchersId(List<String> vouchersId) {
    
    this.vouchersId = vouchersId;
    return this;
  }

  public PublicationsCreateBaseResponseBody addVouchersIdItem(String vouchersIdItem) {
    if (this.vouchersId == null) {
      this.vouchersId = new ArrayList<>();
    }
    this.vouchersId.add(vouchersIdItem);
    return this;
  }

   /**
   * Contains the unique internal voucher ID that was assigned by Voucherify.
   * @return vouchersId
  **/
  @javax.annotation.Nonnull
  public List<String> getVouchersId() {
    return vouchersId;
  }


  public void setVouchersId(List<String> vouchersId) {
    this.vouchersId = vouchersId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationsCreateBaseResponseBody publicationsCreateBaseResponseBody = (PublicationsCreateBaseResponseBody) o;
    return Objects.equals(this.id, publicationsCreateBaseResponseBody.id) &&
        Objects.equals(this._object, publicationsCreateBaseResponseBody._object) &&
        Objects.equals(this.createdAt, publicationsCreateBaseResponseBody.createdAt) &&
        Objects.equals(this.customerId, publicationsCreateBaseResponseBody.customerId) &&
        Objects.equals(this.trackingId, publicationsCreateBaseResponseBody.trackingId) &&
        Objects.equals(this.metadata, publicationsCreateBaseResponseBody.metadata) &&
        Objects.equals(this.channel, publicationsCreateBaseResponseBody.channel) &&
        Objects.equals(this.sourceId, publicationsCreateBaseResponseBody.sourceId) &&
        Objects.equals(this.result, publicationsCreateBaseResponseBody.result) &&
        Objects.equals(this.customer, publicationsCreateBaseResponseBody.customer) &&
        Objects.equals(this.vouchersId, publicationsCreateBaseResponseBody.vouchersId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, customerId, trackingId, metadata, channel, sourceId, result, customer, vouchersId);
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
    sb.append("class PublicationsCreateBaseResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    vouchersId: ").append(toIndentedString(vouchersId)).append("\n");
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
    openapiFields.add("result");
    openapiFields.add("customer");
    openapiFields.add("vouchers_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("customer_id");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("channel");
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("vouchers_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PublicationsCreateBaseResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PublicationsCreateBaseResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicationsCreateBaseResponseBody is not found in the empty JSON string", PublicationsCreateBaseResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PublicationsCreateBaseResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublicationsCreateBaseResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PublicationsCreateBaseResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
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
      if (!jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) && !jsonObj.get("tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_id").toString()));
      }
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("channel");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ChannelEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `channel` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("channel") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `channel` to be a valid element of ChannelEnum enum got `%s` instead", jsonObj.get("channel").toString()));
        }
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if (!jsonObj.get("result").isJsonPrimitive()) {
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
      // validate the required field `customer`
      CustomerWithSummaryLoyaltyReferrals.validateJsonElement(jsonObj.get("customer"));
      // ensure the required json array is present
      if (jsonObj.get("vouchers_id") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("vouchers_id").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vouchers_id` to be an array in the JSON string but got `%s`", jsonObj.get("vouchers_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicationsCreateBaseResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicationsCreateBaseResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicationsCreateBaseResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicationsCreateBaseResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicationsCreateBaseResponseBody>() {
           @Override
           public void write(JsonWriter out, PublicationsCreateBaseResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublicationsCreateBaseResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PublicationsCreateBaseResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicationsCreateBaseResponseBody
  * @throws IOException if the JSON string is invalid with respect to PublicationsCreateBaseResponseBody
  */
  public static PublicationsCreateBaseResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicationsCreateBaseResponseBody.class);
  }

 /**
  * Convert an instance of PublicationsCreateBaseResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

