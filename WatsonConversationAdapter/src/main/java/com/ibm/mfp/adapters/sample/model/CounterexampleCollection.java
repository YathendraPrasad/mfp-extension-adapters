package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.ExampleResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class CounterexampleCollection   {
  
  private List<ExampleResponse> counterexamples = new ArrayList<ExampleResponse>();

  /**
   * An array of counterexamples.
   **/
  public CounterexampleCollection counterexamples(List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
    return this;
  }

  
  @ApiModelProperty(value = "An array of counterexamples.")
  @JsonProperty("counterexamples")
  public List<ExampleResponse> getCounterexamples() {
    return counterexamples;
  }
  public void setCounterexamples(List<ExampleResponse> counterexamples) {
    this.counterexamples = counterexamples;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterexampleCollection counterexampleCollection = (CounterexampleCollection) o;
    return Objects.equals(counterexamples, counterexampleCollection.counterexamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterexamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterexampleCollection {\n");
    
    sb.append("    counterexamples: ").append(toIndentedString(counterexamples)).append("\n");
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

