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
 * UpdateAssetMasterAccessRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T16:07:59.745206-04:00[America/New_York]")
public class UpdateAssetMasterAccessRequest {
  /**
   * Add or remove access to the master version of the video.
   */
  @JsonAdapter(MasterAccessEnum.Adapter.class)
  public enum MasterAccessEnum {
    TEMPORARY("temporary"),
    
    NONE("none");

    private String value;

    MasterAccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MasterAccessEnum fromValue(String value) {
      for (MasterAccessEnum b : MasterAccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MasterAccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MasterAccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MasterAccessEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MasterAccessEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MASTER_ACCESS = "master_access";
  @SerializedName(SERIALIZED_NAME_MASTER_ACCESS)
  private MasterAccessEnum masterAccess;


  public UpdateAssetMasterAccessRequest masterAccess(MasterAccessEnum masterAccess) {
    
    this.masterAccess = masterAccess;
    return this;
  }

   /**
   * Add or remove access to the master version of the video.
   * @return masterAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add or remove access to the master version of the video.")

  public MasterAccessEnum getMasterAccess() {
    return masterAccess;
  }


  public void setMasterAccess(MasterAccessEnum masterAccess) {
    this.masterAccess = masterAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAssetMasterAccessRequest updateAssetMasterAccessRequest = (UpdateAssetMasterAccessRequest) o;
    return Objects.equals(this.masterAccess, updateAssetMasterAccessRequest.masterAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetMasterAccessRequest {\n");
    sb.append("    masterAccess: ").append(toIndentedString(masterAccess)).append("\n");
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

