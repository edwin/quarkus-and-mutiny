package com.edw.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * <pre>
 *  com.edw.controller.HelloWorldController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 08 Mar 2025 21:56
 */
@Path("/hello")
public class HelloWorldController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response index() {
        log.debug("opening index hello-world page");
        return Response.ok(new HashMap(){{
                    put("hello", "world");
                }})
                .build();
    }

}
