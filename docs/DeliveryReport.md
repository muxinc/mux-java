

# DeliveryReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**liveStreamId** | **String** | Unique identifier for the live stream that created the asset. |  [optional]
**assetId** | **String** | Unique identifier for the asset. |  [optional]
**passthrough** | **String** | The &#x60;passthrough&#x60; value for the asset. |  [optional]
**createdAt** | **String** | Time at which the asset was created. Measured in seconds since the Unix epoch. |  [optional]
**deletedAt** | **String** | If exists, time at which the asset was deleted. Measured in seconds since the Unix epoch. |  [optional]
**assetState** | [**AssetStateEnum**](#AssetStateEnum) | The state of the asset. |  [optional]
**assetDuration** | **Double** | The duration of the asset in seconds. |  [optional]
**assetResolutionTier** | [**AssetResolutionTierEnum**](#AssetResolutionTierEnum) | The resolution tier that the asset was ingested at, affecting billing for ingest &amp; storage |  [optional]
**assetEncodingTier** | [**AssetEncodingTierEnum**](#AssetEncodingTierEnum) | The encoding tier that the asset was ingested at. [See the encoding tiers guide for more details.](https://docs.mux.com/guides/use-encoding-tiers) |  [optional]
**deliveredSeconds** | **Double** | Total number of delivered seconds during this time window. |  [optional]
**deliveredSecondsByResolution** | [**DeliveryReportDeliveredSecondsByResolution**](DeliveryReportDeliveredSecondsByResolution.md) |  |  [optional]



## Enum: AssetStateEnum

Name | Value
---- | -----
READY | &quot;ready&quot;
ERRORED | &quot;errored&quot;
DELETED | &quot;deleted&quot;



## Enum: AssetResolutionTierEnum

Name | Value
---- | -----
AUDIO_ONLY | &quot;audio-only&quot;
_720P | &quot;720p&quot;
_1080P | &quot;1080p&quot;
_1440P | &quot;1440p&quot;
_2160P | &quot;2160p&quot;



## Enum: AssetEncodingTierEnum

Name | Value
---- | -----
SMART | &quot;smart&quot;
BASELINE | &quot;baseline&quot;



