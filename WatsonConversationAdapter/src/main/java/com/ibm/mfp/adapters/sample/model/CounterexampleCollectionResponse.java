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
public class CounterexampleCollectionResponse   {
  
  private List<ExampleResponse> counterexamples = new ArrayList<ExampleResponse>();
  private PaginationResponse pagination = null;

  /**
   **/
  public CounterexampleCollectionResponse counterexamples(List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("counterexamples")
  public List<ExampleResponse> getCounterexamples() {
    return counterexamples;
  }
  public void setCounterexamples(List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
  }

  /**
   **/
  public CounterexampleCollectionResponse pagination(PaginationResponse pagination) {
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
    CounterexampleCollectionResponse counterexampleCollectionResponse = (CounterexampleCollectionResponse) o;
    return Objects.equals(counterexamples, counterexampleCollectionResponse.counterexamples) &&
        Objects.equals(pagination, counterexampleCollectionResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterexamples, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterexampleCollectionResponse {\n");
    
    sb.append("    counterexamples: ").append(toIndentedString(counterexamples)).append("\n");
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

