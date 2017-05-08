package com.ibm.mfp.adapters.sample.api;

import com.ibm.mfp.adapters.sample.model.*;
import com.ibm.mfp.adapters.sample.api.V1ApiService;
import com.ibm.mfp.adapters.sample.api.V1ApiServiceFactoryFinder;

import io.swagger.annotations.ApiParam;

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

import com.ibm.mfp.adapter.api.ConfigurationAPI;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import com.sun.jersey.multipart.*;
import com.sun.jersey.core.header.*;
import java.io.InputStream;

import com.ibm.mfp.adapter.api.OAuthSecurity;


@Path("/v1")


@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T13:53:48.254+05:30")

public class V1Api  {
 @Context
        ConfigurationAPI configurationApi;
   
   private V1ApiService delegate = null;
   
   private V1ApiService getV1ApiService() throws ServiceFactoryFinderException {
   		if ( delegate == null ) {
   			delegate = V1ApiServiceFactoryFinder.findFactoryImpl().getV1ApiService();
   		} 
   		return delegate;
   }
   
    @POST
    @Path("/workspaces/{workspace_id}/counterexamples")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(
    	value = "Create counterexample", 
		notes = "Add a new counterexample to a workspace. Counterexamples are examples that have been marked as irrelevant input.", 
		response = ExampleResponse.class, 
		authorizations = {
        	
    		}, tags={ "Counterexamples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response createCounterexample(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "A CreateExample object defining the content of the new user input example." ,required=true) CreateExample body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().createCounterexample(workspaceId,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.createCounterexample(workspaceId,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#createCounterexample");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Create entity", 
		notes = "", 
		response = EntityResponse.class, 
		authorizations = {
        	
    		}, tags={ "Entities",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EntityResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response createEntity(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "" ,required=true) CreateEntity body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().createEntity(workspaceId,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EntityResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.createEntity(workspaceId,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#createEntity");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Create user input example", 
		notes = "Add a new user input example to an intent.", 
		response = ExampleResponse.class, 
		authorizations = {
        	
    		}, tags={ "Examples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response createExample(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "A CreateExample object defining the content of the new user input example." ,required=true) CreateExample body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().createExample(workspaceId,intent,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.createExample(workspaceId,intent,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#createExample");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Create intent", 
		notes = "Create a new intent.", 
		response = IntentResponse.class, 
		authorizations = {
        	
    		}, tags={ "Intents",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = IntentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = IntentResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response createIntent(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "A CreateIntent object defining the content of the new intent." ,required=true) CreateIntent body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().createIntent(workspaceId,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.IntentResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.createIntent(workspaceId,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#createIntent");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Add entity value synonym", 
		notes = "", 
		response = SynonymResponse.class, 
		authorizations = {
        	
    		}, tags={ "Synonyms",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = SynonymResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SynonymResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response createSynonym(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,
@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "" ,required=true) CreateSynonym body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().createSynonym(workspaceId,entity,value,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.SynonymResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.createSynonym(workspaceId,entity,value,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#createSynonym");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Add entity value", 
		notes = "", 
		response = ValueResponse.class, 
		authorizations = {
        	
    		}, tags={ "Values",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = ValueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ValueResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response createValue(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "" ,required=true) CreateValue body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().createValue(workspaceId,entity,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ValueResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.createValue(workspaceId,entity,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#createValue");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Create workspace", 
		notes = "Create a workspace based on component objects. You must provide workspace components defining the content of the new workspace.", 
		response = WorkspaceResponse.class, 
		authorizations = {
        	
    		}, tags={ "Workspaces",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful request.", response = WorkspaceResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = WorkspaceResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response createWorkspace(@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "Valid JSON data defining the content of the new workspace." ) CreateWorkspace body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().createWorkspace(version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.WorkspaceResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.createWorkspace(version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#createWorkspace");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Delete counterexample", 
		notes = "", 
		response = EmptyObject.class, 
		authorizations = {
        	
    		}, tags={ "Counterexamples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    @OAuthSecurity(enabled=false)   
    public Response deleteCounterexample(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The text of a user input counterexample (for example, `What are you wearing?`).",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().deleteCounterexample(workspaceId,text,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.deleteCounterexample(workspaceId,text,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#deleteCounterexample");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Delete entity", 
		notes = "", 
		response = EmptyObject.class, 
		authorizations = {
        	
    		}, tags={ "Entities",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    @OAuthSecurity(enabled=false)   
    public Response deleteEntity(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().deleteEntity(workspaceId,entity,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.deleteEntity(workspaceId,entity,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#deleteEntity");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Delete user input example", 
		notes = "Delete a user input example from an intent.", 
		response = EmptyObject.class, 
		authorizations = {
        	
    		}, tags={ "Examples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request", response = EmptyObject.class) })
    @OAuthSecurity(enabled=false)   
    public Response deleteExample(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,
@ApiParam(value = "The text of the user input example.",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().deleteExample(workspaceId,intent,text,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.deleteExample(workspaceId,intent,text,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#deleteExample");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Delete intent", 
		notes = "Delete an intent from a workspace.", 
		response = EmptyObject.class, 
		authorizations = {
        	
    		}, tags={ "Intents",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    @OAuthSecurity(enabled=false)   
    public Response deleteIntent(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().deleteIntent(workspaceId,intent,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.deleteIntent(workspaceId,intent,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#deleteIntent");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Delete entity value synonym", 
		notes = "", 
		response = EmptyObject.class, 
		authorizations = {
        	
    		}, tags={ "Synonyms",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    @OAuthSecurity(enabled=false)   
    public Response deleteSynonym(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,
@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,
@ApiParam(value = "The text of the synonym.",required=true) @PathParam("synonym") String synonym,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().deleteSynonym(workspaceId,entity,value,synonym,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.deleteSynonym(workspaceId,entity,value,synonym,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#deleteSynonym");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Delete entity value", 
		notes = "", 
		response = EmptyObject.class, 
		authorizations = {
        	
    		}, tags={ "Values",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    @OAuthSecurity(enabled=false)   
    public Response deleteValue(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,
@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().deleteValue(workspaceId,entity,value,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.deleteValue(workspaceId,entity,value,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#deleteValue");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Delete workspace", 
		notes = "", 
		response = EmptyObject.class, 
		authorizations = {
        	
    		}, tags={ "Workspaces",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EmptyObject.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EmptyObject.class) })
    @OAuthSecurity(enabled=false)   
    public Response deleteWorkspace(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().deleteWorkspace(workspaceId,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EmptyObject result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.deleteWorkspace(workspaceId,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#deleteWorkspace");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Get counterexample", 
		notes = "Get information about a counterexample. Counterexamples are examples that have been marked as irrelevant input.", 
		response = ExampleResponse.class, 
		authorizations = {
        	
    		}, tags={ "Counterexamples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response getCounterexample(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The text of a user input counterexample (for example, `What are you wearing?`).",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().getCounterexample(workspaceId,text,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.getCounterexample(workspaceId,text,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#getCounterexample");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Get entity", 
		notes = "", 
		response = EntityExportResponse.class, 
		authorizations = {
        	
    		}, tags={ "Entities",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EntityExportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EntityExportResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response getEntity(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().getEntity(workspaceId,entity,version,export,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EntityExportResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.getEntity(workspaceId,entity,version,export);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#getEntity");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Get user input example", 
		notes = "Get information about a user input example.", 
		response = ExampleResponse.class, 
		authorizations = {
        	
    		}, tags={ "Examples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response getExample(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,
@ApiParam(value = "The text of the user input example.",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().getExample(workspaceId,intent,text,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.getExample(workspaceId,intent,text,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#getExample");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Get intent", 
		notes = "Get information about an intent, optionally including all intent content.", 
		response = IntentExportResponse.class, 
		authorizations = {
        	
    		}, tags={ "Intents",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = IntentExportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = IntentExportResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response getIntent(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().getIntent(workspaceId,intent,version,export,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.IntentExportResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.getIntent(workspaceId,intent,version,export);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#getIntent");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Get entity value synonym", 
		notes = "", 
		response = SynonymResponse.class, 
		authorizations = {
        	
    		}, tags={ "Synonyms",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = SynonymResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SynonymResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response getSynonym(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,
@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,
@ApiParam(value = "The text of the synonym.",required=true) @PathParam("synonym") String synonym,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().getSynonym(workspaceId,entity,value,synonym,version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.SynonymResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.getSynonym(workspaceId,entity,value,synonym,version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#getSynonym");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Get entity value", 
		notes = "", 
		response = ValueExportResponse.class, 
		authorizations = {
        	
    		}, tags={ "Values",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ValueExportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ValueExportResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response getValue(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,
@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().getValue(workspaceId,entity,value,version,export,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ValueExportResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.getValue(workspaceId,entity,value,version,export);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#getValue");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Get information about a workspace", 
		notes = "Get information about a workspace, optionally including all workspace content.", 
		response = WorkspaceExportResponse.class, 
		authorizations = {
        	
    		}, tags={ "Workspaces",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = WorkspaceExportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = WorkspaceExportResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response getWorkspace(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().getWorkspace(workspaceId,version,export,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.WorkspaceExportResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.getWorkspace(workspaceId,version,export);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#getWorkspace");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "List counterexamples", 
		notes = "List the counterexamples for a workspace. Counterexamples are examples that have been marked as irrelevant input.", 
		response = CounterexampleCollectionResponse.class, 
		authorizations = {
        	
    		}, tags={ "Counterexamples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = CounterexampleCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = CounterexampleCollectionResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response listCounterexamples(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit
,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount
,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort
,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().listCounterexamples(workspaceId,version,pageLimit,includeCount,sort,cursor,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.CounterexampleCollectionResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.listCounterexamples(workspaceId,version,pageLimit,includeCount,sort,cursor);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#listCounterexamples");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "List entities", 
		notes = "", 
		response = EntityCollectionResponse.class, 
		authorizations = {
        	
    		}, tags={ "Entities",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EntityCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EntityCollectionResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response listEntities(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export
,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit
,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount
,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort
,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().listEntities(workspaceId,version,export,pageLimit,includeCount,sort,cursor,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EntityCollectionResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.listEntities(workspaceId,version,export,pageLimit,includeCount,sort,cursor);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#listEntities");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "List user input examples", 
		notes = "List the user input examples for an intent.", 
		response = ExampleCollectionResponse.class, 
		authorizations = {
        	
    		}, tags={ "Examples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleCollectionResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response listExamples(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit
,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount
,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort
,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().listExamples(workspaceId,intent,version,pageLimit,includeCount,sort,cursor,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ExampleCollectionResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.listExamples(workspaceId,intent,version,pageLimit,includeCount,sort,cursor);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#listExamples");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "List intents", 
		notes = "List the intents for a workspace.", 
		response = IntentCollectionResponse.class, 
		authorizations = {
        	
    		}, tags={ "Intents",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = IntentCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = IntentCollectionResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response listIntents(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export
,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit
,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount
,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort
,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().listIntents(workspaceId,version,export,pageLimit,includeCount,sort,cursor,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.IntentCollectionResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.listIntents(workspaceId,version,export,pageLimit,includeCount,sort,cursor);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#listIntents");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "List entity value synonyms", 
		notes = "", 
		response = SynonymCollectionResponse.class, 
		authorizations = {
        	
    		}, tags={ "Synonyms",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = SynonymCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SynonymCollectionResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response listSynonyms(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,
@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit
,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount
,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort
,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().listSynonyms(workspaceId,entity,value,version,pageLimit,includeCount,sort,cursor,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.SynonymCollectionResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.listSynonyms(workspaceId,entity,value,version,pageLimit,includeCount,sort,cursor);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#listSynonyms");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "List entity values", 
		notes = "", 
		response = ValueCollectionResponse.class, 
		authorizations = {
        	
    		}, tags={ "Values",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ValueCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ValueCollectionResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response listValues(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "Whether to include all element content in the returned data. If export=`false`, the returned data includes only information about the element itself. If export=`true`, all content, including subelements, is included. The default value is `false`.", defaultValue="false") @DefaultValue("false") @QueryParam("export") Boolean export
,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit
,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount
,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort
,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().listValues(workspaceId,entity,version,export,pageLimit,includeCount,sort,cursor,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ValueCollectionResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.listValues(workspaceId,entity,version,export,pageLimit,includeCount,sort,cursor);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#listValues");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "List workspaces", 
		notes = "List the workspaces associated with a Conversation service instance.", 
		response = WorkspaceCollectionResponse.class, 
		authorizations = {
        	
    		}, tags={ "Workspaces",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = WorkspaceCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = WorkspaceCollectionResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response listWorkspaces(@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit
,@ApiParam(value = "Whether to include information about the number of records returned.", defaultValue="false") @DefaultValue("false") @QueryParam("include_count") Boolean includeCount
,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort
,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().listWorkspaces(version,pageLimit,includeCount,sort,cursor,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.WorkspaceCollectionResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.listWorkspaces(version,pageLimit,includeCount,sort,cursor);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#listWorkspaces");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Get a response to a user's input", 
		notes = "", 
		response = MessageResponse.class, 
		authorizations = {
        	
    		}, tags={ "Message",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = MessageResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = MessageResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response message(
@ApiParam(value = "Unique identifier of the workspace.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "The user's input, with optional intents, entities, and other properties from the response." ) MessageRequest body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().message(workspaceId,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.MessageApi apiInstance = new com.ibm.mfp.adapters.sample.api.MessageApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.MessageResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.message(workspaceId,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#message");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Update counterexample", 
		notes = "Update the text of a counterexample. Counterexamples are examples that have been marked as irrelevant input.", 
		response = ExampleResponse.class, 
		authorizations = {
        	
    		}, tags={ "Counterexamples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response updateCounterexample(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The text of a user input counterexample (for example, `What are you wearing?`).",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "An UpdateExample object defining the new text for the counterexample." ,required=true) UpdateExample body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().updateCounterexample(workspaceId,text,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.CounterexamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.CounterexamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.updateCounterexample(workspaceId,text,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#updateCounterexample");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Update entity", 
		notes = "", 
		response = EntityResponse.class, 
		authorizations = {
        	
    		}, tags={ "Entities",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = EntityResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = EntityResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response updateEntity(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "" ,required=true) UpdateEntity body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().updateEntity(workspaceId,entity,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.EntitiesApi apiInstance = new com.ibm.mfp.adapters.sample.api.EntitiesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.EntityResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.updateEntity(workspaceId,entity,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#updateEntity");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Update user input example", 
		notes = "Update the text of a user input example.", 
		response = ExampleResponse.class, 
		authorizations = {
        	
    		}, tags={ "Examples",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ExampleResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ExampleResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response updateExample(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,
@ApiParam(value = "The text of the user input example.",required=true) @PathParam("text") String text,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "An UpdateExample object defining the new text for the user input example." ,required=true) UpdateExample body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().updateExample(workspaceId,intent,text,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ExamplesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ExamplesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ExampleResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.updateExample(workspaceId,intent,text,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#updateExample");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Update intent", 
		notes = "Update an existing intent with new or modified data. You must provide JSON data defining the content of the updated intent.", 
		response = IntentResponse.class, 
		authorizations = {
        	
    		}, tags={ "Intents",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = IntentResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = IntentResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response updateIntent(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The intent name (for example, `pizza_order`).",required=true) @PathParam("intent") String intent,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "An UpdateIntent object defining the updated content of the intent." ,required=true) UpdateIntent body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().updateIntent(workspaceId,intent,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.IntentsApi apiInstance = new com.ibm.mfp.adapters.sample.api.IntentsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.IntentResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.updateIntent(workspaceId,intent,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#updateIntent");
            e.printStackTrace();
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
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(
    	value = "Update entity value synonym", 
		notes = "", 
		response = SynonymResponse.class, 
		authorizations = {
        	
    		}, tags={ "Synonyms",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = SynonymResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = SynonymResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response updateSynonym(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,
@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,
@ApiParam(value = "The text of the synonym.",required=true) @PathParam("synonym") String synonym,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "" ,required=true) UpdateSynonym body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().updateSynonym(workspaceId,entity,value,synonym,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.SynonymsApi apiInstance = new com.ibm.mfp.adapters.sample.api.SynonymsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.SynonymResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.updateSynonym(workspaceId,entity,value,synonym,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#updateSynonym");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Update entity value", 
		notes = "", 
		response = ValueResponse.class, 
		authorizations = {
        	
    		}, tags={ "Values",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = ValueResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = ValueResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response updateValue(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,
@ApiParam(value = "The name of the entity.",required=true) @PathParam("entity") String entity,
@ApiParam(value = "The text of the entity value.",required=true) @PathParam("value") String value,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "" ,required=true) UpdateValue body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().updateValue(workspaceId,entity,value,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ValuesApi apiInstance = new com.ibm.mfp.adapters.sample.api.ValuesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ValueResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.updateValue(workspaceId,entity,value,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#updateValue");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "Update workspace", 
		notes = "Update an existing workspace with new or modified data. You must provide component objects defining the content of the updated workspace.", 
		response = WorkspaceResponse.class, 
		authorizations = {
        	
    		}, tags={ "Workspaces",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = WorkspaceResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = WorkspaceResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response updateWorkspace(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,
						@ApiParam(value = "Valid JSON data defining the new workspace content. Any elements included in the new JSON will completely replace the existing elements, including all subelements. Previously existing subelements are not retained unless they are included in the new JSON." ) UpdateWorkspace body)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().updateWorkspace(workspaceId,version,body,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.WorkspacesApi apiInstance = new com.ibm.mfp.adapters.sample.api.WorkspacesApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.WorkspaceResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.updateWorkspace(workspaceId,version,body);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#updateWorkspace");
            e.printStackTrace();
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
    @io.swagger.annotations.ApiOperation(
    	value = "List log events", 
		notes = "", 
		response = LogCollectionResponse.class, 
		authorizations = {
        	
    		}, tags={ "Logs" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful request.", response = LogCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request.", response = LogCollectionResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error.", response = LogCollectionResponse.class) })
    @OAuthSecurity(enabled=false)   
    public Response v1WorkspacesWorkspaceIdLogsGet(
@ApiParam(value = "The workspace ID.",required=true) @PathParam("workspace_id") String workspaceId,@ApiParam(value = "Release date of the API version in YYYY-MM-DD format.",required=true, defaultValue="2017-04-21") @DefaultValue("2017-04-21") @QueryParam("version") String version
,@ApiParam(value = "Sorts the response according to the value of the specified property, in ascending or descending order.") @QueryParam("sort") String sort
,@ApiParam(value = "A cacheable parameter that limits the results to those matching the specified filter.") @QueryParam("filter") String filter
,@ApiParam(value = "The number of records to return in each page of results. The default page limit is 100.") @QueryParam("page_limit") Integer pageLimit
,@ApiParam(value = "A token identifying the last value from the previous page of results.") @QueryParam("cursor") String cursor
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().v1WorkspacesWorkspaceIdLogsGet(workspaceId,version,sort,filter,pageLimit,cursor,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.LogsApi apiInstance = new com.ibm.mfp.adapters.sample.api.LogsApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.LogCollectionResponse result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.v1WorkspacesWorkspaceIdLogsGet(workspaceId,version,sort,filter,pageLimit,cursor);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#v1WorkspacesWorkspaceIdLogsGet");
            e.printStackTrace();
        }
        System.out.println("Return from Node server: "+ result);
        if (result != null)
        {
            retval = result.toString(); 
        } 
        return Response.ok().entity(result).build();
    }
}
