package com.edw.client;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestQuery;

/**
 * <pre>
 *  com.edw.client.MockyApi03Client
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 08 Mar 2025 22:22
 */
@RegisterRestClient
@Path("/v3/aa6a5de1-f157-4a73-a3da-c513b2f12084")
public interface MockyApi03Client {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Uni<String> get(@RestQuery("mocky-delay") String mockyDelay);
    
}
