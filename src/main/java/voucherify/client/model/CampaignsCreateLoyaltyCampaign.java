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
import voucherify.client.model.CampaignBaseValidityTimeframe;
import voucherify.client.model.CampaignLoyaltyVoucher;

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
 * CampaignsCreateLoyaltyCampaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignsCreateLoyaltyCampaign {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Defines whether the campaign can be updated with new vouchers after campaign creation.      - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method).     -  &#x60;STATIC&#x60;: vouchers need to be manually published.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AUTO_UPDATE("AUTO_UPDATE"),
    
    STATIC("STATIC");

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

  public static final String SERIALIZED_NAME_JOIN_ONCE = "join_once";
  @SerializedName(SERIALIZED_NAME_JOIN_ONCE)
  private Boolean joinOnce;

  public static final String SERIALIZED_NAME_AUTO_JOIN = "auto_join";
  @SerializedName(SERIALIZED_NAME_AUTO_JOIN)
  private Boolean autoJoin;

  public static final String SERIALIZED_NAME_USE_VOUCHER_METADATA_SCHEMA = "use_voucher_metadata_schema";
  @SerializedName(SERIALIZED_NAME_USE_VOUCHER_METADATA_SCHEMA)
  private Boolean useVoucherMetadataSchema;

  public static final String SERIALIZED_NAME_VOUCHERS_COUNT = "vouchers_count";
  @SerializedName(SERIALIZED_NAME_VOUCHERS_COUNT)
  private Integer vouchersCount;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private CampaignBaseValidityTimeframe validityTimeframe;

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<Integer> validityDayOfWeek;

  public static final String SERIALIZED_NAME_ACTIVITY_DURATION_AFTER_PUBLISHING = "activity_duration_after_publishing";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DURATION_AFTER_PUBLISHING)
  private String activityDurationAfterPublishing;

  public static final String SERIALIZED_NAME_VALIDATION_RULES = "validation_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES)
  private List<String> validationRules;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  /**
   * Type of campaign.
   */
  @JsonAdapter(CampaignTypeEnum.Adapter.class)
  public enum CampaignTypeEnum {
    LOYALTY_PROGRAM("LOYALTY_PROGRAM");

    private String value;

    CampaignTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignTypeEnum fromValue(String value) {
      for (CampaignTypeEnum b : CampaignTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CampaignTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private CampaignTypeEnum campaignType = CampaignTypeEnum.LOYALTY_PROGRAM;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private CampaignLoyaltyVoucher voucher;

  public CampaignsCreateLoyaltyCampaign() {
  }

  public CampaignsCreateLoyaltyCampaign name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Campaign name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CampaignsCreateLoyaltyCampaign description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An optional field to keep any extra textual information about the campaign such as a campaign description and details.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CampaignsCreateLoyaltyCampaign type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines whether the campaign can be updated with new vouchers after campaign creation.      - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method).     -  &#x60;STATIC&#x60;: vouchers need to be manually published.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CampaignsCreateLoyaltyCampaign joinOnce(Boolean joinOnce) {
    
    this.joinOnce = joinOnce;
    return this;
  }

   /**
   * If this value is set to &#x60;true&#x60;, customers will be able to join the campaign only once.
   * @return joinOnce
  **/
  @javax.annotation.Nullable
  public Boolean getJoinOnce() {
    return joinOnce;
  }


  public void setJoinOnce(Boolean joinOnce) {
    this.joinOnce = joinOnce;
  }


  public CampaignsCreateLoyaltyCampaign autoJoin(Boolean autoJoin) {
    
    this.autoJoin = autoJoin;
    return this;
  }

   /**
   * Indicates whether customers will be able to auto-join a loyalty campaign if any earning rule is fulfilled.
   * @return autoJoin
  **/
  @javax.annotation.Nullable
  public Boolean getAutoJoin() {
    return autoJoin;
  }


  public void setAutoJoin(Boolean autoJoin) {
    this.autoJoin = autoJoin;
  }


  public CampaignsCreateLoyaltyCampaign useVoucherMetadataSchema(Boolean useVoucherMetadataSchema) {
    
    this.useVoucherMetadataSchema = useVoucherMetadataSchema;
    return this;
  }

   /**
   * Flag indicating whether the campaign is to use the voucher&#39;s metadata schema instead of the campaign metadata schema.
   * @return useVoucherMetadataSchema
  **/
  @javax.annotation.Nullable
  public Boolean getUseVoucherMetadataSchema() {
    return useVoucherMetadataSchema;
  }


  public void setUseVoucherMetadataSchema(Boolean useVoucherMetadataSchema) {
    this.useVoucherMetadataSchema = useVoucherMetadataSchema;
  }


  public CampaignsCreateLoyaltyCampaign vouchersCount(Integer vouchersCount) {
    
    this.vouchersCount = vouchersCount;
    return this;
  }

   /**
   * Total number of unique vouchers in campaign (size of campaign).
   * @return vouchersCount
  **/
  @javax.annotation.Nullable
  public Integer getVouchersCount() {
    return vouchersCount;
  }


  public void setVouchersCount(Integer vouchersCount) {
    this.vouchersCount = vouchersCount;
  }


  public CampaignsCreateLoyaltyCampaign startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CampaignsCreateLoyaltyCampaign expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is *inactive after* this date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public CampaignsCreateLoyaltyCampaign validityTimeframe(CampaignBaseValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public CampaignBaseValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(CampaignBaseValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public CampaignsCreateLoyaltyCampaign validityDayOfWeek(List<Integer> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public CampaignsCreateLoyaltyCampaign addValidityDayOfWeekItem(Integer validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the campaign is valid.  - &#x60;0&#x60;  Sunday   - &#x60;1&#x60;  Monday   - &#x60;2&#x60;  Tuesday   - &#x60;3&#x60;  Wednesday   - &#x60;4&#x60;  Thursday   - &#x60;5&#x60;  Friday   - &#x60;6&#x60;  Saturday  
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<Integer> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<Integer> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public CampaignsCreateLoyaltyCampaign activityDurationAfterPublishing(String activityDurationAfterPublishing) {
    
    this.activityDurationAfterPublishing = activityDurationAfterPublishing;
    return this;
  }

   /**
   * Defines the amount of time the campaign will be active in ISO 8601 format after publishing. For example, a campaign with a &#x60;duration&#x60; of &#x60;P24D&#x60; will be valid for a duration of 24 days.
   * @return activityDurationAfterPublishing
  **/
  @javax.annotation.Nullable
  public String getActivityDurationAfterPublishing() {
    return activityDurationAfterPublishing;
  }


  public void setActivityDurationAfterPublishing(String activityDurationAfterPublishing) {
    this.activityDurationAfterPublishing = activityDurationAfterPublishing;
  }


  public CampaignsCreateLoyaltyCampaign validationRules(List<String> validationRules) {
    
    this.validationRules = validationRules;
    return this;
  }

  public CampaignsCreateLoyaltyCampaign addValidationRulesItem(String validationRulesItem) {
    if (this.validationRules == null) {
      this.validationRules = new ArrayList<>();
    }
    this.validationRules.add(validationRulesItem);
    return this;
  }

   /**
   * Array containing the ID of the validation rule associated with the promotion tier.
   * @return validationRules
  **/
  @javax.annotation.Nullable
  public List<String> getValidationRules() {
    return validationRules;
  }


  public void setValidationRules(List<String> validationRules) {
    this.validationRules = validationRules;
  }


  public CampaignsCreateLoyaltyCampaign categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Unique category ID that this campaign belongs to. Either pass this parameter OR the &#x60;category&#x60;.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public CampaignsCreateLoyaltyCampaign category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CampaignsCreateLoyaltyCampaign metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the campaign. A set of key/value pairs that you can attach to a campaign object. It can be useful for storing additional information about the campaign in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CampaignsCreateLoyaltyCampaign campaignType(CampaignTypeEnum campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Type of campaign.
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public CampaignTypeEnum getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(CampaignTypeEnum campaignType) {
    this.campaignType = campaignType;
  }


  public CampaignsCreateLoyaltyCampaign voucher(CampaignLoyaltyVoucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public CampaignLoyaltyVoucher getVoucher() {
    return voucher;
  }


  public void setVoucher(CampaignLoyaltyVoucher voucher) {
    this.voucher = voucher;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsCreateLoyaltyCampaign campaignsCreateLoyaltyCampaign = (CampaignsCreateLoyaltyCampaign) o;
    return Objects.equals(this.name, campaignsCreateLoyaltyCampaign.name) &&
        Objects.equals(this.description, campaignsCreateLoyaltyCampaign.description) &&
        Objects.equals(this.type, campaignsCreateLoyaltyCampaign.type) &&
        Objects.equals(this.joinOnce, campaignsCreateLoyaltyCampaign.joinOnce) &&
        Objects.equals(this.autoJoin, campaignsCreateLoyaltyCampaign.autoJoin) &&
        Objects.equals(this.useVoucherMetadataSchema, campaignsCreateLoyaltyCampaign.useVoucherMetadataSchema) &&
        Objects.equals(this.vouchersCount, campaignsCreateLoyaltyCampaign.vouchersCount) &&
        Objects.equals(this.startDate, campaignsCreateLoyaltyCampaign.startDate) &&
        Objects.equals(this.expirationDate, campaignsCreateLoyaltyCampaign.expirationDate) &&
        Objects.equals(this.validityTimeframe, campaignsCreateLoyaltyCampaign.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, campaignsCreateLoyaltyCampaign.validityDayOfWeek) &&
        Objects.equals(this.activityDurationAfterPublishing, campaignsCreateLoyaltyCampaign.activityDurationAfterPublishing) &&
        Objects.equals(this.validationRules, campaignsCreateLoyaltyCampaign.validationRules) &&
        Objects.equals(this.categoryId, campaignsCreateLoyaltyCampaign.categoryId) &&
        Objects.equals(this.category, campaignsCreateLoyaltyCampaign.category) &&
        Objects.equals(this.metadata, campaignsCreateLoyaltyCampaign.metadata) &&
        Objects.equals(this.campaignType, campaignsCreateLoyaltyCampaign.campaignType) &&
        Objects.equals(this.voucher, campaignsCreateLoyaltyCampaign.voucher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, joinOnce, autoJoin, useVoucherMetadataSchema, vouchersCount, startDate, expirationDate, validityTimeframe, validityDayOfWeek, activityDurationAfterPublishing, validationRules, categoryId, category, metadata, campaignType, voucher);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsCreateLoyaltyCampaign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    joinOnce: ").append(toIndentedString(joinOnce)).append("\n");
    sb.append("    autoJoin: ").append(toIndentedString(autoJoin)).append("\n");
    sb.append("    useVoucherMetadataSchema: ").append(toIndentedString(useVoucherMetadataSchema)).append("\n");
    sb.append("    vouchersCount: ").append(toIndentedString(vouchersCount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    activityDurationAfterPublishing: ").append(toIndentedString(activityDurationAfterPublishing)).append("\n");
    sb.append("    validationRules: ").append(toIndentedString(validationRules)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("type");
    openapiFields.add("join_once");
    openapiFields.add("auto_join");
    openapiFields.add("use_voucher_metadata_schema");
    openapiFields.add("vouchers_count");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("activity_duration_after_publishing");
    openapiFields.add("validation_rules");
    openapiFields.add("category_id");
    openapiFields.add("category");
    openapiFields.add("metadata");
    openapiFields.add("campaign_type");
    openapiFields.add("voucher");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsCreateLoyaltyCampaign
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CampaignsCreateLoyaltyCampaign.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignsCreateLoyaltyCampaign is not found in the empty JSON string", CampaignsCreateLoyaltyCampaign.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CampaignsCreateLoyaltyCampaign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CampaignsCreateLoyaltyCampaign` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
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
      // validate the optional field `validity_timeframe`
      if (jsonObj.get("validity_timeframe") != null && !jsonObj.get("validity_timeframe").isJsonNull()) {
        CampaignBaseValidityTimeframe.validateJsonElement(jsonObj.get("validity_timeframe"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull() && !jsonObj.get("validity_day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity_day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("validity_day_of_week").toString()));
      }
      if ((jsonObj.get("activity_duration_after_publishing") != null && !jsonObj.get("activity_duration_after_publishing").isJsonNull()) && !jsonObj.get("activity_duration_after_publishing").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_duration_after_publishing` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_duration_after_publishing").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validation_rules") != null && !jsonObj.get("validation_rules").isJsonNull() && !jsonObj.get("validation_rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_rules` to be an array in the JSON string but got `%s`", jsonObj.get("validation_rules").toString()));
      }
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("campaign_type") != null && !jsonObj.get("campaign_type").isJsonNull()) && !jsonObj.get("campaign_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_type").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("campaign_type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          CampaignTypeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `campaign_type` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("campaign_type") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `campaign_type` to be a valid element of CampaignTypeEnum enum got `%s` instead", jsonObj.get("campaign_type").toString()));
        }
      }
      // validate the optional field `voucher`
      if (jsonObj.get("voucher") != null && !jsonObj.get("voucher").isJsonNull()) {
        CampaignLoyaltyVoucher.validateJsonElement(jsonObj.get("voucher"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsCreateLoyaltyCampaign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsCreateLoyaltyCampaign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsCreateLoyaltyCampaign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreateLoyaltyCampaign.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsCreateLoyaltyCampaign>() {
           @Override
           public void write(JsonWriter out, CampaignsCreateLoyaltyCampaign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignsCreateLoyaltyCampaign read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignsCreateLoyaltyCampaign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsCreateLoyaltyCampaign
  * @throws IOException if the JSON string is invalid with respect to CampaignsCreateLoyaltyCampaign
  */
  public static CampaignsCreateLoyaltyCampaign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsCreateLoyaltyCampaign.class);
  }

 /**
  * Convert an instance of CampaignsCreateLoyaltyCampaign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

