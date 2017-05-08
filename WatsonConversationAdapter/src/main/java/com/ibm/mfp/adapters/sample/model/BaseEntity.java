package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class BaseEntity   {
  
  private String entity = null;
  private String description = null;
  private Object metadata = null;

  /**
   * The name of the entity.
   **/
  public BaseEntity entity(String entity) {
    this.entity = entity;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the entity.")
  @JsonProperty("entity")
  public String getEntity() {
    return entity;
  }
  public void setEntity(String entity) {
    this.entity = entity;
  }

  /**
   * The description of the entity.
   **/
  public BaseEntity description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "The description of the entity.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Any metadata related to the entity.
   **/
  public BaseEntity metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Any metadata related to the entity.")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseEntity baseEntity = (BaseEntity) o;
    return Objects.equals(entity, baseEntity.entity) &&
        Objects.equals(description, baseEntity.description) &&
        Objects.equals(metadata, baseEntity.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, description, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseEntity {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

