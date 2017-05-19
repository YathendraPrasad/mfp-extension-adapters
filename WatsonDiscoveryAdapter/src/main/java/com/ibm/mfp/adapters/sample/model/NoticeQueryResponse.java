/*
 * Discovery
 * The IBM Watson&trade; Discovery Service is a cognitive search and content analytics engine that you can add to applications to identify patterns, trends and actionable insights to drive better decision-making. Securely unify structured and unstructured data with pre-enriched content, and use a simplified query language to eliminate the need for manual filtering of results. 
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
import com.ibm.mfp.adapters.sample.model.NoticeQueryResult;
import com.ibm.mfp.adapters.sample.model.QueryAggregation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * NoticeQueryResponse
 */
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T15:47:02.385+05:30")
public class NoticeQueryResponse   {
  @JsonProperty("matching_results")
  private Integer matchingResults = null;

  @JsonProperty("results")
  private List<NoticeQueryResult> results = null;

  @JsonProperty("aggregations")
  private List<QueryAggregation> aggregations = null;

  public NoticeQueryResponse matchingResults(Integer matchingResults) {
    this.matchingResults = matchingResults;
    return this;
  }

   /**
   * Get matchingResults
   * @return matchingResults
  **/
  @JsonProperty("matching_results")
  @ApiModelProperty(value = "")

  public Integer getMatchingResults() {
    return matchingResults;
  }

  public void setMatchingResults(Integer matchingResults) {
    this.matchingResults = matchingResults;
  }

  public NoticeQueryResponse results(List<NoticeQueryResult> results) {
    this.results = results;
    return this;
  }

  public NoticeQueryResponse addResultsItem(NoticeQueryResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<NoticeQueryResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @JsonProperty("results")
  @ApiModelProperty(value = "")

  public List<NoticeQueryResult> getResults() {
    return results;
  }

  public void setResults(List<NoticeQueryResult> results) {
    this.results = results;
  }

  public NoticeQueryResponse aggregations(List<QueryAggregation> aggregations) {
    this.aggregations = aggregations;
    return this;
  }

  public NoticeQueryResponse addAggregationsItem(QueryAggregation aggregationsItem) {
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<QueryAggregation>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

   /**
   * Get aggregations
   * @return aggregations
  **/
  @JsonProperty("aggregations")
  @ApiModelProperty(value = "")

  public List<QueryAggregation> getAggregations() {
    return aggregations;
  }

  public void setAggregations(List<QueryAggregation> aggregations) {
    this.aggregations = aggregations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoticeQueryResponse noticeQueryResponse = (NoticeQueryResponse) o;
    return Objects.equals(this.matchingResults, noticeQueryResponse.matchingResults) &&
        Objects.equals(this.results, noticeQueryResponse.results) &&
        Objects.equals(this.aggregations, noticeQueryResponse.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchingResults, results, aggregations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoticeQueryResponse {\n");
    
    sb.append("    matchingResults: ").append(toIndentedString(matchingResults)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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