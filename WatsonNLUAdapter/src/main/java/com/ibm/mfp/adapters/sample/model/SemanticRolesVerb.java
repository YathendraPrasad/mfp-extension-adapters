package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class SemanticRolesVerb   {
  
  private String text = null;
  private String tense = null;

  /**
   * The keyword text
   **/
  public SemanticRolesVerb text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "The keyword text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Verb tense
   **/
  public SemanticRolesVerb tense(String tense) {
    this.tense = tense;
    return this;
  }

  
  @ApiModelProperty(value = "Verb tense")
  @JsonProperty("tense")
  public String getTense() {
    return tense;
  }
  public void setTense(String tense) {
    this.tense = tense;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticRolesVerb semanticRolesVerb = (SemanticRolesVerb) o;
    return Objects.equals(text, semanticRolesVerb.text) &&
        Objects.equals(tense, semanticRolesVerb.tense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, tense);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticRolesVerb {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    tense: ").append(toIndentedString(tense)).append("\n");
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

