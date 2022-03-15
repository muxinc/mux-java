package com.mux.sdk.tests.video;

import com.google.common.collect.Lists;
import com.mux.*;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseLiveStreams {
    @Test
    public void test() throws ApiException {
        LiveStreamsApi liveStreamsApi = new LiveStreamsApi(TestHelper.buildApiClient());
        PlaybackIdApi playbackIdApi = new PlaybackIdApi((TestHelper.buildApiClient()));

        CreateAssetRequest car = new CreateAssetRequest();
        car.setPlaybackPolicy(Lists.newArrayList(PlaybackPolicy.PUBLIC));

        CreateLiveStreamRequest clsr = new CreateLiveStreamRequest();
        clsr.setNewAssetSettings(car);
        clsr.setPlaybackPolicy(car.getPlaybackPolicy());
        clsr.setReducedLatency(true);

        LiveStreamResponse stream = liveStreamsApi.createLiveStream(clsr).execute();

        String streamId = stream.getData().getId();
        assertNotNull(streamId);
        System.out.println("create-live-stream OK ✅");

        ListLiveStreamsResponse streams = liveStreamsApi.listLiveStreams().execute();
        assertEquals(streamId, streams.getData().get(0).getId());
        System.out.println("list-live-streams OK ✅");

        LiveStreamResponse streamGet = liveStreamsApi.getLiveStream(streamId).execute();
        assertEquals(streamId, streamGet.getData().getId());
        System.out.println("get-live-stream OK ✅");

        String playbackId = stream.getData().getPlaybackIds().get(0).getId();

        GetAssetOrLiveStreamIdResponse getLiveResp = playbackIdApi.getAssetOrLivestreamId(playbackId).execute();
        assertEquals(playbackId, getLiveResp.getData().getId());
        assertEquals(GetAssetOrLiveStreamIdResponseDataObject.TypeEnum.LIVE_STREAM, getLiveResp.getData().getObject().getType());
        System.out.println("get-asset-or-livestream-id OK ✅");

        CreateSimulcastTargetRequest simulReq = new CreateSimulcastTargetRequest();
        simulReq.setPassthrough("foo");
        simulReq.setStreamKey("bar");
        simulReq.setUrl("rtmp://dontforgettolikeand.subscribe");

        SimulcastTargetResponse simulResp = liveStreamsApi.createLiveStreamSimulcastTarget(streamId, simulReq).execute();
        String targetId = simulResp.getData().getId();
        assertNotNull(targetId);

        assertEquals("foo", simulResp.getData().getPassthrough());
        System.out.println("create-live-stream-simulcast-target OK ✅");

        SimulcastTargetResponse simulGet = liveStreamsApi.getLiveStreamSimulcastTarget(streamId, targetId).execute();
        assertEquals(targetId, simulGet.getData().getId());
        System.out.println("get-live-stream-simulcast-target OK ✅");

        liveStreamsApi.deleteLiveStreamSimulcastTarget(streamId, targetId).execute();
        LiveStreamResponse streamNoTarget = liveStreamsApi.getLiveStream(streamId).execute();
        assertNull(streamNoTarget.getData().getSimulcastTargets());
        System.out.println("delete-live-stream-simulcast-target OK ✅");

        CreatePlaybackIDRequest playbackReq = new CreatePlaybackIDRequest();
        playbackReq.setPolicy(PlaybackPolicy.SIGNED);
        CreatePlaybackIDResponse playbackResp = liveStreamsApi.createLiveStreamPlaybackId(streamId, playbackReq).execute();
        assertNotNull(playbackResp.getData().getId());
        assertEquals(PlaybackPolicy.SIGNED, playbackResp.getData().getPolicy());
        System.out.println("create-live-stream-playback-id OK ✅");

        liveStreamsApi.deleteLiveStreamPlaybackId(streamId, playbackResp.getData().getId()).execute();
        LiveStreamResponse streamAfterPlaybackIdDelete = liveStreamsApi.getLiveStream(streamId).execute();
        assertEquals(streamId, streamAfterPlaybackIdDelete.getData().getId());
        assertEquals(1, streamAfterPlaybackIdDelete.getData().getPlaybackIds().size());
        assertEquals(PlaybackPolicy.PUBLIC, streamAfterPlaybackIdDelete.getData().getPlaybackIds().get(0).getPolicy());
        System.out.println("delete-live-stream-playback-id OK ✅");

        LiveStreamResponse resetKey = liveStreamsApi.resetStreamKey(streamId).execute();
        assertNotEquals(stream.getData().getStreamKey(), resetKey.getData().getStreamKey());
        System.out.println("reset-stream-key OK ✅");

        liveStreamsApi.signalLiveStreamComplete(streamId).execute(); // should not throw
        System.out.println("signal-live-stream-complete OK ✅");

        liveStreamsApi.disableLiveStream(streamId).execute();
        LiveStreamResponse disabled = liveStreamsApi.getLiveStream(streamId).execute();
        assertEquals(LiveStreamStatus.DISABLED, disabled.getData().getStatus());
        System.out.println("disable-live-stream OK ✅");

        liveStreamsApi.enableLiveStream(streamId).execute();
        LiveStreamResponse enabled = liveStreamsApi.getLiveStream(streamId).execute();
        assertEquals(LiveStreamStatus.IDLE, enabled.getData().getStatus());
        System.out.println("enable-live-stream OK ✅");

        liveStreamsApi.deleteLiveStream(streamId).execute();
        assertThrows(ApiException.class, () -> {
            liveStreamsApi.getLiveStream(streamId).execute();
        });
        System.out.println("delete-live-stream OK ✅");
    }
}
