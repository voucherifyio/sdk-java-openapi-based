

# QualificationsStackingRules

Defines stacking rules for redeemables. Read more in the [Help Center](https://support.voucherify.io/article/604-stacking-rules)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redeemablesLimit** | **Integer** | Defines how many redeemables can be sent in one stacking request (note: more redeemables means more processing time!). |  |
|**applicableRedeemablesLimit** | **Integer** | Defines how many of the sent redeemables will be applied to the order. For example, a user can select 30 discounts but only 5 will be applied to the order and the remaining will be labelled as SKIPPED. |  |
|**applicableExclusiveRedeemablesLimit** | **Integer** | Defines how many redeemables with an exclusive category can be applied in one request. |  |
|**exclusiveCategories** | **List&lt;String&gt;** | Lists all exclusive categories. A redeemable from a campaign with an exclusive category is the only redeemable to be redeemed when applied with redeemables from other campaigns unless these campaigns are exclusive or joint. |  |
|**jointCategories** | **List&lt;String&gt;** | Lists all joint categories. A campaign with a joint category is always applied regardless of the exclusivity of other campaigns. |  |



