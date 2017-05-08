package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.BaseWorkspace;
import com.ibm.mfp.adapters.sample.model.CreateExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class WorkspaceRequest   {
  
  private String name = null;
  private String description = null;
  private String language = null;
  private Object metadata = null;
  private List<CreateExample> counterexamples = new ArrayList<CreateExample>();

  /**
   * The name of the workspace.
   **/
  public WorkspaceRequest name(String name) {
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
  public WorkspaceRequest description(String description) {
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
  public WorkspaceRequest language(String language) {
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
  public WorkspaceRequest metadata(Object metadata) {
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
   * An array of CreateExample objects defining input examples that have been marked as irrelevant input.
   **/
  public WorkspaceRequest counterexamples(List<CreateExample> counterexamples) {
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
    WorkspaceRequest workspaceRequest = (WorkspaceRequest) o;
    return Objects.equals(name, workspaceRequest.name) &&
        Objects.equals(description, workspaceRequest.description) &&
        Objects.equals(language, workspaceRequest.language) &&
        Objects.equals(metadata, workspaceRequest.metadata) &&
        Objects.equals(counterexamples, workspaceRequest.counterexamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, language, metadata, counterexamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

