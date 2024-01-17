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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Defines stacking rules for redeemables. Read more in the [Help Center](https://support.voucherify.io/article/604-stacking-rules)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class QualificationsStackingRules {
  public static final String SERIALIZED_NAME_REDEEMABLES_LIMIT = "redeemables_limit";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES_LIMIT)
  private Integer redeemablesLimit = 30;

  public static final String SERIALIZED_NAME_APPLICABLE_REDEEMABLES_LIMIT = "applicable_redeemables_limit";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_REDEEMABLES_LIMIT)
  private Integer applicableRedeemablesLimit = 5;

  public static final String SERIALIZED_NAME_APPLICABLE_EXCLUSIVE_REDEEMABLES_LIMIT = "applicable_exclusive_redeemables_limit";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_EXCLUSIVE_REDEEMABLES_LIMIT)
  private Integer applicableExclusiveRedeemablesLimit = 1;

  public static final String SERIALIZED_NAME_EXCLUSIVE_CATEGORIES = "exclusive_categories";
  @SerializedName(SERIALIZED_NAME_EXCLUSIVE_CATEGORIES)
  private List<String> exclusiveCategories = new ArrayList<>();

  public static final String SERIALIZED_NAME_JOINT_CATEGORIES = "joint_categories";
  @SerializedName(SERIALIZED_NAME_JOINT_CATEGORIES)
  private List<String> jointCategories = new ArrayList<>();

  public QualificationsStackingRules() {
  }

  public QualificationsStackingRules redeemablesLimit(Integer redeemablesLimit) {
    
    this.redeemablesLimit = redeemablesLimit;
    return this;
  }

   /**
   * Defines how many redeemables can be sent in one stacking request (note: more redeemables means more processing time!).
   * minimum: 1
   * maximum: 30
   * @return redeemablesLimit
  **/
  @javax.annotation.Nonnull
  public Integer getRedeemablesLimit() {
    return redeemablesLimit;
  }


  public void setRedeemablesLimit(Integer redeemablesLimit) {
    this.redeemablesLimit = redeemablesLimit;
  }


  public QualificationsStackingRules applicableRedeemablesLimit(Integer applicableRedeemablesLimit) {
    
    this.applicableRedeemablesLimit = applicableRedeemablesLimit;
    return this;
  }

   /**
   * Defines how many of the sent redeemables will be applied to the order. For example, a user can select 30 discounts but only 5 will be applied to the order and the remaining will be labelled as SKIPPED.
   * minimum: 1
   * maximum: 30
   * @return applicableRedeemablesLimit
  **/
  @javax.annotation.Nonnull
  public Integer getApplicableRedeemablesLimit() {
    return applicableRedeemablesLimit;
  }


  public void setApplicableRedeemablesLimit(Integer applicableRedeemablesLimit) {
    this.applicableRedeemablesLimit = applicableRedeemablesLimit;
  }


  public QualificationsStackingRules applicableExclusiveRedeemablesLimit(Integer applicableExclusiveRedeemablesLimit) {
    
    this.applicableExclusiveRedeemablesLimit = applicableExclusiveRedeemablesLimit;
    return this;
  }

   /**
   * Defines how many redeemables with an exclusive category can be applied in one request.
   * minimum: 1
   * maximum: 30
   * @return applicableExclusiveRedeemablesLimit
  **/
  @javax.annotation.Nonnull
  public Integer getApplicableExclusiveRedeemablesLimit() {
    return applicableExclusiveRedeemablesLimit;
  }


  public void setApplicableExclusiveRedeemablesLimit(Integer applicableExclusiveRedeemablesLimit) {
    this.applicableExclusiveRedeemablesLimit = applicableExclusiveRedeemablesLimit;
  }


  public QualificationsStackingRules exclusiveCategories(List<String> exclusiveCategories) {
    
    this.exclusiveCategories = exclusiveCategories;
    return this;
  }

  public QualificationsStackingRules addExclusiveCategoriesItem(String exclusiveCategoriesItem) {
    if (this.exclusiveCategories == null) {
      this.exclusiveCategories = new ArrayList<>();
    }
    this.exclusiveCategories.add(exclusiveCategoriesItem);
    return this;
  }

   /**
   * Lists all exclusive categories. A redeemable from a campaign with an exclusive category is the only redeemable to be redeemed when applied with redeemables from other campaigns unless these campaigns are exclusive or joint.
   * @return exclusiveCategories
  **/
  @javax.annotation.Nonnull
  public List<String> getExclusiveCategories() {
    return exclusiveCategories;
  }


  public void setExclusiveCategories(List<String> exclusiveCategories) {
    this.exclusiveCategories = exclusiveCategories;
  }


  public QualificationsStackingRules jointCategories(List<String> jointCategories) {
    
    this.jointCategories = jointCategories;
    return this;
  }

  public QualificationsStackingRules addJointCategoriesItem(String jointCategoriesItem) {
    if (this.jointCategories == null) {
      this.jointCategories = new ArrayList<>();
    }
    this.jointCategories.add(jointCategoriesItem);
    return this;
  }

   /**
   * Lists all joint categories. A campaign with a joint category is always applied regardless of the exclusivity of other campaigns.
   * @return jointCategories
  **/
  @javax.annotation.Nonnull
  public List<String> getJointCategories() {
    return jointCategories;
  }


  public void setJointCategories(List<String> jointCategories) {
    this.jointCategories = jointCategories;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationsStackingRules qualificationsStackingRules = (QualificationsStackingRules) o;
    return Objects.equals(this.redeemablesLimit, qualificationsStackingRules.redeemablesLimit) &&
        Objects.equals(this.applicableRedeemablesLimit, qualificationsStackingRules.applicableRedeemablesLimit) &&
        Objects.equals(this.applicableExclusiveRedeemablesLimit, qualificationsStackingRules.applicableExclusiveRedeemablesLimit) &&
        Objects.equals(this.exclusiveCategories, qualificationsStackingRules.exclusiveCategories) &&
        Objects.equals(this.jointCategories, qualificationsStackingRules.jointCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redeemablesLimit, applicableRedeemablesLimit, applicableExclusiveRedeemablesLimit, exclusiveCategories, jointCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualificationsStackingRules {\n");
    sb.append("    redeemablesLimit: ").append(toIndentedString(redeemablesLimit)).append("\n");
    sb.append("    applicableRedeemablesLimit: ").append(toIndentedString(applicableRedeemablesLimit)).append("\n");
    sb.append("    applicableExclusiveRedeemablesLimit: ").append(toIndentedString(applicableExclusiveRedeemablesLimit)).append("\n");
    sb.append("    exclusiveCategories: ").append(toIndentedString(exclusiveCategories)).append("\n");
    sb.append("    jointCategories: ").append(toIndentedString(jointCategories)).append("\n");
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
    openapiFields.add("redeemables_limit");
    openapiFields.add("applicable_redeemables_limit");
    openapiFields.add("applicable_exclusive_redeemables_limit");
    openapiFields.add("exclusive_categories");
    openapiFields.add("joint_categories");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("redeemables_limit");
    openapiRequiredFields.add("applicable_redeemables_limit");
    openapiRequiredFields.add("applicable_exclusive_redeemables_limit");
    openapiRequiredFields.add("exclusive_categories");
    openapiRequiredFields.add("joint_categories");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QualificationsStackingRules
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QualificationsStackingRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QualificationsStackingRules is not found in the empty JSON string", QualificationsStackingRules.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QualificationsStackingRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QualificationsStackingRules` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QualificationsStackingRules.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("exclusive_categories") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("exclusive_categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclusive_categories` to be an array in the JSON string but got `%s`", jsonObj.get("exclusive_categories").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("joint_categories") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("joint_categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `joint_categories` to be an array in the JSON string but got `%s`", jsonObj.get("joint_categories").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationsStackingRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationsStackingRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationsStackingRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationsStackingRules.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationsStackingRules>() {
           @Override
           public void write(JsonWriter out, QualificationsStackingRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QualificationsStackingRules read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QualificationsStackingRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationsStackingRules
  * @throws IOException if the JSON string is invalid with respect to QualificationsStackingRules
  */
  public static QualificationsStackingRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationsStackingRules.class);
  }

 /**
  * Convert an instance of QualificationsStackingRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

