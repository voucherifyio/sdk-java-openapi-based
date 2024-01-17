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
 * PropertiesForLoyaltyCampaignOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class PropertiesForLoyaltyCampaignOptions {
  public static final String SERIALIZED_NAME_RECALCULATE_TIERS = "recalculate_tiers";
  @SerializedName(SERIALIZED_NAME_RECALCULATE_TIERS)
  private Boolean recalculateTiers;

  public PropertiesForLoyaltyCampaignOptions() {
  }

  public PropertiesForLoyaltyCampaignOptions recalculateTiers(Boolean recalculateTiers) {
    
    this.recalculateTiers = recalculateTiers;
    return this;
  }

   /**
   * Determine if tiers should be recalculated or no.
   * @return recalculateTiers
  **/
  @javax.annotation.Nullable
  public Boolean getRecalculateTiers() {
    return recalculateTiers;
  }


  public void setRecalculateTiers(Boolean recalculateTiers) {
    this.recalculateTiers = recalculateTiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertiesForLoyaltyCampaignOptions propertiesForLoyaltyCampaignOptions = (PropertiesForLoyaltyCampaignOptions) o;
    return Objects.equals(this.recalculateTiers, propertiesForLoyaltyCampaignOptions.recalculateTiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recalculateTiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertiesForLoyaltyCampaignOptions {\n");
    sb.append("    recalculateTiers: ").append(toIndentedString(recalculateTiers)).append("\n");
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
    openapiFields.add("recalculate_tiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PropertiesForLoyaltyCampaignOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PropertiesForLoyaltyCampaignOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertiesForLoyaltyCampaignOptions is not found in the empty JSON string", PropertiesForLoyaltyCampaignOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PropertiesForLoyaltyCampaignOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertiesForLoyaltyCampaignOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertiesForLoyaltyCampaignOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertiesForLoyaltyCampaignOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertiesForLoyaltyCampaignOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertiesForLoyaltyCampaignOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertiesForLoyaltyCampaignOptions>() {
           @Override
           public void write(JsonWriter out, PropertiesForLoyaltyCampaignOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertiesForLoyaltyCampaignOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropertiesForLoyaltyCampaignOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropertiesForLoyaltyCampaignOptions
  * @throws IOException if the JSON string is invalid with respect to PropertiesForLoyaltyCampaignOptions
  */
  public static PropertiesForLoyaltyCampaignOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertiesForLoyaltyCampaignOptions.class);
  }

 /**
  * Convert an instance of PropertiesForLoyaltyCampaignOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

