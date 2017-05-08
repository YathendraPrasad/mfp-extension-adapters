package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.PaginationResponse;
import com.ibm.mfp.adapters.sample.model.SynonymResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class SynonymCollectionResponse   {
  
  private List<SynonymResponse> synonyms = new ArrayList<SynonymResponse>();
  private PaginationResponse pagination = null;

  /**
   * An array of synonyms.
   **/
  public SynonymCollectionResponse synonyms(List<SynonymResponse> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "An array of synonyms.")
  @JsonProperty("synonyms")
  public List<SynonymResponse> getSynonyms() {
    return synonyms;
  }
  public void setSynonyms(List<SynonymResponse> synonyms) {
    this.synonyms = synonyms;
  }

  /**
   **/
  public SynonymCollectionResponse pagination(PaginationResponse pagination) {
    this.pagination = pagination;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pagination")
  public PaginationResponse getPagination() {
    return pagination;
  }
  public void setPagination(PaginationResponse pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynonymCollectionResponse synonymCollectionResponse = (SynonymCollectionResponse) o;
    return Objects.equals(synonyms, synonymCollectionResponse.synonyms) &&
        Objects.equals(pagination, synonymCollectionResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(synonyms, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynonymCollectionResponse {\n");
    
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

