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
 * MonitoringBreakdownValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MonitoringBreakdownValue {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_NEGATIVE_IMPACT = "negative_impact";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_IMPACT)
  private Long negativeImpact;

  public static final String SERIALIZED_NAME_METRIC_VALUE = "metric_value";
  @SerializedName(SERIALIZED_NAME_METRIC_VALUE)
  private Double metricValue;

  public static final String SERIALIZED_NAME_DISPLAY_VALUE = "display_value";
  @SerializedName(SERIALIZED_NAME_DISPLAY_VALUE)
  private String displayValue;

  public static final String SERIALIZED_NAME_CONCURRENT_VIEWERS = "concurrent_viewers";
  @SerializedName(SERIALIZED_NAME_CONCURRENT_VIEWERS)
  private Long concurrentViewers;

  public static final String SERIALIZED_NAME_STARTING_UP_VIEWERS = "starting_up_viewers";
  @SerializedName(SERIALIZED_NAME_STARTING_UP_VIEWERS)
  private Long startingUpViewers;


  public MonitoringBreakdownValue value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public MonitoringBreakdownValue negativeImpact(Long negativeImpact) {
    
    this.negativeImpact = negativeImpact;
    return this;
  }

   /**
   * Get negativeImpact
   * @return negativeImpact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getNegativeImpact() {
    return negativeImpact;
  }


  public void setNegativeImpact(Long negativeImpact) {
    this.negativeImpact = negativeImpact;
  }


  public MonitoringBreakdownValue metricValue(Double metricValue) {
    
    this.metricValue = metricValue;
    return this;
  }

   /**
   * Get metricValue
   * @return metricValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMetricValue() {
    return metricValue;
  }


  public void setMetricValue(Double metricValue) {
    this.metricValue = metricValue;
  }


  public MonitoringBreakdownValue displayValue(String displayValue) {
    
    this.displayValue = displayValue;
    return this;
  }

   /**
   * Get displayValue
   * @return displayValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayValue() {
    return displayValue;
  }


  public void setDisplayValue(String displayValue) {
    this.displayValue = displayValue;
  }


  public MonitoringBreakdownValue concurrentViewers(Long concurrentViewers) {
    
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


  public MonitoringBreakdownValue startingUpViewers(Long startingUpViewers) {
    
    this.startingUpViewers = startingUpViewers;
    return this;
  }

   /**
   * Get startingUpViewers
   * @return startingUpViewers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getStartingUpViewers() {
    return startingUpViewers;
  }


  public void setStartingUpViewers(Long startingUpViewers) {
    this.startingUpViewers = startingUpViewers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringBreakdownValue monitoringBreakdownValue = (MonitoringBreakdownValue) o;
    return Objects.equals(this.value, monitoringBreakdownValue.value) &&
        Objects.equals(this.negativeImpact, monitoringBreakdownValue.negativeImpact) &&
        Objects.equals(this.metricValue, monitoringBreakdownValue.metricValue) &&
        Objects.equals(this.displayValue, monitoringBreakdownValue.displayValue) &&
        Objects.equals(this.concurrentViewers, monitoringBreakdownValue.concurrentViewers) &&
        Objects.equals(this.startingUpViewers, monitoringBreakdownValue.startingUpViewers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, negativeImpact, metricValue, displayValue, concurrentViewers, startingUpViewers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringBreakdownValue {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    negativeImpact: ").append(toIndentedString(negativeImpact)).append("\n");
    sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
    sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
    sb.append("    concurrentViewers: ").append(toIndentedString(concurrentViewers)).append("\n");
    sb.append("    startingUpViewers: ").append(toIndentedString(startingUpViewers)).append("\n");
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

