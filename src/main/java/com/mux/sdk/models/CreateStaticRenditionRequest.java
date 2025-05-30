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
 * CreateStaticRenditionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateStaticRenditionRequest {
  /**
   * Gets or Sets resolution
   */
  @JsonAdapter(ResolutionEnum.Adapter.class)
  public enum ResolutionEnum {
    HIGHEST("highest"),
    
    AUDIO_ONLY("audio-only"),
    
    _2160P("2160p"),
    
    _1440P("1440p"),
    
    _1080P("1080p"),
    
    _720P("720p"),
    
    _540P("540p"),
    
    _480P("480p"),
    
    _360P("360p"),
    
    _270P("270p");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResolutionEnum fromValue(String value) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResolutionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResolutionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResolutionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResolutionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESOLUTION = "resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private ResolutionEnum resolution;

  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;


  public CreateStaticRenditionRequest resolution(ResolutionEnum resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResolutionEnum getResolution() {
    return resolution;
  }


  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }


  public CreateStaticRenditionRequest passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * Arbitrary user-supplied metadata set for the static rendition. Max 255 characters.
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary user-supplied metadata set for the static rendition. Max 255 characters.")

  public String getPassthrough() {
    return passthrough;
  }


  public void setPassthrough(String passthrough) {
    this.passthrough = passthrough;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStaticRenditionRequest createStaticRenditionRequest = (CreateStaticRenditionRequest) o;
    return Objects.equals(this.resolution, createStaticRenditionRequest.resolution) &&
        Objects.equals(this.passthrough, createStaticRenditionRequest.passthrough);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution, passthrough);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStaticRenditionRequest {\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    passthrough: ").append(toIndentedString(passthrough)).append("\n");
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

