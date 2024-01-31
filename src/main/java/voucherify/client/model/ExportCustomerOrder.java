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
 * Gets or Sets ExportCustomerOrder
 */
@JsonAdapter(ExportCustomerOrder.Adapter.class)
public enum ExportCustomerOrder {
  
  _NAME("-name"),
  
  NAME("name"),
  
  _ID("-id"),
  
  ID("id"),
  
  _EMAIL("-email"),
  
  EMAIL("email"),
  
  _SOURCE_ID("-source_id"),
  
  SOURCE_ID("source_id"),
  
  _CREATED_AT("-created_at"),
  
  CREATED_AT("created_at"),
  
  _UPDATED_AT("-updated_at"),
  
  UPDATED_AT("updated_at");

  private String value;

  ExportCustomerOrder(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExportCustomerOrder fromValue(String value) {
    for (ExportCustomerOrder b : ExportCustomerOrder.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExportCustomerOrder> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExportCustomerOrder enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExportCustomerOrder read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExportCustomerOrder.fromValue(value);
    }
  }
}
