package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.EmotionScores;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An object containing the emotion results for the target
 **/

@ApiModel(description = "An object containing the emotion results for the target")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class TargetedEmotionResults   {
  
  private String text = null;
  private EmotionScores emotion = null;

  /**
   * Targeted text
   **/
  public TargetedEmotionResults text(String text) {
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
   * An object containing the emotion results for the target
   **/
  public TargetedEmotionResults emotion(EmotionScores emotion) {
    this.emotion = emotion;
    return this;
  }

  
  @ApiModelProperty(value = "An object containing the emotion results for the target")
  @JsonProperty("emotion")
  public EmotionScores getEmotion() {
    return emotion;
  }
  public void setEmotion(EmotionScores emotion) {
    this.emotion = emotion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetedEmotionResults targetedEmotionResults = (TargetedEmotionResults) o;
    return Objects.equals(text, targetedEmotionResults.text) &&
        Objects.equals(emotion, targetedEmotionResults.emotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, emotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetedEmotionResults {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
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

