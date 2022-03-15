package com.mux.sdk.tests.video;

import java.util.ArrayList;

import com.mux.*;
import com.mux.sdk.*;
import com.mux.sdk.models.*;

import org.junit.Test;

public class CreateLiveStream {
    @Test
    public void createLiveStream() throws ApiException {
        final LiveStreamsApi api = new LiveStreamsApi(TestHelper.buildApiClient());

        final CreateAssetRequest assetRequest = new CreateAssetRequest();
        final ArrayList<PlaybackPolicy> playbackPolicies = new ArrayList();
        playbackPolicies.add(PlaybackPolicy.PUBLIC);
        assetRequest.setPlaybackPolicy(playbackPolicies);

        final CreateLiveStreamRequest streamRequest = new CreateLiveStreamRequest();
        streamRequest.setNewAssetSettings(assetRequest);
        streamRequest.setPlaybackPolicy(playbackPolicies);

        final LiveStreamResponse stream = api.createLiveStream(streamRequest).execute();
    }
}
