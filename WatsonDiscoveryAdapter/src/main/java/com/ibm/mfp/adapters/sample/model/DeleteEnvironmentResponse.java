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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * DeleteEnvironmentResponse
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T15:47:02.385+05:30")
public class DeleteEnvironmentResponse   {
  @JsonProperty("environment_id")
  private String environmentId = null;

  @JsonProperty("status")
  private String status = null;

  public DeleteEnvironmentResponse environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * The unique identifier for this environment
   * @return environmentId
  **/
  @JsonProperty("environment_id")
  @ApiModelProperty(required = true, value = "The unique identifier for this environment")
  @NotNull 

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public DeleteEnvironmentResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the environment
   * @return status
  **/
  @JsonProperty("status")
  @ApiModelProperty(required = true, value = "Status of the environment")
  @NotNull 

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteEnvironmentResponse deleteEnvironmentResponse = (DeleteEnvironmentResponse) o;
    return Objects.equals(this.environmentId, deleteEnvironmentResponse.environmentId) &&
        Objects.equals(this.status, deleteEnvironmentResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteEnvironmentResponse {\n");
    
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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