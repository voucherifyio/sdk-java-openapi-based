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
 * Gets or Sets ParameterOrderListPublications
 */
@JsonAdapter(ParameterOrderListPublications.Adapter.class)
public enum ParameterOrderListPublications {
  
  ID("id"),
  
  _ID("-id"),
  
  VOUCHER_CODE("voucher_code"),
  
  _VOUCHER_CODE("-voucher_code"),
  
  TRACKING_ID("tracking_id"),
  
  _TRACKING_ID("-tracking_id"),
  
  CUSTOMER_ID("customer_id"),
  
  _CUSTOMER_ID("-customer_id"),
  
  CREATED_AT("created_at"),
  
  _CREATED_AT("-created_at"),
  
  CHANNEL("channel"),
  
  _CHANNEL("-channel");

  private String value;

  ParameterOrderListPublications(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ParameterOrderListPublications fromValue(String value) {
    for (ParameterOrderListPublications b : ParameterOrderListPublications.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ParameterOrderListPublications> {
    @Override
    public void write(final JsonWriter jsonWriter, final ParameterOrderListPublications enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ParameterOrderListPublications read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ParameterOrderListPublications.fromValue(value);
    }
  }
}

