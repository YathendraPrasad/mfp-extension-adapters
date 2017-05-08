package com.ibm.mfp.adapters.sample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.mfp.adapters.sample.model.PaginationResponse;
import com.ibm.mfp.adapters.sample.model.WorkspaceResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public class WorkspaceCollectionResponse   {
  
  private List<WorkspaceResponse> workspaces = new ArrayList<WorkspaceResponse>();
  private PaginationResponse pagination = null;

  /**
   * An array of workspaces.
   **/
  public WorkspaceCollectionResponse workspaces(List<WorkspaceResponse> workspaces) {
    this.workspaces = workspaces;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "An array of workspaces.")
  @JsonProperty("workspaces")
  public List<WorkspaceResponse> getWorkspaces() {
    return workspaces;
  }
  public void setWorkspaces(List<WorkspaceResponse> workspaces) {
    this.workspaces = workspaces;
  }

  /**
   **/
  public WorkspaceCollectionResponse pagination(PaginationResponse pagination) {
    this.pagination = pagination;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pagination")
  public PaginationResponse getPagination() {
    return pagination;
  }
  public void setPagination(PaginationResponse pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceCollectionResponse workspaceCollectionResponse = (WorkspaceCollectionResponse) o;
    return Objects.equals(workspaces, workspaceCollectionResponse.workspaces) &&
        Objects.equals(pagination, workspaceCollectionResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaces, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceCollectionResponse {\n");
    
    sb.append("    workspaces: ").append(toIndentedString(workspaces)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

