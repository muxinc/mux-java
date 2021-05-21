package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.ApiException;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseMetrics {
    MetricsApi metrics = new MetricsApi(TestHelper.buildApiClient());

    @Test
    public void listBreakdownValues() throws ApiException {
        ListBreakdownValuesResponse resp = metrics.listBreakdownValues(
                "video_startup_time",
                "browser",
                null,
                null,
                null,
                null,
                null,
                null,
                Lists.newArrayList("7:days"));

        assertNotNull(resp.getData());
    }

    @Test
    public void getOverallValues() throws ApiException {
        GetOverallValuesResponse resp = metrics.getOverallValues(
                "video_startup_time",
                Lists.newArrayList("7:days"),
                null,
                null);

        assertNotNull(resp.getData());
    }

    @Test
    public void listInsights() throws ApiException {
        ListInsightsResponse resp = metrics.listInsights("video_startup_time", null, null, Lists.newArrayList("7:days"));
        assertNotNull(resp.getData());
    }

    @Test
    public void getMetricTimeseriesData() throws ApiException {
        GetMetricTimeseriesDataResponse resp = metrics.getMetricTimeseriesData("video_startup_time", Lists.newArrayList("7:days"), null, null, null, null);
        assertNotNull(resp.getData());
    }

    @Test
    public void listAllMetricValues() throws ApiException {
        ListAllMetricValuesResponse resp = metrics.listAllMetricValues(null, null, null, null);
        assertNotNull(resp.getData());
    }
}
