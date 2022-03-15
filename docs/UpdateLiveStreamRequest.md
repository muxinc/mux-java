

# UpdateLiveStreamRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**passthrough** | **String** | Arbitrary user-supplied metadata set for the live stream. Max 255 characters. In order to clear this value, the field should be included with an empty-string value. |  [optional]
**latencyMode** | [**LatencyModeEnum**](#LatencyModeEnum) | Latency is the time from when the streamer transmits a frame of video to when you see it in the player. Set this as an alternative to setting low latency or reduced latency flags. The Low Latency value is a beta feature. Note: Reconnect windows are incompatible with Reduced Latency and Low Latency and will always be set to zero (0) seconds. Read more here: https://mux.com/blog/introducing-low-latency-live-streaming/ |  [optional]
**reconnectWindow** | **Float** | When live streaming software disconnects from Mux, either intentionally or due to a drop in the network, the Reconnect Window is the time in seconds that Mux should wait for the streaming software to reconnect before considering the live stream finished and completing the recorded asset. |  [optional]
**maxContinuousDuration** | **Integer** | The time in seconds a live stream may be continuously active before being disconnected. Defaults to 12 hours. |  [optional]



## Enum: LatencyModeEnum

Name | Value
---- | -----
LOW | &quot;low&quot;
REDUCED | &quot;reduced&quot;
STANDARD | &quot;standard&quot;



