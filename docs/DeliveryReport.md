

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
**deliveredSeconds** | **Double** | Total number of delivered seconds during this time window. |  [optional]
**deliveredSecondsByResolution** | [**DeliveryReportDeliveredSecondsByResolution**](DeliveryReportDeliveredSecondsByResolution.md) |  |  [optional]



## Enum: AssetStateEnum

Name | Value
---- | -----
READY | &quot;ready&quot;
ERRORED | &quot;errored&quot;
DELETED | &quot;deleted&quot;



