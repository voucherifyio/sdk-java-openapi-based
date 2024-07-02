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
 * ParameterFiltersListCustomerRedeemablesCampaignTypeConditions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ParameterFiltersListCustomerRedeemablesCampaignTypeConditions {
  /**
   * Gets or Sets $in
   */
  @JsonAdapter(InEnum.Adapter.class)
  public enum InEnum {
    LOYALTY_PROGRAM("LOYALTY_PROGRAM"),
    
    GIFT_VOUCHERS("GIFT_VOUCHERS"),
    
    DISCOUNT_COUPONS("DISCOUNT_COUPONS"),
    
    REFERRAL_PROGRAM("REFERRAL_PROGRAM");

    private String value;

    InEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InEnum fromValue(String value) {
      for (InEnum b : InEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<InEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_$_IN = "$in";
  @SerializedName(SERIALIZED_NAME_$_IN)
  private List<InEnum> $in;

  /**
   * Gets or Sets $notIn
   */
  @JsonAdapter(NotInEnum.Adapter.class)
  public enum NotInEnum {
    LOYALTY_PROGRAM("LOYALTY_PROGRAM"),
    
    GIFT_VOUCHERS("GIFT_VOUCHERS"),
    
    DISCOUNT_COUPONS("DISCOUNT_COUPONS"),
    
    REFERRAL_PROGRAM("REFERRAL_PROGRAM");

    private String value;

    NotInEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotInEnum fromValue(String value) {
      for (NotInEnum b : NotInEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotInEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotInEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotInEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotInEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_$_NOT_IN = "$not_in";
  @SerializedName(SERIALIZED_NAME_$_NOT_IN)
  private List<NotInEnum> $notIn;

  /**
   * Value is exactly this value (single value).
   */
  @JsonAdapter(IsEnum.Adapter.class)
  public enum IsEnum {
    LOYALTY_PROGRAM("LOYALTY_PROGRAM"),
    
    GIFT_VOUCHERS("GIFT_VOUCHERS"),
    
    DISCOUNT_COUPONS("DISCOUNT_COUPONS"),
    
    REFERRAL_PROGRAM("REFERRAL_PROGRAM");

    private String value;

    IsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsEnum fromValue(String value) {
      for (IsEnum b : IsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_$_IS = "$is";
  @SerializedName(SERIALIZED_NAME_$_IS)
  private IsEnum $is;

  /**
   * Results omit this value (single value).
   */
  @JsonAdapter(IsNotEnum.Adapter.class)
  public enum IsNotEnum {
    LOYALTY_PROGRAM("LOYALTY_PROGRAM"),
    
    GIFT_VOUCHERS("GIFT_VOUCHERS"),
    
    DISCOUNT_COUPONS("DISCOUNT_COUPONS"),
    
    REFERRAL_PROGRAM("REFERRAL_PROGRAM");

    private String value;

    IsNotEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IsNotEnum fromValue(String value) {
      for (IsNotEnum b : IsNotEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IsNotEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IsNotEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IsNotEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IsNotEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_$_IS_NOT = "$is_not";
  @SerializedName(SERIALIZED_NAME_$_IS_NOT)
  private IsNotEnum $isNot;

  public static final String SERIALIZED_NAME_$_HAS_VALUE = "$has_value";
  @SerializedName(SERIALIZED_NAME_$_HAS_VALUE)
  private String $hasValue;

  public static final String SERIALIZED_NAME_$_IS_UNKNOWN = "$is_unknown";
  @SerializedName(SERIALIZED_NAME_$_IS_UNKNOWN)
  private String $isUnknown;

  public static final String SERIALIZED_NAME_$_STARTS_WITH = "$starts_with";
  @SerializedName(SERIALIZED_NAME_$_STARTS_WITH)
  private String $startsWith;

  public static final String SERIALIZED_NAME_$_ENDS_WITH = "$ends_with";
  @SerializedName(SERIALIZED_NAME_$_ENDS_WITH)
  private String $endsWith;

  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions() {
  }

  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions $in(List<InEnum> $in) {
    
    this.$in = $in;
    return this;
  }

  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions add$InItem(InEnum $inItem) {
    if (this.$in == null) {
      this.$in = new ArrayList<>();
    }
    this.$in.add($inItem);
    return this;
  }

   /**
   * Array of resource values that should be included in the results (multiple values).
   * @return $in
  **/
  @javax.annotation.Nullable
  public List<InEnum> get$In() {
    return $in;
  }


  public void set$In(List<InEnum> $in) {
    this.$in = $in;
  }


  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions $notIn(List<NotInEnum> $notIn) {
    
    this.$notIn = $notIn;
    return this;
  }

  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions add$NotInItem(NotInEnum $notInItem) {
    if (this.$notIn == null) {
      this.$notIn = new ArrayList<>();
    }
    this.$notIn.add($notInItem);
    return this;
  }

   /**
   * Array of resource values that should be included in the results (multiple values).
   * @return $notIn
  **/
  @javax.annotation.Nullable
  public List<NotInEnum> get$NotIn() {
    return $notIn;
  }


  public void set$NotIn(List<NotInEnum> $notIn) {
    this.$notIn = $notIn;
  }


  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions $is(IsEnum $is) {
    
    this.$is = $is;
    return this;
  }

   /**
   * Value is exactly this value (single value).
   * @return $is
  **/
  @javax.annotation.Nullable
  public IsEnum get$Is() {
    return $is;
  }


  public void set$Is(IsEnum $is) {
    this.$is = $is;
  }


  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions $isNot(IsNotEnum $isNot) {
    
    this.$isNot = $isNot;
    return this;
  }

   /**
   * Results omit this value (single value).
   * @return $isNot
  **/
  @javax.annotation.Nullable
  public IsNotEnum get$IsNot() {
    return $isNot;
  }


  public void set$IsNot(IsNotEnum $isNot) {
    this.$isNot = $isNot;
  }


  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions $hasValue(String $hasValue) {
    
    this.$hasValue = $hasValue;
    return this;
  }

   /**
   * Value is NOT null. The value for this parameter is an empty string.
   * @return $hasValue
  **/
  @javax.annotation.Nullable
  public String get$HasValue() {
    return $hasValue;
  }


  public void set$HasValue(String $hasValue) {
    this.$hasValue = $hasValue;
  }


  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions $isUnknown(String $isUnknown) {
    
    this.$isUnknown = $isUnknown;
    return this;
  }

   /**
   * Value is null. The value for this parameter is an empty string.
   * @return $isUnknown
  **/
  @javax.annotation.Nullable
  public String get$IsUnknown() {
    return $isUnknown;
  }


  public void set$IsUnknown(String $isUnknown) {
    this.$isUnknown = $isUnknown;
  }


  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions $startsWith(String $startsWith) {
    
    this.$startsWith = $startsWith;
    return this;
  }

   /**
   * Value starts with the specified string.
   * @return $startsWith
  **/
  @javax.annotation.Nullable
  public String get$StartsWith() {
    return $startsWith;
  }


  public void set$StartsWith(String $startsWith) {
    this.$startsWith = $startsWith;
  }


  public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions $endsWith(String $endsWith) {
    
    this.$endsWith = $endsWith;
    return this;
  }

   /**
   * Value ends with the specified string.
   * @return $endsWith
  **/
  @javax.annotation.Nullable
  public String get$EndsWith() {
    return $endsWith;
  }


  public void set$EndsWith(String $endsWith) {
    this.$endsWith = $endsWith;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterFiltersListCustomerRedeemablesCampaignTypeConditions parameterFiltersListCustomerRedeemablesCampaignTypeConditions = (ParameterFiltersListCustomerRedeemablesCampaignTypeConditions) o;
    return Objects.equals(this.$in, parameterFiltersListCustomerRedeemablesCampaignTypeConditions.$in) &&
        Objects.equals(this.$notIn, parameterFiltersListCustomerRedeemablesCampaignTypeConditions.$notIn) &&
        Objects.equals(this.$is, parameterFiltersListCustomerRedeemablesCampaignTypeConditions.$is) &&
        Objects.equals(this.$isNot, parameterFiltersListCustomerRedeemablesCampaignTypeConditions.$isNot) &&
        Objects.equals(this.$hasValue, parameterFiltersListCustomerRedeemablesCampaignTypeConditions.$hasValue) &&
        Objects.equals(this.$isUnknown, parameterFiltersListCustomerRedeemablesCampaignTypeConditions.$isUnknown) &&
        Objects.equals(this.$startsWith, parameterFiltersListCustomerRedeemablesCampaignTypeConditions.$startsWith) &&
        Objects.equals(this.$endsWith, parameterFiltersListCustomerRedeemablesCampaignTypeConditions.$endsWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash($in, $notIn, $is, $isNot, $hasValue, $isUnknown, $startsWith, $endsWith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterFiltersListCustomerRedeemablesCampaignTypeConditions {\n");
    sb.append("    $in: ").append(toIndentedString($in)).append("\n");
    sb.append("    $notIn: ").append(toIndentedString($notIn)).append("\n");
    sb.append("    $is: ").append(toIndentedString($is)).append("\n");
    sb.append("    $isNot: ").append(toIndentedString($isNot)).append("\n");
    sb.append("    $hasValue: ").append(toIndentedString($hasValue)).append("\n");
    sb.append("    $isUnknown: ").append(toIndentedString($isUnknown)).append("\n");
    sb.append("    $startsWith: ").append(toIndentedString($startsWith)).append("\n");
    sb.append("    $endsWith: ").append(toIndentedString($endsWith)).append("\n");
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
    openapiFields.add("$in");
    openapiFields.add("$not_in");
    openapiFields.add("$is");
    openapiFields.add("$is_not");
    openapiFields.add("$has_value");
    openapiFields.add("$is_unknown");
    openapiFields.add("$starts_with");
    openapiFields.add("$ends_with");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ParameterFiltersListCustomerRedeemablesCampaignTypeConditions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ParameterFiltersListCustomerRedeemablesCampaignTypeConditions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParameterFiltersListCustomerRedeemablesCampaignTypeConditions is not found in the empty JSON string", ParameterFiltersListCustomerRedeemablesCampaignTypeConditions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ParameterFiltersListCustomerRedeemablesCampaignTypeConditions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ParameterFiltersListCustomerRedeemablesCampaignTypeConditions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("$in") != null && !jsonObj.get("$in").isJsonNull() && !jsonObj.get("$in").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `$in` to be an array in the JSON string but got `%s`", jsonObj.get("$in").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("$not_in") != null && !jsonObj.get("$not_in").isJsonNull() && !jsonObj.get("$not_in").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `$not_in` to be an array in the JSON string but got `%s`", jsonObj.get("$not_in").toString()));
      }
      if ((jsonObj.get("$is") != null && !jsonObj.get("$is").isJsonNull()) && !jsonObj.get("$is").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$is` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$is").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("$is");

        if (objectElement != null && !objectElement.isJsonNull()) {
          IsEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `$is` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("$is") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `$is` to be a valid element of IsEnum enum got `%s` instead", jsonObj.get("$is").toString()));
        }
      }
      if ((jsonObj.get("$is_not") != null && !jsonObj.get("$is_not").isJsonNull()) && !jsonObj.get("$is_not").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$is_not` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$is_not").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("$is_not");

        if (objectElement != null && !objectElement.isJsonNull()) {
          IsNotEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `$is_not` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("$is_not") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `$is_not` to be a valid element of IsNotEnum enum got `%s` instead", jsonObj.get("$is_not").toString()));
        }
      }
      if ((jsonObj.get("$has_value") != null && !jsonObj.get("$has_value").isJsonNull()) && !jsonObj.get("$has_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$has_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$has_value").toString()));
      }
      if ((jsonObj.get("$is_unknown") != null && !jsonObj.get("$is_unknown").isJsonNull()) && !jsonObj.get("$is_unknown").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$is_unknown` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$is_unknown").toString()));
      }
      if ((jsonObj.get("$starts_with") != null && !jsonObj.get("$starts_with").isJsonNull()) && !jsonObj.get("$starts_with").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$starts_with` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$starts_with").toString()));
      }
      if ((jsonObj.get("$ends_with") != null && !jsonObj.get("$ends_with").isJsonNull()) && !jsonObj.get("$ends_with").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `$ends_with` to be a primitive type in the JSON string but got `%s`", jsonObj.get("$ends_with").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParameterFiltersListCustomerRedeemablesCampaignTypeConditions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParameterFiltersListCustomerRedeemablesCampaignTypeConditions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParameterFiltersListCustomerRedeemablesCampaignTypeConditions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParameterFiltersListCustomerRedeemablesCampaignTypeConditions.class));

       return (TypeAdapter<T>) new TypeAdapter<ParameterFiltersListCustomerRedeemablesCampaignTypeConditions>() {
           @Override
           public void write(JsonWriter out, ParameterFiltersListCustomerRedeemablesCampaignTypeConditions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ParameterFiltersListCustomerRedeemablesCampaignTypeConditions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ParameterFiltersListCustomerRedeemablesCampaignTypeConditions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParameterFiltersListCustomerRedeemablesCampaignTypeConditions
  * @throws IOException if the JSON string is invalid with respect to ParameterFiltersListCustomerRedeemablesCampaignTypeConditions
  */
  public static ParameterFiltersListCustomerRedeemablesCampaignTypeConditions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParameterFiltersListCustomerRedeemablesCampaignTypeConditions.class);
  }

 /**
  * Convert an instance of ParameterFiltersListCustomerRedeemablesCampaignTypeConditions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

