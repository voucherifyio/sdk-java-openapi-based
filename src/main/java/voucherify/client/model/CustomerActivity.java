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
import voucherify.client.model.CustomerActivityData;

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
 * This is an object representing customer activity.    This is a general object which presents moments from customers&#39; activity. There are all types of different events that customers perform during their journey once they participate in Promotions. Events describe moments when customers redeem coupons and earn points or rewards. The list of all types of activities is listed below.  The details describing the activity are collected in a property named &#x60;data&#x60;. In this object, software integrators will find all further information explaining the event context.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomerActivity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Event type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CONFIRMED("customer.confirmed"),
    
    CREATED("customer.created"),
    
    UPDATED("customer.updated"),
    
    DELETED("customer.deleted"),
    
    REFERRED("customer.referred"),
    
    CUSTOM_EVENT("customer.custom_event"),
    
    SEGMENT_ENTERED("customer.segment.entered"),
    
    SEGMENT_LEFT("customer.segment.left"),
    
    SMS_SENT("customer.sms.sent"),
    
    SMS_RECOVERED("customer.sms.recovered"),
    
    SMS_FAILED("customer.sms.failed"),
    
    EMAIL_SENT("customer.email.sent"),
    
    EMAIL_RECOVERED("customer.email.recovered"),
    
    EMAIL_FAILED("customer.email.failed"),
    
    ACTIVECAMPAIGN_SENT("customer.activecampaign.sent"),
    
    ACTIVECAMPAIGN_RECOVERED("customer.activecampaign.recovered"),
    
    ACTIVECAMPAIGN_FAILED("customer.activecampaign.failed"),
    
    BRAZE_SENT("customer.braze.sent"),
    
    BRAZE_RECOVERED("customer.braze.recovered"),
    
    BRAZE_FAILED("customer.braze.failed"),
    
    MAILCHIMP_SENT("customer.mailchimp.sent"),
    
    MAILCHIMP_RECOVERED("customer.mailchimp.recovered"),
    
    MAILCHIMP_FAILED("customer.mailchimp.failed"),
    
    INTERCOM_SENT("customer.intercom.sent"),
    
    INTERCOM_RECOVERED("customer.intercom.recovered"),
    
    INTERCOM_FAILED("customer.intercom.failed"),
    
    SHOPIFY_SENT("customer.shopify.sent"),
    
    SHOPIFY_RECOVERED("customer.shopify.recovered"),
    
    SHOPIFY_FAILED("customer.shopify.failed"),
    
    KLAVIYO_SENT("customer.klaviyo.sent"),
    
    KLAVIYO_RECOVERED("customer.klaviyo.recovered"),
    
    KLAVIYO_FAILED("customer.klaviyo.failed"),
    
    BATCH_SENT("customer.batch.sent"),
    
    BATCH_RECOVERED("customer.batch.recovered"),
    
    BATCH_FAILED("customer.batch.failed"),
    
    REWARDED("customer.rewarded"),
    
    REWARDED_LOYALTY_POINTS("customer.rewarded.loyalty_points"),
    
    VOUCHER_GIFT_BALANCE_ADDED("customer.voucher.gift.balance_added"),
    
    VOUCHER_LOYALTY_CARD_POINTS_ADDED("customer.voucher.loyalty_card.points_added"),
    
    VOUCHER_LOYALTY_CARD_POINTS_TRANSFERRED("customer.voucher.loyalty_card.points_transferred"),
    
    VOUCHER_LOYALTY_CARD_POINTS_EXPIRED("customer.voucher.loyalty_card.points_expired"),
    
    VOUCHER_DELETED("customer.voucher.deleted"),
    
    PUBLICATION_SUCCEEDED("customer.publication.succeeded"),
    
    PUBLICATION_FAILED("customer.publication.failed"),
    
    VALIDATION_SUCCEEDED("customer.validation.succeeded"),
    
    VALIDATION_FAILED("customer.validation.failed"),
    
    REDEMPTION_FAILED("customer.redemption.failed"),
    
    REDEMPTION_SUCCEEDED("customer.redemption.succeeded"),
    
    REDEMPTION_ROLLBACK_FAILED("customer.redemption.rollback.failed"),
    
    REDEMPTION_ROLLBACK_SUCCEEDED("customer.redemption.rollback.succeeded"),
    
    CONSENTS_GIVEN("customer.consents.given"),
    
    CONSENTS_REVOKED("customer.consents.revoked"),
    
    ORDER_CANCELED("customer.order.canceled"),
    
    ORDER_CREATED("customer.order.created"),
    
    ORDER_FULFILLED("customer.order.fulfilled"),
    
    ORDER_PAID("customer.order.paid"),
    
    ORDER_PROCESSING("customer.order.processing"),
    
    ORDER_UPDATED("customer.order.updated"),
    
    REWARD_REDEMPTIONS_CREATED("customer.reward_redemptions.created"),
    
    REWARD_REDEMPTIONS_PENDING("customer.reward_redemptions.pending"),
    
    REWARD_REDEMPTIONS_COMPLETED("customer.reward_redemptions.completed"),
    
    REWARD_REDEMPTIONS_ROLLEDBACK("customer.reward_redemptions.rolledback"),
    
    LOYALTY_UPDATED("customer.loyalty.updated"),
    
    LOYALTY_TIER_UPGRADED("customer.loyalty.tier.upgraded"),
    
    LOYALTY_TIER_DOWNGRADED("customer.loyalty.tier.downgraded"),
    
    LOYALTY_TIER_PROLONGED("customer.loyalty.tier.prolonged"),
    
    LOYALTY_TIER_EXPIRATION_CHANGED("customer.loyalty.tier.expiration.changed"),
    
    LOYALTY_TIER_JOINED("customer.loyalty.tier.joined"),
    
    LOYALTY_TIER_LEFT("customer.loyalty.tier.left");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<CustomerActivityData> data;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public CustomerActivity() {
  }

  public CustomerActivity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique event ID, assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomerActivity type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Event type.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CustomerActivity data(List<CustomerActivityData> data) {
    
    this.data = data;
    return this;
  }

  public CustomerActivity addDataItem(CustomerActivityData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Contains details about the event. The objects that are returned in the data attribute differ based on the context of the event type.
   * @return data
  **/
  @javax.annotation.Nullable
  public List<CustomerActivityData> getData() {
    return data;
  }


  public void setData(List<CustomerActivityData> data) {
    this.data = data;
  }


  public CustomerActivity createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the customer activity occurred in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerActivity customerActivity = (CustomerActivity) o;
    return Objects.equals(this.id, customerActivity.id) &&
        Objects.equals(this.type, customerActivity.type) &&
        Objects.equals(this.data, customerActivity.data) &&
        Objects.equals(this.createdAt, customerActivity.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, data, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerActivity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("data");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerActivity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerActivity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerActivity is not found in the empty JSON string", CustomerActivity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerActivity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerActivity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          TypeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `type` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("type") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a valid element of TypeEnum enum got `%s` instead", jsonObj.get("type").toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            CustomerActivityData.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerActivity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerActivity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerActivity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerActivity.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerActivity>() {
           @Override
           public void write(JsonWriter out, CustomerActivity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerActivity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerActivity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerActivity
  * @throws IOException if the JSON string is invalid with respect to CustomerActivity
  */
  public static CustomerActivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerActivity.class);
  }

 /**
  * Convert an instance of CustomerActivity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
