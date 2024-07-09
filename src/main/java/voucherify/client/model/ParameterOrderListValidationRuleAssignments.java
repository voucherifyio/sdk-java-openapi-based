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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ParameterOrderListValidationRuleAssignments
 */
@JsonAdapter(ParameterOrderListValidationRuleAssignments.Adapter.class)
public enum ParameterOrderListValidationRuleAssignments {
  
  CREATED_AT("created_at"),
  
  _CREATED_AT("-created_at");

  private String value;

  ParameterOrderListValidationRuleAssignments(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ParameterOrderListValidationRuleAssignments fromValue(String value) {
    for (ParameterOrderListValidationRuleAssignments b : ParameterOrderListValidationRuleAssignments.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ParameterOrderListValidationRuleAssignments> {
    @Override
    public void write(final JsonWriter jsonWriter, final ParameterOrderListValidationRuleAssignments enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ParameterOrderListValidationRuleAssignments read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ParameterOrderListValidationRuleAssignments.fromValue(value);
    }
  }
}

