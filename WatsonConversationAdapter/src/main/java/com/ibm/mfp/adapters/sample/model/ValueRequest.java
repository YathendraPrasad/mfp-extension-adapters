package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.BaseValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class ValueRequest   {
  
  private String value = null;
  private Object metadata = null;
  private List<String> synonyms = new ArrayList<String>();

  /**
   * The text of the entity value.
   **/
  public ValueRequest value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "The text of the entity value.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Any metadata related to the entity value.
   **/
  public ValueRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Any metadata related to the entity value.")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  public ValueRequest synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("synonyms")
  public List<String> getSynonyms() {
    return synonyms;
  }
  public void setSynonyms(List<String> synonyms) {
    this.synonyms = synonyms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueRequest valueRequest = (ValueRequest) o;
    return Objects.equals(value, valueRequest.value) &&
        Objects.equals(metadata, valueRequest.metadata) &&
        Objects.equals(synonyms, valueRequest.synonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, metadata, synonyms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueRequest {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
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

