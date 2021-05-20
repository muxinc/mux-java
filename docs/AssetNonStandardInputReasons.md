

# AssetNonStandardInputReasons

An object containing one or more reasons the input file is non-standard. See [the guide on minimizing processing time](https://docs.mux.com/guides/video/minimize-processing-time) for more information on what a standard input is defined as. This object only exists on on-demand assets that have non-standard inputs, so if missing you can assume the input qualifies as standard.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**videoCodec** | **String** | The video codec used on the input file. For example, the input file encoded with &#x60;hevc&#x60; video codec is non-standard and the value of this parameter is &#x60;hevc&#x60;. |  [optional]
**audioCodec** | **String** | The audio codec used on the input file. Non-AAC audio codecs are non-standard. |  [optional]
**videoGopSize** | [**VideoGopSizeEnum**](#VideoGopSizeEnum) | The video key frame Interval (also called as Group of Picture or GOP) of the input file is &#x60;high&#x60;. This parameter is present when the gop is greater than 10 seconds. |  [optional]
**videoFrameRate** | **String** | The video frame rate of the input file. Video with average frames per second (fps) less than 10 or greater than 120 is non-standard. A &#x60;-1&#x60; frame rate value indicates Mux could not determine the frame rate of the video track. |  [optional]
**videoResolution** | **String** | The video resolution of the input file. Video resolution higher than 2048 pixels on any one dimension (height or width) is considered non-standard, The resolution value is presented as &#x60;width&#x60; x &#x60;height&#x60; in pixels. |  [optional]
**pixelAspectRatio** | **String** | The video pixel aspect ratio of the input file. |  [optional]
**videoEditList** | [**VideoEditListEnum**](#VideoEditListEnum) | Video Edit List reason indicates that the input file&#39;s video track contains a complex Edit Decision List. |  [optional]
**audioEditList** | [**AudioEditListEnum**](#AudioEditListEnum) | Audio Edit List reason indicates that the input file&#39;s audio track contains a complex Edit Decision List. |  [optional]
**unexpectedMediaFileParameters** | [**UnexpectedMediaFileParametersEnum**](#UnexpectedMediaFileParametersEnum) | A catch-all reason when the input file in created with non-standard encoding parameters. |  [optional]



## Enum: VideoGopSizeEnum

Name | Value
---- | -----
HIGH | &quot;high&quot;



## Enum: VideoEditListEnum

Name | Value
---- | -----
NON_STANDARD | &quot;non-standard&quot;



## Enum: AudioEditListEnum

Name | Value
---- | -----
NON_STANDARD | &quot;non-standard&quot;



## Enum: UnexpectedMediaFileParametersEnum

Name | Value
---- | -----
NON_STANDARD | &quot;non-standard&quot;



