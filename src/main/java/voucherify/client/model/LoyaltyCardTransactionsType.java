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
 * Gets or Sets LoyaltyCardTransactionsType
 */
@JsonAdapter(LoyaltyCardTransactionsType.Adapter.class)
public enum LoyaltyCardTransactionsType {
  
  ACCRUAL("POINTS_ACCRUAL"),
  
  CANCELLATION("POINTS_CANCELLATION"),
  
  REDEMPTION("POINTS_REDEMPTION"),
  
  REFUND("POINTS_REFUND"),
  
  ADDITION("POINTS_ADDITION"),
  
  REMOVAL("POINTS_REMOVAL"),
  
  EXPIRATION("POINTS_EXPIRATION"),
  
  TRANSFER_IN("POINTS_TRANSFER_IN"),
  
  TRANSFER_OUT("POINTS_TRANSFER_OUT");

  private String value;

  LoyaltyCardTransactionsType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LoyaltyCardTransactionsType fromValue(String value) {
    for (LoyaltyCardTransactionsType b : LoyaltyCardTransactionsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LoyaltyCardTransactionsType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LoyaltyCardTransactionsType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LoyaltyCardTransactionsType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LoyaltyCardTransactionsType.fromValue(value);
    }
  }
}

