/*
 * Discovery
 * The IBM Watson&trade; Discovery Service is a cognitive search and content analytics engine that you can add to applications to identify patterns, trends and actionable insights to drive better decision-making. Securely unify structured and unstructured data with pre-enriched content, and use a simplified query language to eliminate the need for manual filtering of results. 
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.constraints.*;

/**
 * A notice produced by the ingestion process.
 */
@ApiModel(description = "A notice produced by the ingestion process.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T15:47:02.385+05:30")
public class Notice   {
  @JsonProperty("notice_id")
  private String noticeId = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("document_id")
  private String documentId = null;

/**
   * Severity level of the notice
   */
  public enum SeverityEnum {
    WARNING("warning"),
    
    ERROR("error");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("severity")
  private SeverityEnum severity = null;

  @JsonProperty("step")
  private String step = null;

  @JsonProperty("description")
  private String description = null;

  public Notice noticeId(String noticeId) {
    this.noticeId = noticeId;
    return this;
  }

   /**
   * Identifies the notice. Many notices may have the same ID. This field exists so that user applications can programatically identify a notice and take automatic corrective action.
   * @return noticeId
  **/
  @JsonProperty("notice_id")
  @ApiModelProperty(value = "Identifies the notice. Many notices may have the same ID. This field exists so that user applications can programatically identify a notice and take automatic corrective action.")

  public String getNoticeId() {
    return noticeId;
  }

  public void setNoticeId(String noticeId) {
    this.noticeId = noticeId;
  }

  public Notice created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * The creation date of the collection in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
   * @return created
  **/
  @JsonProperty("created")
  @ApiModelProperty(value = "The creation date of the collection in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")

  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public Notice documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Unique identifier of the ingested document
   * @return documentId
  **/
  @JsonProperty("document_id")
  @ApiModelProperty(value = "Unique identifier of the ingested document")

  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Notice severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Severity level of the notice
   * @return severity
  **/
  @JsonProperty("severity")
  @ApiModelProperty(value = "Severity level of the notice")

  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Notice step(String step) {
    this.step = step;
    return this;
  }

   /**
   * Ingestion step in which the notice occurred
   * @return step
  **/
  @JsonProperty("step")
  @ApiModelProperty(value = "Ingestion step in which the notice occurred")

  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }

  public Notice description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the notice
   * @return description
  **/
  @JsonProperty("description")
  @ApiModelProperty(value = "The description of the notice")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notice notice = (Notice) o;
    return Objects.equals(this.noticeId, notice.noticeId) &&
        Objects.equals(this.created, notice.created) &&
        Objects.equals(this.documentId, notice.documentId) &&
        Objects.equals(this.severity, notice.severity) &&
        Objects.equals(this.step, notice.step) &&
        Objects.equals(this.description, notice.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noticeId, created, documentId, severity, step, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notice {\n");
    
    sb.append("    noticeId: ").append(toIndentedString(noticeId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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