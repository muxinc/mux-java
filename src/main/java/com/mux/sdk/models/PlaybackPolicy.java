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
 * * &#x60;public&#x60; playback IDs are accessible by constructing an HLS URL like &#x60;https://stream.mux.com/${PLAYBACK_ID}&#x60;  * &#x60;signed&#x60; playback IDS should be used with tokens &#x60;https://stream.mux.com/${PLAYBACK_ID}?token&#x3D;{TOKEN}&#x60;. See [Secure video playback](https://docs.mux.com/guides/video/secure-video-playback) for details about creating tokens. 
 */
@JsonAdapter(PlaybackPolicy.Adapter.class)
public enum PlaybackPolicy {
  
  PUBLIC("public"),
  
  SIGNED("signed");

  private String value;

  PlaybackPolicy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlaybackPolicy fromValue(String value) {
    for (PlaybackPolicy b : PlaybackPolicy.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PlaybackPolicy> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlaybackPolicy enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlaybackPolicy read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlaybackPolicy.fromValue(value);
    }
  }
}

