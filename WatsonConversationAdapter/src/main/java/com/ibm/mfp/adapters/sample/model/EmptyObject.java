package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class EmptyObject   {
  
  private String empty = null;

  /**
   * empty object
   **/
  public EmptyObject empty(String empty) {
    this.empty = empty;
    return this;
  }

  
  @ApiModelProperty(value = "empty object")
  @JsonProperty("empty")
  public String getEmpty() {
    return empty;
  }
  public void setEmpty(String empty) {
    this.empty = empty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmptyObject emptyObject = (EmptyObject) o;
    return Objects.equals(empty, emptyObject.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmptyObject {\n");
    
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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

