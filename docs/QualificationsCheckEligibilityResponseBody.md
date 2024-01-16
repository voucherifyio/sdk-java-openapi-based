

# QualificationsCheckEligibilityResponseBody

Response body schema for **POST** `/qualifications`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redeemables** | [**QualificationsRedeemables**](QualificationsRedeemables.md) |  |  [optional] |
|**trackingId** | **String** | This identifier is generated during voucher qualification based on your internal id (e.g., email, database ID). This is a hashed customer source ID. |  [optional] |
|**order** | [**OrderCalculated**](OrderCalculated.md) |  |  [optional] |
|**stackingRules** | [**QualificationsStackingRules**](QualificationsStackingRules.md) |  |  [optional] |



