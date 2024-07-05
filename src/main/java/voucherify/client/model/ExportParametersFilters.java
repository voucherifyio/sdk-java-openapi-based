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
import voucherify.client.model.FieldConditions;
import voucherify.client.model.Junction;

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
 * ExportParametersFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ExportParametersFilters {
  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private FieldConditions campaignId;

  public static final String SERIALIZED_NAME_VOUCHER_ID = "voucher_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ID)
  private FieldConditions voucherId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private FieldConditions createdAt;

  public ExportParametersFilters() {
  }

  public ExportParametersFilters junction(Junction junction) {
    
    this.junction = junction;
    return this;
  }

   /**
   * Get junction
   * @return junction
  **/
  @javax.annotation.Nullable
  public Junction getJunction() {
    return junction;
  }


  public void setJunction(Junction junction) {
    this.junction = junction;
  }


  public ExportParametersFilters campaignId(FieldConditions campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public FieldConditions getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(FieldConditions campaignId) {
    this.campaignId = campaignId;
  }


  public ExportParametersFilters voucherId(FieldConditions voucherId) {
    
    this.voucherId = voucherId;
    return this;
  }

   /**
   * Get voucherId
   * @return voucherId
  **/
  @javax.annotation.Nullable
  public FieldConditions getVoucherId() {
    return voucherId;
  }


  public void setVoucherId(FieldConditions voucherId) {
    this.voucherId = voucherId;
  }


  public ExportParametersFilters createdAt(FieldConditions createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public FieldConditions getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(FieldConditions createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportParametersFilters exportParametersFilters = (ExportParametersFilters) o;
    return Objects.equals(this.junction, exportParametersFilters.junction) &&
        Objects.equals(this.campaignId, exportParametersFilters.campaignId) &&
        Objects.equals(this.voucherId, exportParametersFilters.voucherId) &&
        Objects.equals(this.createdAt, exportParametersFilters.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junction, campaignId, voucherId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportParametersFilters {\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("junction");
    openapiFields.add("campaign_id");
    openapiFields.add("voucher_id");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportParametersFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportParametersFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportParametersFilters is not found in the empty JSON string", ExportParametersFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportParametersFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportParametersFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `campaign_id`
      if (jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("campaign_id"));
      }
      // validate the optional field `voucher_id`
      if (jsonObj.get("voucher_id") != null && !jsonObj.get("voucher_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("voucher_id"));
      }
      // validate the optional field `created_at`
      if (jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("created_at"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportParametersFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportParametersFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportParametersFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportParametersFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportParametersFilters>() {
           @Override
           public void write(JsonWriter out, ExportParametersFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportParametersFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportParametersFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportParametersFilters
  * @throws IOException if the JSON string is invalid with respect to ExportParametersFilters
  */
  public static ExportParametersFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportParametersFilters.class);
  }

 /**
  * Convert an instance of ExportParametersFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
