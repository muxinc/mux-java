

# CreateAssetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | [**java.util.List&lt;InputSettings&gt;**](InputSettings.md) | An array of objects that each describe an input file to be used to create the asset. As a shortcut, input can also be a string URL for a file when only one input file is used. See &#x60;input[].url&#x60; for requirements. |  [optional]
**playbackPolicy** | **java.util.List&lt;PlaybackPolicy&gt;** | An array of playback policy names that you want applied to this asset and available through &#x60;playback_ids&#x60;. Options include: &#x60;\&quot;public\&quot;&#x60; (anyone with the playback URL can stream the asset). And &#x60;\&quot;signed\&quot;&#x60; (an additional access token is required to play the asset). If no playback_policy is set, the asset will have no playback IDs and will therefore not be playable. For simplicity, a single string name can be used in place of the array in the case of only one playback policy. |  [optional]
**perTitleEncode** | **Boolean** |  |  [optional]
**passthrough** | **String** | Arbitrary user-supplied metadata that will be included in the asset details and related webhooks. Can be used to store your own ID for a video along with the asset. **Max: 255 characters**. |  [optional]
**mp4Support** | [**Mp4SupportEnum**](#Mp4SupportEnum) | Specify what level (if any) of support for mp4 playback. In most cases you should use our default HLS-based streaming playback ({playback_id}.m3u8) which can automatically adjust to viewers&#39; connection speeds, but an mp4 can be useful for some legacy devices or downloading for offline playback. See the [Download your videos guide](/guides/video/download-your-videos) for more information. |  [optional]
**normalizeAudio** | **Boolean** | Normalize the audio track loudness level. This parameter is only applicable to on-demand (not live) assets. |  [optional]
**masterAccess** | [**MasterAccessEnum**](#MasterAccessEnum) | Specify what level (if any) of support for master access. Master access can be enabled temporarily for your asset to be downloaded. See the [Download your videos guide](/guides/video/download-your-videos) for more information. |  [optional]
**test** | **Boolean** | Marks the asset as a test asset when the value is set to true. A Test asset can help evaluate the Mux Video APIs without incurring any cost. There is no limit on number of test assets created. Test asset are watermarked with the Mux logo, limited to 10 seconds, deleted after 24 hrs. |  [optional]
**maxResolutionTier** | [**MaxResolutionTierEnum**](#MaxResolutionTierEnum) | Max resolution tier can be used to control the maximum &#x60;resolution_tier&#x60; your asset is encoded, stored, and streamed at. If not set, this defaults to &#x60;1080p&#x60;. |  [optional]
**encodingTier** | [**EncodingTierEnum**](#EncodingTierEnum) | The encoding tier informs the cost, quality, and available platform features for the asset. By default the &#x60;smart&#x60; encoding tier is used. [See the guide for more details.](https://docs.mux.com/guides/video/use-encoding-tiers) |  [optional]



## Enum: Mp4SupportEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
STANDARD | &quot;standard&quot;



## Enum: MasterAccessEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
TEMPORARY | &quot;temporary&quot;



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



