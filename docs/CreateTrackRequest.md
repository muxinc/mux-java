

# CreateTrackRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** |  | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**textType** | [**TextTypeEnum**](#TextTypeEnum) |  | 
**languageCode** | **String** | The language code value must be a valid BCP 47 specification compliant value. For example, en for English or en-US for the US version of English. | 
**name** | **String** | The name of the track containing a human-readable description. This value must be unique across all the text type and subtitles text type tracks. HLS manifest will associate subtitle text track with this value. For example, set the value to \&quot;English\&quot; for subtitles text track with language_code as en-US. If this parameter is not included, Mux will auto-populate based on the language_code value. |  [optional]
**closedCaptions** | **Boolean** | Indicates the track provides Subtitles for the Deaf or Hard-of-hearing (SDH). |  [optional]
**passthrough** | **String** | Arbitrary user-supplied metadata set for the track either when creating the asset or track. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TEXT | &quot;text&quot;



## Enum: TextTypeEnum

Name | Value
---- | -----
SUBTITLES | &quot;subtitles&quot;



