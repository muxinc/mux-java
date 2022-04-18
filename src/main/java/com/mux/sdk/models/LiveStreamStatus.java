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
 * &#x60;idle&#x60; indicates that there is no active broadcast. &#x60;active&#x60; indicates that there is an active broadcast and &#x60;disabled&#x60; status indicates that no future RTMP streams can be published.
 */
@JsonAdapter(LiveStreamStatus.Adapter.class)
public enum LiveStreamStatus {
  
  ACTIVE("active"),
  
  IDLE("idle"),
  
  DISABLED("disabled");

  private String value;

  LiveStreamStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LiveStreamStatus fromValue(String value) {
    for (LiveStreamStatus b : LiveStreamStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LiveStreamStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final LiveStreamStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LiveStreamStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LiveStreamStatus.fromValue(value);
    }
  }
}
