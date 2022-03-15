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
import com.mux.sdk.models.IncidentBreakdown;
import com.mux.sdk.models.IncidentNotification;
import com.mux.sdk.models.IncidentNotificationRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Incident
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-15T16:07:59.745206-04:00[America/New_York]")
public class Incident {
  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Double threshold;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_SAMPLE_SIZE_UNIT = "sample_size_unit";
  @SerializedName(SERIALIZED_NAME_SAMPLE_SIZE_UNIT)
  private String sampleSizeUnit;

  public static final String SERIALIZED_NAME_SAMPLE_SIZE = "sample_size";
  @SerializedName(SERIALIZED_NAME_SAMPLE_SIZE)
  private Long sampleSize;

  public static final String SERIALIZED_NAME_RESOLVED_AT = "resolved_at";
  @SerializedName(SERIALIZED_NAME_RESOLVED_AT)
  private String resolvedAt;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private java.util.List<IncidentNotification> notifications = null;

  public static final String SERIALIZED_NAME_NOTIFICATION_RULES = "notification_rules";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_RULES)
  private java.util.List<IncidentNotificationRule> notificationRules = null;

  public static final String SERIALIZED_NAME_MEASUREMENT = "measurement";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT)
  private String measurement;

  public static final String SERIALIZED_NAME_MEASURED_VALUE_ON_CLOSE = "measured_value_on_close";
  @SerializedName(SERIALIZED_NAME_MEASURED_VALUE_ON_CLOSE)
  private Double measuredValueOnClose;

  public static final String SERIALIZED_NAME_MEASURED_VALUE = "measured_value";
  @SerializedName(SERIALIZED_NAME_MEASURED_VALUE)
  private Double measuredValue;

  public static final String SERIALIZED_NAME_INCIDENT_KEY = "incident_key";
  @SerializedName(SERIALIZED_NAME_INCIDENT_KEY)
  private String incidentKey;

  public static final String SERIALIZED_NAME_IMPACT = "impact";
  @SerializedName(SERIALIZED_NAME_IMPACT)
  private String impact;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ERROR_DESCRIPTION = "error_description";
  @SerializedName(SERIALIZED_NAME_ERROR_DESCRIPTION)
  private String errorDescription;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BREAKDOWNS = "breakdowns";
  @SerializedName(SERIALIZED_NAME_BREAKDOWNS)
  private java.util.List<IncidentBreakdown> breakdowns = null;

  public static final String SERIALIZED_NAME_AFFECTED_VIEWS_PER_HOUR_ON_OPEN = "affected_views_per_hour_on_open";
  @SerializedName(SERIALIZED_NAME_AFFECTED_VIEWS_PER_HOUR_ON_OPEN)
  private Long affectedViewsPerHourOnOpen;

  public static final String SERIALIZED_NAME_AFFECTED_VIEWS_PER_HOUR = "affected_views_per_hour";
  @SerializedName(SERIALIZED_NAME_AFFECTED_VIEWS_PER_HOUR)
  private Long affectedViewsPerHour;

  public static final String SERIALIZED_NAME_AFFECTED_VIEWS = "affected_views";
  @SerializedName(SERIALIZED_NAME_AFFECTED_VIEWS)
  private Long affectedViews;


  public Incident threshold(Double threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getThreshold() {
    return threshold;
  }


  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  public Incident status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Incident startedAt(String startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public Incident severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public Incident sampleSizeUnit(String sampleSizeUnit) {
    
    this.sampleSizeUnit = sampleSizeUnit;
    return this;
  }

   /**
   * Get sampleSizeUnit
   * @return sampleSizeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSampleSizeUnit() {
    return sampleSizeUnit;
  }


  public void setSampleSizeUnit(String sampleSizeUnit) {
    this.sampleSizeUnit = sampleSizeUnit;
  }


  public Incident sampleSize(Long sampleSize) {
    
    this.sampleSize = sampleSize;
    return this;
  }

   /**
   * Get sampleSize
   * @return sampleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSampleSize() {
    return sampleSize;
  }


  public void setSampleSize(Long sampleSize) {
    this.sampleSize = sampleSize;
  }


  public Incident resolvedAt(String resolvedAt) {
    
    this.resolvedAt = resolvedAt;
    return this;
  }

   /**
   * Get resolvedAt
   * @return resolvedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResolvedAt() {
    return resolvedAt;
  }


  public void setResolvedAt(String resolvedAt) {
    this.resolvedAt = resolvedAt;
  }


  public Incident notifications(java.util.List<IncidentNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public Incident addNotificationsItem(IncidentNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new java.util.ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<IncidentNotification> getNotifications() {
    return notifications;
  }


  public void setNotifications(java.util.List<IncidentNotification> notifications) {
    this.notifications = notifications;
  }


  public Incident notificationRules(java.util.List<IncidentNotificationRule> notificationRules) {
    
    this.notificationRules = notificationRules;
    return this;
  }

  public Incident addNotificationRulesItem(IncidentNotificationRule notificationRulesItem) {
    if (this.notificationRules == null) {
      this.notificationRules = new java.util.ArrayList<>();
    }
    this.notificationRules.add(notificationRulesItem);
    return this;
  }

   /**
   * Get notificationRules
   * @return notificationRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<IncidentNotificationRule> getNotificationRules() {
    return notificationRules;
  }


  public void setNotificationRules(java.util.List<IncidentNotificationRule> notificationRules) {
    this.notificationRules = notificationRules;
  }


  public Incident measurement(String measurement) {
    
    this.measurement = measurement;
    return this;
  }

   /**
   * Get measurement
   * @return measurement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMeasurement() {
    return measurement;
  }


  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }


  public Incident measuredValueOnClose(Double measuredValueOnClose) {
    
    this.measuredValueOnClose = measuredValueOnClose;
    return this;
  }

   /**
   * Get measuredValueOnClose
   * @return measuredValueOnClose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMeasuredValueOnClose() {
    return measuredValueOnClose;
  }


  public void setMeasuredValueOnClose(Double measuredValueOnClose) {
    this.measuredValueOnClose = measuredValueOnClose;
  }


  public Incident measuredValue(Double measuredValue) {
    
    this.measuredValue = measuredValue;
    return this;
  }

   /**
   * Get measuredValue
   * @return measuredValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMeasuredValue() {
    return measuredValue;
  }


  public void setMeasuredValue(Double measuredValue) {
    this.measuredValue = measuredValue;
  }


  public Incident incidentKey(String incidentKey) {
    
    this.incidentKey = incidentKey;
    return this;
  }

   /**
   * Get incidentKey
   * @return incidentKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncidentKey() {
    return incidentKey;
  }


  public void setIncidentKey(String incidentKey) {
    this.incidentKey = incidentKey;
  }


  public Incident impact(String impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImpact() {
    return impact;
  }


  public void setImpact(String impact) {
    this.impact = impact;
  }


  public Incident id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Incident errorDescription(String errorDescription) {
    
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Get errorDescription
   * @return errorDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorDescription() {
    return errorDescription;
  }


  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  public Incident description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Incident breakdowns(java.util.List<IncidentBreakdown> breakdowns) {
    
    this.breakdowns = breakdowns;
    return this;
  }

  public Incident addBreakdownsItem(IncidentBreakdown breakdownsItem) {
    if (this.breakdowns == null) {
      this.breakdowns = new java.util.ArrayList<>();
    }
    this.breakdowns.add(breakdownsItem);
    return this;
  }

   /**
   * Get breakdowns
   * @return breakdowns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.List<IncidentBreakdown> getBreakdowns() {
    return breakdowns;
  }


  public void setBreakdowns(java.util.List<IncidentBreakdown> breakdowns) {
    this.breakdowns = breakdowns;
  }


  public Incident affectedViewsPerHourOnOpen(Long affectedViewsPerHourOnOpen) {
    
    this.affectedViewsPerHourOnOpen = affectedViewsPerHourOnOpen;
    return this;
  }

   /**
   * Get affectedViewsPerHourOnOpen
   * @return affectedViewsPerHourOnOpen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAffectedViewsPerHourOnOpen() {
    return affectedViewsPerHourOnOpen;
  }


  public void setAffectedViewsPerHourOnOpen(Long affectedViewsPerHourOnOpen) {
    this.affectedViewsPerHourOnOpen = affectedViewsPerHourOnOpen;
  }


  public Incident affectedViewsPerHour(Long affectedViewsPerHour) {
    
    this.affectedViewsPerHour = affectedViewsPerHour;
    return this;
  }

   /**
   * Get affectedViewsPerHour
   * @return affectedViewsPerHour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAffectedViewsPerHour() {
    return affectedViewsPerHour;
  }


  public void setAffectedViewsPerHour(Long affectedViewsPerHour) {
    this.affectedViewsPerHour = affectedViewsPerHour;
  }


  public Incident affectedViews(Long affectedViews) {
    
    this.affectedViews = affectedViews;
    return this;
  }

   /**
   * Get affectedViews
   * @return affectedViews
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAffectedViews() {
    return affectedViews;
  }


  public void setAffectedViews(Long affectedViews) {
    this.affectedViews = affectedViews;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Incident incident = (Incident) o;
    return Objects.equals(this.threshold, incident.threshold) &&
        Objects.equals(this.status, incident.status) &&
        Objects.equals(this.startedAt, incident.startedAt) &&
        Objects.equals(this.severity, incident.severity) &&
        Objects.equals(this.sampleSizeUnit, incident.sampleSizeUnit) &&
        Objects.equals(this.sampleSize, incident.sampleSize) &&
        Objects.equals(this.resolvedAt, incident.resolvedAt) &&
        Objects.equals(this.notifications, incident.notifications) &&
        Objects.equals(this.notificationRules, incident.notificationRules) &&
        Objects.equals(this.measurement, incident.measurement) &&
        Objects.equals(this.measuredValueOnClose, incident.measuredValueOnClose) &&
        Objects.equals(this.measuredValue, incident.measuredValue) &&
        Objects.equals(this.incidentKey, incident.incidentKey) &&
        Objects.equals(this.impact, incident.impact) &&
        Objects.equals(this.id, incident.id) &&
        Objects.equals(this.errorDescription, incident.errorDescription) &&
        Objects.equals(this.description, incident.description) &&
        Objects.equals(this.breakdowns, incident.breakdowns) &&
        Objects.equals(this.affectedViewsPerHourOnOpen, incident.affectedViewsPerHourOnOpen) &&
        Objects.equals(this.affectedViewsPerHour, incident.affectedViewsPerHour) &&
        Objects.equals(this.affectedViews, incident.affectedViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, status, startedAt, severity, sampleSizeUnit, sampleSize, resolvedAt, notifications, notificationRules, measurement, measuredValueOnClose, measuredValue, incidentKey, impact, id, errorDescription, description, breakdowns, affectedViewsPerHourOnOpen, affectedViewsPerHour, affectedViews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Incident {\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    sampleSizeUnit: ").append(toIndentedString(sampleSizeUnit)).append("\n");
    sb.append("    sampleSize: ").append(toIndentedString(sampleSize)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    notificationRules: ").append(toIndentedString(notificationRules)).append("\n");
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
    sb.append("    measuredValueOnClose: ").append(toIndentedString(measuredValueOnClose)).append("\n");
    sb.append("    measuredValue: ").append(toIndentedString(measuredValue)).append("\n");
    sb.append("    incidentKey: ").append(toIndentedString(incidentKey)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    breakdowns: ").append(toIndentedString(breakdowns)).append("\n");
    sb.append("    affectedViewsPerHourOnOpen: ").append(toIndentedString(affectedViewsPerHourOnOpen)).append("\n");
    sb.append("    affectedViewsPerHour: ").append(toIndentedString(affectedViewsPerHour)).append("\n");
    sb.append("    affectedViews: ").append(toIndentedString(affectedViews)).append("\n");
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

