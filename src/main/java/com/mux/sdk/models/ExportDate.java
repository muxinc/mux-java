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
import com.mux.sdk.models.ExportFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * ExportDate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportDate {
  public static final String SERIALIZED_NAME_EXPORT_DATE = "export_date";
  @SerializedName(SERIALIZED_NAME_EXPORT_DATE)
  private LocalDate exportDate;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private java.util.List<ExportFile> files = null;


  public ExportDate exportDate(LocalDate exportDate) {
    
    this.exportDate = exportDate;
    return this;
  }

   /**
   * Get exportDate
   * @return exportDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getExportDate() {
    return exportDate;
  }


  public void setExportDate(LocalDate exportDate) {
    this.exportDate = exportDate;
  }


  public ExportDate files(java.util.List<ExportFile> files) {
    
    this.files = files;
    return this;
  }

  public ExportDate addFilesItem(ExportFile filesItem) {
    if (this.files == null) {
      this.files = new java.util.ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<ExportFile> getFiles() {
    return files;
  }


  public void setFiles(java.util.List<ExportFile> files) {
    this.files = files;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportDate exportDate = (ExportDate) o;
    return Objects.equals(this.exportDate, exportDate.exportDate) &&
        Objects.equals(this.files, exportDate.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportDate, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportDate {\n");
    sb.append("    exportDate: ").append(toIndentedString(exportDate)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

