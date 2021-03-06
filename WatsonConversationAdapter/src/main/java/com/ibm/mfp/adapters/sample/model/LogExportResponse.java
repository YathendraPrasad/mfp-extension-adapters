/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


/*
 * Conversation
 * The IBM Watson&trade; Conversation service combines machine learning, natural language understanding, and integrated dialog tools to create conversation flows between your apps and your users.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.LogResponse;
import com.ibm.mfp.adapters.sample.model.MessageRequest;
import com.ibm.mfp.adapters.sample.model.MessageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


/**
 * LogExportResponse
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-06-21T18:01:40.287+05:30")
public class LogExportResponse   {
  @JsonProperty("request")
  private MessageRequest request = null;

  @JsonProperty("response")
  private MessageResponse response = null;

  @JsonProperty("log_id")
  private String logId = null;

  @JsonProperty("request_timestamp")
  private String requestTimestamp = null;

  @JsonProperty("response_timestamp")
  private String responseTimestamp = null;

  public LogExportResponse request(MessageRequest request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @JsonProperty("request")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public MessageRequest getRequest() {
    return request;
  }

  public void setRequest(MessageRequest request) {
    this.request = request;
  }

  public LogExportResponse response(MessageResponse response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @JsonProperty("response")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public MessageResponse getResponse() {
    return response;
  }

  public void setResponse(MessageResponse response) {
    this.response = response;
  }

  public LogExportResponse logId(String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * A unique identifier for the logged message.
   * @return logId
  **/
  @JsonProperty("log_id")
  @ApiModelProperty(required = true, value = "A unique identifier for the logged message.")
  @NotNull
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public LogExportResponse requestTimestamp(String requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

   /**
   * The timestamp for receipt of the message.
   * @return requestTimestamp
  **/
  @JsonProperty("request_timestamp")
  @ApiModelProperty(required = true, value = "The timestamp for receipt of the message.")
  @NotNull
  public String getRequestTimestamp() {
    return requestTimestamp;
  }

  public void setRequestTimestamp(String requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }

  public LogExportResponse responseTimestamp(String responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
    return this;
  }

   /**
   * The timestamp for the system response to the message.
   * @return responseTimestamp
  **/
  @JsonProperty("response_timestamp")
  @ApiModelProperty(required = true, value = "The timestamp for the system response to the message.")
  @NotNull
  public String getResponseTimestamp() {
    return responseTimestamp;
  }

  public void setResponseTimestamp(String responseTimestamp) {
    this.responseTimestamp = responseTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogExportResponse logExportResponse = (LogExportResponse) o;
    return Objects.equals(this.request, logExportResponse.request) &&
        Objects.equals(this.response, logExportResponse.response) &&
        Objects.equals(this.logId, logExportResponse.logId) &&
        Objects.equals(this.requestTimestamp, logExportResponse.requestTimestamp) &&
        Objects.equals(this.responseTimestamp, logExportResponse.responseTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, response, logId, requestTimestamp, responseTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogExportResponse {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

