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

public class ExerciseDeliveryUsage {
    DeliveryUsageApi usageApi = new DeliveryUsageApi(TestHelper.buildApiClient());

    @Test
    public void listDeliveryUsage() throws ApiException {
        ListDeliveryUsageResponse resp = usageApi.listDeliveryUsage(null, null, null, null);
        assertNotNull(resp.getData());
    }
}
