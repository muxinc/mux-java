

# Asset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the Asset. Max 255 characters. |  [optional]
**createdAt** | **String** | Time the Asset was created, defined as a Unix timestamp (seconds since epoch). |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the asset. |  [optional]
**duration** | **Double** | The duration of the asset in seconds (max duration for a single asset is 12 hours). |  [optional]
**maxStoredResolution** | [**MaxStoredResolutionEnum**](#MaxStoredResolutionEnum) | This field is deprecated. Please use &#x60;resolution_tier&#x60; instead. The maximum resolution that has been stored for the asset. The asset may be delivered at lower resolutions depending on the device and bandwidth, however it cannot be delivered at a higher value than is stored. |  [optional]
**resolutionTier** | [**ResolutionTierEnum**](#ResolutionTierEnum) | The resolution tier that the asset was ingested at, affecting billing for ingest &amp; storage. This field also represents the highest resolution tier that the content can be delivered at, however the actual resolution may be lower depending on the device, bandwidth, and exact resolution of the uploaded asset. |  [optional]
**maxResolutionTier** | [**MaxResolutionTierEnum**](#MaxResolutionTierEnum) | Max resolution tier can be used to control the maximum &#x60;resolution_tier&#x60; your asset is encoded, stored, and streamed at. If not set, this defaults to &#x60;1080p&#x60;. |  [optional]
**encodingTier** | [**EncodingTierEnum**](#EncodingTierEnum) | This field is deprecated. Please use &#x60;video_quality&#x60; instead. The encoding tier informs the cost, quality, and available platform features for the asset. The default encoding tier for an account can be set in the Mux Dashboard. [See the video quality guide for more details.](https://docs.mux.com/guides/use-video-quality-levels) |  [optional]
**videoQuality** | [**VideoQualityEnum**](#VideoQualityEnum) | The video quality controls the cost, quality, and available platform features for the asset. The default video quality for an account can be set in the Mux Dashboard. This field replaces the deprecated &#x60;encoding_tier&#x60; value. [See the video quality guide for more details.](https://docs.mux.com/guides/use-video-quality-levels) |  [optional]
**maxStoredFrameRate** | **Double** | The maximum frame rate that has been stored for the asset. The asset may be delivered at lower frame rates depending on the device and bandwidth, however it cannot be delivered at a higher value than is stored. This field may return -1 if the frame rate of the input cannot be reliably determined. |  [optional]
**aspectRatio** | **String** | The aspect ratio of the asset in the form of &#x60;width:height&#x60;, for example &#x60;16:9&#x60;. |  [optional]
**playbackIds** | [**java.util.List&lt;PlaybackID&gt;**](PlaybackID.md) | An array of Playback ID objects. Use these to create HLS playback URLs. See [Play your videos](https://docs.mux.com/guides/play-your-videos) for more details. |  [optional]
**tracks** | [**java.util.List&lt;Track&gt;**](Track.md) | The individual media tracks that make up an asset. |  [optional]
**errors** | [**AssetErrors**](AssetErrors.md) |  |  [optional]
**perTitleEncode** | **Boolean** |  |  [optional]
**uploadId** | **String** | Unique identifier for the Direct Upload. This is an optional parameter added when the asset is created from a direct upload. |  [optional]
**isLive** | **Boolean** | Indicates whether the live stream that created this asset is currently &#x60;active&#x60; and not in &#x60;idle&#x60; state. This is an optional parameter added when the asset is created from a live stream. |  [optional]
**passthrough** | **String** | You can set this field to anything you want. It will be included in the asset details and related webhooks. If you&#39;re looking for more structured metadata, such as &#x60;title&#x60; or &#x60;external_id&#x60; , you can use the &#x60;meta&#x60; object instead. **Max: 255 characters**. |  [optional]
**liveStreamId** | **String** | Unique identifier for the live stream. This is an optional parameter added when the asset is created from a live stream. |  [optional]
**master** | [**AssetMaster**](AssetMaster.md) |  |  [optional]
**masterAccess** | [**MasterAccessEnum**](#MasterAccessEnum) |  |  [optional]
**mp4Support** | [**Mp4SupportEnum**](#Mp4SupportEnum) |  |  [optional]
**sourceAssetId** | **String** | Asset Identifier of the video used as the source for creating the clip. |  [optional]
**normalizeAudio** | **Boolean** | Normalize the audio track loudness level. This parameter is only applicable to on-demand (not live) assets. |  [optional]
**staticRenditions** | [**AssetStaticRenditions**](AssetStaticRenditions.md) |  |  [optional]
**recordingTimes** | [**java.util.List&lt;AssetRecordingTimes&gt;**](AssetRecordingTimes.md) | An array of individual live stream recording sessions. A recording session is created on each encoder connection during the live stream. Additionally any time slate media is inserted during brief interruptions in the live stream media or times when the live streaming software disconnects, a recording session representing the slate media will be added with a \&quot;slate\&quot; type. |  [optional]
**nonStandardInputReasons** | [**AssetNonStandardInputReasons**](AssetNonStandardInputReasons.md) |  |  [optional]
**test** | **Boolean** | True means this live stream is a test asset. A test asset can help evaluate the Mux Video APIs without incurring any cost. There is no limit on number of test assets created. Test assets are watermarked with the Mux logo, limited to 10 seconds, and deleted after 24 hrs. |  [optional]
**ingestType** | [**IngestTypeEnum**](#IngestTypeEnum) | The type of ingest used to create the asset. |  [optional]
**meta** | [**AssetMetadata**](AssetMetadata.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
PREPARING | &quot;preparing&quot;
READY | &quot;ready&quot;
ERRORED | &quot;errored&quot;



## Enum: MaxStoredResolutionEnum

Name | Value
---- | -----
AUDIO_ONLY | &quot;Audio only&quot;
SD | &quot;SD&quot;
HD | &quot;HD&quot;
FHD | &quot;FHD&quot;
UHD | &quot;UHD&quot;



## Enum: ResolutionTierEnum

Name | Value
---- | -----
AUDIO_ONLY | &quot;audio-only&quot;
_720P | &quot;720p&quot;
_1080P | &quot;1080p&quot;
_1440P | &quot;1440p&quot;
_2160P | &quot;2160p&quot;



## Enum: MaxResolutionTierEnum

Name | Value
---- | -----
_1080P | &quot;1080p&quot;
_1440P | &quot;1440p&quot;
_2160P | &quot;2160p&quot;



## Enum: EncodingTierEnum

Name | Value
---- | -----
SMART | &quot;smart&quot;
BASELINE | &quot;baseline&quot;
PREMIUM | &quot;premium&quot;



## Enum: VideoQualityEnum

Name | Value
---- | -----
BASIC | &quot;basic&quot;
PLUS | &quot;plus&quot;
PREMIUM | &quot;premium&quot;



## Enum: MasterAccessEnum

Name | Value
---- | -----
TEMPORARY | &quot;temporary&quot;
NONE | &quot;none&quot;



## Enum: Mp4SupportEnum

Name | Value
---- | -----
STANDARD | &quot;standard&quot;
NONE | &quot;none&quot;
CAPPED_1080P | &quot;capped-1080p&quot;
AUDIO_ONLY | &quot;audio-only&quot;
AUDIO_ONLY_CAPPED_1080P | &quot;audio-only,capped-1080p&quot;



## Enum: IngestTypeEnum

Name | Value
---- | -----
ON_DEMAND_URL | &quot;on_demand_url&quot;
ON_DEMAND_DIRECT_UPLOAD | &quot;on_demand_direct_upload&quot;
ON_DEMAND_CLIP | &quot;on_demand_clip&quot;
LIVE_RTMP | &quot;live_rtmp&quot;
LIVE_SRT | &quot;live_srt&quot;



