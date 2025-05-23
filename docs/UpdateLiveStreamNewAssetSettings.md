

# UpdateLiveStreamNewAssetSettings

Updates the new asset settings to use to generate a new asset for this live stream. Only the `mp4_support`, `master_access`, and `video_quality` settings may be updated. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mp4Support** | [**Mp4SupportEnum**](#Mp4SupportEnum) | Deprecated. See the [Static Renditions API](https://www.mux.com/docs/guides/enable-static-mp4-renditions#during-live-stream-creation) for the updated API. Specify what level of support for mp4 playback should be added to new assets generated from this live stream. * The &#x60;none&#x60; option disables MP4 support for new assets. MP4 files will not be produced for an asset generated from this live stream. * The &#x60;capped-1080p&#x60; option produces a single MP4 file, called &#x60;capped-1080p.mp4&#x60;, with the video resolution capped at 1080p. This option produces an &#x60;audio.m4a&#x60; file for an audio-only asset. * The &#x60;audio-only&#x60; option produces a single M4A file, called &#x60;audio.m4a&#x60; for a video or an audio-only asset. MP4 generation will error when this option is specified for a video-only asset. * The &#x60;audio-only,capped-1080p&#x60; option produces both the &#x60;audio.m4a&#x60; and &#x60;capped-1080p.mp4&#x60; files. Only the &#x60;capped-1080p.mp4&#x60; file is produced for a video-only asset, while only the &#x60;audio.m4a&#x60; file is produced for an audio-only asset. * The &#x60;standard&#x60;(deprecated) option produces up to three MP4 files with different levels of resolution (&#x60;high.mp4&#x60;, &#x60;medium.mp4&#x60;, &#x60;low.mp4&#x60;, or &#x60;audio.m4a&#x60; for an audio-only asset).  |  [optional]
**masterAccess** | [**MasterAccessEnum**](#MasterAccessEnum) | Add or remove access to the master version of the video. |  [optional]
**videoQuality** | [**VideoQualityEnum**](#VideoQualityEnum) | The video quality controls the cost, quality, and available platform features for the asset. [See the video quality guide for more details.](https://docs.mux.com/guides/use-video-quality-levels) |  [optional]
**meta** | [**AssetMetadata**](AssetMetadata.md) |  |  [optional]



## Enum: Mp4SupportEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
STANDARD | &quot;standard&quot;
CAPPED_1080P | &quot;capped-1080p&quot;
AUDIO_ONLY | &quot;audio-only&quot;
AUDIO_ONLY_CAPPED_1080P | &quot;audio-only,capped-1080p&quot;



## Enum: MasterAccessEnum

Name | Value
---- | -----
TEMPORARY | &quot;temporary&quot;
NONE | &quot;none&quot;



## Enum: VideoQualityEnum

Name | Value
---- | -----
PLUS | &quot;plus&quot;
PREMIUM | &quot;premium&quot;



