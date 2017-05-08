package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.Author;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * The Authors, Publication Date, and Title of the document. Supports URL and HTML input types
 **/

@ApiModel(description = "The Authors, Publication Date, and Title of the document. Supports URL and HTML input types")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class MetadataResult   {
  
  private List<Author> authors = new ArrayList<Author>();
  private String publicationDate = null;
  private String title = null;

  /**
   * The authors of the document
   **/
  public MetadataResult authors(List<Author> authors) {
    this.authors = authors;
    return this;
  }

  
  @ApiModelProperty(value = "The authors of the document")
  @JsonProperty("authors")
  public List<Author> getAuthors() {
    return authors;
  }
  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }

  /**
   * The publication date in the format ISO 8601
   **/
  public MetadataResult publicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
    return this;
  }

  
  @ApiModelProperty(value = "The publication date in the format ISO 8601")
  @JsonProperty("publication_date")
  public String getPublicationDate() {
    return publicationDate;
  }
  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  /**
   * The title of the document
   **/
  public MetadataResult title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "The title of the document")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataResult metadataResult = (MetadataResult) o;
    return Objects.equals(authors, metadataResult.authors) &&
        Objects.equals(publicationDate, metadataResult.publicationDate) &&
        Objects.equals(title, metadataResult.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, publicationDate, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataResult {\n");
    
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    publicationDate: ").append(toIndentedString(publicationDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

