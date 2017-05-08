package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class PaginationResponse   {
  
  private String refreshUrl = null;
  private String nextUrl = null;
  private Integer total = null;
  private Integer matched = null;

  /**
   * The URL that will return the same page of results.
   **/
  public PaginationResponse refreshUrl(String refreshUrl) {
    this.refreshUrl = refreshUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URL that will return the same page of results.")
  @JsonProperty("refresh_url")
  public String getRefreshUrl() {
    return refreshUrl;
  }
  public void setRefreshUrl(String refreshUrl) {
    this.refreshUrl = refreshUrl;
  }

  /**
   * The URL that will return the next page of results.
   **/
  public PaginationResponse nextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
    return this;
  }

  
  @ApiModelProperty(value = "The URL that will return the next page of results.")
  @JsonProperty("next_url")
  public String getNextUrl() {
    return nextUrl;
  }
  public void setNextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
  }

  /**
   * Reserved for future use.
   **/
  public PaginationResponse total(Integer total) {
    this.total = total;
    return this;
  }

  
  @ApiModelProperty(value = "Reserved for future use.")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   * Reserved for future use.
   **/
  public PaginationResponse matched(Integer matched) {
    this.matched = matched;
    return this;
  }

  
  @ApiModelProperty(value = "Reserved for future use.")
  @JsonProperty("matched")
  public Integer getMatched() {
    return matched;
  }
  public void setMatched(Integer matched) {
    this.matched = matched;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationResponse paginationResponse = (PaginationResponse) o;
    return Objects.equals(refreshUrl, paginationResponse.refreshUrl) &&
        Objects.equals(nextUrl, paginationResponse.nextUrl) &&
        Objects.equals(total, paginationResponse.total) &&
        Objects.equals(matched, paginationResponse.matched);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshUrl, nextUrl, total, matched);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationResponse {\n");
    
    sb.append("    refreshUrl: ").append(toIndentedString(refreshUrl)).append("\n");
    sb.append("    nextUrl: ").append(toIndentedString(nextUrl)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    matched: ").append(toIndentedString(matched)).append("\n");
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

