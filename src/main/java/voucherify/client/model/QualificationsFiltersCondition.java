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

import voucherify.client.JSON;

/**
 * QualificationsFiltersCondition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QualificationsFiltersCondition {
  public static final String SERIALIZED_NAME_$_IS = "$is";
  @SerializedName(SERIALIZED_NAME_$_IS)
  private List<String> $is;

  public static final String SERIALIZED_NAME_$_IS_NOT = "$is_not";
  @SerializedName(SERIALIZED_NAME_$_IS_NOT)
  private List<String> $isNot;

  public static final String SERIALIZED_NAME_$_HAS_VALUE = "$has_value";
  @SerializedName(SERIALIZED_NAME_$_HAS_VALUE)
  private Object $hasValue = null;

  public static final String SERIALIZED_NAME_$_IS_UNKNOWN = "$is_unknown";
  @SerializedName(SERIALIZED_NAME_$_IS_UNKNOWN)
  private Object $isUnknown = null;

  public static final String SERIALIZED_NAME_$_IN = "$in";
  @SerializedName(SERIALIZED_NAME_$_IN)
  private List<String> $in;

  public static final String SERIALIZED_NAME_$_NOT_IN = "$not_in";
  @SerializedName(SERIALIZED_NAME_$_NOT_IN)
  private List<String> $notIn;

  public QualificationsFiltersCondition() {
  }

  public QualificationsFiltersCondition $is(List<String> $is) {
    
    this.$is = $is;
    return this;
  }

  public QualificationsFiltersCondition add$IsItem(String $isItem) {
    if (this.$is == null) {
      this.$is = new ArrayList<>();
    }
    this.$is.add($isItem);
    return this;
  }

   /**
   * Get $is
   * @return $is
  **/
  @javax.annotation.Nullable
  public List<String> get$Is() {
    return $is;
  }


  public void set$Is(List<String> $is) {
    this.$is = $is;
  }


  public QualificationsFiltersCondition $isNot(List<String> $isNot) {
    
    this.$isNot = $isNot;
    return this;
  }

  public QualificationsFiltersCondition add$IsNotItem(String $isNotItem) {
    if (this.$isNot == null) {
      this.$isNot = new ArrayList<>();
    }
    this.$isNot.add($isNotItem);
    return this;
  }

   /**
   * Get $isNot
   * @return $isNot
  **/
  @javax.annotation.Nullable
  public List<String> get$IsNot() {
    return $isNot;
  }


  public void set$IsNot(List<String> $isNot) {
    this.$isNot = $isNot;
  }


  public QualificationsFiltersCondition $hasValue(Object $hasValue) {
    
    this.$hasValue = $hasValue;
    return this;
  }

   /**
   * Get $hasValue
   * @return $hasValue
  **/
  @javax.annotation.Nullable
  public Object get$HasValue() {
    return $hasValue;
  }


  public void set$HasValue(Object $hasValue) {
    this.$hasValue = $hasValue;
  }


  public QualificationsFiltersCondition $isUnknown(Object $isUnknown) {
    
    this.$isUnknown = $isUnknown;
    return this;
  }

   /**
   * Get $isUnknown
   * @return $isUnknown
  **/
  @javax.annotation.Nullable
  public Object get$IsUnknown() {
    return $isUnknown;
  }


  public void set$IsUnknown(Object $isUnknown) {
    this.$isUnknown = $isUnknown;
  }


  public QualificationsFiltersCondition $in(List<String> $in) {
    
    this.$in = $in;
    return this;
  }

  public QualificationsFiltersCondition add$InItem(String $inItem) {
    if (this.$in == null) {
      this.$in = new ArrayList<>();
    }
    this.$in.add($inItem);
    return this;
  }

   /**
   * Get $in
   * @return $in
  **/
  @javax.annotation.Nullable
  public List<String> get$In() {
    return $in;
  }


  public void set$In(List<String> $in) {
    this.$in = $in;
  }


  public QualificationsFiltersCondition $notIn(List<String> $notIn) {
    
    this.$notIn = $notIn;
    return this;
  }

  public QualificationsFiltersCondition add$NotInItem(String $notInItem) {
    if (this.$notIn == null) {
      this.$notIn = new ArrayList<>();
    }
    this.$notIn.add($notInItem);
    return this;
  }

   /**
   * Get $notIn
   * @return $notIn
  **/
  @javax.annotation.Nullable
  public List<String> get$NotIn() {
    return $notIn;
  }


  public void set$NotIn(List<String> $notIn) {
    this.$notIn = $notIn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationsFiltersCondition qualificationsFiltersCondition = (QualificationsFiltersCondition) o;
    return Objects.equals(this.$is, qualificationsFiltersCondition.$is) &&
        Objects.equals(this.$isNot, qualificationsFiltersCondition.$isNot) &&
        Objects.equals(this.$hasValue, qualificationsFiltersCondition.$hasValue) &&
        Objects.equals(this.$isUnknown, qualificationsFiltersCondition.$isUnknown) &&
        Objects.equals(this.$in, qualificationsFiltersCondition.$in) &&
        Objects.equals(this.$notIn, qualificationsFiltersCondition.$notIn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash($is, $isNot, $hasValue, $isUnknown, $in, $notIn);
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
    sb.append("class QualificationsFiltersCondition {\n");
    sb.append("    $is: ").append(toIndentedString($is)).append("\n");
    sb.append("    $isNot: ").append(toIndentedString($isNot)).append("\n");
    sb.append("    $hasValue: ").append(toIndentedString($hasValue)).append("\n");
    sb.append("    $isUnknown: ").append(toIndentedString($isUnknown)).append("\n");
    sb.append("    $in: ").append(toIndentedString($in)).append("\n");
    sb.append("    $notIn: ").append(toIndentedString($notIn)).append("\n");
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
    openapiFields.add("$is");
    openapiFields.add("$is_not");
    openapiFields.add("$has_value");
    openapiFields.add("$is_unknown");
    openapiFields.add("$in");
    openapiFields.add("$not_in");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QualificationsFiltersCondition
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QualificationsFiltersCondition.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QualificationsFiltersCondition is not found in the empty JSON string", QualificationsFiltersCondition.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QualificationsFiltersCondition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QualificationsFiltersCondition` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("$is") != null && !jsonObj.get("$is").isJsonNull() && !jsonObj.get("$is").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `$is` to be an array in the JSON string but got `%s`", jsonObj.get("$is").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("$is_not") != null && !jsonObj.get("$is_not").isJsonNull() && !jsonObj.get("$is_not").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `$is_not` to be an array in the JSON string but got `%s`", jsonObj.get("$is_not").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("$in") != null && !jsonObj.get("$in").isJsonNull() && !jsonObj.get("$in").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `$in` to be an array in the JSON string but got `%s`", jsonObj.get("$in").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("$not_in") != null && !jsonObj.get("$not_in").isJsonNull() && !jsonObj.get("$not_in").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `$not_in` to be an array in the JSON string but got `%s`", jsonObj.get("$not_in").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationsFiltersCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationsFiltersCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationsFiltersCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationsFiltersCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationsFiltersCondition>() {
           @Override
           public void write(JsonWriter out, QualificationsFiltersCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QualificationsFiltersCondition read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QualificationsFiltersCondition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationsFiltersCondition
  * @throws IOException if the JSON string is invalid with respect to QualificationsFiltersCondition
  */
  public static QualificationsFiltersCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationsFiltersCondition.class);
  }

 /**
  * Convert an instance of QualificationsFiltersCondition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

