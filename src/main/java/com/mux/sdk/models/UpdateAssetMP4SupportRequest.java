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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateAssetMP4SupportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateAssetMP4SupportRequest {
  /**
   * Specify what level of support for mp4 playback.  * The &#x60;capped-1080p&#x60; option produces a single MP4 file, called &#x60;capped-1080p.mp4&#x60;, with the video resolution capped at 1080p. This option produces an &#x60;audio.m4a&#x60; file for an audio-only asset. * The &#x60;audio-only&#x60; option produces a single M4A file, called &#x60;audio.m4a&#x60; for a video or an audio-only asset. MP4 generation will error when this option is specified for a video-only asset. * The &#x60;audio-only,capped-1080p&#x60; option produces both the &#x60;audio.m4a&#x60; and &#x60;capped-1080p.mp4&#x60; files. Only the &#x60;capped-1080p.mp4&#x60; file is produced for a video-only asset, while only the &#x60;audio.m4a&#x60; file is produced for an audio-only asset.  The &#x60;standard&#x60;(deprecated) option produces up to three MP4 files with different levels of resolution (&#x60;high.mp4&#x60;, &#x60;medium.mp4&#x60;, &#x60;low.mp4&#x60;, or &#x60;audio.m4a&#x60; for an audio-only asset).  &#x60;none&#x60; will delete the MP4s from the asset in question. 
   */
  @JsonAdapter(Mp4SupportEnum.Adapter.class)
  public enum Mp4SupportEnum {
    STANDARD("standard"),
    
    NONE("none"),
    
    CAPPED_1080P("capped-1080p"),
    
    AUDIO_ONLY("audio-only"),
    
    AUDIO_ONLY_CAPPED_1080P("audio-only,capped-1080p");

    private String value;

    Mp4SupportEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Mp4SupportEnum fromValue(String value) {
      for (Mp4SupportEnum b : Mp4SupportEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<Mp4SupportEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Mp4SupportEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Mp4SupportEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return Mp4SupportEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MP4_SUPPORT = "mp4_support";
  @SerializedName(SERIALIZED_NAME_MP4_SUPPORT)
  private Mp4SupportEnum mp4Support;


  public UpdateAssetMP4SupportRequest mp4Support(Mp4SupportEnum mp4Support) {
    
    this.mp4Support = mp4Support;
    return this;
  }

   /**
   * Specify what level of support for mp4 playback.  * The &#x60;capped-1080p&#x60; option produces a single MP4 file, called &#x60;capped-1080p.mp4&#x60;, with the video resolution capped at 1080p. This option produces an &#x60;audio.m4a&#x60; file for an audio-only asset. * The &#x60;audio-only&#x60; option produces a single M4A file, called &#x60;audio.m4a&#x60; for a video or an audio-only asset. MP4 generation will error when this option is specified for a video-only asset. * The &#x60;audio-only,capped-1080p&#x60; option produces both the &#x60;audio.m4a&#x60; and &#x60;capped-1080p.mp4&#x60; files. Only the &#x60;capped-1080p.mp4&#x60; file is produced for a video-only asset, while only the &#x60;audio.m4a&#x60; file is produced for an audio-only asset.  The &#x60;standard&#x60;(deprecated) option produces up to three MP4 files with different levels of resolution (&#x60;high.mp4&#x60;, &#x60;medium.mp4&#x60;, &#x60;low.mp4&#x60;, or &#x60;audio.m4a&#x60; for an audio-only asset).  &#x60;none&#x60; will delete the MP4s from the asset in question. 
   * @return mp4Support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify what level of support for mp4 playback.  * The `capped-1080p` option produces a single MP4 file, called `capped-1080p.mp4`, with the video resolution capped at 1080p. This option produces an `audio.m4a` file for an audio-only asset. * The `audio-only` option produces a single M4A file, called `audio.m4a` for a video or an audio-only asset. MP4 generation will error when this option is specified for a video-only asset. * The `audio-only,capped-1080p` option produces both the `audio.m4a` and `capped-1080p.mp4` files. Only the `capped-1080p.mp4` file is produced for a video-only asset, while only the `audio.m4a` file is produced for an audio-only asset.  The `standard`(deprecated) option produces up to three MP4 files with different levels of resolution (`high.mp4`, `medium.mp4`, `low.mp4`, or `audio.m4a` for an audio-only asset).  `none` will delete the MP4s from the asset in question. ")

  public Mp4SupportEnum getMp4Support() {
    return mp4Support;
  }


  public void setMp4Support(Mp4SupportEnum mp4Support) {
    this.mp4Support = mp4Support;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAssetMP4SupportRequest updateAssetMP4SupportRequest = (UpdateAssetMP4SupportRequest) o;
    return Objects.equals(this.mp4Support, updateAssetMP4SupportRequest.mp4Support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mp4Support);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetMP4SupportRequest {\n");
    sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
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

