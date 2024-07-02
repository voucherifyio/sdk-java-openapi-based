

# ParameterFiltersListCustomerRedeemablesVoucherTypeConditions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$in** | [**List&lt;InEnum&gt;**](#List&lt;InEnum&gt;) | Array of resource values that should be included in the results (multiple values). |  [optional] |
|**$notIn** | [**List&lt;NotInEnum&gt;**](#List&lt;NotInEnum&gt;) | Array of resource values that should be included in the results (multiple values). |  [optional] |
|**$is** | [**IsEnum**](#IsEnum) | Value is exactly this value (single value). |  [optional] |
|**$isNot** | [**IsNotEnum**](#IsNotEnum) | Results omit this value (single value). |  [optional] |
|**$hasValue** | **String** | Value is NOT null. The value for this parameter is an empty string. |  [optional] |
|**$isUnknown** | **String** | Value is null. The value for this parameter is an empty string. |  [optional] |
|**$startsWith** | **String** | Value starts with the specified string. |  [optional] |
|**$endsWith** | **String** | Value ends with the specified string. |  [optional] |



## Enum: List&lt;InEnum&gt;

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



## Enum: List&lt;NotInEnum&gt;

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



## Enum: IsEnum

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



## Enum: IsNotEnum

| Name | Value |
|---- | -----|
| GIFT_VOUCHER | &quot;GIFT_VOUCHER&quot; |
| DISCOUNT_VOUCHER | &quot;DISCOUNT_VOUCHER&quot; |
| LOYALTY_CARD | &quot;LOYALTY_CARD&quot; |



