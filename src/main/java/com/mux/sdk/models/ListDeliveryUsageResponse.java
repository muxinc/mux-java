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
import com.mux.sdk.models.DeliveryReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ListDeliveryUsageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T16:49:42.215909-04:00[America/New_York]")
public class ListDeliveryUsageResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private java.util.List<DeliveryReport> data = null;

  public static final String SERIALIZED_NAME_TOTAL_ROW_COUNT = "total_row_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROW_COUNT)
  private Long totalRowCount;

  public static final String SERIALIZED_NAME_TIMEFRAME = "timeframe";
  @SerializedName(SERIALIZED_NAME_TIMEFRAME)
  private java.util.List<Long> timeframe = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Long limit;


  public ListDeliveryUsageResponse data(java.util.List<DeliveryReport> data) {
    
    this.data = data;
    return this;
  }

  public ListDeliveryUsageResponse addDataItem(DeliveryReport dataItem) {
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

  public java.util.List<DeliveryReport> getData() {
    return data;
  }


  public void setData(java.util.List<DeliveryReport> data) {
    this.data = data;
  }


  public ListDeliveryUsageResponse totalRowCount(Long totalRowCount) {
    
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


  public ListDeliveryUsageResponse timeframe(java.util.List<Long> timeframe) {
    
    this.timeframe = timeframe;
    return this;
  }

  public ListDeliveryUsageResponse addTimeframeItem(Long timeframeItem) {
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


  public ListDeliveryUsageResponse limit(Long limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Number of assets returned in this response. Default value is 100.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of assets returned in this response. Default value is 100.")

  public Long getLimit() {
    return limit;
  }


  public void setLimit(Long limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDeliveryUsageResponse listDeliveryUsageResponse = (ListDeliveryUsageResponse) o;
    return Objects.equals(this.data, listDeliveryUsageResponse.data) &&
        Objects.equals(this.totalRowCount, listDeliveryUsageResponse.totalRowCount) &&
        Objects.equals(this.timeframe, listDeliveryUsageResponse.timeframe) &&
        Objects.equals(this.limit, listDeliveryUsageResponse.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalRowCount, timeframe, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDeliveryUsageResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

