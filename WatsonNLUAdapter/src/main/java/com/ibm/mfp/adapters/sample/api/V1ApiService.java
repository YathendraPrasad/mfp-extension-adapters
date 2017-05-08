package com.ibm.mfp.adapters.sample.api;

import com.ibm.mfp.adapters.sample.api.*;
import com.ibm.mfp.adapters.sample.model.*;



import com.ibm.mfp.adapters.sample.model.AnalysisResults;
import com.ibm.mfp.adapters.sample.model.ErrorResponse;
import com.ibm.mfp.adapters.sample.model.InlineResponse200;
import com.ibm.mfp.adapters.sample.model.ListModelsResults;
import com.ibm.mfp.adapters.sample.model.Parameters;

import java.util.List;
import com.ibm.mfp.adapters.sample.api.NotFoundException;

import java.io.InputStream;
import com.sun.jersey.multipart.*;
import com.sun.jersey.core.header.*;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-08T16:53:34.102+05:30")
public interface V1ApiService {
      public Response analyze(String version,Parameters parameters,SecurityContext securityContext)
      throws NotFoundException;
      public Response analyzeGet(String version,List<String> features,String text,String html,String url,Boolean returnAnalyzedText,Boolean clean,String xpath,Boolean fallbackToRaw,String language,Integer conceptsLimit,Boolean emotionDocument,List<String> emotionTargets,Integer entitiesLimit,String entitiesModel,Boolean entitiesEmotion,Boolean entitiesSentiment,Integer keywordsLimit,Boolean keywordsEmotion,Boolean keywordsSentiment,String relationsModel,Integer semanticRolesLimit,Boolean semanticRolesEntities,Boolean semanticRolesKeywords,Boolean sentimentDocument,List<String> sentimentTargets,SecurityContext securityContext)
      throws NotFoundException;
      public Response deleteModel(String version,String modelId,SecurityContext securityContext)
      throws NotFoundException;
      public Response getModels(String version,SecurityContext securityContext)
      throws NotFoundException;
}
