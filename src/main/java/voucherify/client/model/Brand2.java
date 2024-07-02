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
 * Defines basic brand details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class Brand2 {
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

  public Brand2() {
  }

  public Brand2 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Defines brand name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Brand2 privacyPolicyUrl(String privacyPolicyUrl) {
    
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Defines the URL to the brand&#39;s privacy policy. It must be a valid URL format.
   * @return privacyPolicyUrl
  **/
  @javax.annotation.Nullable
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }


  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }


  public Brand2 termsOfUseUrl(String termsOfUseUrl) {
    
    this.termsOfUseUrl = termsOfUseUrl;
    return this;
  }

   /**
   * Defines the URL to the brand&#39;s terms of use.  It must be a valid URL format.
   * @return termsOfUseUrl
  **/
  @javax.annotation.Nullable
  public String getTermsOfUseUrl() {
    return termsOfUseUrl;
  }


  public void setTermsOfUseUrl(String termsOfUseUrl) {
    this.termsOfUseUrl = termsOfUseUrl;
  }


  public Brand2 permissionReminder(String permissionReminder) {
    
    this.permissionReminder = permissionReminder;
    return this;
  }

   /**
   * Defines the message that is displayed to customers who opted in an email newsletter.
   * @return permissionReminder
  **/
  @javax.annotation.Nonnull
  public String getPermissionReminder() {
    return permissionReminder;
  }


  public void setPermissionReminder(String permissionReminder) {
    this.permissionReminder = permissionReminder;
  }


  public Brand2 websiteUrl(String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Defines the URL to the brand&#39;s website. It must be a valid URL format.
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
    Brand2 brand2 = (Brand2) o;
    return Objects.equals(this.name, brand2.name) &&
        Objects.equals(this.privacyPolicyUrl, brand2.privacyPolicyUrl) &&
        Objects.equals(this.termsOfUseUrl, brand2.termsOfUseUrl) &&
        Objects.equals(this.permissionReminder, brand2.permissionReminder) &&
        Objects.equals(this.websiteUrl, brand2.websiteUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privacyPolicyUrl, termsOfUseUrl, permissionReminder, websiteUrl);
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
    sb.append("class Brand2 {\n");
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
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("permission_reminder");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Brand2
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Brand2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Brand2 is not found in the empty JSON string", Brand2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Brand2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Brand2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Brand2.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("privacy_policy_url") != null && !jsonObj.get("privacy_policy_url").isJsonNull()) && !jsonObj.get("privacy_policy_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacy_policy_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacy_policy_url").toString()));
      }
      if ((jsonObj.get("terms_of_use_url") != null && !jsonObj.get("terms_of_use_url").isJsonNull()) && !jsonObj.get("terms_of_use_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terms_of_use_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terms_of_use_url").toString()));
      }
      if (!jsonObj.get("permission_reminder").isJsonPrimitive()) {
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
       if (!Brand2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Brand2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Brand2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Brand2.class));

       return (TypeAdapter<T>) new TypeAdapter<Brand2>() {
           @Override
           public void write(JsonWriter out, Brand2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Brand2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Brand2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Brand2
  * @throws IOException if the JSON string is invalid with respect to Brand2
  */
  public static Brand2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Brand2.class);
  }

 /**
  * Convert an instance of Brand2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

