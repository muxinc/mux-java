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
import com.mux.sdk.models.RealTimeTimeseriesDatapoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetRealTimeTimeseriesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T16:49:42.215909-04:00[America/New_York]")
public class GetRealTimeTimeseriesResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private java.util.List<RealTimeTimeseriesDatapoint> data = null;

  public static final String SERIALIZED_NAME_TOTAL_ROW_COUNT = "total_row_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROW_COUNT)
  private Long totalRowCount;

  public static final String SERIALIZED_NAME_TIMEFRAME = "timeframe";
  @SerializedName(SERIALIZED_NAME_TIMEFRAME)
  private java.util.List<Long> timeframe = null;


  public GetRealTimeTimeseriesResponse data(java.util.List<RealTimeTimeseriesDatapoint> data) {
    
    this.data = data;
    return this;
  }

  public GetRealTimeTimeseriesResponse addDataItem(RealTimeTimeseriesDatapoint dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<RealTimeTimeseriesDatapoint> getData() {
    return data;
  }


  public void setData(java.util.List<RealTimeTimeseriesDatapoint> data) {
    this.data = data;
  }


  public GetRealTimeTimeseriesResponse totalRowCount(Long totalRowCount) {
    
    this.totalRowCount = totalRowCount;
    return this;
  }

   /**
   * Get totalRowCount
   * @return totalRowCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalRowCount() {
    return totalRowCount;
  }


  public void setTotalRowCount(Long totalRowCount) {
    this.totalRowCount = totalRowCount;
  }


  public GetRealTimeTimeseriesResponse timeframe(java.util.List<Long> timeframe) {
    
    this.timeframe = timeframe;
    return this;
  }

  public GetRealTimeTimeseriesResponse addTimeframeItem(Long timeframeItem) {
    if (this.timeframe == null) {
      this.timeframe = new java.util.ArrayList<>();
    }
    this.timeframe.add(timeframeItem);
    return this;
  }

   /**
   * Get timeframe
   * @return timeframe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<Long> getTimeframe() {
    return timeframe;
  }


  public void setTimeframe(java.util.List<Long> timeframe) {
    this.timeframe = timeframe;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRealTimeTimeseriesResponse getRealTimeTimeseriesResponse = (GetRealTimeTimeseriesResponse) o;
    return Objects.equals(this.data, getRealTimeTimeseriesResponse.data) &&
        Objects.equals(this.totalRowCount, getRealTimeTimeseriesResponse.totalRowCount) &&
        Objects.equals(this.timeframe, getRealTimeTimeseriesResponse.timeframe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalRowCount, timeframe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRealTimeTimeseriesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
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

