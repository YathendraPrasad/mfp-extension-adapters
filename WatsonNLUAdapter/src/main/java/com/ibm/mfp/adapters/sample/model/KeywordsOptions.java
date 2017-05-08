package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An option indicating whether or not important keywords from the analyzed content should be returned
 **/

@ApiModel(description = "An option indicating whether or not important keywords from the analyzed content should be returned")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class KeywordsOptions   {
  
  private Integer limit = null;
  private Boolean sentiment = false;
  private Boolean emotion = false;

  /**
   * Maximum number of keywords to return
   **/
  public KeywordsOptions limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum number of keywords to return")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * Set this to true to return sentiment information for detected keywords
   **/
  public KeywordsOptions sentiment(Boolean sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  
  @ApiModelProperty(value = "Set this to true to return sentiment information for detected keywords")
  @JsonProperty("sentiment")
  public Boolean getSentiment() {
    return sentiment;
  }
  public void setSentiment(Boolean sentiment) {
    this.sentiment = sentiment;
  }

  /**
   * Set this to true to analyze emotion for detected keywords
   **/
  public KeywordsOptions emotion(Boolean emotion) {
    this.emotion = emotion;
    return this;
  }

  
  @ApiModelProperty(value = "Set this to true to analyze emotion for detected keywords")
  @JsonProperty("emotion")
  public Boolean getEmotion() {
    return emotion;
  }
  public void setEmotion(Boolean emotion) {
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
    KeywordsOptions keywordsOptions = (KeywordsOptions) o;
    return Objects.equals(limit, keywordsOptions.limit) &&
        Objects.equals(sentiment, keywordsOptions.sentiment) &&
        Objects.equals(emotion, keywordsOptions.emotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, sentiment, emotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsOptions {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
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

