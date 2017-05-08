package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.DBpediaResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * The general concepts referenced or alluded to in the specified content
 **/

@ApiModel(description = "The general concepts referenced or alluded to in the specified content")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class ConceptsResult   {
  
  private String text = null;
  private BigDecimal relevance = null;
  private DBpediaResource dbpediaResource = null;

  /**
   * Name of the concept
   **/
  public ConceptsResult text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the concept")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Relevance score between 0 and 1. Higher scores indicate greater relevance
   **/
  public ConceptsResult relevance(BigDecimal relevance) {
    this.relevance = relevance;
    return this;
  }

  
  @ApiModelProperty(value = "Relevance score between 0 and 1. Higher scores indicate greater relevance")
  @JsonProperty("relevance")
  public BigDecimal getRelevance() {
    return relevance;
  }
  public void setRelevance(BigDecimal relevance) {
    this.relevance = relevance;
  }

  /**
   * Link to the corresponding DBpedia resource
   **/
  public ConceptsResult dbpediaResource(DBpediaResource dbpediaResource) {
    this.dbpediaResource = dbpediaResource;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the corresponding DBpedia resource")
  @JsonProperty("dbpedia_resource")
  public DBpediaResource getDbpediaResource() {
    return dbpediaResource;
  }
  public void setDbpediaResource(DBpediaResource dbpediaResource) {
    this.dbpediaResource = dbpediaResource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptsResult conceptsResult = (ConceptsResult) o;
    return Objects.equals(text, conceptsResult.text) &&
        Objects.equals(relevance, conceptsResult.relevance) &&
        Objects.equals(dbpediaResource, conceptsResult.dbpediaResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, relevance, dbpediaResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptsResult {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
    sb.append("    dbpediaResource: ").append(toIndentedString(dbpediaResource)).append("\n");
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

