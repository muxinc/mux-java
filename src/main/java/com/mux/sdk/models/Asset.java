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
import com.mux.sdk.models.AssetErrors;
import com.mux.sdk.models.AssetMaster;
import com.mux.sdk.models.AssetNonStandardInputReasons;
import com.mux.sdk.models.AssetRecordingTimes;
import com.mux.sdk.models.AssetStaticRenditions;
import com.mux.sdk.models.PlaybackID;
import com.mux.sdk.models.Track;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Asset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T16:49:42.215909-04:00[America/New_York]")
public class Asset {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  /**
   * The status of the asset.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PREPARING("preparing"),
    
    READY("ready"),
    
    ERRORED("errored");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration;

  /**
   * The maximum resolution that has been stored for the asset. The asset may be delivered at lower resolutions depending on the device and bandwidth, however it cannot be delivered at a higher value than is stored.
   */
  @JsonAdapter(MaxStoredResolutionEnum.Adapter.class)
  public enum MaxStoredResolutionEnum {
    AUDIO_ONLY("Audio only"),
    
    SD("SD"),
    
    HD("HD"),
    
    FHD("FHD"),
    
    UHD("UHD");

    private String value;

    MaxStoredResolutionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MaxStoredResolutionEnum fromValue(String value) {
      for (MaxStoredResolutionEnum b : MaxStoredResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MaxStoredResolutionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MaxStoredResolutionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MaxStoredResolutionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MaxStoredResolutionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MAX_STORED_RESOLUTION = "max_stored_resolution";
  @SerializedName(SERIALIZED_NAME_MAX_STORED_RESOLUTION)
  private MaxStoredResolutionEnum maxStoredResolution;

  public static final String SERIALIZED_NAME_MAX_STORED_FRAME_RATE = "max_stored_frame_rate";
  @SerializedName(SERIALIZED_NAME_MAX_STORED_FRAME_RATE)
  private Double maxStoredFrameRate;

  public static final String SERIALIZED_NAME_ASPECT_RATIO = "aspect_ratio";
  @SerializedName(SERIALIZED_NAME_ASPECT_RATIO)
  private String aspectRatio;

  public static final String SERIALIZED_NAME_PLAYBACK_IDS = "playback_ids";
  @SerializedName(SERIALIZED_NAME_PLAYBACK_IDS)
  private java.util.List<PlaybackID> playbackIds = null;

  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @SerializedName(SERIALIZED_NAME_TRACKS)
  private java.util.List<Track> tracks = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private AssetErrors errors;

  public static final String SERIALIZED_NAME_PER_TITLE_ENCODE = "per_title_encode";
  @SerializedName(SERIALIZED_NAME_PER_TITLE_ENCODE)
  private Boolean perTitleEncode;

  public static final String SERIALIZED_NAME_UPLOAD_ID = "upload_id";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  private String uploadId;

  public static final String SERIALIZED_NAME_IS_LIVE = "is_live";
  @SerializedName(SERIALIZED_NAME_IS_LIVE)
  private Boolean isLive;

  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;

  public static final String SERIALIZED_NAME_LIVE_STREAM_ID = "live_stream_id";
  @SerializedName(SERIALIZED_NAME_LIVE_STREAM_ID)
  private String liveStreamId;

  public static final String SERIALIZED_NAME_MASTER = "master";
  @SerializedName(SERIALIZED_NAME_MASTER)
  private AssetMaster master;

  /**
   * Gets or Sets masterAccess
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
  private MasterAccessEnum masterAccess = MasterAccessEnum.NONE;

  /**
   * Gets or Sets mp4Support
   */
  @JsonAdapter(Mp4SupportEnum.Adapter.class)
  public enum Mp4SupportEnum {
    STANDARD("standard"),
    
    NONE("none");

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
  private Mp4SupportEnum mp4Support = Mp4SupportEnum.NONE;

  public static final String SERIALIZED_NAME_SOURCE_ASSET_ID = "source_asset_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ASSET_ID)
  private String sourceAssetId;

  public static final String SERIALIZED_NAME_NORMALIZE_AUDIO = "normalize_audio";
  @SerializedName(SERIALIZED_NAME_NORMALIZE_AUDIO)
  private Boolean normalizeAudio = false;

  public static final String SERIALIZED_NAME_STATIC_RENDITIONS = "static_renditions";
  @SerializedName(SERIALIZED_NAME_STATIC_RENDITIONS)
  private AssetStaticRenditions staticRenditions;

  public static final String SERIALIZED_NAME_RECORDING_TIMES = "recording_times";
  @SerializedName(SERIALIZED_NAME_RECORDING_TIMES)
  private java.util.List<AssetRecordingTimes> recordingTimes = null;

  public static final String SERIALIZED_NAME_NON_STANDARD_INPUT_REASONS = "non_standard_input_reasons";
  @SerializedName(SERIALIZED_NAME_NON_STANDARD_INPUT_REASONS)
  private AssetNonStandardInputReasons nonStandardInputReasons;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private Boolean test;


  public Asset id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Asset. Max 255 characters.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the Asset. Max 255 characters.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Asset createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time the Asset was created, defined as a Unix timestamp (seconds since epoch).
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the Asset was created, defined as a Unix timestamp (seconds since epoch).")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Asset status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the asset.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the asset.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Asset duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * The duration of the asset in seconds (max duration for a single asset is 12 hours).
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duration of the asset in seconds (max duration for a single asset is 12 hours).")

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public Asset maxStoredResolution(MaxStoredResolutionEnum maxStoredResolution) {
    
    this.maxStoredResolution = maxStoredResolution;
    return this;
  }

   /**
   * The maximum resolution that has been stored for the asset. The asset may be delivered at lower resolutions depending on the device and bandwidth, however it cannot be delivered at a higher value than is stored.
   * @return maxStoredResolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum resolution that has been stored for the asset. The asset may be delivered at lower resolutions depending on the device and bandwidth, however it cannot be delivered at a higher value than is stored.")

  public MaxStoredResolutionEnum getMaxStoredResolution() {
    return maxStoredResolution;
  }


  public void setMaxStoredResolution(MaxStoredResolutionEnum maxStoredResolution) {
    this.maxStoredResolution = maxStoredResolution;
  }


  public Asset maxStoredFrameRate(Double maxStoredFrameRate) {
    
    this.maxStoredFrameRate = maxStoredFrameRate;
    return this;
  }

   /**
   * The maximum frame rate that has been stored for the asset. The asset may be delivered at lower frame rates depending on the device and bandwidth, however it cannot be delivered at a higher value than is stored. This field may return -1 if the frame rate of the input cannot be reliably determined.
   * @return maxStoredFrameRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum frame rate that has been stored for the asset. The asset may be delivered at lower frame rates depending on the device and bandwidth, however it cannot be delivered at a higher value than is stored. This field may return -1 if the frame rate of the input cannot be reliably determined.")

  public Double getMaxStoredFrameRate() {
    return maxStoredFrameRate;
  }


  public void setMaxStoredFrameRate(Double maxStoredFrameRate) {
    this.maxStoredFrameRate = maxStoredFrameRate;
  }


  public Asset aspectRatio(String aspectRatio) {
    
    this.aspectRatio = aspectRatio;
    return this;
  }

   /**
   * The aspect ratio of the asset in the form of &#x60;width:height&#x60;, for example &#x60;16:9&#x60;.
   * @return aspectRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The aspect ratio of the asset in the form of `width:height`, for example `16:9`.")

  public String getAspectRatio() {
    return aspectRatio;
  }


  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }


  public Asset playbackIds(java.util.List<PlaybackID> playbackIds) {
    
    this.playbackIds = playbackIds;
    return this;
  }

  public Asset addPlaybackIdsItem(PlaybackID playbackIdsItem) {
    if (this.playbackIds == null) {
      this.playbackIds = new java.util.ArrayList<>();
    }
    this.playbackIds.add(playbackIdsItem);
    return this;
  }

   /**
   * An array of Playback ID objects. Use these to create HLS playback URLs. See [Play your videos](https://docs.mux.com/guides/video/play-your-videos) for more details.
   * @return playbackIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of Playback ID objects. Use these to create HLS playback URLs. See [Play your videos](https://docs.mux.com/guides/video/play-your-videos) for more details.")

  public java.util.List<PlaybackID> getPlaybackIds() {
    return playbackIds;
  }


  public void setPlaybackIds(java.util.List<PlaybackID> playbackIds) {
    this.playbackIds = playbackIds;
  }


  public Asset tracks(java.util.List<Track> tracks) {
    
    this.tracks = tracks;
    return this;
  }

  public Asset addTracksItem(Track tracksItem) {
    if (this.tracks == null) {
      this.tracks = new java.util.ArrayList<>();
    }
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * The individual media tracks that make up an asset.
   * @return tracks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The individual media tracks that make up an asset.")

  public java.util.List<Track> getTracks() {
    return tracks;
  }


  public void setTracks(java.util.List<Track> tracks) {
    this.tracks = tracks;
  }


  public Asset errors(AssetErrors errors) {
    
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetErrors getErrors() {
    return errors;
  }


  public void setErrors(AssetErrors errors) {
    this.errors = errors;
  }


  public Asset perTitleEncode(Boolean perTitleEncode) {
    
    this.perTitleEncode = perTitleEncode;
    return this;
  }

   /**
   * Get perTitleEncode
   * @return perTitleEncode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPerTitleEncode() {
    return perTitleEncode;
  }


  public void setPerTitleEncode(Boolean perTitleEncode) {
    this.perTitleEncode = perTitleEncode;
  }


  public Asset uploadId(String uploadId) {
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Unique identifier for the Direct Upload. This is an optional parameter added when the asset is created from a direct upload.
   * @return uploadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the Direct Upload. This is an optional parameter added when the asset is created from a direct upload.")

  public String getUploadId() {
    return uploadId;
  }


  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }


  public Asset isLive(Boolean isLive) {
    
    this.isLive = isLive;
    return this;
  }

   /**
   * Whether the asset is created from a live stream and the live stream is currently &#x60;active&#x60; and not in &#x60;idle&#x60; state.
   * @return isLive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the asset is created from a live stream and the live stream is currently `active` and not in `idle` state.")

  public Boolean getIsLive() {
    return isLive;
  }


  public void setIsLive(Boolean isLive) {
    this.isLive = isLive;
  }


  public Asset passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * Arbitrary user-supplied metadata set for the asset. Max 255 characters.
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary user-supplied metadata set for the asset. Max 255 characters.")

  public String getPassthrough() {
    return passthrough;
  }


  public void setPassthrough(String passthrough) {
    this.passthrough = passthrough;
  }


  public Asset liveStreamId(String liveStreamId) {
    
    this.liveStreamId = liveStreamId;
    return this;
  }

   /**
   * Unique identifier for the live stream. This is an optional parameter added when the asset is created from a live stream.
   * @return liveStreamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the live stream. This is an optional parameter added when the asset is created from a live stream.")

  public String getLiveStreamId() {
    return liveStreamId;
  }


  public void setLiveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
  }


  public Asset master(AssetMaster master) {
    
    this.master = master;
    return this;
  }

   /**
   * Get master
   * @return master
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetMaster getMaster() {
    return master;
  }


  public void setMaster(AssetMaster master) {
    this.master = master;
  }


  public Asset masterAccess(MasterAccessEnum masterAccess) {
    
    this.masterAccess = masterAccess;
    return this;
  }

   /**
   * Get masterAccess
   * @return masterAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MasterAccessEnum getMasterAccess() {
    return masterAccess;
  }


  public void setMasterAccess(MasterAccessEnum masterAccess) {
    this.masterAccess = masterAccess;
  }


  public Asset mp4Support(Mp4SupportEnum mp4Support) {
    
    this.mp4Support = mp4Support;
    return this;
  }

   /**
   * Get mp4Support
   * @return mp4Support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Mp4SupportEnum getMp4Support() {
    return mp4Support;
  }


  public void setMp4Support(Mp4SupportEnum mp4Support) {
    this.mp4Support = mp4Support;
  }


  public Asset sourceAssetId(String sourceAssetId) {
    
    this.sourceAssetId = sourceAssetId;
    return this;
  }

   /**
   * Asset Identifier of the video used as the source for creating the clip.
   * @return sourceAssetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Asset Identifier of the video used as the source for creating the clip.")

  public String getSourceAssetId() {
    return sourceAssetId;
  }


  public void setSourceAssetId(String sourceAssetId) {
    this.sourceAssetId = sourceAssetId;
  }


  public Asset normalizeAudio(Boolean normalizeAudio) {
    
    this.normalizeAudio = normalizeAudio;
    return this;
  }

   /**
   * Normalize the audio track loudness level. This parameter is only applicable to on-demand (not live) assets.
   * @return normalizeAudio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Normalize the audio track loudness level. This parameter is only applicable to on-demand (not live) assets.")

  public Boolean getNormalizeAudio() {
    return normalizeAudio;
  }


  public void setNormalizeAudio(Boolean normalizeAudio) {
    this.normalizeAudio = normalizeAudio;
  }


  public Asset staticRenditions(AssetStaticRenditions staticRenditions) {
    
    this.staticRenditions = staticRenditions;
    return this;
  }

   /**
   * Get staticRenditions
   * @return staticRenditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetStaticRenditions getStaticRenditions() {
    return staticRenditions;
  }


  public void setStaticRenditions(AssetStaticRenditions staticRenditions) {
    this.staticRenditions = staticRenditions;
  }


  public Asset recordingTimes(java.util.List<AssetRecordingTimes> recordingTimes) {
    
    this.recordingTimes = recordingTimes;
    return this;
  }

  public Asset addRecordingTimesItem(AssetRecordingTimes recordingTimesItem) {
    if (this.recordingTimes == null) {
      this.recordingTimes = new java.util.ArrayList<>();
    }
    this.recordingTimes.add(recordingTimesItem);
    return this;
  }

   /**
   * An array of individual live stream recording sessions. A recording session is created on each encoder connection during the live stream
   * @return recordingTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of individual live stream recording sessions. A recording session is created on each encoder connection during the live stream")

  public java.util.List<AssetRecordingTimes> getRecordingTimes() {
    return recordingTimes;
  }


  public void setRecordingTimes(java.util.List<AssetRecordingTimes> recordingTimes) {
    this.recordingTimes = recordingTimes;
  }


  public Asset nonStandardInputReasons(AssetNonStandardInputReasons nonStandardInputReasons) {
    
    this.nonStandardInputReasons = nonStandardInputReasons;
    return this;
  }

   /**
   * Get nonStandardInputReasons
   * @return nonStandardInputReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetNonStandardInputReasons getNonStandardInputReasons() {
    return nonStandardInputReasons;
  }


  public void setNonStandardInputReasons(AssetNonStandardInputReasons nonStandardInputReasons) {
    this.nonStandardInputReasons = nonStandardInputReasons;
  }


  public Asset test(Boolean test) {
    
    this.test = test;
    return this;
  }

   /**
   * True means this live stream is a test asset. A test asset can help evaluate the Mux Video APIs without incurring any cost. There is no limit on number of test assets created. Test assets are watermarked with the Mux logo, limited to 10 seconds, and deleted after 24 hrs.
   * @return test
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True means this live stream is a test asset. A test asset can help evaluate the Mux Video APIs without incurring any cost. There is no limit on number of test assets created. Test assets are watermarked with the Mux logo, limited to 10 seconds, and deleted after 24 hrs.")

  public Boolean getTest() {
    return test;
  }


  public void setTest(Boolean test) {
    this.test = test;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset asset = (Asset) o;
    return Objects.equals(this.id, asset.id) &&
        Objects.equals(this.createdAt, asset.createdAt) &&
        Objects.equals(this.status, asset.status) &&
        Objects.equals(this.duration, asset.duration) &&
        Objects.equals(this.maxStoredResolution, asset.maxStoredResolution) &&
        Objects.equals(this.maxStoredFrameRate, asset.maxStoredFrameRate) &&
        Objects.equals(this.aspectRatio, asset.aspectRatio) &&
        Objects.equals(this.playbackIds, asset.playbackIds) &&
        Objects.equals(this.tracks, asset.tracks) &&
        Objects.equals(this.errors, asset.errors) &&
        Objects.equals(this.perTitleEncode, asset.perTitleEncode) &&
        Objects.equals(this.uploadId, asset.uploadId) &&
        Objects.equals(this.isLive, asset.isLive) &&
        Objects.equals(this.passthrough, asset.passthrough) &&
        Objects.equals(this.liveStreamId, asset.liveStreamId) &&
        Objects.equals(this.master, asset.master) &&
        Objects.equals(this.masterAccess, asset.masterAccess) &&
        Objects.equals(this.mp4Support, asset.mp4Support) &&
        Objects.equals(this.sourceAssetId, asset.sourceAssetId) &&
        Objects.equals(this.normalizeAudio, asset.normalizeAudio) &&
        Objects.equals(this.staticRenditions, asset.staticRenditions) &&
        Objects.equals(this.recordingTimes, asset.recordingTimes) &&
        Objects.equals(this.nonStandardInputReasons, asset.nonStandardInputReasons) &&
        Objects.equals(this.test, asset.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, status, duration, maxStoredResolution, maxStoredFrameRate, aspectRatio, playbackIds, tracks, errors, perTitleEncode, uploadId, isLive, passthrough, liveStreamId, master, masterAccess, mp4Support, sourceAssetId, normalizeAudio, staticRenditions, recordingTimes, nonStandardInputReasons, test);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    maxStoredResolution: ").append(toIndentedString(maxStoredResolution)).append("\n");
    sb.append("    maxStoredFrameRate: ").append(toIndentedString(maxStoredFrameRate)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    playbackIds: ").append(toIndentedString(playbackIds)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    perTitleEncode: ").append(toIndentedString(perTitleEncode)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    isLive: ").append(toIndentedString(isLive)).append("\n");
    sb.append("    passthrough: ").append(toIndentedString(passthrough)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
    sb.append("    masterAccess: ").append(toIndentedString(masterAccess)).append("\n");
    sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
    sb.append("    sourceAssetId: ").append(toIndentedString(sourceAssetId)).append("\n");
    sb.append("    normalizeAudio: ").append(toIndentedString(normalizeAudio)).append("\n");
    sb.append("    staticRenditions: ").append(toIndentedString(staticRenditions)).append("\n");
    sb.append("    recordingTimes: ").append(toIndentedString(recordingTimes)).append("\n");
    sb.append("    nonStandardInputReasons: ").append(toIndentedString(nonStandardInputReasons)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

