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
import voucherify.client.model.CustomerLoyaltyCampaignsValue;

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
 * CustomerLoyalty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CustomerLoyalty {
  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_REFERRED_CUSTOMERS = "referred_customers";
  @SerializedName(SERIALIZED_NAME_REFERRED_CUSTOMERS)
  private Integer referredCustomers;

  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private Map<String, CustomerLoyaltyCampaignsValue> campaigns = new HashMap<>();

  public CustomerLoyalty() {
  }

  public CustomerLoyalty points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Customer&#39;s loyalty points.
   * @return points
  **/
  @javax.annotation.Nonnull
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public CustomerLoyalty referredCustomers(Integer referredCustomers) {
    
    this.referredCustomers = referredCustomers;
    return this;
  }

   /**
   * Total number of customers referred by the customer.
   * @return referredCustomers
  **/
  @javax.annotation.Nonnull
  public Integer getReferredCustomers() {
    return referredCustomers;
  }


  public void setReferredCustomers(Integer referredCustomers) {
    this.referredCustomers = referredCustomers;
  }


  public CustomerLoyalty campaigns(Map<String, CustomerLoyaltyCampaignsValue> campaigns) {
    
    this.campaigns = campaigns;
    return this;
  }

  public CustomerLoyalty putCampaignsItem(String key, CustomerLoyaltyCampaignsValue campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new HashMap<>();
    }
    this.campaigns.put(key, campaignsItem);
    return this;
  }

   /**
   * Contains campaigns with details about point balances and how many customers were referred by the customer.
   * @return campaigns
  **/
  @javax.annotation.Nonnull
  public Map<String, CustomerLoyaltyCampaignsValue> getCampaigns() {
    return campaigns;
  }


  public void setCampaigns(Map<String, CustomerLoyaltyCampaignsValue> campaigns) {
    this.campaigns = campaigns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerLoyalty customerLoyalty = (CustomerLoyalty) o;
    return Objects.equals(this.points, customerLoyalty.points) &&
        Objects.equals(this.referredCustomers, customerLoyalty.referredCustomers) &&
        Objects.equals(this.campaigns, customerLoyalty.campaigns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, referredCustomers, campaigns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerLoyalty {\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    referredCustomers: ").append(toIndentedString(referredCustomers)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
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
    openapiFields.add("points");
    openapiFields.add("referred_customers");
    openapiFields.add("campaigns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("points");
    openapiRequiredFields.add("referred_customers");
    openapiRequiredFields.add("campaigns");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerLoyalty
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerLoyalty.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerLoyalty is not found in the empty JSON string", CustomerLoyalty.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomerLoyalty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerLoyalty` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerLoyalty.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerLoyalty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerLoyalty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerLoyalty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerLoyalty.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerLoyalty>() {
           @Override
           public void write(JsonWriter out, CustomerLoyalty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerLoyalty read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerLoyalty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerLoyalty
  * @throws IOException if the JSON string is invalid with respect to CustomerLoyalty
  */
  public static CustomerLoyalty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerLoyalty.class);
  }

 /**
  * Convert an instance of CustomerLoyalty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

