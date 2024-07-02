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
import voucherify.client.model.Address;
import voucherify.client.model.Brand;
import voucherify.client.model.Cockpit;
import voucherify.client.model.Contact;

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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ManagementProjectsBranding {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private Brand brand;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private Contact contact;

  public static final String SERIALIZED_NAME_COCKPITS = "cockpits";
  @SerializedName(SERIALIZED_NAME_COCKPITS)
  private Cockpit cockpits;

  public ManagementProjectsBranding() {
  }

  public ManagementProjectsBranding brand(Brand brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @javax.annotation.Nullable
  public Brand getBrand() {
    return brand;
  }


  public void setBrand(Brand brand) {
    this.brand = brand;
  }


  public ManagementProjectsBranding address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public ManagementProjectsBranding contact(Contact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  public Contact getContact() {
    return contact;
  }


  public void setContact(Contact contact) {
    this.contact = contact;
  }


  public ManagementProjectsBranding cockpits(Cockpit cockpits) {
    
    this.cockpits = cockpits;
    return this;
  }

   /**
   * Get cockpits
   * @return cockpits
  **/
  @javax.annotation.Nullable
  public Cockpit getCockpits() {
    return cockpits;
  }


  public void setCockpits(Cockpit cockpits) {
    this.cockpits = cockpits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagementProjectsBranding managementProjectsBranding = (ManagementProjectsBranding) o;
    return Objects.equals(this.brand, managementProjectsBranding.brand) &&
        Objects.equals(this.address, managementProjectsBranding.address) &&
        Objects.equals(this.contact, managementProjectsBranding.contact) &&
        Objects.equals(this.cockpits, managementProjectsBranding.cockpits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, address, contact, cockpits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagementProjectsBranding {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    cockpits: ").append(toIndentedString(cockpits)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("address");
    openapiFields.add("contact");
    openapiFields.add("cockpits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ManagementProjectsBranding
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ManagementProjectsBranding.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManagementProjectsBranding is not found in the empty JSON string", ManagementProjectsBranding.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ManagementProjectsBranding.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ManagementProjectsBranding` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `brand`
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) {
        Brand.validateJsonElement(jsonObj.get("brand"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        Address.validateJsonElement(jsonObj.get("address"));
      }
      // validate the optional field `contact`
      if (jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) {
        Contact.validateJsonElement(jsonObj.get("contact"));
      }
      // validate the optional field `cockpits`
      if (jsonObj.get("cockpits") != null && !jsonObj.get("cockpits").isJsonNull()) {
        Cockpit.validateJsonElement(jsonObj.get("cockpits"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManagementProjectsBranding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManagementProjectsBranding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManagementProjectsBranding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManagementProjectsBranding.class));

       return (TypeAdapter<T>) new TypeAdapter<ManagementProjectsBranding>() {
           @Override
           public void write(JsonWriter out, ManagementProjectsBranding value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManagementProjectsBranding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManagementProjectsBranding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManagementProjectsBranding
  * @throws IOException if the JSON string is invalid with respect to ManagementProjectsBranding
  */
  public static ManagementProjectsBranding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManagementProjectsBranding.class);
  }

 /**
  * Convert an instance of ManagementProjectsBranding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

