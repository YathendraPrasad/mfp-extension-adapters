package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class RuntimeLogMessage   {
  
  private String level = null;
  private String msg = null;

  /**
   * The severity of the message (info, error, or warn).
   **/
  public RuntimeLogMessage level(String level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The severity of the message (info, error, or warn).")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  /**
   * The text of the message.
   **/
  public RuntimeLogMessage msg(String msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text of the message.")
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeLogMessage runtimeLogMessage = (RuntimeLogMessage) o;
    return Objects.equals(level, runtimeLogMessage.level) &&
        Objects.equals(msg, runtimeLogMessage.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeLogMessage {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

