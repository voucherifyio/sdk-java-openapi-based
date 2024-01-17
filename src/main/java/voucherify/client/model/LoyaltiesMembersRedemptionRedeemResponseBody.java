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
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.OrderCalculatedNoCustomerData;
import voucherify.client.model.PromotionTier;
import voucherify.client.model.RedemptionChannel;
import voucherify.client.model.RedemptionGift;
import voucherify.client.model.RedemptionLoyaltyCard;
import voucherify.client.model.RedemptionRelatedRedemptions;
import voucherify.client.model.RedemptionRewardResult;
import voucherify.client.model.SimpleCustomer;
import voucherify.client.model.Voucher;

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
 * Response body schema for **POST** &#x60;/loyalties/{campaignId}/members/{memberId}/redemption&#x60; and for **POST** &#x60;/loyalties/members/{memberId}/redemption&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class LoyaltiesMembersRedemptionRedeemResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of object represented by the JSON
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    REDEMPTION("redemption");

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
  private ObjectEnum _object = ObjectEnum.REDEMPTION;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private String redemption;

  /**
   * Redemption result.
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

  /**
   * Redemption status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED"),
    
    ROLLED_BACK("ROLLED_BACK");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_RELATED_REDEMPTIONS = "related_redemptions";
  @SerializedName(SERIALIZED_NAME_RELATED_REDEMPTIONS)
  private RedemptionRelatedRedemptions relatedRedemptions;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculatedNoCustomerData order;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private RedemptionChannel channel;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  /**
   * Defines the related object.
   */
  @JsonAdapter(RelatedObjectTypeEnum.Adapter.class)
  public enum RelatedObjectTypeEnum {
    VOUCHER("voucher"),
    
    PROMOTION_TIER("promotion_tier"),
    
    REDEMPTION("redemption");

    private String value;

    RelatedObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelatedObjectTypeEnum fromValue(String value) {
      for (RelatedObjectTypeEnum b : RelatedObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RelatedObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelatedObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelatedObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RelatedObjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "related_object_type";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  private RelatedObjectTypeEnum relatedObjectType;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private String relatedObjectId;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private Voucher voucher;

  public static final String SERIALIZED_NAME_PROMOTION_TIER = "promotion_tier";
  @SerializedName(SERIALIZED_NAME_PROMOTION_TIER)
  private PromotionTier promotionTier;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private RedemptionRewardResult reward;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private RedemptionGift gift;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private RedemptionLoyaltyCard loyaltyCard;

  public LoyaltiesMembersRedemptionRedeemResponseBody() {
  }

  public LoyaltiesMembersRedemptionRedeemResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique redemption ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by the JSON
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Timestamp representing the date and time when the object was created in ISO 8601 format.
   * @return date
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer ID of the redeeming customer.
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Hashed customer source ID.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the redemption.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts.
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody redemption(String redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Unique redemption ID of the parent redemption.
   * @return redemption
  **/
  @javax.annotation.Nullable
  public String getRedemption() {
    return redemption;
  }


  public void setRedemption(String redemption) {
    this.redemption = redemption;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Redemption result.
   * @return result
  **/
  @javax.annotation.Nonnull
  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Redemption status.
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody relatedRedemptions(RedemptionRelatedRedemptions relatedRedemptions) {
    
    this.relatedRedemptions = relatedRedemptions;
    return this;
  }

   /**
   * Get relatedRedemptions
   * @return relatedRedemptions
  **/
  @javax.annotation.Nullable
  public RedemptionRelatedRedemptions getRelatedRedemptions() {
    return relatedRedemptions;
  }


  public void setRelatedRedemptions(RedemptionRelatedRedemptions relatedRedemptions) {
    this.relatedRedemptions = relatedRedemptions;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody failureCode(String failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed.
   * @return failureCode
  **/
  @javax.annotation.Nullable
  public String getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody failureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed.
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  public String getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody order(OrderCalculatedNoCustomerData order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderCalculatedNoCustomerData getOrder() {
    return order;
  }


  public void setOrder(OrderCalculatedNoCustomerData order) {
    this.order = order;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody channel(RedemptionChannel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nonnull
  public RedemptionChannel getChannel() {
    return channel;
  }


  public void setChannel(RedemptionChannel channel) {
    this.channel = channel;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody customer(SimpleCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public SimpleCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(SimpleCustomer customer) {
    this.customer = customer;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody relatedObjectType(RelatedObjectTypeEnum relatedObjectType) {
    
    this.relatedObjectType = relatedObjectType;
    return this;
  }

   /**
   * Defines the related object.
   * @return relatedObjectType
  **/
  @javax.annotation.Nonnull
  public RelatedObjectTypeEnum getRelatedObjectType() {
    return relatedObjectType;
  }


  public void setRelatedObjectType(RelatedObjectTypeEnum relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody relatedObjectId(String relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * Unique related object ID assigned by Voucherify, i.e. v_lfZi4rcEGe0sN9gmnj40bzwK2FH6QUno for a voucher.
   * @return relatedObjectId
  **/
  @javax.annotation.Nonnull
  public String getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody voucher(Voucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public Voucher getVoucher() {
    return voucher;
  }


  public void setVoucher(Voucher voucher) {
    this.voucher = voucher;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody promotionTier(PromotionTier promotionTier) {
    
    this.promotionTier = promotionTier;
    return this;
  }

   /**
   * Get promotionTier
   * @return promotionTier
  **/
  @javax.annotation.Nullable
  public PromotionTier getPromotionTier() {
    return promotionTier;
  }


  public void setPromotionTier(PromotionTier promotionTier) {
    this.promotionTier = promotionTier;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody reward(RedemptionRewardResult reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nonnull
  public RedemptionRewardResult getReward() {
    return reward;
  }


  public void setReward(RedemptionRewardResult reward) {
    this.reward = reward;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody gift(RedemptionGift gift) {
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nullable
  public RedemptionGift getGift() {
    return gift;
  }


  public void setGift(RedemptionGift gift) {
    this.gift = gift;
  }


  public LoyaltiesMembersRedemptionRedeemResponseBody loyaltyCard(RedemptionLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public RedemptionLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(RedemptionLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesMembersRedemptionRedeemResponseBody loyaltiesMembersRedemptionRedeemResponseBody = (LoyaltiesMembersRedemptionRedeemResponseBody) o;
    return Objects.equals(this.id, loyaltiesMembersRedemptionRedeemResponseBody.id) &&
        Objects.equals(this._object, loyaltiesMembersRedemptionRedeemResponseBody._object) &&
        Objects.equals(this.date, loyaltiesMembersRedemptionRedeemResponseBody.date) &&
        Objects.equals(this.customerId, loyaltiesMembersRedemptionRedeemResponseBody.customerId) &&
        Objects.equals(this.trackingId, loyaltiesMembersRedemptionRedeemResponseBody.trackingId) &&
        Objects.equals(this.metadata, loyaltiesMembersRedemptionRedeemResponseBody.metadata) &&
        Objects.equals(this.amount, loyaltiesMembersRedemptionRedeemResponseBody.amount) &&
        Objects.equals(this.redemption, loyaltiesMembersRedemptionRedeemResponseBody.redemption) &&
        Objects.equals(this.result, loyaltiesMembersRedemptionRedeemResponseBody.result) &&
        Objects.equals(this.status, loyaltiesMembersRedemptionRedeemResponseBody.status) &&
        Objects.equals(this.relatedRedemptions, loyaltiesMembersRedemptionRedeemResponseBody.relatedRedemptions) &&
        Objects.equals(this.failureCode, loyaltiesMembersRedemptionRedeemResponseBody.failureCode) &&
        Objects.equals(this.failureMessage, loyaltiesMembersRedemptionRedeemResponseBody.failureMessage) &&
        Objects.equals(this.order, loyaltiesMembersRedemptionRedeemResponseBody.order) &&
        Objects.equals(this.channel, loyaltiesMembersRedemptionRedeemResponseBody.channel) &&
        Objects.equals(this.customer, loyaltiesMembersRedemptionRedeemResponseBody.customer) &&
        Objects.equals(this.relatedObjectType, loyaltiesMembersRedemptionRedeemResponseBody.relatedObjectType) &&
        Objects.equals(this.relatedObjectId, loyaltiesMembersRedemptionRedeemResponseBody.relatedObjectId) &&
        Objects.equals(this.voucher, loyaltiesMembersRedemptionRedeemResponseBody.voucher) &&
        Objects.equals(this.promotionTier, loyaltiesMembersRedemptionRedeemResponseBody.promotionTier) &&
        Objects.equals(this.reward, loyaltiesMembersRedemptionRedeemResponseBody.reward) &&
        Objects.equals(this.gift, loyaltiesMembersRedemptionRedeemResponseBody.gift) &&
        Objects.equals(this.loyaltyCard, loyaltiesMembersRedemptionRedeemResponseBody.loyaltyCard);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, date, customerId, trackingId, metadata, amount, redemption, result, status, relatedRedemptions, failureCode, failureMessage, order, channel, customer, relatedObjectType, relatedObjectId, voucher, promotionTier, reward, gift, loyaltyCard);
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
    sb.append("class LoyaltiesMembersRedemptionRedeemResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    relatedRedemptions: ").append(toIndentedString(relatedRedemptions)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    promotionTier: ").append(toIndentedString(promotionTier)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("customer_id");
    openapiFields.add("tracking_id");
    openapiFields.add("metadata");
    openapiFields.add("amount");
    openapiFields.add("redemption");
    openapiFields.add("result");
    openapiFields.add("status");
    openapiFields.add("related_redemptions");
    openapiFields.add("failure_code");
    openapiFields.add("failure_message");
    openapiFields.add("order");
    openapiFields.add("channel");
    openapiFields.add("customer");
    openapiFields.add("related_object_type");
    openapiFields.add("related_object_id");
    openapiFields.add("voucher");
    openapiFields.add("promotion_tier");
    openapiFields.add("reward");
    openapiFields.add("gift");
    openapiFields.add("loyalty_card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("date");
    openapiRequiredFields.add("result");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("channel");
    openapiRequiredFields.add("related_object_type");
    openapiRequiredFields.add("related_object_id");
    openapiRequiredFields.add("reward");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesMembersRedemptionRedeemResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesMembersRedemptionRedeemResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesMembersRedemptionRedeemResponseBody is not found in the empty JSON string", LoyaltiesMembersRedemptionRedeemResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesMembersRedemptionRedeemResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesMembersRedemptionRedeemResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltiesMembersRedemptionRedeemResponseBody.openapiRequiredFields) {
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
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a valid element of ObjectEnum enum got `%s` instead", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) && !jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) && !jsonObj.get("tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_id").toString()));
      }
      if ((jsonObj.get("redemption") != null && !jsonObj.get("redemption").isJsonNull()) && !jsonObj.get("redemption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redemption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redemption").toString()));
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
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a valid element of ResultEnum enum got `%s` instead", jsonObj.get("result").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("status");

        if (objectElement != null && !objectElement.isJsonNull()) {
          StatusEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `status` to be not null");
        }
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a valid element of StatusEnum enum got `%s` instead", jsonObj.get("status").toString()));
      }
      // validate the optional field `related_redemptions`
      if (jsonObj.get("related_redemptions") != null && !jsonObj.get("related_redemptions").isJsonNull()) {
        RedemptionRelatedRedemptions.validateJsonElement(jsonObj.get("related_redemptions"));
      }
      if ((jsonObj.get("failure_code") != null && !jsonObj.get("failure_code").isJsonNull()) && !jsonObj.get("failure_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_code").toString()));
      }
      if ((jsonObj.get("failure_message") != null && !jsonObj.get("failure_message").isJsonNull()) && !jsonObj.get("failure_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_message").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        OrderCalculatedNoCustomerData.validateJsonElement(jsonObj.get("order"));
      }
      // validate the required field `channel`
      RedemptionChannel.validateJsonElement(jsonObj.get("channel"));
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      if (!jsonObj.get("related_object_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_object_type").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("related_object_type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          RelatedObjectTypeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `related_object_type` to be not null");
        }
      } catch (IllegalArgumentException e) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object_type` to be a valid element of RelatedObjectTypeEnum enum got `%s` instead", jsonObj.get("related_object_type").toString()));
      }
      if (!jsonObj.get("related_object_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_object_id").toString()));
      }
      // validate the optional field `voucher`
      if (jsonObj.get("voucher") != null && !jsonObj.get("voucher").isJsonNull()) {
        Voucher.validateJsonElement(jsonObj.get("voucher"));
      }
      // validate the optional field `promotion_tier`
      if (jsonObj.get("promotion_tier") != null && !jsonObj.get("promotion_tier").isJsonNull()) {
        PromotionTier.validateJsonElement(jsonObj.get("promotion_tier"));
      }
      // validate the required field `reward`
      RedemptionRewardResult.validateJsonElement(jsonObj.get("reward"));
      // validate the optional field `gift`
      if (jsonObj.get("gift") != null && !jsonObj.get("gift").isJsonNull()) {
        RedemptionGift.validateJsonElement(jsonObj.get("gift"));
      }
      // validate the optional field `loyalty_card`
      if (jsonObj.get("loyalty_card") != null && !jsonObj.get("loyalty_card").isJsonNull()) {
        RedemptionLoyaltyCard.validateJsonElement(jsonObj.get("loyalty_card"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesMembersRedemptionRedeemResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesMembersRedemptionRedeemResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesMembersRedemptionRedeemResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesMembersRedemptionRedeemResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesMembersRedemptionRedeemResponseBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesMembersRedemptionRedeemResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesMembersRedemptionRedeemResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesMembersRedemptionRedeemResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesMembersRedemptionRedeemResponseBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesMembersRedemptionRedeemResponseBody
  */
  public static LoyaltiesMembersRedemptionRedeemResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesMembersRedemptionRedeemResponseBody.class);
  }

 /**
  * Convert an instance of LoyaltiesMembersRedemptionRedeemResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

