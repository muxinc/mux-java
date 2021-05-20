package com.mux.sdk;

import com.mux.ApiClient;

public abstract class TestHelper {
    public static ApiClient buildApiClient() {
        final ApiClient client = new ApiClient();
        
        client.setUsername(System.getenv("MUX_TOKEN_ID"));
        client.setPassword(System.getenv("MUX_TOKEN_SECRET"));

        return client;
    }
}
