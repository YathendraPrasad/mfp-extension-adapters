package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Models available for Relations and Entities features
 **/

@ApiModel(description = "Models available for Relations and Entities features")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class ListModelsResults   {
  
  private List<Model> models = new ArrayList<Model>();

  /**
   **/
  public ListModelsResults models(List<Model> models) {
    this.models = models;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("models")
  public List<Model> getModels() {
    return models;
  }
  public void setModels(List<Model> models) {
    this.models = models;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListModelsResults listModelsResults = (ListModelsResults) o;
    return Objects.equals(models, listModelsResults.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListModelsResults {\n");
    
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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

