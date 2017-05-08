package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.SystemResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Context information for the message. Include the context from the previous response to maintain state for the conversation.
 **/

@ApiModel(description = "Context information for the message. Include the context from the previous response to maintain state for the conversation.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class Context   {
  
  private String conversationId = null;
  private SystemResponse system = null;

  /**
   * The unique identifier of the conversation.
   **/
  public Context conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique identifier of the conversation.")
  @JsonProperty("conversation_id")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  /**
   **/
  public Context system(SystemResponse system) {
    this.system = system;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("system")
  public SystemResponse getSystem() {
    return system;
  }
  public void setSystem(SystemResponse system) {
    this.system = system;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Context context = (Context) o;
    return Objects.equals(conversationId, context.conversationId) &&
        Objects.equals(system, context.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Context {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

