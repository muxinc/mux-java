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
import com.mux.sdk.models.AssetMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Updates the new asset settings to use to generate a new asset for this live stream. Only the &#x60;mp4_support&#x60;, &#x60;master_access&#x60;, and &#x60;video_quality&#x60; settings may be updated. 
 */
@ApiModel(description = "Updates the new asset settings to use to generate a new asset for this live stream. Only the `mp4_support`, `master_access`, and `video_quality` settings may be updated. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateLiveStreamNewAssetSettings {
  /**
   * Deprecated. See the [Static Renditions API](https://www.mux.com/docs/guides/enable-static-mp4-renditions#during-live-stream-creation) for the updated API. Specify what level of support for mp4 playback should be added to new assets generated from this live stream. * The &#x60;none&#x60; option disables MP4 support for new assets. MP4 files will not be produced for an asset generated from this live stream. * The &#x60;capped-1080p&#x60; option produces a single MP4 file, called &#x60;capped-1080p.mp4&#x60;, with the video resolution capped at 1080p. This option produces an &#x60;audio.m4a&#x60; file for an audio-only asset. * The &#x60;audio-only&#x60; option produces a single M4A file, called &#x60;audio.m4a&#x60; for a video or an audio-only asset. MP4 generation will error when this option is specified for a video-only asset. * The &#x60;audio-only,capped-1080p&#x60; option produces both the &#x60;audio.m4a&#x60; and &#x60;capped-1080p.mp4&#x60; files. Only the &#x60;capped-1080p.mp4&#x60; file is produced for a video-only asset, while only the &#x60;audio.m4a&#x60; file is produced for an audio-only asset. * The &#x60;standard&#x60;(deprecated) option produces up to three MP4 files with different levels of resolution (&#x60;high.mp4&#x60;, &#x60;medium.mp4&#x60;, &#x60;low.mp4&#x60;, or &#x60;audio.m4a&#x60; for an audio-only asset). 
   */
  @JsonAdapter(Mp4SupportEnum.Adapter.class)
  public enum Mp4SupportEnum {
    NONE("none"),
    
    STANDARD("standard"),
    
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

  /**
   * Add or remove access to the master version of the video.
   */
  @JsonAdapter(MasterAccessEnum.Adapter.class)
  public enum MasterAccessEnum {
    TEMPORARY("temporary"),
    
    NONE("none");

    private String value;

    MasterAccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MasterAccessEnum fromValue(String value) {
      for (MasterAccessEnum b : MasterAccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MasterAccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MasterAccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MasterAccessEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MasterAccessEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MASTER_ACCESS = "master_access";
  @SerializedName(SERIALIZED_NAME_MASTER_ACCESS)
  private MasterAccessEnum masterAccess;

  /**
   * The video quality controls the cost, quality, and available platform features for the asset. [See the video quality guide for more details.](https://docs.mux.com/guides/use-video-quality-levels)
   */
  @JsonAdapter(VideoQualityEnum.Adapter.class)
  public enum VideoQualityEnum {
    PLUS("plus"),
    
    PREMIUM("premium");

    private String value;

    VideoQualityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VideoQualityEnum fromValue(String value) {
      for (VideoQualityEnum b : VideoQualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VideoQualityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VideoQualityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VideoQualityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VideoQualityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VIDEO_QUALITY = "video_quality";
  @SerializedName(SERIALIZED_NAME_VIDEO_QUALITY)
  private VideoQualityEnum videoQuality;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private AssetMetadata meta;


  public UpdateLiveStreamNewAssetSettings mp4Support(Mp4SupportEnum mp4Support) {
    
    this.mp4Support = mp4Support;
    return this;
  }

   /**
   * Deprecated. See the [Static Renditions API](https://www.mux.com/docs/guides/enable-static-mp4-renditions#during-live-stream-creation) for the updated API. Specify what level of support for mp4 playback should be added to new assets generated from this live stream. * The &#x60;none&#x60; option disables MP4 support for new assets. MP4 files will not be produced for an asset generated from this live stream. * The &#x60;capped-1080p&#x60; option produces a single MP4 file, called &#x60;capped-1080p.mp4&#x60;, with the video resolution capped at 1080p. This option produces an &#x60;audio.m4a&#x60; file for an audio-only asset. * The &#x60;audio-only&#x60; option produces a single M4A file, called &#x60;audio.m4a&#x60; for a video or an audio-only asset. MP4 generation will error when this option is specified for a video-only asset. * The &#x60;audio-only,capped-1080p&#x60; option produces both the &#x60;audio.m4a&#x60; and &#x60;capped-1080p.mp4&#x60; files. Only the &#x60;capped-1080p.mp4&#x60; file is produced for a video-only asset, while only the &#x60;audio.m4a&#x60; file is produced for an audio-only asset. * The &#x60;standard&#x60;(deprecated) option produces up to three MP4 files with different levels of resolution (&#x60;high.mp4&#x60;, &#x60;medium.mp4&#x60;, &#x60;low.mp4&#x60;, or &#x60;audio.m4a&#x60; for an audio-only asset). 
   * @return mp4Support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated. See the [Static Renditions API](https://www.mux.com/docs/guides/enable-static-mp4-renditions#during-live-stream-creation) for the updated API. Specify what level of support for mp4 playback should be added to new assets generated from this live stream. * The `none` option disables MP4 support for new assets. MP4 files will not be produced for an asset generated from this live stream. * The `capped-1080p` option produces a single MP4 file, called `capped-1080p.mp4`, with the video resolution capped at 1080p. This option produces an `audio.m4a` file for an audio-only asset. * The `audio-only` option produces a single M4A file, called `audio.m4a` for a video or an audio-only asset. MP4 generation will error when this option is specified for a video-only asset. * The `audio-only,capped-1080p` option produces both the `audio.m4a` and `capped-1080p.mp4` files. Only the `capped-1080p.mp4` file is produced for a video-only asset, while only the `audio.m4a` file is produced for an audio-only asset. * The `standard`(deprecated) option produces up to three MP4 files with different levels of resolution (`high.mp4`, `medium.mp4`, `low.mp4`, or `audio.m4a` for an audio-only asset). ")

  public Mp4SupportEnum getMp4Support() {
    return mp4Support;
  }


  public void setMp4Support(Mp4SupportEnum mp4Support) {
    this.mp4Support = mp4Support;
  }


  public UpdateLiveStreamNewAssetSettings masterAccess(MasterAccessEnum masterAccess) {
    
    this.masterAccess = masterAccess;
    return this;
  }

   /**
   * Add or remove access to the master version of the video.
   * @return masterAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add or remove access to the master version of the video.")

  public MasterAccessEnum getMasterAccess() {
    return masterAccess;
  }


  public void setMasterAccess(MasterAccessEnum masterAccess) {
    this.masterAccess = masterAccess;
  }


  public UpdateLiveStreamNewAssetSettings videoQuality(VideoQualityEnum videoQuality) {
    
    this.videoQuality = videoQuality;
    return this;
  }

   /**
   * The video quality controls the cost, quality, and available platform features for the asset. [See the video quality guide for more details.](https://docs.mux.com/guides/use-video-quality-levels)
   * @return videoQuality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The video quality controls the cost, quality, and available platform features for the asset. [See the video quality guide for more details.](https://docs.mux.com/guides/use-video-quality-levels)")

  public VideoQualityEnum getVideoQuality() {
    return videoQuality;
  }


  public void setVideoQuality(VideoQualityEnum videoQuality) {
    this.videoQuality = videoQuality;
  }


  public UpdateLiveStreamNewAssetSettings meta(AssetMetadata meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetMetadata getMeta() {
    return meta;
  }


  public void setMeta(AssetMetadata meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLiveStreamNewAssetSettings updateLiveStreamNewAssetSettings = (UpdateLiveStreamNewAssetSettings) o;
    return Objects.equals(this.mp4Support, updateLiveStreamNewAssetSettings.mp4Support) &&
        Objects.equals(this.masterAccess, updateLiveStreamNewAssetSettings.masterAccess) &&
        Objects.equals(this.videoQuality, updateLiveStreamNewAssetSettings.videoQuality) &&
        Objects.equals(this.meta, updateLiveStreamNewAssetSettings.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mp4Support, masterAccess, videoQuality, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLiveStreamNewAssetSettings {\n");
    sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
    sb.append("    masterAccess: ").append(toIndentedString(masterAccess)).append("\n");
    sb.append("    videoQuality: ").append(toIndentedString(videoQuality)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

