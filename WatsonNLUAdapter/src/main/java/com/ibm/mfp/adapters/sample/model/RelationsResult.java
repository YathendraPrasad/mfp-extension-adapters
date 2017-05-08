package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.RelationArgument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * The relations between entities found in the content
 **/

@ApiModel(description = "The relations between entities found in the content")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class RelationsResult   {
  
  private BigDecimal score = null;
  private String sentence = null;
  private String type = null;
  private List<RelationArgument> arguments = new ArrayList<RelationArgument>();

  /**
   * Confidence score for the relation. Higher values indicate greater confidence.
   **/
  public RelationsResult score(BigDecimal score) {
    this.score = score;
    return this;
  }

  
  @ApiModelProperty(value = "Confidence score for the relation. Higher values indicate greater confidence.")
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * The sentence that contains the relation
   **/
  public RelationsResult sentence(String sentence) {
    this.sentence = sentence;
    return this;
  }

  
  @ApiModelProperty(value = "The sentence that contains the relation")
  @JsonProperty("sentence")
  public String getSentence() {
    return sentence;
  }
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }

  /**
   * The type of the relation
   **/
  public RelationsResult type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of the relation")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * The extracted relation objects from the text
   **/
  public RelationsResult arguments(List<RelationArgument> arguments) {
    this.arguments = arguments;
    return this;
  }

  
  @ApiModelProperty(value = "The extracted relation objects from the text")
  @JsonProperty("arguments")
  public List<RelationArgument> getArguments() {
    return arguments;
  }
  public void setArguments(List<RelationArgument> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationsResult relationsResult = (RelationsResult) o;
    return Objects.equals(score, relationsResult.score) &&
        Objects.equals(sentence, relationsResult.sentence) &&
        Objects.equals(type, relationsResult.type) &&
        Objects.equals(arguments, relationsResult.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, sentence, type, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationsResult {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

