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
 * ListFiltersResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListFiltersResponseData {
  public static final String SERIALIZED_NAME_BASIC = "basic";
  @SerializedName(SERIALIZED_NAME_BASIC)
  private java.util.List<String> basic = null;

  public static final String SERIALIZED_NAME_ADVANCED = "advanced";
  @SerializedName(SERIALIZED_NAME_ADVANCED)
  private java.util.List<String> advanced = null;


  public ListFiltersResponseData basic(java.util.List<String> basic) {
    
    this.basic = basic;
    return this;
  }

  public ListFiltersResponseData addBasicItem(String basicItem) {
    if (this.basic == null) {
      this.basic = new java.util.ArrayList<>();
    }
    this.basic.add(basicItem);
    return this;
  }

   /**
   * Get basic
   * @return basic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<String> getBasic() {
    return basic;
  }


  public void setBasic(java.util.List<String> basic) {
    this.basic = basic;
  }


  public ListFiltersResponseData advanced(java.util.List<String> advanced) {
    
    this.advanced = advanced;
    return this;
  }

  public ListFiltersResponseData addAdvancedItem(String advancedItem) {
    if (this.advanced == null) {
      this.advanced = new java.util.ArrayList<>();
    }
    this.advanced.add(advancedItem);
    return this;
  }

   /**
   * Get advanced
   * @return advanced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<String> getAdvanced() {
    return advanced;
  }


  public void setAdvanced(java.util.List<String> advanced) {
    this.advanced = advanced;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFiltersResponseData listFiltersResponseData = (ListFiltersResponseData) o;
    return Objects.equals(this.basic, listFiltersResponseData.basic) &&
        Objects.equals(this.advanced, listFiltersResponseData.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basic, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFiltersResponseData {\n");
    sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
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

