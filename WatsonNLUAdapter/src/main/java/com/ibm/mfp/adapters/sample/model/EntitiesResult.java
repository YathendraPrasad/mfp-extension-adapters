package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.DisambiguationResult;
import com.ibm.mfp.adapters.sample.model.EmotionScores;
import com.ibm.mfp.adapters.sample.model.FeatureSentimentResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * The important people, places, geopolitical entities and other types of entities in your content
 **/

@ApiModel(description = "The important people, places, geopolitical entities and other types of entities in your content")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class EntitiesResult   {
  
  private String type = null;
  private BigDecimal relevance = null;
  private Integer count = null;
  private String text = null;
  private EmotionScores emotion = null;
  private FeatureSentimentResults sentiment = null;
  private DisambiguationResult disambiguation = null;

  /**
   * Entity type
   **/
  public EntitiesResult type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Entity type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Relevance score from 0 to 1. Higher values indicate greater relevance
   **/
  public EntitiesResult relevance(BigDecimal relevance) {
    this.relevance = relevance;
    return this;
  }

  
  @ApiModelProperty(value = "Relevance score from 0 to 1. Higher values indicate greater relevance")
  @JsonProperty("relevance")
  public BigDecimal getRelevance() {
    return relevance;
  }
  public void setRelevance(BigDecimal relevance) {
    this.relevance = relevance;
  }

  /**
   * How many times the entity was mentioned in the text
   **/
  public EntitiesResult count(Integer count) {
    this.count = count;
    return this;
  }

  
  @ApiModelProperty(value = "How many times the entity was mentioned in the text")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * The name of the entity
   **/
  public EntitiesResult text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the entity")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Emotion analysis results for the entity, enabled with the \"emotion\" option
   **/
  public EntitiesResult emotion(EmotionScores emotion) {
    this.emotion = emotion;
    return this;
  }

  
  @ApiModelProperty(value = "Emotion analysis results for the entity, enabled with the \"emotion\" option")
  @JsonProperty("emotion")
  public EmotionScores getEmotion() {
    return emotion;
  }
  public void setEmotion(EmotionScores emotion) {
    this.emotion = emotion;
  }

  /**
   * Sentiment analysis results for the entity, enabled with the \"sentiment\" option
   **/
  public EntitiesResult sentiment(FeatureSentimentResults sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  
  @ApiModelProperty(value = "Sentiment analysis results for the entity, enabled with the \"sentiment\" option")
  @JsonProperty("sentiment")
  public FeatureSentimentResults getSentiment() {
    return sentiment;
  }
  public void setSentiment(FeatureSentimentResults sentiment) {
    this.sentiment = sentiment;
  }

  /**
   * Disambiguation information for the entity
   **/
  public EntitiesResult disambiguation(DisambiguationResult disambiguation) {
    this.disambiguation = disambiguation;
    return this;
  }

  
  @ApiModelProperty(value = "Disambiguation information for the entity")
  @JsonProperty("disambiguation")
  public DisambiguationResult getDisambiguation() {
    return disambiguation;
  }
  public void setDisambiguation(DisambiguationResult disambiguation) {
    this.disambiguation = disambiguation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitiesResult entitiesResult = (EntitiesResult) o;
    return Objects.equals(type, entitiesResult.type) &&
        Objects.equals(relevance, entitiesResult.relevance) &&
        Objects.equals(count, entitiesResult.count) &&
        Objects.equals(text, entitiesResult.text) &&
        Objects.equals(emotion, entitiesResult.emotion) &&
        Objects.equals(sentiment, entitiesResult.sentiment) &&
        Objects.equals(disambiguation, entitiesResult.disambiguation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, relevance, count, text, emotion, sentiment, disambiguation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitiesResult {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    disambiguation: ").append(toIndentedString(disambiguation)).append("\n");
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

