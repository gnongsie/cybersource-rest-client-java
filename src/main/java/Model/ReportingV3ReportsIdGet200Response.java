/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.Reportingv3reportsReportPreferences;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Report Log
 */
@ApiModel(description = "Report Log")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-16T17:43:55.224+05:30")
public class ReportingV3ReportsIdGet200Response {
  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("reportId")
  private String reportId = null;

  @SerializedName("reportDefinitionId")
  private String reportDefinitionId = null;

  @SerializedName("reportName")
  private String reportName = null;

  @SerializedName("reportMimeType")
  private String reportMimeType = null;

  @SerializedName("reportFrequency")
  private String reportFrequency = null;

  @SerializedName("reportFields")
  private List<String> reportFields = null;

  @SerializedName("reportStatus")
  private String reportStatus = null;

  @SerializedName("reportStartTime")
  private DateTime reportStartTime = null;

  @SerializedName("reportEndTime")
  private DateTime reportEndTime = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("reportFilters")
  private Map<String, List<String>> reportFilters = null;

  @SerializedName("reportPreferences")
  private Reportingv3reportsReportPreferences reportPreferences = null;

  @SerializedName("groupId")
  private String groupId = null;

  public ReportingV3ReportsIdGet200Response organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * CyberSource merchant id
   * @return organizationId
  **/
  @ApiModelProperty(example = "myMerchantId", value = "CyberSource merchant id")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ReportingV3ReportsIdGet200Response reportId(String reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Report ID Value
   * @return reportId
  **/
  @ApiModelProperty(example = "6da01922-bb8e-a1fb-e053-7cb8d30ade29", value = "Report ID Value")
  public String getReportId() {
    return reportId;
  }

  public void setReportId(String reportId) {
    this.reportId = reportId;
  }

  public ReportingV3ReportsIdGet200Response reportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

   /**
   * Report definition Id
   * @return reportDefinitionId
  **/
  @ApiModelProperty(example = "210", value = "Report definition Id")
  public String getReportDefinitionId() {
    return reportDefinitionId;
  }

  public void setReportDefinitionId(String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
  }

  public ReportingV3ReportsIdGet200Response reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Report Name
   * @return reportName
  **/
  @ApiModelProperty(example = "My Transaction Request report", value = "Report Name")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ReportingV3ReportsIdGet200Response reportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
    return this;
  }

   /**
   * Report Format  Valid values: - application/xml - text/csv 
   * @return reportMimeType
  **/
  @ApiModelProperty(example = "application/xml", value = "Report Format  Valid values: - application/xml - text/csv ")
  public String getReportMimeType() {
    return reportMimeType;
  }

  public void setReportMimeType(String reportMimeType) {
    this.reportMimeType = reportMimeType;
  }

