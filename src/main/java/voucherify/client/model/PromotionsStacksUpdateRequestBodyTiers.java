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
 * Contains the tier configuration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class PromotionsStacksUpdateRequestBodyTiers {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<String> ids;

  /**
   * Category hierarchy.
   */
  @JsonAdapter(HierarchyModeEnum.Adapter.class)
  public enum HierarchyModeEnum {
    MANUAL("MANUAL");

    private String value;

    HierarchyModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HierarchyModeEnum fromValue(String value) {
      for (HierarchyModeEnum b : HierarchyModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HierarchyModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HierarchyModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HierarchyModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HierarchyModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HIERARCHY_MODE = "hierarchy_mode";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_MODE)
  private HierarchyModeEnum hierarchyMode = HierarchyModeEnum.MANUAL;

  public PromotionsStacksUpdateRequestBodyTiers() {
  }

  public PromotionsStacksUpdateRequestBodyTiers ids(List<String> ids) {
    
    this.ids = ids;
    return this;
  }

  public PromotionsStacksUpdateRequestBodyTiers addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Contains the list of tiers in a pre-defined sequence.
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<String> getIds() {
    return ids;
  }


  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public PromotionsStacksUpdateRequestBodyTiers hierarchyMode(HierarchyModeEnum hierarchyMode) {
    
    this.hierarchyMode = hierarchyMode;
    return this;
  }

   /**
   * Category hierarchy.
   * @return hierarchyMode
  **/
  @javax.annotation.Nullable
  public HierarchyModeEnum getHierarchyMode() {
    return hierarchyMode;
  }


  public void setHierarchyMode(HierarchyModeEnum hierarchyMode) {
    this.hierarchyMode = hierarchyMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionsStacksUpdateRequestBodyTiers promotionsStacksUpdateRequestBodyTiers = (PromotionsStacksUpdateRequestBodyTiers) o;
    return Objects.equals(this.ids, promotionsStacksUpdateRequestBodyTiers.ids) &&
        Objects.equals(this.hierarchyMode, promotionsStacksUpdateRequestBodyTiers.hierarchyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, hierarchyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionsStacksUpdateRequestBodyTiers {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    hierarchyMode: ").append(toIndentedString(hierarchyMode)).append("\n");
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
    openapiFields.add("ids");
    openapiFields.add("hierarchy_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PromotionsStacksUpdateRequestBodyTiers
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PromotionsStacksUpdateRequestBodyTiers.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromotionsStacksUpdateRequestBodyTiers is not found in the empty JSON string", PromotionsStacksUpdateRequestBodyTiers.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PromotionsStacksUpdateRequestBodyTiers.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromotionsStacksUpdateRequestBodyTiers` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonNull() && !jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      if ((jsonObj.get("hierarchy_mode") != null && !jsonObj.get("hierarchy_mode").isJsonNull()) && !jsonObj.get("hierarchy_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hierarchy_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hierarchy_mode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionsStacksUpdateRequestBodyTiers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionsStacksUpdateRequestBodyTiers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionsStacksUpdateRequestBodyTiers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionsStacksUpdateRequestBodyTiers.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionsStacksUpdateRequestBodyTiers>() {
           @Override
           public void write(JsonWriter out, PromotionsStacksUpdateRequestBodyTiers value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionsStacksUpdateRequestBodyTiers read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionsStacksUpdateRequestBodyTiers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionsStacksUpdateRequestBodyTiers
  * @throws IOException if the JSON string is invalid with respect to PromotionsStacksUpdateRequestBodyTiers
  */
  public static PromotionsStacksUpdateRequestBodyTiers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionsStacksUpdateRequestBodyTiers.class);
  }

 /**
  * Convert an instance of PromotionsStacksUpdateRequestBodyTiers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

