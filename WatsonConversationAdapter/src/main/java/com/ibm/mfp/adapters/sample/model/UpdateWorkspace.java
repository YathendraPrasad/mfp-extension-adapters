package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.CreateDialogNode;
import com.ibm.mfp.adapters.sample.model.CreateEntity;
import com.ibm.mfp.adapters.sample.model.CreateExample;
import com.ibm.mfp.adapters.sample.model.CreateIntent;
import com.ibm.mfp.adapters.sample.model.WorkspaceRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class UpdateWorkspace   {
  
  private String name = null;
  private String description = null;
  private String language = null;
  private Object metadata = null;
  private List<CreateIntent> intents = new ArrayList<CreateIntent>();
  private List<CreateEntity> entities = new ArrayList<CreateEntity>();
  private List<CreateDialogNode> dialogNodes = new ArrayList<CreateDialogNode>();
  private List<CreateExample> counterexamples = new ArrayList<CreateExample>();

  /**
   * The name of the workspace.
   **/
  public UpdateWorkspace name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the workspace.")
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
  public UpdateWorkspace description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The description of the workspace.")
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
  public UpdateWorkspace language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(value = "The language of the workspace.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Any metadata related to the workspace.
   **/
  public UpdateWorkspace metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Any metadata related to the workspace.")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * An array of CreateIntent objects defining the intents for the workspace.
   **/
  public UpdateWorkspace intents(List<CreateIntent> intents) {
    this.intents = intents;
    return this;
  }

  
  @ApiModelProperty(value = "An array of CreateIntent objects defining the intents for the workspace.")
  @JsonProperty("intents")
  public List<CreateIntent> getIntents() {
    return intents;
  }
  public void setIntents(List<CreateIntent> intents) {
    this.intents = intents;
  }

  /**
   * An array of CreateEntity objects defining the entities for the workspace.
   **/
  public UpdateWorkspace entities(List<CreateEntity> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "An array of CreateEntity objects defining the entities for the workspace.")
  @JsonProperty("entities")
  public List<CreateEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<CreateEntity> entities) {
    this.entities = entities;
  }

  /**
   * An array of CreateDialogNode objects defining the nodes in the workspace dialog.
   **/
  public UpdateWorkspace dialogNodes(List<CreateDialogNode> dialogNodes) {
    this.dialogNodes = dialogNodes;
    return this;
  }

  
  @ApiModelProperty(value = "An array of CreateDialogNode objects defining the nodes in the workspace dialog.")
  @JsonProperty("dialog_nodes")
  public List<CreateDialogNode> getDialogNodes() {
    return dialogNodes;
  }
  public void setDialogNodes(List<CreateDialogNode> dialogNodes) {
    this.dialogNodes = dialogNodes;
  }

  /**
   * An array of CreateExample objects defining input examples that have been marked as irrelevant input.
   **/
  public UpdateWorkspace counterexamples(List<CreateExample> counterexamples) {
    this.counterexamples = counterexamples;
    return this;
  }

  
  @ApiModelProperty(value = "An array of CreateExample objects defining input examples that have been marked as irrelevant input.")
  @JsonProperty("counterexamples")
  public List<CreateExample> getCounterexamples() {
    return counterexamples;
  }
  public void setCounterexamples(List<CreateExample> counterexamples) {
    this.counterexamples = counterexamples;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkspace updateWorkspace = (UpdateWorkspace) o;
    return Objects.equals(name, updateWorkspace.name) &&
        Objects.equals(description, updateWorkspace.description) &&
        Objects.equals(language, updateWorkspace.language) &&
        Objects.equals(metadata, updateWorkspace.metadata) &&
        Objects.equals(intents, updateWorkspace.intents) &&
        Objects.equals(entities, updateWorkspace.entities) &&
        Objects.equals(dialogNodes, updateWorkspace.dialogNodes) &&
        Objects.equals(counterexamples, updateWorkspace.counterexamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, language, metadata, intents, entities, dialogNodes, counterexamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkspace {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    dialogNodes: ").append(toIndentedString(dialogNodes)).append("\n");
    sb.append("    counterexamples: ").append(toIndentedString(counterexamples)).append("\n");
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

