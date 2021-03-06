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

import com.sun.jersey.core.spi.component.ComponentContext;
import com.sun.jersey.spi.inject.Injectable;
import com.sun.jersey.spi.inject.PerRequestTypeInjectableProvider;

import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import org.joda.time.LocalDate;
import java.util.List;

@Provider
public class JodaLocalDateProvider extends PerRequestTypeInjectableProvider<QueryParam, LocalDate> {
    private final UriInfo uriInfo;

    public JodaLocalDateProvider(@Context UriInfo uriInfo) {
        super(LocalDate.class);
        this.uriInfo = uriInfo;
    }

    @Override
    public Injectable<LocalDate> getInjectable(final ComponentContext cc, final QueryParam a) {
        return new Injectable<LocalDate>() {
            @Override
            public LocalDate getValue() {
                final List<String> values = uriInfo.getQueryParameters().get(a.value());

                if (values == null || values.isEmpty())
                    return null;
                if (values.size() > 1) {
                    throw new WebApplicationException(Response.status(Status.BAD_REQUEST).
                            entity(a.value() + " cannot contain multiple values").build());
                }

                return LocalDate.parse(values.get(0));
            }
        };
    }
}
