package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.IntentExportResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class IntentCollection   {
  
  private List<IntentExportResponse> intents = new ArrayList<IntentExportResponse>();

  /**
   * An array of intents.
   **/
  public IntentCollection intents(List<IntentExportResponse> intents) {
    this.intents = intents;
    return this;
  }

  
  @ApiModelProperty(value = "An array of intents.")
  @JsonProperty("intents")
  public List<IntentExportResponse> getIntents() {
    return intents;
  }
  public void setIntents(List<IntentExportResponse> intents) {
    this.intents = intents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentCollection intentCollection = (IntentCollection) o;
    return Objects.equals(intents, intentCollection.intents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentCollection {\n");
    
    sb.append("    intents: ").append(toIndentedString(intents)).append("\n");
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

