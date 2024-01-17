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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.QualificationsOptionFilters;

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
 * Configure parameters returned in the response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T09:04:49.535428+01:00[Europe/Warsaw]")
public class QualificationsOption {
  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_STARTING_AFTER = "starting_after";
  @SerializedName(SERIALIZED_NAME_STARTING_AFTER)
  private OffsetDateTime startingAfter;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private QualificationsOptionFilters filters;

  /**
   * Gets or Sets expand
   */
  @JsonAdapter(ExpandEnum.Adapter.class)
  public enum ExpandEnum {
    REDEEMABLE("redeemable"),
    
    CATEGORY("category"),
    
    VALIDATION_RULES("validation_rules");

    private String value;

    ExpandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpandEnum fromValue(String value) {
      for (ExpandEnum b : ExpandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExpandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpandEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExpandEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private List<ExpandEnum> expand;

  /**
   * Is used to determine the order in which data is displayed in the result array.    - &#x60;DEFAULT&#x60; - Sorting descending by &#x60;created_at&#x60;   - &#x60;BEST_DEAL&#x60; - Sorting descending by &#x60;total_applied_discount_amount&#x60;   - &#x60;LEAST_DEAL&#x60; - Sorting ascending by &#x60;total_applied_discount_amount&#x60;
   */
  @JsonAdapter(SortingRuleEnum.Adapter.class)
  public enum SortingRuleEnum {
    BEST_DEAL("BEST_DEAL"),
    
    LEAST_DEAL("LEAST_DEAL"),
    
    DEFAULT("DEFAULT");

    private String value;

    SortingRuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortingRuleEnum fromValue(String value) {
      for (SortingRuleEnum b : SortingRuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortingRuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortingRuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortingRuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortingRuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SORTING_RULE = "sorting_rule";
  @SerializedName(SERIALIZED_NAME_SORTING_RULE)
  private SortingRuleEnum sortingRule;

  public QualificationsOption() {
  }

  public QualificationsOption limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of redeemables to be returned in the API request. The actual number of returned redeemables will be determined by the API. The default value is set to 5
   * maximum: 100
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public QualificationsOption startingAfter(OffsetDateTime startingAfter) {
    
    this.startingAfter = startingAfter;
    return this;
  }

   /**
   * Cursor used for paging.
   * @return startingAfter
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartingAfter() {
    return startingAfter;
  }


  public void setStartingAfter(OffsetDateTime startingAfter) {
    this.startingAfter = startingAfter;
  }


  public QualificationsOption filters(QualificationsOptionFilters filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  public QualificationsOptionFilters getFilters() {
    return filters;
  }


  public void setFilters(QualificationsOptionFilters filters) {
    this.filters = filters;
  }


  public QualificationsOption expand(List<ExpandEnum> expand) {
    
    this.expand = expand;
    return this;
  }

  public QualificationsOption addExpandItem(ExpandEnum expandItem) {
    if (this.expand == null) {
      this.expand = new ArrayList<>();
    }
    this.expand.add(expandItem);
    return this;
  }

   /**
   * The expand array lets you configure the parameters included in the response. Depending on the strings included in the array, the response will contain different details.   | **Expand Option** | **Response Body** | |:---|:---| | [\&quot;redeemable\&quot;] | - Returns the redeemables&#39; metadata. | | [\&quot;category\&quot;] | - Returns an expanded &#x60;categories&#x60; object, showing details about the category. | | [\&quot;validation_rules\&quot;] | - Returns an expanded &#x60;validation_rules&#x60; object, showing details about the validation rules. |
   * @return expand
  **/
  @javax.annotation.Nullable
  public List<ExpandEnum> getExpand() {
    return expand;
  }


  public void setExpand(List<ExpandEnum> expand) {
    this.expand = expand;
  }


  public QualificationsOption sortingRule(SortingRuleEnum sortingRule) {
    
    this.sortingRule = sortingRule;
    return this;
  }

   /**
   * Is used to determine the order in which data is displayed in the result array.    - &#x60;DEFAULT&#x60; - Sorting descending by &#x60;created_at&#x60;   - &#x60;BEST_DEAL&#x60; - Sorting descending by &#x60;total_applied_discount_amount&#x60;   - &#x60;LEAST_DEAL&#x60; - Sorting ascending by &#x60;total_applied_discount_amount&#x60;
   * @return sortingRule
  **/
  @javax.annotation.Nullable
  public SortingRuleEnum getSortingRule() {
    return sortingRule;
  }


  public void setSortingRule(SortingRuleEnum sortingRule) {
    this.sortingRule = sortingRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationsOption qualificationsOption = (QualificationsOption) o;
    return Objects.equals(this.limit, qualificationsOption.limit) &&
        Objects.equals(this.startingAfter, qualificationsOption.startingAfter) &&
        Objects.equals(this.filters, qualificationsOption.filters) &&
        Objects.equals(this.expand, qualificationsOption.expand) &&
        Objects.equals(this.sortingRule, qualificationsOption.sortingRule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, startingAfter, filters, expand, sortingRule);
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
    sb.append("class QualificationsOption {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    startingAfter: ").append(toIndentedString(startingAfter)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    sortingRule: ").append(toIndentedString(sortingRule)).append("\n");
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
    openapiFields.add("limit");
    openapiFields.add("starting_after");
    openapiFields.add("filters");
    openapiFields.add("expand");
    openapiFields.add("sorting_rule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QualificationsOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QualificationsOption.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QualificationsOption is not found in the empty JSON string", QualificationsOption.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QualificationsOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QualificationsOption` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        QualificationsOptionFilters.validateJsonElement(jsonObj.get("filters"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull() && !jsonObj.get("expand").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be an array in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      if ((jsonObj.get("sorting_rule") != null && !jsonObj.get("sorting_rule").isJsonNull()) && !jsonObj.get("sorting_rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sorting_rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sorting_rule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationsOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationsOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationsOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationsOption.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationsOption>() {
           @Override
           public void write(JsonWriter out, QualificationsOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QualificationsOption read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QualificationsOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationsOption
  * @throws IOException if the JSON string is invalid with respect to QualificationsOption
  */
  public static QualificationsOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationsOption.class);
  }

 /**
  * Convert an instance of QualificationsOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

