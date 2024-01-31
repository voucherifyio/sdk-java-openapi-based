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
 * Configure parameters returned in the response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ClientRedemptionsRedeemRequestBodyAllOfOptions {
  /**
   * Gets or Sets expand
   */
  @JsonAdapter(ExpandEnum.Adapter.class)
  public enum ExpandEnum {
    ORDER("order"),
    
    REDEMPTION("redemption"),
    
    REDEEMABLE("redeemable"),
    
    CATEGORY("category");

    private String value;

    ExpandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpandEnum fromValue(String value) {
      for (ExpandEnum b : ExpandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExpandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExpandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private List<ExpandEnum> expand;

  public ClientRedemptionsRedeemRequestBodyAllOfOptions() {
  }

  public ClientRedemptionsRedeemRequestBodyAllOfOptions expand(List<ExpandEnum> expand) {
    
    this.expand = expand;
    return this;
  }

  public ClientRedemptionsRedeemRequestBodyAllOfOptions addExpandItem(ExpandEnum expandItem) {
    if (this.expand == null) {
      this.expand = new ArrayList<>();
    }
    this.expand.add(expandItem);
    return this;
  }

   /**
   * Expand array lets you configure params included in the response. Depending on the strings included in the array, the response will contain different details.   | **Expand Option** | **Response Body** | |:---|:---| | [\&quot;order\&quot;] | - Same response as fallback response (without an options object).&lt;br&gt;- Order data with calculated discounts are listed in each child redeemable object.&lt;br&gt;- Metadata not included for each discount type. | | [\&quot;redeemable\&quot;] | Expands redeemable objects by including &#x60;metadata&#x60; for each discount type. | | [\&quot;order\&quot;, \&quot;redeemable\&quot;] | - Order data with calculated discounts are listed in each child redeemable object.&lt;br&gt;- Includes &#x60;metadata&#x60; for each discount type. | | [\&quot;redeemable\&quot;, \&quot;redemption\&quot;, \&quot;category\&quot;] | - Returns each discount type&#39;s &#x60;metadata&#x60; in each child redemption object.&lt;br&gt;- Returns redemption object &#x60;metadata&#x60;.&lt;br&gt;- Returns an expanded &#x60;categories&#x60; object, showing details about the category. |
   * @return expand
  **/
  @javax.annotation.Nullable
  public List<ExpandEnum> getExpand() {
    return expand;
  }


  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientRedemptionsRedeemRequestBodyAllOfOptions clientRedemptionsRedeemRequestBodyAllOfOptions = (ClientRedemptionsRedeemRequestBodyAllOfOptions) o;
    return Objects.equals(this.expand, clientRedemptionsRedeemRequestBodyAllOfOptions.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientRedemptionsRedeemRequestBodyAllOfOptions {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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
    openapiFields.add("expand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClientRedemptionsRedeemRequestBodyAllOfOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClientRedemptionsRedeemRequestBodyAllOfOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientRedemptionsRedeemRequestBodyAllOfOptions is not found in the empty JSON string", ClientRedemptionsRedeemRequestBodyAllOfOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClientRedemptionsRedeemRequestBodyAllOfOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientRedemptionsRedeemRequestBodyAllOfOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull() && !jsonObj.get("expand").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be an array in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientRedemptionsRedeemRequestBodyAllOfOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientRedemptionsRedeemRequestBodyAllOfOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientRedemptionsRedeemRequestBodyAllOfOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientRedemptionsRedeemRequestBodyAllOfOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientRedemptionsRedeemRequestBodyAllOfOptions>() {
           @Override
           public void write(JsonWriter out, ClientRedemptionsRedeemRequestBodyAllOfOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientRedemptionsRedeemRequestBodyAllOfOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientRedemptionsRedeemRequestBodyAllOfOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientRedemptionsRedeemRequestBodyAllOfOptions
  * @throws IOException if the JSON string is invalid with respect to ClientRedemptionsRedeemRequestBodyAllOfOptions
  */
  public static ClientRedemptionsRedeemRequestBodyAllOfOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientRedemptionsRedeemRequestBodyAllOfOptions.class);
  }

 /**
  * Convert an instance of ClientRedemptionsRedeemRequestBodyAllOfOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
