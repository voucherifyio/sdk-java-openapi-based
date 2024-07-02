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
 * Defines basic brand details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Brand {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIVACY_POLICY_URL = "privacy_policy_url";
  @SerializedName(SERIALIZED_NAME_PRIVACY_POLICY_URL)
  private String privacyPolicyUrl;

  public static final String SERIALIZED_NAME_TERMS_OF_USE_URL = "terms_of_use_url";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_USE_URL)
  private String termsOfUseUrl;

  public static final String SERIALIZED_NAME_PERMISSION_REMINDER = "permission_reminder";
  @SerializedName(SERIALIZED_NAME_PERMISSION_REMINDER)
  private String permissionReminder;

  public static final String SERIALIZED_NAME_WEBSITE_URL = "website_url";
  @SerializedName(SERIALIZED_NAME_WEBSITE_URL)
  private String websiteUrl;

  public Brand() {
  }

  public Brand name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Defines brand name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Brand privacyPolicyUrl(String privacyPolicyUrl) {
    
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Defines the URL to the brand&#39;s privacy policy.
   * @return privacyPolicyUrl
  **/
  @javax.annotation.Nullable
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }


  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }


  public Brand termsOfUseUrl(String termsOfUseUrl) {
    
    this.termsOfUseUrl = termsOfUseUrl;
    return this;
  }

   /**
   * Defines the URL to the brand&#39;s terms of use.
   * @return termsOfUseUrl
  **/
  @javax.annotation.Nullable
  public String getTermsOfUseUrl() {
    return termsOfUseUrl;
  }


  public void setTermsOfUseUrl(String termsOfUseUrl) {
    this.termsOfUseUrl = termsOfUseUrl;
  }


  public Brand permissionReminder(String permissionReminder) {
    
    this.permissionReminder = permissionReminder;
    return this;
  }

   /**
   * Defines the message that is displayed to customers who opted in an email newsletter.
   * @return permissionReminder
  **/
  @javax.annotation.Nullable
  public String getPermissionReminder() {
    return permissionReminder;
  }


  public void setPermissionReminder(String permissionReminder) {
    this.permissionReminder = permissionReminder;
  }


  public Brand websiteUrl(String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Defines the URL to the brand&#39;s website.
   * @return websiteUrl
  **/
  @javax.annotation.Nullable
  public String getWebsiteUrl() {
    return websiteUrl;
  }


  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brand brand = (Brand) o;
    return Objects.equals(this.name, brand.name) &&
        Objects.equals(this.privacyPolicyUrl, brand.privacyPolicyUrl) &&
        Objects.equals(this.termsOfUseUrl, brand.termsOfUseUrl) &&
        Objects.equals(this.permissionReminder, brand.permissionReminder) &&
        Objects.equals(this.websiteUrl, brand.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privacyPolicyUrl, termsOfUseUrl, permissionReminder, websiteUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brand {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    termsOfUseUrl: ").append(toIndentedString(termsOfUseUrl)).append("\n");
    sb.append("    permissionReminder: ").append(toIndentedString(permissionReminder)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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
    openapiFields.add("privacy_policy_url");
    openapiFields.add("terms_of_use_url");
    openapiFields.add("permission_reminder");
    openapiFields.add("website_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Brand
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Brand.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Brand is not found in the empty JSON string", Brand.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Brand.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Brand` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("privacy_policy_url") != null && !jsonObj.get("privacy_policy_url").isJsonNull()) && !jsonObj.get("privacy_policy_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacy_policy_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacy_policy_url").toString()));
      }
      if ((jsonObj.get("terms_of_use_url") != null && !jsonObj.get("terms_of_use_url").isJsonNull()) && !jsonObj.get("terms_of_use_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terms_of_use_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terms_of_use_url").toString()));
      }
      if ((jsonObj.get("permission_reminder") != null && !jsonObj.get("permission_reminder").isJsonNull()) && !jsonObj.get("permission_reminder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission_reminder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission_reminder").toString()));
      }
      if ((jsonObj.get("website_url") != null && !jsonObj.get("website_url").isJsonNull()) && !jsonObj.get("website_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Brand.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Brand' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Brand> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Brand.class));

       return (TypeAdapter<T>) new TypeAdapter<Brand>() {
           @Override
           public void write(JsonWriter out, Brand value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Brand read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Brand given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Brand
  * @throws IOException if the JSON string is invalid with respect to Brand
  */
  public static Brand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Brand.class);
  }

 /**
  * Convert an instance of Brand to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

