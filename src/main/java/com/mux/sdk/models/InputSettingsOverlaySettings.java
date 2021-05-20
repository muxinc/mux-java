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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object that describes how the image file referenced in url should be placed over the video (i.e. watermarking).
 */
@ApiModel(description = "An object that describes how the image file referenced in url should be placed over the video (i.e. watermarking).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-19T15:36:24.532302-04:00[America/New_York]")
public class InputSettingsOverlaySettings {
  /**
   * Where the vertical positioning of the overlay/watermark should begin from. Defaults to &#x60;\&quot;top\&quot;&#x60;
   */
  @JsonAdapter(VerticalAlignEnum.Adapter.class)
  public enum VerticalAlignEnum {
    TOP("top"),
    
    MIDDLE("middle"),
    
    BOTTOM("bottom");

    private String value;

    VerticalAlignEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerticalAlignEnum fromValue(String value) {
      for (VerticalAlignEnum b : VerticalAlignEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerticalAlignEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerticalAlignEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerticalAlignEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerticalAlignEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERTICAL_ALIGN = "vertical_align";
  @SerializedName(SERIALIZED_NAME_VERTICAL_ALIGN)
  private VerticalAlignEnum verticalAlign;

  public static final String SERIALIZED_NAME_VERTICAL_MARGIN = "vertical_margin";
  @SerializedName(SERIALIZED_NAME_VERTICAL_MARGIN)
  private String verticalMargin;

  /**
   * Where the horizontal positioning of the overlay/watermark should begin from.
   */
  @JsonAdapter(HorizontalAlignEnum.Adapter.class)
  public enum HorizontalAlignEnum {
    LEFT("left"),
    
    CENTER("center"),
    
    RIGHT("right");

    private String value;

    HorizontalAlignEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HorizontalAlignEnum fromValue(String value) {
      for (HorizontalAlignEnum b : HorizontalAlignEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HorizontalAlignEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HorizontalAlignEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HorizontalAlignEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HorizontalAlignEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HORIZONTAL_ALIGN = "horizontal_align";
  @SerializedName(SERIALIZED_NAME_HORIZONTAL_ALIGN)
  private HorizontalAlignEnum horizontalAlign;

  public static final String SERIALIZED_NAME_HORIZONTAL_MARGIN = "horizontal_margin";
  @SerializedName(SERIALIZED_NAME_HORIZONTAL_MARGIN)
  private String horizontalMargin;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private String width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_OPACITY = "opacity";
  @SerializedName(SERIALIZED_NAME_OPACITY)
  private String opacity;


  public InputSettingsOverlaySettings verticalAlign(VerticalAlignEnum verticalAlign) {
    
    this.verticalAlign = verticalAlign;
    return this;
  }

   /**
   * Where the vertical positioning of the overlay/watermark should begin from. Defaults to &#x60;\&quot;top\&quot;&#x60;
   * @return verticalAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Where the vertical positioning of the overlay/watermark should begin from. Defaults to `\"top\"`")

  public VerticalAlignEnum getVerticalAlign() {
    return verticalAlign;
  }


  public void setVerticalAlign(VerticalAlignEnum verticalAlign) {
    this.verticalAlign = verticalAlign;
  }


  public InputSettingsOverlaySettings verticalMargin(String verticalMargin) {
    
    this.verticalMargin = verticalMargin;
    return this;
  }

   /**
   * The distance from the vertical_align starting point and the image&#39;s closest edge. Can be expressed as a percent (\&quot;10%\&quot;) or as a pixel value (\&quot;100px\&quot;). Negative values will move the overlay offscreen. In the case of &#39;middle&#39;, a positive value will shift the overlay towards the bottom and and a negative value will shift it towards the top.
   * @return verticalMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The distance from the vertical_align starting point and the image's closest edge. Can be expressed as a percent (\"10%\") or as a pixel value (\"100px\"). Negative values will move the overlay offscreen. In the case of 'middle', a positive value will shift the overlay towards the bottom and and a negative value will shift it towards the top.")

  public String getVerticalMargin() {
    return verticalMargin;
  }


  public void setVerticalMargin(String verticalMargin) {
    this.verticalMargin = verticalMargin;
  }


  public InputSettingsOverlaySettings horizontalAlign(HorizontalAlignEnum horizontalAlign) {
    
    this.horizontalAlign = horizontalAlign;
    return this;
  }

   /**
   * Where the horizontal positioning of the overlay/watermark should begin from.
   * @return horizontalAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Where the horizontal positioning of the overlay/watermark should begin from.")

  public HorizontalAlignEnum getHorizontalAlign() {
    return horizontalAlign;
  }


  public void setHorizontalAlign(HorizontalAlignEnum horizontalAlign) {
    this.horizontalAlign = horizontalAlign;
  }


  public InputSettingsOverlaySettings horizontalMargin(String horizontalMargin) {
    
    this.horizontalMargin = horizontalMargin;
    return this;
  }

   /**
   * The distance from the horizontal_align starting point and the image&#39;s closest edge. Can be expressed as a percent (\&quot;10%\&quot;) or as a pixel value (\&quot;100px\&quot;). Negative values will move the overlay offscreen. In the case of &#39;center&#39;, a positive value will shift the image towards the right and and a negative value will shift it towards the left.
   * @return horizontalMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The distance from the horizontal_align starting point and the image's closest edge. Can be expressed as a percent (\"10%\") or as a pixel value (\"100px\"). Negative values will move the overlay offscreen. In the case of 'center', a positive value will shift the image towards the right and and a negative value will shift it towards the left.")

  public String getHorizontalMargin() {
    return horizontalMargin;
  }


  public void setHorizontalMargin(String horizontalMargin) {
    this.horizontalMargin = horizontalMargin;
  }


  public InputSettingsOverlaySettings width(String width) {
    
    this.width = width;
    return this;
  }

   /**
   * How wide the overlay should appear. Can be expressed as a percent (\&quot;10%\&quot;) or as a pixel value (\&quot;100px\&quot;). If both width and height are left blank the width will be the true pixels of the image, applied as if the video has been scaled to fit a 1920x1080 frame. If height is supplied with no width, the width will scale proportionally to the height.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How wide the overlay should appear. Can be expressed as a percent (\"10%\") or as a pixel value (\"100px\"). If both width and height are left blank the width will be the true pixels of the image, applied as if the video has been scaled to fit a 1920x1080 frame. If height is supplied with no width, the width will scale proportionally to the height.")

  public String getWidth() {
    return width;
  }


  public void setWidth(String width) {
    this.width = width;
  }


  public InputSettingsOverlaySettings height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * How tall the overlay should appear. Can be expressed as a percent (\&quot;10%\&quot;) or as a pixel value (\&quot;100px\&quot;). If both width and height are left blank the height will be the true pixels of the image, applied as if the video has been scaled to fit a 1920x1080 frame. If width is supplied with no height, the height will scale proportionally to the width.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How tall the overlay should appear. Can be expressed as a percent (\"10%\") or as a pixel value (\"100px\"). If both width and height are left blank the height will be the true pixels of the image, applied as if the video has been scaled to fit a 1920x1080 frame. If width is supplied with no height, the height will scale proportionally to the width.")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public InputSettingsOverlaySettings opacity(String opacity) {
    
    this.opacity = opacity;
    return this;
  }

   /**
   * How opaque the overlay should appear, expressed as a percent. (Default 100%)
   * @return opacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How opaque the overlay should appear, expressed as a percent. (Default 100%)")

  public String getOpacity() {
    return opacity;
  }


  public void setOpacity(String opacity) {
    this.opacity = opacity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputSettingsOverlaySettings inputSettingsOverlaySettings = (InputSettingsOverlaySettings) o;
    return Objects.equals(this.verticalAlign, inputSettingsOverlaySettings.verticalAlign) &&
        Objects.equals(this.verticalMargin, inputSettingsOverlaySettings.verticalMargin) &&
        Objects.equals(this.horizontalAlign, inputSettingsOverlaySettings.horizontalAlign) &&
        Objects.equals(this.horizontalMargin, inputSettingsOverlaySettings.horizontalMargin) &&
        Objects.equals(this.width, inputSettingsOverlaySettings.width) &&
        Objects.equals(this.height, inputSettingsOverlaySettings.height) &&
        Objects.equals(this.opacity, inputSettingsOverlaySettings.opacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verticalAlign, verticalMargin, horizontalAlign, horizontalMargin, width, height, opacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputSettingsOverlaySettings {\n");
    sb.append("    verticalAlign: ").append(toIndentedString(verticalAlign)).append("\n");
    sb.append("    verticalMargin: ").append(toIndentedString(verticalMargin)).append("\n");
    sb.append("    horizontalAlign: ").append(toIndentedString(horizontalAlign)).append("\n");
    sb.append("    horizontalMargin: ").append(toIndentedString(horizontalMargin)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
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

