

# LiveStream

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the Live Stream. Max 255 characters. |  [optional]
**createdAt** | **String** | Time the Live Stream was created, defined as a Unix timestamp (seconds since epoch). |  [optional]
**streamKey** | **String** | Unique key used for streaming to a Mux RTMP endpoint. This should be considered as sensitive as credentials, anyone with this stream key can begin streaming. |  [optional]
**activeAssetId** | **String** | The Asset that is currently being created if there is an active broadcast. |  [optional]
**recentAssetIds** | **java.util.List&lt;String&gt;** | An array of strings with the most recent Assets that were created from this live stream. |  [optional]
**status** | **LiveStreamStatus** |  |  [optional]
**playbackIds** | [**java.util.List&lt;PlaybackID&gt;**](PlaybackID.md) | An array of Playback ID objects. Use these to create HLS playback URLs. See [Play your videos](https://docs.mux.com/guides/video/play-your-videos) for more details. |  [optional]
**newAssetSettings** | [**CreateAssetRequest**](CreateAssetRequest.md) |  |  [optional]
**passthrough** | **String** | Arbitrary user-supplied metadata set for the asset. Max 255 characters. |  [optional]
**audioOnly** | **Boolean** | The live stream only processes the audio track if the value is set to true. Mux drops the video track if broadcasted. |  [optional]
**embeddedSubtitles** | [**java.util.List&lt;LiveStreamEmbeddedSubtitleSettings&gt;**](LiveStreamEmbeddedSubtitleSettings.md) | Describes the embedded closed caption configuration of the incoming live stream. |  [optional]
**reconnectWindow** | **Float** | When live streaming software disconnects from Mux, either intentionally or due to a drop in the network, the Reconnect Window is the time in seconds that Mux should wait for the streaming software to reconnect before considering the live stream finished and completing the recorded asset. **Min**: 0.1s. **Max**: 300s (5 minutes). |  [optional]
**reducedLatency** | **Boolean** | This field is deprecated. Please use latency_mode instead. Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this if you want lower latency for your live stream. **Note**: Reconnect windows are incompatible with Reduced Latency and will always be set to zero (0) seconds. See the [Reduce live stream latency guide](https://docs.mux.com/guides/video/reduce-live-stream-latency) to understand the tradeoffs. |  [optional]
**lowLatency** | **Boolean** | This field is deprecated. Please use latency_mode instead. Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Setting this option will enable compatibility with the LL-HLS specification for low-latency streaming. This typically has lower latency than Reduced Latency streams, and cannot be combined with Reduced Latency. Note: Reconnect windows are incompatible with Low Latency and will always be set to zero (0) seconds. |  [optional]
**simulcastTargets** | [**java.util.List&lt;SimulcastTarget&gt;**](SimulcastTarget.md) | Each Simulcast Target contains configuration details to broadcast (or \&quot;restream\&quot;) a live stream to a third-party streaming service. [See the Stream live to 3rd party platforms guide](https://docs.mux.com/guides/video/stream-live-to-3rd-party-platforms). |  [optional]
**latencyMode** | [**LatencyModeEnum**](#LatencyModeEnum) | Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this as an alternative to setting low latency or reduced latency flags. The Low Latency value is a beta feature. Note: Reconnect windows are incompatible with Reduced Latency and Low Latency and will always be set to zero (0) seconds. Read more here: https://mux.com/blog/introducing-low-latency-live-streaming/ |  [optional]
**test** | **Boolean** | True means this live stream is a test live stream. Test live streams can be used to help evaluate the Mux Video APIs for free. There is no limit on the number of test live streams, but they are watermarked with the Mux logo, and limited to 5 minutes. The test live stream is disabled after the stream is active for 5 mins and the recorded asset also deleted after 24 hours. |  [optional]
**maxContinuousDuration** | **Integer** | The time in seconds a live stream may be continuously active before being disconnected. Defaults to 12 hours. |  [optional]



## Enum: LatencyModeEnum

Name | Value
---- | -----
LOW | &quot;low&quot;
REDUCED | &quot;reduced&quot;
STANDARD | &quot;standard&quot;



