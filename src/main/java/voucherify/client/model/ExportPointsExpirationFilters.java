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
 * ExportPointsExpirationFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:00:53.208514+01:00[Europe/Warsaw]")
public class ExportPointsExpirationFilters {
  public static final String SERIALIZED_NAME_JUNCTION = "junction";
  @SerializedName(SERIALIZED_NAME_JUNCTION)
  private Junction junction;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private FieldConditions id;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private FieldConditions campaignId;

  public static final String SERIALIZED_NAME_VOUCHER_ID = "voucher_id";
  @SerializedName(SERIALIZED_NAME_VOUCHER_ID)
  private FieldConditions voucherId;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private FieldConditions points;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FieldConditions status;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private FieldConditions expiresAt;

  public ExportPointsExpirationFilters() {
  }

  public ExportPointsExpirationFilters junction(Junction junction) {
    
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


  public ExportPointsExpirationFilters id(FieldConditions id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public FieldConditions getId() {
    return id;
  }


  public void setId(FieldConditions id) {
    this.id = id;
  }


  public ExportPointsExpirationFilters campaignId(FieldConditions campaignId) {
    
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


  public ExportPointsExpirationFilters voucherId(FieldConditions voucherId) {
    
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


  public ExportPointsExpirationFilters points(FieldConditions points) {
    
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nullable
  public FieldConditions getPoints() {
    return points;
  }


  public void setPoints(FieldConditions points) {
    this.points = points;
  }


  public ExportPointsExpirationFilters status(FieldConditions status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public FieldConditions getStatus() {
    return status;
  }


  public void setStatus(FieldConditions status) {
    this.status = status;
  }


  public ExportPointsExpirationFilters expiresAt(FieldConditions expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  public FieldConditions getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(FieldConditions expiresAt) {
    this.expiresAt = expiresAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportPointsExpirationFilters exportPointsExpirationFilters = (ExportPointsExpirationFilters) o;
    return Objects.equals(this.junction, exportPointsExpirationFilters.junction) &&
        Objects.equals(this.id, exportPointsExpirationFilters.id) &&
        Objects.equals(this.campaignId, exportPointsExpirationFilters.campaignId) &&
        Objects.equals(this.voucherId, exportPointsExpirationFilters.voucherId) &&
        Objects.equals(this.points, exportPointsExpirationFilters.points) &&
        Objects.equals(this.status, exportPointsExpirationFilters.status) &&
        Objects.equals(this.expiresAt, exportPointsExpirationFilters.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(junction, id, campaignId, voucherId, points, status, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportPointsExpirationFilters {\n");
    sb.append("    junction: ").append(toIndentedString(junction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("campaign_id");
    openapiFields.add("voucher_id");
    openapiFields.add("points");
    openapiFields.add("status");
    openapiFields.add("expires_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ExportPointsExpirationFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ExportPointsExpirationFilters.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportPointsExpirationFilters is not found in the empty JSON string", ExportPointsExpirationFilters.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ExportPointsExpirationFilters.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportPointsExpirationFilters` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `id`
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("id"));
      }
      // validate the optional field `campaign_id`
      if (jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("campaign_id"));
      }
      // validate the optional field `voucher_id`
      if (jsonObj.get("voucher_id") != null && !jsonObj.get("voucher_id").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("voucher_id"));
      }
      // validate the optional field `points`
      if (jsonObj.get("points") != null && !jsonObj.get("points").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("points"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `expires_at`
      if (jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()) {
        FieldConditions.validateJsonElement(jsonObj.get("expires_at"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportPointsExpirationFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportPointsExpirationFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportPointsExpirationFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportPointsExpirationFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportPointsExpirationFilters>() {
           @Override
           public void write(JsonWriter out, ExportPointsExpirationFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportPointsExpirationFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportPointsExpirationFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportPointsExpirationFilters
  * @throws IOException if the JSON string is invalid with respect to ExportPointsExpirationFilters
  */
  public static ExportPointsExpirationFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportPointsExpirationFilters.class);
  }

 /**
  * Convert an instance of ExportPointsExpirationFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
