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
import com.mux.sdk.models.CreateAssetRequest;
import com.mux.sdk.models.LiveStreamEmbeddedSubtitleSettings;
import com.mux.sdk.models.LiveStreamStatus;
import com.mux.sdk.models.PlaybackID;
import com.mux.sdk.models.SimulcastTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LiveStream
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T16:49:42.215909-04:00[America/New_York]")
public class LiveStream {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_STREAM_KEY = "stream_key";
  @SerializedName(SERIALIZED_NAME_STREAM_KEY)
  private String streamKey;

  public static final String SERIALIZED_NAME_ACTIVE_ASSET_ID = "active_asset_id";
  @SerializedName(SERIALIZED_NAME_ACTIVE_ASSET_ID)
  private String activeAssetId;

  public static final String SERIALIZED_NAME_RECENT_ASSET_IDS = "recent_asset_ids";
  @SerializedName(SERIALIZED_NAME_RECENT_ASSET_IDS)
  private java.util.List<String> recentAssetIds = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private LiveStreamStatus status;

  public static final String SERIALIZED_NAME_PLAYBACK_IDS = "playback_ids";
  @SerializedName(SERIALIZED_NAME_PLAYBACK_IDS)
  private java.util.List<PlaybackID> playbackIds = null;

  public static final String SERIALIZED_NAME_NEW_ASSET_SETTINGS = "new_asset_settings";
  @SerializedName(SERIALIZED_NAME_NEW_ASSET_SETTINGS)
  private CreateAssetRequest newAssetSettings;

  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;

  public static final String SERIALIZED_NAME_AUDIO_ONLY = "audio_only";
  @SerializedName(SERIALIZED_NAME_AUDIO_ONLY)
  private Boolean audioOnly;

