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
 * Error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-06T13:02:50.965402-04:00[America/New_York]")
public class Error {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Double percentage;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_LAST_SEEN = "last_seen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private String lastSeen;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code;


  public Error id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for this error.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for this error.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Error percentage(Double percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of views that experienced this error.
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The percentage of views that experienced this error.")

  public Double getPercentage() {
    return percentage;
  }


  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }


  public Error notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Notes that are attached to this error.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Notes that are attached to this error.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public Error message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * The error message.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Error lastSeen(String lastSeen) {
    
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * The last time this error was seen (ISO 8601 timestamp).
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last time this error was seen (ISO 8601 timestamp).")

  public String getLastSeen() {
    return lastSeen;
  }


  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }


  public Error description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the error.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the error.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Error count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * The total number of views that experiend this error.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of views that experiend this error.")

  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public Error code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * The error code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error code")

  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.id, error.id) &&
        Objects.equals(this.percentage, error.percentage) &&
        Objects.equals(this.notes, error.notes) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.lastSeen, error.lastSeen) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.count, error.count) &&
        Objects.equals(this.code, error.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, percentage, notes, message, lastSeen, description, count, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

