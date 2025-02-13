

# StaticRendition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**NameEnum**](#NameEnum) | Name of the static rendition file |  [optional]
**ext** | [**ExtEnum**](#ExtEnum) | Extension of the static rendition file |  [optional]
**height** | **Integer** | The height of the static rendition&#39;s file in pixels |  [optional]
**width** | **Integer** | The width of the static rendition&#39;s file in pixels |  [optional]
**bitrate** | **Long** | The bitrate in bits per second |  [optional]
**filesize** | **String** | The file size in bytes |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Indicates the static rendition type of this specific MP4 version of this asset. This field is only valid for &#x60;static_renditions&#x60;, not for &#x60;mp4_support&#x60;. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Indicates the status of this specific MP4 version of this asset. This field is only valid for &#x60;static_renditions&#x60;, not for &#x60;mp4_support&#x60;. * &#x60;ready&#x60; indicates the MP4 has been generated and is ready for download * &#x60;preparing&#x60; indicates the asset has not been ingested or the static rendition is still being generated after an asset is ready * &#x60;skipped&#x60; indicates the static rendition will not be generated because the requested resolution conflicts with the asset attributes after the asset has been ingested * &#x60;errored&#x60; indicates the static rendition cannot be generated. For example, an asset could not be ingested  |  [optional]
**resolutionTier** | [**ResolutionTierEnum**](#ResolutionTierEnum) | Indicates the resolution tier of this specific MP4 version of this asset. This field is only valid for &#x60;static_renditions&#x60;, not for &#x60;mp4_support&#x60;. |  [optional]
**resolution** | [**ResolutionEnum**](#ResolutionEnum) | Indicates the resolution of this specific MP4 version of this asset. This field is only valid for &#x60;static_renditions&#x60;, not for &#x60;mp4_support&#x60;. |  [optional]
**id** | **String** | The ID of this static rendition, used in managing this static rendition. This field is only valid for &#x60;static_renditions&#x60;, not for &#x60;mp4_support&#x60;. |  [optional]



## Enum: NameEnum

Name | Value
---- | -----
LOW_MP4 | &quot;low.mp4&quot;
MEDIUM_MP4 | &quot;medium.mp4&quot;
HIGH_MP4 | &quot;high.mp4&quot;
HIGHEST_MP4 | &quot;highest.mp4&quot;
AUDIO_M4A | &quot;audio.m4a&quot;
CAPPED_1080P_MP4 | &quot;capped-1080p.mp4&quot;
_2160P_MP4 | &quot;2160p.mp4&quot;
_1440P_MP4 | &quot;1440p.mp4&quot;
_1080P_MP4 | &quot;1080p.mp4&quot;
_720P_MP4 | &quot;720p.mp4&quot;
_540P_MP4 | &quot;540p.mp4&quot;
_480P_MP4 | &quot;480p.mp4&quot;
_360P_MP4 | &quot;360p.mp4&quot;
_270P_MP4 | &quot;270p.mp4&quot;



## Enum: ExtEnum

Name | Value
---- | -----
MP4 | &quot;mp4&quot;
M4A | &quot;m4a&quot;



## Enum: TypeEnum

Name | Value
---- | -----
STANDARD | &quot;standard&quot;
ADVANCED | &quot;advanced&quot;



## Enum: StatusEnum

Name | Value
---- | -----
READY | &quot;ready&quot;
PREPARING | &quot;preparing&quot;
SKIPPED | &quot;skipped&quot;
ERRORED | &quot;errored&quot;



## Enum: ResolutionTierEnum

Name | Value
---- | -----
_2160P | &quot;2160p&quot;
_1440P | &quot;1440p&quot;
_1080P | &quot;1080p&quot;
_720P | &quot;720p&quot;



## Enum: ResolutionEnum

Name | Value
---- | -----
HIGHEST | &quot;highest&quot;
AUDIO_ONLY | &quot;audio-only&quot;
_2160P | &quot;2160p&quot;
_1440P | &quot;1440p&quot;
_1080P | &quot;1080p&quot;
_720P | &quot;720p&quot;
_540P | &quot;540p&quot;
_480P | &quot;480p&quot;
_360P | &quot;360p&quot;
_270P | &quot;270p&quot;



