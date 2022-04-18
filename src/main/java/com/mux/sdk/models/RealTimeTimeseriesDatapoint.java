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
 * RealTimeTimeseriesDatapoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-18T12:08:06.708135-04:00[America/New_York]")
public class RealTimeTimeseriesDatapoint {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_CONCURRENT_VIEWERS = "concurrent_viewers";
  @SerializedName(SERIALIZED_NAME_CONCURRENT_VIEWERS)
  private Long concurrentViewers;


  public RealTimeTimeseriesDatapoint value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  public RealTimeTimeseriesDatapoint date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public RealTimeTimeseriesDatapoint concurrentViewers(Long concurrentViewers) {
    
    this.concurrentViewers = concurrentViewers;
    return this;
  }

   /**
   * Get concurrentViewers
   * @return concurrentViewers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getConcurrentViewers() {
    return concurrentViewers;
  }


  public void setConcurrentViewers(Long concurrentViewers) {
    this.concurrentViewers = concurrentViewers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeTimeseriesDatapoint realTimeTimeseriesDatapoint = (RealTimeTimeseriesDatapoint) o;
    return Objects.equals(this.value, realTimeTimeseriesDatapoint.value) &&
        Objects.equals(this.date, realTimeTimeseriesDatapoint.date) &&
        Objects.equals(this.concurrentViewers, realTimeTimeseriesDatapoint.concurrentViewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, date, concurrentViewers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeTimeseriesDatapoint {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    concurrentViewers: ").append(toIndentedString(concurrentViewers)).append("\n");
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

