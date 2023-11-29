

# WebInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the Web Input. |  [optional]
**createdAt** | **String** | Time the Web Input was created, defined as a Unix timestamp (seconds since epoch). |  [optional]
**url** | **String** | The URL for the Web Input to load. |  [optional]
**autoLaunch** | **Boolean** | When set to &#x60;true&#x60; the Web Input will automatically launch and start streaming immediately after creation |  [optional]
**liveStreamId** | **String** | The Live Stream ID to broadcast this Web Input to |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**passthrough** | **String** | Arbitrary metadata that will be included in the Web Input details and related webhooks. Can be used to store your own ID for the Web Input. **Max: 255 characters**. |  [optional]
**resolution** | [**ResolutionEnum**](#ResolutionEnum) | The resolution of the viewport of the Web Input&#39;s browser instance. Defaults to 1920x1080 if not set. |  [optional]
**timeout** | **Integer** | The number of seconds that the Web Input should stream for before automatically shutting down. |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
IDLE | &quot;idle&quot;
LAUNCHING | &quot;launching&quot;
STREAMING | &quot;streaming&quot;



## Enum: ResolutionEnum

Name | Value
---- | -----
_1920X1080 | &quot;1920x1080&quot;
_1280X720 | &quot;1280x720&quot;
_1080X1920 | &quot;1080x1920&quot;
_720X1280 | &quot;720x1280&quot;
_1080X1080 | &quot;1080x1080&quot;
_720X720 | &quot;720x720&quot;



