package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.ApiException;
import com.mux.sdk.DimensionsApi;
import com.mux.sdk.ErrorsApi;
import com.mux.sdk.TestHelper;
import com.mux.sdk.models.ListDimensionValuesResponse;
import com.mux.sdk.models.ListDimensionsResponse;
import com.mux.sdk.models.ListErrorsResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseErrors {
    @Test
    public void listErrors() throws ApiException {
        ErrorsApi errors = new ErrorsApi(TestHelper.buildApiClient());

        // =========================== list-errors
        ListErrorsResponse listErrorsResponse = errors.listErrors(
                Lists.newArrayList("browser:Safari"),
                Lists.newArrayList("7:days")
        );

        assertNotNull(listErrorsResponse);
        assertNotNull(listErrorsResponse.getData());
        assertTrue(listErrorsResponse.getData().size() > 0);
        assertNotNull(listErrorsResponse.getData().get(0).getId());
    }
}
