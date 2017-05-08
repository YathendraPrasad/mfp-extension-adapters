package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Whether or not to return important people, places, geopolitical, and other entities detected in the analyzed content
 **/

@ApiModel(description = "Whether or not to return important people, places, geopolitical, and other entities detected in the analyzed content")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class EntitiesOptions   {
  
  private Integer limit = null;
  private String model = "alchemy";
  private Boolean sentiment = false;
  private Boolean emotion = false;

  /**
   * Maximum number of entities to return
   **/
  public EntitiesOptions limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum number of entities to return")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * Enter a custom model ID to override the standard entity detection model
   **/
  public EntitiesOptions model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "Enter a custom model ID to override the standard entity detection model")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Set this to true to return sentiment information for detected entities
   **/
  public EntitiesOptions sentiment(Boolean sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  
  @ApiModelProperty(value = "Set this to true to return sentiment information for detected entities")
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
  public EntitiesOptions emotion(Boolean emotion) {
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
    EntitiesOptions entitiesOptions = (EntitiesOptions) o;
    return Objects.equals(limit, entitiesOptions.limit) &&
        Objects.equals(model, entitiesOptions.model) &&
        Objects.equals(sentiment, entitiesOptions.sentiment) &&
        Objects.equals(emotion, entitiesOptions.emotion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, model, sentiment, emotion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitiesOptions {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

