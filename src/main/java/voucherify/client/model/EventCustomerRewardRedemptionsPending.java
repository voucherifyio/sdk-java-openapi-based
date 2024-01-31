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
import voucherify.client.model.RewardAssignment;
import voucherify.client.model.SimpleCampaign;
import voucherify.client.model.SimpleCustomer;
import voucherify.client.model.SimpleRedemptionRewardResult;
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
 * Event data object schema for &#x60;customer.reward_redemptions.pending&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class EventCustomerRewardRedemptionsPending {
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

  public static final String SERIALIZED_NAME_REWARD_REDEMPTION = "reward_redemption";
  @SerializedName(SERIALIZED_NAME_REWARD_REDEMPTION)
  private Object rewardRedemption;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private SimpleRedemptionRewardResult reward;

  public static final String SERIALIZED_NAME_REWARD_ASSIGNMENT = "reward_assignment";
  @SerializedName(SERIALIZED_NAME_REWARD_ASSIGNMENT)
  private RewardAssignment rewardAssignment;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public EventCustomerRewardRedemptionsPending() {
  }

  public EventCustomerRewardRedemptionsPending customer(SimpleCustomer customer) {
    
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


  public EventCustomerRewardRedemptionsPending holder(SimpleCustomer holder) {
    
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


  public EventCustomerRewardRedemptionsPending voucher(SimpleVoucher voucher) {
    
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


  public EventCustomerRewardRedemptionsPending campaign(SimpleCampaign campaign) {
    
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


  public EventCustomerRewardRedemptionsPending rewardRedemption(Object rewardRedemption) {
    
    this.rewardRedemption = rewardRedemption;
    return this;
  }

   /**
   * Get rewardRedemption
   * @return rewardRedemption
  **/
  @javax.annotation.Nullable
  public Object getRewardRedemption() {
    return rewardRedemption;
  }


  public void setRewardRedemption(Object rewardRedemption) {
    this.rewardRedemption = rewardRedemption;
  }


  public EventCustomerRewardRedemptionsPending reward(SimpleRedemptionRewardResult reward) {
    
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


  public EventCustomerRewardRedemptionsPending rewardAssignment(RewardAssignment rewardAssignment) {
    
    this.rewardAssignment = rewardAssignment;
    return this;
  }

   /**
   * Get rewardAssignment
   * @return rewardAssignment
  **/
  @javax.annotation.Nullable
  public RewardAssignment getRewardAssignment() {
    return rewardAssignment;
  }


  public void setRewardAssignment(RewardAssignment rewardAssignment) {
    this.rewardAssignment = rewardAssignment;
  }


  public EventCustomerRewardRedemptionsPending source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public EventCustomerRewardRedemptionsPending balance(Integer balance) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventCustomerRewardRedemptionsPending eventCustomerRewardRedemptionsPending = (EventCustomerRewardRedemptionsPending) o;
    return Objects.equals(this.customer, eventCustomerRewardRedemptionsPending.customer) &&
        Objects.equals(this.holder, eventCustomerRewardRedemptionsPending.holder) &&
        Objects.equals(this.voucher, eventCustomerRewardRedemptionsPending.voucher) &&
        Objects.equals(this.campaign, eventCustomerRewardRedemptionsPending.campaign) &&
        Objects.equals(this.rewardRedemption, eventCustomerRewardRedemptionsPending.rewardRedemption) &&
        Objects.equals(this.reward, eventCustomerRewardRedemptionsPending.reward) &&
        Objects.equals(this.rewardAssignment, eventCustomerRewardRedemptionsPending.rewardAssignment) &&
        Objects.equals(this.source, eventCustomerRewardRedemptionsPending.source) &&
        Objects.equals(this.balance, eventCustomerRewardRedemptionsPending.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, holder, voucher, campaign, rewardRedemption, reward, rewardAssignment, source, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventCustomerRewardRedemptionsPending {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    rewardRedemption: ").append(toIndentedString(rewardRedemption)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    rewardAssignment: ").append(toIndentedString(rewardAssignment)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
    openapiFields.add("reward_redemption");
    openapiFields.add("reward");
    openapiFields.add("reward_assignment");
    openapiFields.add("source");
    openapiFields.add("balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EventCustomerRewardRedemptionsPending
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EventCustomerRewardRedemptionsPending.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventCustomerRewardRedemptionsPending is not found in the empty JSON string", EventCustomerRewardRedemptionsPending.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EventCustomerRewardRedemptionsPending.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventCustomerRewardRedemptionsPending` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      // validate the optional field `reward`
      if (jsonObj.get("reward") != null && !jsonObj.get("reward").isJsonNull()) {
        SimpleRedemptionRewardResult.validateJsonElement(jsonObj.get("reward"));
      }
      // validate the optional field `reward_assignment`
      if (jsonObj.get("reward_assignment") != null && !jsonObj.get("reward_assignment").isJsonNull()) {
        RewardAssignment.validateJsonElement(jsonObj.get("reward_assignment"));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventCustomerRewardRedemptionsPending.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventCustomerRewardRedemptionsPending' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventCustomerRewardRedemptionsPending> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventCustomerRewardRedemptionsPending.class));

       return (TypeAdapter<T>) new TypeAdapter<EventCustomerRewardRedemptionsPending>() {
           @Override
           public void write(JsonWriter out, EventCustomerRewardRedemptionsPending value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventCustomerRewardRedemptionsPending read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventCustomerRewardRedemptionsPending given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventCustomerRewardRedemptionsPending
  * @throws IOException if the JSON string is invalid with respect to EventCustomerRewardRedemptionsPending
  */
  public static EventCustomerRewardRedemptionsPending fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventCustomerRewardRedemptionsPending.class);
  }

 /**
  * Convert an instance of EventCustomerRewardRedemptionsPending to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

