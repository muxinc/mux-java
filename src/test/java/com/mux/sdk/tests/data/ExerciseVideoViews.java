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

public class ExerciseVideoViews {
    @Test
    public void integrationTest() throws ApiException {
        VideoViewsApi views = new VideoViewsApi(TestHelper.buildApiClient());

        ListVideoViewsResponse videoViews = views.listVideoViews().execute();
        String viewId = videoViews.getData().get(0).getId();
        assertNotNull(viewId);
        System.out.println("list-video-views OK");

        VideoViewResponse view = views.getVideoView(viewId).execute();
        assertEquals(viewId, view.getData().getId());
        System.out.println("get-video-view OK");
    }
}
