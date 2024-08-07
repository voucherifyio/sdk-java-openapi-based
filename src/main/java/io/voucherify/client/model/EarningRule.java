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


package io.voucherify.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.voucherify.client.model.EarningRuleBaseCustomEvent;
import io.voucherify.client.model.EarningRuleBaseLoyalty;
import io.voucherify.client.model.EarningRuleBaseSegment;
import io.voucherify.client.model.EarningRuleBaseSource;
import io.voucherify.client.model.EarningRuleEvent;
import io.voucherify.client.model.ValidityHours;
import io.voucherify.client.model.ValidityTimeframe;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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

import io.voucherify.client.JSON;

/**
 * EarningRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EarningRule {
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
        return null;
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
  private ValidityTimeframe validityTimeframe;

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
        return null;
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

  public EarningRule() {
  }

  public EarningRule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Assigned by the Voucherify API, identifies the earning rule object.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EarningRule createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the earning rule was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public EarningRule loyalty(EarningRuleBaseLoyalty loyalty) {
    
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  @javax.annotation.Nullable
  public EarningRuleBaseLoyalty getLoyalty() {
    return loyalty;
  }


  public void setLoyalty(EarningRuleBaseLoyalty loyalty) {
    this.loyalty = loyalty;
  }


  public EarningRule event(EarningRuleEvent event) {
    
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


  public EarningRule customEvent(EarningRuleBaseCustomEvent customEvent) {
    
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


  public EarningRule segment(EarningRuleBaseSegment segment) {
    
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


  public EarningRule source(EarningRuleBaseSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public EarningRuleBaseSource getSource() {
    return source;
  }


  public void setSource(EarningRuleBaseSource source) {
    this.source = source;
  }


  public EarningRule _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. Default is earning_rule.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public EarningRule automationId(String automationId) {
    
    this.automationId = automationId;
    return this;
  }

   /**
   * For internal use by Voucherify.
   * @return automationId
  **/
  @javax.annotation.Nullable
  public String getAutomationId() {
    return automationId;
  }


  public void setAutomationId(String automationId) {
    this.automationId = automationId;
  }


  public EarningRule startDate(String startDate) {
    
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


  public EarningRule expirationDate(String expirationDate) {
    
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


  public EarningRule validityTimeframe(ValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public ValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(ValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public EarningRule validityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public EarningRule addValidityDayOfWeekItem(ValidityDayOfWeekEnum validityDayOfWeekItem) {
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
  public List<ValidityDayOfWeekEnum> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public EarningRule validityHours(ValidityHours validityHours) {
    
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


  public EarningRule metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the earning rule. A set of key/value pairs that you can attach to an earning rule object. It can be useful for storing additional information about the earning rule in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public EarningRule validationRuleId(String validationRuleId) {
    
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


  public EarningRule updatedAt(OffsetDateTime updatedAt) {
    
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


  public EarningRule active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag to toggle the earning rule on or off. You can disable an earning rule even though it&#39;s within the active period defined by the start_date and expiration_date of the campaign or the earning rule&#39;s own start_date and expiration_date.  - &#x60;true&#x60; indicates an active earning rule - &#x60;false&#x60; indicates an inactive earning rule
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
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
   * @return the EarningRule instance itself
   */
  public EarningRule putAdditionalProperty(String key, Object value) {
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
    EarningRule earningRule = (EarningRule) o;
    return Objects.equals(this.id, earningRule.id) &&
        Objects.equals(this.createdAt, earningRule.createdAt) &&
        Objects.equals(this.loyalty, earningRule.loyalty) &&
        Objects.equals(this.event, earningRule.event) &&
        Objects.equals(this.customEvent, earningRule.customEvent) &&
        Objects.equals(this.segment, earningRule.segment) &&
        Objects.equals(this.source, earningRule.source) &&
        Objects.equals(this._object, earningRule._object) &&
        Objects.equals(this.automationId, earningRule.automationId) &&
        Objects.equals(this.startDate, earningRule.startDate) &&
        Objects.equals(this.expirationDate, earningRule.expirationDate) &&
        Objects.equals(this.validityTimeframe, earningRule.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, earningRule.validityDayOfWeek) &&
        Objects.equals(this.validityHours, earningRule.validityHours) &&
        Objects.equals(this.metadata, earningRule.metadata) &&
        Objects.equals(this.validationRuleId, earningRule.validationRuleId) &&
        Objects.equals(this.updatedAt, earningRule.updatedAt) &&
        Objects.equals(this.active, earningRule.active)&&
        Objects.equals(this.additionalProperties, earningRule.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, loyalty, event, customEvent, segment, source, _object, automationId, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours, metadata, validationRuleId, updatedAt, active, additionalProperties);
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
    sb.append("class EarningRule {\n");
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EarningRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EarningRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EarningRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EarningRule.class));

       return (TypeAdapter<T>) new TypeAdapter<EarningRule>() {
           @Override
           public void write(JsonWriter out, EarningRule value) throws IOException {
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
           public EarningRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EarningRule instance = thisAdapter.fromJsonTree(jsonObj);
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
                     return null;
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
  * Create an instance of EarningRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EarningRule
  * @throws IOException if the JSON string is invalid with respect to EarningRule
  */
  public static EarningRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EarningRule.class);
  }

 /**
  * Convert an instance of EarningRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

