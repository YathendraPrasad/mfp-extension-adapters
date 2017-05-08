package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.BaseMessage;
import com.ibm.mfp.adapters.sample.model.MessageInput;
import com.ibm.mfp.adapters.sample.model.RuntimeContext;
import com.ibm.mfp.adapters.sample.model.RuntimeEntity;
import com.ibm.mfp.adapters.sample.model.RuntimeIntent;
import com.ibm.mfp.adapters.sample.model.RuntimeOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * A response from the Conversation service.
 **/

@ApiModel(description = "A response from the Conversation service.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class MessageResponse   {
  
  private MessageInput input = null;
  private List<RuntimeIntent> intents = new ArrayList<RuntimeIntent>();
  private List<RuntimeEntity> entities = new ArrayList<RuntimeEntity>();
  private Boolean alternateIntents = false;
  private RuntimeContext context = null;
  private RuntimeOutput output = null;

  /**
   **/
  public MessageResponse input(MessageInput input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("input")
  public MessageInput getInput() {
    return input;
  }
  public void setInput(MessageInput input) {
    this.input = input;
  }

  /**
   **/
  public MessageResponse intents(List<RuntimeIntent> intents) {
    this.intents = intents;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("intents")
  public List<RuntimeIntent> getIntents() {
    return intents;
  }
  public void setIntents(List<RuntimeIntent> intents) {
    this.intents = intents;
  }

  /**
   **/
  public MessageResponse entities(List<RuntimeEntity> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entities")
  public List<RuntimeEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<RuntimeEntity> entities) {
    this.entities = entities;
  }

  /**
   * Whether to return more than one intent. `true` indicates that all matching intents are returned.
   **/
  public MessageResponse alternateIntents(Boolean alternateIntents) {
    this.alternateIntents = alternateIntents;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to return more than one intent. `true` indicates that all matching intents are returned.")
  @JsonProperty("alternate_intents")
  public Boolean getAlternateIntents() {
    return alternateIntents;
  }
  public void setAlternateIntents(Boolean alternateIntents) {
    this.alternateIntents = alternateIntents;
  }

  /**
   **/
  public MessageResponse context(RuntimeContext context) {
    this.context = context;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("context")
  public RuntimeContext getContext() {
    return context;
  }
  public void setContext(RuntimeContext context) {
    this.context = context;
  }

  /**
   **/
  public MessageResponse output(RuntimeOutput output) {
    this.output = output;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("output")
  public RuntimeOutput getOutput() {
    return output;
  }
  public void setOutput(RuntimeOutput output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponse messageResponse = (MessageResponse) o;
    return Objects.equals(input, messageResponse.input) &&
        Objects.equals(intents, messageResponse.intents) &&
        Objects.equals(entities, messageResponse.entities) &&
        Objects.equals(alternateIntents, messageResponse.alternateIntents) &&
        Objects.equals(context, messageResponse.context) &&
        Objects.equals(output, messageResponse.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, intents, entities, alternateIntents, context, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponse {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    alternateIntents: ").append(toIndentedString(alternateIntents)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

