

# CustomerActivityData

Event data object schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  |
|**unconfirmedCustomer** | [**EventCustomerConfirmedUnconfirmedCustomer**](EventCustomerConfirmedUnconfirmedCustomer.md) |  |  [optional] |
|**referrer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  |
|**campaign** | [**SimpleCampaign**](SimpleCampaign.md) |  |  |
|**voucher** | [**SimpleVoucher**](SimpleVoucher.md) |  |  |
|**customEvent** | [**CustomEvent**](CustomEvent.md) |  |  |
|**redemption** | [**RedemptionInternal**](RedemptionInternal.md) |  |  [optional] |
|**segment** | [**SimpleSegment**](SimpleSegment.md) |  |  |
|**distribution** | **Object** |  |  [optional] |
|**sentAt** | **OffsetDateTime** | Timestamp representing the date and time when the distribution was sent in ISO 8601 format. |  |
|**recoveredAt** | **OffsetDateTime** | Timestamp representing the date and time when the distribution was recovered in ISO 8601 format. |  |
|**failedAt** | **OffsetDateTime** | Timestamp representing the date and time when the distribution failed in ISO 8601 format. |  |
|**holder** | [**SimpleCustomer**](SimpleCustomer.md) |  |  [optional] |
|**reward** | [**SimpleRedemptionRewardResult**](SimpleRedemptionRewardResult.md) |  |  [optional] |
|**referralTier** | [**SimpleReferralTier**](SimpleReferralTier.md) |  |  [optional] |
|**balance** | **Integer** |  |  [optional] |
|**customerEvent** | **Object** |  |  [optional] |
|**loyaltyTier** | [**LoyaltyTier**](LoyaltyTier.md) |  |  |
|**earningRule** | [**EarningRule**](EarningRule.md) |  |  [optional] |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**event** | **Object** |  |  [optional] |
|**transaction** | [**VoucherTransaction**](VoucherTransaction.md) |  |  [optional] |
|**sourceVoucher** | [**SimpleVoucher**](SimpleVoucher.md) |  |  [optional] |
|**destinationVoucher** | [**SimpleVoucher**](SimpleVoucher.md) |  |  [optional] |
|**points** | **Integer** |  |  [optional] |
|**buckets** | [**List&lt;VoucherTransaction&gt;**](VoucherTransaction.md) |  |  [optional] |
|**publication** | **Object** |  |  [optional] |
|**validation** | [**ValidationEntity**](ValidationEntity.md) |  |  [optional] |
|**promotionTier** | [**SimplePromotionTier**](SimplePromotionTier.md) |  |  [optional] |
|**redemptionRollback** | [**SimpleRedemption**](SimpleRedemption.md) |  |  [optional] |
|**consents** | [**List&lt;SimpleConsent&gt;**](SimpleConsent.md) |  |  [optional] |
|**rewardRedemption** | **Object** |  |  [optional] |
|**rewardAssignment** | [**RewardAssignment**](RewardAssignment.md) |  |  [optional] |
|**source** | **String** |  |  [optional] |
|**loyalty** | **Object** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**loyaltyTierFrom** | [**LoyaltyTier**](LoyaltyTier.md) |  |  |
|**loyaltyTierTo** | [**LoyaltyTier**](LoyaltyTier.md) |  |  |
|**expirationDate** | **OffsetDateTime** |  |  |



