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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Stores a summary of redemptions that have been applied to the voucher.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesMembersTransfersCreateResponseBodyRedemption {
  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_REDEEMED_POINTS = "redeemed_points";
  @SerializedName(SERIALIZED_NAME_REDEEMED_POINTS)
  private Integer redeemedPoints;

  public static final String SERIALIZED_NAME_REDEEMED_QUANTITY = "redeemed_quantity";
  @SerializedName(SERIALIZED_NAME_REDEEMED_QUANTITY)
  private Integer redeemedQuantity;

  public static final String SERIALIZED_NAME_REDEMPTION_ENTRIES = "redemption_entries";
  @SerializedName(SERIALIZED_NAME_REDEMPTION_ENTRIES)
  private List<String> redemptionEntries;

  /**
   * The type of object represented is by default list. To get this list, you need to make a call to the endpoint returned in the url attribute.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    LIST("list");

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
  private ObjectEnum _object = ObjectEnum.LIST;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public LoyaltiesMembersTransfersCreateResponseBodyRedemption() {
  }

  public LoyaltiesMembersTransfersCreateResponseBodyRedemption quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * How many times a voucher can be redeemed. A null value means unlimited.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public LoyaltiesMembersTransfersCreateResponseBodyRedemption redeemedPoints(Integer redeemedPoints) {
    
    this.redeemedPoints = redeemedPoints;
    return this;
  }

   /**
   * Total loyalty points redeemed.
   * @return redeemedPoints
  **/
  @javax.annotation.Nullable
  public Integer getRedeemedPoints() {
    return redeemedPoints;
  }


  public void setRedeemedPoints(Integer redeemedPoints) {
    this.redeemedPoints = redeemedPoints;
  }


  public LoyaltiesMembersTransfersCreateResponseBodyRedemption redeemedQuantity(Integer redeemedQuantity) {
    
    this.redeemedQuantity = redeemedQuantity;
    return this;
  }

   /**
   * How many times a voucher has already been redeemed.
   * @return redeemedQuantity
  **/
  @javax.annotation.Nullable
  public Integer getRedeemedQuantity() {
    return redeemedQuantity;
  }


  public void setRedeemedQuantity(Integer redeemedQuantity) {
    this.redeemedQuantity = redeemedQuantity;
  }


  public LoyaltiesMembersTransfersCreateResponseBodyRedemption redemptionEntries(List<String> redemptionEntries) {
    
    this.redemptionEntries = redemptionEntries;
    return this;
  }

  public LoyaltiesMembersTransfersCreateResponseBodyRedemption addRedemptionEntriesItem(String redemptionEntriesItem) {
    if (this.redemptionEntries == null) {
      this.redemptionEntries = new ArrayList<>();
    }
    this.redemptionEntries.add(redemptionEntriesItem);
    return this;
  }

   /**
   * Get redemptionEntries
   * @return redemptionEntries
  **/
  @javax.annotation.Nullable
  public List<String> getRedemptionEntries() {
    return redemptionEntries;
  }


  public void setRedemptionEntries(List<String> redemptionEntries) {
    this.redemptionEntries = redemptionEntries;
  }


  public LoyaltiesMembersTransfersCreateResponseBodyRedemption _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object represented is by default list. To get this list, you need to make a call to the endpoint returned in the url attribute.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public LoyaltiesMembersTransfersCreateResponseBodyRedemption url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The endpoint where this list of redemptions can be accessed using a GET method. /v1/vouchers/{voucher_code}/redemptions
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltiesMembersTransfersCreateResponseBodyRedemption loyaltiesMembersTransfersCreateResponseBodyRedemption = (LoyaltiesMembersTransfersCreateResponseBodyRedemption) o;
    return Objects.equals(this.quantity, loyaltiesMembersTransfersCreateResponseBodyRedemption.quantity) &&
        Objects.equals(this.redeemedPoints, loyaltiesMembersTransfersCreateResponseBodyRedemption.redeemedPoints) &&
        Objects.equals(this.redeemedQuantity, loyaltiesMembersTransfersCreateResponseBodyRedemption.redeemedQuantity) &&
        Objects.equals(this.redemptionEntries, loyaltiesMembersTransfersCreateResponseBodyRedemption.redemptionEntries) &&
        Objects.equals(this._object, loyaltiesMembersTransfersCreateResponseBodyRedemption._object) &&
        Objects.equals(this.url, loyaltiesMembersTransfersCreateResponseBodyRedemption.url);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, redeemedPoints, redeemedQuantity, redemptionEntries, _object, url);
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
    sb.append("class LoyaltiesMembersTransfersCreateResponseBodyRedemption {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    redeemedPoints: ").append(toIndentedString(redeemedPoints)).append("\n");
    sb.append("    redeemedQuantity: ").append(toIndentedString(redeemedQuantity)).append("\n");
    sb.append("    redemptionEntries: ").append(toIndentedString(redemptionEntries)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("quantity");
    openapiFields.add("redeemed_points");
    openapiFields.add("redeemed_quantity");
    openapiFields.add("redemption_entries");
    openapiFields.add("object");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesMembersTransfersCreateResponseBodyRedemption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LoyaltiesMembersTransfersCreateResponseBodyRedemption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoyaltiesMembersTransfersCreateResponseBodyRedemption is not found in the empty JSON string", LoyaltiesMembersTransfersCreateResponseBodyRedemption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LoyaltiesMembersTransfersCreateResponseBodyRedemption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoyaltiesMembersTransfersCreateResponseBodyRedemption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("redemption_entries") != null && !jsonObj.get("redemption_entries").isJsonNull() && !jsonObj.get("redemption_entries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redemption_entries` to be an array in the JSON string but got `%s`", jsonObj.get("redemption_entries").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
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
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltiesMembersTransfersCreateResponseBodyRedemption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltiesMembersTransfersCreateResponseBodyRedemption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltiesMembersTransfersCreateResponseBodyRedemption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesMembersTransfersCreateResponseBodyRedemption.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltiesMembersTransfersCreateResponseBodyRedemption>() {
           @Override
           public void write(JsonWriter out, LoyaltiesMembersTransfersCreateResponseBodyRedemption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoyaltiesMembersTransfersCreateResponseBodyRedemption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoyaltiesMembersTransfersCreateResponseBodyRedemption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesMembersTransfersCreateResponseBodyRedemption
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesMembersTransfersCreateResponseBodyRedemption
  */
  public static LoyaltiesMembersTransfersCreateResponseBodyRedemption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesMembersTransfersCreateResponseBodyRedemption.class);
  }

 /**
  * Convert an instance of LoyaltiesMembersTransfersCreateResponseBodyRedemption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
