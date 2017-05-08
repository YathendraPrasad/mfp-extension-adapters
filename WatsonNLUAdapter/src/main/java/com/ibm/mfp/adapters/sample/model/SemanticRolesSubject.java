package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.SemanticRolesEntity;
import com.ibm.mfp.adapters.sample.model.SemanticRolesKeyword;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class SemanticRolesSubject   {
  
  private String text = null;
  private List<SemanticRolesEntity> entities = new ArrayList<SemanticRolesEntity>();
  private List<SemanticRolesKeyword> keywords = new ArrayList<SemanticRolesKeyword>();

  /**
   * Text that corresponds to the subject role
   **/
  public SemanticRolesSubject text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "Text that corresponds to the subject role")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public SemanticRolesSubject entities(List<SemanticRolesEntity> entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("entities")
  public List<SemanticRolesEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<SemanticRolesEntity> entities) {
    this.entities = entities;
  }

  /**
   **/
  public SemanticRolesSubject keywords(List<SemanticRolesKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keywords")
  public List<SemanticRolesKeyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<SemanticRolesKeyword> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticRolesSubject semanticRolesSubject = (SemanticRolesSubject) o;
    return Objects.equals(text, semanticRolesSubject.text) &&
        Objects.equals(entities, semanticRolesSubject.entities) &&
        Objects.equals(keywords, semanticRolesSubject.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, entities, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticRolesSubject {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

