package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.ApiException;
import com.mux.sdk.DimensionsApi;
import com.mux.sdk.ErrorsApi;
import com.mux.sdk.ExportsApi;
import com.mux.sdk.TestHelper;
import com.mux.sdk.models.ListDimensionValuesResponse;
import com.mux.sdk.models.ListDimensionsResponse;
import com.mux.sdk.models.ListErrorsResponse;
import com.mux.sdk.models.ListExportsResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseExports {
    @Test
    public void listExports() throws ApiException {
        ExportsApi exports = new ExportsApi(TestHelper.buildApiClient());

        ListExportsResponse listExportsResponse = exports.listExports();
        assertTrue(listExportsResponse.getData().size() > 0);
    }
}
