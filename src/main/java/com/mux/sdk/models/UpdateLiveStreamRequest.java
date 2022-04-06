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
 * UpdateLiveStreamRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T13:02:50.965402-04:00[America/New_York]")
public class UpdateLiveStreamRequest {
  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;

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

  public static final String SERIALIZED_NAME_RECONNECT_WINDOW = "reconnect_window";
  @SerializedName(SERIALIZED_NAME_RECONNECT_WINDOW)
  private Float reconnectWindow;

  public static final String SERIALIZED_NAME_MAX_CONTINUOUS_DURATION = "max_continuous_duration";
  @SerializedName(SERIALIZED_NAME_MAX_CONTINUOUS_DURATION)
  private Integer maxContinuousDuration = 43200;


  public UpdateLiveStreamRequest passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * Arbitrary user-supplied metadata set for the live stream. Max 255 characters. In order to clear this value, the field should be included with an empty-string value.
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary user-supplied metadata set for the live stream. Max 255 characters. In order to clear this value, the field should be included with an empty-string value.")

  public String getPassthrough() {
    return passthrough;
  }


  public void setPassthrough(String passthrough) {
    this.passthrough = passthrough;
  }


  public UpdateLiveStreamRequest latencyMode(LatencyModeEnum latencyMode) {
    
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


  public UpdateLiveStreamRequest reconnectWindow(Float reconnectWindow) {
    
    this.reconnectWindow = reconnectWindow;
    return this;
  }

   /**
   * When live streaming software disconnects from Mux, either intentionally or due to a drop in the network, the Reconnect Window is the time in seconds that Mux should wait for the streaming software to reconnect before considering the live stream finished and completing the recorded asset.
   * minimum: 0.1
   * maximum: 300
   * @return reconnectWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When live streaming software disconnects from Mux, either intentionally or due to a drop in the network, the Reconnect Window is the time in seconds that Mux should wait for the streaming software to reconnect before considering the live stream finished and completing the recorded asset.")

  public Float getReconnectWindow() {
    return reconnectWindow;
  }


  public void setReconnectWindow(Float reconnectWindow) {
    this.reconnectWindow = reconnectWindow;
  }


  public UpdateLiveStreamRequest maxContinuousDuration(Integer maxContinuousDuration) {
    
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
    UpdateLiveStreamRequest updateLiveStreamRequest = (UpdateLiveStreamRequest) o;
    return Objects.equals(this.passthrough, updateLiveStreamRequest.passthrough) &&
        Objects.equals(this.latencyMode, updateLiveStreamRequest.latencyMode) &&
        Objects.equals(this.reconnectWindow, updateLiveStreamRequest.reconnectWindow) &&
        Objects.equals(this.maxContinuousDuration, updateLiveStreamRequest.maxContinuousDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passthrough, latencyMode, reconnectWindow, maxContinuousDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLiveStreamRequest {\n");
    sb.append("    passthrough: ").append(toIndentedString(passthrough)).append("\n");
    sb.append("    latencyMode: ").append(toIndentedString(latencyMode)).append("\n");
    sb.append("    reconnectWindow: ").append(toIndentedString(reconnectWindow)).append("\n");
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

