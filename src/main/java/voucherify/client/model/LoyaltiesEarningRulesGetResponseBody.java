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
import voucherify.client.model.EarningRuleBaseCustomEvent;
import voucherify.client.model.EarningRuleBaseLoyalty;
import voucherify.client.model.EarningRuleBaseSegment;
import voucherify.client.model.EarningRuleBaseSource;
import voucherify.client.model.EarningRuleBaseValidityTimeframe;
import voucherify.client.model.EarningRuleEvent;
import voucherify.client.model.ValidityHours;

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
 * Response body schema for **GET** &#x60;/loyalties/{campaignId}/earning-rules/{earningRuleId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesEarningRulesGetResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_LOYALTY = "loyalty";
  @SerializedName(SERIALIZED_NAME_LOYALTY)
  private EarningRuleBaseLoyalty loyalty;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EarningRuleEvent event;

  public static final String SERIALIZED_NAME_CUSTOM_EVENT = "custom_event";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT)
  private EarningRuleBaseCustomEvent customEvent;

  public static final String SERIALIZED_NAME_SEGMENT = "segment";
  @SerializedName(SERIALIZED_NAME_SEGMENT)
  private EarningRuleBaseSegment segment;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private EarningRuleBaseSource source;

  /**
   * The type of the object represented by JSON. Default is earning_rule.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    EARNING_RULE("earning_rule");

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
  private ObjectEnum _object = ObjectEnum.EARNING_RULE;

  public static final String SERIALIZED_NAME_AUTOMATION_ID = "automation_id";
  @SerializedName(SERIALIZED_NAME_AUTOMATION_ID)
  private String automationId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private EarningRuleBaseValidityTimeframe validityTimeframe;

  /**
   * Gets or Sets validityDayOfWeek
   */
  @JsonAdapter(ValidityDayOfWeekEnum.Adapter.class)
  public enum ValidityDayOfWeekEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    ValidityDayOfWeekEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidityDayOfWeekEnum fromValue(Integer value) {
      for (ValidityDayOfWeekEnum b : ValidityDayOfWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValidityDayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidityDayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidityDayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ValidityDayOfWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<ValidityDayOfWeekEnum> validityDayOfWeek;

  public static final String SERIALIZED_NAME_VALIDITY_HOURS = "validity_hours";
  @SerializedName(SERIALIZED_NAME_VALIDITY_HOURS)
  private ValidityHours validityHours;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_VALIDATION_RULE_ID = "validation_rule_id";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULE_ID)
  private String validationRuleId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public LoyaltiesEarningRulesGetResponseBody() {
  }

  public LoyaltiesEarningRulesGetResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Assigned by the Voucherify API, identifies the earning rule object.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LoyaltiesEarningRulesGetResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the earning rule was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LoyaltiesEarningRulesGetResponseBody loyalty(EarningRuleBaseLoyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nonnull
  public EarningRuleBaseLoyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(EarningRuleBaseLoyalty loyalty) {
    this.loyalty = loyalty;
  }


  public LoyaltiesEarningRulesGetResponseBody event(EarningRuleEvent event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  public EarningRuleEvent getEvent() {
    return event;
  }


  public void setEvent(EarningRuleEvent event) {
    this.event = event;
  }


  public LoyaltiesEarningRulesGetResponseBody customEvent(EarningRuleBaseCustomEvent customEvent) {
    
    this.customEvent = customEvent;
    return this;
  }

   /**
   * Get customEvent
   * @return customEvent
  **/
  @javax.annotation.Nullable
  public EarningRuleBaseCustomEvent getCustomEvent() {
    return customEvent;
  }


  public void setCustomEvent(EarningRuleBaseCustomEvent customEvent) {
    this.customEvent = customEvent;
  }


  public LoyaltiesEarningRulesGetResponseBody segment(EarningRuleBaseSegment segment) {
    
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @javax.annotation.Nullable
  public EarningRuleBaseSegment getSegment() {
    return segment;
  }


  public void setSegment(EarningRuleBaseSegment segment) {
    this.segment = segment;
  }


  public LoyaltiesEarningRulesGetResponseBody source(EarningRuleBaseSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  public EarningRuleBaseSource getSource() {
    return source;
  }


  public void setSource(EarningRuleBaseSource source) {
    this.source = source;
  }


  public LoyaltiesEarningRulesGetResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. Default is earning_rule.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public LoyaltiesEarningRulesGetResponseBody automationId(String automationId) {
    
    this.automationId = automationId;
    return this;
  }

   /**
   * For internal use by Voucherify.
   * @return automationId
  **/
  @javax.annotation.Nonnull
  public String getAutomationId() {
    return automationId;
  }


  public void setAutomationId(String automationId) {
    this.automationId = automationId;
  }


  public LoyaltiesEarningRulesGetResponseBody startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date defines when the earning rule starts to be active. Activation timestamp is presented in the ISO 8601 format. Earning rule is inactive before this date. If you don&#39;t define the start date for an earning rule, it&#39;ll inherit the campaign start date by default.
   * @return startDate
  **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public LoyaltiesEarningRulesGetResponseBody expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration date defines when the earning rule expires. Expiration timestamp is presented in the ISO 8601 format. Earning rule is inactive after this date.If you don&#39;t define the expiration date for an earning rule, it&#39;ll inherit the campaign expiration date by default.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public LoyaltiesEarningRulesGetResponseBody validityTimeframe(EarningRuleBaseValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public EarningRuleBaseValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(EarningRuleBaseValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public LoyaltiesEarningRulesGetResponseBody validityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public LoyaltiesEarningRulesGetResponseBody addValidityDayOfWeekItem(ValidityDayOfWeekEnum validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the earning rule is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<ValidityDayOfWeekEnum> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public LoyaltiesEarningRulesGetResponseBody validityHours(ValidityHours validityHours) {
    
    this.validityHours = validityHours;
    return this;
  }

   /**
   * Get validityHours
   * @return validityHours
  **/
  @javax.annotation.Nullable
  public ValidityHours getValidityHours() {
    return validityHours;
  }


  public void setValidityHours(ValidityHours validityHours) {
    this.validityHours = validityHours;
  }


  public LoyaltiesEarningRulesGetResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the earning rule. A set of key/value pairs that you can attach to an earning rule object. It can be useful for storing additional information about the earning rule in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public LoyaltiesEarningRulesGetResponseBody validationRuleId(String validationRuleId) {
    
    this.validationRuleId = validationRuleId;
    return this;
  }

   /**
   * A unique validation rule identifier assigned by the Voucherify API. The validation rule is verified before points are added to the balance.
   * @return validationRuleId
  **/
  @javax.annotation.Nullable
  public String getValidationRuleId() {
    return validationRuleId;
  }


  public void setValidationRuleId(String validationRuleId) {
    this.validationRuleId = validationRuleId;
  }


  public LoyaltiesEarningRulesGetResponseBody updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the earning rule was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public LoyaltiesEarningRulesGetResponseBody active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag to toggle the earning rule on or off. You can disable an earning rule even though it&#39;s within the active period defined by the start_date and expiration_date of the campaign or the earning rule&#39;s own start_date and expiration_date.  - &#x60;true&#x60; indicates an active earning rule - &#x60;false&#x60; indicates an inactive earning rule
   * @return active
  **/
  @javax.annotation.Nonnull
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesEarningRulesGetResponseBody loyaltiesEarningRulesGetResponseBody = (LoyaltiesEarningRulesGetResponseBody) o;
    return Objects.equals(this.id, loyaltiesEarningRulesGetResponseBody.id) &&
        Objects.equals(this.createdAt, loyaltiesEarningRulesGetResponseBody.createdAt) &&
        Objects.equals(this.loyalty, loyaltiesEarningRulesGetResponseBody.loyalty) &&
        Objects.equals(this.event, loyaltiesEarningRulesGetResponseBody.event) &&
        Objects.equals(this.customEvent, loyaltiesEarningRulesGetResponseBody.customEvent) &&
        Objects.equals(this.segment, loyaltiesEarningRulesGetResponseBody.segment) &&
        Objects.equals(this.source, loyaltiesEarningRulesGetResponseBody.source) &&
        Objects.equals(this._object, loyaltiesEarningRulesGetResponseBody._object) &&
        Objects.equals(this.automationId, loyaltiesEarningRulesGetResponseBody.automationId) &&
        Objects.equals(this.startDate, loyaltiesEarningRulesGetResponseBody.startDate) &&
        Objects.equals(this.expirationDate, loyaltiesEarningRulesGetResponseBody.expirationDate) &&
        Objects.equals(this.validityTimeframe, loyaltiesEarningRulesGetResponseBody.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, loyaltiesEarningRulesGetResponseBody.validityDayOfWeek) &&
        Objects.equals(this.validityHours, loyaltiesEarningRulesGetResponseBody.validityHours) &&
        Objects.equals(this.metadata, loyaltiesEarningRulesGetResponseBody.metadata) &&
        Objects.equals(this.validationRuleId, loyaltiesEarningRulesGetResponseBody.validationRuleId) &&
        Objects.equals(this.updatedAt, loyaltiesEarningRulesGetResponseBody.updatedAt) &&
        Objects.equals(this.active, loyaltiesEarningRulesGetResponseBody.active);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, loyalty, event, customEvent, segment, source, _object, automationId, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours, metadata, validationRuleId, updatedAt, active);
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
    sb.append("class LoyaltiesEarningRulesGetResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    customEvent: ").append(toIndentedString(customEvent)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    automationId: ").append(toIndentedString(automationId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    validityHours: ").append(toIndentedString(validityHours)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    validationRuleId: ").append(toIndentedString(validationRuleId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("loyalty");
    openapiFields.add("event");
    openapiFields.add("custom_event");
    openapiFields.add("segment");
    openapiFields.add("source");
    openapiFields.add("object");
    openapiFields.add("automation_id");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("validity_hours");
    openapiFields.add("metadata");
    openapiFields.add("validation_rule_id");
    openapiFields.add("updated_at");
    openapiFields.add("active");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("loyalty");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("automation_id");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("active");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesEarningRulesGetResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesEarningRulesGetResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesEarningRulesGetResponseBody is not found in the empty JSON string", LoyaltiesEarningRulesGetResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesEarningRulesGetResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesEarningRulesGetResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltiesEarningRulesGetResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `loyalty`
      EarningRuleBaseLoyalty.validateJsonElement(jsonObj.get("loyalty"));
      // validate the optional field `custom_event`
      if (jsonObj.get("custom_event") != null && !jsonObj.get("custom_event").isJsonNull()) {
        EarningRuleBaseCustomEvent.validateJsonElement(jsonObj.get("custom_event"));
      }
      // validate the optional field `segment`
      if (jsonObj.get("segment") != null && !jsonObj.get("segment").isJsonNull()) {
        EarningRuleBaseSegment.validateJsonElement(jsonObj.get("segment"));
      }
      // validate the required field `source`
      EarningRuleBaseSource.validateJsonElement(jsonObj.get("source"));
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
      if (!jsonObj.get("automation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `automation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("automation_id").toString()));
      }
      if ((jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if ((jsonObj.get("expiration_date") != null && !jsonObj.get("expiration_date").isJsonNull()) && !jsonObj.get("expiration_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_date").toString()));
      }
      // validate the optional field `validity_timeframe`
      if (jsonObj.get("validity_timeframe") != null && !jsonObj.get("validity_timeframe").isJsonNull()) {
        EarningRuleBaseValidityTimeframe.validateJsonElement(jsonObj.get("validity_timeframe"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull() && !jsonObj.get("validity_day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity_day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("validity_day_of_week").toString()));
      }
      // validate the optional field `validity_hours`
      if (jsonObj.get("validity_hours") != null && !jsonObj.get("validity_hours").isJsonNull()) {
        ValidityHours.validateJsonElement(jsonObj.get("validity_hours"));
      }
      if ((jsonObj.get("validation_rule_id") != null && !jsonObj.get("validation_rule_id").isJsonNull()) && !jsonObj.get("validation_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation_rule_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesEarningRulesGetResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesEarningRulesGetResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesEarningRulesGetResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesGetResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesEarningRulesGetResponseBody>() {
           @Override
           public void write(JsonWriter out, LoyaltiesEarningRulesGetResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesEarningRulesGetResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesEarningRulesGetResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesEarningRulesGetResponseBody
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesEarningRulesGetResponseBody
  */
  public static LoyaltiesEarningRulesGetResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesEarningRulesGetResponseBody.class);
  }

 /**
  * Convert an instance of LoyaltiesEarningRulesGetResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

