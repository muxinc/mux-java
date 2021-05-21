package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.ApiException;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseFilters {
    FiltersApi filters = new FiltersApi(TestHelper.buildApiClient());

    @Test
    public void listFilters() throws ApiException {
        ListFiltersResponse resp = filters.listFilters();
        assertNotNull(resp.getData().getBasic());
        assertNotNull(resp.getData().getAdvanced());

    }

    @Test
    public void listFilterValues() throws ApiException {
        ListFilterValuesResponse resp2 = filters.listFilterValues("browser", 50, 0, Lists.newArrayList(), Lists.newArrayList("7:days"));
        assertNotNull(resp2.getData());
    }
}
