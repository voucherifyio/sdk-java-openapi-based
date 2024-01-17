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
import voucherify.client.model.CustomEvent;
import voucherify.client.model.RedemptionInternal;
import voucherify.client.model.SimpleCampaign;
import voucherify.client.model.SimpleCustomer;
import voucherify.client.model.SimpleRedemptionRewardResult;
import voucherify.client.model.SimpleReferralTier;
import voucherify.client.model.SimpleVoucher;

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
 * Event data object schema for &#x60;customer.rewarded&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class EventCustomerRewarded {
  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SimpleCustomer customer;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private SimpleCustomer holder;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private SimpleVoucher voucher;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private SimpleCampaign campaign;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private RedemptionInternal redemption;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private SimpleRedemptionRewardResult reward;

  public static final String SERIALIZED_NAME_REFERRAL_TIER = "referral_tier";
  @SerializedName(SERIALIZED_NAME_REFERRAL_TIER)
  private SimpleReferralTier referralTier;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_CUSTOM_EVENT = "custom_event";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT)
  private CustomEvent customEvent;

  public static final String SERIALIZED_NAME_CUSTOMER_EVENT = "customer_event";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_EVENT)
  private Object customerEvent;

  public EventCustomerRewarded() {
  }

  public EventCustomerRewarded customer(SimpleCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public SimpleCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(SimpleCustomer customer) {
    this.customer = customer;
  }


  public EventCustomerRewarded holder(SimpleCustomer holder) {
    
    this.holder = holder;
    return this;
  }

   /**
   * Get holder
   * @return holder
  **/
  @javax.annotation.Nullable
  public SimpleCustomer getHolder() {
    return holder;
  }


  public void setHolder(SimpleCustomer holder) {
    this.holder = holder;
  }


  public EventCustomerRewarded voucher(SimpleVoucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public SimpleVoucher getVoucher() {
    return voucher;
  }


  public void setVoucher(SimpleVoucher voucher) {
    this.voucher = voucher;
  }


  public EventCustomerRewarded campaign(SimpleCampaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  public SimpleCampaign getCampaign() {
    return campaign;
  }


  public void setCampaign(SimpleCampaign campaign) {
    this.campaign = campaign;
  }


  public EventCustomerRewarded redemption(RedemptionInternal redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public RedemptionInternal getRedemption() {
    return redemption;
  }


  public void setRedemption(RedemptionInternal redemption) {
    this.redemption = redemption;
  }


  public EventCustomerRewarded reward(SimpleRedemptionRewardResult reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nullable
  public SimpleRedemptionRewardResult getReward() {
    return reward;
  }


  public void setReward(SimpleRedemptionRewardResult reward) {
    this.reward = reward;
  }


  public EventCustomerRewarded referralTier(SimpleReferralTier referralTier) {
    
    this.referralTier = referralTier;
    return this;
  }

   /**
   * Get referralTier
   * @return referralTier
  **/
  @javax.annotation.Nullable
  public SimpleReferralTier getReferralTier() {
    return referralTier;
  }


  public void setReferralTier(SimpleReferralTier referralTier) {
    this.referralTier = referralTier;
  }


  public EventCustomerRewarded balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public EventCustomerRewarded customEvent(CustomEvent customEvent) {
    
    this.customEvent = customEvent;
    return this;
  }

   /**
   * Get customEvent
   * @return customEvent
  **/
  @javax.annotation.Nullable
  public CustomEvent getCustomEvent() {
    return customEvent;
  }


  public void setCustomEvent(CustomEvent customEvent) {
    this.customEvent = customEvent;
  }


  public EventCustomerRewarded customerEvent(Object customerEvent) {
    
    this.customerEvent = customerEvent;
    return this;
  }

   /**
   * Get customerEvent
   * @return customerEvent
  **/
  @javax.annotation.Nullable
  public Object getCustomerEvent() {
    return customerEvent;
  }


  public void setCustomerEvent(Object customerEvent) {
    this.customerEvent = customerEvent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerRewarded eventCustomerRewarded = (EventCustomerRewarded) o;
    return Objects.equals(this.customer, eventCustomerRewarded.customer) &&
        Objects.equals(this.holder, eventCustomerRewarded.holder) &&
        Objects.equals(this.voucher, eventCustomerRewarded.voucher) &&
        Objects.equals(this.campaign, eventCustomerRewarded.campaign) &&
        Objects.equals(this.redemption, eventCustomerRewarded.redemption) &&
        Objects.equals(this.reward, eventCustomerRewarded.reward) &&
        Objects.equals(this.referralTier, eventCustomerRewarded.referralTier) &&
        Objects.equals(this.balance, eventCustomerRewarded.balance) &&
        Objects.equals(this.customEvent, eventCustomerRewarded.customEvent) &&
        Objects.equals(this.customerEvent, eventCustomerRewarded.customerEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, holder, voucher, campaign, redemption, reward, referralTier, balance, customEvent, customerEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerRewarded {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    referralTier: ").append(toIndentedString(referralTier)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    customEvent: ").append(toIndentedString(customEvent)).append("\n");
    sb.append("    customerEvent: ").append(toIndentedString(customerEvent)).append("\n");
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
    openapiFields.add("customer");
    openapiFields.add("holder");
    openapiFields.add("voucher");
    openapiFields.add("campaign");
    openapiFields.add("redemption");
    openapiFields.add("reward");
    openapiFields.add("referral_tier");
    openapiFields.add("balance");
    openapiFields.add("custom_event");
    openapiFields.add("customer_event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerRewarded
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerRewarded.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerRewarded is not found in the empty JSON string", EventCustomerRewarded.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerRewarded.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerRewarded` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("customer"));
      }
      // validate the optional field `holder`
      if (jsonObj.get("holder") != null && !jsonObj.get("holder").isJsonNull()) {
        SimpleCustomer.validateJsonElement(jsonObj.get("holder"));
      }
      // validate the optional field `voucher`
      if (jsonObj.get("voucher") != null && !jsonObj.get("voucher").isJsonNull()) {
        SimpleVoucher.validateJsonElement(jsonObj.get("voucher"));
      }
      // validate the optional field `campaign`
      if (jsonObj.get("campaign") != null && !jsonObj.get("campaign").isJsonNull()) {
        SimpleCampaign.validateJsonElement(jsonObj.get("campaign"));
      }
      // validate the optional field `redemption`
      if (jsonObj.get("redemption") != null && !jsonObj.get("redemption").isJsonNull()) {
        RedemptionInternal.validateJsonElement(jsonObj.get("redemption"));
      }
      // validate the optional field `reward`
      if (jsonObj.get("reward") != null && !jsonObj.get("reward").isJsonNull()) {
        SimpleRedemptionRewardResult.validateJsonElement(jsonObj.get("reward"));
      }
      // validate the optional field `referral_tier`
      if (jsonObj.get("referral_tier") != null && !jsonObj.get("referral_tier").isJsonNull()) {
        SimpleReferralTier.validateJsonElement(jsonObj.get("referral_tier"));
      }
      // validate the optional field `custom_event`
      if (jsonObj.get("custom_event") != null && !jsonObj.get("custom_event").isJsonNull()) {
        CustomEvent.validateJsonElement(jsonObj.get("custom_event"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerRewarded.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerRewarded' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerRewarded> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerRewarded.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerRewarded>() {
           @Override
           public void write(JsonWriter out, EventCustomerRewarded value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerRewarded read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerRewarded given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerRewarded
  * @throws IOException if the JSON string is invalid with respect to EventCustomerRewarded
  */
  public static EventCustomerRewarded fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerRewarded.class);
  }

 /**
  * Convert an instance of EventCustomerRewarded to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

