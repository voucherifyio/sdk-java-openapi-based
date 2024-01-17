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
import voucherify.client.model.Reward;
import voucherify.client.model.RewardAssignment;

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
 * LoyaltiesMembersRewardsListResponseBodyDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:00:53.208514+01:00[Europe/Warsaw]")
public class LoyaltiesMembersRewardsListResponseBodyDataItem {
  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private Reward reward;

  public static final String SERIALIZED_NAME_ASSIGNMENT = "assignment";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENT)
  private RewardAssignment assignment;

  /**
   * The type of object represented by JSON.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    LOYALTY_REWARD("loyalty_reward");

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
  private ObjectEnum _object = ObjectEnum.LOYALTY_REWARD;

  public LoyaltiesMembersRewardsListResponseBodyDataItem() {
  }

  public LoyaltiesMembersRewardsListResponseBodyDataItem reward(Reward reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nullable
  public Reward getReward() {
    return reward;
  }


  public void setReward(Reward reward) {
    this.reward = reward;
  }


  public LoyaltiesMembersRewardsListResponseBodyDataItem assignment(RewardAssignment assignment) {
    
    this.assignment = assignment;
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  @javax.annotation.Nullable
  public RewardAssignment getAssignment() {
    return assignment;
  }


  public void setAssignment(RewardAssignment assignment) {
    this.assignment = assignment;
  }


  public LoyaltiesMembersRewardsListResponseBodyDataItem _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented by JSON.
   * @return _object
  **/
  @javax.annotation.Nullable
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
    LoyaltiesMembersRewardsListResponseBodyDataItem loyaltiesMembersRewardsListResponseBodyDataItem = (LoyaltiesMembersRewardsListResponseBodyDataItem) o;
    return Objects.equals(this.reward, loyaltiesMembersRewardsListResponseBodyDataItem.reward) &&
        Objects.equals(this.assignment, loyaltiesMembersRewardsListResponseBodyDataItem.assignment) &&
        Objects.equals(this._object, loyaltiesMembersRewardsListResponseBodyDataItem._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reward, assignment, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltiesMembersRewardsListResponseBodyDataItem {\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
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
    openapiFields.add("reward");
    openapiFields.add("assignment");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesMembersRewardsListResponseBodyDataItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesMembersRewardsListResponseBodyDataItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesMembersRewardsListResponseBodyDataItem is not found in the empty JSON string", LoyaltiesMembersRewardsListResponseBodyDataItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesMembersRewardsListResponseBodyDataItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesMembersRewardsListResponseBodyDataItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `reward`
      if (jsonObj.get("reward") != null && !jsonObj.get("reward").isJsonNull()) {
        Reward.validateJsonElement(jsonObj.get("reward"));
      }
      // validate the optional field `assignment`
      if (jsonObj.get("assignment") != null && !jsonObj.get("assignment").isJsonNull()) {
        RewardAssignment.validateJsonElement(jsonObj.get("assignment"));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesMembersRewardsListResponseBodyDataItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesMembersRewardsListResponseBodyDataItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesMembersRewardsListResponseBodyDataItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesMembersRewardsListResponseBodyDataItem.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesMembersRewardsListResponseBodyDataItem>() {
           @Override
           public void write(JsonWriter out, LoyaltiesMembersRewardsListResponseBodyDataItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesMembersRewardsListResponseBodyDataItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesMembersRewardsListResponseBodyDataItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesMembersRewardsListResponseBodyDataItem
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesMembersRewardsListResponseBodyDataItem
  */
  public static LoyaltiesMembersRewardsListResponseBodyDataItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesMembersRewardsListResponseBodyDataItem.class);
  }

 /**
  * Convert an instance of LoyaltiesMembersRewardsListResponseBodyDataItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
