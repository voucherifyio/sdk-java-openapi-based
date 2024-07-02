

# RedemptionsRedeemResponseBody

Response body schema for **POST** `/redemptions`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redemptions** | [**List&lt;Redemption&gt;**](Redemption.md) |  |  [optional] |
|**parentRedemption** | [**Redemption**](Redemption.md) |  |  [optional] |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**inapplicableRedeemables** | [**List&lt;ValidationsRedeemableInapplicable&gt;**](ValidationsRedeemableInapplicable.md) | Lists validation results of each inapplicable redeemable. |  [optional] |
|**skippedRedeemables** | [**List&lt;ValidationsRedeemableSkipped&gt;**](ValidationsRedeemableSkipped.md) | Lists validation results of each redeemable. If a redeemable can be applied, the API returns &#x60;\&quot;status\&quot;: \&quot;APPLICABLE\&quot;&#x60;. |  [optional] |



