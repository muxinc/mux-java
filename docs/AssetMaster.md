

# AssetMaster

An object containing the current status of Master Access and the link to the Master MP4 file when ready. This object does not exist if `master_acess` is set to `none` and when the temporary URL expires.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**url** | **String** | The temporary URL to the master version of the video, as an MP4 file. This URL will expire after 24 hours. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
READY | &quot;ready&quot;
PREPARING | &quot;preparing&quot;
ERRORED | &quot;errored&quot;



