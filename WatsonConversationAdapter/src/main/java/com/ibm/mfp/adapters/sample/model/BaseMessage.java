package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.MessageInput;
import com.ibm.mfp.adapters.sample.model.RuntimeEntity;
import com.ibm.mfp.adapters.sample.model.RuntimeIntent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class BaseMessage   {
  
  private MessageInput input = null;
  private List<RuntimeIntent> intents = new ArrayList<RuntimeIntent>();
  private List<RuntimeEntity> entities = new ArrayList<RuntimeEntity>();
  private Boolean alternateIntents = false;

  /**
   **/
  public BaseMessage input(MessageInput input) {
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
  public BaseMessage intents(List<RuntimeIntent> intents) {
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
  public BaseMessage entities(List<RuntimeEntity> entities) {
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
  public BaseMessage alternateIntents(Boolean alternateIntents) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseMessage baseMessage = (BaseMessage) o;
    return Objects.equals(input, baseMessage.input) &&
        Objects.equals(intents, baseMessage.intents) &&
        Objects.equals(entities, baseMessage.entities) &&
        Objects.equals(alternateIntents, baseMessage.alternateIntents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, intents, entities, alternateIntents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseMessage {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    alternateIntents: ").append(toIndentedString(alternateIntents)).append("\n");
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

