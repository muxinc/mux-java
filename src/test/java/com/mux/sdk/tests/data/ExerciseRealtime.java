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

// Test coverage here isn't fantastic due to not knowning if the account we're testing against has
// any real-time data. The behaviour has been manually verified against real-world data.

public class ExerciseRealtime {
    RealTimeApi rtApi = new RealTimeApi(TestHelper.buildApiClient());

    @Test
    public void listRealtimeDimensions() throws ApiException {
        ListRealTimeDimensionsResponse resp = rtApi.listRealtimeDimensions();
        assertTrue(resp.getData().size() > 0);
        assertNotEquals("", resp.getData().get(0).getName());
        assertNotEquals("", resp.getData().get(0).getDisplayName());
    }

    @Test
    public void listRealtimeMetrics() throws ApiException {
        ListRealTimeMetricsResponse resp = rtApi.listRealtimeMetrics();
        assertTrue(resp.getData().size() > 0);
        assertNotEquals("", resp.getData().get(0).getName());
        assertNotEquals("", resp.getData().get(0).getDisplayName());
    }

    @Test
    public void getRealtimeBreakdown() throws ApiException {
        GetRealTimeBreakdownResponse resp = rtApi.getRealtimeBreakdown(
                "current-rebuffering-percentage",
                "asn", null, null, null, null);
        assertNotNull(resp.getData());
    }

//    @Test
    public void getRealtimeHistogramTimeseries() throws ApiException {
        GetRealTimeHistogramTimeseriesResponse resp = rtApi.getRealtimeHistogramTimeseries(
                "video-startup-time",
                null);

        assertTrue(resp.getMeta().getBuckets().size() > 0);
        assertTrue(resp.getData().size() > 0);
    }

    @Test
    public void getRealtimeTimeseries() throws ApiException {
        GetRealTimeTimeseriesResponse resp = rtApi.getRealtimeTimeseries(
                "current-rebuffering-percentage",
                null
        );

        assertTrue(resp.getData().size() > 0);
        assertNotEquals("", resp.getData().get(0).getDate());
    }
}
