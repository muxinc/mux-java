/*
 * Mux API
 * Mux is how developers build online video. This API encompasses both Mux Video and Mux Data functionality to help you build your video-related projects better and faster than ever before.
 *
 * The version of the OpenAPI document: v1
 * Contact: devex@mux.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mux.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of the broadcast. You can start and stop broadcasts with the &#x60;start&#x60; and &#x60;stop&#x60; APIs.
 */
@JsonAdapter(BroadcastStatus.Adapter.class)
public enum BroadcastStatus {
  
  IDLE("idle"),
  
  ACTIVE("active");

  private String value;

  BroadcastStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BroadcastStatus fromValue(String value) {
    for (BroadcastStatus b : BroadcastStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BroadcastStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BroadcastStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BroadcastStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BroadcastStatus.fromValue(value);
    }
  }
}

