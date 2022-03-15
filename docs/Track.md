

# Track

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the Track |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of track |  [optional]
**duration** | **Double** | The duration in seconds of the track media. This parameter is not set for the &#x60;text&#x60; type track. This field is optional and may not be set. The top level &#x60;duration&#x60; field of an asset will always be set. |  [optional]
**maxWidth** | **Long** | The maximum width in pixels available for the track. Only set for the &#x60;video&#x60; type track. |  [optional]
**maxHeight** | **Long** | The maximum height in pixels available for the track. Only set for the &#x60;video&#x60; type track. |  [optional]
**maxFrameRate** | **Double** | The maximum frame rate available for the track. Only set for the &#x60;video&#x60; type track. This field may return &#x60;-1&#x60; if the frame rate of the input cannot be reliably determined. |  [optional]
**maxChannels** | **Long** | The maximum number of audio channels the track supports. Only set for the &#x60;audio&#x60; type track. |  [optional]
**maxChannelLayout** | **String** | Only set for the &#x60;audio&#x60; type track. |  [optional]
**textType** | [**TextTypeEnum**](#TextTypeEnum) | This parameter is set only for the &#x60;text&#x60; type track. |  [optional]
**languageCode** | **String** | The language code value represents [BCP 47](https://tools.ietf.org/html/bcp47) specification compliant value. For example, &#x60;en&#x60; for English or &#x60;en-US&#x60; for the US version of English. This parameter is set for &#x60;text&#x60; type and &#x60;subtitles&#x60; text type track. |  [optional]
**name** | **String** | The name of the track containing a human-readable description. The hls manifest will associate a subtitle text track with this value. For example, the value is \&quot;English\&quot; for subtitles text track for the &#x60;language_code&#x60; value of &#x60;en-US&#x60;. This parameter is set for the &#x60;text&#x60; type and &#x60;subtitles&#x60; text type track. |  [optional]
**closedCaptions** | **Boolean** | Indicates the track provides Subtitles for the Deaf or Hard-of-hearing (SDH). This parameter is set for the &#x60;text&#x60; type and &#x60;subtitles&#x60; text type track. |  [optional]
**passthrough** | **String** | Arbitrary user-supplied metadata set for the track either when creating the asset or track. This parameter is set for &#x60;text&#x60; type and &#x60;subtitles&#x60; text type track. Max 255 characters. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
VIDEO | &quot;video&quot;
AUDIO | &quot;audio&quot;
TEXT | &quot;text&quot;



## Enum: TextTypeEnum

Name | Value
---- | -----
SUBTITLES | &quot;subtitles&quot;



