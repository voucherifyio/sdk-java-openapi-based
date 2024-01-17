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
import voucherify.client.model.FieldConditions;
import voucherify.client.model.Junction;

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
 * ExportVoucherFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class ExportVoucherFilters {
  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private FieldConditions code;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private FieldConditions voucherType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private FieldConditions value;

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discount_type";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  private FieldConditions discountType;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private FieldConditions campaign;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private FieldConditions category;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private FieldConditions startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private FieldConditions expirationDate;

  public static final String SERIALIZED_NAME_GIFT_BALANCE = "gift_balance";
  @SerializedName(SERIALIZED_NAME_GIFT_BALANCE)
  private FieldConditions giftBalance;

  public static final String SERIALIZED_NAME_LOYALTY_BALANCE = "loyalty_balance";
  @SerializedName(SERIALIZED_NAME_LOYALTY_BALANCE)
  private FieldConditions loyaltyBalance;

  public static final String SERIALIZED_NAME_REDEMPTION_QUANTITY = "redemption_quantity";
  @SerializedName(SERIALIZED_NAME_REDEMPTION_QUANTITY)
  private FieldConditions redemptionQuantity;

  public static final String SERIALIZED_NAME_REDEMPTION_COUNT = "redemption_count";
  @SerializedName(SERIALIZED_NAME_REDEMPTION_COUNT)
  private FieldConditions redemptionCount;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private FieldConditions active;

  public static final String SERIALIZED_NAME_QR_CODE = "qr_code";
  @SerializedName(SERIALIZED_NAME_QR_CODE)
  private FieldConditions qrCode;

  public static final String SERIALIZED_NAME_BAR_CODE = "bar_code";
  @SerializedName(SERIALIZED_NAME_BAR_CODE)
  private FieldConditions barCode;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private FieldConditions metadata;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private FieldConditions id;

  public static final String SERIALIZED_NAME_IS_REFERRAL_CODE = "is_referral_code";
  @SerializedName(SERIALIZED_NAME_IS_REFERRAL_CODE)
  private FieldConditions isReferralCode;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private FieldConditions createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private FieldConditions updatedAt;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME_INTERVAL = "validity_timeframe_interval";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME_INTERVAL)
  private FieldConditions validityTimeframeInterval;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME_DURATION = "validity_timeframe_duration";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME_DURATION)
  private FieldConditions validityTimeframeDuration;

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private FieldConditions validityDayOfWeek;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT_LIMIT = "discount_amount_limit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT_LIMIT)
  private FieldConditions discountAmountLimit;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private FieldConditions campaignId;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private FieldConditions additionalInfo;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private FieldConditions customerId;

  public static final String SERIALIZED_NAME_DISCOUNT_UNIT_TYPE = "discount_unit_type";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_UNIT_TYPE)
  private FieldConditions discountUnitType;

  public static final String SERIALIZED_NAME_DISCOUNT_UNIT_EFFECT = "discount_unit_effect";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_UNIT_EFFECT)
  private FieldConditions discountUnitEffect;

  public static final String SERIALIZED_NAME_CUSTOMER_SOURCE_ID = "customer_source_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SOURCE_ID)
  private FieldConditions customerSourceId;

  public ExportVoucherFilters() {
  }

  public ExportVoucherFilters junction(Junction junction) {
    
    this.junction = junction;
    return this;
  }

   /**
   * Get junction
   * @return junction
  **/
  @javax.annotation.Nullable
  public Junction getJunction() {
    return junction;
  }


  public void setJunction(Junction junction) {
    this.junction = junction;
  }


  public ExportVoucherFilters code(FieldConditions code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  public FieldConditions getCode() {
    return code;
  }


  public void setCode(FieldConditions code) {
    this.code = code;
  }


  public ExportVoucherFilters voucherType(FieldConditions voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * Get voucherType
   * @return voucherType
  **/
  @javax.annotation.Nullable
  public FieldConditions getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(FieldConditions voucherType) {
    this.voucherType = voucherType;
  }


  public ExportVoucherFilters value(FieldConditions value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public FieldConditions getValue() {
    return value;
  }


  public void setValue(FieldConditions value) {
    this.value = value;
  }


  public ExportVoucherFilters discountType(FieldConditions discountType) {
    
    this.discountType = discountType;
    return this;
  }

   /**
   * Get discountType
   * @return discountType
  **/
  @javax.annotation.Nullable
  public FieldConditions getDiscountType() {
    return discountType;
  }


  public void setDiscountType(FieldConditions discountType) {
    this.discountType = discountType;
  }


  public ExportVoucherFilters campaign(FieldConditions campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  public FieldConditions getCampaign() {
    return campaign;
  }


  public void setCampaign(FieldConditions campaign) {
    this.campaign = campaign;
  }


  public ExportVoucherFilters category(FieldConditions category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  public FieldConditions getCategory() {
    return category;
  }


  public void setCategory(FieldConditions category) {
    this.category = category;
  }


  public ExportVoucherFilters startDate(FieldConditions startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  public FieldConditions getStartDate() {
    return startDate;
  }


  public void setStartDate(FieldConditions startDate) {
    this.startDate = startDate;
  }


  public ExportVoucherFilters expirationDate(FieldConditions expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public FieldConditions getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(FieldConditions expirationDate) {
    this.expirationDate = expirationDate;
  }


  public ExportVoucherFilters giftBalance(FieldConditions giftBalance) {
    
    this.giftBalance = giftBalance;
    return this;
  }

   /**
   * Get giftBalance
   * @return giftBalance
  **/
  @javax.annotation.Nullable
  public FieldConditions getGiftBalance() {
    return giftBalance;
  }


  public void setGiftBalance(FieldConditions giftBalance) {
    this.giftBalance = giftBalance;
  }


  public ExportVoucherFilters loyaltyBalance(FieldConditions loyaltyBalance) {
    
    this.loyaltyBalance = loyaltyBalance;
    return this;
  }

   /**
   * Get loyaltyBalance
   * @return loyaltyBalance
  **/
  @javax.annotation.Nullable
  public FieldConditions getLoyaltyBalance() {
    return loyaltyBalance;
  }


  public void setLoyaltyBalance(FieldConditions loyaltyBalance) {
    this.loyaltyBalance = loyaltyBalance;
  }


  public ExportVoucherFilters redemptionQuantity(FieldConditions redemptionQuantity) {
    
    this.redemptionQuantity = redemptionQuantity;
    return this;
  }

   /**
   * Get redemptionQuantity
   * @return redemptionQuantity
  **/
  @javax.annotation.Nullable
  public FieldConditions getRedemptionQuantity() {
    return redemptionQuantity;
  }


  public void setRedemptionQuantity(FieldConditions redemptionQuantity) {
    this.redemptionQuantity = redemptionQuantity;
  }


  public ExportVoucherFilters redemptionCount(FieldConditions redemptionCount) {
    
    this.redemptionCount = redemptionCount;
    return this;
  }

   /**
   * Get redemptionCount
   * @return redemptionCount
  **/
  @javax.annotation.Nullable
  public FieldConditions getRedemptionCount() {
    return redemptionCount;
  }


  public void setRedemptionCount(FieldConditions redemptionCount) {
    this.redemptionCount = redemptionCount;
  }


  public ExportVoucherFilters active(FieldConditions active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public FieldConditions getActive() {
    return active;
  }


  public void setActive(FieldConditions active) {
    this.active = active;
  }


  public ExportVoucherFilters qrCode(FieldConditions qrCode) {
    
    this.qrCode = qrCode;
    return this;
  }

   /**
   * Get qrCode
   * @return qrCode
  **/
  @javax.annotation.Nullable
  public FieldConditions getQrCode() {
    return qrCode;
  }


  public void setQrCode(FieldConditions qrCode) {
    this.qrCode = qrCode;
  }


  public ExportVoucherFilters barCode(FieldConditions barCode) {
    
    this.barCode = barCode;
    return this;
  }

   /**
   * Get barCode
   * @return barCode
  **/
  @javax.annotation.Nullable
  public FieldConditions getBarCode() {
    return barCode;
  }


  public void setBarCode(FieldConditions barCode) {
    this.barCode = barCode;
  }


  public ExportVoucherFilters metadata(FieldConditions metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public FieldConditions getMetadata() {
    return metadata;
  }


  public void setMetadata(FieldConditions metadata) {
    this.metadata = metadata;
  }


  public ExportVoucherFilters id(FieldConditions id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public FieldConditions getId() {
    return id;
  }


  public void setId(FieldConditions id) {
    this.id = id;
  }


  public ExportVoucherFilters isReferralCode(FieldConditions isReferralCode) {
    
    this.isReferralCode = isReferralCode;
    return this;
  }

   /**
   * Get isReferralCode
   * @return isReferralCode
  **/
  @javax.annotation.Nullable
  public FieldConditions getIsReferralCode() {
    return isReferralCode;
  }


  public void setIsReferralCode(FieldConditions isReferralCode) {
    this.isReferralCode = isReferralCode;
  }


  public ExportVoucherFilters createdAt(FieldConditions createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public FieldConditions getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(FieldConditions createdAt) {
    this.createdAt = createdAt;
  }


  public ExportVoucherFilters updatedAt(FieldConditions updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public FieldConditions getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(FieldConditions updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ExportVoucherFilters validityTimeframeInterval(FieldConditions validityTimeframeInterval) {
    
    this.validityTimeframeInterval = validityTimeframeInterval;
    return this;
  }

   /**
   * Get validityTimeframeInterval
   * @return validityTimeframeInterval
  **/
  @javax.annotation.Nullable
  public FieldConditions getValidityTimeframeInterval() {
    return validityTimeframeInterval;
  }


  public void setValidityTimeframeInterval(FieldConditions validityTimeframeInterval) {
    this.validityTimeframeInterval = validityTimeframeInterval;
  }


  public ExportVoucherFilters validityTimeframeDuration(FieldConditions validityTimeframeDuration) {
    
    this.validityTimeframeDuration = validityTimeframeDuration;
    return this;
  }

   /**
   * Get validityTimeframeDuration
   * @return validityTimeframeDuration
  **/
  @javax.annotation.Nullable
  public FieldConditions getValidityTimeframeDuration() {
    return validityTimeframeDuration;
  }


  public void setValidityTimeframeDuration(FieldConditions validityTimeframeDuration) {
    this.validityTimeframeDuration = validityTimeframeDuration;
  }


  public ExportVoucherFilters validityDayOfWeek(FieldConditions validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

   /**
   * Get validityDayOfWeek
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public FieldConditions getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(FieldConditions validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public ExportVoucherFilters discountAmountLimit(FieldConditions discountAmountLimit) {
    
    this.discountAmountLimit = discountAmountLimit;
    return this;
  }

   /**
   * Get discountAmountLimit
   * @return discountAmountLimit
  **/
  @javax.annotation.Nullable
  public FieldConditions getDiscountAmountLimit() {
    return discountAmountLimit;
  }


  public void setDiscountAmountLimit(FieldConditions discountAmountLimit) {
    this.discountAmountLimit = discountAmountLimit;
  }


  public ExportVoucherFilters campaignId(FieldConditions campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public FieldConditions getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(FieldConditions campaignId) {
    this.campaignId = campaignId;
  }


  public ExportVoucherFilters additionalInfo(FieldConditions additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public FieldConditions getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(FieldConditions additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public ExportVoucherFilters customerId(FieldConditions customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @javax.annotation.Nullable
  public FieldConditions getCustomerId() {
    return customerId;
  }


  public void setCustomerId(FieldConditions customerId) {
    this.customerId = customerId;
  }


  public ExportVoucherFilters discountUnitType(FieldConditions discountUnitType) {
    
    this.discountUnitType = discountUnitType;
    return this;
  }

   /**
   * Get discountUnitType
   * @return discountUnitType
  **/
  @javax.annotation.Nullable
  public FieldConditions getDiscountUnitType() {
    return discountUnitType;
  }


  public void setDiscountUnitType(FieldConditions discountUnitType) {
    this.discountUnitType = discountUnitType;
  }


  public ExportVoucherFilters discountUnitEffect(FieldConditions discountUnitEffect) {
    
    this.discountUnitEffect = discountUnitEffect;
    return this;
  }

   /**
   * Get discountUnitEffect
   * @return discountUnitEffect
  **/
  @javax.annotation.Nullable
  public FieldConditions getDiscountUnitEffect() {
    return discountUnitEffect;
  }


  public void setDiscountUnitEffect(FieldConditions discountUnitEffect) {
    this.discountUnitEffect = discountUnitEffect;
  }


  public ExportVoucherFilters customerSourceId(FieldConditions customerSourceId) {
    
    this.customerSourceId = customerSourceId;
    return this;
  }

   /**
   * Get customerSourceId
   * @return customerSourceId
  **/
  @javax.annotation.Nullable
  public FieldConditions getCustomerSourceId() {
    return customerSourceId;
  }


  public void setCustomerSourceId(FieldConditions customerSourceId) {
    this.customerSourceId = customerSourceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportVoucherFilters exportVoucherFilters = (ExportVoucherFilters) o;
    return Objects.equals(this.junction, exportVoucherFilters.junction) &&
        Objects.equals(this.code, exportVoucherFilters.code) &&
        Objects.equals(this.voucherType, exportVoucherFilters.voucherType) &&
        Objects.equals(this.value, exportVoucherFilters.value) &&
        Objects.equals(this.discountType, exportVoucherFilters.discountType) &&
        Objects.equals(this.campaign, exportVoucherFilters.campaign) &&
        Objects.equals(this.category, exportVoucherFilters.category) &&
        Objects.equals(this.startDate, exportVoucherFilters.startDate) &&
        Objects.equals(this.expirationDate, exportVoucherFilters.expirationDate) &&
        Objects.equals(this.giftBalance, exportVoucherFilters.giftBalance) &&
        Objects.equals(this.loyaltyBalance, exportVoucherFilters.loyaltyBalance) &&
        Objects.equals(this.redemptionQuantity, exportVoucherFilters.redemptionQuantity) &&
        Objects.equals(this.redemptionCount, exportVoucherFilters.redemptionCount) &&
        Objects.equals(this.active, exportVoucherFilters.active) &&
        Objects.equals(this.qrCode, exportVoucherFilters.qrCode) &&
        Objects.equals(this.barCode, exportVoucherFilters.barCode) &&
        Objects.equals(this.metadata, exportVoucherFilters.metadata) &&
        Objects.equals(this.id, exportVoucherFilters.id) &&
        Objects.equals(this.isReferralCode, exportVoucherFilters.isReferralCode) &&
        Objects.equals(this.createdAt, exportVoucherFilters.createdAt) &&
        Objects.equals(this.updatedAt, exportVoucherFilters.updatedAt) &&
        Objects.equals(this.validityTimeframeInterval, exportVoucherFilters.validityTimeframeInterval) &&
        Objects.equals(this.validityTimeframeDuration, exportVoucherFilters.validityTimeframeDuration) &&
        Objects.equals(this.validityDayOfWeek, exportVoucherFilters.validityDayOfWeek) &&
        Objects.equals(this.discountAmountLimit, exportVoucherFilters.discountAmountLimit) &&
        Objects.equals(this.campaignId, exportVoucherFilters.campaignId) &&
        Objects.equals(this.additionalInfo, exportVoucherFilters.additionalInfo) &&
        Objects.equals(this.customerId, exportVoucherFilters.customerId) &&
        Objects.equals(this.discountUnitType, exportVoucherFilters.discountUnitType) &&
        Objects.equals(this.discountUnitEffect, exportVoucherFilters.discountUnitEffect) &&
        Objects.equals(this.customerSourceId, exportVoucherFilters.customerSourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junction, code, voucherType, value, discountType, campaign, category, startDate, expirationDate, giftBalance, loyaltyBalance, redemptionQuantity, redemptionCount, active, qrCode, barCode, metadata, id, isReferralCode, createdAt, updatedAt, validityTimeframeInterval, validityTimeframeDuration, validityDayOfWeek, discountAmountLimit, campaignId, additionalInfo, customerId, discountUnitType, discountUnitEffect, customerSourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportVoucherFilters {\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    giftBalance: ").append(toIndentedString(giftBalance)).append("\n");
    sb.append("    loyaltyBalance: ").append(toIndentedString(loyaltyBalance)).append("\n");
    sb.append("    redemptionQuantity: ").append(toIndentedString(redemptionQuantity)).append("\n");
    sb.append("    redemptionCount: ").append(toIndentedString(redemptionCount)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
    sb.append("    barCode: ").append(toIndentedString(barCode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isReferralCode: ").append(toIndentedString(isReferralCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    validityTimeframeInterval: ").append(toIndentedString(validityTimeframeInterval)).append("\n");
    sb.append("    validityTimeframeDuration: ").append(toIndentedString(validityTimeframeDuration)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    discountAmountLimit: ").append(toIndentedString(discountAmountLimit)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    discountUnitType: ").append(toIndentedString(discountUnitType)).append("\n");
    sb.append("    discountUnitEffect: ").append(toIndentedString(discountUnitEffect)).append("\n");
    sb.append("    customerSourceId: ").append(toIndentedString(customerSourceId)).append("\n");
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
    openapiFields.add("junction");
    openapiFields.add("code");
    openapiFields.add("voucher_type");
    openapiFields.add("value");
    openapiFields.add("discount_type");
    openapiFields.add("campaign");
    openapiFields.add("category");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("gift_balance");
    openapiFields.add("loyalty_balance");
    openapiFields.add("redemption_quantity");
    openapiFields.add("redemption_count");
    openapiFields.add("active");
    openapiFields.add("qr_code");
    openapiFields.add("bar_code");
    openapiFields.add("metadata");
    openapiFields.add("id");
    openapiFields.add("is_referral_code");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("validity_timeframe_interval");
    openapiFields.add("validity_timeframe_duration");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("discount_amount_limit");
    openapiFields.add("campaign_id");
    openapiFields.add("additional_info");
    openapiFields.add("customer_id");
    openapiFields.add("discount_unit_type");
    openapiFields.add("discount_unit_effect");
    openapiFields.add("customer_source_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportVoucherFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportVoucherFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportVoucherFilters is not found in the empty JSON string", ExportVoucherFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportVoucherFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportVoucherFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `code`
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("code"));
      }
      // validate the optional field `voucher_type`
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("voucher_type"));
      }
      // validate the optional field `value`
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("value"));
      }
      // validate the optional field `discount_type`
      if (jsonObj.get("discount_type") != null && !jsonObj.get("discount_type").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("discount_type"));
      }
      // validate the optional field `campaign`
      if (jsonObj.get("campaign") != null && !jsonObj.get("campaign").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("campaign"));
      }
      // validate the optional field `category`
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("category"));
      }
      // validate the optional field `start_date`
      if (jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("start_date"));
      }
      // validate the optional field `expiration_date`
      if (jsonObj.get("expiration_date") != null && !jsonObj.get("expiration_date").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("expiration_date"));
      }
      // validate the optional field `gift_balance`
      if (jsonObj.get("gift_balance") != null && !jsonObj.get("gift_balance").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("gift_balance"));
      }
      // validate the optional field `loyalty_balance`
      if (jsonObj.get("loyalty_balance") != null && !jsonObj.get("loyalty_balance").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("loyalty_balance"));
      }
      // validate the optional field `redemption_quantity`
      if (jsonObj.get("redemption_quantity") != null && !jsonObj.get("redemption_quantity").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("redemption_quantity"));
      }
      // validate the optional field `redemption_count`
      if (jsonObj.get("redemption_count") != null && !jsonObj.get("redemption_count").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("redemption_count"));
      }
      // validate the optional field `active`
      if (jsonObj.get("active") != null && !jsonObj.get("active").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("active"));
      }
      // validate the optional field `qr_code`
      if (jsonObj.get("qr_code") != null && !jsonObj.get("qr_code").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("qr_code"));
      }
      // validate the optional field `bar_code`
      if (jsonObj.get("bar_code") != null && !jsonObj.get("bar_code").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("bar_code"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("metadata"));
      }
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("id"));
      }
      // validate the optional field `is_referral_code`
      if (jsonObj.get("is_referral_code") != null && !jsonObj.get("is_referral_code").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("is_referral_code"));
      }
      // validate the optional field `created_at`
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("created_at"));
      }
      // validate the optional field `updated_at`
      if (jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("updated_at"));
      }
      // validate the optional field `validity_timeframe_interval`
      if (jsonObj.get("validity_timeframe_interval") != null && !jsonObj.get("validity_timeframe_interval").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("validity_timeframe_interval"));
      }
      // validate the optional field `validity_timeframe_duration`
      if (jsonObj.get("validity_timeframe_duration") != null && !jsonObj.get("validity_timeframe_duration").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("validity_timeframe_duration"));
      }
      // validate the optional field `validity_day_of_week`
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("validity_day_of_week"));
      }
      // validate the optional field `discount_amount_limit`
      if (jsonObj.get("discount_amount_limit") != null && !jsonObj.get("discount_amount_limit").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("discount_amount_limit"));
      }
      // validate the optional field `campaign_id`
      if (jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("campaign_id"));
      }
      // validate the optional field `additional_info`
      if (jsonObj.get("additional_info") != null && !jsonObj.get("additional_info").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("additional_info"));
      }
      // validate the optional field `customer_id`
      if (jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("customer_id"));
      }
      // validate the optional field `discount_unit_type`
      if (jsonObj.get("discount_unit_type") != null && !jsonObj.get("discount_unit_type").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("discount_unit_type"));
      }
      // validate the optional field `discount_unit_effect`
      if (jsonObj.get("discount_unit_effect") != null && !jsonObj.get("discount_unit_effect").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("discount_unit_effect"));
      }
      // validate the optional field `customer_source_id`
      if (jsonObj.get("customer_source_id") != null && !jsonObj.get("customer_source_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("customer_source_id"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportVoucherFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportVoucherFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportVoucherFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportVoucherFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportVoucherFilters>() {
           @Override
           public void write(JsonWriter out, ExportVoucherFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportVoucherFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportVoucherFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportVoucherFilters
  * @throws IOException if the JSON string is invalid with respect to ExportVoucherFilters
  */
  public static ExportVoucherFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportVoucherFilters.class);
  }

 /**
  * Convert an instance of ExportVoucherFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

