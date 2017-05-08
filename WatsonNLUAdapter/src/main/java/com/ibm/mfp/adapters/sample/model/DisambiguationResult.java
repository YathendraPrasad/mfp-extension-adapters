package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.DBpediaResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Disambiguation information for the entity
 **/

@ApiModel(description = "Disambiguation information for the entity")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class DisambiguationResult   {
  
  private String name = null;
  private DBpediaResource dbpediaResource = null;
  private List<String> subtype = new ArrayList<String>();

  /**
   * Common entity name
   **/
  public DisambiguationResult name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Common entity name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Link to the corresponding DBpedia resource
   **/
  public DisambiguationResult dbpediaResource(DBpediaResource dbpediaResource) {
    this.dbpediaResource = dbpediaResource;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the corresponding DBpedia resource")
  @JsonProperty("dbpedia_resource")
  public DBpediaResource getDbpediaResource() {
    return dbpediaResource;
  }
  public void setDbpediaResource(DBpediaResource dbpediaResource) {
    this.dbpediaResource = dbpediaResource;
  }

  /**
   * Entity subtype information
   **/
  public DisambiguationResult subtype(List<String> subtype) {
    this.subtype = subtype;
    return this;
  }

  
  @ApiModelProperty(value = "Entity subtype information")
  @JsonProperty("subtype")
  public List<String> getSubtype() {
    return subtype;
  }
  public void setSubtype(List<String> subtype) {
    this.subtype = subtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisambiguationResult disambiguationResult = (DisambiguationResult) o;
    return Objects.equals(name, disambiguationResult.name) &&
        Objects.equals(dbpediaResource, disambiguationResult.dbpediaResource) &&
        Objects.equals(subtype, disambiguationResult.subtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dbpediaResource, subtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisambiguationResult {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dbpediaResource: ").append(toIndentedString(dbpediaResource)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
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

