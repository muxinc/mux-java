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
 * UpdateAssetMP4SupportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateAssetMP4SupportRequest {
  /**
   * String value for the level of mp4 support
   */
  @JsonAdapter(Mp4SupportEnum.Adapter.class)
  public enum Mp4SupportEnum {
    STANDARD("standard"),
    
    NONE("none");

    private String value;

    Mp4SupportEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static Mp4SupportEnum fromValue(String value) {
      for (Mp4SupportEnum b : Mp4SupportEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<Mp4SupportEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final Mp4SupportEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public Mp4SupportEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return Mp4SupportEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MP4_SUPPORT = "mp4_support";
  @SerializedName(SERIALIZED_NAME_MP4_SUPPORT)
  private Mp4SupportEnum mp4Support;


  public UpdateAssetMP4SupportRequest mp4Support(Mp4SupportEnum mp4Support) {
    
    this.mp4Support = mp4Support;
    return this;
  }

   /**
   * String value for the level of mp4 support
   * @return mp4Support
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String value for the level of mp4 support")

  public Mp4SupportEnum getMp4Support() {
    return mp4Support;
  }


  public void setMp4Support(Mp4SupportEnum mp4Support) {
    this.mp4Support = mp4Support;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAssetMP4SupportRequest updateAssetMP4SupportRequest = (UpdateAssetMP4SupportRequest) o;
    return Objects.equals(this.mp4Support, updateAssetMP4SupportRequest.mp4Support);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mp4Support);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetMP4SupportRequest {\n");
    sb.append("    mp4Support: ").append(toIndentedString(mp4Support)).append("\n");
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

