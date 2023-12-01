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
import com.mux.sdk.models.BreakdownValue;
import com.mux.sdk.models.ListBreakdownValuesResponseMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ListBreakdownValuesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListBreakdownValuesResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private java.util.List<BreakdownValue> data = null;

  public static final String SERIALIZED_NAME_TOTAL_ROW_COUNT = "total_row_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROW_COUNT)
  private Long totalRowCount;

  public static final String SERIALIZED_NAME_TIMEFRAME = "timeframe";
  @SerializedName(SERIALIZED_NAME_TIMEFRAME)
  private java.util.List<Long> timeframe = null;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private ListBreakdownValuesResponseMeta meta;


  public ListBreakdownValuesResponse data(java.util.List<BreakdownValue> data) {
    
    this.data = data;
    return this;
  }

  public ListBreakdownValuesResponse addDataItem(BreakdownValue dataItem) {
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

  public java.util.List<BreakdownValue> getData() {
    return data;
  }


  public void setData(java.util.List<BreakdownValue> data) {
    this.data = data;
  }


  public ListBreakdownValuesResponse totalRowCount(Long totalRowCount) {
    
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


  public ListBreakdownValuesResponse timeframe(java.util.List<Long> timeframe) {
    
    this.timeframe = timeframe;
    return this;
  }

  public ListBreakdownValuesResponse addTimeframeItem(Long timeframeItem) {
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


  public ListBreakdownValuesResponse meta(ListBreakdownValuesResponseMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListBreakdownValuesResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(ListBreakdownValuesResponseMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBreakdownValuesResponse listBreakdownValuesResponse = (ListBreakdownValuesResponse) o;
    return Objects.equals(this.data, listBreakdownValuesResponse.data) &&
        Objects.equals(this.totalRowCount, listBreakdownValuesResponse.totalRowCount) &&
        Objects.equals(this.timeframe, listBreakdownValuesResponse.timeframe) &&
        Objects.equals(this.meta, listBreakdownValuesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, totalRowCount, timeframe, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBreakdownValuesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalRowCount: ").append(toIndentedString(totalRowCount)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

