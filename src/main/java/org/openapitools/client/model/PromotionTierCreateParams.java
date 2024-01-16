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


package org.openapitools.client.model;

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
import org.openapitools.client.model.PromotionTierAction;
import org.openapitools.client.model.PromotionTierValidityTimeframe;

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

import org.openapitools.client.JSON;

/**
 * This is an object representing a promotion tier create params. Promotion tiers are always assigned to a campaign and cannot be used standalone.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T10:34:33.845621+01:00[Europe/Warsaw]")
public class PromotionTierCreateParams {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BANNER = "banner";
  @SerializedName(SERIALIZED_NAME_BANNER)
  private String banner;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private PromotionTierAction action;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_VALIDATION_RULES = "validation_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES)
  private List<String> validationRules;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_HIERARCHY = "hierarchy";
  @SerializedName(SERIALIZED_NAME_HIERARCHY)
  private Integer hierarchy;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private PromotionTierValidityTimeframe validityTimeframe;

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<Integer> validityDayOfWeek;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public PromotionTierCreateParams() {
  }

  public PromotionTierCreateParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the promotion tier.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PromotionTierCreateParams banner(String banner) {
    
    this.banner = banner;
    return this;
  }

   /**
   * Text to be displayed to your customers on your website.
   * @return banner
  **/
  @javax.annotation.Nullable
  public String getBanner() {
    return banner;
  }


  public void setBanner(String banner) {
    this.banner = banner;
  }


  public PromotionTierCreateParams action(PromotionTierAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  public PromotionTierAction getAction() {
    return action;
  }


  public void setAction(PromotionTierAction action) {
    this.action = action;
  }


  public PromotionTierCreateParams metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the promotion tier. A set of key/value pairs that you can attach to a promotion tier object. It can be useful for storing additional information about the promotion tier in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public PromotionTierCreateParams validationRules(List<String> validationRules) {
    
    this.validationRules = validationRules;
    return this;
  }

  public PromotionTierCreateParams addValidationRulesItem(String validationRulesItem) {
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


  public PromotionTierCreateParams active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag to toggle the promotion tier on or off. You can disable a promotion tier even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* promotion tier - &#x60;false&#x60; indicates an *inactive* promotion tier
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public PromotionTierCreateParams hierarchy(Integer hierarchy) {
    
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * The promotions hierarchy defines the order in which the discounts from different tiers will be applied to a customer&#39;s order. If a customer qualifies for discounts from more than one tier, discounts will be applied in the order defined in the hierarchy.
   * @return hierarchy
  **/
  @javax.annotation.Nullable
  public Integer getHierarchy() {
    return hierarchy;
  }


  public void setHierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
  }


  public PromotionTierCreateParams startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the promotion tier starts to be active in ISO 8601 format. Promotion tier is *inactive before* this date. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public PromotionTierCreateParams expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Activation timestamp defines when the promotion tier expires in ISO 8601 format. Promotion tier is *inactive after* this date. 
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PromotionTierCreateParams validityTimeframe(PromotionTierValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public PromotionTierValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(PromotionTierValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public PromotionTierCreateParams validityDayOfWeek(List<Integer> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public PromotionTierCreateParams addValidityDayOfWeekItem(Integer validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the promotion tier is valid.  - &#x60;0&#x60;  Sunday   - &#x60;1&#x60;  Monday   - &#x60;2&#x60;  Tuesday   - &#x60;3&#x60;  Wednesday   - &#x60;4&#x60;  Thursday   - &#x60;5&#x60;  Friday   - &#x60;6&#x60;  Saturday  
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<Integer> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<Integer> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public PromotionTierCreateParams category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Assign category to the promotion tier.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public PromotionTierCreateParams categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Instead of using the category name, you can alternatively assign a new category to a promotion tier using a unique category ID, i.e. &#x60;cat_0c9da30e7116ba6bba&#x60;.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionTierCreateParams promotionTierCreateParams = (PromotionTierCreateParams) o;
    return Objects.equals(this.name, promotionTierCreateParams.name) &&
        Objects.equals(this.banner, promotionTierCreateParams.banner) &&
        Objects.equals(this.action, promotionTierCreateParams.action) &&
        Objects.equals(this.metadata, promotionTierCreateParams.metadata) &&
        Objects.equals(this.validationRules, promotionTierCreateParams.validationRules) &&
        Objects.equals(this.active, promotionTierCreateParams.active) &&
        Objects.equals(this.hierarchy, promotionTierCreateParams.hierarchy) &&
        Objects.equals(this.startDate, promotionTierCreateParams.startDate) &&
        Objects.equals(this.expirationDate, promotionTierCreateParams.expirationDate) &&
        Objects.equals(this.validityTimeframe, promotionTierCreateParams.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, promotionTierCreateParams.validityDayOfWeek) &&
        Objects.equals(this.category, promotionTierCreateParams.category) &&
        Objects.equals(this.categoryId, promotionTierCreateParams.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, banner, action, metadata, validationRules, active, hierarchy, startDate, expirationDate, validityTimeframe, validityDayOfWeek, category, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionTierCreateParams {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    validationRules: ").append(toIndentedString(validationRules)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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
    openapiFields.add("banner");
    openapiFields.add("action");
    openapiFields.add("metadata");
    openapiFields.add("validation_rules");
    openapiFields.add("active");
    openapiFields.add("hierarchy");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("category");
    openapiFields.add("category_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PromotionTierCreateParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PromotionTierCreateParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromotionTierCreateParams is not found in the empty JSON string", PromotionTierCreateParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PromotionTierCreateParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromotionTierCreateParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PromotionTierCreateParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("banner") != null && !jsonObj.get("banner").isJsonNull()) && !jsonObj.get("banner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banner").toString()));
      }
      // validate the optional field `action`
      if (jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) {
        PromotionTierAction.validateJsonElement(jsonObj.get("action"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validation_rules") != null && !jsonObj.get("validation_rules").isJsonNull() && !jsonObj.get("validation_rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_rules` to be an array in the JSON string but got `%s`", jsonObj.get("validation_rules").toString()));
      }
      // validate the optional field `validity_timeframe`
      if (jsonObj.get("validity_timeframe") != null && !jsonObj.get("validity_timeframe").isJsonNull()) {
        PromotionTierValidityTimeframe.validateJsonElement(jsonObj.get("validity_timeframe"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validity_day_of_week") != null && !jsonObj.get("validity_day_of_week").isJsonNull() && !jsonObj.get("validity_day_of_week").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validity_day_of_week` to be an array in the JSON string but got `%s`", jsonObj.get("validity_day_of_week").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionTierCreateParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionTierCreateParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionTierCreateParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionTierCreateParams.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionTierCreateParams>() {
           @Override
           public void write(JsonWriter out, PromotionTierCreateParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionTierCreateParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionTierCreateParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionTierCreateParams
  * @throws IOException if the JSON string is invalid with respect to PromotionTierCreateParams
  */
  public static PromotionTierCreateParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionTierCreateParams.class);
  }

 /**
  * Convert an instance of PromotionTierCreateParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

