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
import com.mux.sdk.models.DeliveryReportDeliveredSecondsByResolution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeliveryReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryReport {
  public static final String SERIALIZED_NAME_LIVE_STREAM_ID = "live_stream_id";
  @SerializedName(SERIALIZED_NAME_LIVE_STREAM_ID)
  private String liveStreamId;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private String deletedAt;

  /**
   * The state of the asset.
   */
  @JsonAdapter(AssetStateEnum.Adapter.class)
  public enum AssetStateEnum {
    READY("ready"),
    
    ERRORED("errored"),
    
    DELETED("deleted");

    private String value;

    AssetStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssetStateEnum fromValue(String value) {
      for (AssetStateEnum b : AssetStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssetStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssetStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssetStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssetStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSET_STATE = "asset_state";
  @SerializedName(SERIALIZED_NAME_ASSET_STATE)
  private AssetStateEnum assetState;

  public static final String SERIALIZED_NAME_ASSET_DURATION = "asset_duration";
  @SerializedName(SERIALIZED_NAME_ASSET_DURATION)
  private Double assetDuration;

  /**
   * The resolution tier that the asset was ingested at, affecting billing for ingest &amp; storage
   */
  @JsonAdapter(AssetResolutionTierEnum.Adapter.class)
  public enum AssetResolutionTierEnum {
    AUDIO_ONLY("audio-only"),
    
    _720P("720p"),
    
    _1080P("1080p"),
    
    _1440P("1440p"),
    
    _2160P("2160p");

    private String value;

    AssetResolutionTierEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssetResolutionTierEnum fromValue(String value) {
      for (AssetResolutionTierEnum b : AssetResolutionTierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssetResolutionTierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssetResolutionTierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssetResolutionTierEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssetResolutionTierEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSET_RESOLUTION_TIER = "asset_resolution_tier";
  @SerializedName(SERIALIZED_NAME_ASSET_RESOLUTION_TIER)
  private AssetResolutionTierEnum assetResolutionTier;

  /**
   * The encoding tier that the asset was ingested at. [See the encoding tiers guide for more details.](https://docs.mux.com/guides/use-encoding-tiers)
   */
  @JsonAdapter(AssetEncodingTierEnum.Adapter.class)
  public enum AssetEncodingTierEnum {
    SMART("smart"),
    
    BASELINE("baseline");

    private String value;

    AssetEncodingTierEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssetEncodingTierEnum fromValue(String value) {
      for (AssetEncodingTierEnum b : AssetEncodingTierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssetEncodingTierEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssetEncodingTierEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssetEncodingTierEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssetEncodingTierEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSET_ENCODING_TIER = "asset_encoding_tier";
  @SerializedName(SERIALIZED_NAME_ASSET_ENCODING_TIER)
  private AssetEncodingTierEnum assetEncodingTier;

  public static final String SERIALIZED_NAME_DELIVERED_SECONDS = "delivered_seconds";
  @SerializedName(SERIALIZED_NAME_DELIVERED_SECONDS)
  private Double deliveredSeconds;

  public static final String SERIALIZED_NAME_DELIVERED_SECONDS_BY_RESOLUTION = "delivered_seconds_by_resolution";
  @SerializedName(SERIALIZED_NAME_DELIVERED_SECONDS_BY_RESOLUTION)
  private DeliveryReportDeliveredSecondsByResolution deliveredSecondsByResolution;


  public DeliveryReport liveStreamId(String liveStreamId) {
    
    this.liveStreamId = liveStreamId;
    return this;
  }

   /**
   * Unique identifier for the live stream that created the asset.
   * @return liveStreamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the live stream that created the asset.")

  public String getLiveStreamId() {
    return liveStreamId;
  }


  public void setLiveStreamId(String liveStreamId) {
    this.liveStreamId = liveStreamId;
  }


  public DeliveryReport assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique identifier for the asset.
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the asset.")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public DeliveryReport passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * The &#x60;passthrough&#x60; value for the asset.
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `passthrough` value for the asset.")

  public String getPassthrough() {
    return passthrough;
  }


  public void setPassthrough(String passthrough) {
    this.passthrough = passthrough;
  }


  public DeliveryReport createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time at which the asset was created. Measured in seconds since the Unix epoch.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the asset was created. Measured in seconds since the Unix epoch.")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public DeliveryReport deletedAt(String deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * If exists, time at which the asset was deleted. Measured in seconds since the Unix epoch.
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If exists, time at which the asset was deleted. Measured in seconds since the Unix epoch.")

  public String getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }


  public DeliveryReport assetState(AssetStateEnum assetState) {
    
    this.assetState = assetState;
    return this;
  }

   /**
   * The state of the asset.
   * @return assetState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the asset.")

  public AssetStateEnum getAssetState() {
    return assetState;
  }


  public void setAssetState(AssetStateEnum assetState) {
    this.assetState = assetState;
  }


  public DeliveryReport assetDuration(Double assetDuration) {
    
    this.assetDuration = assetDuration;
    return this;
  }

   /**
   * The duration of the asset in seconds.
   * @return assetDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duration of the asset in seconds.")

  public Double getAssetDuration() {
    return assetDuration;
  }


  public void setAssetDuration(Double assetDuration) {
    this.assetDuration = assetDuration;
  }


  public DeliveryReport assetResolutionTier(AssetResolutionTierEnum assetResolutionTier) {
    
    this.assetResolutionTier = assetResolutionTier;
    return this;
  }

   /**
   * The resolution tier that the asset was ingested at, affecting billing for ingest &amp; storage
   * @return assetResolutionTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The resolution tier that the asset was ingested at, affecting billing for ingest & storage")

  public AssetResolutionTierEnum getAssetResolutionTier() {
    return assetResolutionTier;
  }


  public void setAssetResolutionTier(AssetResolutionTierEnum assetResolutionTier) {
    this.assetResolutionTier = assetResolutionTier;
  }


  public DeliveryReport assetEncodingTier(AssetEncodingTierEnum assetEncodingTier) {
    
    this.assetEncodingTier = assetEncodingTier;
    return this;
  }

   /**
   * The encoding tier that the asset was ingested at. [See the encoding tiers guide for more details.](https://docs.mux.com/guides/use-encoding-tiers)
   * @return assetEncodingTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoding tier that the asset was ingested at. [See the encoding tiers guide for more details.](https://docs.mux.com/guides/use-encoding-tiers)")

  public AssetEncodingTierEnum getAssetEncodingTier() {
    return assetEncodingTier;
  }


  public void setAssetEncodingTier(AssetEncodingTierEnum assetEncodingTier) {
    this.assetEncodingTier = assetEncodingTier;
  }


  public DeliveryReport deliveredSeconds(Double deliveredSeconds) {
    
    this.deliveredSeconds = deliveredSeconds;
    return this;
  }

   /**
   * Total number of delivered seconds during this time window.
   * @return deliveredSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of delivered seconds during this time window.")

  public Double getDeliveredSeconds() {
    return deliveredSeconds;
  }


  public void setDeliveredSeconds(Double deliveredSeconds) {
    this.deliveredSeconds = deliveredSeconds;
  }


  public DeliveryReport deliveredSecondsByResolution(DeliveryReportDeliveredSecondsByResolution deliveredSecondsByResolution) {
    
    this.deliveredSecondsByResolution = deliveredSecondsByResolution;
    return this;
  }

   /**
   * Get deliveredSecondsByResolution
   * @return deliveredSecondsByResolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryReportDeliveredSecondsByResolution getDeliveredSecondsByResolution() {
    return deliveredSecondsByResolution;
  }


  public void setDeliveredSecondsByResolution(DeliveryReportDeliveredSecondsByResolution deliveredSecondsByResolution) {
    this.deliveredSecondsByResolution = deliveredSecondsByResolution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryReport deliveryReport = (DeliveryReport) o;
    return Objects.equals(this.liveStreamId, deliveryReport.liveStreamId) &&
        Objects.equals(this.assetId, deliveryReport.assetId) &&
        Objects.equals(this.passthrough, deliveryReport.passthrough) &&
        Objects.equals(this.createdAt, deliveryReport.createdAt) &&
        Objects.equals(this.deletedAt, deliveryReport.deletedAt) &&
        Objects.equals(this.assetState, deliveryReport.assetState) &&
        Objects.equals(this.assetDuration, deliveryReport.assetDuration) &&
        Objects.equals(this.assetResolutionTier, deliveryReport.assetResolutionTier) &&
        Objects.equals(this.assetEncodingTier, deliveryReport.assetEncodingTier) &&
        Objects.equals(this.deliveredSeconds, deliveryReport.deliveredSeconds) &&
        Objects.equals(this.deliveredSecondsByResolution, deliveryReport.deliveredSecondsByResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveStreamId, assetId, passthrough, createdAt, deletedAt, assetState, assetDuration, assetResolutionTier, assetEncodingTier, deliveredSeconds, deliveredSecondsByResolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryReport {\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    passthrough: ").append(toIndentedString(passthrough)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    assetState: ").append(toIndentedString(assetState)).append("\n");
    sb.append("    assetDuration: ").append(toIndentedString(assetDuration)).append("\n");
    sb.append("    assetResolutionTier: ").append(toIndentedString(assetResolutionTier)).append("\n");
    sb.append("    assetEncodingTier: ").append(toIndentedString(assetEncodingTier)).append("\n");
    sb.append("    deliveredSeconds: ").append(toIndentedString(deliveredSeconds)).append("\n");
    sb.append("    deliveredSecondsByResolution: ").append(toIndentedString(deliveredSecondsByResolution)).append("\n");
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

