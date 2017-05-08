package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class WorkspaceStatusResponse   {
  
  private String name = null;
  private String description = null;
  private String language = null;
  private Object metadata = null;
  private String created = null;
  private String updated = null;
  private String workspaceId = null;


  public enum StatusEnum {
    NON_EXISTENT("Non Existent"),
    TRAINING("Training"),
    FAILED("Failed"),
    AVAILABLE("Available"),
    UNAVAILABLE("Unavailable");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;

  /**
   * The name of the workspace.
   **/
  public WorkspaceStatusResponse name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the workspace.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description of the workspace.
   **/
  public WorkspaceStatusResponse description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of the workspace.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The language of the workspace.
   **/
  public WorkspaceStatusResponse language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The language of the workspace.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Any metadata that is required by the workspace.
   **/
  public WorkspaceStatusResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Any metadata that is required by the workspace.")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * The timestamp for creation of the workspace.
   **/
  public WorkspaceStatusResponse created(String created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for creation of the workspace.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp for the last update to the workspace.
   **/
  public WorkspaceStatusResponse updated(String updated) {
    this.updated = updated;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for the last update to the workspace.")
  @JsonProperty("updated")
  public String getUpdated() {
    return updated;
  }
  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * The workspace ID.
   **/
  public WorkspaceStatusResponse workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The workspace ID.")
  @JsonProperty("workspace_id")
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  /**
   * The current status of the workspace.
   **/
  public WorkspaceStatusResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The current status of the workspace.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceStatusResponse workspaceStatusResponse = (WorkspaceStatusResponse) o;
    return Objects.equals(name, workspaceStatusResponse.name) &&
        Objects.equals(description, workspaceStatusResponse.description) &&
        Objects.equals(language, workspaceStatusResponse.language) &&
        Objects.equals(metadata, workspaceStatusResponse.metadata) &&
        Objects.equals(created, workspaceStatusResponse.created) &&
        Objects.equals(updated, workspaceStatusResponse.updated) &&
        Objects.equals(workspaceId, workspaceStatusResponse.workspaceId) &&
        Objects.equals(status, workspaceStatusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, language, metadata, created, updated, workspaceId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceStatusResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

