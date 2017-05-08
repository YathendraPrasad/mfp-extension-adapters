package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.SemanticRolesVerb;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class SemanticRolesAction   {
  
  private String text = null;
  private String normalized = null;
  private SemanticRolesVerb verb = null;

  /**
   * Analyzed text that corresponds to the action
   **/
  public SemanticRolesAction text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Analyzed text that corresponds to the action")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * normalized version of the action
   **/
  public SemanticRolesAction normalized(String normalized) {
    this.normalized = normalized;
    return this;
  }

  
  @ApiModelProperty(value = "normalized version of the action")
  @JsonProperty("normalized")
  public String getNormalized() {
    return normalized;
  }
  public void setNormalized(String normalized) {
    this.normalized = normalized;
  }

  /**
   **/
  public SemanticRolesAction verb(SemanticRolesVerb verb) {
    this.verb = verb;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("verb")
  public SemanticRolesVerb getVerb() {
    return verb;
  }
  public void setVerb(SemanticRolesVerb verb) {
    this.verb = verb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticRolesAction semanticRolesAction = (SemanticRolesAction) o;
    return Objects.equals(text, semanticRolesAction.text) &&
        Objects.equals(normalized, semanticRolesAction.normalized) &&
        Objects.equals(verb, semanticRolesAction.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, normalized, verb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticRolesAction {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    normalized: ").append(toIndentedString(normalized)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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

