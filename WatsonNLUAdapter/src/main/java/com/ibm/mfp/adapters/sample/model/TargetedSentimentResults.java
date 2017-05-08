package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class TargetedSentimentResults   {
  
  private String text = null;
  private BigDecimal score = null;

  /**
   * Targeted text
   **/
  public TargetedSentimentResults text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Targeted text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Sentiment score from -1 (negative) to 1 (positive)
   **/
  public TargetedSentimentResults score(BigDecimal score) {
    this.score = score;
    return this;
  }

  
  @ApiModelProperty(value = "Sentiment score from -1 (negative) to 1 (positive)")
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
    TargetedSentimentResults targetedSentimentResults = (TargetedSentimentResults) o;
    return Objects.equals(text, targetedSentimentResults.text) &&
        Objects.equals(score, targetedSentimentResults.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetedSentimentResults {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

