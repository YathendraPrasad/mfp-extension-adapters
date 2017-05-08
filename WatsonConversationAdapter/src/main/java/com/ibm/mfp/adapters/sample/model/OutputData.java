package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.LogMessageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * An output object that includes the response to the user, the nodes that were hit, and messages from the log.
 **/

@ApiModel(description = "An output object that includes the response to the user, the nodes that were hit, and messages from the log.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class OutputData   {
  
  private List<LogMessageResponse> logMessages = new ArrayList<LogMessageResponse>();
  private List<String> text = new ArrayList<String>();
  private List<String> nodesVisited = new ArrayList<String>();

  /**
   * Up to 50 messages logged with the request.
   **/
  public OutputData logMessages(List<LogMessageResponse> logMessages) {
    this.logMessages = logMessages;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Up to 50 messages logged with the request.")
  @JsonProperty("log_messages")
  public List<LogMessageResponse> getLogMessages() {
    return logMessages;
  }
  public void setLogMessages(List<LogMessageResponse> logMessages) {
    this.logMessages = logMessages;
  }

  /**
   * Responses to the user.
   **/
  public OutputData text(List<String> text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Responses to the user.")
  @JsonProperty("text")
  public List<String> getText() {
    return text;
  }
  public void setText(List<String> text) {
    this.text = text;
  }

  /**
   * The nodes that were executed to create the response.
   **/
  public OutputData nodesVisited(List<String> nodesVisited) {
    this.nodesVisited = nodesVisited;
    return this;
  }

  
  @ApiModelProperty(value = "The nodes that were executed to create the response.")
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
    OutputData outputData = (OutputData) o;
    return Objects.equals(logMessages, outputData.logMessages) &&
        Objects.equals(text, outputData.text) &&
        Objects.equals(nodesVisited, outputData.nodesVisited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logMessages, text, nodesVisited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputData {\n");
    
    sb.append("    logMessages: ").append(toIndentedString(logMessages)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