  public ReportingV3ReportsIdGet200Response reportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
    return this;
  }

   /**
   * Report Frequency Value  Valid values: - DAILY - WEEKLY - MONTHLY - ADHOC 
   * @return reportFrequency
  **/
  @ApiModelProperty(example = "DAILY", value = "Report Frequency Value  Valid values: - DAILY - WEEKLY - MONTHLY - ADHOC ")
  public String getReportFrequency() {
    return reportFrequency;
  }

  public void setReportFrequency(String reportFrequency) {
    this.reportFrequency = reportFrequency;
  }

  public ReportingV3ReportsIdGet200Response reportFields(List<String> reportFields) {
    this.reportFields = reportFields;
    return this;
  }

  public ReportingV3ReportsIdGet200Response addReportFieldsItem(String reportFieldsItem) {
    if (this.reportFields == null) {
      this.reportFields = new ArrayList<String>();
    }
    this.reportFields.add(reportFieldsItem);
    return this;
  }

   /**
   * List of Integer Values
   * @return reportFields
  **/
  @ApiModelProperty(example = "[\"Request.RequestID\",\"Request.TransactionDate\",\"Request.MerchantID\"]", value = "List of Integer Values")
  public List<String> getReportFields() {
    return reportFields;
  }

  public void setReportFields(List<String> reportFields) {
    this.reportFields = reportFields;
  }

  public ReportingV3ReportsIdGet200Response reportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
    return this;
  }

   /**
   * Report Status Value  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA - RERUN 
   * @return reportStatus
  **/
  @ApiModelProperty(value = "Report Status Value  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA - RERUN ")
  public String getReportStatus() {
    return reportStatus;
  }

  public void setReportStatus(String reportStatus) {
    this.reportStatus = reportStatus;
  }

  public ReportingV3ReportsIdGet200Response reportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
    return this;
  }

   /**
   * Report Start Time Value
   * @return reportStartTime
  **/
  @ApiModelProperty(example = "2017-10-01T10:10:10+05:00", value = "Report Start Time Value")
  public DateTime getReportStartTime() {
    return reportStartTime;
  }

  public void setReportStartTime(DateTime reportStartTime) {
    this.reportStartTime = reportStartTime;
  }

  public ReportingV3ReportsIdGet200Response reportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
    return this;
  }

   /**
   * Report End Time Value
   * @return reportEndTime
  **/
  @ApiModelProperty(example = "2017-10-02T10:10:10+05:00", value = "Report End Time Value")
  public DateTime getReportEndTime() {
    return reportEndTime;
  }

  public void setReportEndTime(DateTime reportEndTime) {
    this.reportEndTime = reportEndTime;
  }

  public ReportingV3ReportsIdGet200Response timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Time Zone Value
   * @return timezone
  **/
  @ApiModelProperty(example = "America/Chicago", value = "Time Zone Value")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public ReportingV3ReportsIdGet200Response reportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
    return this;
  }

  public ReportingV3ReportsIdGet200Response putReportFiltersItem(String key, List<String> reportFiltersItem) {
    if (this.reportFilters == null) {
      this.reportFilters = new HashMap<String, List<String>>();
    }
    this.reportFilters.put(key, reportFiltersItem);
    return this;
  }

   /**
   * List of filters to apply
   * @return reportFilters
  **/
  @ApiModelProperty(example = "{\"Application.Name\":[\"ics_auth\",\"ics_bill\"]}", value = "List of filters to apply")
  public Map<String, List<String>> getReportFilters() {
    return reportFilters;
  }

  public void setReportFilters(Map<String, List<String>> reportFilters) {
    this.reportFilters = reportFilters;
  }

  public ReportingV3ReportsIdGet200Response reportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
    return this;
  }

   /**
   * Get reportPreferences
   * @return reportPreferences
  **/
  @ApiModelProperty(value = "")
  public Reportingv3reportsReportPreferences getReportPreferences() {
    return reportPreferences;
  }

  public void setReportPreferences(Reportingv3reportsReportPreferences reportPreferences) {
    this.reportPreferences = reportPreferences;
  }

  public ReportingV3ReportsIdGet200Response groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Id for selected group.
   * @return groupId
  **/
  @ApiModelProperty(example = "12345", value = "Id for selected group.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingV3ReportsIdGet200Response reportingV3ReportsIdGet200Response = (ReportingV3ReportsIdGet200Response) o;
    return Objects.equals(this.organizationId, reportingV3ReportsIdGet200Response.organizationId) &&
        Objects.equals(this.reportId, reportingV3ReportsIdGet200Response.reportId) &&
        Objects.equals(this.reportDefinitionId, reportingV3ReportsIdGet200Response.reportDefinitionId) &&
        Objects.equals(this.reportName, reportingV3ReportsIdGet200Response.reportName) &&
        Objects.equals(this.reportMimeType, reportingV3ReportsIdGet200Response.reportMimeType) &&
        Objects.equals(this.reportFrequency, reportingV3ReportsIdGet200Response.reportFrequency) &&
        Objects.equals(this.reportFields, reportingV3ReportsIdGet200Response.reportFields) &&
        Objects.equals(this.reportStatus, reportingV3ReportsIdGet200Response.reportStatus) &&
        Objects.equals(this.reportStartTime, reportingV3ReportsIdGet200Response.reportStartTime) &&
        Objects.equals(this.reportEndTime, reportingV3ReportsIdGet200Response.reportEndTime) &&
        Objects.equals(this.timezone, reportingV3ReportsIdGet200Response.timezone) &&
        Objects.equals(this.reportFilters, reportingV3ReportsIdGet200Response.reportFilters) &&
        Objects.equals(this.reportPreferences, reportingV3ReportsIdGet200Response.reportPreferences) &&
        Objects.equals(this.groupId, reportingV3ReportsIdGet200Response.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, reportId, reportDefinitionId, reportName, reportMimeType, reportFrequency, reportFields, reportStatus, reportStartTime, reportEndTime, timezone, reportFilters, reportPreferences, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingV3ReportsIdGet200Response {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    reportDefinitionId: ").append(toIndentedString(reportDefinitionId)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportMimeType: ").append(toIndentedString(reportMimeType)).append("\n");
    sb.append("    reportFrequency: ").append(toIndentedString(reportFrequency)).append("\n");
    sb.append("    reportFields: ").append(toIndentedString(reportFields)).append("\n");
    sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
    sb.append("    reportStartTime: ").append(toIndentedString(reportStartTime)).append("\n");
    sb.append("    reportEndTime: ").append(toIndentedString(reportEndTime)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    reportFilters: ").append(toIndentedString(reportFilters)).append("\n");
    sb.append("    reportPreferences: ").append(toIndentedString(reportPreferences)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