  public static final String SERIALIZED_NAME_EMBEDDED_SUBTITLES = "embedded_subtitles";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_SUBTITLES)
  private java.util.List<LiveStreamEmbeddedSubtitleSettings> embeddedSubtitles = null;

  public static final String SERIALIZED_NAME_RECONNECT_WINDOW = "reconnect_window";
  @SerializedName(SERIALIZED_NAME_RECONNECT_WINDOW)
  private Float reconnectWindow = 60f;

  public static final String SERIALIZED_NAME_REDUCED_LATENCY = "reduced_latency";
  @SerializedName(SERIALIZED_NAME_REDUCED_LATENCY)
  private Boolean reducedLatency;

  public static final String SERIALIZED_NAME_LOW_LATENCY = "low_latency";
  @SerializedName(SERIALIZED_NAME_LOW_LATENCY)
  private Boolean lowLatency;

  public static final String SERIALIZED_NAME_SIMULCAST_TARGETS = "simulcast_targets";
  @SerializedName(SERIALIZED_NAME_SIMULCAST_TARGETS)
  private java.util.List<SimulcastTarget> simulcastTargets = null;

  /**
   * Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this as an alternative to setting low latency or reduced latency flags. The Low Latency value is a beta feature. Note: Reconnect windows are incompatible with Reduced Latency and Low Latency and will always be set to zero (0) seconds. Read more here: https://mux.com/blog/introducing-low-latency-live-streaming/
   */
  @JsonAdapter(LatencyModeEnum.Adapter.class)
  public enum LatencyModeEnum {
    LOW("low"),
    
    REDUCED("reduced"),
    
    STANDARD("standard");

    private String value;

    LatencyModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LatencyModeEnum fromValue(String value) {
      for (LatencyModeEnum b : LatencyModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LatencyModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LatencyModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LatencyModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LatencyModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LATENCY_MODE = "latency_mode";
  @SerializedName(SERIALIZED_NAME_LATENCY_MODE)
  private LatencyModeEnum latencyMode;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private Boolean test;

  public static final String SERIALIZED_NAME_MAX_CONTINUOUS_DURATION = "max_continuous_duration";
  @SerializedName(SERIALIZED_NAME_MAX_CONTINUOUS_DURATION)
  private Integer maxContinuousDuration = 43200;


  public LiveStream id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Live Stream. Max 255 characters.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the Live Stream. Max 255 characters.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LiveStream createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time the Live Stream was created, defined as a Unix timestamp (seconds since epoch).
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the Live Stream was created, defined as a Unix timestamp (seconds since epoch).")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public LiveStream streamKey(String streamKey) {
    
    this.streamKey = streamKey;
    return this;
  }

   /**
   * Unique key used for streaming to a Mux RTMP endpoint. This should be considered as sensitive as credentials, anyone with this stream key can begin streaming.
   * @return streamKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique key used for streaming to a Mux RTMP endpoint. This should be considered as sensitive as credentials, anyone with this stream key can begin streaming.")

  public String getStreamKey() {
    return streamKey;
  }


  public void setStreamKey(String streamKey) {
    this.streamKey = streamKey;
  }


  public LiveStream activeAssetId(String activeAssetId) {
    
    this.activeAssetId = activeAssetId;
    return this;
  }

   /**
   * The Asset that is currently being created if there is an active broadcast.
   * @return activeAssetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Asset that is currently being created if there is an active broadcast.")

  public String getActiveAssetId() {
    return activeAssetId;
  }


  public void setActiveAssetId(String activeAssetId) {
    this.activeAssetId = activeAssetId;
  }


  public LiveStream recentAssetIds(java.util.List<String> recentAssetIds) {
    
    this.recentAssetIds = recentAssetIds;
    return this;
  }

  public LiveStream addRecentAssetIdsItem(String recentAssetIdsItem) {
    if (this.recentAssetIds == null) {
      this.recentAssetIds = new java.util.ArrayList<>();
    }
    this.recentAssetIds.add(recentAssetIdsItem);
    return this;
  }

   /**
   * An array of strings with the most recent Assets that were created from this live stream.
   * @return recentAssetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of strings with the most recent Assets that were created from this live stream.")

  public java.util.List<String> getRecentAssetIds() {
    return recentAssetIds;
  }


  public void setRecentAssetIds(java.util.List<String> recentAssetIds) {
    this.recentAssetIds = recentAssetIds;
  }


  public LiveStream status(LiveStreamStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LiveStreamStatus getStatus() {
    return status;
  }


  public void setStatus(LiveStreamStatus status) {
    this.status = status;
  }


  public LiveStream playbackIds(java.util.List<PlaybackID> playbackIds) {
    
    this.playbackIds = playbackIds;
    return this;
  }

  public LiveStream addPlaybackIdsItem(PlaybackID playbackIdsItem) {
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


  public LiveStream newAssetSettings(CreateAssetRequest newAssetSettings) {
    
    this.newAssetSettings = newAssetSettings;
    return this;
  }

   /**
   * Get newAssetSettings
   * @return newAssetSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateAssetRequest getNewAssetSettings() {
    return newAssetSettings;
  }


  public void setNewAssetSettings(CreateAssetRequest newAssetSettings) {
    this.newAssetSettings = newAssetSettings;
  }


  public LiveStream passthrough(String passthrough) {
    
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


  public LiveStream audioOnly(Boolean audioOnly) {
    
    this.audioOnly = audioOnly;
    return this;
  }

   /**
   * The live stream only processes the audio track if the value is set to true. Mux drops the video track if broadcasted.
   * @return audioOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The live stream only processes the audio track if the value is set to true. Mux drops the video track if broadcasted.")

  public Boolean getAudioOnly() {
    return audioOnly;
  }


  public void setAudioOnly(Boolean audioOnly) {
    this.audioOnly = audioOnly;
  }


  public LiveStream embeddedSubtitles(java.util.List<LiveStreamEmbeddedSubtitleSettings> embeddedSubtitles) {
    
    this.embeddedSubtitles = embeddedSubtitles;
    return this;
  }

  public LiveStream addEmbeddedSubtitlesItem(LiveStreamEmbeddedSubtitleSettings embeddedSubtitlesItem) {
    if (this.embeddedSubtitles == null) {
      this.embeddedSubtitles = new java.util.ArrayList<>();
    }
    this.embeddedSubtitles.add(embeddedSubtitlesItem);
    return this;
  }

   /**
   * Describes the embedded closed caption configuration of the incoming live stream.
   * @return embeddedSubtitles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes the embedded closed caption configuration of the incoming live stream.")

  public java.util.List<LiveStreamEmbeddedSubtitleSettings> getEmbeddedSubtitles() {
    return embeddedSubtitles;
  }


  public void setEmbeddedSubtitles(java.util.List<LiveStreamEmbeddedSubtitleSettings> embeddedSubtitles) {
    this.embeddedSubtitles = embeddedSubtitles;
  }


  public LiveStream reconnectWindow(Float reconnectWindow) {
    
    this.reconnectWindow = reconnectWindow;
    return this;
  }

   /**
   * When live streaming software disconnects from Mux, either intentionally or due to a drop in the network, the Reconnect Window is the time in seconds that Mux should wait for the streaming software to reconnect before considering the live stream finished and completing the recorded asset. **Min**: 0.1s. **Max**: 300s (5 minutes).
   * @return reconnectWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When live streaming software disconnects from Mux, either intentionally or due to a drop in the network, the Reconnect Window is the time in seconds that Mux should wait for the streaming software to reconnect before considering the live stream finished and completing the recorded asset. **Min**: 0.1s. **Max**: 300s (5 minutes).")

  public Float getReconnectWindow() {
    return reconnectWindow;
  }


  public void setReconnectWindow(Float reconnectWindow) {
    this.reconnectWindow = reconnectWindow;
  }


  public LiveStream reducedLatency(Boolean reducedLatency) {
    
    this.reducedLatency = reducedLatency;
    return this;
  }

   /**
   * This field is deprecated. Please use latency_mode instead. Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this if you want lower latency for your live stream. **Note**: Reconnect windows are incompatible with Reduced Latency and will always be set to zero (0) seconds. See the [Reduce live stream latency guide](https://docs.mux.com/guides/video/reduce-live-stream-latency) to understand the tradeoffs.
   * @return reducedLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is deprecated. Please use latency_mode instead. Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this if you want lower latency for your live stream. **Note**: Reconnect windows are incompatible with Reduced Latency and will always be set to zero (0) seconds. See the [Reduce live stream latency guide](https://docs.mux.com/guides/video/reduce-live-stream-latency) to understand the tradeoffs.")

  public Boolean getReducedLatency() {
    return reducedLatency;
  }


  public void setReducedLatency(Boolean reducedLatency) {
    this.reducedLatency = reducedLatency;
  }


  public LiveStream lowLatency(Boolean lowLatency) {
    
    this.lowLatency = lowLatency;
    return this;
  }

   /**
   * This field is deprecated. Please use latency_mode instead. Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Setting this option will enable compatibility with the LL-HLS specification for low-latency streaming. This typically has lower latency than Reduced Latency streams, and cannot be combined with Reduced Latency. Note: Reconnect windows are incompatible with Low Latency and will always be set to zero (0) seconds.
   * @return lowLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is deprecated. Please use latency_mode instead. Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Setting this option will enable compatibility with the LL-HLS specification for low-latency streaming. This typically has lower latency than Reduced Latency streams, and cannot be combined with Reduced Latency. Note: Reconnect windows are incompatible with Low Latency and will always be set to zero (0) seconds.")

  public Boolean getLowLatency() {
    return lowLatency;
  }


  public void setLowLatency(Boolean lowLatency) {
    this.lowLatency = lowLatency;
  }


  public LiveStream simulcastTargets(java.util.List<SimulcastTarget> simulcastTargets) {
    
    this.simulcastTargets = simulcastTargets;
    return this;
  }

  public LiveStream addSimulcastTargetsItem(SimulcastTarget simulcastTargetsItem) {
    if (this.simulcastTargets == null) {
      this.simulcastTargets = new java.util.ArrayList<>();
    }
    this.simulcastTargets.add(simulcastTargetsItem);
    return this;
  }

   /**
   * Each Simulcast Target contains configuration details to broadcast (or \&quot;restream\&quot;) a live stream to a third-party streaming service. [See the Stream live to 3rd party platforms guide](https://docs.mux.com/guides/video/stream-live-to-3rd-party-platforms).
   * @return simulcastTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Each Simulcast Target contains configuration details to broadcast (or \"restream\") a live stream to a third-party streaming service. [See the Stream live to 3rd party platforms guide](https://docs.mux.com/guides/video/stream-live-to-3rd-party-platforms).")

  public java.util.List<SimulcastTarget> getSimulcastTargets() {
    return simulcastTargets;
  }


  public void setSimulcastTargets(java.util.List<SimulcastTarget> simulcastTargets) {
    this.simulcastTargets = simulcastTargets;
  }


  public LiveStream latencyMode(LatencyModeEnum latencyMode) {
    
    this.latencyMode = latencyMode;
    return this;
  }

   /**
   * Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this as an alternative to setting low latency or reduced latency flags. The Low Latency value is a beta feature. Note: Reconnect windows are incompatible with Reduced Latency and Low Latency and will always be set to zero (0) seconds. Read more here: https://mux.com/blog/introducing-low-latency-live-streaming/
   * @return latencyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this as an alternative to setting low latency or reduced latency flags. The Low Latency value is a beta feature. Note: Reconnect windows are incompatible with Reduced Latency and Low Latency and will always be set to zero (0) seconds. Read more here: https://mux.com/blog/introducing-low-latency-live-streaming/")

  public LatencyModeEnum getLatencyMode() {
    return latencyMode;
  }


  public void setLatencyMode(LatencyModeEnum latencyMode) {
    this.latencyMode = latencyMode;
  }


  public LiveStream test(Boolean test) {
    
    this.test = test;
    return this;
  }

   /**
   * True means this live stream is a test live stream. Test live streams can be used to help evaluate the Mux Video APIs for free. There is no limit on the number of test live streams, but they are watermarked with the Mux logo, and limited to 5 minutes. The test live stream is disabled after the stream is active for 5 mins and the recorded asset also deleted after 24 hours.
   * @return test
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True means this live stream is a test live stream. Test live streams can be used to help evaluate the Mux Video APIs for free. There is no limit on the number of test live streams, but they are watermarked with the Mux logo, and limited to 5 minutes. The test live stream is disabled after the stream is active for 5 mins and the recorded asset also deleted after 24 hours.")

  public Boolean getTest() {
    return test;
  }


  public void setTest(Boolean test) {
    this.test = test;
  }


  public LiveStream maxContinuousDuration(Integer maxContinuousDuration) {
    
    this.maxContinuousDuration = maxContinuousDuration;
    return this;
  }

   /**
   * The time in seconds a live stream may be continuously active before being disconnected. Defaults to 12 hours.
   * minimum: 60
   * maximum: 43200
   * @return maxContinuousDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time in seconds a live stream may be continuously active before being disconnected. Defaults to 12 hours.")

  public Integer getMaxContinuousDuration() {
    return maxContinuousDuration;
  }


  public void setMaxContinuousDuration(Integer maxContinuousDuration) {
    this.maxContinuousDuration = maxContinuousDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStream liveStream = (LiveStream) o;
    return Objects.equals(this.id, liveStream.id) &&
        Objects.equals(this.createdAt, liveStream.createdAt) &&
        Objects.equals(this.streamKey, liveStream.streamKey) &&
        Objects.equals(this.activeAssetId, liveStream.activeAssetId) &&
        Objects.equals(this.recentAssetIds, liveStream.recentAssetIds) &&
        Objects.equals(this.status, liveStream.status) &&
        Objects.equals(this.playbackIds, liveStream.playbackIds) &&
        Objects.equals(this.newAssetSettings, liveStream.newAssetSettings) &&
        Objects.equals(this.passthrough, liveStream.passthrough) &&
        Objects.equals(this.audioOnly, liveStream.audioOnly) &&
        Objects.equals(this.embeddedSubtitles, liveStream.embeddedSubtitles) &&
        Objects.equals(this.reconnectWindow, liveStream.reconnectWindow) &&
        Objects.equals(this.reducedLatency, liveStream.reducedLatency) &&
        Objects.equals(this.lowLatency, liveStream.lowLatency) &&
        Objects.equals(this.simulcastTargets, liveStream.simulcastTargets) &&
        Objects.equals(this.latencyMode, liveStream.latencyMode) &&
        Objects.equals(this.test, liveStream.test) &&
        Objects.equals(this.maxContinuousDuration, liveStream.maxContinuousDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, streamKey, activeAssetId, recentAssetIds, status, playbackIds, newAssetSettings, passthrough, audioOnly, embeddedSubtitles, reconnectWindow, reducedLatency, lowLatency, simulcastTargets, latencyMode, test, maxContinuousDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStream {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    activeAssetId: ").append(toIndentedString(activeAssetId)).append("\n");
    sb.append("    recentAssetIds: ").append(toIndentedString(recentAssetIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    playbackIds: ").append(toIndentedString(playbackIds)).append("\n");
    sb.append("    newAssetSettings: ").append(toIndentedString(newAssetSettings)).append("\n");
    sb.append("    passthrough: ").append(toIndentedString(passthrough)).append("\n");
    sb.append("    audioOnly: ").append(toIndentedString(audioOnly)).append("\n");
    sb.append("    embeddedSubtitles: ").append(toIndentedString(embeddedSubtitles)).append("\n");
    sb.append("    reconnectWindow: ").append(toIndentedString(reconnectWindow)).append("\n");
    sb.append("    reducedLatency: ").append(toIndentedString(reducedLatency)).append("\n");
    sb.append("    lowLatency: ").append(toIndentedString(lowLatency)).append("\n");
    sb.append("    simulcastTargets: ").append(toIndentedString(simulcastTargets)).append("\n");
    sb.append("    latencyMode: ").append(toIndentedString(latencyMode)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    maxContinuousDuration: ").append(toIndentedString(maxContinuousDuration)).append("\n");
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

