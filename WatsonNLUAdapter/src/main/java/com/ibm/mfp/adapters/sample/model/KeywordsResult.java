package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.EmotionScores;
import com.ibm.mfp.adapters.sample.model.FeatureSentimentResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * The most important keywords in the content, organized by relevance
 **/

@ApiModel(description = "The most important keywords in the content, organized by relevance")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class KeywordsResult   {
  
  private BigDecimal relevance = null;
  private String text = null;
  private EmotionScores emotion = null;
  private FeatureSentimentResults sentiment = null;

  /**
   * Relevance score from 0 to 1. Higher values indicate greater relevance
   **/
  public KeywordsResult relevance(BigDecimal relevance) {
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
   * The keyword text
   **/
  public KeywordsResult text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "The keyword text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Emotion analysis results for the keyword, enabled with the \"emotion\" option
   **/
  public KeywordsResult emotion(EmotionScores emotion) {
    this.emotion = emotion;
    return this;
  }

  
  @ApiModelProperty(value = "Emotion analysis results for the keyword, enabled with the \"emotion\" option")
  @JsonProperty("emotion")
  public EmotionScores getEmotion() {
    return emotion;
  }
  public void setEmotion(EmotionScores emotion) {
    this.emotion = emotion;
  }

  /**
   * Sentiment analysis results for the keyword, enabled with the \"sentiment\" option
   **/
  public KeywordsResult sentiment(FeatureSentimentResults sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  
  @ApiModelProperty(value = "Sentiment analysis results for the keyword, enabled with the \"sentiment\" option")
  @JsonProperty("sentiment")
  public FeatureSentimentResults getSentiment() {
    return sentiment;
  }
  public void setSentiment(FeatureSentimentResults sentiment) {
    this.sentiment = sentiment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordsResult keywordsResult = (KeywordsResult) o;
    return Objects.equals(relevance, keywordsResult.relevance) &&
        Objects.equals(text, keywordsResult.text) &&
        Objects.equals(emotion, keywordsResult.emotion) &&
        Objects.equals(sentiment, keywordsResult.sentiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relevance, text, emotion, sentiment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsResult {\n");
    
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
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

