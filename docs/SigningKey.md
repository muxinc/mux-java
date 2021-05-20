

# SigningKey

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for the Signing Key. |  [optional]
**createdAt** | **String** | Time at which the object was created. Measured in seconds since the Unix epoch. |  [optional]
**privateKey** | **byte[]** | A Base64 encoded private key that can be used with the RS256 algorithm when creating a [JWT](https://jwt.io/). **Note that this value is only returned once when creating a URL signing key.** |  [optional]



