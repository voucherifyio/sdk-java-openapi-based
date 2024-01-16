

# CustomerActivity

This is an object representing customer activity.    This is a general object which presents moments from customers' activity. There are all types of different events that customers perform during their journey once they participate in Promotions. Events describe moments when customers redeem coupons and earn points or rewards. The list of all types of activities is listed below.  The details describing the activity are collected in a property named `data`. In this object, software integrators will find all further information explaining the event context.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique event ID, assigned by Voucherify. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Event type. |  [optional] |
|**data** | [**List&lt;CustomerActivityData&gt;**](CustomerActivityData.md) | Contains details about the event. The objects that are returned in the data attribute differ based on the context of the event type. |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp representing the date and time when the customer activity occurred in ISO 8601 format. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CONFIRMED | &quot;customer.confirmed&quot; |
| CREATED | &quot;customer.created&quot; |
| UPDATED | &quot;customer.updated&quot; |
| DELETED | &quot;customer.deleted&quot; |
| REFERRED | &quot;customer.referred&quot; |
| CUSTOM_EVENT | &quot;customer.custom_event&quot; |
| SEGMENT_ENTERED | &quot;customer.segment.entered&quot; |
| SEGMENT_LEFT | &quot;customer.segment.left&quot; |
| SMS_SENT | &quot;customer.sms.sent&quot; |
| SMS_RECOVERED | &quot;customer.sms.recovered&quot; |
| SMS_FAILED | &quot;customer.sms.failed&quot; |
| EMAIL_SENT | &quot;customer.email.sent&quot; |
| EMAIL_RECOVERED | &quot;customer.email.recovered&quot; |
| EMAIL_FAILED | &quot;customer.email.failed&quot; |
| ACTIVECAMPAIGN_SENT | &quot;customer.activecampaign.sent&quot; |
| ACTIVECAMPAIGN_RECOVERED | &quot;customer.activecampaign.recovered&quot; |
| ACTIVECAMPAIGN_FAILED | &quot;customer.activecampaign.failed&quot; |
| BRAZE_SENT | &quot;customer.braze.sent&quot; |
| BRAZE_RECOVERED | &quot;customer.braze.recovered&quot; |
| BRAZE_FAILED | &quot;customer.braze.failed&quot; |
| MAILCHIMP_SENT | &quot;customer.mailchimp.sent&quot; |
| MAILCHIMP_RECOVERED | &quot;customer.mailchimp.recovered&quot; |
| MAILCHIMP_FAILED | &quot;customer.mailchimp.failed&quot; |
| INTERCOM_SENT | &quot;customer.intercom.sent&quot; |
| INTERCOM_RECOVERED | &quot;customer.intercom.recovered&quot; |
| INTERCOM_FAILED | &quot;customer.intercom.failed&quot; |
| SHOPIFY_SENT | &quot;customer.shopify.sent&quot; |
| SHOPIFY_RECOVERED | &quot;customer.shopify.recovered&quot; |
| SHOPIFY_FAILED | &quot;customer.shopify.failed&quot; |
| KLAVIYO_SENT | &quot;customer.klaviyo.sent&quot; |
| KLAVIYO_RECOVERED | &quot;customer.klaviyo.recovered&quot; |
| KLAVIYO_FAILED | &quot;customer.klaviyo.failed&quot; |
| BATCH_SENT | &quot;customer.batch.sent&quot; |
| BATCH_RECOVERED | &quot;customer.batch.recovered&quot; |
| BATCH_FAILED | &quot;customer.batch.failed&quot; |
| REWARDED | &quot;customer.rewarded&quot; |
| REWARDED_LOYALTY_POINTS | &quot;customer.rewarded.loyalty_points&quot; |
| VOUCHER_GIFT_BALANCE_ADDED | &quot;customer.voucher.gift.balance_added&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_ADDED | &quot;customer.voucher.loyalty_card.points_added&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_TRANSFERRED | &quot;customer.voucher.loyalty_card.points_transferred&quot; |
| VOUCHER_LOYALTY_CARD_POINTS_EXPIRED | &quot;customer.voucher.loyalty_card.points_expired&quot; |
| VOUCHER_DELETED | &quot;customer.voucher.deleted&quot; |
| PUBLICATION_SUCCEEDED | &quot;customer.publication.succeeded&quot; |
| PUBLICATION_FAILED | &quot;customer.publication.failed&quot; |
| VALIDATION_SUCCEEDED | &quot;customer.validation.succeeded&quot; |
| VALIDATION_FAILED | &quot;customer.validation.failed&quot; |
| REDEMPTION_FAILED | &quot;customer.redemption.failed&quot; |
| REDEMPTION_SUCCEEDED | &quot;customer.redemption.succeeded&quot; |
| REDEMPTION_ROLLBACK_FAILED | &quot;customer.redemption.rollback.failed&quot; |
| REDEMPTION_ROLLBACK_SUCCEEDED | &quot;customer.redemption.rollback.succeeded&quot; |
| CONSENTS_GIVEN | &quot;customer.consents.given&quot; |
| CONSENTS_REVOKED | &quot;customer.consents.revoked&quot; |
| ORDER_CANCELED | &quot;customer.order.canceled&quot; |
| ORDER_CREATED | &quot;customer.order.created&quot; |
| ORDER_FULFILLED | &quot;customer.order.fulfilled&quot; |
| ORDER_PAID | &quot;customer.order.paid&quot; |
| ORDER_PROCESSING | &quot;customer.order.processing&quot; |
| ORDER_UPDATED | &quot;customer.order.updated&quot; |
| REWARD_REDEMPTIONS_CREATED | &quot;customer.reward_redemptions.created&quot; |
| REWARD_REDEMPTIONS_PENDING | &quot;customer.reward_redemptions.pending&quot; |
| REWARD_REDEMPTIONS_COMPLETED | &quot;customer.reward_redemptions.completed&quot; |
| REWARD_REDEMPTIONS_ROLLEDBACK | &quot;customer.reward_redemptions.rolledback&quot; |
| LOYALTY_UPDATED | &quot;customer.loyalty.updated&quot; |
| LOYALTY_TIER_UPGRADED | &quot;customer.loyalty.tier.upgraded&quot; |
| LOYALTY_TIER_DOWNGRADED | &quot;customer.loyalty.tier.downgraded&quot; |
| LOYALTY_TIER_PROLONGED | &quot;customer.loyalty.tier.prolonged&quot; |
| LOYALTY_TIER_EXPIRATION_CHANGED | &quot;customer.loyalty.tier.expiration.changed&quot; |
| LOYALTY_TIER_JOINED | &quot;customer.loyalty.tier.joined&quot; |
| LOYALTY_TIER_LEFT | &quot;customer.loyalty.tier.left&quot; |



