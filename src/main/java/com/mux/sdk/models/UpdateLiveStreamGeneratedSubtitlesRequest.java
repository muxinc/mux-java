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
import com.mux.sdk.models.LiveStreamGeneratedSubtitleSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateLiveStreamGeneratedSubtitlesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateLiveStreamGeneratedSubtitlesRequest {
  public static final String SERIALIZED_NAME_GENERATED_SUBTITLES = "generated_subtitles";
  @SerializedName(SERIALIZED_NAME_GENERATED_SUBTITLES)
  private java.util.List<LiveStreamGeneratedSubtitleSettings> generatedSubtitles = null;


  public UpdateLiveStreamGeneratedSubtitlesRequest generatedSubtitles(java.util.List<LiveStreamGeneratedSubtitleSettings> generatedSubtitles) {
    
    this.generatedSubtitles = generatedSubtitles;
    return this;
  }

  public UpdateLiveStreamGeneratedSubtitlesRequest addGeneratedSubtitlesItem(LiveStreamGeneratedSubtitleSettings generatedSubtitlesItem) {
    if (this.generatedSubtitles == null) {
      this.generatedSubtitles = new java.util.ArrayList<>();
    }
    this.generatedSubtitles.add(generatedSubtitlesItem);
    return this;
  }

   /**
   * Update automated speech recognition subtitle configuration for a live stream. At most one subtitle track is allowed.
   * @return generatedSubtitles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Update automated speech recognition subtitle configuration for a live stream. At most one subtitle track is allowed.")

  public java.util.List<LiveStreamGeneratedSubtitleSettings> getGeneratedSubtitles() {
    return generatedSubtitles;
  }


  public void setGeneratedSubtitles(java.util.List<LiveStreamGeneratedSubtitleSettings> generatedSubtitles) {
    this.generatedSubtitles = generatedSubtitles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLiveStreamGeneratedSubtitlesRequest updateLiveStreamGeneratedSubtitlesRequest = (UpdateLiveStreamGeneratedSubtitlesRequest) o;
    return Objects.equals(this.generatedSubtitles, updateLiveStreamGeneratedSubtitlesRequest.generatedSubtitles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generatedSubtitles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLiveStreamGeneratedSubtitlesRequest {\n");
    sb.append("    generatedSubtitles: ").append(toIndentedString(generatedSubtitles)).append("\n");
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

