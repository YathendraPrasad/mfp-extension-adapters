package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An intent identified in the user input.
 **/

@ApiModel(description = "An intent identified in the user input.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class RuntimeIntent   {
  
  private String intent = null;
  private Double confidence = null;

  /**
   * The name of the recognized intent.
   **/
  public RuntimeIntent intent(String intent) {
    this.intent = intent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the recognized intent.")
  @JsonProperty("intent")
  public String getIntent() {
    return intent;
  }
  public void setIntent(String intent) {
    this.intent = intent;
  }

  /**
   * A decimal percentage that represents Watson's confidence in the intent.
   **/
  public RuntimeIntent confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A decimal percentage that represents Watson's confidence in the intent.")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeIntent runtimeIntent = (RuntimeIntent) o;
    return Objects.equals(intent, runtimeIntent.intent) &&
        Objects.equals(confidence, runtimeIntent.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeIntent {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

