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
 * Defines the details of the channel through which the redemption was issued.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionChannel {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "channel_id";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
  private String channelId;

  /**
   * The source of the channel for the redemption. A &#x60;USER&#x60; corresponds to the Voucherify Dashboard and an &#x60;API&#x60; corresponds to the API.
   */
  @JsonAdapter(ChannelTypeEnum.Adapter.class)
  public enum ChannelTypeEnum {
    USER("USER"),
    
    API("API");

    private String value;

    ChannelTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelTypeEnum fromValue(String value) {
      for (ChannelTypeEnum b : ChannelTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL_TYPE = "channel_type";
  @SerializedName(SERIALIZED_NAME_CHANNEL_TYPE)
  private ChannelTypeEnum channelType;

  public RedemptionChannel() {
  }

  public RedemptionChannel channelId(String channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * Unique channel ID of the user performing the redemption. This is either a user ID from a user using the Voucherify Dashboard or an X-APP-Id of a user using the API.
   * @return channelId
  **/
  @javax.annotation.Nullable
  public String getChannelId() {
    return channelId;
  }


  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public RedemptionChannel channelType(ChannelTypeEnum channelType) {
    
    this.channelType = channelType;
    return this;
  }

   /**
   * The source of the channel for the redemption. A &#x60;USER&#x60; corresponds to the Voucherify Dashboard and an &#x60;API&#x60; corresponds to the API.
   * @return channelType
  **/
  @javax.annotation.Nullable
  public ChannelTypeEnum getChannelType() {
    return channelType;
  }


  public void setChannelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionChannel redemptionChannel = (RedemptionChannel) o;
    return Objects.equals(this.channelId, redemptionChannel.channelId) &&
        Objects.equals(this.channelType, redemptionChannel.channelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, channelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionChannel {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
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
    openapiFields.add("channel_id");
    openapiFields.add("channel_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedemptionChannel
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedemptionChannel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedemptionChannel is not found in the empty JSON string", RedemptionChannel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RedemptionChannel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RedemptionChannel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel_id") != null && !jsonObj.get("channel_id").isJsonNull()) && !jsonObj.get("channel_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_id").toString()));
      }
      if ((jsonObj.get("channel_type") != null && !jsonObj.get("channel_type").isJsonNull()) && !jsonObj.get("channel_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel_type").toString()));
      }
      try {
        JsonElement objectElement = jsonObj.get("channel_type");

        if (objectElement != null && !objectElement.isJsonNull()) {
          ChannelTypeEnum.fromValue(objectElement.getAsString());
        } else {
          throw new IllegalArgumentException("Expected the field `channel_type` to be not null");
        }
      } catch (IllegalArgumentException e) {
        if(jsonObj.get("channel_type") != null) {
          throw new IllegalArgumentException(String.format("Expected the field `channel_type` to be a valid element of ChannelTypeEnum enum got `%s` instead", jsonObj.get("channel_type").toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionChannel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionChannel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionChannel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionChannel.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionChannel>() {
           @Override
           public void write(JsonWriter out, RedemptionChannel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedemptionChannel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedemptionChannel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionChannel
  * @throws IOException if the JSON string is invalid with respect to RedemptionChannel
  */
  public static RedemptionChannel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionChannel.class);
  }

 /**
  * Convert an instance of RedemptionChannel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

