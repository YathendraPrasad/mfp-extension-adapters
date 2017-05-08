package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class WorkspaceResponse   {
  
  private String name = null;
  private String description = null;
  private String language = null;
  private Object metadata = null;
  private String created = null;
  private String updated = null;
  private String workspaceId = null;

  /**
   * The name of the workspace.
   **/
  public WorkspaceResponse name(String name) {
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
  public WorkspaceResponse description(String description) {
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
  public WorkspaceResponse language(String language) {
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
  public WorkspaceResponse metadata(Object metadata) {
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
  public WorkspaceResponse created(String created) {
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
  public WorkspaceResponse updated(String updated) {
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
  public WorkspaceResponse workspaceId(String workspaceId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceResponse workspaceResponse = (WorkspaceResponse) o;
    return Objects.equals(name, workspaceResponse.name) &&
        Objects.equals(description, workspaceResponse.description) &&
        Objects.equals(language, workspaceResponse.language) &&
        Objects.equals(metadata, workspaceResponse.metadata) &&
        Objects.equals(created, workspaceResponse.created) &&
        Objects.equals(updated, workspaceResponse.updated) &&
        Objects.equals(workspaceId, workspaceResponse.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, language, metadata, created, updated, workspaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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

