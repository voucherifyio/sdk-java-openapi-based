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
import voucherify.client.model.RedeemableResultLoyaltyCardLoyaltyCard;

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
 * This is a &#x60;result&#x60; object representing the results for a loyalty card.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class RedeemableResultLoyaltyCard {
  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private RedeemableResultLoyaltyCardLoyaltyCard loyaltyCard;

  public RedeemableResultLoyaltyCard() {
  }

  public RedeemableResultLoyaltyCard loyaltyCard(RedeemableResultLoyaltyCardLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public RedeemableResultLoyaltyCardLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(RedeemableResultLoyaltyCardLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedeemableResultLoyaltyCard redeemableResultLoyaltyCard = (RedeemableResultLoyaltyCard) o;
    return Objects.equals(this.loyaltyCard, redeemableResultLoyaltyCard.loyaltyCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltyCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedeemableResultLoyaltyCard {\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
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
    openapiFields.add("loyalty_card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedeemableResultLoyaltyCard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedeemableResultLoyaltyCard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedeemableResultLoyaltyCard is not found in the empty JSON string", RedeemableResultLoyaltyCard.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RedeemableResultLoyaltyCard.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RedeemableResultLoyaltyCard` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `loyalty_card`
      if (jsonObj.get("loyalty_card") != null && !jsonObj.get("loyalty_card").isJsonNull()) {
        RedeemableResultLoyaltyCardLoyaltyCard.validateJsonElement(jsonObj.get("loyalty_card"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedeemableResultLoyaltyCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedeemableResultLoyaltyCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedeemableResultLoyaltyCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedeemableResultLoyaltyCard.class));

       return (TypeAdapter<T>) new TypeAdapter<RedeemableResultLoyaltyCard>() {
           @Override
           public void write(JsonWriter out, RedeemableResultLoyaltyCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedeemableResultLoyaltyCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedeemableResultLoyaltyCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedeemableResultLoyaltyCard
  * @throws IOException if the JSON string is invalid with respect to RedeemableResultLoyaltyCard
  */
  public static RedeemableResultLoyaltyCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedeemableResultLoyaltyCard.class);
  }

 /**
  * Convert an instance of RedeemableResultLoyaltyCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

