package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.DocumentEmotionResults;
import com.ibm.mfp.adapters.sample.model.TargetedEmotionResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * The detected anger, disgust, fear, joy, or sadness that is conveyed by the content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text
 **/

@ApiModel(description = "The detected anger, disgust, fear, joy, or sadness that is conveyed by the content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class EmotionResult   {
  
  private DocumentEmotionResults document = null;
  private List<TargetedEmotionResults> targets = new ArrayList<TargetedEmotionResults>();

  /**
   * The returned emotion results across the document
   **/
  public EmotionResult document(DocumentEmotionResults document) {
    this.document = document;
    return this;
  }

  
  @ApiModelProperty(value = "The returned emotion results across the document")
  @JsonProperty("document")
  public DocumentEmotionResults getDocument() {
    return document;
  }
  public void setDocument(DocumentEmotionResults document) {
    this.document = document;
  }

  /**
   * The returned emotion results per specified target
   **/
  public EmotionResult targets(List<TargetedEmotionResults> targets) {
    this.targets = targets;
    return this;
  }

  
  @ApiModelProperty(value = "The returned emotion results per specified target")
  @JsonProperty("targets")
  public List<TargetedEmotionResults> getTargets() {
    return targets;
  }
  public void setTargets(List<TargetedEmotionResults> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmotionResult emotionResult = (EmotionResult) o;
    return Objects.equals(document, emotionResult.document) &&
        Objects.equals(targets, emotionResult.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmotionResult {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

