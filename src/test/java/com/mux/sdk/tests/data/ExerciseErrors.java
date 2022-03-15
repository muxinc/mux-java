package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.*;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseErrors {
    @Test
    public void listErrors() throws ApiException {
        ErrorsApi errors = new ErrorsApi(TestHelper.buildApiClient());

        // =========================== list-errors
        ListErrorsResponse listErrorsResponse = errors.listErrors()
                .timeframe(Lists.newArrayList("7:days"))
                .execute();

        assertNotNull(listErrorsResponse);
        assertNotNull(listErrorsResponse.getData());
//        assertTrue(listErrorsResponse.getData().size() > 0);
//        assertNotNull(listErrorsResponse.getData().get(0).getId());
    }
}
