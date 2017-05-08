package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The entities extracted from a sentence in a given document
 **/

@ApiModel(description = "The entities extracted from a sentence in a given document")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class RelationEntity   {
  
  private String text = null;
  private String type = null;

  /**
   * Text that corresponds to the entity
   **/
  public RelationEntity text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Text that corresponds to the entity")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Entity type
   **/
  public RelationEntity type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Entity type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationEntity relationEntity = (RelationEntity) o;
    return Objects.equals(text, relationEntity.text) &&
        Objects.equals(type, relationEntity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationEntity {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

