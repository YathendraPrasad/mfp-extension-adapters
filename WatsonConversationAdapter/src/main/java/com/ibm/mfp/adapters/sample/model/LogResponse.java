package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.MessageRequest;
import com.ibm.mfp.adapters.sample.model.MessageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class LogResponse   {
  
  private MessageRequest request = null;
  private MessageResponse response = null;
  private String logId = null;
  private String requestTimestamp = null;
  private String responseTimestamp = null;

  /**
   **/
  public LogResponse request(MessageRequest request) {
    this.request = request;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("request")
  public MessageRequest getRequest() {
    return request;
  }
  public void setRequest(MessageRequest request) {
    this.request = request;
  }

  /**
   **/
  public LogResponse response(MessageResponse response) {
    this.response = response;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response")
  public MessageResponse getResponse() {
    return response;
  }
  public void setResponse(MessageResponse response) {
    this.response = response;
  }

  /**
   * A unique identifier for the logged message.
   **/
  public LogResponse logId(String logId) {
    this.logId = logId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A unique identifier for the logged message.")
  @JsonProperty("log_id")
  public String getLogId() {
    return logId;
  }
  public void setLogId(String logId) {
    this.logId = logId;
  }

  /**
   * The timestamp for receipt of the message.
   **/
  public LogResponse requestTimestamp(String requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for receipt of the message.")
  @JsonProperty("request_timestamp")
  public String getRequestTimestamp() {
    return requestTimestamp;
  }
  public void setRequestTimestamp(String requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }

  /**
   * The timestamp for the system response to the message.
   **/
  public LogResponse responseTimestamp(String responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for the system response to the message.")
  @JsonProperty("response_timestamp")
  public String getResponseTimestamp() {
    return responseTimestamp;
  }
  public void setResponseTimestamp(String responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogResponse logResponse = (LogResponse) o;
    return Objects.equals(request, logResponse.request) &&
        Objects.equals(response, logResponse.response) &&
        Objects.equals(logId, logResponse.logId) &&
        Objects.equals(requestTimestamp, logResponse.requestTimestamp) &&
        Objects.equals(responseTimestamp, logResponse.responseTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, response, logId, requestTimestamp, responseTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogResponse {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
    sb.append("    responseTimestamp: ").append(toIndentedString(responseTimestamp)).append("\n");
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

