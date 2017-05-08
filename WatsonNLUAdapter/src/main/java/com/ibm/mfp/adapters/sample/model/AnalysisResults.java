package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.CategoriesResult;
import com.ibm.mfp.adapters.sample.model.ConceptsResult;
import com.ibm.mfp.adapters.sample.model.EmotionResult;
import com.ibm.mfp.adapters.sample.model.EntitiesResult;
import com.ibm.mfp.adapters.sample.model.FeaturesResults;
import com.ibm.mfp.adapters.sample.model.KeywordsResult;
import com.ibm.mfp.adapters.sample.model.MetadataResult;
import com.ibm.mfp.adapters.sample.model.RelationsResult;
import com.ibm.mfp.adapters.sample.model.SemanticRolesResult;
import com.ibm.mfp.adapters.sample.model.SentimentResult;
import com.ibm.mfp.adapters.sample.model.Usage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Results of the analysis, organized by feature
 **/

@ApiModel(description = "Results of the analysis, organized by feature")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class AnalysisResults   {
  
  private List<ConceptsResult> concepts = new ArrayList<ConceptsResult>();
  private List<EntitiesResult> entities = new ArrayList<EntitiesResult>();
  private List<KeywordsResult> keywords = new ArrayList<KeywordsResult>();
  private List<CategoriesResult> categories = new ArrayList<CategoriesResult>();
  private EmotionResult emotion = null;
  private MetadataResult metadata = null;
  private List<RelationsResult> relations = new ArrayList<RelationsResult>();
  private List<SemanticRolesResult> semanticRoles = new ArrayList<SemanticRolesResult>();
  private SentimentResult sentiment = null;
  private String language = null;
  private String analyzedText = null;
  private String retrievedUrl = null;
  private Usage usage = null;

  /**
   * The general concepts referenced or alluded to in the specified content
   **/
  public AnalysisResults concepts(List<ConceptsResult> concepts) {
    this.concepts = concepts;
    return this;
  }

  
  @ApiModelProperty(value = "The general concepts referenced or alluded to in the specified content")
  @JsonProperty("concepts")
  public List<ConceptsResult> getConcepts() {
    return concepts;
  }
  public void setConcepts(List<ConceptsResult> concepts) {
    this.concepts = concepts;
  }

  /**
   * The important entities in the specified content
   **/
  public AnalysisResults entities(List<EntitiesResult> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "The important entities in the specified content")
  @JsonProperty("entities")
  public List<EntitiesResult> getEntities() {
    return entities;
  }
  public void setEntities(List<EntitiesResult> entities) {
    this.entities = entities;
  }

  /**
   * The important keywords in content organized by relevance
   **/
  public AnalysisResults keywords(List<KeywordsResult> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "The important keywords in content organized by relevance")
  @JsonProperty("keywords")
  public List<KeywordsResult> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<KeywordsResult> keywords) {
    this.keywords = keywords;
  }

  /**
   * The hierarchical 5-level taxonomy the content is categorized into
   **/
  public AnalysisResults categories(List<CategoriesResult> categories) {
    this.categories = categories;
    return this;
  }

  
  @ApiModelProperty(value = "The hierarchical 5-level taxonomy the content is categorized into")
  @JsonProperty("categories")
  public List<CategoriesResult> getCategories() {
    return categories;
  }
  public void setCategories(List<CategoriesResult> categories) {
    this.categories = categories;
  }

  /**
   * The anger, disgust, fear, joy, or sadness conveyed by the content
   **/
  public AnalysisResults emotion(EmotionResult emotion) {
    this.emotion = emotion;
    return this;
  }

  
  @ApiModelProperty(value = "The anger, disgust, fear, joy, or sadness conveyed by the content")
  @JsonProperty("emotion")
  public EmotionResult getEmotion() {
    return emotion;
  }
  public void setEmotion(EmotionResult emotion) {
    this.emotion = emotion;
  }

  /**
   * The metadata holds author information, publication date and the title of the text/HTML content
   **/
  public AnalysisResults metadata(MetadataResult metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "The metadata holds author information, publication date and the title of the text/HTML content")
  @JsonProperty("metadata")
  public MetadataResult getMetadata() {
    return metadata;
  }
  public void setMetadata(MetadataResult metadata) {
    this.metadata = metadata;
  }

  /**
   * The relationships between entities in the content
   **/
  public AnalysisResults relations(List<RelationsResult> relations) {
    this.relations = relations;
    return this;
  }

  
  @ApiModelProperty(value = "The relationships between entities in the content")
  @JsonProperty("relations")
  public List<RelationsResult> getRelations() {
    return relations;
  }
  public void setRelations(List<RelationsResult> relations) {
    this.relations = relations;
  }

  /**
   * The subjects of actions and the objects the actions act upon
   **/
  public AnalysisResults semanticRoles(List<SemanticRolesResult> semanticRoles) {
    this.semanticRoles = semanticRoles;
    return this;
  }

  
  @ApiModelProperty(value = "The subjects of actions and the objects the actions act upon")
  @JsonProperty("semantic_roles")
  public List<SemanticRolesResult> getSemanticRoles() {
    return semanticRoles;
  }
  public void setSemanticRoles(List<SemanticRolesResult> semanticRoles) {
    this.semanticRoles = semanticRoles;
  }

  /**
   * The sentiment of the content
   **/
  public AnalysisResults sentiment(SentimentResult sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  
  @ApiModelProperty(value = "The sentiment of the content")
  @JsonProperty("sentiment")
  public SentimentResult getSentiment() {
    return sentiment;
  }
  public void setSentiment(SentimentResult sentiment) {
    this.sentiment = sentiment;
  }

  /**
   * Language used to analyze the text
   **/
  public AnalysisResults language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(value = "Language used to analyze the text")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Text that was used in the analysis
   **/
  public AnalysisResults analyzedText(String analyzedText) {
    this.analyzedText = analyzedText;
    return this;
  }

  
  @ApiModelProperty(value = "Text that was used in the analysis")
  @JsonProperty("analyzed_text")
  public String getAnalyzedText() {
    return analyzedText;
  }
  public void setAnalyzedText(String analyzedText) {
    this.analyzedText = analyzedText;
  }

  /**
   * URL that was used to retrieve HTML content
   **/
  public AnalysisResults retrievedUrl(String retrievedUrl) {
    this.retrievedUrl = retrievedUrl;
    return this;
  }

  
  @ApiModelProperty(value = "URL that was used to retrieve HTML content")
  @JsonProperty("retrieved_url")
  public String getRetrievedUrl() {
    return retrievedUrl;
  }
  public void setRetrievedUrl(String retrievedUrl) {
    this.retrievedUrl = retrievedUrl;
  }

  /**
   * API usage information for the request
   **/
  public AnalysisResults usage(Usage usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(value = "API usage information for the request")
  @JsonProperty("usage")
  public Usage getUsage() {
    return usage;
  }
  public void setUsage(Usage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisResults analysisResults = (AnalysisResults) o;
    return Objects.equals(concepts, analysisResults.concepts) &&
        Objects.equals(entities, analysisResults.entities) &&
        Objects.equals(keywords, analysisResults.keywords) &&
        Objects.equals(categories, analysisResults.categories) &&
        Objects.equals(emotion, analysisResults.emotion) &&
        Objects.equals(metadata, analysisResults.metadata) &&
        Objects.equals(relations, analysisResults.relations) &&
        Objects.equals(semanticRoles, analysisResults.semanticRoles) &&
        Objects.equals(sentiment, analysisResults.sentiment) &&
        Objects.equals(language, analysisResults.language) &&
        Objects.equals(analyzedText, analysisResults.analyzedText) &&
        Objects.equals(retrievedUrl, analysisResults.retrievedUrl) &&
        Objects.equals(usage, analysisResults.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concepts, entities, keywords, categories, emotion, metadata, relations, semanticRoles, sentiment, language, analyzedText, retrievedUrl, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisResults {\n");
    
    sb.append("    concepts: ").append(toIndentedString(concepts)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    semanticRoles: ").append(toIndentedString(semanticRoles)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    analyzedText: ").append(toIndentedString(analyzedText)).append("\n");
    sb.append("    retrievedUrl: ").append(toIndentedString(retrievedUrl)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

