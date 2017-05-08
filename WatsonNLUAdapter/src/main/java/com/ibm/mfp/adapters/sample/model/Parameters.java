package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.Features;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An object containing request parameters
 **/

@ApiModel(description = "An object containing request parameters")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class Parameters   {
  
  private String text = null;
  private String html = null;
  private String url = null;
  private Features features = null;
  private Boolean clean = true;
  private String xpath = null;
  private Boolean fallbackToRaw = true;
  private Boolean returnAnalyzedText = false;
  private String language = null;

  /**
   * The plain text to analyze
   **/
  public Parameters text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(value = "The plain text to analyze")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * The HTML file to analyze
   **/
  public Parameters html(String html) {
    this.html = html;
    return this;
  }

  
  @ApiModelProperty(value = "The HTML file to analyze")
  @JsonProperty("html")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }

  /**
   * The web page to analyze
   **/
  public Parameters url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "The web page to analyze")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Specific features to analyze the document for
   **/
  public Parameters features(Features features) {
    this.features = features;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Specific features to analyze the document for")
  @JsonProperty("features")
  public Features getFeatures() {
    return features;
  }
  public void setFeatures(Features features) {
    this.features = features;
  }

  /**
   * Remove website elements, such as links, ads, etc
   **/
  public Parameters clean(Boolean clean) {
    this.clean = clean;
    return this;
  }

  
  @ApiModelProperty(value = "Remove website elements, such as links, ads, etc")
  @JsonProperty("clean")
  public Boolean getClean() {
    return clean;
  }
  public void setClean(Boolean clean) {
    this.clean = clean;
  }

  /**
   * XPath query for targeting nodes in HTML
   **/
  public Parameters xpath(String xpath) {
    this.xpath = xpath;
    return this;
  }

  
  @ApiModelProperty(value = "XPath query for targeting nodes in HTML")
  @JsonProperty("xpath")
  public String getXpath() {
    return xpath;
  }
  public void setXpath(String xpath) {
    this.xpath = xpath;
  }

  /**
   * Whether to use raw HTML content if text cleaning fails
   **/
  public Parameters fallbackToRaw(Boolean fallbackToRaw) {
    this.fallbackToRaw = fallbackToRaw;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to use raw HTML content if text cleaning fails")
  @JsonProperty("fallback_to_raw")
  public Boolean getFallbackToRaw() {
    return fallbackToRaw;
  }
  public void setFallbackToRaw(Boolean fallbackToRaw) {
    this.fallbackToRaw = fallbackToRaw;
  }

  /**
   * Whether or not to return the analyzed text
   **/
  public Parameters returnAnalyzedText(Boolean returnAnalyzedText) {
    this.returnAnalyzedText = returnAnalyzedText;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to return the analyzed text")
  @JsonProperty("return_analyzed_text")
  public Boolean getReturnAnalyzedText() {
    return returnAnalyzedText;
  }
  public void setReturnAnalyzedText(Boolean returnAnalyzedText) {
    this.returnAnalyzedText = returnAnalyzedText;
  }

  /**
   * ISO 639-1 code indicating the language to use in the analysis
   **/
  public Parameters language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(value = "ISO 639-1 code indicating the language to use in the analysis")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameters parameters = (Parameters) o;
    return Objects.equals(text, parameters.text) &&
        Objects.equals(html, parameters.html) &&
        Objects.equals(url, parameters.url) &&
        Objects.equals(features, parameters.features) &&
        Objects.equals(clean, parameters.clean) &&
        Objects.equals(xpath, parameters.xpath) &&
        Objects.equals(fallbackToRaw, parameters.fallbackToRaw) &&
        Objects.equals(returnAnalyzedText, parameters.returnAnalyzedText) &&
        Objects.equals(language, parameters.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, html, url, features, clean, xpath, fallbackToRaw, returnAnalyzedText, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameters {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    clean: ").append(toIndentedString(clean)).append("\n");
    sb.append("    xpath: ").append(toIndentedString(xpath)).append("\n");
    sb.append("    fallbackToRaw: ").append(toIndentedString(fallbackToRaw)).append("\n");
    sb.append("    returnAnalyzedText: ").append(toIndentedString(returnAnalyzedText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

