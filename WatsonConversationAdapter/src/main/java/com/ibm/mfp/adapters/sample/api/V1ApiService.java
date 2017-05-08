package com.ibm.mfp.adapters.sample.api;

import com.ibm.mfp.adapters.sample.api.*;
import com.ibm.mfp.adapters.sample.model.*;



import com.ibm.mfp.adapters.sample.model.CounterexampleCollectionResponse;
import com.ibm.mfp.adapters.sample.model.CreateEntity;
import com.ibm.mfp.adapters.sample.model.CreateExample;
import com.ibm.mfp.adapters.sample.model.CreateIntent;
import com.ibm.mfp.adapters.sample.model.CreateSynonym;
import com.ibm.mfp.adapters.sample.model.CreateValue;
import com.ibm.mfp.adapters.sample.model.CreateWorkspace;
import com.ibm.mfp.adapters.sample.model.EmptyObject;
import com.ibm.mfp.adapters.sample.model.EntityCollectionResponse;
import com.ibm.mfp.adapters.sample.model.EntityExportResponse;
import com.ibm.mfp.adapters.sample.model.EntityResponse;
import com.ibm.mfp.adapters.sample.model.ErrorResponse;
import com.ibm.mfp.adapters.sample.model.ExampleCollectionResponse;
import com.ibm.mfp.adapters.sample.model.ExampleResponse;
import com.ibm.mfp.adapters.sample.model.IntentCollectionResponse;
import com.ibm.mfp.adapters.sample.model.IntentExportResponse;
import com.ibm.mfp.adapters.sample.model.IntentResponse;
import com.ibm.mfp.adapters.sample.model.LogCollectionResponse;
import com.ibm.mfp.adapters.sample.model.MessageRequest;
import com.ibm.mfp.adapters.sample.model.MessageResponse;
import com.ibm.mfp.adapters.sample.model.SynonymCollectionResponse;
import com.ibm.mfp.adapters.sample.model.SynonymResponse;
import com.ibm.mfp.adapters.sample.model.UpdateEntity;
import com.ibm.mfp.adapters.sample.model.UpdateExample;
import com.ibm.mfp.adapters.sample.model.UpdateIntent;
import com.ibm.mfp.adapters.sample.model.UpdateSynonym;
import com.ibm.mfp.adapters.sample.model.UpdateValue;
import com.ibm.mfp.adapters.sample.model.UpdateWorkspace;
import com.ibm.mfp.adapters.sample.model.ValueCollectionResponse;
import com.ibm.mfp.adapters.sample.model.ValueExportResponse;
import com.ibm.mfp.adapters.sample.model.ValueResponse;
import com.ibm.mfp.adapters.sample.model.WorkspaceCollectionResponse;
import com.ibm.mfp.adapters.sample.model.WorkspaceExportResponse;
import com.ibm.mfp.adapters.sample.model.WorkspaceResponse;

import java.util.List;
import com.ibm.mfp.adapters.sample.api.NotFoundException;

