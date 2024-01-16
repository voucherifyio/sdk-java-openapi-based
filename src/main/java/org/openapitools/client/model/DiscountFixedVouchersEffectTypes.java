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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets DiscountFixedVouchersEffectTypes
 */
@JsonAdapter(DiscountFixedVouchersEffectTypes.Adapter.class)
public enum DiscountFixedVouchersEffectTypes {
  
  ORDER("APPLY_TO_ORDER"),
  
  ITEMS("APPLY_TO_ITEMS");

  private String value;

  DiscountFixedVouchersEffectTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DiscountFixedVouchersEffectTypes fromValue(String value) {
    for (DiscountFixedVouchersEffectTypes b : DiscountFixedVouchersEffectTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DiscountFixedVouchersEffectTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final DiscountFixedVouchersEffectTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DiscountFixedVouchersEffectTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DiscountFixedVouchersEffectTypes.fromValue(value);
    }
  }
}

