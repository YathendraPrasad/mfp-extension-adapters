package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * An option specifying if sentiment of detected entities, keywords, or phrases should be returned
 **/

@ApiModel(description = "An option specifying if sentiment of detected entities, keywords, or phrases should be returned")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class SentimentOptions   {
  
  private Boolean document = true;
  private List<String> targets = new ArrayList<String>();

  /**
   * Set this to false to hide document-level sentiment results
   **/
  public SentimentOptions document(Boolean document) {
    this.document = document;
    return this;
  }

  
  @ApiModelProperty(value = "Set this to false to hide document-level sentiment results")
  @JsonProperty("document")
  public Boolean getDocument() {
    return document;
  }
  public void setDocument(Boolean document) {
    this.document = document;
  }

  /**
   * Sentiment results will be returned for each target string that is found in the document
   **/
  public SentimentOptions targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  
  @ApiModelProperty(value = "Sentiment results will be returned for each target string that is found in the document")
  @JsonProperty("targets")
  public List<String> getTargets() {
    return targets;
  }
  public void setTargets(List<String> targets) {
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
    SentimentOptions sentimentOptions = (SentimentOptions) o;
    return Objects.equals(document, sentimentOptions.document) &&
        Objects.equals(targets, sentimentOptions.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentimentOptions {\n");
    
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

