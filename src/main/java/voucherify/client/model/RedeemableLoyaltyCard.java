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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.LoyaltiesTransferPoints;

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
 * Redeemable loyalty card object response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedeemableLoyaltyCard {
  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Integer balance;

  public static final String SERIALIZED_NAME_EXCHANGE_RATIO = "exchange_ratio";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATIO)
  private BigDecimal exchangeRatio;

  public static final String SERIALIZED_NAME_POINTS_RATIO = "points_ratio";
  @SerializedName(SERIALIZED_NAME_POINTS_RATIO)
  private Integer pointsRatio;

  public static final String SERIALIZED_NAME_TRANSFERS = "transfers";
  @SerializedName(SERIALIZED_NAME_TRANSFERS)
  private List<LoyaltiesTransferPoints> transfers;

  public RedeemableLoyaltyCard() {
  }

  public RedeemableLoyaltyCard points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Total points incurred over lifespan of loyalty card.
   * @return points
  **/
  @javax.annotation.Nullable
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public RedeemableLoyaltyCard balance(Integer balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Points available for reward redemption.
   * @return balance
  **/
  @javax.annotation.Nullable
  public Integer getBalance() {
    return balance;
  }


  public void setBalance(Integer balance) {
    this.balance = balance;
  }


  public RedeemableLoyaltyCard exchangeRatio(BigDecimal exchangeRatio) {
    
    this.exchangeRatio = exchangeRatio;
    return this;
  }

   /**
   * The cash equivalent of the points defined in the points_ratio property.
   * @return exchangeRatio
  **/
  @javax.annotation.Nullable
  public BigDecimal getExchangeRatio() {
    return exchangeRatio;
  }


  public void setExchangeRatio(BigDecimal exchangeRatio) {
    this.exchangeRatio = exchangeRatio;
  }


  public RedeemableLoyaltyCard pointsRatio(Integer pointsRatio) {
    
    this.pointsRatio = pointsRatio;
    return this;
  }

   /**
   * The number of loyalty points that will map to the predefined cash amount defined by the exchange_ratio property.
   * @return pointsRatio
  **/
  @javax.annotation.Nullable
  public Integer getPointsRatio() {
    return pointsRatio;
  }


  public void setPointsRatio(Integer pointsRatio) {
    this.pointsRatio = pointsRatio;
  }


  public RedeemableLoyaltyCard transfers(List<LoyaltiesTransferPoints> transfers) {
    
    this.transfers = transfers;
    return this;
  }

  public RedeemableLoyaltyCard addTransfersItem(LoyaltiesTransferPoints transfersItem) {
    if (this.transfers == null) {
      this.transfers = new ArrayList<>();
    }
    this.transfers.add(transfersItem);
    return this;
  }

   /**
   * Get transfers
   * @return transfers
  **/
  @javax.annotation.Nullable
  public List<LoyaltiesTransferPoints> getTransfers() {
    return transfers;
  }


  public void setTransfers(List<LoyaltiesTransferPoints> transfers) {
    this.transfers = transfers;
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
   * @return the RedeemableLoyaltyCard instance itself
   */
  public RedeemableLoyaltyCard putAdditionalProperty(String key, Object value) {
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
    RedeemableLoyaltyCard redeemableLoyaltyCard = (RedeemableLoyaltyCard) o;
    return Objects.equals(this.points, redeemableLoyaltyCard.points) &&
        Objects.equals(this.balance, redeemableLoyaltyCard.balance) &&
        Objects.equals(this.exchangeRatio, redeemableLoyaltyCard.exchangeRatio) &&
        Objects.equals(this.pointsRatio, redeemableLoyaltyCard.pointsRatio) &&
        Objects.equals(this.transfers, redeemableLoyaltyCard.transfers)&&
        Objects.equals(this.additionalProperties, redeemableLoyaltyCard.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, balance, exchangeRatio, pointsRatio, transfers, additionalProperties);
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
    sb.append("class RedeemableLoyaltyCard {\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    exchangeRatio: ").append(toIndentedString(exchangeRatio)).append("\n");
    sb.append("    pointsRatio: ").append(toIndentedString(pointsRatio)).append("\n");
    sb.append("    transfers: ").append(toIndentedString(transfers)).append("\n");
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
    openapiFields.add("points");
    openapiFields.add("balance");
    openapiFields.add("exchange_ratio");
    openapiFields.add("points_ratio");
    openapiFields.add("transfers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedeemableLoyaltyCard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedeemableLoyaltyCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedeemableLoyaltyCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedeemableLoyaltyCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedeemableLoyaltyCard.class));

       return (TypeAdapter<T>) new TypeAdapter<RedeemableLoyaltyCard>() {
           @Override
           public void write(JsonWriter out, RedeemableLoyaltyCard value) throws IOException {
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
           public RedeemableLoyaltyCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RedeemableLoyaltyCard instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RedeemableLoyaltyCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedeemableLoyaltyCard
  * @throws IOException if the JSON string is invalid with respect to RedeemableLoyaltyCard
  */
  public static RedeemableLoyaltyCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedeemableLoyaltyCard.class);
  }

 /**
  * Convert an instance of RedeemableLoyaltyCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

