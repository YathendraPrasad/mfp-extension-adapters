package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Whether or not to analyze content for general concepts that are referenced or alluded to
 **/

@ApiModel(description = "Whether or not to analyze content for general concepts that are referenced or alluded to")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class ConceptsOptions   {
  
  private Integer limit = null;

  /**
   * Maximum number of concepts to return
   **/
  public ConceptsOptions limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum number of concepts to return")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConceptsOptions conceptsOptions = (ConceptsOptions) o;
    return Objects.equals(limit, conceptsOptions.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConceptsOptions {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

