

# ReferralProgram

Defines the referee reward and the way a referral is triggered. Context: `REFERRAL_PROGRAM`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversionEventType** | [**ConversionEventTypeEnum**](#ConversionEventTypeEnum) | Define how a referral is triggered. |  [optional] |
|**customEvent** | [**ReferralProgramCustomEvent**](ReferralProgramCustomEvent.md) |  |  [optional] |
|**refereeReward** | [**ReferralProgramRefereeReward**](ReferralProgramRefereeReward.md) |  |  [optional] |



## Enum: ConversionEventTypeEnum

| Name | Value |
|---- | -----|
| REDEMPTION | &quot;redemption&quot; |
| CUSTOM_EVENT | &quot;custom_event&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



