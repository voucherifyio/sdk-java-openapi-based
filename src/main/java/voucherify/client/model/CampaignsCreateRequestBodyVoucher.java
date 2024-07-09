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
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.CampaignLoyaltyCard;
import voucherify.client.model.CampaignsCreateRequestBodyVoucherRedemption;
import voucherify.client.model.CodeConfig;
import voucherify.client.model.Discount;
import voucherify.client.model.Gift;

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
 * CampaignsCreateRequestBodyVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignsCreateRequestBodyVoucher {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DISCOUNT_VOUCHER("DISCOUNT_VOUCHER"),
    
    GIFT_VOUCHER("GIFT_VOUCHER"),
    
    LOYALTY_CARD("LOYALTY_CARD");

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
        return null;
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

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Discount discount;

  public static final String SERIALIZED_NAME_CODE_CONFIG = "code_config";
  @SerializedName(SERIALIZED_NAME_CODE_CONFIG)
  private CodeConfig codeConfig;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private CampaignsCreateRequestBodyVoucherRedemption redemption;

  public static final String SERIALIZED_NAME_IS_REFERRAL_CODE = "is_referral_code";
  @SerializedName(SERIALIZED_NAME_IS_REFERRAL_CODE)
  private Boolean isReferralCode;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private Gift gift;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private CampaignLoyaltyCard loyaltyCard;

  public CampaignsCreateRequestBodyVoucher() {
  }

  public CampaignsCreateRequestBodyVoucher type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CampaignsCreateRequestBodyVoucher discount(Discount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  public Discount getDiscount() {
    return discount;
  }


  public void setDiscount(Discount discount) {
    this.discount = discount;
  }


  public CampaignsCreateRequestBodyVoucher codeConfig(CodeConfig codeConfig) {
    
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


  public CampaignsCreateRequestBodyVoucher redemption(CampaignsCreateRequestBodyVoucherRedemption redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public CampaignsCreateRequestBodyVoucherRedemption getRedemption() {
    return redemption;
  }


  public void setRedemption(CampaignsCreateRequestBodyVoucherRedemption redemption) {
    this.redemption = redemption;
  }


  public CampaignsCreateRequestBodyVoucher isReferralCode(Boolean isReferralCode) {
    
    this.isReferralCode = isReferralCode;
    return this;
  }

   /**
   * Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;.
   * @return isReferralCode
  **/
  @javax.annotation.Nullable
  public Boolean getIsReferralCode() {
    return isReferralCode;
  }


  public void setIsReferralCode(Boolean isReferralCode) {
    this.isReferralCode = isReferralCode;
  }


  public CampaignsCreateRequestBodyVoucher gift(Gift gift) {
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nullable
  public Gift getGift() {
    return gift;
  }


  public void setGift(Gift gift) {
    this.gift = gift;
  }


  public CampaignsCreateRequestBodyVoucher loyaltyCard(CampaignLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public CampaignLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(CampaignLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
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
   * @return the CampaignsCreateRequestBodyVoucher instance itself
   */
  public CampaignsCreateRequestBodyVoucher putAdditionalProperty(String key, Object value) {
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
    CampaignsCreateRequestBodyVoucher campaignsCreateRequestBodyVoucher = (CampaignsCreateRequestBodyVoucher) o;
    return Objects.equals(this.type, campaignsCreateRequestBodyVoucher.type) &&
        Objects.equals(this.discount, campaignsCreateRequestBodyVoucher.discount) &&
        Objects.equals(this.codeConfig, campaignsCreateRequestBodyVoucher.codeConfig) &&
        Objects.equals(this.redemption, campaignsCreateRequestBodyVoucher.redemption) &&
        Objects.equals(this.isReferralCode, campaignsCreateRequestBodyVoucher.isReferralCode) &&
        Objects.equals(this.gift, campaignsCreateRequestBodyVoucher.gift) &&
        Objects.equals(this.loyaltyCard, campaignsCreateRequestBodyVoucher.loyaltyCard)&&
        Objects.equals(this.additionalProperties, campaignsCreateRequestBodyVoucher.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, discount, codeConfig, redemption, isReferralCode, gift, loyaltyCard, additionalProperties);
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
    sb.append("class CampaignsCreateRequestBodyVoucher {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    codeConfig: ").append(toIndentedString(codeConfig)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    isReferralCode: ").append(toIndentedString(isReferralCode)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("discount");
    openapiFields.add("code_config");
    openapiFields.add("redemption");
    openapiFields.add("is_referral_code");
    openapiFields.add("gift");
    openapiFields.add("loyalty_card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CampaignsCreateRequestBodyVoucher
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        return;
      }
      try {
        JsonElement objectElement = jsonObj.get("type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          TypeEnum.fromValue(objectElement.getAsString());
        } else {
          return;
        }
      } catch (IllegalArgumentException e) {
          return;
      }
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        Discount.validateJsonElement(jsonObj.get("discount"));
      }
      // validate the optional field `code_config`
      if (jsonObj.get("code_config") != null && !jsonObj.get("code_config").isJsonNull()) {
        CodeConfig.validateJsonElement(jsonObj.get("code_config"));
      }
      // validate the optional field `redemption`
      if (jsonObj.get("redemption") != null && !jsonObj.get("redemption").isJsonNull()) {
        CampaignsCreateRequestBodyVoucherRedemption.validateJsonElement(jsonObj.get("redemption"));
      }
      // validate the optional field `gift`
      if (jsonObj.get("gift") != null && !jsonObj.get("gift").isJsonNull()) {
        Gift.validateJsonElement(jsonObj.get("gift"));
      }
      // validate the optional field `loyalty_card`
      if (jsonObj.get("loyalty_card") != null && !jsonObj.get("loyalty_card").isJsonNull()) {
        CampaignLoyaltyCard.validateJsonElement(jsonObj.get("loyalty_card"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsCreateRequestBodyVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsCreateRequestBodyVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsCreateRequestBodyVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreateRequestBodyVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsCreateRequestBodyVoucher>() {
           @Override
           public void write(JsonWriter out, CampaignsCreateRequestBodyVoucher value) throws IOException {
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
           public CampaignsCreateRequestBodyVoucher read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CampaignsCreateRequestBodyVoucher instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignsCreateRequestBodyVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsCreateRequestBodyVoucher
  * @throws IOException if the JSON string is invalid with respect to CampaignsCreateRequestBodyVoucher
  */
  public static CampaignsCreateRequestBodyVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsCreateRequestBodyVoucher.class);
  }

 /**
  * Convert an instance of CampaignsCreateRequestBodyVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

