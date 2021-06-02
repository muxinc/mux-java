package com.mux.sdk.tests.video;

import com.google.common.collect.Lists;
import com.mux.ApiException;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseSigningKeys {
    public void test() throws ApiException {
        UrlSigningKeysApi keysApi = new UrlSigningKeysApi(TestHelper.buildApiClient());

        SigningKeyResponse create = keysApi.createUrlSigningKey();
        String keyId = create.getData().getId();

        assertNotNull(keyId);
        assertNotNull(create.getData().getPrivateKey());
        System.out.println("create-url-signing-key OK ✅");

        ListSigningKeysResponse keys = keysApi.listUrlSigningKeys(null, null);
        assertEquals(keyId, keys.getData().get(0).getId());
        assertNull(keys.getData().get(0).getPrivateKey());
        System.out.println("list-url-signing-keys OK ✅");

        SigningKeyResponse getKey = keysApi.getUrlSigningKey(keyId);
        assertNotNull(getKey.getData());
        System.out.println("get-url-signing-key OK ✅");

        keysApi.deleteUrlSigningKey(keyId);
        assertThrows(ApiException.class, () -> {
            keysApi.getUrlSigningKey(keyId);
        });
        System.out.println("delete-url-signing-key OK ✅");
    }
}
