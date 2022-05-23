

# CreateSpaceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **SpaceType** |  |  [optional]
**passthrough** | **String** | Arbitrary user-supplied metadata that will be included in the space details and related webhooks. Max: 255 characters. |  [optional]
**broadcasts** | [**java.util.List&lt;CreateBroadcastRequest&gt;**](CreateBroadcastRequest.md) | An array of broadcast destinations you want to stream the space to. **Note:** By default only a single broadcast destination can be specified. Contact Mux support if you need more. |  [optional]



