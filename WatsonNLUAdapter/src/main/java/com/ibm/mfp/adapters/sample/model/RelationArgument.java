package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.RelationEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class RelationArgument   {
  
  private List<RelationEntity> entities = new ArrayList<RelationEntity>();
  private String text = null;

  /**
   **/
  public RelationArgument entities(List<RelationEntity> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entities")
  public List<RelationEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<RelationEntity> entities) {
    this.entities = entities;
  }

  /**
   * Text that corresponds to the argument
   **/
  public RelationArgument text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Text that corresponds to the argument")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationArgument relationArgument = (RelationArgument) o;
    return Objects.equals(entities, relationArgument.entities) &&
        Objects.equals(text, relationArgument.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationArgument {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

