package com.ibm.mfp.adapters.sample.api;

@javax.annotation.Generated(value = "com.github.mfpdev.adapters.swagger.codegen.MfpAdapterCodegen", date = "2017-05-19T15:47:02.385+05:30")
public class V1ApiServiceFactoryFinder {

	public static V1ApiServiceFactoryIfc findFactoryImpl() throws ServiceFactoryFinderException {
		String svcFactoryClassname = "WatsonDiscoveryAdapterServiceFactory";
		
		if ( svcFactoryClassname != null && svcFactoryClassname.length() > 0 ) {
			try {
				return (V1ApiServiceFactoryIfc)Class.forName(svcFactoryClassname).newInstance();
			} catch ( Exception e ) {
				throw new ServiceFactoryFinderException(e);
			}
		} else {
		    throw new ServiceFactoryFinderException("V1ApiServiceFactoryIfc" + " implementation class name not defined in codegen configuration");
		}
	}
}