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
 *  com.edw.client.Mocky01ApiClient
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 08 Mar 2025 22:17
 */
@RegisterRestClient
@Path("/v3/7d632ef6-6a17-4540-88ab-ce3cc6ddce1e")
public interface MockyApi01Client {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Uni<String> get(@RestQuery("mocky-delay") String mockyDelay);

}
