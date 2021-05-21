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

public class ExerciseIncidents {
    IncidentsApi incidentsApi = new IncidentsApi(TestHelper.buildApiClient());

    @Test
    public void listIncidents() throws ApiException {

        // =========== list-incidents
        ListIncidentsResponse resp = incidentsApi.listIncidents(50, 0, null, null, null, null);
        assertNotNull(resp.getData());
    }

    @Ignore
    public void getIncident() throws ApiException {

    }

    @Ignore
    public void listRelatedIncidents() throws ApiException {

    }
}