import java.io.InputStream;
import com.sun.jersey.multipart.*;
import com.sun.jersey.core.header.*;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")
public interface V1ApiService {
      public Response createCounterexample(String workspaceId,String version,CreateExample body,SecurityContext securityContext)
      throws NotFoundException;
      public Response createEntity(String workspaceId,String version,CreateEntity body,SecurityContext securityContext)
      throws NotFoundException;
      public Response createExample(String workspaceId,String intent,String version,CreateExample body,SecurityContext securityContext)
      throws NotFoundException;
      public Response createIntent(String workspaceId,String version,CreateIntent body,SecurityContext securityContext)
      throws NotFoundException;
      public Response createSynonym(String workspaceId,String entity,String value,String version,CreateSynonym body,SecurityContext securityContext)
      throws NotFoundException;
      public Response createValue(String workspaceId,String entity,String version,CreateValue body,SecurityContext securityContext)
      throws NotFoundException;
      public Response createWorkspace(String version,CreateWorkspace body,SecurityContext securityContext)
      throws NotFoundException;
      public Response deleteCounterexample(String workspaceId,String text,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response deleteEntity(String workspaceId,String entity,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response deleteExample(String workspaceId,String intent,String text,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response deleteIntent(String workspaceId,String intent,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response deleteSynonym(String workspaceId,String entity,String value,String synonym,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response deleteValue(String workspaceId,String entity,String value,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response deleteWorkspace(String workspaceId,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response getCounterexample(String workspaceId,String text,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response getEntity(String workspaceId,String entity,String version,Boolean export,SecurityContext securityContext)
      throws NotFoundException;
      public Response getExample(String workspaceId,String intent,String text,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response getIntent(String workspaceId,String intent,String version,Boolean export,SecurityContext securityContext)
      throws NotFoundException;
      public Response getSynonym(String workspaceId,String entity,String value,String synonym,String version,SecurityContext securityContext)
      throws NotFoundException;
      public Response getValue(String workspaceId,String entity,String value,String version,Boolean export,SecurityContext securityContext)
      throws NotFoundException;
      public Response getWorkspace(String workspaceId,String version,Boolean export,SecurityContext securityContext)
      throws NotFoundException;
      public Response listCounterexamples(String workspaceId,String version,Integer pageLimit,Boolean includeCount,String sort,String cursor,SecurityContext securityContext)
      throws NotFoundException;
      public Response listEntities(String workspaceId,String version,Boolean export,Integer pageLimit,Boolean includeCount,String sort,String cursor,SecurityContext securityContext)
      throws NotFoundException;
      public Response listExamples(String workspaceId,String intent,String version,Integer pageLimit,Boolean includeCount,String sort,String cursor,SecurityContext securityContext)
      throws NotFoundException;
      public Response listIntents(String workspaceId,String version,Boolean export,Integer pageLimit,Boolean includeCount,String sort,String cursor,SecurityContext securityContext)
      throws NotFoundException;
      public Response listSynonyms(String workspaceId,String entity,String value,String version,Integer pageLimit,Boolean includeCount,String sort,String cursor,SecurityContext securityContext)
      throws NotFoundException;
      public Response listValues(String workspaceId,String entity,String version,Boolean export,Integer pageLimit,Boolean includeCount,String sort,String cursor,SecurityContext securityContext)
      throws NotFoundException;
      public Response listWorkspaces(String version,Integer pageLimit,Boolean includeCount,String sort,String cursor,SecurityContext securityContext)
      throws NotFoundException;
      public Response message(String workspaceId,String version,MessageRequest body,SecurityContext securityContext)
      throws NotFoundException;
      public Response updateCounterexample(String workspaceId,String text,String version,UpdateExample body,SecurityContext securityContext)
      throws NotFoundException;
      public Response updateEntity(String workspaceId,String entity,String version,UpdateEntity body,SecurityContext securityContext)
      throws NotFoundException;
      public Response updateExample(String workspaceId,String intent,String text,String version,UpdateExample body,SecurityContext securityContext)
      throws NotFoundException;
      public Response updateIntent(String workspaceId,String intent,String version,UpdateIntent body,SecurityContext securityContext)
      throws NotFoundException;
      public Response updateSynonym(String workspaceId,String entity,String value,String synonym,String version,UpdateSynonym body,SecurityContext securityContext)
      throws NotFoundException;
      public Response updateValue(String workspaceId,String entity,String value,String version,UpdateValue body,SecurityContext securityContext)
      throws NotFoundException;
      public Response updateWorkspace(String workspaceId,String version,UpdateWorkspace body,SecurityContext securityContext)
      throws NotFoundException;
      public Response v1WorkspacesWorkspaceIdLogsGet(String workspaceId,String version,String sort,String filter,Integer pageLimit,String cursor,SecurityContext securityContext)
      throws NotFoundException;
}
