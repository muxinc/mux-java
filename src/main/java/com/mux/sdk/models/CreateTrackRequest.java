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
 * CreateTrackRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T13:02:50.965402-04:00[America/New_York]")
public class CreateTrackRequest {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
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
   * Gets or Sets textType
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


  public CreateTrackRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CreateTrackRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateTrackRequest textType(TextTypeEnum textType) {
    
    this.textType = textType;
    return this;
  }

   /**
   * Get textType
   * @return textType
  **/
  @ApiModelProperty(required = true, value = "")

  public TextTypeEnum getTextType() {
    return textType;
  }


  public void setTextType(TextTypeEnum textType) {
    this.textType = textType;
  }


  public CreateTrackRequest languageCode(String languageCode) {
    
    this.languageCode = languageCode;
    return this;
  }

   /**
   * The language code value must be a valid BCP 47 specification compliant value. For example, en for English or en-US for the US version of English.
   * @return languageCode
  **/
  @ApiModelProperty(required = true, value = "The language code value must be a valid BCP 47 specification compliant value. For example, en for English or en-US for the US version of English.")

  public String getLanguageCode() {
    return languageCode;
  }


  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  public CreateTrackRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the track containing a human-readable description. This value must be unique across all the text type and subtitles text type tracks. HLS manifest will associate subtitle text track with this value. For example, set the value to \&quot;English\&quot; for subtitles text track with language_code as en-US. If this parameter is not included, Mux will auto-populate based on the language_code value.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the track containing a human-readable description. This value must be unique across all the text type and subtitles text type tracks. HLS manifest will associate subtitle text track with this value. For example, set the value to \"English\" for subtitles text track with language_code as en-US. If this parameter is not included, Mux will auto-populate based on the language_code value.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateTrackRequest closedCaptions(Boolean closedCaptions) {
    
    this.closedCaptions = closedCaptions;
    return this;
  }

   /**
   * Indicates the track provides Subtitles for the Deaf or Hard-of-hearing (SDH).
   * @return closedCaptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the track provides Subtitles for the Deaf or Hard-of-hearing (SDH).")

  public Boolean getClosedCaptions() {
    return closedCaptions;
  }


  public void setClosedCaptions(Boolean closedCaptions) {
    this.closedCaptions = closedCaptions;
  }


  public CreateTrackRequest passthrough(String passthrough) {
    
    this.passthrough = passthrough;
    return this;
  }

   /**
   * Arbitrary user-supplied metadata set for the track either when creating the asset or track.
   * @return passthrough
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary user-supplied metadata set for the track either when creating the asset or track.")

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
    CreateTrackRequest createTrackRequest = (CreateTrackRequest) o;
    return Objects.equals(this.url, createTrackRequest.url) &&
        Objects.equals(this.type, createTrackRequest.type) &&
        Objects.equals(this.textType, createTrackRequest.textType) &&
        Objects.equals(this.languageCode, createTrackRequest.languageCode) &&
        Objects.equals(this.name, createTrackRequest.name) &&
        Objects.equals(this.closedCaptions, createTrackRequest.closedCaptions) &&
        Objects.equals(this.passthrough, createTrackRequest.passthrough);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, type, textType, languageCode, name, closedCaptions, passthrough);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTrackRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

