package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.CategoriesOptions;
import com.ibm.mfp.adapters.sample.model.ConceptsOptions;
import com.ibm.mfp.adapters.sample.model.EmotionOptions;
import com.ibm.mfp.adapters.sample.model.EntitiesOptions;
import com.ibm.mfp.adapters.sample.model.KeywordsOptions;
import com.ibm.mfp.adapters.sample.model.MetadataOptions;
import com.ibm.mfp.adapters.sample.model.RelationsOptions;
import com.ibm.mfp.adapters.sample.model.SemanticRolesOptions;
import com.ibm.mfp.adapters.sample.model.SentimentOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Analysis features and options
 **/

@ApiModel(description = "Analysis features and options")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class Features   {
  
  private ConceptsOptions concepts = null;
  private EmotionOptions emotion = null;
  private EntitiesOptions entities = null;
  private KeywordsOptions keywords = null;
  private MetadataOptions metadata = null;
  private RelationsOptions relations = null;
  private SemanticRolesOptions semanticRoles = null;
  private SentimentOptions sentiment = null;
  private CategoriesOptions categories = null;

  /**
   * Whether or not to return the concepts that are mentioned in the analyzed text
   **/
  public Features concepts(ConceptsOptions concepts) {
    this.concepts = concepts;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to return the concepts that are mentioned in the analyzed text")
  @JsonProperty("concepts")
  public ConceptsOptions getConcepts() {
    return concepts;
  }
  public void setConcepts(ConceptsOptions concepts) {
    this.concepts = concepts;
  }

  /**
   * Whether or not to extract the emotions implied in the analyzed text
   **/
  public Features emotion(EmotionOptions emotion) {
    this.emotion = emotion;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to extract the emotions implied in the analyzed text")
  @JsonProperty("emotion")
  public EmotionOptions getEmotion() {
    return emotion;
  }
  public void setEmotion(EmotionOptions emotion) {
    this.emotion = emotion;
  }

  /**
   * Whether or not to extract detected entity objects from the analyzed text
   **/
  public Features entities(EntitiesOptions entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to extract detected entity objects from the analyzed text")
  @JsonProperty("entities")
  public EntitiesOptions getEntities() {
    return entities;
  }
  public void setEntities(EntitiesOptions entities) {
    this.entities = entities;
  }

  /**
   * Whether or not to return the keywords in the analyzed text
   **/
  public Features keywords(KeywordsOptions keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to return the keywords in the analyzed text")
  @JsonProperty("keywords")
  public KeywordsOptions getKeywords() {
    return keywords;
  }
  public void setKeywords(KeywordsOptions keywords) {
    this.keywords = keywords;
  }

  /**
   * Whether or not the author, publication date, and title of the analyzed text should be returned. This parameter is only available for URL and HTML input
   **/
  public Features metadata(MetadataOptions metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not the author, publication date, and title of the analyzed text should be returned. This parameter is only available for URL and HTML input")
  @JsonProperty("metadata")
  public MetadataOptions getMetadata() {
    return metadata;
  }
  public void setMetadata(MetadataOptions metadata) {
    this.metadata = metadata;
  }

  /**
   * Whether or not to return the relationships between detected entities in the analyzed text
   **/
  public Features relations(RelationsOptions relations) {
    this.relations = relations;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to return the relationships between detected entities in the analyzed text")
  @JsonProperty("relations")
  public RelationsOptions getRelations() {
    return relations;
  }
  public void setRelations(RelationsOptions relations) {
    this.relations = relations;
  }

  /**
   * Whether or not to return the subject-action-object relations from the analyzed text
   **/
  public Features semanticRoles(SemanticRolesOptions semanticRoles) {
    this.semanticRoles = semanticRoles;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to return the subject-action-object relations from the analyzed text")
  @JsonProperty("semantic_roles")
  public SemanticRolesOptions getSemanticRoles() {
    return semanticRoles;
  }
  public void setSemanticRoles(SemanticRolesOptions semanticRoles) {
    this.semanticRoles = semanticRoles;
  }

  /**
   * Whether or not to return the overall sentiment of the analyzed text
   **/
  public Features sentiment(SentimentOptions sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to return the overall sentiment of the analyzed text")
  @JsonProperty("sentiment")
  public SentimentOptions getSentiment() {
    return sentiment;
  }
  public void setSentiment(SentimentOptions sentiment) {
    this.sentiment = sentiment;
  }

  /**
   * Whether or not to return the high level category the content is categorized as (i.e. news, art)
   **/
  public Features categories(CategoriesOptions categories) {
    this.categories = categories;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to return the high level category the content is categorized as (i.e. news, art)")
  @JsonProperty("categories")
  public CategoriesOptions getCategories() {
    return categories;
  }
  public void setCategories(CategoriesOptions categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Features features = (Features) o;
    return Objects.equals(concepts, features.concepts) &&
        Objects.equals(emotion, features.emotion) &&
        Objects.equals(entities, features.entities) &&
        Objects.equals(keywords, features.keywords) &&
        Objects.equals(metadata, features.metadata) &&
        Objects.equals(relations, features.relations) &&
        Objects.equals(semanticRoles, features.semanticRoles) &&
        Objects.equals(sentiment, features.sentiment) &&
        Objects.equals(categories, features.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concepts, emotion, entities, keywords, metadata, relations, semanticRoles, sentiment, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Features {\n");
    
    sb.append("    concepts: ").append(toIndentedString(concepts)).append("\n");
    sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    semanticRoles: ").append(toIndentedString(semanticRoles)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

