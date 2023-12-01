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
 * WebInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebInput {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_AUTO_LAUNCH = "auto_launch";
  @SerializedName(SERIALIZED_NAME_AUTO_LAUNCH)
  private Boolean autoLaunch;

  public static final String SERIALIZED_NAME_LIVE_STREAM_ID = "live_stream_id";
  @SerializedName(SERIALIZED_NAME_LIVE_STREAM_ID)
  private String liveStreamId;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IDLE("idle"),
    
    LAUNCHING("launching"),
    
    STREAMING("streaming");

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

  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;

  /**
   * The resolution of the viewport of the Web Input&#39;s browser instance. Defaults to 1920x1080 if not set.
   */
  @JsonAdapter(ResolutionEnum.Adapter.class)
  public enum ResolutionEnum {
    _1920X1080("1920x1080"),
    
    _1280X720("1280x720"),
    
    _1080X1920("1080x1920"),
    
    _720X1280("720x1280"),
    
    _1080X1080("1080x1080"),
    
    _720X720("720x720");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResolutionEnum fromValue(String value) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResolutionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResolutionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResolutionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResolutionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESOLUTION = "resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private ResolutionEnum resolution = ResolutionEnum._1920X1080;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout = 3600;


  public WebInput id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Web Input.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the Web Input.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WebInput createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time the Web Input was created, defined as a Unix timestamp (seconds since epoch).
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the Web Input was created, defined as a Unix timestamp (seconds since epoch).")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public WebInput url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL for the Web Input to load.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the Web Input to load.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebInput autoLaunch(Boolean autoLaunch) {
    
    this.autoLaunch = autoLaunch;
    return this;
  }

   /**
   * When set to &#x60;true&#x60; the Web Input will automatically launch and start streaming immediately after creation
   * @return autoLaunch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When set to `true` the Web Input will automatically launch and start streaming immediately after creation")

  public Boolean getAutoLaunch() {
    return autoLaunch;
  }


  public void setAutoLaunch(Boolean autoLaunch) {
    this.autoLaunch = autoLaunch;
  }


  public WebInput liveStreamId(String liveStreamId) {
    
    this.liveStreamId = liveStreamId;
    return this;
  }

   /**
   * The Live Stream ID to broadcast this Web Input to
   * @return liveStreamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Live Stream ID to broadcast this Web Input to")

  public String getLiveStreamId() {
    return liveStreamId;
  }


  public void setLiveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
  }


  public WebInput status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WebInput passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * Arbitrary metadata that will be included in the Web Input details and related webhooks. Can be used to store your own ID for the Web Input. **Max: 255 characters**.
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary metadata that will be included in the Web Input details and related webhooks. Can be used to store your own ID for the Web Input. **Max: 255 characters**.")

  public String getPassthrough() {
    return passthrough;
  }


  public void setPassthrough(String passthrough) {
    this.passthrough = passthrough;
  }


  public WebInput resolution(ResolutionEnum resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * The resolution of the viewport of the Web Input&#39;s browser instance. Defaults to 1920x1080 if not set.
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The resolution of the viewport of the Web Input's browser instance. Defaults to 1920x1080 if not set.")

  public ResolutionEnum getResolution() {
    return resolution;
  }


  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }


  public WebInput timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * The number of seconds that the Web Input should stream for before automatically shutting down.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of seconds that the Web Input should stream for before automatically shutting down.")

  public Integer getTimeout() {
    return timeout;
  }


  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebInput webInput = (WebInput) o;
    return Objects.equals(this.id, webInput.id) &&
        Objects.equals(this.createdAt, webInput.createdAt) &&
        Objects.equals(this.url, webInput.url) &&
        Objects.equals(this.autoLaunch, webInput.autoLaunch) &&
        Objects.equals(this.liveStreamId, webInput.liveStreamId) &&
        Objects.equals(this.status, webInput.status) &&
        Objects.equals(this.passthrough, webInput.passthrough) &&
        Objects.equals(this.resolution, webInput.resolution) &&
        Objects.equals(this.timeout, webInput.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, url, autoLaunch, liveStreamId, status, passthrough, resolution, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebInput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    autoLaunch: ").append(toIndentedString(autoLaunch)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    passthrough: ").append(toIndentedString(passthrough)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

