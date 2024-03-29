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
 * ListPublicationsItemVoucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ListPublicationsItemVoucher {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  /**
   * The type of object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    VOUCHER("voucher");

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
  private ObjectEnum _object = ObjectEnum.VOUCHER;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private String campaign;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private Gift gift;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private Object loyaltyCard;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Discount discount;

  public static final String SERIALIZED_NAME_IS_REFERRAL_CODE = "is_referral_code";
  @SerializedName(SERIALIZED_NAME_IS_REFERRAL_CODE)
  private Boolean isReferralCode;

  public ListPublicationsItemVoucher() {
  }

  public ListPublicationsItemVoucher code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Voucher code.
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ListPublicationsItemVoucher _object(ObjectEnum _object) {
    
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


  public ListPublicationsItemVoucher campaign(String campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Campaign name
   * @return campaign
  **/
  @javax.annotation.Nonnull
  public String getCampaign() {
    return campaign;
  }


  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }


  public ListPublicationsItemVoucher gift(Gift gift) {
    
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


  public ListPublicationsItemVoucher loyaltyCard(Object loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Defines the loyalty card details.
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public Object getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(Object loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }


  public ListPublicationsItemVoucher discount(Discount discount) {
    
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


  public ListPublicationsItemVoucher isReferralCode(Boolean isReferralCode) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPublicationsItemVoucher listPublicationsItemVoucher = (ListPublicationsItemVoucher) o;
    return Objects.equals(this.code, listPublicationsItemVoucher.code) &&
        Objects.equals(this._object, listPublicationsItemVoucher._object) &&
        Objects.equals(this.campaign, listPublicationsItemVoucher.campaign) &&
        Objects.equals(this.gift, listPublicationsItemVoucher.gift) &&
        Objects.equals(this.loyaltyCard, listPublicationsItemVoucher.loyaltyCard) &&
        Objects.equals(this.discount, listPublicationsItemVoucher.discount) &&
        Objects.equals(this.isReferralCode, listPublicationsItemVoucher.isReferralCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, _object, campaign, gift, loyaltyCard, discount, isReferralCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPublicationsItemVoucher {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("object");
    openapiFields.add("campaign");
    openapiFields.add("gift");
    openapiFields.add("loyalty_card");
    openapiFields.add("discount");
    openapiFields.add("is_referral_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("campaign");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListPublicationsItemVoucher
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListPublicationsItemVoucher.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPublicationsItemVoucher is not found in the empty JSON string", ListPublicationsItemVoucher.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListPublicationsItemVoucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPublicationsItemVoucher` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListPublicationsItemVoucher.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
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
        if(jsonObj.get("object") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `object` to be a valid element of ObjectEnum enum got `%s` instead", jsonObj.get("object").toString()));
        }
      }
      if (!jsonObj.get("campaign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign").toString()));
      }
      // validate the optional field `gift`
      if (jsonObj.get("gift") != null && !jsonObj.get("gift").isJsonNull()) {
        Gift.validateJsonElement(jsonObj.get("gift"));
      }
      // validate the optional field `discount`
      if (jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) {
        Discount.validateJsonElement(jsonObj.get("discount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPublicationsItemVoucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPublicationsItemVoucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPublicationsItemVoucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPublicationsItemVoucher.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPublicationsItemVoucher>() {
           @Override
           public void write(JsonWriter out, ListPublicationsItemVoucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPublicationsItemVoucher read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListPublicationsItemVoucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListPublicationsItemVoucher
  * @throws IOException if the JSON string is invalid with respect to ListPublicationsItemVoucher
  */
  public static ListPublicationsItemVoucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPublicationsItemVoucher.class);
  }

 /**
  * Convert an instance of ListPublicationsItemVoucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

