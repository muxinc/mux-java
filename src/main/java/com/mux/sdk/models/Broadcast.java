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
import com.mux.sdk.models.BroadcastLayout;
import com.mux.sdk.models.BroadcastResolution;
import com.mux.sdk.models.BroadcastStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Broadcast
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Broadcast {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;

  public static final String SERIALIZED_NAME_LIVE_STREAM_ID = "live_stream_id";
  @SerializedName(SERIALIZED_NAME_LIVE_STREAM_ID)
  private String liveStreamId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BroadcastStatus status;

  public static final String SERIALIZED_NAME_LAYOUT = "layout";
  @SerializedName(SERIALIZED_NAME_LAYOUT)
  private BroadcastLayout layout = BroadcastLayout.GALLERY;

  public static final String SERIALIZED_NAME_BACKGROUND = "background";
  @SerializedName(SERIALIZED_NAME_BACKGROUND)
  private String background;

  public static final String SERIALIZED_NAME_RESOLUTION = "resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private BroadcastResolution resolution = BroadcastResolution._1920X1080;


  public Broadcast id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the broadcast. Max 255 characters.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the broadcast. Max 255 characters.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Broadcast passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * Arbitrary user-supplied metadata that will be included in the broadcast details and related webhooks. Max: 255 characters.
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary user-supplied metadata that will be included in the broadcast details and related webhooks. Max: 255 characters.")

  public String getPassthrough() {
    return passthrough;
  }


  public void setPassthrough(String passthrough) {
    this.passthrough = passthrough;
  }


  public Broadcast liveStreamId(String liveStreamId) {
    
    this.liveStreamId = liveStreamId;
    return this;
  }

   /**
   * The ID of the live stream that the broadcast will be sent to.
   * @return liveStreamId
  **/
  @ApiModelProperty(required = true, value = "The ID of the live stream that the broadcast will be sent to.")

  public String getLiveStreamId() {
    return liveStreamId;
  }


  public void setLiveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
  }


  public Broadcast status(BroadcastStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public BroadcastStatus getStatus() {
    return status;
  }


  public void setStatus(BroadcastStatus status) {
    this.status = status;
  }


  public Broadcast layout(BroadcastLayout layout) {
    
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @ApiModelProperty(required = true, value = "")

  public BroadcastLayout getLayout() {
    return layout;
  }


  public void setLayout(BroadcastLayout layout) {
    this.layout = layout;
  }


  public Broadcast background(String background) {
    
    this.background = background;
    return this;
  }

   /**
   * URL of an image to display as the background of the broadcast. Its dimensions should match the provided resolution.
   * @return background
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of an image to display as the background of the broadcast. Its dimensions should match the provided resolution.")

  public String getBackground() {
    return background;
  }


  public void setBackground(String background) {
    this.background = background;
  }


  public Broadcast resolution(BroadcastResolution resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @ApiModelProperty(required = true, value = "")

  public BroadcastResolution getResolution() {
    return resolution;
  }


  public void setResolution(BroadcastResolution resolution) {
    this.resolution = resolution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Broadcast broadcast = (Broadcast) o;
    return Objects.equals(this.id, broadcast.id) &&
        Objects.equals(this.passthrough, broadcast.passthrough) &&
        Objects.equals(this.liveStreamId, broadcast.liveStreamId) &&
        Objects.equals(this.status, broadcast.status) &&
        Objects.equals(this.layout, broadcast.layout) &&
        Objects.equals(this.background, broadcast.background) &&
        Objects.equals(this.resolution, broadcast.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, passthrough, liveStreamId, status, layout, background, resolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Broadcast {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    passthrough: ").append(toIndentedString(passthrough)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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

