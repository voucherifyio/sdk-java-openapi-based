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
import java.util.Arrays;
import voucherify.client.model.CampaignLoyaltyVoucherRedemption;
import voucherify.client.model.CodeConfig;
import voucherify.client.model.Discount;

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
 * ReferralCampaignVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ReferralCampaignVoucher {
  /**
   * Type of voucher.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DISCOUNT_VOUCHER("DISCOUNT_VOUCHER");

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
  private TypeEnum type = TypeEnum.DISCOUNT_VOUCHER;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Discount discount;

  public static final String SERIALIZED_NAME_CODE_CONFIG = "code_config";
  @SerializedName(SERIALIZED_NAME_CODE_CONFIG)
  private CodeConfig codeConfig;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private CampaignLoyaltyVoucherRedemption redemption;

  public static final String SERIALIZED_NAME_IS_REFERRAL_CODE = "is_referral_code";
  @SerializedName(SERIALIZED_NAME_IS_REFERRAL_CODE)
  private Boolean isReferralCode;

  public ReferralCampaignVoucher() {
  }

  public ReferralCampaignVoucher type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of voucher.
   * @return type
  **/
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ReferralCampaignVoucher discount(Discount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nonnull
  public Discount getDiscount() {
    return discount;
  }


  public void setDiscount(Discount discount) {
    this.discount = discount;
  }


  public ReferralCampaignVoucher codeConfig(CodeConfig codeConfig) {
    
    this.codeConfig = codeConfig;
    return this;
  }

   /**
   * Get codeConfig
   * @return codeConfig
  **/
  @javax.annotation.Nullable
  public CodeConfig getCodeConfig() {
    return codeConfig;
  }


  public void setCodeConfig(CodeConfig codeConfig) {
    this.codeConfig = codeConfig;
  }


  public ReferralCampaignVoucher redemption(CampaignLoyaltyVoucherRedemption redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public CampaignLoyaltyVoucherRedemption getRedemption() {
    return redemption;
  }


  public void setRedemption(CampaignLoyaltyVoucherRedemption redemption) {
    this.redemption = redemption;
  }


  public ReferralCampaignVoucher isReferralCode(Boolean isReferralCode) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferralCampaignVoucher referralCampaignVoucher = (ReferralCampaignVoucher) o;
    return Objects.equals(this.type, referralCampaignVoucher.type) &&
        Objects.equals(this.discount, referralCampaignVoucher.discount) &&
        Objects.equals(this.codeConfig, referralCampaignVoucher.codeConfig) &&
        Objects.equals(this.redemption, referralCampaignVoucher.redemption) &&
        Objects.equals(this.isReferralCode, referralCampaignVoucher.isReferralCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, discount, codeConfig, redemption, isReferralCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferralCampaignVoucher {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    codeConfig: ").append(toIndentedString(codeConfig)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    isReferralCode: ").append(toIndentedString(isReferralCode)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("discount");
    openapiFields.add("code_config");
    openapiFields.add("redemption");
    openapiFields.add("is_referral_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("discount");
    openapiRequiredFields.add("is_referral_code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReferralCampaignVoucher
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReferralCampaignVoucher.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReferralCampaignVoucher is not found in the empty JSON string", ReferralCampaignVoucher.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReferralCampaignVoucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReferralCampaignVoucher` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReferralCampaignVoucher.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      // validate the required field `discount`
      Discount.validateJsonElement(jsonObj.get("discount"));
      // validate the optional field `code_config`
      if (jsonObj.get("code_config") != null && !jsonObj.get("code_config").isJsonNull()) {
        CodeConfig.validateJsonElement(jsonObj.get("code_config"));
      }
      // validate the optional field `redemption`
      if (jsonObj.get("redemption") != null && !jsonObj.get("redemption").isJsonNull()) {
        CampaignLoyaltyVoucherRedemption.validateJsonElement(jsonObj.get("redemption"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReferralCampaignVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReferralCampaignVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReferralCampaignVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReferralCampaignVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<ReferralCampaignVoucher>() {
           @Override
           public void write(JsonWriter out, ReferralCampaignVoucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReferralCampaignVoucher read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReferralCampaignVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReferralCampaignVoucher
  * @throws IOException if the JSON string is invalid with respect to ReferralCampaignVoucher
  */
  public static ReferralCampaignVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReferralCampaignVoucher.class);
  }

 /**
  * Convert an instance of ReferralCampaignVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
