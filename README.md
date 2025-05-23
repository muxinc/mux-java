<!-- this is actually templates/okhttp-gson/README.mustache -->

<h1 align="center"><pre>mux-java</pre></h1>

<p align="center">
  <a href="https://search.maven.org/artifact/com.mux/mux-sdk-java"><img src="https://img.shields.io/maven-central/v/com.mux/mux-sdk-java" title="Maven Central" /></a>
  <a href="https://github.com/muxinc/mux-java/workflows/ci.yaml"><img src="https://github.com/muxinc/mux-java/actions/workflows/ci.yaml/badge.svg" title="CI" /></a>
</p>
<p align="center">
  <a href="https://search.maven.org/artifact/com.mux/mux-sdk-java">Maven Central</a> |
  <a href="https://docs.mux.com">Mux Docs</a> |
  <a href="https://docs.mux.com/api-reference">Mux API Reference </a>
</p>

## Usage With Webhooks

At this moment, this SDK is not suitable for parsing or modeling webhook payloads, due to some incompatibilities in our API spec and our SDK generation tooling. We are working on resolving these issues, but for now you should only use this SDK for Mux's REST APIs.

Mux is how developers build online video. This API encompasses both Mux Video and Mux Data functionality to help you build your video-related projects better and faster than ever before.

  For more information, please visit [https://docs.mux.com](https://docs.mux.com)

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.mux</groupId>
  <artifactId>mux-sdk-java</artifactId>
  <version>2.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mux:mux-sdk-java:2.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mux-sdk-java-2.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.mux.ApiClient;
import com.mux.ApiException;
import com.mux.Configuration;
import com.mux.auth.*;
import com.mux.models.*;
import com.mux.sdk.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mux.com");
    
    // Configure HTTP basic authorization: accessToken
    HttpBasicAuth accessToken = (HttpBasicAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setUsername("YOUR USERNAME");
    accessToken.setPassword("YOUR PASSWORD");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    CreateAssetRequest createAssetRequest = {"inputs":[{"url":"https://muxed.s3.amazonaws.com/leds.mp4"}],"playback_policies":["public"],"video_quality":"basic"}; // CreateAssetRequest | 
    try {
      AssetResponse result = apiInstance.createAsset(createAssetRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#createAsset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mux.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**createAsset**](docs/AssetsApi.md#createAsset) | **POST** /video/v1/assets | Create an asset
*AssetsApi* | [**createAssetPlaybackId**](docs/AssetsApi.md#createAssetPlaybackId) | **POST** /video/v1/assets/{ASSET_ID}/playback-ids | Create a playback ID
*AssetsApi* | [**createAssetStaticRendition**](docs/AssetsApi.md#createAssetStaticRendition) | **POST** /video/v1/assets/{ASSET_ID}/static-renditions | Create a static rendition for an asset
*AssetsApi* | [**createAssetTrack**](docs/AssetsApi.md#createAssetTrack) | **POST** /video/v1/assets/{ASSET_ID}/tracks | Create an asset track
*AssetsApi* | [**deleteAsset**](docs/AssetsApi.md#deleteAsset) | **DELETE** /video/v1/assets/{ASSET_ID} | Delete an asset
*AssetsApi* | [**deleteAssetPlaybackId**](docs/AssetsApi.md#deleteAssetPlaybackId) | **DELETE** /video/v1/assets/{ASSET_ID}/playback-ids/{PLAYBACK_ID} | Delete a playback ID
*AssetsApi* | [**deleteAssetStaticRendition**](docs/AssetsApi.md#deleteAssetStaticRendition) | **DELETE** /video/v1/assets/{ASSET_ID}/static-renditions/{STATIC_RENDITION_ID} | Delete a single static rendition for an asset
*AssetsApi* | [**deleteAssetTrack**](docs/AssetsApi.md#deleteAssetTrack) | **DELETE** /video/v1/assets/{ASSET_ID}/tracks/{TRACK_ID} | Delete an asset track
*AssetsApi* | [**generateAssetTrackSubtitles**](docs/AssetsApi.md#generateAssetTrackSubtitles) | **POST** /video/v1/assets/{ASSET_ID}/tracks/{TRACK_ID}/generate-subtitles | Generate track subtitles
*AssetsApi* | [**getAsset**](docs/AssetsApi.md#getAsset) | **GET** /video/v1/assets/{ASSET_ID} | Retrieve an asset
*AssetsApi* | [**getAssetInputInfo**](docs/AssetsApi.md#getAssetInputInfo) | **GET** /video/v1/assets/{ASSET_ID}/input-info | Retrieve asset input info
*AssetsApi* | [**getAssetPlaybackId**](docs/AssetsApi.md#getAssetPlaybackId) | **GET** /video/v1/assets/{ASSET_ID}/playback-ids/{PLAYBACK_ID} | Retrieve a playback ID
*AssetsApi* | [**listAssets**](docs/AssetsApi.md#listAssets) | **GET** /video/v1/assets | List assets
*AssetsApi* | [**updateAsset**](docs/AssetsApi.md#updateAsset) | **PATCH** /video/v1/assets/{ASSET_ID} | Update an asset
*AssetsApi* | [**updateAssetMasterAccess**](docs/AssetsApi.md#updateAssetMasterAccess) | **PUT** /video/v1/assets/{ASSET_ID}/master-access | Update master access
*AssetsApi* | [**updateAssetMp4Support**](docs/AssetsApi.md#updateAssetMp4Support) | **PUT** /video/v1/assets/{ASSET_ID}/mp4-support | Update MP4 support
*DeliveryUsageApi* | [**listDeliveryUsage**](docs/DeliveryUsageApi.md#listDeliveryUsage) | **GET** /video/v1/delivery-usage | List Usage
*DimensionsApi* | [**listDimensionValues**](docs/DimensionsApi.md#listDimensionValues) | **GET** /data/v1/dimensions/{DIMENSION_ID} | Lists the values for a specific dimension
*DimensionsApi* | [**listDimensions**](docs/DimensionsApi.md#listDimensions) | **GET** /data/v1/dimensions | List Dimensions
*DirectUploadsApi* | [**cancelDirectUpload**](docs/DirectUploadsApi.md#cancelDirectUpload) | **PUT** /video/v1/uploads/{UPLOAD_ID}/cancel | Cancel a direct upload
*DirectUploadsApi* | [**createDirectUpload**](docs/DirectUploadsApi.md#createDirectUpload) | **POST** /video/v1/uploads | Create a new direct upload URL
*DirectUploadsApi* | [**getDirectUpload**](docs/DirectUploadsApi.md#getDirectUpload) | **GET** /video/v1/uploads/{UPLOAD_ID} | Retrieve a single direct upload&#39;s info
*DirectUploadsApi* | [**listDirectUploads**](docs/DirectUploadsApi.md#listDirectUploads) | **GET** /video/v1/uploads | List direct uploads
*DrmConfigurationsApi* | [**getDrmConfiguration**](docs/DrmConfigurationsApi.md#getDrmConfiguration) | **GET** /video/v1/drm-configurations/{DRM_CONFIGURATION_ID} | Retrieve a DRM Configuration
*DrmConfigurationsApi* | [**listDrmConfigurations**](docs/DrmConfigurationsApi.md#listDrmConfigurations) | **GET** /video/v1/drm-configurations | List DRM Configurations
*ErrorsApi* | [**listErrors**](docs/ErrorsApi.md#listErrors) | **GET** /data/v1/errors | List Errors
*ExportsApi* | [**listExports**](docs/ExportsApi.md#listExports) | **GET** /data/v1/exports | List property video view export links
*ExportsApi* | [**listExportsViews**](docs/ExportsApi.md#listExportsViews) | **GET** /data/v1/exports/views | List available property view exports
*FiltersApi* | [**listFilterValues**](docs/FiltersApi.md#listFilterValues) | **GET** /data/v1/filters/{FILTER_ID} | Lists values for a specific filter
*FiltersApi* | [**listFilters**](docs/FiltersApi.md#listFilters) | **GET** /data/v1/filters | List Filters
*IncidentsApi* | [**getIncident**](docs/IncidentsApi.md#getIncident) | **GET** /data/v1/incidents/{INCIDENT_ID} | Get an Incident
*IncidentsApi* | [**listIncidents**](docs/IncidentsApi.md#listIncidents) | **GET** /data/v1/incidents | List Incidents
*IncidentsApi* | [**listRelatedIncidents**](docs/IncidentsApi.md#listRelatedIncidents) | **GET** /data/v1/incidents/{INCIDENT_ID}/related | List Related Incidents
*LiveStreamsApi* | [**createLiveStream**](docs/LiveStreamsApi.md#createLiveStream) | **POST** /video/v1/live-streams | Create a live stream
*LiveStreamsApi* | [**createLiveStreamPlaybackId**](docs/LiveStreamsApi.md#createLiveStreamPlaybackId) | **POST** /video/v1/live-streams/{LIVE_STREAM_ID}/playback-ids | Create a live stream playback ID
*LiveStreamsApi* | [**createLiveStreamSimulcastTarget**](docs/LiveStreamsApi.md#createLiveStreamSimulcastTarget) | **POST** /video/v1/live-streams/{LIVE_STREAM_ID}/simulcast-targets | Create a live stream simulcast target
*LiveStreamsApi* | [**deleteLiveStream**](docs/LiveStreamsApi.md#deleteLiveStream) | **DELETE** /video/v1/live-streams/{LIVE_STREAM_ID} | Delete a live stream
*LiveStreamsApi* | [**deleteLiveStreamNewAssetSettingsStaticRenditions**](docs/LiveStreamsApi.md#deleteLiveStreamNewAssetSettingsStaticRenditions) | **DELETE** /video/v1/live-streams/{LIVE_STREAM_ID}/new-asset-settings/static-renditions | Delete a live stream&#39;s static renditions setting for new assets
*LiveStreamsApi* | [**deleteLiveStreamPlaybackId**](docs/LiveStreamsApi.md#deleteLiveStreamPlaybackId) | **DELETE** /video/v1/live-streams/{LIVE_STREAM_ID}/playback-ids/{PLAYBACK_ID} | Delete a live stream playback ID
*LiveStreamsApi* | [**deleteLiveStreamSimulcastTarget**](docs/LiveStreamsApi.md#deleteLiveStreamSimulcastTarget) | **DELETE** /video/v1/live-streams/{LIVE_STREAM_ID}/simulcast-targets/{SIMULCAST_TARGET_ID} | Delete a live stream simulcast target
*LiveStreamsApi* | [**disableLiveStream**](docs/LiveStreamsApi.md#disableLiveStream) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/disable | Disable a live stream
*LiveStreamsApi* | [**enableLiveStream**](docs/LiveStreamsApi.md#enableLiveStream) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/enable | Enable a live stream
*LiveStreamsApi* | [**getLiveStream**](docs/LiveStreamsApi.md#getLiveStream) | **GET** /video/v1/live-streams/{LIVE_STREAM_ID} | Retrieve a live stream
*LiveStreamsApi* | [**getLiveStreamPlaybackId**](docs/LiveStreamsApi.md#getLiveStreamPlaybackId) | **GET** /video/v1/live-streams/{LIVE_STREAM_ID}/playback-ids/{PLAYBACK_ID} | Retrieve a live stream playback ID
*LiveStreamsApi* | [**getLiveStreamSimulcastTarget**](docs/LiveStreamsApi.md#getLiveStreamSimulcastTarget) | **GET** /video/v1/live-streams/{LIVE_STREAM_ID}/simulcast-targets/{SIMULCAST_TARGET_ID} | Retrieve a live stream simulcast target
*LiveStreamsApi* | [**listLiveStreams**](docs/LiveStreamsApi.md#listLiveStreams) | **GET** /video/v1/live-streams | List live streams
*LiveStreamsApi* | [**resetStreamKey**](docs/LiveStreamsApi.md#resetStreamKey) | **POST** /video/v1/live-streams/{LIVE_STREAM_ID}/reset-stream-key | Reset a live stream&#39;s stream key
*LiveStreamsApi* | [**signalLiveStreamComplete**](docs/LiveStreamsApi.md#signalLiveStreamComplete) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/complete | Signal a live stream is finished
*LiveStreamsApi* | [**updateLiveStream**](docs/LiveStreamsApi.md#updateLiveStream) | **PATCH** /video/v1/live-streams/{LIVE_STREAM_ID} | Update a live stream
*LiveStreamsApi* | [**updateLiveStreamEmbeddedSubtitles**](docs/LiveStreamsApi.md#updateLiveStreamEmbeddedSubtitles) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/embedded-subtitles | Update a live stream&#39;s embedded subtitles
*LiveStreamsApi* | [**updateLiveStreamGeneratedSubtitles**](docs/LiveStreamsApi.md#updateLiveStreamGeneratedSubtitles) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/generated-subtitles | Update a live stream&#39;s generated subtitles
*LiveStreamsApi* | [**updateLiveStreamNewAssetSettingsStaticRenditions**](docs/LiveStreamsApi.md#updateLiveStreamNewAssetSettingsStaticRenditions) | **PUT** /video/v1/live-streams/{LIVE_STREAM_ID}/new-asset-settings/static-renditions | Update live stream static renditions for new assets
*MetricsApi* | [**getMetricTimeseriesData**](docs/MetricsApi.md#getMetricTimeseriesData) | **GET** /data/v1/metrics/{METRIC_ID}/timeseries | Get metric timeseries data
*MetricsApi* | [**getOverallValues**](docs/MetricsApi.md#getOverallValues) | **GET** /data/v1/metrics/{METRIC_ID}/overall | Get Overall values
*MetricsApi* | [**listAllMetricValues**](docs/MetricsApi.md#listAllMetricValues) | **GET** /data/v1/metrics/comparison | List all metric values
*MetricsApi* | [**listBreakdownValues**](docs/MetricsApi.md#listBreakdownValues) | **GET** /data/v1/metrics/{METRIC_ID}/breakdown | List breakdown values
*MetricsApi* | [**listInsights**](docs/MetricsApi.md#listInsights) | **GET** /data/v1/metrics/{METRIC_ID}/insights | List Insights
*MonitoringApi* | [**getMonitoringBreakdown**](docs/MonitoringApi.md#getMonitoringBreakdown) | **GET** /data/v1/monitoring/metrics/{MONITORING_METRIC_ID}/breakdown | Get Monitoring Breakdown
*MonitoringApi* | [**getMonitoringBreakdownTimeseries**](docs/MonitoringApi.md#getMonitoringBreakdownTimeseries) | **GET** /data/v1/monitoring/metrics/{MONITORING_METRIC_ID}/breakdown-timeseries | Get Monitoring Breakdown Timeseries
*MonitoringApi* | [**getMonitoringHistogramTimeseries**](docs/MonitoringApi.md#getMonitoringHistogramTimeseries) | **GET** /data/v1/monitoring/metrics/{MONITORING_HISTOGRAM_METRIC_ID}/histogram-timeseries | Get Monitoring Histogram Timeseries
*MonitoringApi* | [**getMonitoringTimeseries**](docs/MonitoringApi.md#getMonitoringTimeseries) | **GET** /data/v1/monitoring/metrics/{MONITORING_METRIC_ID}/timeseries | Get Monitoring Timeseries
*MonitoringApi* | [**listMonitoringDimensions**](docs/MonitoringApi.md#listMonitoringDimensions) | **GET** /data/v1/monitoring/dimensions | List Monitoring Dimensions
*MonitoringApi* | [**listMonitoringMetrics**](docs/MonitoringApi.md#listMonitoringMetrics) | **GET** /data/v1/monitoring/metrics | List Monitoring Metrics
*PlaybackIdApi* | [**getAssetOrLivestreamId**](docs/PlaybackIdApi.md#getAssetOrLivestreamId) | **GET** /video/v1/playback-ids/{PLAYBACK_ID} | Retrieve an asset or live stream ID
*PlaybackRestrictionsApi* | [**createPlaybackRestriction**](docs/PlaybackRestrictionsApi.md#createPlaybackRestriction) | **POST** /video/v1/playback-restrictions | Create a Playback Restriction
*PlaybackRestrictionsApi* | [**deletePlaybackRestriction**](docs/PlaybackRestrictionsApi.md#deletePlaybackRestriction) | **DELETE** /video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID} | Delete a Playback Restriction
*PlaybackRestrictionsApi* | [**getPlaybackRestriction**](docs/PlaybackRestrictionsApi.md#getPlaybackRestriction) | **GET** /video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID} | Retrieve a Playback Restriction
*PlaybackRestrictionsApi* | [**listPlaybackRestrictions**](docs/PlaybackRestrictionsApi.md#listPlaybackRestrictions) | **GET** /video/v1/playback-restrictions | List Playback Restrictions
*PlaybackRestrictionsApi* | [**updateReferrerDomainRestriction**](docs/PlaybackRestrictionsApi.md#updateReferrerDomainRestriction) | **PUT** /video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID}/referrer | Update the Referrer Playback Restriction
*PlaybackRestrictionsApi* | [**updateUserAgentRestriction**](docs/PlaybackRestrictionsApi.md#updateUserAgentRestriction) | **PUT** /video/v1/playback-restrictions/{PLAYBACK_RESTRICTION_ID}/user_agent | Update the User Agent Restriction
*RealTimeApi* | [**getRealtimeBreakdown**](docs/RealTimeApi.md#getRealtimeBreakdown) | **GET** /data/v1/realtime/metrics/{REALTIME_METRIC_ID}/breakdown | Get Real-Time Breakdown
*RealTimeApi* | [**getRealtimeHistogramTimeseries**](docs/RealTimeApi.md#getRealtimeHistogramTimeseries) | **GET** /data/v1/realtime/metrics/{REALTIME_HISTOGRAM_METRIC_ID}/histogram-timeseries | Get Real-Time Histogram Timeseries
*RealTimeApi* | [**getRealtimeTimeseries**](docs/RealTimeApi.md#getRealtimeTimeseries) | **GET** /data/v1/realtime/metrics/{REALTIME_METRIC_ID}/timeseries | Get Real-Time Timeseries
*RealTimeApi* | [**listRealtimeDimensions**](docs/RealTimeApi.md#listRealtimeDimensions) | **GET** /data/v1/realtime/dimensions | List Real-Time Dimensions
*RealTimeApi* | [**listRealtimeMetrics**](docs/RealTimeApi.md#listRealtimeMetrics) | **GET** /data/v1/realtime/metrics | List Real-Time Metrics
*SigningKeysApi* | [**createSigningKey**](docs/SigningKeysApi.md#createSigningKey) | **POST** /system/v1/signing-keys | Create a signing key
*SigningKeysApi* | [**deleteSigningKey**](docs/SigningKeysApi.md#deleteSigningKey) | **DELETE** /system/v1/signing-keys/{SIGNING_KEY_ID} | Delete a signing key
*SigningKeysApi* | [**getSigningKey**](docs/SigningKeysApi.md#getSigningKey) | **GET** /system/v1/signing-keys/{SIGNING_KEY_ID} | Retrieve a signing key
*SigningKeysApi* | [**listSigningKeys**](docs/SigningKeysApi.md#listSigningKeys) | **GET** /system/v1/signing-keys | List signing keys
*TranscriptionVocabulariesApi* | [**createTranscriptionVocabulary**](docs/TranscriptionVocabulariesApi.md#createTranscriptionVocabulary) | **POST** /video/v1/transcription-vocabularies | Create a Transcription Vocabulary
*TranscriptionVocabulariesApi* | [**deleteTranscriptionVocabulary**](docs/TranscriptionVocabulariesApi.md#deleteTranscriptionVocabulary) | **DELETE** /video/v1/transcription-vocabularies/{TRANSCRIPTION_VOCABULARY_ID} | Delete a Transcription Vocabulary
*TranscriptionVocabulariesApi* | [**getTranscriptionVocabulary**](docs/TranscriptionVocabulariesApi.md#getTranscriptionVocabulary) | **GET** /video/v1/transcription-vocabularies/{TRANSCRIPTION_VOCABULARY_ID} | Retrieve a Transcription Vocabulary
*TranscriptionVocabulariesApi* | [**listTranscriptionVocabularies**](docs/TranscriptionVocabulariesApi.md#listTranscriptionVocabularies) | **GET** /video/v1/transcription-vocabularies | List Transcription Vocabularies
*TranscriptionVocabulariesApi* | [**updateTranscriptionVocabulary**](docs/TranscriptionVocabulariesApi.md#updateTranscriptionVocabulary) | **PUT** /video/v1/transcription-vocabularies/{TRANSCRIPTION_VOCABULARY_ID} | Update a Transcription Vocabulary
*UrlSigningKeysApi* | [**createUrlSigningKey**](docs/UrlSigningKeysApi.md#createUrlSigningKey) | **POST** /video/v1/signing-keys | Create a URL signing key
*UrlSigningKeysApi* | [**deleteUrlSigningKey**](docs/UrlSigningKeysApi.md#deleteUrlSigningKey) | **DELETE** /video/v1/signing-keys/{SIGNING_KEY_ID} | Delete a URL signing key
*UrlSigningKeysApi* | [**getUrlSigningKey**](docs/UrlSigningKeysApi.md#getUrlSigningKey) | **GET** /video/v1/signing-keys/{SIGNING_KEY_ID} | Retrieve a URL signing key
*UrlSigningKeysApi* | [**listUrlSigningKeys**](docs/UrlSigningKeysApi.md#listUrlSigningKeys) | **GET** /video/v1/signing-keys | List URL signing keys
*VideoViewsApi* | [**getVideoView**](docs/VideoViewsApi.md#getVideoView) | **GET** /data/v1/video-views/{VIDEO_VIEW_ID} | Get a Video View
*VideoViewsApi* | [**listVideoViews**](docs/VideoViewsApi.md#listVideoViews) | **GET** /data/v1/video-views | List Video Views
*WebInputsApi* | [**createWebInput**](docs/WebInputsApi.md#createWebInput) | **POST** /video/v1/web-inputs | Create a new Web Input
*WebInputsApi* | [**deleteWebInput**](docs/WebInputsApi.md#deleteWebInput) | **DELETE** /video/v1/web-inputs/{WEB_INPUT_ID} | Delete a Web Input
*WebInputsApi* | [**getWebInput**](docs/WebInputsApi.md#getWebInput) | **GET** /video/v1/web-inputs/{WEB_INPUT_ID} | Retrieve a Web Input
*WebInputsApi* | [**launchWebInput**](docs/WebInputsApi.md#launchWebInput) | **PUT** /video/v1/web-inputs/{WEB_INPUT_ID}/launch | Launch a Web Input
*WebInputsApi* | [**listWebInputs**](docs/WebInputsApi.md#listWebInputs) | **GET** /video/v1/web-inputs | List Web Inputs
*WebInputsApi* | [**reloadWebInput**](docs/WebInputsApi.md#reloadWebInput) | **PUT** /video/v1/web-inputs/{WEB_INPUT_ID}/reload | Reload a Web Input
*WebInputsApi* | [**shutdownWebInput**](docs/WebInputsApi.md#shutdownWebInput) | **PUT** /video/v1/web-inputs/{WEB_INPUT_ID}/shutdown | Shut down a Web Input
*WebInputsApi* | [**updateWebInputUrl**](docs/WebInputsApi.md#updateWebInputUrl) | **PUT** /video/v1/web-inputs/{WEB_INPUT_ID}/url | Update Web Input URL


## Documentation for Models

 - [AbridgedVideoView](docs/AbridgedVideoView.md)
 - [Asset](docs/Asset.md)
 - [AssetErrors](docs/AssetErrors.md)
 - [AssetGeneratedSubtitleSettings](docs/AssetGeneratedSubtitleSettings.md)
 - [AssetMaster](docs/AssetMaster.md)
 - [AssetMetadata](docs/AssetMetadata.md)
 - [AssetNonStandardInputReasons](docs/AssetNonStandardInputReasons.md)
 - [AssetRecordingTimes](docs/AssetRecordingTimes.md)
 - [AssetResponse](docs/AssetResponse.md)
 - [AssetStaticRenditions](docs/AssetStaticRenditions.md)
 - [BreakdownValue](docs/BreakdownValue.md)
 - [CreateAssetRequest](docs/CreateAssetRequest.md)
 - [CreateLiveStreamRequest](docs/CreateLiveStreamRequest.md)
 - [CreatePlaybackIDRequest](docs/CreatePlaybackIDRequest.md)
 - [CreatePlaybackIDResponse](docs/CreatePlaybackIDResponse.md)
 - [CreatePlaybackRestrictionRequest](docs/CreatePlaybackRestrictionRequest.md)
 - [CreateSimulcastTargetRequest](docs/CreateSimulcastTargetRequest.md)
 - [CreateStaticRenditionRequest](docs/CreateStaticRenditionRequest.md)
 - [CreateStaticRenditionResponse](docs/CreateStaticRenditionResponse.md)
 - [CreateTrackRequest](docs/CreateTrackRequest.md)
 - [CreateTrackResponse](docs/CreateTrackResponse.md)
 - [CreateTranscriptionVocabularyRequest](docs/CreateTranscriptionVocabularyRequest.md)
 - [CreateUploadRequest](docs/CreateUploadRequest.md)
 - [CreateWebInputRequest](docs/CreateWebInputRequest.md)
 - [DRMConfiguration](docs/DRMConfiguration.md)
 - [DRMConfigurationResponse](docs/DRMConfigurationResponse.md)
 - [DeliveryReport](docs/DeliveryReport.md)
 - [DeliveryReportDeliveredSecondsByResolution](docs/DeliveryReportDeliveredSecondsByResolution.md)
 - [DimensionValue](docs/DimensionValue.md)
 - [DisableLiveStreamResponse](docs/DisableLiveStreamResponse.md)
 - [EnableLiveStreamResponse](docs/EnableLiveStreamResponse.md)
 - [Error](docs/Error.md)
 - [ExportDate](docs/ExportDate.md)
 - [ExportFile](docs/ExportFile.md)
 - [FilterValue](docs/FilterValue.md)
 - [GenerateTrackSubtitlesRequest](docs/GenerateTrackSubtitlesRequest.md)
 - [GenerateTrackSubtitlesResponse](docs/GenerateTrackSubtitlesResponse.md)
 - [GetAssetInputInfoResponse](docs/GetAssetInputInfoResponse.md)
 - [GetAssetOrLiveStreamIdResponse](docs/GetAssetOrLiveStreamIdResponse.md)
 - [GetAssetOrLiveStreamIdResponseData](docs/GetAssetOrLiveStreamIdResponseData.md)
 - [GetAssetOrLiveStreamIdResponseDataObject](docs/GetAssetOrLiveStreamIdResponseDataObject.md)
 - [GetAssetPlaybackIDResponse](docs/GetAssetPlaybackIDResponse.md)
 - [GetLiveStreamPlaybackIDResponse](docs/GetLiveStreamPlaybackIDResponse.md)
 - [GetMetricTimeseriesDataResponse](docs/GetMetricTimeseriesDataResponse.md)
 - [GetMonitoringBreakdownResponse](docs/GetMonitoringBreakdownResponse.md)
 - [GetMonitoringBreakdownTimeseriesResponse](docs/GetMonitoringBreakdownTimeseriesResponse.md)
 - [GetMonitoringHistogramTimeseriesResponse](docs/GetMonitoringHistogramTimeseriesResponse.md)
 - [GetMonitoringHistogramTimeseriesResponseMeta](docs/GetMonitoringHistogramTimeseriesResponseMeta.md)
 - [GetMonitoringTimeseriesResponse](docs/GetMonitoringTimeseriesResponse.md)
 - [GetOverallValuesResponse](docs/GetOverallValuesResponse.md)
 - [GetRealTimeBreakdownResponse](docs/GetRealTimeBreakdownResponse.md)
 - [GetRealTimeHistogramTimeseriesResponse](docs/GetRealTimeHistogramTimeseriesResponse.md)
 - [GetRealTimeHistogramTimeseriesResponseMeta](docs/GetRealTimeHistogramTimeseriesResponseMeta.md)
 - [GetRealTimeTimeseriesResponse](docs/GetRealTimeTimeseriesResponse.md)
 - [Incident](docs/Incident.md)
 - [IncidentBreakdown](docs/IncidentBreakdown.md)
 - [IncidentNotification](docs/IncidentNotification.md)
 - [IncidentNotificationRule](docs/IncidentNotificationRule.md)
 - [IncidentResponse](docs/IncidentResponse.md)
 - [InputFile](docs/InputFile.md)
 - [InputInfo](docs/InputInfo.md)
 - [InputSettings](docs/InputSettings.md)
 - [InputSettingsOverlaySettings](docs/InputSettingsOverlaySettings.md)
 - [InputTrack](docs/InputTrack.md)
 - [Insight](docs/Insight.md)
 - [LaunchWebInputResponse](docs/LaunchWebInputResponse.md)
 - [ListAllMetricValuesResponse](docs/ListAllMetricValuesResponse.md)
 - [ListAssetsResponse](docs/ListAssetsResponse.md)
 - [ListBreakdownValuesResponse](docs/ListBreakdownValuesResponse.md)
 - [ListBreakdownValuesResponseMeta](docs/ListBreakdownValuesResponseMeta.md)
 - [ListDRMConfigurationsResponse](docs/ListDRMConfigurationsResponse.md)
 - [ListDeliveryUsageResponse](docs/ListDeliveryUsageResponse.md)
 - [ListDimensionValuesResponse](docs/ListDimensionValuesResponse.md)
 - [ListDimensionsResponse](docs/ListDimensionsResponse.md)
 - [ListErrorsResponse](docs/ListErrorsResponse.md)
 - [ListExportsResponse](docs/ListExportsResponse.md)
 - [ListFilterValuesResponse](docs/ListFilterValuesResponse.md)
 - [ListFiltersResponse](docs/ListFiltersResponse.md)
 - [ListFiltersResponseData](docs/ListFiltersResponseData.md)
 - [ListIncidentsResponse](docs/ListIncidentsResponse.md)
 - [ListInsightsResponse](docs/ListInsightsResponse.md)
 - [ListLiveStreamsResponse](docs/ListLiveStreamsResponse.md)
 - [ListMonitoringDimensionsResponse](docs/ListMonitoringDimensionsResponse.md)
 - [ListMonitoringDimensionsResponseData](docs/ListMonitoringDimensionsResponseData.md)
 - [ListMonitoringMetricsResponse](docs/ListMonitoringMetricsResponse.md)
 - [ListPlaybackRestrictionsResponse](docs/ListPlaybackRestrictionsResponse.md)
 - [ListRealTimeDimensionsResponse](docs/ListRealTimeDimensionsResponse.md)
 - [ListRealTimeMetricsResponse](docs/ListRealTimeMetricsResponse.md)
 - [ListRelatedIncidentsResponse](docs/ListRelatedIncidentsResponse.md)
 - [ListSigningKeysResponse](docs/ListSigningKeysResponse.md)
 - [ListTranscriptionVocabulariesResponse](docs/ListTranscriptionVocabulariesResponse.md)
 - [ListUploadsResponse](docs/ListUploadsResponse.md)
 - [ListVideoViewExportsResponse](docs/ListVideoViewExportsResponse.md)
 - [ListVideoViewsResponse](docs/ListVideoViewsResponse.md)
 - [ListWebInputsResponse](docs/ListWebInputsResponse.md)
 - [LiveStream](docs/LiveStream.md)
 - [LiveStreamEmbeddedSubtitleSettings](docs/LiveStreamEmbeddedSubtitleSettings.md)
 - [LiveStreamGeneratedSubtitleSettings](docs/LiveStreamGeneratedSubtitleSettings.md)
 - [LiveStreamResponse](docs/LiveStreamResponse.md)
 - [LiveStreamStatus](docs/LiveStreamStatus.md)
 - [Metric](docs/Metric.md)
 - [MonitoringBreakdownTimeseriesDatapoint](docs/MonitoringBreakdownTimeseriesDatapoint.md)
 - [MonitoringBreakdownTimeseriesValues](docs/MonitoringBreakdownTimeseriesValues.md)
 - [MonitoringBreakdownValue](docs/MonitoringBreakdownValue.md)
 - [MonitoringHistogramTimeseriesBucket](docs/MonitoringHistogramTimeseriesBucket.md)
 - [MonitoringHistogramTimeseriesBucketValues](docs/MonitoringHistogramTimeseriesBucketValues.md)
 - [MonitoringHistogramTimeseriesDatapoint](docs/MonitoringHistogramTimeseriesDatapoint.md)
 - [MonitoringTimeseriesDatapoint](docs/MonitoringTimeseriesDatapoint.md)
 - [NotificationRule](docs/NotificationRule.md)
 - [OverallValues](docs/OverallValues.md)
 - [PlaybackID](docs/PlaybackID.md)
 - [PlaybackPolicy](docs/PlaybackPolicy.md)
 - [PlaybackRestriction](docs/PlaybackRestriction.md)
 - [PlaybackRestrictionResponse](docs/PlaybackRestrictionResponse.md)
 - [RealTimeBreakdownValue](docs/RealTimeBreakdownValue.md)
 - [RealTimeHistogramTimeseriesBucket](docs/RealTimeHistogramTimeseriesBucket.md)
 - [RealTimeHistogramTimeseriesBucketValues](docs/RealTimeHistogramTimeseriesBucketValues.md)
 - [RealTimeHistogramTimeseriesDatapoint](docs/RealTimeHistogramTimeseriesDatapoint.md)
 - [RealTimeTimeseriesDatapoint](docs/RealTimeTimeseriesDatapoint.md)
 - [ReferrerDomainRestriction](docs/ReferrerDomainRestriction.md)
 - [ReloadWebInputResponse](docs/ReloadWebInputResponse.md)
 - [Score](docs/Score.md)
 - [ShutdownWebInputResponse](docs/ShutdownWebInputResponse.md)
 - [SignalLiveStreamCompleteResponse](docs/SignalLiveStreamCompleteResponse.md)
 - [SigningKey](docs/SigningKey.md)
 - [SigningKeyResponse](docs/SigningKeyResponse.md)
 - [SimulcastTarget](docs/SimulcastTarget.md)
 - [SimulcastTargetResponse](docs/SimulcastTargetResponse.md)
 - [StaticRendition](docs/StaticRendition.md)
 - [Track](docs/Track.md)
 - [TranscriptionVocabulary](docs/TranscriptionVocabulary.md)
 - [TranscriptionVocabularyResponse](docs/TranscriptionVocabularyResponse.md)
 - [UpdateAssetMP4SupportRequest](docs/UpdateAssetMP4SupportRequest.md)
 - [UpdateAssetMasterAccessRequest](docs/UpdateAssetMasterAccessRequest.md)
 - [UpdateAssetRequest](docs/UpdateAssetRequest.md)
 - [UpdateLiveStreamEmbeddedSubtitlesRequest](docs/UpdateLiveStreamEmbeddedSubtitlesRequest.md)
 - [UpdateLiveStreamGeneratedSubtitlesRequest](docs/UpdateLiveStreamGeneratedSubtitlesRequest.md)
 - [UpdateLiveStreamNewAssetSettings](docs/UpdateLiveStreamNewAssetSettings.md)
 - [UpdateLiveStreamNewAssetSettingsStaticRenditionsRequest](docs/UpdateLiveStreamNewAssetSettingsStaticRenditionsRequest.md)
 - [UpdateLiveStreamRequest](docs/UpdateLiveStreamRequest.md)
 - [UpdateReferrerDomainRestrictionRequest](docs/UpdateReferrerDomainRestrictionRequest.md)
 - [UpdateTranscriptionVocabularyRequest](docs/UpdateTranscriptionVocabularyRequest.md)
 - [UpdateUserAgentRestrictionRequest](docs/UpdateUserAgentRestrictionRequest.md)
 - [UpdateWebInputUrlRequest](docs/UpdateWebInputUrlRequest.md)
 - [Upload](docs/Upload.md)
 - [UploadError](docs/UploadError.md)
 - [UploadResponse](docs/UploadResponse.md)
 - [UserAgentRestrictionRequest](docs/UserAgentRestrictionRequest.md)
 - [UserAgentRestrictionSettings](docs/UserAgentRestrictionSettings.md)
 - [VideoView](docs/VideoView.md)
 - [VideoViewEvent](docs/VideoViewEvent.md)
 - [VideoViewResponse](docs/VideoViewResponse.md)
 - [WebInput](docs/WebInput.md)
 - [WebInputResponse](docs/WebInputResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### accessToken

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

devex@mux.com

