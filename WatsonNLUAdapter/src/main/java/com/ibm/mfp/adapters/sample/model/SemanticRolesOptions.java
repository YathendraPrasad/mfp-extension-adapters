package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An option specifying whether or not to identify the subjects, actions, and verbs in the analyzed content
 **/

@ApiModel(description = "An option specifying whether or not to identify the subjects, actions, and verbs in the analyzed content")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class SemanticRolesOptions   {
  
  private Integer limit = null;
  private Boolean keywords = false;
  private Boolean entities = false;

  /**
   * Maximum number of semantic_roles results to return
   **/
  public SemanticRolesOptions limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  
  @ApiModelProperty(value = "Maximum number of semantic_roles results to return")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   * Set this to true to return keyword information for subjects and objects
   **/
  public SemanticRolesOptions keywords(Boolean keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(value = "Set this to true to return keyword information for subjects and objects")
  @JsonProperty("keywords")
  public Boolean getKeywords() {
    return keywords;
  }
  public void setKeywords(Boolean keywords) {
    this.keywords = keywords;
  }

  /**
   * Set this to true to return entity information for subjects and objects
   **/
  public SemanticRolesOptions entities(Boolean entities) {
    this.entities = entities;
    return this;
  }

  
  @ApiModelProperty(value = "Set this to true to return entity information for subjects and objects")
  @JsonProperty("entities")
  public Boolean getEntities() {
    return entities;
  }
  public void setEntities(Boolean entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticRolesOptions semanticRolesOptions = (SemanticRolesOptions) o;
    return Objects.equals(limit, semanticRolesOptions.limit) &&
        Objects.equals(keywords, semanticRolesOptions.keywords) &&
        Objects.equals(entities, semanticRolesOptions.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, keywords, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticRolesOptions {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

