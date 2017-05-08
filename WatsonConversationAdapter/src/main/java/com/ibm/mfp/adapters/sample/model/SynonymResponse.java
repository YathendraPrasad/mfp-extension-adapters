package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class SynonymResponse   {
  
  private String synonym = null;
  private String created = null;
  private String updated = null;

  /**
   * The text of the synonym.
   **/
  public SynonymResponse synonym(String synonym) {
    this.synonym = synonym;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text of the synonym.")
  @JsonProperty("synonym")
  public String getSynonym() {
    return synonym;
  }
  public void setSynonym(String synonym) {
    this.synonym = synonym;
  }

  /**
   * The timestamp for creation of the synonym.
   **/
  public SynonymResponse created(String created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for creation of the synonym.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp for the most recent update to the synonym.
   **/
  public SynonymResponse updated(String updated) {
    this.updated = updated;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for the most recent update to the synonym.")
  @JsonProperty("updated")
  public String getUpdated() {
    return updated;
  }
  public void setUpdated(String updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynonymResponse synonymResponse = (SynonymResponse) o;
    return Objects.equals(synonym, synonymResponse.synonym) &&
        Objects.equals(created, synonymResponse.created) &&
        Objects.equals(updated, synonymResponse.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(synonym, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynonymResponse {\n");
    
    sb.append("    synonym: ").append(toIndentedString(synonym)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

