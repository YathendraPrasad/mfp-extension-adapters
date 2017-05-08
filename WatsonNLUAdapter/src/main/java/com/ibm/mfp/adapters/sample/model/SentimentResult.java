package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.DocumentSentimentResults;
import com.ibm.mfp.adapters.sample.model.TargetedSentimentResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * The sentiment of the content
 **/

@ApiModel(description = "The sentiment of the content")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class SentimentResult   {
  
  private DocumentSentimentResults document = null;
  private List<TargetedSentimentResults> targets = new ArrayList<TargetedSentimentResults>();

  /**
   * The document level sentiment
   **/
  public SentimentResult document(DocumentSentimentResults document) {
    this.document = document;
    return this;
  }

  
  @ApiModelProperty(value = "The document level sentiment")
  @JsonProperty("document")
  public DocumentSentimentResults getDocument() {
    return document;
  }
  public void setDocument(DocumentSentimentResults document) {
    this.document = document;
  }

  /**
   * The targeted sentiment to analyze
   **/
  public SentimentResult targets(List<TargetedSentimentResults> targets) {
    this.targets = targets;
    return this;
  }

  
  @ApiModelProperty(value = "The targeted sentiment to analyze")
  @JsonProperty("targets")
  public List<TargetedSentimentResults> getTargets() {
    return targets;
  }
  public void setTargets(List<TargetedSentimentResults> targets) {
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
    SentimentResult sentimentResult = (SentimentResult) o;
    return Objects.equals(document, sentimentResult.document) &&
        Objects.equals(targets, sentimentResult.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentResult {\n");
    
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

