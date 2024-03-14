package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://circleci.com/api/v2";
        
        configuration.apiKeyHeader  = "YOUR API KEY";
        
        configuration.apiKeyQuery  = "YOUR API KEY";
        
        // Configure HTTP basic authorization: basic_auth
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        CircleCi client = new CircleCi(configuration);
        assertNotNull(client);
    }
}
