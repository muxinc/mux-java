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
 * AssetStaticRenditionsFiles
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T13:02:50.965402-04:00[America/New_York]")
public class AssetStaticRenditionsFiles {
  /**
   * Gets or Sets name
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    LOW_MP4("low.mp4"),
    
    MEDIUM_MP4("medium.mp4"),
    
    HIGH_MP4("high.mp4"),
    
    AUDIO_M4A("audio.m4a");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  /**
   * Extension of the static rendition file
   */
  @JsonAdapter(ExtEnum.Adapter.class)
  public enum ExtEnum {
    MP4("mp4"),
    
    M4A("m4a");

    private String value;

    ExtEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExtEnum fromValue(String value) {
      for (ExtEnum b : ExtEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExtEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExtEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExtEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExtEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXT = "ext";
  @SerializedName(SERIALIZED_NAME_EXT)
  private ExtEnum ext;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_BITRATE = "bitrate";
  @SerializedName(SERIALIZED_NAME_BITRATE)
  private Long bitrate;

  public static final String SERIALIZED_NAME_FILESIZE = "filesize";
  @SerializedName(SERIALIZED_NAME_FILESIZE)
  private String filesize;


  public AssetStaticRenditionsFiles name(NameEnum name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameEnum getName() {
    return name;
  }


  public void setName(NameEnum name) {
    this.name = name;
  }


  public AssetStaticRenditionsFiles ext(ExtEnum ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Extension of the static rendition file
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extension of the static rendition file")

  public ExtEnum getExt() {
    return ext;
  }


  public void setExt(ExtEnum ext) {
    this.ext = ext;
  }


  public AssetStaticRenditionsFiles height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height of the static rendition&#39;s file in pixels
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height of the static rendition's file in pixels")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public AssetStaticRenditionsFiles width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * The width of the static rendition&#39;s file in pixels
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width of the static rendition's file in pixels")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public AssetStaticRenditionsFiles bitrate(Long bitrate) {
    
    this.bitrate = bitrate;
    return this;
  }

   /**
   * The bitrate in bits per second
   * @return bitrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bitrate in bits per second")

  public Long getBitrate() {
    return bitrate;
  }


  public void setBitrate(Long bitrate) {
    this.bitrate = bitrate;
  }


  public AssetStaticRenditionsFiles filesize(String filesize) {
    
    this.filesize = filesize;
    return this;
  }

   /**
   * The file size in bytes
   * @return filesize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file size in bytes")

  public String getFilesize() {
    return filesize;
  }


  public void setFilesize(String filesize) {
    this.filesize = filesize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetStaticRenditionsFiles assetStaticRenditionsFiles = (AssetStaticRenditionsFiles) o;
    return Objects.equals(this.name, assetStaticRenditionsFiles.name) &&
        Objects.equals(this.ext, assetStaticRenditionsFiles.ext) &&
        Objects.equals(this.height, assetStaticRenditionsFiles.height) &&
        Objects.equals(this.width, assetStaticRenditionsFiles.width) &&
        Objects.equals(this.bitrate, assetStaticRenditionsFiles.bitrate) &&
        Objects.equals(this.filesize, assetStaticRenditionsFiles.filesize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ext, height, width, bitrate, filesize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetStaticRenditionsFiles {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
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

