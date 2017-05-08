package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.DialogNodeGoTo;
import com.ibm.mfp.adapters.sample.model.DialogNodeOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class CreateDialogNode   {
  
  private String dialogNode = null;
  private String description = null;
  private String conditions = null;
  private String parent = null;
  private String previousSibling = null;
  private DialogNodeOutput output = null;
  private Object context = null;
  private Object metadata = null;
  private DialogNodeGoTo _goTo = null;

  /**
   * The dialog node ID.
   **/
  public CreateDialogNode dialogNode(String dialogNode) {
    this.dialogNode = dialogNode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The dialog node ID.")
  @JsonProperty("dialog_node")
  public String getDialogNode() {
    return dialogNode;
  }
  public void setDialogNode(String dialogNode) {
    this.dialogNode = dialogNode;
  }

  /**
   * The description of the dialog node.
   **/
  public CreateDialogNode description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The description of the dialog node.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The condition that will trigger the dialog node.
   **/
  public CreateDialogNode conditions(String conditions) {
    this.conditions = conditions;
    return this;
  }

  
  @ApiModelProperty(value = "The condition that will trigger the dialog node.")
  @JsonProperty("conditions")
  public String getConditions() {
    return conditions;
  }
  public void setConditions(String conditions) {
    this.conditions = conditions;
  }

  /**
   * The parent dialog node.
   **/
  public CreateDialogNode parent(String parent) {
    this.parent = parent;
    return this;
  }

  
  @ApiModelProperty(value = "The parent dialog node.")
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }
  public void setParent(String parent) {
    this.parent = parent;
  }

  /**
   * The previous dialog node.
   **/
  public CreateDialogNode previousSibling(String previousSibling) {
    this.previousSibling = previousSibling;
    return this;
  }

  
  @ApiModelProperty(value = "The previous dialog node.")
  @JsonProperty("previous_sibling")
  public String getPreviousSibling() {
    return previousSibling;
  }
  public void setPreviousSibling(String previousSibling) {
    this.previousSibling = previousSibling;
  }

  /**
   **/
  public CreateDialogNode output(DialogNodeOutput output) {
    this.output = output;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("output")
  public DialogNodeOutput getOutput() {
    return output;
  }
  public void setOutput(DialogNodeOutput output) {
    this.output = output;
  }

  /**
   * The context for the dialog node.
   **/
  public CreateDialogNode context(Object context) {
    this.context = context;
    return this;
  }

  
  @ApiModelProperty(value = "The context for the dialog node.")
  @JsonProperty("context")
  public Object getContext() {
    return context;
  }
  public void setContext(Object context) {
    this.context = context;
  }

  /**
   * The metadata for the dialog node.
   **/
  public CreateDialogNode metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "The metadata for the dialog node.")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  public CreateDialogNode _goTo(DialogNodeGoTo _goTo) {
    this._goTo = _goTo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("go_to")
  public DialogNodeGoTo getGoTo() {
    return _goTo;
  }
  public void setGoTo(DialogNodeGoTo _goTo) {
    this._goTo = _goTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDialogNode createDialogNode = (CreateDialogNode) o;
    return Objects.equals(dialogNode, createDialogNode.dialogNode) &&
        Objects.equals(description, createDialogNode.description) &&
        Objects.equals(conditions, createDialogNode.conditions) &&
        Objects.equals(parent, createDialogNode.parent) &&
        Objects.equals(previousSibling, createDialogNode.previousSibling) &&
        Objects.equals(output, createDialogNode.output) &&
        Objects.equals(context, createDialogNode.context) &&
        Objects.equals(metadata, createDialogNode.metadata) &&
        Objects.equals(_goTo, createDialogNode._goTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialogNode, description, conditions, parent, previousSibling, output, context, metadata, _goTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDialogNode {\n");
    
    sb.append("    dialogNode: ").append(toIndentedString(dialogNode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    previousSibling: ").append(toIndentedString(previousSibling)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    _goTo: ").append(toIndentedString(_goTo)).append("\n");
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

