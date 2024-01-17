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
 * Defines the ratio based on the property defined in the calculation_type parameter. For every given increment of value (1, 10, etc) defined in the every parameter for the property defined in calculation_type, give the customer the number of points defined in the points parameter. In other words, for every order metadata property value, give points.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class EarningRuleProportionalCustomEventCustomEventMetadata {
  public static final String SERIALIZED_NAME_EVERY = "every";
  @SerializedName(SERIALIZED_NAME_EVERY)
  private Integer every;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private Integer points;

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private String property;

  public EarningRuleProportionalCustomEventCustomEventMetadata() {
  }

  public EarningRuleProportionalCustomEventCustomEventMetadata every(Integer every) {
    
    this.every = every;
    return this;
  }

   /**
   * For how many increments of the customer metadata property to grant points for.
   * @return every
  **/
  @javax.annotation.Nonnull
  public Integer getEvery() {
    return every;
  }


  public void setEvery(Integer every) {
    this.every = every;
  }


  public EarningRuleProportionalCustomEventCustomEventMetadata points(Integer points) {
    
    this.points = points;
    return this;
  }

   /**
   * Number of points to be awarded, i.e. how many points to be added to the loyalty card.
   * @return points
  **/
  @javax.annotation.Nonnull
  public Integer getPoints() {
    return points;
  }


  public void setPoints(Integer points) {
    this.points = points;
  }


  public EarningRuleProportionalCustomEventCustomEventMetadata property(String property) {
    
    this.property = property;
    return this;
  }

   /**
   *  Custom event metadata property.
   * @return property
  **/
  @javax.annotation.Nonnull
  public String getProperty() {
    return property;
  }


  public void setProperty(String property) {
    this.property = property;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningRuleProportionalCustomEventCustomEventMetadata earningRuleProportionalCustomEventCustomEventMetadata = (EarningRuleProportionalCustomEventCustomEventMetadata) o;
    return Objects.equals(this.every, earningRuleProportionalCustomEventCustomEventMetadata.every) &&
        Objects.equals(this.points, earningRuleProportionalCustomEventCustomEventMetadata.points) &&
        Objects.equals(this.property, earningRuleProportionalCustomEventCustomEventMetadata.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(every, points, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningRuleProportionalCustomEventCustomEventMetadata {\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
    openapiFields.add("every");
    openapiFields.add("points");
    openapiFields.add("property");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("every");
    openapiRequiredFields.add("points");
    openapiRequiredFields.add("property");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EarningRuleProportionalCustomEventCustomEventMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EarningRuleProportionalCustomEventCustomEventMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EarningRuleProportionalCustomEventCustomEventMetadata is not found in the empty JSON string", EarningRuleProportionalCustomEventCustomEventMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EarningRuleProportionalCustomEventCustomEventMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EarningRuleProportionalCustomEventCustomEventMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EarningRuleProportionalCustomEventCustomEventMetadata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EarningRuleProportionalCustomEventCustomEventMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EarningRuleProportionalCustomEventCustomEventMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EarningRuleProportionalCustomEventCustomEventMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EarningRuleProportionalCustomEventCustomEventMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<EarningRuleProportionalCustomEventCustomEventMetadata>() {
           @Override
           public void write(JsonWriter out, EarningRuleProportionalCustomEventCustomEventMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EarningRuleProportionalCustomEventCustomEventMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EarningRuleProportionalCustomEventCustomEventMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EarningRuleProportionalCustomEventCustomEventMetadata
  * @throws IOException if the JSON string is invalid with respect to EarningRuleProportionalCustomEventCustomEventMetadata
  */
  public static EarningRuleProportionalCustomEventCustomEventMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EarningRuleProportionalCustomEventCustomEventMetadata.class);
  }

 /**
  * Convert an instance of EarningRuleProportionalCustomEventCustomEventMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

