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
import io.voucherify.client.model.ApplicableTo;
import java.io.IOException;
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
 * ValidationRuleBaseApplicableTo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValidationRuleBaseApplicableTo {
  public static final String SERIALIZED_NAME_EXCLUDED = "excluded";
  @SerializedName(SERIALIZED_NAME_EXCLUDED)
  private List<ApplicableTo> excluded;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private List<ApplicableTo> included;

  public static final String SERIALIZED_NAME_INCLUDED_ALL = "included_all";
  @SerializedName(SERIALIZED_NAME_INCLUDED_ALL)
  private Boolean includedAll;

  public ValidationRuleBaseApplicableTo() {
  }

  public ValidationRuleBaseApplicableTo excluded(List<ApplicableTo> excluded) {
    
    this.excluded = excluded;
    return this;
  }

  public ValidationRuleBaseApplicableTo addExcludedItem(ApplicableTo excludedItem) {
    if (this.excluded == null) {
      this.excluded = new ArrayList<>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

   /**
   * Defines which items are excluded from a discount.
   * @return excluded
  **/
  @javax.annotation.Nullable
  public List<ApplicableTo> getExcluded() {
    return excluded;
  }


  public void setExcluded(List<ApplicableTo> excluded) {
    this.excluded = excluded;
  }


  public ValidationRuleBaseApplicableTo included(List<ApplicableTo> included) {
    
    this.included = included;
    return this;
  }

  public ValidationRuleBaseApplicableTo addIncludedItem(ApplicableTo includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Defines which items are included in a discount.
   * @return included
  **/
  @javax.annotation.Nullable
  public List<ApplicableTo> getIncluded() {
    return included;
  }


  public void setIncluded(List<ApplicableTo> included) {
    this.included = included;
  }


  public ValidationRuleBaseApplicableTo includedAll(Boolean includedAll) {
    
    this.includedAll = includedAll;
    return this;
  }

   /**
   * Indicates whether all items are included in the discount.
   * @return includedAll
  **/
  @javax.annotation.Nullable
  public Boolean getIncludedAll() {
    return includedAll;
  }


  public void setIncludedAll(Boolean includedAll) {
    this.includedAll = includedAll;
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
   * @return the ValidationRuleBaseApplicableTo instance itself
   */
  public ValidationRuleBaseApplicableTo putAdditionalProperty(String key, Object value) {
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
    ValidationRuleBaseApplicableTo validationRuleBaseApplicableTo = (ValidationRuleBaseApplicableTo) o;
    return Objects.equals(this.excluded, validationRuleBaseApplicableTo.excluded) &&
        Objects.equals(this.included, validationRuleBaseApplicableTo.included) &&
        Objects.equals(this.includedAll, validationRuleBaseApplicableTo.includedAll)&&
        Objects.equals(this.additionalProperties, validationRuleBaseApplicableTo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(excluded, included, includedAll, additionalProperties);
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
    sb.append("class ValidationRuleBaseApplicableTo {\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    includedAll: ").append(toIndentedString(includedAll)).append("\n");
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
    openapiFields.add("excluded");
    openapiFields.add("included");
    openapiFields.add("included_all");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidationRuleBaseApplicableTo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidationRuleBaseApplicableTo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidationRuleBaseApplicableTo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidationRuleBaseApplicableTo.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidationRuleBaseApplicableTo>() {
           @Override
           public void write(JsonWriter out, ValidationRuleBaseApplicableTo value) throws IOException {
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
           public ValidationRuleBaseApplicableTo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ValidationRuleBaseApplicableTo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ValidationRuleBaseApplicableTo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationRuleBaseApplicableTo
  * @throws IOException if the JSON string is invalid with respect to ValidationRuleBaseApplicableTo
  */
  public static ValidationRuleBaseApplicableTo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationRuleBaseApplicableTo.class);
  }

 /**
  * Convert an instance of ValidationRuleBaseApplicableTo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

