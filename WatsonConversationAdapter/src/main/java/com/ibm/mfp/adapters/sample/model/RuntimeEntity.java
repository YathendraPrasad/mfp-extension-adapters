package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * A term from the request that was identified as an entity.
 **/

@ApiModel(description = "A term from the request that was identified as an entity.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class RuntimeEntity   {
  
  private String entity = null;
  private List<Integer> location = new ArrayList<Integer>();
  private String value = null;
  private BigDecimal confidence = null;

  /**
   * The recognized entity from a term in the input.
   **/
  public RuntimeEntity entity(String entity) {
    this.entity = entity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The recognized entity from a term in the input.")
  @JsonProperty("entity")
  public String getEntity() {
    return entity;
  }
  public void setEntity(String entity) {
    this.entity = entity;
  }

  /**
   * Zero-based character offsets that indicate where the entity value begins and ends in the input text.
   **/
  public RuntimeEntity location(List<Integer> location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Zero-based character offsets that indicate where the entity value begins and ends in the input text.")
  @JsonProperty("location")
  public List<Integer> getLocation() {
    return location;
  }
  public void setLocation(List<Integer> location) {
    this.location = location;
  }

  /**
   * The term in the input text that was recognized.
   **/
  public RuntimeEntity value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The term in the input text that was recognized.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * A decimal percentage that represents Watson's confidence in the entity.
   **/
  public RuntimeEntity confidence(BigDecimal confidence) {
    this.confidence = confidence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A decimal percentage that represents Watson's confidence in the entity.")
  @JsonProperty("confidence")
  public BigDecimal getConfidence() {
    return confidence;
  }
  public void setConfidence(BigDecimal confidence) {
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
    RuntimeEntity runtimeEntity = (RuntimeEntity) o;
    return Objects.equals(entity, runtimeEntity.entity) &&
        Objects.equals(location, runtimeEntity.location) &&
        Objects.equals(value, runtimeEntity.value) &&
        Objects.equals(confidence, runtimeEntity.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, location, value, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeEntity {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

