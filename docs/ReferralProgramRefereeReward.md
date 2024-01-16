

# ReferralProgramRefereeReward

Defines the referee reward.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**relatedObjectParent** | [**ReferralProgramRefereeRewardRelatedObjectParent**](ReferralProgramRefereeRewardRelatedObjectParent.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of reward. |  [optional] |
|**amount** | **String** | Define the number of &#x60;points&#x60; to add to a loyalty card or &#x60;credits&#x60; to the balance on a gift card. In case of the gift card, the value is multiplied by 100 to precisely represent 2 decimal places. For example, $100 amount is written as 10000. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| LUCKY_DRAW_CODE | &quot;LUCKY_DRAW_CODE&quot; |



