package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * The hierarchical 5-level taxonomy the content is categorized into
 **/

@ApiModel(description = "The hierarchical 5-level taxonomy the content is categorized into")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class CategoriesResult   {
  
  private String label = null;
  private BigDecimal score = null;

  /**
   * The path to the category through the taxonomy hierarchy
   **/
  public CategoriesResult label(String label) {
    this.label = label;
    return this;
  }

  
  @ApiModelProperty(value = "The path to the category through the taxonomy hierarchy")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Confidence score for the category classification. Higher values indicate greater confidence.
   **/
  public CategoriesResult score(BigDecimal score) {
    this.score = score;
    return this;
  }

  
  @ApiModelProperty(value = "Confidence score for the category classification. Higher values indicate greater confidence.")
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoriesResult categoriesResult = (CategoriesResult) o;
    return Objects.equals(label, categoriesResult.label) &&
        Objects.equals(score, categoriesResult.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoriesResult {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

