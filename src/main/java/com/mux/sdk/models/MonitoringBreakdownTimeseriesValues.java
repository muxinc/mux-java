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
import com.mux.sdk.models.MonitoringBreakdownTimeseriesDatapoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MonitoringBreakdownTimeseriesValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MonitoringBreakdownTimeseriesValues {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private java.util.List<MonitoringBreakdownTimeseriesDatapoint> values = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;


  public MonitoringBreakdownTimeseriesValues values(java.util.List<MonitoringBreakdownTimeseriesDatapoint> values) {
    
    this.values = values;
    return this;
  }

  public MonitoringBreakdownTimeseriesValues addValuesItem(MonitoringBreakdownTimeseriesDatapoint valuesItem) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<MonitoringBreakdownTimeseriesDatapoint> getValues() {
    return values;
  }


  public void setValues(java.util.List<MonitoringBreakdownTimeseriesDatapoint> values) {
    this.values = values;
  }


  public MonitoringBreakdownTimeseriesValues date(String date) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringBreakdownTimeseriesValues monitoringBreakdownTimeseriesValues = (MonitoringBreakdownTimeseriesValues) o;
    return Objects.equals(this.values, monitoringBreakdownTimeseriesValues.values) &&
        Objects.equals(this.date, monitoringBreakdownTimeseriesValues.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringBreakdownTimeseriesValues {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

