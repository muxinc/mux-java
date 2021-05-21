package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.ApiException;
import com.mux.sdk.DimensionsApi;
import com.mux.sdk.TestHelper;
import com.mux.sdk.models.ListDimensionValuesResponse;
import com.mux.sdk.models.ListDimensionsResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseDimensions {
    DimensionsApi dim = new DimensionsApi(TestHelper.buildApiClient());

    @Test
    public void listDimensions() throws ApiException {
        ListDimensionsResponse listDimensionsResponse = dim.listDimensions();
        assertNotNull(listDimensionsResponse);
        assertNotNull(listDimensionsResponse.getData());
        assertNotNull(listDimensionsResponse.getData().getBasic());
        assertNotNull(listDimensionsResponse.getData().getAdvanced());
    }

    @Test
    public void listDimensionValues() throws ApiException {
        ListDimensionValuesResponse listDimensionValues = dim.listDimensionValues("browser", 50, 0, Lists.newArrayList(), Lists.newArrayList("7:days"));

        assertNotNull(listDimensionValues);
        assertNotNull(listDimensionValues.getData());
    }
}
