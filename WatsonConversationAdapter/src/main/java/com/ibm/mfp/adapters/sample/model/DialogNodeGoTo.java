package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class DialogNodeGoTo   {
  
  private String dialogNode = null;
  private String selector = null;
  private Boolean _return = null;

  /**
   * The ID of the dialog node to go to.
   **/
  public DialogNodeGoTo dialogNode(String dialogNode) {
    this.dialogNode = dialogNode;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the dialog node to go to.")
  @JsonProperty("dialog_node")
  public String getDialogNode() {
    return dialogNode;
  }
  public void setDialogNode(String dialogNode) {
    this.dialogNode = dialogNode;
  }

  /**
   * Where in the target node focus is passed to.
   **/
  public DialogNodeGoTo selector(String selector) {
    this.selector = selector;
    return this;
  }

  
  @ApiModelProperty(value = "Where in the target node focus is passed to.")
  @JsonProperty("selector")
  public String getSelector() {
    return selector;
  }
  public void setSelector(String selector) {
    this.selector = selector;
  }

  /**
   * Reserved for future use.
   **/
  public DialogNodeGoTo _return(Boolean _return) {
    this._return = _return;
    return this;
  }

  
  @ApiModelProperty(value = "Reserved for future use.")
  @JsonProperty("return")
  public Boolean getReturn() {
    return _return;
  }
  public void setReturn(Boolean _return) {
    this._return = _return;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogNodeGoTo dialogNodeGoTo = (DialogNodeGoTo) o;
    return Objects.equals(dialogNode, dialogNodeGoTo.dialogNode) &&
        Objects.equals(selector, dialogNodeGoTo.selector) &&
        Objects.equals(_return, dialogNodeGoTo._return);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialogNode, selector, _return);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogNodeGoTo {\n");
    
    sb.append("    dialogNode: ").append(toIndentedString(dialogNode)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
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

