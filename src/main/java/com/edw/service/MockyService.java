package com.edw.service;

import com.edw.client.MockyApi01Client;
import com.edw.client.MockyApi02Client;
import com.edw.client.MockyApi03Client;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 * <pre>
 *  com.edw.service.MockyService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 08 Mar 2025 22:26
 */
@ApplicationScoped
public class MockyService {

    @Inject
    @RestClient
    MockyApi01Client mockyApi01Client;

    @Inject
    @RestClient
    MockyApi02Client mockyApi02Client;

    @Inject
    @RestClient
    MockyApi03Client mockyApi03Client;

    public String getSequentialCall () {

        String result01 = mockyApi01Client.get("3000ms").await().indefinitely();
        String result02 = mockyApi02Client.get("3000ms").await().indefinitely();
        String result03 = mockyApi03Client.get("3000ms").await().indefinitely();

        return result01 + "," + result02 + "," + result03;
    }

}
