package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.*;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseMetrics {
    MetricsApi metrics = new MetricsApi(TestHelper.buildApiClient());

    List<String> tf = Lists.newArrayList("7:days");

    @Test
    public void listBreakdownValues() throws ApiException {
        ListBreakdownValuesResponse resp =
                metrics.listBreakdownValues("video_startup_time")
                        .groupBy("browser")
                        .timeframe(tf)
                        .execute();

        assertNotNull(resp.getData());
    }

    @Test
    public void getOverallValues() throws ApiException {
        GetOverallValuesResponse resp = metrics.getOverallValues("video_startup_time")
                .timeframe(tf)
                .execute();

        assertNotNull(resp.getData());
    }

    @Test
    public void listInsights() throws ApiException {
        ListInsightsResponse resp = metrics.listInsights("video_startup_time")
                .timeframe(tf)
                .execute();
        assertNotNull(resp.getData());
    }

    @Test
    public void getMetricTimeseriesData() throws ApiException {
        GetMetricTimeseriesDataResponse resp = metrics.getMetricTimeseriesData("video_startup_time")
                .timeframe(tf)
                .execute();
        assertNotNull(resp.getData());
    }

    @Test
    public void listAllMetricValues() throws ApiException {
        ListAllMetricValuesResponse resp = metrics.listAllMetricValues().execute();
        assertNotNull(resp.getData());
    }
}
