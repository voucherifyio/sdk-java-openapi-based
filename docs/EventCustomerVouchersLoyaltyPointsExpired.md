

# EventCustomerVouchersLoyaltyPointsExpired

Event data object schema for `customer.voucher.loyalty_card.points_expired`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customer** | [**SimpleCustomer**](SimpleCustomer.md) |  |  [optional] |
|**campaign** | [**SimpleCampaign**](SimpleCampaign.md) |  |  [optional] |
|**voucher** | [**SimpleVoucher**](SimpleVoucher.md) |  |  [optional] |
|**points** | **Integer** |  |  [optional] |
|**buckets** | [**List&lt;VoucherTransaction&gt;**](VoucherTransaction.md) |  |  [optional] |
|**transaction** | [**VoucherTransaction**](VoucherTransaction.md) |  |  [optional] |



