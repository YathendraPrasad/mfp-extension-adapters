/*
 *  IBM Confidential OCO Source Materials
 *                                                                 
 *  5725-I43 Copyright IBM Corp. 2011, 2017
 *                                                                   
 *  The source code for this program is not published or otherwise
 *  divested of its trade secrets, irrespective of what has
 *  been deposited with the U.S. Copyright Office.
 *                   
 */


package com.ibm.mfp.adapters.sample.api;

import com.ibm.mfp.adapters.sample.*;
import com.ibm.mfp.adapters.sample.api.V1ApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;
import com.ibm.mfp.adapters.sample.StringUtil;

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

import com.ibm.mfp.adapters.sample.api.NotFoundException;

import java.util.*;
import java.io.InputStream;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import com.ibm.mfp.adapter.api.OAuthSecurity;
import com.ibm.mfp.adapter.api.ConfigurationAPI;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/v1")


@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-07-03T17:42:47.987+05:30")
public class V1Api  {
	@Context
        ConfigurationAPI configurationApi;

    @POST
    @Path("/workspaces/{workspace_id}/counterexamples")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create counterexample", notes = "Add a new counterexample to a workspace. Counterexamples are examples that have been marked as irrelevant input.", response = ExampleResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Counterexamples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    public Response createCounterexample(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "A CreateExample object defining the content of the new user input example." ,required=true) CreateExample body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.createCounterexample(workspaceId,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.createCounterexample(workspaceId,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#createCounterexample");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#createCounterexample");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/entities")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create entity", notes = "Create a new entity.", response = EntityResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Entities", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EntityResponse.class) })
    public Response createEntity(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "A CreateEntity object defining the content of the new entity." ,required=true) CreateEntity body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.createEntity(workspaceId,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EntityResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.createEntity(workspaceId,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#createEntity");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#createEntity");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/intents/{intent}/examples")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create user input example", notes = "Add a new user input example to an intent.", response = ExampleResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Examples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    public Response createExample(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "A CreateExample object defining the content of the new user input example." ,required=true) CreateExample body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.createExample(workspaceId,intent,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.createExample(workspaceId,intent,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#createExample");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#createExample");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/intents")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create intent", notes = "Create a new intent.", response = IntentResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Intents", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = IntentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = IntentResponse.class) })
    public Response createIntent(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "A CreateIntent object defining the content of the new intent." ,required=true) CreateIntent body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.createIntent(workspaceId,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.IntentResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.createIntent(workspaceId,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#createIntent");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#createIntent");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/entities/{entity}/values/{value}/synonyms")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add entity value synonym", notes = "Add a new synonym to an entity value.", response = SynonymResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Synonyms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = SynonymResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SynonymResponse.class) })
    public Response createSynonym(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "A CreateSynonym object defining the new synonym for the entity value." ,required=true) CreateSynonym body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.createSynonym(workspaceId,entity,value,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.SynonymResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.createSynonym(workspaceId,entity,value,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#createSynonym");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#createSynonym");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/entities/{entity}/values")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add entity value", notes = "Create a new value for an entity.", response = ValueResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Values", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = ValueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ValueResponse.class) })
    public Response createValue(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "A CreateValue object defining the content of the new value for the entity." ,required=true) CreateValue body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.createValue(workspaceId,entity,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ValueResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.createValue(workspaceId,entity,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#createValue");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#createValue");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create workspace", notes = "Create a workspace based on component objects. You must provide workspace components defining the content of the new workspace.", response = WorkspaceResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Workspaces", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = WorkspaceResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = WorkspaceResponse.class) })
    public Response createWorkspace(@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Valid JSON data defining the content of the new workspace." ) CreateWorkspace body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.createWorkspace(version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.WorkspaceResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.createWorkspace(version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#createWorkspace");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#createWorkspace");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @DELETE
    @Path("/workspaces/{workspace_id}/counterexamples/{text}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete counterexample", notes = "Delete a counterexample from a workspace. Counterexamples are examples that have been marked as irrelevant input.", response = EmptyObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Counterexamples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    public Response deleteCounterexample(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The text of a user input counterexample (for example, `What are you wearing?`).",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.deleteCounterexample(workspaceId,text,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.deleteCounterexample(workspaceId,text,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#deleteCounterexample");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#deleteCounterexample");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @DELETE
    @Path("/workspaces/{workspace_id}/entities/{entity}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete entity", notes = "Delete an entity from a workspace.", response = EmptyObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Entities", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    public Response deleteEntity(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.deleteEntity(workspaceId,entity,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.deleteEntity(workspaceId,entity,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#deleteEntity");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#deleteEntity");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @DELETE
    @Path("/workspaces/{workspace_id}/intents/{intent}/examples/{text}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete user input example", notes = "Delete a user input example from an intent.", response = EmptyObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Examples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request", response = EmptyObject.class) })
    public Response deleteExample(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "The text of the user input example.",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.deleteExample(workspaceId,intent,text,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.deleteExample(workspaceId,intent,text,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#deleteExample");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#deleteExample");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @DELETE
    @Path("/workspaces/{workspace_id}/intents/{intent}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete intent", notes = "Delete an intent from a workspace.", response = EmptyObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Intents", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    public Response deleteIntent(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.deleteIntent(workspaceId,intent,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.deleteIntent(workspaceId,intent,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#deleteIntent");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#deleteIntent");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @DELETE
    @Path("/workspaces/{workspace_id}/entities/{entity}/values/{value}/synonyms/{synonym}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete entity value synonym", notes = "Delete a synonym for an entity value.", response = EmptyObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Synonyms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    public Response deleteSynonym(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "The text of the synonym.",required=true) @PathParam("synonym") String synonym,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.deleteSynonym(workspaceId,entity,value,synonym,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.deleteSynonym(workspaceId,entity,value,synonym,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#deleteSynonym");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#deleteSynonym");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @DELETE
    @Path("/workspaces/{workspace_id}/entities/{entity}/values/{value}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete entity value", notes = "Delete a value for an entity.", response = EmptyObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Values", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    public Response deleteValue(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.deleteValue(workspaceId,entity,value,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.deleteValue(workspaceId,entity,value,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#deleteValue");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#deleteValue");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @DELETE
    @Path("/workspaces/{workspace_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete workspace", notes = "Delete a workspace from the service instance.", response = EmptyObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Workspaces", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    public Response deleteWorkspace(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.deleteWorkspace(workspaceId,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.deleteWorkspace(workspaceId,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#deleteWorkspace");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#deleteWorkspace");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/counterexamples/{text}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get counterexample", notes = "Get information about a counterexample. Counterexamples are examples that have been marked as irrelevant input.", response = ExampleResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Counterexamples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    public Response getCounterexample(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The text of a user input counterexample (for example, `What are you wearing?`).",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.getCounterexample(workspaceId,text,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.getCounterexample(workspaceId,text,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#getCounterexample");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#getCounterexample");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/entities/{entity}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get entity", notes = "Get information about an entity, optionally including all entity content.", response = EntityExportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Entities", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EntityExportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EntityExportResponse.class) })
    public Response getEntity(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.getEntity(workspaceId,entity,version,export,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EntityExportResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.getEntity(workspaceId,entity,version,export);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#getEntity");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#getEntity");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/intents/{intent}/examples/{text}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user input example", notes = "Get information about a user input example.", response = ExampleResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Examples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    public Response getExample(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "The text of the user input example.",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.getExample(workspaceId,intent,text,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.getExample(workspaceId,intent,text,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#getExample");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#getExample");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/intents/{intent}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get intent", notes = "Get information about an intent, optionally including all intent content.", response = IntentExportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Intents", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = IntentExportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = IntentExportResponse.class) })
    public Response getIntent(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.getIntent(workspaceId,intent,version,export,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.IntentExportResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.getIntent(workspaceId,intent,version,export);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#getIntent");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#getIntent");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/entities/{entity}/values/{value}/synonyms/{synonym}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get entity value synonym", notes = "Get information about a synonym for an entity value.", response = SynonymResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Synonyms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = SynonymResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SynonymResponse.class) })
    public Response getSynonym(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "The text of the synonym.",required=true) @PathParam("synonym") String synonym,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.getSynonym(workspaceId,entity,value,synonym,version,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.SynonymResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.getSynonym(workspaceId,entity,value,synonym,version);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#getSynonym");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#getSynonym");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/entities/{entity}/values/{value}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get entity value", notes = "Get information about an entity value.", response = ValueExportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Values", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ValueExportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ValueExportResponse.class) })
    public Response getValue(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.getValue(workspaceId,entity,value,version,export,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ValueExportResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.getValue(workspaceId,entity,value,version,export);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#getValue");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#getValue");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get information about a workspace", notes = "Get information about a workspace, optionally including all workspace content.", response = WorkspaceExportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Workspaces", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = WorkspaceExportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = WorkspaceExportResponse.class) })
    public Response getWorkspace(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.getWorkspace(workspaceId,version,export,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.WorkspaceExportResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.getWorkspace(workspaceId,version,export);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#getWorkspace");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#getWorkspace");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/counterexamples")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List counterexamples", notes = "List the counterexamples for a workspace. Counterexamples are examples that have been marked as irrelevant input.", response = CounterexampleCollectionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Counterexamples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = CounterexampleCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = CounterexampleCollectionResponse.class) })
    public Response listCounterexamples(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.listCounterexamples(workspaceId,version,pageLimit,includeCount,sort,cursor,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.CounterexampleCollectionResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.listCounterexamples(workspaceId,version,pageLimit,includeCount,sort,cursor);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#listCounterexamples");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#listCounterexamples");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/entities")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List entities", notes = "List the entities for a workspace.", response = EntityCollectionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Entities", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EntityCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EntityCollectionResponse.class) })
    public Response listEntities(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.listEntities(workspaceId,version,export,pageLimit,includeCount,sort,cursor,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EntityCollectionResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.listEntities(workspaceId,version,export,pageLimit,includeCount,sort,cursor);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#listEntities");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#listEntities");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/intents/{intent}/examples")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List user input examples", notes = "List the user input examples for an intent.", response = ExampleCollectionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Examples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleCollectionResponse.class) })
    public Response listExamples(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.listExamples(workspaceId,intent,version,pageLimit,includeCount,sort,cursor,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ExampleCollectionResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.listExamples(workspaceId,intent,version,pageLimit,includeCount,sort,cursor);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#listExamples");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#listExamples");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/intents")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List intents", notes = "List the intents for a workspace.", response = IntentCollectionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Intents", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = IntentCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = IntentCollectionResponse.class) })
    public Response listIntents(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.listIntents(workspaceId,version,export,pageLimit,includeCount,sort,cursor,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.IntentCollectionResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.listIntents(workspaceId,version,export,pageLimit,includeCount,sort,cursor);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#listIntents");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#listIntents");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/entities/{entity}/values/{value}/synonyms")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List entity value synonyms", notes = "List the synonyms for an entity value.", response = SynonymCollectionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Synonyms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = SynonymCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SynonymCollectionResponse.class) })
    public Response listSynonyms(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.listSynonyms(workspaceId,entity,value,version,pageLimit,includeCount,sort,cursor,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.SynonymCollectionResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.listSynonyms(workspaceId,entity,value,version,pageLimit,includeCount,sort,cursor);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#listSynonyms");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#listSynonyms");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/entities/{entity}/values")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List entity values", notes = "List the values for an entity.", response = ValueCollectionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Values", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ValueCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ValueCollectionResponse.class) })
    public Response listValues(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.listValues(workspaceId,entity,version,export,pageLimit,includeCount,sort,cursor,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ValueCollectionResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.listValues(workspaceId,entity,version,export,pageLimit,includeCount,sort,cursor);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#listValues");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#listValues");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List workspaces", notes = "List the workspaces associated with a Conversation service instance.", response = WorkspaceCollectionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Workspaces", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = WorkspaceCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = WorkspaceCollectionResponse.class) })
    public Response listWorkspaces(@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.listWorkspaces(version,pageLimit,includeCount,sort,cursor,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.WorkspaceCollectionResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.listWorkspaces(version,pageLimit,includeCount,sort,cursor);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#listWorkspaces");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#listWorkspaces");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/message")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a response to a user's input", notes = "", response = MessageResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Message", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = MessageResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = MessageResponse.class) })
    public Response message(@ApiParam(value = "Unique identifier of the workspace.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "The user's input, with optional intents, entities, and other properties from the response." ) MessageRequest body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.message(workspaceId,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.MessageApi apiInstance = new com.ibm.mfp.adapters.sample.api.MessageApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.MessageResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.message(workspaceId,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#message");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#message");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/counterexamples/{text}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update counterexample", notes = "Update the text of a counterexample. Counterexamples are examples that have been marked as irrelevant input.", response = ExampleResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Counterexamples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    public Response updateCounterexample(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The text of a user input counterexample (for example, `What are you wearing?`).",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "An UpdateExample object defining the new text for the counterexample." ,required=true) UpdateExample body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.updateCounterexample(workspaceId,text,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.updateCounterexample(workspaceId,text,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#updateCounterexample");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#updateCounterexample");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/entities/{entity}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update entity", notes = "Update an existing entity with new or modified data.", response = EntityResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Entities", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EntityResponse.class) })
    public Response updateEntity(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "An UpdateEntity object defining the updated content of the entity." ,required=true) UpdateEntity body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.updateEntity(workspaceId,entity,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.EntityResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.updateEntity(workspaceId,entity,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#updateEntity");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#updateEntity");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/intents/{intent}/examples/{text}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update user input example", notes = "Update the text of a user input example.", response = ExampleResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Examples", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    public Response updateExample(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "The text of the user input example.",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "An UpdateExample object defining the new text for the user input example." ,required=true) UpdateExample body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.updateExample(workspaceId,intent,text,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.updateExample(workspaceId,intent,text,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#updateExample");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#updateExample");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/intents/{intent}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update intent", notes = "Update an existing intent with new or modified data. You must provide JSON data defining the content of the updated intent.", response = IntentResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Intents", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = IntentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = IntentResponse.class) })
    public Response updateIntent(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "An UpdateIntent object defining the updated content of the intent." ,required=true) UpdateIntent body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.updateIntent(workspaceId,intent,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.IntentResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.updateIntent(workspaceId,intent,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#updateIntent");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#updateIntent");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/entities/{entity}/values/{value}/synonyms/{synonym}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update entity value synonym", notes = "Update the information about a synonym for an entity value.", response = SynonymResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Synonyms", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = SynonymResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SynonymResponse.class) })
    public Response updateSynonym(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "The text of the synonym.",required=true) @PathParam("synonym") String synonym,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "An UpdateSynonym object defining the new information for an entity value synonym." ,required=true) UpdateSynonym body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.updateSynonym(workspaceId,entity,value,synonym,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.SynonymResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.updateSynonym(workspaceId,entity,value,synonym,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#updateSynonym");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#updateSynonym");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}/entities/{entity}/values/{value}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update entity value", notes = "Update the content of a value for an entity.", response = ValueResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Values", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ValueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ValueResponse.class) })
    public Response updateValue(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "An UpdateValue object defining the new content for value for the entity." ,required=true) UpdateValue body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.updateValue(workspaceId,entity,value,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.ValueResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.updateValue(workspaceId,entity,value,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#updateValue");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#updateValue");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @POST
    @Path("/workspaces/{workspace_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update workspace", notes = "Update an existing workspace with new or modified data. You must provide component objects defining the content of the updated workspace.", response = WorkspaceResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Workspaces", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = WorkspaceResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = WorkspaceResponse.class) })
    public Response updateWorkspace(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Valid JSON data defining the new workspace content. Any elements included in the new JSON will completely replace the existing elements, including all subelements. Previously existing subelements are not retained unless they are included in the new JSON." ) UpdateWorkspace body,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.updateWorkspace(workspaceId,version,body,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.WorkspaceResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.updateWorkspace(workspaceId,version,body);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#updateWorkspace");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#updateWorkspace");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
    @GET
    @Path("/workspaces/{workspace_id}/logs")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List log events", notes = "", response = LogCollectionResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "Logs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = LogCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = LogCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error.", response = LogCollectionResponse.class) })
    public Response v1WorkspacesWorkspaceIdLogsGet(@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort,@ApiParam(value = "A cacheable parameter that limits the results to those matching the specified filter.") @QueryParam("filter") String filter,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor,@Context SecurityContext securityContext)
    throws NotFoundException {
       // return delegate.v1WorkspacesWorkspaceIdLogsGet(workspaceId,version,sort,filter,pageLimit,cursor,securityContext);
        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.LogsApi apiInstance = new com.ibm.mfp.adapters.sample.api.LogsApi(apiAuthInstance);

         String retval = "NA";
         
         
        com.ibm.mfp.adapters.sample.model.LogCollectionResponse result = null;
        apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
        apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
          try {
            System.out.println("Calling Node server.");
            result = 	apiInstance.v1WorkspacesWorkspaceIdLogsGet(workspaceId,version,sort,filter,pageLimit,cursor);
           System.out.println(result);
           }
           catch (com.ibm.mfp.adapters.sample.ApiException e) {
            System.err.println("Exception when calling V1Api#v1WorkspacesWorkspaceIdLogsGet");
            e.printStackTrace();
            return Response.status(e.getCode()).entity(e.getResponseBody()).build();
           }  
           catch (java.lang.Exception e) {
            System.err.println("Exception when calling V1Api#v1WorkspacesWorkspaceIdLogsGet");
            e.printStackTrace();
            return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
        
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString();
        }
        return Response.ok().entity(result).build();
         
         
    }
}
