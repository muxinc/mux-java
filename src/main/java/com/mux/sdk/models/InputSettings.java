/*
 * Mux API
 * Mux is how developers build online video. This API encompasses both Mux Video and Mux Data functionality to help you build your video-related projects better and faster than ever before. 
 *
 * The version of the OpenAPI document: v1
 * 
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
import com.mux.sdk.models.InputSettingsOverlaySettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An array of objects that each describe an input file to be used to create the asset. As a shortcut, &#x60;input&#x60; can also be a string URL for a file when only one input file is used. See &#x60;input[].url&#x60; for requirements.
 */
@ApiModel(description = "An array of objects that each describe an input file to be used to create the asset. As a shortcut, `input` can also be a string URL for a file when only one input file is used. See `input[].url` for requirements.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-19T15:36:24.532302-04:00[America/New_York]")
public class InputSettings {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_OVERLAY_SETTINGS = "overlay_settings";
  @SerializedName(SERIALIZED_NAME_OVERLAY_SETTINGS)
  private InputSettingsOverlaySettings overlaySettings;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Double startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Double endTime;

  /**
   * This parameter is required for the &#x60;text&#x60; track type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VIDEO("video"),
    
    AUDIO("audio"),
    
    TEXT("text");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Type of text track. This parameter only supports subtitles value. For more information on Subtitles / Closed Captions, [see this blog post](https://mux.com/blog/subtitles-captions-webvtt-hls-and-those-magic-flags/). This parameter is required for &#x60;text&#x60; track type.
   */
  @JsonAdapter(TextTypeEnum.Adapter.class)
  public enum TextTypeEnum {
    SUBTITLES("subtitles");

    private String value;

    TextTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextTypeEnum fromValue(String value) {
      for (TextTypeEnum b : TextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TextTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TextTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TEXT_TYPE = "text_type";
  @SerializedName(SERIALIZED_NAME_TEXT_TYPE)
  private TextTypeEnum textType;

  public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";
  @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
  private String languageCode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CLOSED_CAPTIONS = "closed_captions";
  @SerializedName(SERIALIZED_NAME_CLOSED_CAPTIONS)
  private Boolean closedCaptions;

  public static final String SERIALIZED_NAME_PASSTHROUGH = "passthrough";
  @SerializedName(SERIALIZED_NAME_PASSTHROUGH)
  private String passthrough;


  public InputSettings url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The web address of the file that Mux should download and use. * For subtitles text tracks, the url is the location of subtitle/captions file. Mux supports [SubRip Text (SRT)](https://en.wikipedia.org/wiki/SubRip) and [Web Video Text Tracks](https://www.w3.org/TR/webvtt1/) format for ingesting Subtitles and Closed Captions. * For Watermarking or Overlay, the url is the location of the watermark image. * When creating clips from existing Mux assets, the url is defined with &#x60;mux://assets/{asset_id}&#x60; template where &#x60;asset_id&#x60; is the Asset Identifier for creating the clip from. 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The web address of the file that Mux should download and use. * For subtitles text tracks, the url is the location of subtitle/captions file. Mux supports [SubRip Text (SRT)](https://en.wikipedia.org/wiki/SubRip) and [Web Video Text Tracks](https://www.w3.org/TR/webvtt1/) format for ingesting Subtitles and Closed Captions. * For Watermarking or Overlay, the url is the location of the watermark image. * When creating clips from existing Mux assets, the url is defined with `mux://assets/{asset_id}` template where `asset_id` is the Asset Identifier for creating the clip from. ")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public InputSettings overlaySettings(InputSettingsOverlaySettings overlaySettings) {
    
    this.overlaySettings = overlaySettings;
    return this;
  }

   /**
   * Get overlaySettings
   * @return overlaySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InputSettingsOverlaySettings getOverlaySettings() {
    return overlaySettings;
  }


  public void setOverlaySettings(InputSettingsOverlaySettings overlaySettings) {
    this.overlaySettings = overlaySettings;
  }


  public InputSettings startTime(Double startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The time offset in seconds from the beginning of the video indicating the clip&#39;s starting marker. The default value is 0 when not included. This parameter is only applicable for creating clips when &#x60;input.url&#x60; has &#x60;mux://assets/{asset_id}&#x60; format.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time offset in seconds from the beginning of the video indicating the clip's starting marker. The default value is 0 when not included. This parameter is only applicable for creating clips when `input.url` has `mux://assets/{asset_id}` format.")

  public Double getStartTime() {
    return startTime;
  }


  public void setStartTime(Double startTime) {
    this.startTime = startTime;
  }


  public InputSettings endTime(Double endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * The time offset in seconds from the beginning of the video, indicating the clip&#39;s ending marker. The default value is the duration of the video when not included. This parameter is only applicable for creating clips when &#x60;input.url&#x60; has &#x60;mux://assets/{asset_id}&#x60; format.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time offset in seconds from the beginning of the video, indicating the clip's ending marker. The default value is the duration of the video when not included. This parameter is only applicable for creating clips when `input.url` has `mux://assets/{asset_id}` format.")

  public Double getEndTime() {
    return endTime;
  }


  public void setEndTime(Double endTime) {
    this.endTime = endTime;
  }


  public InputSettings type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * This parameter is required for the &#x60;text&#x60; track type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This parameter is required for the `text` track type.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InputSettings textType(TextTypeEnum textType) {
    
    this.textType = textType;
    return this;
  }

   /**
   * Type of text track. This parameter only supports subtitles value. For more information on Subtitles / Closed Captions, [see this blog post](https://mux.com/blog/subtitles-captions-webvtt-hls-and-those-magic-flags/). This parameter is required for &#x60;text&#x60; track type.
   * @return textType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of text track. This parameter only supports subtitles value. For more information on Subtitles / Closed Captions, [see this blog post](https://mux.com/blog/subtitles-captions-webvtt-hls-and-those-magic-flags/). This parameter is required for `text` track type.")

  public TextTypeEnum getTextType() {
    return textType;
  }


  public void setTextType(TextTypeEnum textType) {
    this.textType = textType;
  }


  public InputSettings languageCode(String languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * The language code value must be a valid [BCP 47](https://tools.ietf.org/html/bcp47) specification compliant value. For example, en for English or en-US for the US version of English. This parameter is required for text type and subtitles text type track.
   * @return languageCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language code value must be a valid [BCP 47](https://tools.ietf.org/html/bcp47) specification compliant value. For example, en for English or en-US for the US version of English. This parameter is required for text type and subtitles text type track.")

  public String getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public InputSettings name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the track containing a human-readable description. This value must be unique across all text type and subtitles &#x60;text&#x60; type tracks. The hls manifest will associate a subtitle text track with this value. For example, the value should be \&quot;English\&quot; for subtitles text track with language_code as en. This optional parameter should be used only for &#x60;text&#x60; type and subtitles &#x60;text&#x60; type track. If this parameter is not included, Mux will auto-populate based on the &#x60;input[].language_code&#x60; value.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the track containing a human-readable description. This value must be unique across all text type and subtitles `text` type tracks. The hls manifest will associate a subtitle text track with this value. For example, the value should be \"English\" for subtitles text track with language_code as en. This optional parameter should be used only for `text` type and subtitles `text` type track. If this parameter is not included, Mux will auto-populate based on the `input[].language_code` value.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InputSettings closedCaptions(Boolean closedCaptions) {
    
    this.closedCaptions = closedCaptions;
    return this;
  }

   /**
   * Indicates the track provides Subtitles for the Deaf or Hard-of-hearing (SDH). This optional parameter should be used for &#x60;text&#x60; type and subtitles &#x60;text&#x60; type tracks.
   * @return closedCaptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the track provides Subtitles for the Deaf or Hard-of-hearing (SDH). This optional parameter should be used for `text` type and subtitles `text` type tracks.")

  public Boolean getClosedCaptions() {
    return closedCaptions;
  }


  public void setClosedCaptions(Boolean closedCaptions) {
    this.closedCaptions = closedCaptions;
  }


  public InputSettings passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * This optional parameter should be used for &#x60;text&#x60; type and subtitles &#x60;text&#x60; type tracks.
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This optional parameter should be used for `text` type and subtitles `text` type tracks.")

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
    InputSettings inputSettings = (InputSettings) o;
    return Objects.equals(this.url, inputSettings.url) &&
        Objects.equals(this.overlaySettings, inputSettings.overlaySettings) &&
        Objects.equals(this.startTime, inputSettings.startTime) &&
        Objects.equals(this.endTime, inputSettings.endTime) &&
        Objects.equals(this.type, inputSettings.type) &&
        Objects.equals(this.textType, inputSettings.textType) &&
        Objects.equals(this.languageCode, inputSettings.languageCode) &&
        Objects.equals(this.name, inputSettings.name) &&
        Objects.equals(this.closedCaptions, inputSettings.closedCaptions) &&
        Objects.equals(this.passthrough, inputSettings.passthrough);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, overlaySettings, startTime, endTime, type, textType, languageCode, name, closedCaptions, passthrough);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputSettings {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    overlaySettings: ").append(toIndentedString(overlaySettings)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    closedCaptions: ").append(toIndentedString(closedCaptions)).append("\n");
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

