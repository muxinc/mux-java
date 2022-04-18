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
 * InputTrack
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-18T12:08:06.708135-04:00[America/New_York]")
public class InputTrack {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration;

  public static final String SERIALIZED_NAME_ENCODING = "encoding";
  @SerializedName(SERIALIZED_NAME_ENCODING)
  private String encoding;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height;

  public static final String SERIALIZED_NAME_FRAME_RATE = "frame_rate";
  @SerializedName(SERIALIZED_NAME_FRAME_RATE)
  private Double frameRate;

  public static final String SERIALIZED_NAME_SAMPLE_RATE = "sample_rate";
  @SerializedName(SERIALIZED_NAME_SAMPLE_RATE)
  private Long sampleRate;

  public static final String SERIALIZED_NAME_SAMPLE_SIZE = "sample_size";
  @SerializedName(SERIALIZED_NAME_SAMPLE_SIZE)
  private Long sampleSize;

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private Long channels;


  public InputTrack type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public InputTrack duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public InputTrack encoding(String encoding) {
    
    this.encoding = encoding;
    return this;
  }

   /**
   * Get encoding
   * @return encoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEncoding() {
    return encoding;
  }


  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  public InputTrack width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }


  public InputTrack height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public InputTrack frameRate(Double frameRate) {
    
    this.frameRate = frameRate;
    return this;
  }

   /**
   * Get frameRate
   * @return frameRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getFrameRate() {
    return frameRate;
  }


  public void setFrameRate(Double frameRate) {
    this.frameRate = frameRate;
  }


  public InputTrack sampleRate(Long sampleRate) {
    
    this.sampleRate = sampleRate;
    return this;
  }

   /**
   * Get sampleRate
   * @return sampleRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSampleRate() {
    return sampleRate;
  }


  public void setSampleRate(Long sampleRate) {
    this.sampleRate = sampleRate;
  }


  public InputTrack sampleSize(Long sampleSize) {
    
    this.sampleSize = sampleSize;
    return this;
  }

   /**
   * Get sampleSize
   * @return sampleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSampleSize() {
    return sampleSize;
  }


  public void setSampleSize(Long sampleSize) {
    this.sampleSize = sampleSize;
  }


  public InputTrack channels(Long channels) {
    
    this.channels = channels;
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getChannels() {
    return channels;
  }


  public void setChannels(Long channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputTrack inputTrack = (InputTrack) o;
    return Objects.equals(this.type, inputTrack.type) &&
        Objects.equals(this.duration, inputTrack.duration) &&
        Objects.equals(this.encoding, inputTrack.encoding) &&
        Objects.equals(this.width, inputTrack.width) &&
        Objects.equals(this.height, inputTrack.height) &&
        Objects.equals(this.frameRate, inputTrack.frameRate) &&
        Objects.equals(this.sampleRate, inputTrack.sampleRate) &&
        Objects.equals(this.sampleSize, inputTrack.sampleSize) &&
        Objects.equals(this.channels, inputTrack.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, duration, encoding, width, height, frameRate, sampleRate, sampleSize, channels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputTrack {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
    sb.append("    sampleSize: ").append(toIndentedString(sampleSize)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

