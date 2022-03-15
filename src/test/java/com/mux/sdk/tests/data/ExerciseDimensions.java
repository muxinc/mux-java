package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.*;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseDimensions {
    DimensionsApi dim = new DimensionsApi(TestHelper.buildApiClient());

    @Test
    public void listDimensions() throws ApiException {
        ListDimensionsResponse listDimensionsResponse = dim.listDimensions().execute();
        assertNotNull(listDimensionsResponse);
        assertNotNull(listDimensionsResponse.getData());
        assertNotNull(listDimensionsResponse.getData().getBasic());
        assertNotNull(listDimensionsResponse.getData().getAdvanced());
    }

    @Test
    public void listDimensionValues() throws ApiException {
        ListDimensionValuesResponse listDimensionValues =
            dim.listDimensionValues("browser")
                    .limit(50)
                    .page(0)
                    .timeframe(Lists.newArrayList("7:days"))
                    .execute();

        assertNotNull(listDimensionValues);
        assertNotNull(listDimensionValues.getData());
    }
}
