package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.ExampleResponse;
import com.ibm.mfp.adapters.sample.model.PaginationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class ExampleCollectionResponse   {
  
  private List<ExampleResponse> examples = new ArrayList<ExampleResponse>();
  private PaginationResponse pagination = null;

  /**
   **/
  public ExampleCollectionResponse examples(List<ExampleResponse> examples) {
    this.examples = examples;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("examples")
  public List<ExampleResponse> getExamples() {
    return examples;
  }
  public void setExamples(List<ExampleResponse> examples) {
    this.examples = examples;
  }

  /**
   **/
  public ExampleCollectionResponse pagination(PaginationResponse pagination) {
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
    ExampleCollectionResponse exampleCollectionResponse = (ExampleCollectionResponse) o;
    return Objects.equals(examples, exampleCollectionResponse.examples) &&
        Objects.equals(pagination, exampleCollectionResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(examples, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExampleCollectionResponse {\n");
    
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
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

