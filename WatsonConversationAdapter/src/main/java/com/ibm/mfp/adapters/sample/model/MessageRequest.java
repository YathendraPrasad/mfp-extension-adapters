package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.Context;
import com.ibm.mfp.adapters.sample.model.InputData;
import com.ibm.mfp.adapters.sample.model.OutputData;
import com.ibm.mfp.adapters.sample.model.RuntimeEntity;
import com.ibm.mfp.adapters.sample.model.RuntimeIntent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * A request formatted for the Conversation service.
 **/

@ApiModel(description = "A request formatted for the Conversation service.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class MessageRequest   {
  
  private InputData input = null;
  private Boolean alternateIntents = false;
  private Context context = null;
  private List<RuntimeEntity> entities = new ArrayList<RuntimeEntity>();
  private List<RuntimeIntent> intents = new ArrayList<RuntimeIntent>();
  private OutputData output = null;

  /**
   **/
  public MessageRequest input(InputData input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("input")
  public InputData getInput() {
    return input;
  }
  public void setInput(InputData input) {
    this.input = input;
  }

  /**
   * Whether to return more than one intent. Set to `true` to return all matching intents.
   **/
  public MessageRequest alternateIntents(Boolean alternateIntents) {
    this.alternateIntents = alternateIntents;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to return more than one intent. Set to `true` to return all matching intents.")
  @JsonProperty("alternate_intents")
  public Boolean getAlternateIntents() {
    return alternateIntents;
  }
  public void setAlternateIntents(Boolean alternateIntents) {
    this.alternateIntents = alternateIntents;
  }

  /**
   **/
  public MessageRequest context(Context context) {
    this.context = context;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("context")
  public Context getContext() {
    return context;
  }
  public void setContext(Context context) {
    this.context = context;
  }

  /**
   * Include the entities from the previous response when they do not need to change and to prevent Watson from trying to identify them.
   **/
  public MessageRequest entities(List<RuntimeEntity> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "Include the entities from the previous response when they do not need to change and to prevent Watson from trying to identify them.")
  @JsonProperty("entities")
  public List<RuntimeEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<RuntimeEntity> entities) {
    this.entities = entities;
  }

  /**
   * An array of name-confidence pairs for the user input. Include the intents from the previous response when they do not need to change and to prevent Watson from trying to identify them.
   **/
  public MessageRequest intents(List<RuntimeIntent> intents) {
    this.intents = intents;
    return this;
  }

  
  @ApiModelProperty(value = "An array of name-confidence pairs for the user input. Include the intents from the previous response when they do not need to change and to prevent Watson from trying to identify them.")
  @JsonProperty("intents")
  public List<RuntimeIntent> getIntents() {
    return intents;
  }
  public void setIntents(List<RuntimeIntent> intents) {
    this.intents = intents;
  }

  /**
   **/
  public MessageRequest output(OutputData output) {
    this.output = output;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("output")
  public OutputData getOutput() {
    return output;
  }
  public void setOutput(OutputData output) {
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
    MessageRequest messageRequest = (MessageRequest) o;
    return Objects.equals(input, messageRequest.input) &&
        Objects.equals(alternateIntents, messageRequest.alternateIntents) &&
        Objects.equals(context, messageRequest.context) &&
        Objects.equals(entities, messageRequest.entities) &&
        Objects.equals(intents, messageRequest.intents) &&
        Objects.equals(output, messageRequest.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, alternateIntents, context, entities, intents, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRequest {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    alternateIntents: ").append(toIndentedString(alternateIntents)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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

