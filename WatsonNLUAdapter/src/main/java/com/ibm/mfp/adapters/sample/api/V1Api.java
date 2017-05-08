package com.ibm.mfp.adapters.sample.api;

import com.ibm.mfp.adapters.sample.model.*;
import com.ibm.mfp.adapters.sample.api.V1ApiService;
import com.ibm.mfp.adapters.sample.api.V1ApiServiceFactoryFinder;

import io.swagger.annotations.ApiParam;

import com.ibm.mfp.adapters.sample.model.AnalysisResults;
import com.ibm.mfp.adapters.sample.model.ErrorResponse;
import com.ibm.mfp.adapters.sample.model.InlineResponse200;
import com.ibm.mfp.adapters.sample.model.ListModelsResults;
import com.ibm.mfp.adapters.sample.model.Parameters;

import com.ibm.mfp.adapters.sample.api.NotFoundException;

import com.ibm.mfp.adapter.api.ConfigurationAPI;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import java.util.List;

import com.sun.jersey.multipart.*;
import com.sun.jersey.core.header.*;
import java.io.InputStream;

import com.ibm.mfp.adapter.api.OAuthSecurity;


@Path("/v1")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the v1 API")
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")

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
    @Path("/analyze")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(
    	value = "Analyze text, HTML, or a public webpage", 
		notes = "Analyzes text, HTML, or a public webpage with one or more text analysis features.", 
		response = AnalysisResults.class, 
		authorizations = {
        	
    		}, tags={ "Analyze",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Analysis results", response = AnalysisResults.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request", response = AnalysisResults.class) })
    @OAuthSecurity(enabled=false)   
    public Response analyze(@ApiParam(value = "The release date of the version of the API you want to use. Specify dates in YYYY-MM-DD format.",required=true, defaultValue="2017-02-27") @DefaultValue("2017-02-27") @QueryParam("version") String version
,
						@ApiParam(value = "An object containing request parameters. The `features` object and one of the `text`, `html`, or `url` attributes are required." ) Parameters parameters)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().analyze(version,parameters,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.AnalyzeApi apiInstance = new com.ibm.mfp.adapters.sample.api.AnalyzeApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.AnalysisResults result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.analyze(version,parameters);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#analyze");
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
    @Path("/analyze")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(
    	value = "Analyze text, HTML, or a public webpage", 
		notes = "Analyzes text, HTML, or a public webpage with one or more text analysis features.", 
		response = AnalysisResults.class, 
		authorizations = {
        	
    		}, tags={ "Analyze",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Analysis results", response = AnalysisResults.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request", response = AnalysisResults.class) })
    @OAuthSecurity(enabled=false)   
    public Response analyzeGet(@ApiParam(value = "The release date of the version of the API you want to use. Specify dates in YYYY-MM-DD format.",required=true, defaultValue="2017-02-27") @DefaultValue("2017-02-27") @QueryParam("version") String version
,@ApiParam(value = "Comma separated list of analysis features",required=true) @QueryParam("features") List<String> features
,@ApiParam(value = "Text to analyze") @QueryParam("text") String text
,@ApiParam(value = "HTML to analyze") @QueryParam("html") String html
,@ApiParam(value = "Public webpage to analyze") @QueryParam("url") String url
,@ApiParam(value = "Set this to true to show the analyzed text in the response", defaultValue="false") @DefaultValue("false") @QueryParam("return_analyzed_text") Boolean returnAnalyzedText
,@ApiParam(value = "Set to false to disable text cleaning", defaultValue="true") @DefaultValue("true") @QueryParam("clean") Boolean clean
,@ApiParam(value = "Xpath query for targeting nodes in HTML") @QueryParam("xpath") String xpath
,@ApiParam(value = "Whether to use raw HTML content if text cleaning fails", defaultValue="true") @DefaultValue("true") @QueryParam("fallback_to_raw") Boolean fallbackToRaw
,@ApiParam(value = "ISO 639-1 code indicating the language to use in the analysis") @QueryParam("language") String language
,@ApiParam(value = "Maximum number of concepts to return", defaultValue="8") @DefaultValue("8") @QueryParam("concepts.limit") Integer conceptsLimit
,@ApiParam(value = "Set this to false to hide document-level emotion results", defaultValue="true") @DefaultValue("true") @QueryParam("emotion.document") Boolean emotionDocument
,@ApiParam(value = "Target strings, separated by commas. Emotion results will be returned for each target string found in the document") @QueryParam("emotion.targets") List<String> emotionTargets
,@ApiParam(value = "Maximum number of entities to return", defaultValue="50") @DefaultValue("50") @QueryParam("entities.limit") Integer entitiesLimit
,@ApiParam(value = "Enter a custom model ID to override the standard entity detection model") @QueryParam("entities.model") String entitiesModel
,@ApiParam(value = "Set this to true to return emotion information for detected entities", defaultValue="false") @DefaultValue("false") @QueryParam("entities.emotion") Boolean entitiesEmotion
,@ApiParam(value = "Set this to true to return sentiment information for detected entities", defaultValue="false") @DefaultValue("false") @QueryParam("entities.sentiment") Boolean entitiesSentiment
,@ApiParam(value = "Maximum number of keywords to return", defaultValue="50") @DefaultValue("50") @QueryParam("keywords.limit") Integer keywordsLimit
,@ApiParam(value = "Set this to true to return emotion information for detected keywords", defaultValue="false") @DefaultValue("false") @QueryParam("keywords.emotion") Boolean keywordsEmotion
,@ApiParam(value = "Set this to true to return sentiment information for detected keywords", defaultValue="false") @DefaultValue("false") @QueryParam("keywords.sentiment") Boolean keywordsSentiment
,@ApiParam(value = "Enter a custom model ID to override the default `en-news` relations model", defaultValue="en-news") @DefaultValue("en-news") @QueryParam("relations.model") String relationsModel
,@ApiParam(value = "Maximum number of semantic_roles results to return", defaultValue="50") @DefaultValue("50") @QueryParam("semantic_roles.limit") Integer semanticRolesLimit
,@ApiParam(value = "Set this to true to return entity information for subjects and objects", defaultValue="false") @DefaultValue("false") @QueryParam("semantic_roles.entities") Boolean semanticRolesEntities
,@ApiParam(value = "Set this to true to return keyword information for subjects and objects", defaultValue="false") @DefaultValue("false") @QueryParam("semantic_roles.keywords") Boolean semanticRolesKeywords
,@ApiParam(value = "Set this to false to disable document level sentiment analysis", defaultValue="true") @DefaultValue("true") @QueryParam("sentiment.document") Boolean sentimentDocument
,@ApiParam(value = "Sentiment information will return for each target string that is found in the text") @QueryParam("sentiment.targets") List<String> sentimentTargets
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().analyzeGet(version,features,text,html,url,returnAnalyzedText,clean,xpath,fallbackToRaw,language,conceptsLimit,emotionDocument,emotionTargets,entitiesLimit,entitiesModel,entitiesEmotion,entitiesSentiment,keywordsLimit,keywordsEmotion,keywordsSentiment,relationsModel,semanticRolesLimit,semanticRolesEntities,semanticRolesKeywords,sentimentDocument,sentimentTargets,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.AnalyzeApi apiInstance = new com.ibm.mfp.adapters.sample.api.AnalyzeApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.AnalysisResults result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.analyzeGet(version,features,text,html,url,returnAnalyzedText,clean,xpath,fallbackToRaw,language,conceptsLimit,emotionDocument,emotionTargets,entitiesLimit,entitiesModel,entitiesEmotion,entitiesSentiment,keywordsLimit,keywordsEmotion,keywordsSentiment,relationsModel,semanticRolesLimit,semanticRolesEntities,semanticRolesKeywords,sentimentDocument,sentimentTargets);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#analyzeGet");
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
    @Path("/models/{model_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(
    	value = "Delete model", 
		notes = "Deletes a custom model", 
		response = InlineResponse200.class, 
		authorizations = {
        	
    		}, tags={ "ModelManagement",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Delete model results", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request", response = InlineResponse200.class) })
    @OAuthSecurity(enabled=false)   
    public Response deleteModel(@ApiParam(value = "The release date of the version of the API you want to use. Specify dates in YYYY-MM-DD format.",required=true, defaultValue="2017-02-27") @DefaultValue("2017-02-27") @QueryParam("version") String version
,
@ApiParam(value = "model_id of the model to delete",required=true) @PathParam("model_id") String modelId)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().deleteModel(version,modelId,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ModelManagementApi apiInstance = new com.ibm.mfp.adapters.sample.api.ModelManagementApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.InlineResponse200 result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.deleteModel(version,modelId);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#deleteModel");
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
    @Path("/models")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(
    	value = "List models", 
		notes = "Lists available models for Relations and Entities features, including Watson Knowledge Studio custom models that you have created and linked to your Natural Language Understanding service.", 
		response = ListModelsResults.class, 
		authorizations = {
        	
    		}, tags={ "ModelManagement" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "List models results", response = ListModelsResults.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request", response = ListModelsResults.class) })
    @OAuthSecurity(enabled=false)   
    public Response getModels(@ApiParam(value = "The release date of the version of the API you want to use. Specify dates in YYYY-MM-DD format.",required=true, defaultValue="2017-02-27") @DefaultValue("2017-02-27") @QueryParam("version") String version
)
    throws NotFoundException, ServiceFactoryFinderException {

        //return getV1ApiService().getModels(version,securityContext);

        com.ibm.mfp.adapters.sample.ApiClient apiAuthInstance = new com.ibm.mfp.adapters.sample.ApiClient();

        com.ibm.mfp.adapters.sample.api.ModelManagementApi apiInstance = new com.ibm.mfp.adapters.sample.api.ModelManagementApi(apiAuthInstance);
        
         String retval = "NA";
         com.ibm.mfp.adapters.sample.model.ListModelsResults result = null;
         apiAuthInstance.setUsername(configurationApi.getPropertyValue("username"));
         apiAuthInstance.setPassword(configurationApi.getPropertyValue("password"));
        try {
            System.out.println("Calling Node server.");
            result = apiInstance.getModels(version);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling V1Api#getModels");
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
