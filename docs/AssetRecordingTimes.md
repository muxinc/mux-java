

# AssetRecordingTimes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startedAt** | **OffsetDateTime** | The time at which the recording for the live stream started. The time value is Unix epoch time represented in ISO 8601 format. |  [optional]
**duration** | **Double** | The duration of the live stream recorded. The time value is in seconds. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of media represented by the recording session, either &#x60;content&#x60; for normal stream content or &#x60;slate&#x60; for slate media inserted during stream interruptions. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CONTENT | &quot;content&quot;
SLATE | &quot;slate&quot;



