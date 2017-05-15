package com.ibm.mfp.adapters.sample.api.factories;

import com.ibm.mfp.adapters.sample.api.V1ApiService;
import com.ibm.mfp.adapters.sample.api.impl.V1ApiServiceImpl;

@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-15T10:26:38.328+05:30")
public class V1ApiServiceFactory {
    private final static V1ApiService service = new V1ApiServiceImpl();

    public static V1ApiService getV1Api() {
        return service;
    }
}