

# CampaignsVouchersCreateCombinedResponseBodyRedemption

Stores a summary of redemptions that have been applied to the voucher.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quantity** | **Integer** | How many times a voucher can be redeemed. A &#x60;null&#x60; value means unlimited. |  [optional] |
|**redeemedQuantity** | **Integer** | How many times a voucher has already been redeemed. |  [optional] |
|**redeemedPoints** | **Integer** | Total loyalty points redeemed. |  [optional] |
|**_object** | **String** | The type of the object represented is by default &#x60;list&#x60;. To get this list, you need to make a call to the endpoint returned in the url attribute. |  [optional] |
|**url** | **String** | The endpoint where this list of redemptions can be accessed using a GET method. &#x60;/v1/vouchers/{voucher_code}/redemptions&#x60; |  [optional] |


