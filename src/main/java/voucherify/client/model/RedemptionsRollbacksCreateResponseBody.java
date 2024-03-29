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
import voucherify.client.model.OrderCalculatedNoCustomerData;
import voucherify.client.model.RedemptionRollback;

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
 * Response body schema for POST &#x60;/redemptions/{parentRedemptionID}/rollbacks&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsRollbacksCreateResponseBody {
  public static final String SERIALIZED_NAME_ROLLBACKS = "rollbacks";
  @SerializedName(SERIALIZED_NAME_ROLLBACKS)
  private List<RedemptionRollback> rollbacks;

  public static final String SERIALIZED_NAME_PARENT_ROLLBACK = "parent_rollback";
  @SerializedName(SERIALIZED_NAME_PARENT_ROLLBACK)
  private RedemptionRollback parentRollback;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculatedNoCustomerData order;

  public RedemptionsRollbacksCreateResponseBody() {
  }

  public RedemptionsRollbacksCreateResponseBody rollbacks(List<RedemptionRollback> rollbacks) {
    
    this.rollbacks = rollbacks;
    return this;
  }

  public RedemptionsRollbacksCreateResponseBody addRollbacksItem(RedemptionRollback rollbacksItem) {
    if (this.rollbacks == null) {
      this.rollbacks = new ArrayList<>();
    }
    this.rollbacks.add(rollbacksItem);
    return this;
  }

   /**
   * Contains the rollback redemption objects of the particular incentives.
   * @return rollbacks
  **/
  @javax.annotation.Nullable
  public List<RedemptionRollback> getRollbacks() {
    return rollbacks;
  }


  public void setRollbacks(List<RedemptionRollback> rollbacks) {
    this.rollbacks = rollbacks;
  }


  public RedemptionsRollbacksCreateResponseBody parentRollback(RedemptionRollback parentRollback) {
    
    this.parentRollback = parentRollback;
    return this;
  }

   /**
   * Get parentRollback
   * @return parentRollback
  **/
  @javax.annotation.Nullable
  public RedemptionRollback getParentRollback() {
    return parentRollback;
  }


  public void setParentRollback(RedemptionRollback parentRollback) {
    this.parentRollback = parentRollback;
  }


  public RedemptionsRollbacksCreateResponseBody order(OrderCalculatedNoCustomerData order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderCalculatedNoCustomerData getOrder() {
    return order;
  }


  public void setOrder(OrderCalculatedNoCustomerData order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedemptionsRollbacksCreateResponseBody redemptionsRollbacksCreateResponseBody = (RedemptionsRollbacksCreateResponseBody) o;
    return Objects.equals(this.rollbacks, redemptionsRollbacksCreateResponseBody.rollbacks) &&
        Objects.equals(this.parentRollback, redemptionsRollbacksCreateResponseBody.parentRollback) &&
        Objects.equals(this.order, redemptionsRollbacksCreateResponseBody.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollbacks, parentRollback, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedemptionsRollbacksCreateResponseBody {\n");
    sb.append("    rollbacks: ").append(toIndentedString(rollbacks)).append("\n");
    sb.append("    parentRollback: ").append(toIndentedString(parentRollback)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("rollbacks");
    openapiFields.add("parent_rollback");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RedemptionsRollbacksCreateResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RedemptionsRollbacksCreateResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RedemptionsRollbacksCreateResponseBody is not found in the empty JSON string", RedemptionsRollbacksCreateResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RedemptionsRollbacksCreateResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RedemptionsRollbacksCreateResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("rollbacks") != null && !jsonObj.get("rollbacks").isJsonNull()) {
        JsonArray jsonArrayrollbacks = jsonObj.getAsJsonArray("rollbacks");
        if (jsonArrayrollbacks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rollbacks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rollbacks` to be an array in the JSON string but got `%s`", jsonObj.get("rollbacks").toString()));
          }

          // validate the optional field `rollbacks` (array)
          for (int i = 0; i < jsonArrayrollbacks.size(); i++) {
            RedemptionRollback.validateJsonElement(jsonArrayrollbacks.get(i));
          };
        }
      }
      // validate the optional field `parent_rollback`
      if (jsonObj.get("parent_rollback") != null && !jsonObj.get("parent_rollback").isJsonNull()) {
        RedemptionRollback.validateJsonElement(jsonObj.get("parent_rollback"));
      }
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        OrderCalculatedNoCustomerData.validateJsonElement(jsonObj.get("order"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsRollbacksCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsRollbacksCreateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsRollbacksCreateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsRollbacksCreateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsRollbacksCreateResponseBody>() {
           @Override
           public void write(JsonWriter out, RedemptionsRollbacksCreateResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RedemptionsRollbacksCreateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RedemptionsRollbacksCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsRollbacksCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to RedemptionsRollbacksCreateResponseBody
  */
  public static RedemptionsRollbacksCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsRollbacksCreateResponseBody.class);
  }

 /**
  * Convert an instance of RedemptionsRollbacksCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

