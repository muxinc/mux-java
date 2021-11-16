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

        LiveStreamResponse stream = liveStreamsApi.createLiveStream(clsr);

        String streamId = stream.getData().getId();
        assertNotNull(streamId);
        System.out.println("create-live-stream OK ✅");

        ListLiveStreamsResponse streams = liveStreamsApi.listLiveStreams(null, null);
        assertEquals(streamId, streams.getData().get(0).getId());
        System.out.println("list-live-streams OK ✅");

        LiveStreamResponse streamGet = liveStreamsApi.getLiveStream(streamId);
        assertEquals(streamId, streamGet.getData().getPlaybackIds().get(0).getId());
        System.out.println("get-live-stream OK ✅");

        GetAssetOrLiveStreamIdResponse getLiveResp = playbackIdApi.getAssetOrLivestreamId(streamId);
        assertEquals(streamId, getLiveResp.getData().getId());
        assertEquals(GetAssetOrLiveStreamIdResponseDataObject.TypeEnum.LIVE_STREAM, getLiveResp.getData().getObject().getType());
        System.out.println("get-asset-or-livestream-id OK ✅");

        CreateSimulcastTargetRequest simulReq = new CreateSimulcastTargetRequest();
        simulReq.setPassthrough("foo");
        simulReq.setStreamKey("bar");
        simulReq.setUrl("rtmp://dontforgettolikeand.subscribe");

        SimulcastTargetResponse simulResp = liveStreamsApi.createLiveStreamSimulcastTarget(streamId, simulReq);
        String targetId = simulResp.getData().getId();
        assertNotNull(targetId);

        assertEquals("foo", simulResp.getData().getPassthrough());
        System.out.println("create-live-stream-simulcast-target OK ✅");

        SimulcastTargetResponse simulGet = liveStreamsApi.getLiveStreamSimulcastTarget(streamId, targetId);
        assertEquals(targetId, simulGet.getData().getId());
        System.out.println("get-live-stream-simulcast-target OK ✅");

        liveStreamsApi.deleteLiveStreamSimulcastTarget(streamId, targetId);
        LiveStreamResponse streamNoTarget = liveStreamsApi.getLiveStream(streamId);
        assertNull(streamNoTarget.getData().getSimulcastTargets());
        System.out.println("delete-live-stream-simulcast-target OK ✅");

        CreatePlaybackIDRequest playbackReq = new CreatePlaybackIDRequest();
        playbackReq.setPolicy(PlaybackPolicy.SIGNED);
        CreatePlaybackIDResponse playbackResp = liveStreamsApi.createLiveStreamPlaybackId(streamId, playbackReq);
        assertNotNull(playbackResp.getData().getId());
        assertEquals(PlaybackPolicy.SIGNED, playbackResp.getData().getPolicy());
        System.out.println("create-live-stream-playback-id OK ✅");

        liveStreamsApi.deleteLiveStreamPlaybackId(streamId, playbackResp.getData().getId());
        LiveStreamResponse streamAfterPlaybackIdDelete = liveStreamsApi.getLiveStream(streamId);
        assertEquals(streamId, streamAfterPlaybackIdDelete.getData().getId());
        assertEquals(1, streamAfterPlaybackIdDelete.getData().getPlaybackIds().size());
        assertEquals(PlaybackPolicy.PUBLIC, streamAfterPlaybackIdDelete.getData().getPlaybackIds().get(0).getPolicy());
        System.out.println("delete-live-stream-playback-id OK ✅");

        LiveStreamResponse resetKey = liveStreamsApi.resetStreamKey(streamId);
        assertNotEquals(stream.getData().getStreamKey(), resetKey.getData().getStreamKey());
        System.out.println("reset-stream-key OK ✅");

        liveStreamsApi.signalLiveStreamComplete(streamId); // should not throw
        System.out.println("signal-live-stream-complete OK ✅");

        liveStreamsApi.disableLiveStream(streamId);
        LiveStreamResponse disabled = liveStreamsApi.getLiveStream(streamId);
        assertEquals(LiveStream.StatusEnum.DISABLED, disabled.getData().getStatus());
        System.out.println("disable-live-stream OK ✅");

        liveStreamsApi.enableLiveStream(streamId);
        LiveStreamResponse enabled = liveStreamsApi.getLiveStream(streamId);
        assertEquals(LiveStream.StatusEnum.IDLE, enabled.getData().getStatus());
        System.out.println("enable-live-stream OK ✅");

        liveStreamsApi.deleteLiveStream(streamId);
        assertThrows(ApiException.class, () -> {
            liveStreamsApi.getLiveStream(streamId);
        });
        System.out.println("delete-live-stream OK ✅");
    }
}
