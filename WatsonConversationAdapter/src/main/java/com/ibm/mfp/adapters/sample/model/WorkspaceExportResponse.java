package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ibm.mfp.adapters.sample.model.CounterexampleCollection;
import com.ibm.mfp.adapters.sample.model.DialogNodeCollection;
import com.ibm.mfp.adapters.sample.model.DialogNodeResponse;
import com.ibm.mfp.adapters.sample.model.EntityCollection;
import com.ibm.mfp.adapters.sample.model.EntityExportResponse;
import com.ibm.mfp.adapters.sample.model.ExampleResponse;
import com.ibm.mfp.adapters.sample.model.IntentCollection;
import com.ibm.mfp.adapters.sample.model.IntentExportResponse;
import com.ibm.mfp.adapters.sample.model.WorkspaceStatusResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class WorkspaceExportResponse   {
  
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
  private List<IntentExportResponse> intents = new ArrayList<IntentExportResponse>();
  private List<EntityExportResponse> entities = new ArrayList<EntityExportResponse>();
  private List<ExampleResponse> counterexamples = new ArrayList<ExampleResponse>();
  private List<DialogNodeResponse> dialogNodes = new ArrayList<DialogNodeResponse>();

  /**
   * The name of the workspace.
   **/
  public WorkspaceExportResponse name(String name) {
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
  public WorkspaceExportResponse description(String description) {
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
  public WorkspaceExportResponse language(String language) {
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
  public WorkspaceExportResponse metadata(Object metadata) {
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
  public WorkspaceExportResponse created(String created) {
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
  public WorkspaceExportResponse updated(String updated) {
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
  public WorkspaceExportResponse workspaceId(String workspaceId) {
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
  public WorkspaceExportResponse status(StatusEnum status) {
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

  /**
   * An array of intents.
   **/
  public WorkspaceExportResponse intents(List<IntentExportResponse> intents) {
    this.intents = intents;
    return this;
  }

  
  @ApiModelProperty(value = "An array of intents.")
  @JsonProperty("intents")
  public List<IntentExportResponse> getIntents() {
    return intents;
  }
  public void setIntents(List<IntentExportResponse> intents) {
    this.intents = intents;
  }

  /**
   * An array of entities.
   **/
  public WorkspaceExportResponse entities(List<EntityExportResponse> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "An array of entities.")
  @JsonProperty("entities")
  public List<EntityExportResponse> getEntities() {
    return entities;
  }
  public void setEntities(List<EntityExportResponse> entities) {
    this.entities = entities;
  }

  /**
   * An array of counterexamples.
   **/
  public WorkspaceExportResponse counterexamples(List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
    return this;
  }

  
  @ApiModelProperty(value = "An array of counterexamples.")
  @JsonProperty("counterexamples")
  public List<ExampleResponse> getCounterexamples() {
    return counterexamples;
  }
  public void setCounterexamples(List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
  }

  /**
   * An array of dialog nodes.
   **/
  public WorkspaceExportResponse dialogNodes(List<DialogNodeResponse> dialogNodes) {
    this.dialogNodes = dialogNodes;
    return this;
  }

  
  @ApiModelProperty(value = "An array of dialog nodes.")
  @JsonProperty("dialog_nodes")
  public List<DialogNodeResponse> getDialogNodes() {
    return dialogNodes;
  }
  public void setDialogNodes(List<DialogNodeResponse> dialogNodes) {
    this.dialogNodes = dialogNodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceExportResponse workspaceExportResponse = (WorkspaceExportResponse) o;
    return Objects.equals(name, workspaceExportResponse.name) &&
        Objects.equals(description, workspaceExportResponse.description) &&
        Objects.equals(language, workspaceExportResponse.language) &&
        Objects.equals(metadata, workspaceExportResponse.metadata) &&
        Objects.equals(created, workspaceExportResponse.created) &&
        Objects.equals(updated, workspaceExportResponse.updated) &&
        Objects.equals(workspaceId, workspaceExportResponse.workspaceId) &&
        Objects.equals(status, workspaceExportResponse.status) &&
        Objects.equals(intents, workspaceExportResponse.intents) &&
        Objects.equals(entities, workspaceExportResponse.entities) &&
        Objects.equals(counterexamples, workspaceExportResponse.counterexamples) &&
        Objects.equals(dialogNodes, workspaceExportResponse.dialogNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, language, metadata, created, updated, workspaceId, status, intents, entities, counterexamples, dialogNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceExportResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    counterexamples: ").append(toIndentedString(counterexamples)).append("\n");
    sb.append("    dialogNodes: ").append(toIndentedString(dialogNodes)).append("\n");
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

