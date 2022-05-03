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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mux.sdk.models.InputTrack;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InputFile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InputFile {
  public static final String SERIALIZED_NAME_CONTAINER_FORMAT = "container_format";
  @SerializedName(SERIALIZED_NAME_CONTAINER_FORMAT)
  private String containerFormat;

  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @SerializedName(SERIALIZED_NAME_TRACKS)
  private java.util.List<InputTrack> tracks = null;


  public InputFile containerFormat(String containerFormat) {
    
    this.containerFormat = containerFormat;
    return this;
  }

   /**
   * Get containerFormat
   * @return containerFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContainerFormat() {
    return containerFormat;
  }


  public void setContainerFormat(String containerFormat) {
    this.containerFormat = containerFormat;
  }


  public InputFile tracks(java.util.List<InputTrack> tracks) {
    
    this.tracks = tracks;
    return this;
  }

  public InputFile addTracksItem(InputTrack tracksItem) {
    if (this.tracks == null) {
      this.tracks = new java.util.ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * Get tracks
   * @return tracks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<InputTrack> getTracks() {
    return tracks;
  }


  public void setTracks(java.util.List<InputTrack> tracks) {
    this.tracks = tracks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputFile inputFile = (InputFile) o;
    return Objects.equals(this.containerFormat, inputFile.containerFormat) &&
        Objects.equals(this.tracks, inputFile.tracks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerFormat, tracks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputFile {\n");
    sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

