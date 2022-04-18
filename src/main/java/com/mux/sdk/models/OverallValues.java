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
 * OverallValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-18T12:08:06.708135-04:00[America/New_York]")
public class OverallValues {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_TOTAL_WATCH_TIME = "total_watch_time";
  @SerializedName(SERIALIZED_NAME_TOTAL_WATCH_TIME)
  private Long totalWatchTime;

  public static final String SERIALIZED_NAME_TOTAL_VIEWS = "total_views";
  @SerializedName(SERIALIZED_NAME_TOTAL_VIEWS)
  private Long totalViews;

  public static final String SERIALIZED_NAME_GLOBAL_VALUE = "global_value";
  @SerializedName(SERIALIZED_NAME_GLOBAL_VALUE)
  private Double globalValue;


  public OverallValues value(Double value) {
    
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


  public OverallValues totalWatchTime(Long totalWatchTime) {
    
    this.totalWatchTime = totalWatchTime;
    return this;
  }

   /**
   * Get totalWatchTime
   * @return totalWatchTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalWatchTime() {
    return totalWatchTime;
  }


  public void setTotalWatchTime(Long totalWatchTime) {
    this.totalWatchTime = totalWatchTime;
  }


  public OverallValues totalViews(Long totalViews) {
    
    this.totalViews = totalViews;
    return this;
  }

   /**
   * Get totalViews
   * @return totalViews
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalViews() {
    return totalViews;
  }


  public void setTotalViews(Long totalViews) {
    this.totalViews = totalViews;
  }


  public OverallValues globalValue(Double globalValue) {
    
    this.globalValue = globalValue;
    return this;
  }

   /**
   * Get globalValue
   * @return globalValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getGlobalValue() {
    return globalValue;
  }


  public void setGlobalValue(Double globalValue) {
    this.globalValue = globalValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverallValues overallValues = (OverallValues) o;
    return Objects.equals(this.value, overallValues.value) &&
        Objects.equals(this.totalWatchTime, overallValues.totalWatchTime) &&
        Objects.equals(this.totalViews, overallValues.totalViews) &&
        Objects.equals(this.globalValue, overallValues.globalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, totalWatchTime, totalViews, globalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverallValues {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    totalWatchTime: ").append(toIndentedString(totalWatchTime)).append("\n");
    sb.append("    totalViews: ").append(toIndentedString(totalViews)).append("\n");
    sb.append("    globalValue: ").append(toIndentedString(globalValue)).append("\n");
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

