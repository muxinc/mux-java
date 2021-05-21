package com.mux.sdk.tests.video;

import java.util.ArrayList;

import com.mux.ApiException;
import com.mux.sdk.LiveStreamsApi;
import com.mux.sdk.TestHelper;
import com.mux.sdk.models.CreateAssetRequest;
import com.mux.sdk.models.CreateLiveStreamRequest;
import com.mux.sdk.models.LiveStreamResponse;
import com.mux.sdk.models.PlaybackPolicy;

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

        final LiveStreamResponse stream = api.createLiveStream(streamRequest);
    }
}
