package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.EmotionScores;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An object containing the emotion results of a document
 **/

@ApiModel(description = "An object containing the emotion results of a document")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class DocumentEmotionResults   {
  
  private EmotionScores emotion = null;

  /**
   * An object containing the emotion results for the document
   **/
  public DocumentEmotionResults emotion(EmotionScores emotion) {
    this.emotion = emotion;
    return this;
  }

  
  @ApiModelProperty(value = "An object containing the emotion results for the document")
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
    DocumentEmotionResults documentEmotionResults = (DocumentEmotionResults) o;
    return Objects.equals(emotion, documentEmotionResults.emotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEmotionResults {\n");
    
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

