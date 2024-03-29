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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.LoyaltyTierAllOfConfig;
import voucherify.client.model.LoyaltyTierBasePoints;
import voucherify.client.model.LoyaltyTierExpiration;
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
 * LoyaltyTier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltyTier {
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

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private LoyaltyTierAllOfConfig config;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private LoyaltyTierExpiration expiration;

  /**
   * The type of object represented by JSON. This object stores information about the loyalty.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    LOYALTY_TIER("loyalty_tier");

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
  private ObjectEnum _object = ObjectEnum.LOYALTY_TIER;

  public LoyaltyTier() {
  }

  public LoyaltyTier name(String name) {
    
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


  public LoyaltyTier earningRules(Map<String, MappingPoints> earningRules) {
    
    this.earningRules = earningRules;
    return this;
  }

  public LoyaltyTier putEarningRulesItem(String key, MappingPoints earningRulesItem) {
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


  public LoyaltyTier rewards(Map<String, MappingPoints> rewards) {
    
    this.rewards = rewards;
    return this;
  }

  public LoyaltyTier putRewardsItem(String key, MappingPoints rewardsItem) {
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


  public LoyaltyTier points(LoyaltyTierBasePoints points) {
    
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


  public LoyaltyTier id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique loyalty tier ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LoyaltyTier campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Unique parent campaign ID.
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public LoyaltyTier metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the loyalty tier. A set of key/value pairs that you can attach to a loyalty tier object. It can be useful for storing additional information about the loyalty tier in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public LoyaltyTier createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the loyalty tier was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public LoyaltyTier updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the loyalty tier was updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public LoyaltyTier config(LoyaltyTierAllOfConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nonnull
  public LoyaltyTierAllOfConfig getConfig() {
    return config;
  }


  public void setConfig(LoyaltyTierAllOfConfig config) {
    this.config = config;
  }


  public LoyaltyTier expiration(LoyaltyTierExpiration expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @javax.annotation.Nullable
  public LoyaltyTierExpiration getExpiration() {
    return expiration;
  }


  public void setExpiration(LoyaltyTierExpiration expiration) {
    this.expiration = expiration;
  }


  public LoyaltyTier _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON. This object stores information about the loyalty.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTier loyaltyTier = (LoyaltyTier) o;
    return Objects.equals(this.name, loyaltyTier.name) &&
        Objects.equals(this.earningRules, loyaltyTier.earningRules) &&
        Objects.equals(this.rewards, loyaltyTier.rewards) &&
        Objects.equals(this.points, loyaltyTier.points) &&
        Objects.equals(this.id, loyaltyTier.id) &&
        Objects.equals(this.campaignId, loyaltyTier.campaignId) &&
        Objects.equals(this.metadata, loyaltyTier.metadata) &&
        Objects.equals(this.createdAt, loyaltyTier.createdAt) &&
        Objects.equals(this.updatedAt, loyaltyTier.updatedAt) &&
        Objects.equals(this.config, loyaltyTier.config) &&
        Objects.equals(this.expiration, loyaltyTier.expiration) &&
        Objects.equals(this._object, loyaltyTier._object);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, earningRules, rewards, points, id, campaignId, metadata, createdAt, updatedAt, config, expiration, _object);
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
    sb.append("class LoyaltyTier {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    earningRules: ").append(toIndentedString(earningRules)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("campaign_id");
    openapiFields.add("metadata");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("config");
    openapiFields.add("expiration");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("points");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("campaign_id");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("config");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltyTier
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltyTier.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltyTier is not found in the empty JSON string", LoyaltyTier.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltyTier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltyTier` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LoyaltyTier.openapiRequiredFields) {
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
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      // validate the required field `config`
      LoyaltyTierAllOfConfig.validateJsonElement(jsonObj.get("config"));
      // validate the optional field `expiration`
      if (jsonObj.get("expiration") != null && !jsonObj.get("expiration").isJsonNull()) {
        LoyaltyTierExpiration.validateJsonElement(jsonObj.get("expiration"));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltyTier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltyTier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltyTier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltyTier.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltyTier>() {
           @Override
           public void write(JsonWriter out, LoyaltyTier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltyTier read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltyTier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltyTier
  * @throws IOException if the JSON string is invalid with respect to LoyaltyTier
  */
  public static LoyaltyTier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltyTier.class);
  }

 /**
  * Convert an instance of LoyaltyTier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

