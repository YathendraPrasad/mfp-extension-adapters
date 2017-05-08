package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class BaseSynonym   {
  
  private String synonym = null;

  /**
   * The text of the synonym.
   **/
  public BaseSynonym synonym(String synonym) {
    this.synonym = synonym;
    return this;
  }

  
  @ApiModelProperty(value = "The text of the synonym.")
  @JsonProperty("synonym")
  public String getSynonym() {
    return synonym;
  }
  public void setSynonym(String synonym) {
    this.synonym = synonym;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseSynonym baseSynonym = (BaseSynonym) o;
    return Objects.equals(synonym, baseSynonym.synonym);
  }

  @Override
  public int hashCode() {
    return Objects.hash(synonym);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseSynonym {\n");
    
    sb.append("    synonym: ").append(toIndentedString(synonym)).append("\n");
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

