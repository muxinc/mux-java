package com.mux.sdk.tests.data;

import com.google.common.collect.Lists;
import com.mux.*;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseExports {
    @Test
    public void listExports() throws ApiException {
        ExportsApi exports = new ExportsApi(TestHelper.buildApiClient());

        ListExportsResponse listExportsResponse = exports.listExports().execute();
        assertTrue(listExportsResponse.getData().size() > 0);
    }
}
