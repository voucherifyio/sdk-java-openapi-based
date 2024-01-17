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
 * Assignments of business validation rule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class BusValRuleAssignment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RULE_ID = "rule_id";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private String relatedObjectId;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "related_object_type";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  private String relatedObjectType;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * The type of object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    VALIDATION_RULES_ASSIGNMENT("validation_rules_assignment");

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
  private ObjectEnum _object = ObjectEnum.VALIDATION_RULES_ASSIGNMENT;

  /**
   * The validation status of the assignment
   */
  @JsonAdapter(ValidationStatusEnum.Adapter.class)
  public enum ValidationStatusEnum {
    VALID("VALID"),
    
    PARTIALLY_VALID("PARTIALLY_VALID"),
    
    INVALID("INVALID");

    private String value;

    ValidationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidationStatusEnum fromValue(String value) {
      for (ValidationStatusEnum b : ValidationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValidationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValidationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDATION_STATUS = "validation_status";
  @SerializedName(SERIALIZED_NAME_VALIDATION_STATUS)
  private ValidationStatusEnum validationStatus;

  public static final String SERIALIZED_NAME_VALIDATION_OMITTED_RULES = "validation_omitted_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_OMITTED_RULES)
  private List<String> validationOmittedRules;

  public BusValRuleAssignment() {
  }

  public BusValRuleAssignment id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for a assignment
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BusValRuleAssignment ruleId(String ruleId) {
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * The unique identifier for a rule
   * @return ruleId
  **/
  @javax.annotation.Nonnull
  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }


  public BusValRuleAssignment relatedObjectId(String relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * The unique identifier for a related object
   * @return relatedObjectId
  **/
  @javax.annotation.Nonnull
  public String getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public BusValRuleAssignment relatedObjectType(String relatedObjectType) {
    
    this.relatedObjectType = relatedObjectType;
    return this;
  }

   /**
   * The type of related object
   * @return relatedObjectType
  **/
  @javax.annotation.Nonnull
  public String getRelatedObjectType() {
    return relatedObjectType;
  }


  public void setRelatedObjectType(String relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public BusValRuleAssignment createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the object was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public BusValRuleAssignment updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the object was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public BusValRuleAssignment _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public BusValRuleAssignment validationStatus(ValidationStatusEnum validationStatus) {
    
    this.validationStatus = validationStatus;
    return this;
  }

   /**
   * The validation status of the assignment
   * @return validationStatus
  **/
  @javax.annotation.Nullable
  public ValidationStatusEnum getValidationStatus() {
    return validationStatus;
  }


  public void setValidationStatus(ValidationStatusEnum validationStatus) {
    this.validationStatus = validationStatus;
  }


  public BusValRuleAssignment validationOmittedRules(List<String> validationOmittedRules) {
    
    this.validationOmittedRules = validationOmittedRules;
    return this;
  }

  public BusValRuleAssignment addValidationOmittedRulesItem(String validationOmittedRulesItem) {
    if (this.validationOmittedRules == null) {
      this.validationOmittedRules = new ArrayList<>();
    }
    this.validationOmittedRules.add(validationOmittedRulesItem);
    return this;
  }

   /**
   * The list of omitted rules
   * @return validationOmittedRules
  **/
  @javax.annotation.Nullable
  public List<String> getValidationOmittedRules() {
    return validationOmittedRules;
  }


  public void setValidationOmittedRules(List<String> validationOmittedRules) {
    this.validationOmittedRules = validationOmittedRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusValRuleAssignment busValRuleAssignment = (BusValRuleAssignment) o;
    return Objects.equals(this.id, busValRuleAssignment.id) &&
        Objects.equals(this.ruleId, busValRuleAssignment.ruleId) &&
        Objects.equals(this.relatedObjectId, busValRuleAssignment.relatedObjectId) &&
        Objects.equals(this.relatedObjectType, busValRuleAssignment.relatedObjectType) &&
        Objects.equals(this.createdAt, busValRuleAssignment.createdAt) &&
        Objects.equals(this.updatedAt, busValRuleAssignment.updatedAt) &&
        Objects.equals(this._object, busValRuleAssignment._object) &&
        Objects.equals(this.validationStatus, busValRuleAssignment.validationStatus) &&
        Objects.equals(this.validationOmittedRules, busValRuleAssignment.validationOmittedRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleId, relatedObjectId, relatedObjectType, createdAt, updatedAt, _object, validationStatus, validationOmittedRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusValRuleAssignment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    validationStatus: ").append(toIndentedString(validationStatus)).append("\n");
    sb.append("    validationOmittedRules: ").append(toIndentedString(validationOmittedRules)).append("\n");
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
    openapiFields.add("rule_id");
    openapiFields.add("related_object_id");
    openapiFields.add("related_object_type");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("object");
    openapiFields.add("validation_status");
    openapiFields.add("validation_omitted_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("rule_id");
    openapiRequiredFields.add("related_object_id");
    openapiRequiredFields.add("related_object_type");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BusValRuleAssignment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BusValRuleAssignment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusValRuleAssignment is not found in the empty JSON string", BusValRuleAssignment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BusValRuleAssignment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusValRuleAssignment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusValRuleAssignment.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule_id").toString()));
      }
      if (!jsonObj.get("related_object_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_object_id").toString()));
      }
      if (!jsonObj.get("related_object_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_object_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("related_object_type").toString()));
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
      if ((jsonObj.get("validation_status") != null && !jsonObj.get("validation_status").isJsonNull()) && !jsonObj.get("validation_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation_status").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validation_omitted_rules") != null && !jsonObj.get("validation_omitted_rules").isJsonNull() && !jsonObj.get("validation_omitted_rules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation_omitted_rules` to be an array in the JSON string but got `%s`", jsonObj.get("validation_omitted_rules").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusValRuleAssignment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusValRuleAssignment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusValRuleAssignment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusValRuleAssignment.class));

       return (TypeAdapter<T>) new TypeAdapter<BusValRuleAssignment>() {
           @Override
           public void write(JsonWriter out, BusValRuleAssignment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusValRuleAssignment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusValRuleAssignment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusValRuleAssignment
  * @throws IOException if the JSON string is invalid with respect to BusValRuleAssignment
  */
  public static BusValRuleAssignment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusValRuleAssignment.class);
  }

 /**
  * Convert an instance of BusValRuleAssignment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

