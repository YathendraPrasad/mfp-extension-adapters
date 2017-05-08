package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * 
 **/

@ApiModel(description = "")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class Model   {
  
  private String status = null;
  private String modelId = null;
  private String language = null;
  private String description = null;

  /**
   * Shows as available if the model is ready for use
   **/
  public Model status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Shows as available if the model is ready for use")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Unique model ID
   **/
  public Model modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique model ID")
  @JsonProperty("model_id")
  public String getModelId() {
    return modelId;
  }
  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  /**
   * ISO 639-1 code indicating the language of the model
   **/
  public Model language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(value = "ISO 639-1 code indicating the language of the model")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Model description
   **/
  public Model description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Model description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model model = (Model) o;
    return Objects.equals(status, model.status) &&
        Objects.equals(modelId, model.modelId) &&
        Objects.equals(language, model.language) &&
        Objects.equals(description, model.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, modelId, language, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

