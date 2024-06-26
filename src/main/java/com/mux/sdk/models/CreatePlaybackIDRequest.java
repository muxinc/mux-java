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
import com.mux.sdk.models.PlaybackPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreatePlaybackIDRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePlaybackIDRequest {
  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private PlaybackPolicy policy;

  public static final String SERIALIZED_NAME_DRM_CONFIGURATION_ID = "drm_configuration_id";
  @SerializedName(SERIALIZED_NAME_DRM_CONFIGURATION_ID)
  private String drmConfigurationId;


  public CreatePlaybackIDRequest policy(PlaybackPolicy policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaybackPolicy getPolicy() {
    return policy;
  }


  public void setPolicy(PlaybackPolicy policy) {
    this.policy = policy;
  }


  public CreatePlaybackIDRequest drmConfigurationId(String drmConfigurationId) {
    
    this.drmConfigurationId = drmConfigurationId;
    return this;
  }

   /**
   * The DRM configuration used by this playback ID. Must only be set when &#x60;policy&#x60; is set to &#x60;drm&#x60;.
   * @return drmConfigurationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DRM configuration used by this playback ID. Must only be set when `policy` is set to `drm`.")

  public String getDrmConfigurationId() {
    return drmConfigurationId;
  }


  public void setDrmConfigurationId(String drmConfigurationId) {
    this.drmConfigurationId = drmConfigurationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlaybackIDRequest createPlaybackIDRequest = (CreatePlaybackIDRequest) o;
    return Objects.equals(this.policy, createPlaybackIDRequest.policy) &&
        Objects.equals(this.drmConfigurationId, createPlaybackIDRequest.drmConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, drmConfigurationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePlaybackIDRequest {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    drmConfigurationId: ").append(toIndentedString(drmConfigurationId)).append("\n");
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

