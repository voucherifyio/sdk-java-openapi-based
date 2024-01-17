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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.client.model.CustomerBaseAddress;
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

import org.openapitools.client.JSON;

/**
 * Request body schema for **PUT** &#x60;/customers/{customerId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T13:33:47.147825+01:00[Europe/Warsaw]")
public class CustomersUpdateRequestBody {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private LocalDate birthday;

  public static final String SERIALIZED_NAME_BIRTHDATE = "birthdate";
  @SerializedName(SERIALIZED_NAME_BIRTHDATE)
  private LocalDate birthdate;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CustomerBaseAddress address;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public CustomersUpdateRequestBody() {
  }

  public CustomersUpdateRequestBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Customer&#39;s first and last name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomersUpdateRequestBody description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An arbitrary string that you can attach to a customer object.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomersUpdateRequestBody email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Customer&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomersUpdateRequestBody phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Customer&#39;s phone number. This parameter is mandatory when you try to send out codes to customers via an SMS channel.
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public CustomersUpdateRequestBody birthday(LocalDate birthday) {
    
    this.birthday = birthday;
    return this;
  }

   /**
   * *Deprecated* Customer&#39;s birthdate; format YYYY-MM-DD.
   * @return birthday
  **/
  @javax.annotation.Nullable
  public LocalDate getBirthday() {
    return birthday;
  }


  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }


  public CustomersUpdateRequestBody birthdate(LocalDate birthdate) {
    
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Customer&#39;s birthdate; format YYYY-MM-DD.
   * @return birthdate
  **/
  @javax.annotation.Nullable
  public LocalDate getBirthdate() {
    return birthdate;
  }


  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }


  public CustomersUpdateRequestBody address(CustomerBaseAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  public CustomerBaseAddress getAddress() {
    return address;
  }


  public void setAddress(CustomerBaseAddress address) {
    this.address = address;
  }


  public CustomersUpdateRequestBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of custom key/value pairs that you can attach to a customer. The metadata object stores all custom attributes assigned to the customer. It can be useful for storing additional information about the customer in a structured format. This metadata can be used for validating whether the customer qualifies for a discount or it can be used in building customer segments.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersUpdateRequestBody customersUpdateRequestBody = (CustomersUpdateRequestBody) o;
    return Objects.equals(this.name, customersUpdateRequestBody.name) &&
        Objects.equals(this.description, customersUpdateRequestBody.description) &&
        Objects.equals(this.email, customersUpdateRequestBody.email) &&
        Objects.equals(this.phone, customersUpdateRequestBody.phone) &&
        Objects.equals(this.birthday, customersUpdateRequestBody.birthday) &&
        Objects.equals(this.birthdate, customersUpdateRequestBody.birthdate) &&
        Objects.equals(this.address, customersUpdateRequestBody.address) &&
        Objects.equals(this.metadata, customersUpdateRequestBody.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, email, phone, birthday, birthdate, address, metadata);
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
    sb.append("class CustomersUpdateRequestBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("birthday");
    openapiFields.add("birthdate");
    openapiFields.add("address");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomersUpdateRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomersUpdateRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomersUpdateRequestBody is not found in the empty JSON string", CustomersUpdateRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CustomersUpdateRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomersUpdateRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        CustomerBaseAddress.validateJsonElement(jsonObj.get("address"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomersUpdateRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomersUpdateRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomersUpdateRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomersUpdateRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomersUpdateRequestBody>() {
           @Override
           public void write(JsonWriter out, CustomersUpdateRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomersUpdateRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomersUpdateRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomersUpdateRequestBody
  * @throws IOException if the JSON string is invalid with respect to CustomersUpdateRequestBody
  */
  public static CustomersUpdateRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomersUpdateRequestBody.class);
  }

 /**
  * Convert an instance of CustomersUpdateRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

