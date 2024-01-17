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
import java.util.HashMap;
import java.util.Map;
import voucherify.client.model.LoyaltyTierBasePoints;
import voucherify.client.model.MappingPoints;

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
 * LoyaltyTierBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class LoyaltyTierBase {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EARNING_RULES = "earning_rules";
  @SerializedName(SERIALIZED_NAME_EARNING_RULES)
  private Map<String, MappingPoints> earningRules = new HashMap<>();

  public static final String SERIALIZED_NAME_REWARDS = "rewards";
  @SerializedName(SERIALIZED_NAME_REWARDS)
  private Map<String, MappingPoints> rewards = new HashMap<>();

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private LoyaltyTierBasePoints points;

  public LoyaltyTierBase() {
  }

  public LoyaltyTierBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Loyalty Tier name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LoyaltyTierBase earningRules(Map<String, MappingPoints> earningRules) {
    
    this.earningRules = earningRules;
    return this;
  }

  public LoyaltyTierBase putEarningRulesItem(String key, MappingPoints earningRulesItem) {
    if (this.earningRules == null) {
      this.earningRules = new HashMap<>();
    }
    this.earningRules.put(key, earningRulesItem);
    return this;
  }

   /**
   * Contains a list of earning rule IDs and their points mapping for the given earning rule.
   * @return earningRules
  **/
  @javax.annotation.Nullable
  public Map<String, MappingPoints> getEarningRules() {
    return earningRules;
  }


  public void setEarningRules(Map<String, MappingPoints> earningRules) {
    this.earningRules = earningRules;
  }


  public LoyaltyTierBase rewards(Map<String, MappingPoints> rewards) {
    
    this.rewards = rewards;
    return this;
  }

  public LoyaltyTierBase putRewardsItem(String key, MappingPoints rewardsItem) {
    if (this.rewards == null) {
      this.rewards = new HashMap<>();
    }
    this.rewards.put(key, rewardsItem);
    return this;
  }

   /**
   * Contains a list of reward IDs and their points mapping for the given reward.
   * @return rewards
  **/
  @javax.annotation.Nullable
  public Map<String, MappingPoints> getRewards() {
    return rewards;
  }


  public void setRewards(Map<String, MappingPoints> rewards) {
    this.rewards = rewards;
  }


  public LoyaltyTierBase points(LoyaltyTierBasePoints points) {
    
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nonnull
  public LoyaltyTierBasePoints getPoints() {
    return points;
  }


  public void setPoints(LoyaltyTierBasePoints points) {
    this.points = points;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTierBase loyaltyTierBase = (LoyaltyTierBase) o;
    return Objects.equals(this.name, loyaltyTierBase.name) &&
        Objects.equals(this.earningRules, loyaltyTierBase.earningRules) &&
        Objects.equals(this.rewards, loyaltyTierBase.rewards) &&
        Objects.equals(this.points, loyaltyTierBase.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, earningRules, rewards, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTierBase {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    earningRules: ").append(toIndentedString(earningRules)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("earning_rules");
    openapiFields.add("rewards");
    openapiFields.add("points");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("points");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltyTierBase
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltyTierBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltyTierBase is not found in the empty JSON string", LoyaltyTierBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltyTierBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltyTierBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltyTierBase.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `points`
      LoyaltyTierBasePoints.validateJsonElement(jsonObj.get("points"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltyTierBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltyTierBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltyTierBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltyTierBase.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltyTierBase>() {
           @Override
           public void write(JsonWriter out, LoyaltyTierBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltyTierBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltyTierBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltyTierBase
  * @throws IOException if the JSON string is invalid with respect to LoyaltyTierBase
  */
  public static LoyaltyTierBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltyTierBase.class);
  }

 /**
  * Convert an instance of LoyaltyTierBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

