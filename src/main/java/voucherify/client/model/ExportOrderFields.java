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
 * Gets or Sets ExportOrderFields
 */
@JsonAdapter(ExportOrderFields.Adapter.class)
public enum ExportOrderFields {
  
  ID("id"),
  
  SOURCE_ID("source_id"),
  
  CREATED_AT("created_at"),
  
  UPDATED_AT("updated_at"),
  
  STATUS("status"),
  
  AMOUNT("amount"),
  
  DISCOUNT_AMOUNT("discount_amount"),
  
  ITEMS_DISCOUNT_AMOUNT("items_discount_amount"),
  
  TOTAL_DISCOUNT_AMOUNT("total_discount_amount"),
  
  TOTAL_AMOUNT("total_amount"),
  
  CUSTOMER_ID("customer_id"),
  
  REFERRER_ID("referrer_id"),
  
  METADATA("metadata");

  private String value;

  ExportOrderFields(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExportOrderFields fromValue(String value) {
    for (ExportOrderFields b : ExportOrderFields.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExportOrderFields> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExportOrderFields enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExportOrderFields read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExportOrderFields.fromValue(value);
    }
  }
}

