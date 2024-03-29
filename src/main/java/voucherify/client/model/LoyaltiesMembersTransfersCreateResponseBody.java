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
import voucherify.client.model.Category;
import voucherify.client.model.LoyaltiesMembersTransfersCreateResponseBodyAssets;
import voucherify.client.model.LoyaltiesMembersTransfersCreateResponseBodyLoyaltyCard;
import voucherify.client.model.LoyaltiesMembersTransfersCreateResponseBodyPublish;
import voucherify.client.model.LoyaltiesMembersTransfersCreateResponseBodyRedemption;
import voucherify.client.model.LoyaltiesMembersTransfersCreateResponseBodyValidityTimeframe;

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
 * Response body schema for **POST** &#x60;/loyalties/{campaignId}/members/{memberId}/transfers&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesMembersTransfersCreateResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private String campaign;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories;

  /**
   * Defines the type of the voucher.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LOYALTY_CARD("LOYALTY_CARD");

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
  private TypeEnum type = TypeEnum.LOYALTY_CARD;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private LoyaltiesMembersTransfersCreateResponseBodyLoyaltyCard loyaltyCard;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private LoyaltiesMembersTransfersCreateResponseBodyValidityTimeframe validityTimeframe;

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<Integer> validityDayOfWeek;

  public static final String SERIALIZED_NAME_PUBLISH = "publish";
  @SerializedName(SERIALIZED_NAME_PUBLISH)
  private LoyaltiesMembersTransfersCreateResponseBodyPublish publish;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private LoyaltiesMembersTransfersCreateResponseBodyRedemption redemption;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private LoyaltiesMembersTransfersCreateResponseBodyAssets assets;

  public static final String SERIALIZED_NAME_IS_REFERRAL_CODE = "is_referral_code";
  @SerializedName(SERIALIZED_NAME_IS_REFERRAL_CODE)
  private Boolean isReferralCode;

  public static final String SERIALIZED_NAME_HOLDER_ID = "holder_id";
  @SerializedName(SERIALIZED_NAME_HOLDER_ID)
  private String holderId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public LoyaltiesMembersTransfersCreateResponseBody() {
  }

  public LoyaltiesMembersTransfersCreateResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Assigned by the Voucherify API, identifies the voucher.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LoyaltiesMembersTransfersCreateResponseBody code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A code that identifies a voucher. Pattern can use all letters of the English alphabet, Arabic numerals, and special characters.
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public LoyaltiesMembersTransfersCreateResponseBody campaign(String campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * A unique campaign name, identifies the voucher&#39;s parent campaign.
   * @return campaign
  **/
  @javax.annotation.Nullable
  public String getCampaign() {
    return campaign;
  }


  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }


  public LoyaltiesMembersTransfersCreateResponseBody campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Assigned by the Voucherify API, identifies the voucher&#39;s parent campaign.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public LoyaltiesMembersTransfersCreateResponseBody category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Tag defining the category that this voucher belongs to. Useful when listing vouchers using the List Vouchers endpoint.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public LoyaltiesMembersTransfersCreateResponseBody categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Unique category ID assigned by Voucherify.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public LoyaltiesMembersTransfersCreateResponseBody categories(List<Category> categories) {
    
    this.categories = categories;
    return this;
  }

  public LoyaltiesMembersTransfersCreateResponseBody addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }


  public LoyaltiesMembersTransfersCreateResponseBody type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the voucher.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public LoyaltiesMembersTransfersCreateResponseBody loyaltyCard(LoyaltiesMembersTransfersCreateResponseBodyLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nonnull
  public LoyaltiesMembersTransfersCreateResponseBodyLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(LoyaltiesMembersTransfersCreateResponseBodyLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }


  public LoyaltiesMembersTransfersCreateResponseBody startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the code starts to be active in ISO 8601 format. Voucher is inactive before this date.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public LoyaltiesMembersTransfersCreateResponseBody expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration timestamp defines when the code expires in ISO 8601 format. Voucher is inactive after this date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public LoyaltiesMembersTransfersCreateResponseBody validityTimeframe(LoyaltiesMembersTransfersCreateResponseBodyValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public LoyaltiesMembersTransfersCreateResponseBodyValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(LoyaltiesMembersTransfersCreateResponseBodyValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public LoyaltiesMembersTransfersCreateResponseBody validityDayOfWeek(List<Integer> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public LoyaltiesMembersTransfersCreateResponseBody addValidityDayOfWeekItem(Integer validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<Integer> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<Integer> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public LoyaltiesMembersTransfersCreateResponseBody publish(LoyaltiesMembersTransfersCreateResponseBodyPublish publish) {
    
    this.publish = publish;
    return this;
  }

   /**
   * Get publish
   * @return publish
  **/
  @javax.annotation.Nullable
  public LoyaltiesMembersTransfersCreateResponseBodyPublish getPublish() {
    return publish;
  }


  public void setPublish(LoyaltiesMembersTransfersCreateResponseBodyPublish publish) {
    this.publish = publish;
  }


  public LoyaltiesMembersTransfersCreateResponseBody redemption(LoyaltiesMembersTransfersCreateResponseBodyRedemption redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public LoyaltiesMembersTransfersCreateResponseBodyRedemption getRedemption() {
    return redemption;
  }


  public void setRedemption(LoyaltiesMembersTransfersCreateResponseBodyRedemption redemption) {
    this.redemption = redemption;
  }


  public LoyaltiesMembersTransfersCreateResponseBody active(String active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the start_date and expiration_date.  - &#x60;true&#x60; indicates an active voucher - &#x60;false&#x60; indicates an inactive voucher
   * @return active
  **/
  @javax.annotation.Nonnull
  public String getActive() {
    return active;
  }


  public void setActive(String active) {
    this.active = active;
  }


  public LoyaltiesMembersTransfersCreateResponseBody additionalInfo(String additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * An optional field to keep any extra textual information about the code such as a code description and details.
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public LoyaltiesMembersTransfersCreateResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the code. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public LoyaltiesMembersTransfersCreateResponseBody assets(LoyaltiesMembersTransfersCreateResponseBodyAssets assets) {
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  public LoyaltiesMembersTransfersCreateResponseBodyAssets getAssets() {
    return assets;
  }


  public void setAssets(LoyaltiesMembersTransfersCreateResponseBodyAssets assets) {
    this.assets = assets;
  }


  public LoyaltiesMembersTransfersCreateResponseBody isReferralCode(Boolean isReferralCode) {
    
    this.isReferralCode = isReferralCode;
    return this;
  }

   /**
   * Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;.
   * @return isReferralCode
  **/
  @javax.annotation.Nonnull
  public Boolean getIsReferralCode() {
    return isReferralCode;
  }


  public void setIsReferralCode(Boolean isReferralCode) {
    this.isReferralCode = isReferralCode;
  }


  public LoyaltiesMembersTransfersCreateResponseBody holderId(String holderId) {
    
    this.holderId = holderId;
    return this;
  }

   /**
   * Unique customer ID of voucher owner.
   * @return holderId
  **/
  @javax.annotation.Nullable
  public String getHolderId() {
    return holderId;
  }


  public void setHolderId(String holderId) {
    this.holderId = holderId;
  }


  public LoyaltiesMembersTransfersCreateResponseBody updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the voucher was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public LoyaltiesMembersTransfersCreateResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
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
    LoyaltiesMembersTransfersCreateResponseBody loyaltiesMembersTransfersCreateResponseBody = (LoyaltiesMembersTransfersCreateResponseBody) o;
    return Objects.equals(this.id, loyaltiesMembersTransfersCreateResponseBody.id) &&
        Objects.equals(this.code, loyaltiesMembersTransfersCreateResponseBody.code) &&
        Objects.equals(this.campaign, loyaltiesMembersTransfersCreateResponseBody.campaign) &&
        Objects.equals(this.campaignId, loyaltiesMembersTransfersCreateResponseBody.campaignId) &&
        Objects.equals(this.category, loyaltiesMembersTransfersCreateResponseBody.category) &&
        Objects.equals(this.categoryId, loyaltiesMembersTransfersCreateResponseBody.categoryId) &&
        Objects.equals(this.categories, loyaltiesMembersTransfersCreateResponseBody.categories) &&
        Objects.equals(this.type, loyaltiesMembersTransfersCreateResponseBody.type) &&
        Objects.equals(this.loyaltyCard, loyaltiesMembersTransfersCreateResponseBody.loyaltyCard) &&
        Objects.equals(this.startDate, loyaltiesMembersTransfersCreateResponseBody.startDate) &&
        Objects.equals(this.expirationDate, loyaltiesMembersTransfersCreateResponseBody.expirationDate) &&
        Objects.equals(this.validityTimeframe, loyaltiesMembersTransfersCreateResponseBody.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, loyaltiesMembersTransfersCreateResponseBody.validityDayOfWeek) &&
        Objects.equals(this.publish, loyaltiesMembersTransfersCreateResponseBody.publish) &&
        Objects.equals(this.redemption, loyaltiesMembersTransfersCreateResponseBody.redemption) &&
        Objects.equals(this.active, loyaltiesMembersTransfersCreateResponseBody.active) &&
        Objects.equals(this.additionalInfo, loyaltiesMembersTransfersCreateResponseBody.additionalInfo) &&
        Objects.equals(this.metadata, loyaltiesMembersTransfersCreateResponseBody.metadata) &&
        Objects.equals(this.assets, loyaltiesMembersTransfersCreateResponseBody.assets) &&
        Objects.equals(this.isReferralCode, loyaltiesMembersTransfersCreateResponseBody.isReferralCode) &&
        Objects.equals(this.holderId, loyaltiesMembersTransfersCreateResponseBody.holderId) &&
        Objects.equals(this.updatedAt, loyaltiesMembersTransfersCreateResponseBody.updatedAt) &&
        Objects.equals(this.createdAt, loyaltiesMembersTransfersCreateResponseBody.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, campaign, campaignId, category, categoryId, categories, type, loyaltyCard, startDate, expirationDate, validityTimeframe, validityDayOfWeek, publish, redemption, active, additionalInfo, metadata, assets, isReferralCode, holderId, updatedAt, createdAt);
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
    sb.append("class LoyaltiesMembersTransfersCreateResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    isReferralCode: ").append(toIndentedString(isReferralCode)).append("\n");
    sb.append("    holderId: ").append(toIndentedString(holderId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("campaign");
    openapiFields.add("campaign_id");
    openapiFields.add("category");
    openapiFields.add("category_id");
    openapiFields.add("categories");
    openapiFields.add("type");
    openapiFields.add("loyalty_card");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("publish");
    openapiFields.add("redemption");
    openapiFields.add("active");
    openapiFields.add("additional_info");
    openapiFields.add("metadata");
    openapiFields.add("assets");
    openapiFields.add("is_referral_code");
    openapiFields.add("holder_id");
    openapiFields.add("updated_at");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("loyalty_card");
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("is_referral_code");
    openapiRequiredFields.add("created_at");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesMembersTransfersCreateResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesMembersTransfersCreateResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesMembersTransfersCreateResponseBody is not found in the empty JSON string", LoyaltiesMembersTransfersCreateResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesMembersTransfersCreateResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesMembersTransfersCreateResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltiesMembersTransfersCreateResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("campaign") != null && !jsonObj.get("campaign").isJsonNull()) && !jsonObj.get("campaign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign").toString()));
      }
      if ((jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull()) {
        JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
        if (jsonArraycategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("categories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
          }

          // validate the optional field `categories` (array)
          for (int i = 0; i < jsonArraycategories.size(); i++) {
            Category.validateJsonElement(jsonArraycategories.get(i));
          };
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
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
      // validate the required field `loyalty_card`
      LoyaltiesMembersTransfersCreateResponseBodyLoyaltyCard.validateJsonElement(jsonObj.get("loyalty_card"));
      // validate the optional field `validity_timeframe`
      if (jsonObj.get("validity_timeframe") != null && !jsonObj.get("validity_timeframe").isJsonNull()) {
        LoyaltiesMembersTransfersCreateResponseBodyValidityTimeframe.validateJsonElement(jsonObj.get("validity_timeframe"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull() && !jsonObj.get("validity_day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity_day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("validity_day_of_week").toString()));
      }
      // validate the optional field `publish`
      if (jsonObj.get("publish") != null && !jsonObj.get("publish").isJsonNull()) {
        LoyaltiesMembersTransfersCreateResponseBodyPublish.validateJsonElement(jsonObj.get("publish"));
      }
      // validate the optional field `redemption`
      if (jsonObj.get("redemption") != null && !jsonObj.get("redemption").isJsonNull()) {
        LoyaltiesMembersTransfersCreateResponseBodyRedemption.validateJsonElement(jsonObj.get("redemption"));
      }
      if (!jsonObj.get("active").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `active` to be a primitive type in the JSON string but got `%s`", jsonObj.get("active").toString()));
      }
      if ((jsonObj.get("additional_info") != null && !jsonObj.get("additional_info").isJsonNull()) && !jsonObj.get("additional_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_info").toString()));
      }
      // validate the optional field `assets`
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        LoyaltiesMembersTransfersCreateResponseBodyAssets.validateJsonElement(jsonObj.get("assets"));
      }
      if ((jsonObj.get("holder_id") != null && !jsonObj.get("holder_id").isJsonNull()) && !jsonObj.get("holder_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holder_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holder_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesMembersTransfersCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesMembersTransfersCreateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesMembersTransfersCreateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesMembersTransfersCreateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesMembersTransfersCreateResponseBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesMembersTransfersCreateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesMembersTransfersCreateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesMembersTransfersCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesMembersTransfersCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesMembersTransfersCreateResponseBody
  */
  public static LoyaltiesMembersTransfersCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesMembersTransfersCreateResponseBody.class);
  }

 /**
  * Convert an instance of LoyaltiesMembersTransfersCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

