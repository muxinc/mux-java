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

public class ExerciseUploads {
    @Test
    public void test() throws ApiException {
        DirectUploadsApi uploadsApi = new DirectUploadsApi(TestHelper.buildApiClient());

        CreateAssetRequest car = new CreateAssetRequest();
        car.setPlaybackPolicy(Lists.newArrayList(PlaybackPolicy.PUBLIC));
        CreateUploadRequest cur = new CreateUploadRequest();
        cur.setNewAssetSettings(car);;
        cur.setTimeout(3600);
        cur.setCorsOrigin("*");

        UploadResponse uploadResp = uploadsApi.createDirectUpload(cur);
        String uploadId = uploadResp.getData().getId();

        assertNotNull(uploadId);
        System.out.println("create-direct-upload OK ✅");

        ListUploadsResponse list = uploadsApi.listDirectUploads(null, null);
        assertEquals(uploadId, list.getData().get(0).getId());
        System.out.println("list-direct-upload OK ✅");

        UploadResponse get = uploadsApi.getDirectUpload(uploadId);
        assertEquals(uploadId, get.getData().getId());
        System.out.println("get-direct-upload OK ✅");

        UploadResponse canceled = uploadsApi.cancelDirectUpload(uploadId);
        assertEquals(uploadId, canceled.getData().getId());
        assertEquals(Upload.StatusEnum.CANCELLED, canceled.getData().getStatus());
        System.out.println("cancel-direct-upload OK ✅");
    }
}
