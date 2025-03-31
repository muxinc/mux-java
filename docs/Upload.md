

# Upload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the Direct Upload. |  [optional]
**timeout** | **Integer** | Max time in seconds for the signed upload URL to be valid. If a successful upload has not occurred before the timeout limit, the direct upload is marked &#x60;timed_out&#x60; |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**newAssetSettings** | [**CreateAssetRequest**](CreateAssetRequest.md) |  |  [optional]
**assetId** | **String** | Only set once the upload is in the &#x60;asset_created&#x60; state. |  [optional]
**error** | [**UploadError**](UploadError.md) |  |  [optional]
**corsOrigin** | **String** | If the upload URL will be used in a browser, you must specify the origin in order for the signed URL to have the correct CORS headers. |  [optional]
**url** | **String** | The URL to upload the associated source media to. |  [optional]
**test** | **Boolean** | Indicates if this is a test Direct Upload, in which case the Asset that gets created will be a &#x60;test&#x60; Asset. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
WAITING | &quot;waiting&quot;
ASSET_CREATED | &quot;asset_created&quot;
ERRORED | &quot;errored&quot;
CANCELLED | &quot;cancelled&quot;
TIMED_OUT | &quot;timed_out&quot;



