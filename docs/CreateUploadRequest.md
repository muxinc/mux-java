

# CreateUploadRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeout** | **Integer** | Max time in seconds for the signed upload URL to be valid. If a successful upload has not occurred before the timeout limit, the direct upload is marked &#x60;timed_out&#x60; |  [optional]
**corsOrigin** | **String** | If the upload URL will be used in a browser, you must specify the origin in order for the signed URL to have the correct CORS headers. |  [optional]
**newAssetSettings** | [**CreateAssetRequest**](CreateAssetRequest.md) |  |  [optional]
**test** | **Boolean** |  |  [optional]



