package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class EmotionScores   {
  
  private BigDecimal anger = null;
  private BigDecimal disgust = null;
  private BigDecimal fear = null;
  private BigDecimal joy = null;
  private BigDecimal sadness = null;

  /**
   * Anger score from 0 to 1. A higher score means that the text is more likely to convey anger
   **/
  public EmotionScores anger(BigDecimal anger) {
    this.anger = anger;
    return this;
  }

  
  @ApiModelProperty(value = "Anger score from 0 to 1. A higher score means that the text is more likely to convey anger")
  @JsonProperty("anger")
  public BigDecimal getAnger() {
    return anger;
  }
  public void setAnger(BigDecimal anger) {
    this.anger = anger;
  }

  /**
   * Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust
   **/
  public EmotionScores disgust(BigDecimal disgust) {
    this.disgust = disgust;
    return this;
  }

  
  @ApiModelProperty(value = "Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust")
  @JsonProperty("disgust")
  public BigDecimal getDisgust() {
    return disgust;
  }
  public void setDisgust(BigDecimal disgust) {
    this.disgust = disgust;
  }

  /**
   * Fear score from 0 to 1. A higher score means that the text is more likely to convey fear
   **/
  public EmotionScores fear(BigDecimal fear) {
    this.fear = fear;
    return this;
  }

  
  @ApiModelProperty(value = "Fear score from 0 to 1. A higher score means that the text is more likely to convey fear")
  @JsonProperty("fear")
  public BigDecimal getFear() {
    return fear;
  }
  public void setFear(BigDecimal fear) {
    this.fear = fear;
  }

  /**
   * Joy score from 0 to 1. A higher score means that the text is more likely to convey joy
   **/
  public EmotionScores joy(BigDecimal joy) {
    this.joy = joy;
    return this;
  }

  
  @ApiModelProperty(value = "Joy score from 0 to 1. A higher score means that the text is more likely to convey joy")
  @JsonProperty("joy")
  public BigDecimal getJoy() {
    return joy;
  }
  public void setJoy(BigDecimal joy) {
    this.joy = joy;
  }

  /**
   * Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness
   **/
  public EmotionScores sadness(BigDecimal sadness) {
    this.sadness = sadness;
    return this;
  }

  
  @ApiModelProperty(value = "Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness")
  @JsonProperty("sadness")
  public BigDecimal getSadness() {
    return sadness;
  }
  public void setSadness(BigDecimal sadness) {
    this.sadness = sadness;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmotionScores emotionScores = (EmotionScores) o;
    return Objects.equals(anger, emotionScores.anger) &&
        Objects.equals(disgust, emotionScores.disgust) &&
        Objects.equals(fear, emotionScores.fear) &&
        Objects.equals(joy, emotionScores.joy) &&
        Objects.equals(sadness, emotionScores.sadness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anger, disgust, fear, joy, sadness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmotionScores {\n");
    
    sb.append("    anger: ").append(toIndentedString(anger)).append("\n");
    sb.append("    disgust: ").append(toIndentedString(disgust)).append("\n");
    sb.append("    fear: ").append(toIndentedString(fear)).append("\n");
    sb.append("    joy: ").append(toIndentedString(joy)).append("\n");
    sb.append("    sadness: ").append(toIndentedString(sadness)).append("\n");
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

