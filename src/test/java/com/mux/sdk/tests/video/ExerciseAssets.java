package com.mux.sdk.tests.video;

import com.google.common.collect.Lists;
import com.mux.*;
import com.mux.sdk.*;
import com.mux.sdk.models.*;
import com.mux.sdk.TestHelper;
import com.mux.sdk.models.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ExerciseAssets {
    @Test
    public void integrationTest() throws ApiException, InterruptedException {
        ApiClient client = TestHelper.buildApiClient();
        AssetsApi assets = new AssetsApi(client);
        PlaybackIdApi playbackIds = new PlaybackIdApi(client);

        // =========================== creating assets
        CreateAssetRequest car = new CreateAssetRequest();
        InputSettings inputA = new InputSettings();
        InputSettings inputB = new InputSettings();

        inputA.setUrl("https://storage.googleapis.com/muxdemofiles/mux-video-intro.mp4");

        inputB.setUrl("https://tears-of-steel-subtitles.s3.amazonaws.com/tears-fr.vtt");
        inputB.setType(InputSettings.TypeEnum.TEXT);
        inputB.setTextType(InputSettings.TextTypeEnum.SUBTITLES);
        inputB.setName("French");
        inputB.setLanguageCode("fr");
        inputB.setClosedCaptions(false);

        car.setInput(Lists.newArrayList(inputA, inputB));

        AssetResponse createResponse = assets.createAsset(car).execute();

        assertNotNull(createResponse);

        String assetId = createResponse.getData().getId();
        assertNotNull(assetId);

        System.out.println("create-asset OK ✅");

        ListAssetsResponse assetsListResponse = assets.listAssets().limit(50).page(0).execute();
        assertNotNull(assetsListResponse);
        assertEquals(assetId, assetsListResponse.getData().get(0).getId());

        AssetResponse asset = null;
        do {
            asset = assets.getAsset(assetId).execute();

            assertNotNull(asset);
            assertEquals(assetId, asset.getData().getId());
        } while (asset == null || asset.getData().getStatus() != Asset.StatusEnum.READY);
        System.out.println("get-asset OK");

        GetAssetInputInfoResponse assetInputInfo = assets.getAssetInputInfo(assetId).execute();
        assertNotNull(assetInputInfo);
        assertNotNull(assetInputInfo.getData());

        System.out.println("get-asset-input-info OK");

        // =========================== clipping
        CreateAssetRequest clipRequest = new CreateAssetRequest();
        InputSettings clipInput = new InputSettings();
        clipInput.setUrl("mux://assets/" + assetId);
        clipInput.setStartTime(0.0);
        clipInput.setEndTime(5.0);

        clipRequest.setInput(Lists.newArrayList(clipInput));

        AssetResponse clipResponse = assets.createAsset(clipRequest).execute();
        assertNotNull(clipResponse);
        assertNotNull(clipResponse.getData().getId());
        System.out.println("clipping OK");

        // =========================== create-asset-playback-id
        CreatePlaybackIDRequest cpbr = new CreatePlaybackIDRequest();
        cpbr.setPolicy(PlaybackPolicy.PUBLIC);
        CreatePlaybackIDResponse playbackIdResponse =
                assets.createAssetPlaybackId(assetId, cpbr).execute();
        assertNotNull(playbackIdResponse);
        assertNotNull(playbackIdResponse.getData());
        System.out.println("create-asset-playback-id OK");

        // =========================== get-asset-playback-id
        GetAssetPlaybackIDResponse getPlaybackIdResponse =
                assets.getAssetPlaybackId(assetId, playbackIdResponse.getData().getId()).execute();
        assertNotNull(getPlaybackIdResponse.getData());
        System.out.println("get-asset-playback-id OK");

        // =========================== get-asset-or-livestream-id
        GetAssetOrLiveStreamIdResponse assetOrLivestreamId =
                playbackIds.getAssetOrLivestreamId(getPlaybackIdResponse.getData().getId()).execute();
        assertNotNull(assetOrLivestreamId.getData());
        System.out.println("get-asset-or-livestream-id OK");
        
        // =========================== update-asset-mp4-support
        UpdateAssetMP4SupportRequest mp4Request = new UpdateAssetMP4SupportRequest();
        mp4Request.setMp4Support(UpdateAssetMP4SupportRequest.Mp4SupportEnum.STANDARD);
        AssetResponse mp4Response = assets.updateAssetMp4Support(assetId, mp4Request).execute();
        assertNotNull(mp4Response);
        assertNotNull(mp4Response.getData());
        System.out.println("update-asset-mp4-support OK");
        
        // =========================== update-asset-master-access
        UpdateAssetMasterAccessRequest masterRequest = new UpdateAssetMasterAccessRequest();
        masterRequest.setMasterAccess(UpdateAssetMasterAccessRequest.MasterAccessEnum.TEMPORARY);
        AssetResponse masterResponse = assets.updateAssetMasterAccess(assetId, masterRequest).execute();

        assertNotNull(masterResponse);
        assertNotNull(masterResponse.getData());
        System.out.println("update-asset-master-access OK");
        
        // =========================== create-asset-track
        CreateTrackRequest trackRequest = new CreateTrackRequest();
        trackRequest.setUrl("https://tears-of-steel-subtitles.s3.amazonaws.com/tears-en.vtt");
        trackRequest.setType(CreateTrackRequest.TypeEnum.TEXT);
        trackRequest.setTextType(CreateTrackRequest.TextTypeEnum.SUBTITLES);
        trackRequest.setLanguageCode("en");
        trackRequest.setName("English");
        trackRequest.setClosedCaptions(false);

        CreateTrackResponse trackResponse = assets.createAssetTrack(assetId, trackRequest).execute();

        assertNotNull(trackResponse);
        assertNotNull(trackResponse.getData().getId());
        assertEquals("English", trackResponse.getData().getName());

        AssetResponse asset2Captions = assets.getAsset(assetId).execute();
        // Audio, Video, French that we ingested with the asset, and the English we added here!
        assertEquals(4, asset2Captions.getData().getTracks().size());
        System.out.println("create-asset-track OK");
        
        // =========================== delete-asset-track
        Thread.sleep(5000);
        assets.deleteAssetTrack(assetId, trackResponse.getData().getId()).execute();
        AssetResponse asset1Caption = assets.getAsset(assetId).execute();
        // Audio, Video, French that we ingested with the asset
        assertEquals(3, asset1Caption.getData().getTracks().size());
        System.out.println("delete-asset-track OK");
        
        // =========================== delete-asset-playback-id
        assets.deleteAssetPlaybackId(assetId, playbackIdResponse.getData().getId()).execute();
        AssetResponse deletedPlaybackIdAsset = assets.getAsset(assetId).execute();
        assertNull(deletedPlaybackIdAsset.getData().getPlaybackIds());
        System.out.println("delete-asset-playback-id OK");
        
        // =========================== delete-asset
        assets.deleteAsset(assetId).execute();
        assertThrows(ApiException.class, () -> {
            assets.getAsset(assetId).execute();
        });
        System.out.println("delete-asset OK");
    }
}
