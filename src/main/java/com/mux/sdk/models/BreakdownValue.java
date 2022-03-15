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
 * BreakdownValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T16:07:59.745206-04:00[America/New_York]")
public class BreakdownValue {
  public static final String SERIALIZED_NAME_VIEWS = "views";
  @SerializedName(SERIALIZED_NAME_VIEWS)
  private Long views;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_TOTAL_WATCH_TIME = "total_watch_time";
  @SerializedName(SERIALIZED_NAME_TOTAL_WATCH_TIME)
  private Long totalWatchTime;

  public static final String SERIALIZED_NAME_NEGATIVE_IMPACT = "negative_impact";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_IMPACT)
  private Integer negativeImpact;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;


  public BreakdownValue views(Long views) {
    
    this.views = views;
    return this;
  }

   /**
   * Get views
   * @return views
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getViews() {
    return views;
  }


  public void setViews(Long views) {
    this.views = views;
  }


  public BreakdownValue value(Double value) {
    
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


  public BreakdownValue totalWatchTime(Long totalWatchTime) {
    
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


  public BreakdownValue negativeImpact(Integer negativeImpact) {
    
    this.negativeImpact = negativeImpact;
    return this;
  }

   /**
   * Get negativeImpact
   * @return negativeImpact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNegativeImpact() {
    return negativeImpact;
  }


  public void setNegativeImpact(Integer negativeImpact) {
    this.negativeImpact = negativeImpact;
  }


  public BreakdownValue field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreakdownValue breakdownValue = (BreakdownValue) o;
    return Objects.equals(this.views, breakdownValue.views) &&
        Objects.equals(this.value, breakdownValue.value) &&
        Objects.equals(this.totalWatchTime, breakdownValue.totalWatchTime) &&
        Objects.equals(this.negativeImpact, breakdownValue.negativeImpact) &&
        Objects.equals(this.field, breakdownValue.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(views, value, totalWatchTime, negativeImpact, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreakdownValue {\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    totalWatchTime: ").append(toIndentedString(totalWatchTime)).append("\n");
    sb.append("    negativeImpact: ").append(toIndentedString(negativeImpact)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

