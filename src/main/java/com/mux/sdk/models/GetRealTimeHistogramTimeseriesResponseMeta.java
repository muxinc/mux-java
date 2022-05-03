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
import com.mux.sdk.models.RealTimeHistogramTimeseriesBucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetRealTimeHistogramTimeseriesResponseMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetRealTimeHistogramTimeseriesResponseMeta {
  public static final String SERIALIZED_NAME_BUCKETS = "buckets";
  @SerializedName(SERIALIZED_NAME_BUCKETS)
  private java.util.List<RealTimeHistogramTimeseriesBucket> buckets = null;


  public GetRealTimeHistogramTimeseriesResponseMeta buckets(java.util.List<RealTimeHistogramTimeseriesBucket> buckets) {
    
    this.buckets = buckets;
    return this;
  }

  public GetRealTimeHistogramTimeseriesResponseMeta addBucketsItem(RealTimeHistogramTimeseriesBucket bucketsItem) {
    if (this.buckets == null) {
      this.buckets = new java.util.ArrayList<>();
    }
    this.buckets.add(bucketsItem);
    return this;
  }

   /**
   * Get buckets
   * @return buckets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<RealTimeHistogramTimeseriesBucket> getBuckets() {
    return buckets;
  }


  public void setBuckets(java.util.List<RealTimeHistogramTimeseriesBucket> buckets) {
    this.buckets = buckets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRealTimeHistogramTimeseriesResponseMeta getRealTimeHistogramTimeseriesResponseMeta = (GetRealTimeHistogramTimeseriesResponseMeta) o;
    return Objects.equals(this.buckets, getRealTimeHistogramTimeseriesResponseMeta.buckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRealTimeHistogramTimeseriesResponseMeta {\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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

