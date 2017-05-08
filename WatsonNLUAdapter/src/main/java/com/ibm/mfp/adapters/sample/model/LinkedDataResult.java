package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class LinkedDataResult   {
  
  private String source = null;
  private String link = null;

  /**
   * Name of the Linked Data source
   **/
  public LinkedDataResult source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the Linked Data source")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * URL to the Linked Data page
   **/
  public LinkedDataResult link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "URL to the Linked Data page")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedDataResult linkedDataResult = (LinkedDataResult) o;
    return Objects.equals(source, linkedDataResult.source) &&
        Objects.equals(link, linkedDataResult.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedDataResult {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

