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
import com.mux.sdk.models.ReferrerDomainRestriction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PlaybackRestriction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T13:02:50.965402-04:00[America/New_York]")
public class PlaybackRestriction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_REFERRER = "referrer";
  @SerializedName(SERIALIZED_NAME_REFERRER)
  private ReferrerDomainRestriction referrer;


  public PlaybackRestriction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Playback Restriction. Max 255 characters.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for the Playback Restriction. Max 255 characters.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PlaybackRestriction createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time the Playback Restriction was created, defined as a Unix timestamp (seconds since epoch).
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the Playback Restriction was created, defined as a Unix timestamp (seconds since epoch).")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PlaybackRestriction updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time the Playback Restriction was last updated, defined as a Unix timestamp (seconds since epoch).
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time the Playback Restriction was last updated, defined as a Unix timestamp (seconds since epoch).")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public PlaybackRestriction referrer(ReferrerDomainRestriction referrer) {
    
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReferrerDomainRestriction getReferrer() {
    return referrer;
  }


  public void setReferrer(ReferrerDomainRestriction referrer) {
    this.referrer = referrer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackRestriction playbackRestriction = (PlaybackRestriction) o;
    return Objects.equals(this.id, playbackRestriction.id) &&
        Objects.equals(this.createdAt, playbackRestriction.createdAt) &&
        Objects.equals(this.updatedAt, playbackRestriction.updatedAt) &&
        Objects.equals(this.referrer, playbackRestriction.referrer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, referrer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackRestriction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
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

