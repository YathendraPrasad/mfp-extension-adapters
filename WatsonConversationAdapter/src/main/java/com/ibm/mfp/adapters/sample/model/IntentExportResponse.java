package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.ExampleCollection;
import com.ibm.mfp.adapters.sample.model.ExampleResponse;
import com.ibm.mfp.adapters.sample.model.IntentResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class IntentExportResponse   {
  
  private String intent = null;
  private String description = null;
  private String created = null;
  private String updated = null;
  private List<ExampleResponse> examples = new ArrayList<ExampleResponse>();

  /**
   * The name of the intent.
   **/
  public IntentExportResponse intent(String intent) {
    this.intent = intent;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the intent.")
  @JsonProperty("intent")
  public String getIntent() {
    return intent;
  }
  public void setIntent(String intent) {
    this.intent = intent;
  }

  /**
   * The description of the intent.
   **/
  public IntentExportResponse description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The description of the intent.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The timestamp for creation of the intent.
   **/
  public IntentExportResponse created(String created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for creation of the intent.")
  @JsonProperty("created")
  public String getCreated() {
    return created;
  }
  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The timestamp for the last update to the intent.
   **/
  public IntentExportResponse updated(String updated) {
    this.updated = updated;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The timestamp for the last update to the intent.")
  @JsonProperty("updated")
  public String getUpdated() {
    return updated;
  }
  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * An array of user input examples.
   **/
  public IntentExportResponse examples(List<ExampleResponse> examples) {
    this.examples = examples;
    return this;
  }

  
  @ApiModelProperty(value = "An array of user input examples.")
  @JsonProperty("examples")
  public List<ExampleResponse> getExamples() {
    return examples;
  }
  public void setExamples(List<ExampleResponse> examples) {
    this.examples = examples;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntentExportResponse intentExportResponse = (IntentExportResponse) o;
    return Objects.equals(intent, intentExportResponse.intent) &&
        Objects.equals(description, intentExportResponse.description) &&
        Objects.equals(created, intentExportResponse.created) &&
        Objects.equals(updated, intentExportResponse.updated) &&
        Objects.equals(examples, intentExportResponse.examples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, description, created, updated, examples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntentExportResponse {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
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

