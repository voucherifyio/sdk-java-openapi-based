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
 * Gets or Sets ExportPointsExpirationFields
 */
@JsonAdapter(ExportPointsExpirationFields.Adapter.class)
public enum ExportPointsExpirationFields {
  
  ID("id"),
  
  CAMPAIGN_ID("campaign_id"),
  
  VOUCHER_ID("voucher_id"),
  
  POINTS("points"),
  
  STATUS("status"),
  
  EXPIRES_AT("expires_at");

  private String value;

  ExportPointsExpirationFields(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExportPointsExpirationFields fromValue(String value) {
    for (ExportPointsExpirationFields b : ExportPointsExpirationFields.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExportPointsExpirationFields> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExportPointsExpirationFields enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExportPointsExpirationFields read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExportPointsExpirationFields.fromValue(value);
    }
  }
}

