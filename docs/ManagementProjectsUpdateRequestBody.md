

# ManagementProjectsUpdateRequestBody

Request body schema for **PUT** `/management/v1/projects/{projectId}`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the project. |  [optional] |
|**description** | **String** | A user-defined description of the project, e.g. its purpose, scope, region. |  [optional] |
|**timezone** | **String** | The time zone in which the project is established. It can be in the GMT format or in accordance with IANA time zone database. |  [optional] |
|**currency** | **String** | The currency used in the project. It is equal to a 3-letter ISO 4217 code. |  [optional] |
|**dialCode** | **String** | The country dial code for the project. It is equal to an ITU country code. |  [optional] |
|**webhookVersion** | [**WebhookVersionEnum**](#WebhookVersionEnum) | The webhook version used in the project. |  [optional] |
|**clientTrustedDomains** | **List&lt;String&gt;** | An array of URL addresses that allow client requests. |  [optional] |
|**clientRedeemEnabled** | **Boolean** | Enables client-side redemption. |  [optional] |
|**clientPublishEnabled** | **Boolean** | Enables client-side publication. |  [optional] |
|**clientListVouchersEnabled** | **Boolean** | Enables client-side listing of vouchers. |  [optional] |
|**clientCreateCustomerEnabled** | **Boolean** | Enables client-side creation of customers. |  [optional] |
|**clientLoyaltyEventsEnabled** | **Boolean** | Enables client-side events for loyalty and referral programs. |  [optional] |
|**clientSetVoucherExpirationDateEnabled** | **Boolean** | Enables client-side setting of voucher expiration date. |  [optional] |
|**apiUsageNotifications** | [**APIUsageNotifications**](APIUsageNotifications.md) |  |  [optional] |
|**webhooksCalloutNotifications** | [**WebhookCalloutNotificationDetails**](WebhookCalloutNotificationDetails.md) |  |  [optional] |
|**defaultCodeConfig** | [**DefaultCodeConfiguration**](DefaultCodeConfiguration.md) |  |  [optional] |



## Enum: WebhookVersionEnum

| Name | Value |
|---- | -----|
| V2024_01_01 | &quot;v2024-01-01&quot; |



