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
import com.mux.sdk.models.CreateSimulcastTargetRequest;
import com.mux.sdk.models.LiveStreamEmbeddedSubtitleSettings;
import com.mux.sdk.models.LiveStreamGeneratedSubtitleSettings;
import com.mux.sdk.models.PlaybackPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateLiveStreamRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateLiveStreamRequest {
  public static final String SERIALIZED_NAME_PLAYBACK_POLICY = "playback_policy";
  @SerializedName(SERIALIZED_NAME_PLAYBACK_POLICY)
  private java.util.List<PlaybackPolicy> playbackPolicy = null;

  public static final String SERIALIZED_NAME_NEW_ASSET_SETTINGS = "new_asset_settings";
  @SerializedName(SERIALIZED_NAME_NEW_ASSET_SETTINGS)
  private CreateAssetRequest newAssetSettings;

  public static final String SERIALIZED_NAME_RECONNECT_WINDOW = "reconnect_window";
  @SerializedName(SERIALIZED_NAME_RECONNECT_WINDOW)
  private Float reconnectWindow;

  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;

  public static final String SERIALIZED_NAME_AUDIO_ONLY = "audio_only";
  @SerializedName(SERIALIZED_NAME_AUDIO_ONLY)
  private Boolean audioOnly;

  public static final String SERIALIZED_NAME_EMBEDDED_SUBTITLES = "embedded_subtitles";
  @SerializedName(SERIALIZED_NAME_EMBEDDED_SUBTITLES)
  private java.util.List<LiveStreamEmbeddedSubtitleSettings> embeddedSubtitles = null;

  public static final String SERIALIZED_NAME_GENERATED_SUBTITLES = "generated_subtitles";
  @SerializedName(SERIALIZED_NAME_GENERATED_SUBTITLES)
  private java.util.List<LiveStreamGeneratedSubtitleSettings> generatedSubtitles = null;

  public static final String SERIALIZED_NAME_REDUCED_LATENCY = "reduced_latency";
  @SerializedName(SERIALIZED_NAME_REDUCED_LATENCY)
  private Boolean reducedLatency;

  public static final String SERIALIZED_NAME_LOW_LATENCY = "low_latency";
  @SerializedName(SERIALIZED_NAME_LOW_LATENCY)
  private Boolean lowLatency;

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

  public static final String SERIALIZED_NAME_SIMULCAST_TARGETS = "simulcast_targets";
  @SerializedName(SERIALIZED_NAME_SIMULCAST_TARGETS)
  private java.util.List<CreateSimulcastTargetRequest> simulcastTargets = null;

  public static final String SERIALIZED_NAME_MAX_CONTINUOUS_DURATION = "max_continuous_duration";
  @SerializedName(SERIALIZED_NAME_MAX_CONTINUOUS_DURATION)
  private Integer maxContinuousDuration = 43200;


  public CreateLiveStreamRequest playbackPolicy(java.util.List<PlaybackPolicy> playbackPolicy) {
    
    this.playbackPolicy = playbackPolicy;
    return this;
  }

  public CreateLiveStreamRequest addPlaybackPolicyItem(PlaybackPolicy playbackPolicyItem) {
    if (this.playbackPolicy == null) {
      this.playbackPolicy = new java.util.ArrayList<>();
    }
    this.playbackPolicy.add(playbackPolicyItem);
    return this;
  }

   /**
   * Get playbackPolicy
   * @return playbackPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<PlaybackPolicy> getPlaybackPolicy() {
    return playbackPolicy;
  }


  public void setPlaybackPolicy(java.util.List<PlaybackPolicy> playbackPolicy) {
    this.playbackPolicy = playbackPolicy;
  }


  public CreateLiveStreamRequest newAssetSettings(CreateAssetRequest newAssetSettings) {
    
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


  public CreateLiveStreamRequest reconnectWindow(Float reconnectWindow) {
    
    this.reconnectWindow = reconnectWindow;
    return this;
  }

   /**
   * When live streaming software disconnects from Mux, either intentionally or due to a drop in the network, the Reconnect Window is the time in seconds that Mux should wait for the streaming software to reconnect before considering the live stream finished and completing the recorded asset. Defaults to 60 seconds on the API if not specified.
   * minimum: 0.1
   * maximum: 1800
   * @return reconnectWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When live streaming software disconnects from Mux, either intentionally or due to a drop in the network, the Reconnect Window is the time in seconds that Mux should wait for the streaming software to reconnect before considering the live stream finished and completing the recorded asset. Defaults to 60 seconds on the API if not specified.")

  public Float getReconnectWindow() {
    return reconnectWindow;
  }


  public void setReconnectWindow(Float reconnectWindow) {
    this.reconnectWindow = reconnectWindow;
  }


  public CreateLiveStreamRequest passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * Get passthrough
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassthrough() {
    return passthrough;
  }


  public void setPassthrough(String passthrough) {
    this.passthrough = passthrough;
  }


  public CreateLiveStreamRequest audioOnly(Boolean audioOnly) {
    
    this.audioOnly = audioOnly;
    return this;
  }

   /**
   * Force the live stream to only process the audio track when the value is set to true. Mux drops the video track if broadcasted.
   * @return audioOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Force the live stream to only process the audio track when the value is set to true. Mux drops the video track if broadcasted.")

  public Boolean getAudioOnly() {
    return audioOnly;
  }


  public void setAudioOnly(Boolean audioOnly) {
    this.audioOnly = audioOnly;
  }


  public CreateLiveStreamRequest embeddedSubtitles(java.util.List<LiveStreamEmbeddedSubtitleSettings> embeddedSubtitles) {
    
    this.embeddedSubtitles = embeddedSubtitles;
    return this;
  }

  public CreateLiveStreamRequest addEmbeddedSubtitlesItem(LiveStreamEmbeddedSubtitleSettings embeddedSubtitlesItem) {
    if (this.embeddedSubtitles == null) {
      this.embeddedSubtitles = new java.util.ArrayList<>();
    }
    this.embeddedSubtitles.add(embeddedSubtitlesItem);
    return this;
  }

   /**
   * Describe the embedded closed caption contents of the incoming live stream.
   * @return embeddedSubtitles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describe the embedded closed caption contents of the incoming live stream.")

  public java.util.List<LiveStreamEmbeddedSubtitleSettings> getEmbeddedSubtitles() {
    return embeddedSubtitles;
  }


  public void setEmbeddedSubtitles(java.util.List<LiveStreamEmbeddedSubtitleSettings> embeddedSubtitles) {
    this.embeddedSubtitles = embeddedSubtitles;
  }


  public CreateLiveStreamRequest generatedSubtitles(java.util.List<LiveStreamGeneratedSubtitleSettings> generatedSubtitles) {
    
    this.generatedSubtitles = generatedSubtitles;
    return this;
  }

  public CreateLiveStreamRequest addGeneratedSubtitlesItem(LiveStreamGeneratedSubtitleSettings generatedSubtitlesItem) {
    if (this.generatedSubtitles == null) {
      this.generatedSubtitles = new java.util.ArrayList<>();
    }
    this.generatedSubtitles.add(generatedSubtitlesItem);
    return this;
  }

   /**
   * Configure the incoming live stream to include subtitles created with automatic speech recognition. Each Asset created from a live stream with &#x60;generated_subtitles&#x60; configured will automatically receive two text tracks. The first of these will have a &#x60;text_source&#x60; value of &#x60;generated_live&#x60;, and will be available with &#x60;ready&#x60; status as soon as the stream is live. The second text track will have a &#x60;text_source&#x60; value of &#x60;generated_live_final&#x60; and will contain subtitles with improved accuracy, timing, and formatting. However, &#x60;generated_live_final&#x60; tracks will not be available in &#x60;ready&#x60; status until the live stream ends. If an Asset has both &#x60;generated_live&#x60; and &#x60;generated_live_final&#x60; tracks that are &#x60;ready&#x60;, then only the &#x60;generated_live_final&#x60; track will be included during playback.
   * @return generatedSubtitles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configure the incoming live stream to include subtitles created with automatic speech recognition. Each Asset created from a live stream with `generated_subtitles` configured will automatically receive two text tracks. The first of these will have a `text_source` value of `generated_live`, and will be available with `ready` status as soon as the stream is live. The second text track will have a `text_source` value of `generated_live_final` and will contain subtitles with improved accuracy, timing, and formatting. However, `generated_live_final` tracks will not be available in `ready` status until the live stream ends. If an Asset has both `generated_live` and `generated_live_final` tracks that are `ready`, then only the `generated_live_final` track will be included during playback.")

  public java.util.List<LiveStreamGeneratedSubtitleSettings> getGeneratedSubtitles() {
    return generatedSubtitles;
  }


  public void setGeneratedSubtitles(java.util.List<LiveStreamGeneratedSubtitleSettings> generatedSubtitles) {
    this.generatedSubtitles = generatedSubtitles;
  }


  public CreateLiveStreamRequest reducedLatency(Boolean reducedLatency) {
    
    this.reducedLatency = reducedLatency;
    return this;
  }

   /**
   * This field is deprecated. Please use latency_mode instead. Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this if you want lower latency for your live stream. Note: Reconnect windows are incompatible with Reduced Latency and will always be set to zero (0) seconds. Read more here: https://mux.com/blog/reduced-latency-for-mux-live-streaming-now-available/
   * @return reducedLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is deprecated. Please use latency_mode instead. Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this if you want lower latency for your live stream. Note: Reconnect windows are incompatible with Reduced Latency and will always be set to zero (0) seconds. Read more here: https://mux.com/blog/reduced-latency-for-mux-live-streaming-now-available/")

  public Boolean getReducedLatency() {
    return reducedLatency;
  }


  public void setReducedLatency(Boolean reducedLatency) {
    this.reducedLatency = reducedLatency;
  }


  public CreateLiveStreamRequest lowLatency(Boolean lowLatency) {
    
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


  public CreateLiveStreamRequest latencyMode(LatencyModeEnum latencyMode) {
    
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


  public CreateLiveStreamRequest test(Boolean test) {
    
    this.test = test;
    return this;
  }

   /**
   * Marks the live stream as a test live stream when the value is set to true. A test live stream can help evaluate the Mux Video APIs without incurring any cost. There is no limit on number of test live streams created. Test live streams are watermarked with the Mux logo and limited to 5 minutes. The test live stream is disabled after the stream is active for 5 mins and the recorded asset also deleted after 24 hours.
   * @return test
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Marks the live stream as a test live stream when the value is set to true. A test live stream can help evaluate the Mux Video APIs without incurring any cost. There is no limit on number of test live streams created. Test live streams are watermarked with the Mux logo and limited to 5 minutes. The test live stream is disabled after the stream is active for 5 mins and the recorded asset also deleted after 24 hours.")

  public Boolean getTest() {
    return test;
  }


  public void setTest(Boolean test) {
    this.test = test;
  }


  public CreateLiveStreamRequest simulcastTargets(java.util.List<CreateSimulcastTargetRequest> simulcastTargets) {
    
    this.simulcastTargets = simulcastTargets;
    return this;
  }

  public CreateLiveStreamRequest addSimulcastTargetsItem(CreateSimulcastTargetRequest simulcastTargetsItem) {
    if (this.simulcastTargets == null) {
      this.simulcastTargets = new java.util.ArrayList<>();
    }
    this.simulcastTargets.add(simulcastTargetsItem);
    return this;
  }

   /**
   * Get simulcastTargets
   * @return simulcastTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<CreateSimulcastTargetRequest> getSimulcastTargets() {
    return simulcastTargets;
  }


  public void setSimulcastTargets(java.util.List<CreateSimulcastTargetRequest> simulcastTargets) {
    this.simulcastTargets = simulcastTargets;
  }


  public CreateLiveStreamRequest maxContinuousDuration(Integer maxContinuousDuration) {
    
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
    CreateLiveStreamRequest createLiveStreamRequest = (CreateLiveStreamRequest) o;
    return Objects.equals(this.playbackPolicy, createLiveStreamRequest.playbackPolicy) &&
        Objects.equals(this.newAssetSettings, createLiveStreamRequest.newAssetSettings) &&
        Objects.equals(this.reconnectWindow, createLiveStreamRequest.reconnectWindow) &&
        Objects.equals(this.passthrough, createLiveStreamRequest.passthrough) &&
        Objects.equals(this.audioOnly, createLiveStreamRequest.audioOnly) &&
        Objects.equals(this.embeddedSubtitles, createLiveStreamRequest.embeddedSubtitles) &&
        Objects.equals(this.generatedSubtitles, createLiveStreamRequest.generatedSubtitles) &&
        Objects.equals(this.reducedLatency, createLiveStreamRequest.reducedLatency) &&
        Objects.equals(this.lowLatency, createLiveStreamRequest.lowLatency) &&
        Objects.equals(this.latencyMode, createLiveStreamRequest.latencyMode) &&
        Objects.equals(this.test, createLiveStreamRequest.test) &&
        Objects.equals(this.simulcastTargets, createLiveStreamRequest.simulcastTargets) &&
        Objects.equals(this.maxContinuousDuration, createLiveStreamRequest.maxContinuousDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playbackPolicy, newAssetSettings, reconnectWindow, passthrough, audioOnly, embeddedSubtitles, generatedSubtitles, reducedLatency, lowLatency, latencyMode, test, simulcastTargets, maxContinuousDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLiveStreamRequest {\n");
    sb.append("    playbackPolicy: ").append(toIndentedString(playbackPolicy)).append("\n");
    sb.append("    newAssetSettings: ").append(toIndentedString(newAssetSettings)).append("\n");
    sb.append("    reconnectWindow: ").append(toIndentedString(reconnectWindow)).append("\n");
    sb.append("    passthrough: ").append(toIndentedString(passthrough)).append("\n");
    sb.append("    audioOnly: ").append(toIndentedString(audioOnly)).append("\n");
    sb.append("    embeddedSubtitles: ").append(toIndentedString(embeddedSubtitles)).append("\n");
    sb.append("    generatedSubtitles: ").append(toIndentedString(generatedSubtitles)).append("\n");
    sb.append("    reducedLatency: ").append(toIndentedString(reducedLatency)).append("\n");
    sb.append("    lowLatency: ").append(toIndentedString(lowLatency)).append("\n");
    sb.append("    latencyMode: ").append(toIndentedString(latencyMode)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    simulcastTargets: ").append(toIndentedString(simulcastTargets)).append("\n");
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

