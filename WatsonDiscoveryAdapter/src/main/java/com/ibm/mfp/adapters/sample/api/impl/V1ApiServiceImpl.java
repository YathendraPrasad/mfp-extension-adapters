package com.ibm.mfp.adapters.sample.api.impl;

import com.ibm.mfp.adapters.sample.api.*;
import com.ibm.mfp.adapters.sample.model.*;

import com.ibm.mfp.adapters.sample.model.Collection;
import com.ibm.mfp.adapters.sample.model.CreateCollectionRequest;
import com.ibm.mfp.adapters.sample.model.CreateEnvironmentRequest;
import com.ibm.mfp.adapters.sample.model.DeleteCollectionResponse;
import com.ibm.mfp.adapters.sample.model.DeleteConfigurationResponse;
import com.ibm.mfp.adapters.sample.model.DeleteDocumentResponse;
import com.ibm.mfp.adapters.sample.model.DeleteEnvironmentResponse;
import com.ibm.mfp.adapters.sample.model.DocumentAccepted;
import com.ibm.mfp.adapters.sample.model.DocumentStatus;
import com.ibm.mfp.adapters.sample.model.Environment;
import com.ibm.mfp.adapters.sample.model.ErrorResponse;
import java.io.File;
import com.ibm.mfp.adapters.sample.model.ListCollectionFieldsResponse;
import com.ibm.mfp.adapters.sample.model.ListCollectionsResponse;
import com.ibm.mfp.adapters.sample.model.ListConfigurationsResponse;
import com.ibm.mfp.adapters.sample.model.ListEnvironmentsResponse;
import com.ibm.mfp.adapters.sample.model.ModelConfiguration;
import com.ibm.mfp.adapters.sample.model.NoticeQueryResponse;
import com.ibm.mfp.adapters.sample.model.QueryResponse;
import com.ibm.mfp.adapters.sample.model.TestDocument;
import com.ibm.mfp.adapters.sample.model.UpdateCollectionRequest;
import com.ibm.mfp.adapters.sample.model.UpdateEnvironmentRequest;

import java.util.List;
import com.ibm.mfp.adapters.sample.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-15T10:26:38.328+05:30")
public class V1ApiServiceImpl extends V1ApiService {
    @Override
    public Response addDocument(String environmentId
, String collectionId
, String version
, String configurationId
, File file
, String metadata
, String _configuration
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createCollection(String environmentId
, String version
, CreateCollectionRequest body
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createConfiguration(String environmentId
, String version
, ModelConfiguration _configuration
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createEnvironment(String version
, CreateEnvironmentRequest body
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteCollection(String environmentId
, String collectionId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteConfiguration(String environmentId
, String configurationId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteDocument(String environmentId
, String collectionId
, String documentId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteEnvironment(String environmentId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getCollection(String environmentId
, String collectionId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getConfiguration(String environmentId
, String configurationId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getDocument(String environmentId
, String collectionId
, String documentId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getEnvironment(String environmentId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listCollectionFields(String environmentId
, String collectionId
, String version
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listCollections(String environmentId
, String version
, String name
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listConfigurations(String environmentId
, String version
, String name
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response listEnvironments(String version
, String name
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response query(String environmentId
, String collectionId
, String version
, String filter
, String query
, String naturalLanguageQuery
, Boolean passages
, String aggregation
, Integer count
, List<String> _return
, Integer offset
, String sort
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response queryNotices(String environmentId
, String collectionId
, String version
, String filter
, String query
, String naturalLanguageQuery
, Boolean passages
, String aggregation
, Integer count
, List<String> _return
, Integer offset
, String sort
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response testConfigurationInEnvironment(String environmentId
, String version
, String _configuration
, String step
, String configurationId
, File file
, String metadata
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateCollection(String environmentId
, String collectionId
, String version
, UpdateCollectionRequest body
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateConfiguration(String environmentId
, String configurationId
, String version
, ModelConfiguration _configuration
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateDocument(String environmentId
, String collectionId
, String documentId
, String version
, String configurationId
, File file
, String metadata
, String _configuration
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateEnvironment(String environmentId
, String version
, UpdateEnvironmentRequest body
, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
