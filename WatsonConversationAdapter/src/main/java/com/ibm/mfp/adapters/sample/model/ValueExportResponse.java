package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.ValueResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class ValueExportResponse   {
  
  private String value = null;
  private Object metadata = null;
  private String created = null;
  private String updated = null;
  private List<String> synonyms = new ArrayList<String>();

  /**
   * The text of the entity value.
   **/
  public ValueExportResponse value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text of the entity value.")
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
  public ValueExportResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Any metadata related to the entity value.")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * The timestamp for creation of the entity value.
   **/
  public ValueExportResponse created(String created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for creation of the entity value.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp for the last update to the entity value.
   **/
  public ValueExportResponse updated(String updated) {
    this.updated = updated;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for the last update to the entity value.")
  @JsonProperty("updated")
  public String getUpdated() {
    return updated;
  }
  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * An array of synonyms.
   **/
  public ValueExportResponse synonyms(List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  
  @ApiModelProperty(value = "An array of synonyms.")
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
    ValueExportResponse valueExportResponse = (ValueExportResponse) o;
    return Objects.equals(value, valueExportResponse.value) &&
        Objects.equals(metadata, valueExportResponse.metadata) &&
        Objects.equals(created, valueExportResponse.created) &&
        Objects.equals(updated, valueExportResponse.updated) &&
        Objects.equals(synonyms, valueExportResponse.synonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, metadata, created, updated, synonyms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueExportResponse {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

