package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.DialogNodeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class DialogNodeCollection   {
  
  private List<DialogNodeResponse> dialogNodes = new ArrayList<DialogNodeResponse>();

  /**
   * An array of dialog nodes.
   **/
  public DialogNodeCollection dialogNodes(List<DialogNodeResponse> dialogNodes) {
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
    DialogNodeCollection dialogNodeCollection = (DialogNodeCollection) o;
    return Objects.equals(dialogNodes, dialogNodeCollection.dialogNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialogNodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogNodeCollection {\n");
    
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

