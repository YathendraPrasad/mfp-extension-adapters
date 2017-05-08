package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.SemanticRolesAction;
import com.ibm.mfp.adapters.sample.model.SemanticRolesObject;
import com.ibm.mfp.adapters.sample.model.SemanticRolesSubject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * The object containing the actions and the objects the actions act upon
 **/

@ApiModel(description = "The object containing the actions and the objects the actions act upon")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public class SemanticRolesResult   {
  
  private String sentence = null;
  private SemanticRolesSubject subject = null;
  private SemanticRolesAction action = null;
  private SemanticRolesObject object = null;

  /**
   * Sentence from the source that contains the subject, action, and object
   **/
  public SemanticRolesResult sentence(String sentence) {
    this.sentence = sentence;
    return this;
  }

  
  @ApiModelProperty(value = "Sentence from the source that contains the subject, action, and object")
  @JsonProperty("sentence")
  public String getSentence() {
    return sentence;
  }
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }

  /**
   * The extracted subject from the sentence
   **/
  public SemanticRolesResult subject(SemanticRolesSubject subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(value = "The extracted subject from the sentence")
  @JsonProperty("subject")
  public SemanticRolesSubject getSubject() {
    return subject;
  }
  public void setSubject(SemanticRolesSubject subject) {
    this.subject = subject;
  }

  /**
   * The extracted action from the sentence
   **/
  public SemanticRolesResult action(SemanticRolesAction action) {
    this.action = action;
    return this;
  }

  
  @ApiModelProperty(value = "The extracted action from the sentence")
  @JsonProperty("action")
  public SemanticRolesAction getAction() {
    return action;
  }
  public void setAction(SemanticRolesAction action) {
    this.action = action;
  }

  /**
   * The extracted object from the sentence
   **/
  public SemanticRolesResult object(SemanticRolesObject object) {
    this.object = object;
    return this;
  }

  
  @ApiModelProperty(value = "The extracted object from the sentence")
  @JsonProperty("object")
  public SemanticRolesObject getObject() {
    return object;
  }
  public void setObject(SemanticRolesObject object) {
    this.object = object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticRolesResult semanticRolesResult = (SemanticRolesResult) o;
    return Objects.equals(sentence, semanticRolesResult.sentence) &&
        Objects.equals(subject, semanticRolesResult.subject) &&
        Objects.equals(action, semanticRolesResult.action) &&
        Objects.equals(object, semanticRolesResult.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentence, subject, action, object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticRolesResult {\n");
    
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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

