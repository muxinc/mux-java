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
 * Specify the network architecture of the space. In &#x60;server&#x60; spaces, all video travels through Mux&#39;s video infrastructure. Defaults to &#x60;server&#x60; if not set.
 */
@JsonAdapter(SpaceType.Adapter.class)
public enum SpaceType {
  
  SERVER("server");

  private String value;

  SpaceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SpaceType fromValue(String value) {
    for (SpaceType b : SpaceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SpaceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SpaceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SpaceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SpaceType.fromValue(value);
    }
  }
}

