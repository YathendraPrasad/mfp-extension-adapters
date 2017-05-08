package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Log message details.
 **/

@ApiModel(description = "Log message details.")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class LogMessageResponse   {
  


  public enum LevelEnum {
    INFO("info"),
    ERROR("error"),
    WARN("warn");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LevelEnum level = null;
  private String msg = null;

  /**
   * The severity of the message.
   **/
  public LogMessageResponse level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(value = "The severity of the message.")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * The text of the message.
   **/
  public LogMessageResponse msg(String msg) {
    this.msg = msg;
    return this;
  }

  
  @ApiModelProperty(value = "The text of the message.")
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
    LogMessageResponse logMessageResponse = (LogMessageResponse) o;
    return Objects.equals(level, logMessageResponse.level) &&
        Objects.equals(msg, logMessageResponse.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogMessageResponse {\n");
    
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

