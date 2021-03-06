/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


/*
 * Natural Language Understanding
 * Analyze various features of text content at scale. Provide text, raw HTML, or a public URL, and IBM Watson Natural Language Understanding will give you results for the features you request. The service cleans HTML content before analysis by default, so the results can ignore most advertisements and other unwanted content.    ### Concepts  Identify general concepts that are referenced or alluded to in your content. Concepts that are detected typically have an associated link to a DBpedia resource.    ### Entities  Detect important people, places, geopolitical entities and other types of entities in your content. Entity detection recognizes consecutive coreferences of each entity. For example, analysis of the following text would count \"Barack Obama\" and \"He\" as the same entity:    \"Barack Obama was the 44th President of the United States. He took office in January 2009.\"    ### Keywords  Determine the most important keywords in your content. Keyword phrases are organized by relevance in the results.    ### Categories  Categorize your content into a hierarchical 5-level taxonomy. For example, \"Leonardo DiCaprio won an Oscar\" returns \"/art and entertainment/movies and tv/movies\" as the most confident classification.    ### Sentiment  Determine whether your content conveys postive or negative sentiment. Sentiment information can be returned for detected entities, keywords, or user-specified target phrases found in the text.    ### Emotion  Detect anger, disgust, fear, joy, or sadness that is conveyed by your content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text.    ### Relations  Recognize when two entities are related, and identify the type of relation.  For example, you can identify an \"awardedTo\" relation between an award and its recipient.    ### Semantic Roles  Parse sentences into subject-action-object form, and identify entities and keywords that are subjects or objects of an action.    ### Metadata  Get author information, publication date, and the title of your text/HTML content.  
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

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
import javax.validation.constraints.*;

/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


/**
 * The detected anger, disgust, fear, joy, or sadness that is conveyed by the content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text
 */
@ApiModel(description = "The detected anger, disgust, fear, joy, or sadness that is conveyed by the content. Emotion information can be returned for detected entities, keywords, or user-specified target phrases found in the text")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-07-18T18:06:10.304+05:30")
public class EmotionResult   {
  @JsonProperty("document")
  private DocumentEmotionResults document = null;

  @JsonProperty("targets")
  private List<TargetedEmotionResults> targets = null;

  public EmotionResult document(DocumentEmotionResults document) {
    this.document = document;
    return this;
  }

   /**
   * The returned emotion results across the document
   * @return document
  **/
  @JsonProperty("document")
  @ApiModelProperty(value = "The returned emotion results across the document")
  public DocumentEmotionResults getDocument() {
    return document;
  }

  public void setDocument(DocumentEmotionResults document) {
    this.document = document;
  }

  public EmotionResult targets(List<TargetedEmotionResults> targets) {
    this.targets = targets;
    return this;
  }

  public EmotionResult addTargetsItem(TargetedEmotionResults targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<TargetedEmotionResults>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * The returned emotion results per specified target
   * @return targets
  **/
  @JsonProperty("targets")
  @ApiModelProperty(value = "The returned emotion results per specified target")
  public List<TargetedEmotionResults> getTargets() {
    return targets;
  }

  public void setTargets(List<TargetedEmotionResults> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmotionResult emotionResult = (EmotionResult) o;
    return Objects.equals(this.document, emotionResult.document) &&
        Objects.equals(this.targets, emotionResult.targets);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

