

# VoucherTransactionDetailsBalance

Contains information on how the balance was affected by the transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of voucher whose balance is being adjusted due to the transaction. |  |
|**total** | **Integer** | The available points prior to the transaction. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of object represented by the JSON. |  |
|**points** | **Integer** | The amount of points being used up in the transaction. |  |
|**balance** | **Integer** | The points balance on the loyalty card after the points in the transaction are subtracted from the loyalty card. |  |
|**relatedObject** | [**VoucherTransactionDetailsBalanceRelatedObject**](VoucherTransactionDetailsBalanceRelatedObject.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LOYALTY_CARD | &quot;loyalty_card&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |



