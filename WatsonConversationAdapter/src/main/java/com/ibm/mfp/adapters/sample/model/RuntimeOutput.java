package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.RuntimeLogMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class RuntimeOutput   {
  
  private List<String> text = new ArrayList<String>();
  private List<RuntimeLogMessage> logMessages = new ArrayList<RuntimeLogMessage>();
  private List<String> nodesVisited = new ArrayList<String>();

  /**
   * An array of responses to the user.
   **/
  public RuntimeOutput text(List<String> text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "An array of responses to the user.")
  @JsonProperty("text")
  public List<String> getText() {
    return text;
  }
  public void setText(List<String> text) {
    this.text = text;
  }

  /**
   * Up to 50 messages logged with the request
   **/
  public RuntimeOutput logMessages(List<RuntimeLogMessage> logMessages) {
    this.logMessages = logMessages;
    return this;
  }

  
  @ApiModelProperty(value = "Up to 50 messages logged with the request")
  @JsonProperty("log_messages")
  public List<RuntimeLogMessage> getLogMessages() {
    return logMessages;
  }
  public void setLogMessages(List<RuntimeLogMessage> logMessages) {
    this.logMessages = logMessages;
  }

  /**
   * An array of the nodes that were triggered to create the response.
   **/
  public RuntimeOutput nodesVisited(List<String> nodesVisited) {
    this.nodesVisited = nodesVisited;
    return this;
  }

  
  @ApiModelProperty(value = "An array of the nodes that were triggered to create the response.")
  @JsonProperty("nodes_visited")
  public List<String> getNodesVisited() {
    return nodesVisited;
  }
  public void setNodesVisited(List<String> nodesVisited) {
    this.nodesVisited = nodesVisited;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeOutput runtimeOutput = (RuntimeOutput) o;
    return Objects.equals(text, runtimeOutput.text) &&
        Objects.equals(logMessages, runtimeOutput.logMessages) &&
        Objects.equals(nodesVisited, runtimeOutput.nodesVisited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, logMessages, nodesVisited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeOutput {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    logMessages: ").append(toIndentedString(logMessages)).append("\n");
    sb.append("    nodesVisited: ").append(toIndentedString(nodesVisited)).append("\n");
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

