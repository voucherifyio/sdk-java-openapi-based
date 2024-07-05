

# LoyaltiesMembersTransfersCreateResponseBodyRedemption

Stores a summary of redemptions that have been applied to the voucher.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quantity** | **Integer** | How many times a voucher can be redeemed. A null value means unlimited. |  [optional] |
|**redeemedPoints** | **Integer** | Total loyalty points redeemed. |  [optional] |
|**redeemedQuantity** | **Integer** | How many times a voucher has already been redeemed. |  [optional] |
|**redemptionEntries** | **List&lt;String&gt;** |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented is by default list. To get this list, you need to make a call to the endpoint returned in the url attribute. |  [optional] |
|**url** | **String** | The endpoint where this list of redemptions can be accessed using a GET method. /v1/vouchers/{voucher_code}/redemptions |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |
| UNKNOWN_ENUM | &quot;unknown_enum&quot; |



