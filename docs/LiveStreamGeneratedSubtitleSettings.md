

# LiveStreamGeneratedSubtitleSettings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A name for this live stream subtitle track. |  [optional]
**passthrough** | **String** | Arbitrary metadata set for the live stream subtitle track. Max 255 characters. |  [optional]
**languageCode** | [**LanguageCodeEnum**](#LanguageCodeEnum) | The language to generate subtitles in. |  [optional]
**transcriptionVocabularyIds** | **java.util.List&lt;String&gt;** | Unique identifiers for existing Transcription Vocabularies to use while generating subtitles for the live stream. If the Transcription Vocabularies provided collectively have more than 1000 phrases, only the first 1000 phrases will be included. |  [optional]



## Enum: LanguageCodeEnum

Name | Value
---- | -----
EN | &quot;en&quot;
EN_US | &quot;en-US&quot;



