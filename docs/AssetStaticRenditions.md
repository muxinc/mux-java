

# AssetStaticRenditions

An object containing the current status of any static renditions (mp4s). The object does not exist if no static renditions have been requested. See [Download your videos](https://docs.mux.com/guides/enable-static-mp4-renditions) for more information.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Indicates the status of downloadable MP4 versions of this asset. This field is only valid when &#x60;mp4_support&#x60; is enabled |  [optional]
**files** | [**java.util.List&lt;StaticRendition&gt;**](StaticRendition.md) | Array of file objects. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
READY | &quot;ready&quot;
PREPARING | &quot;preparing&quot;
DISABLED | &quot;disabled&quot;
ERRORED | &quot;errored&quot;



