

# RedemptionsRollbacksCreateResponseBody

Response body schema for POST `/redemptions/{parentRedemptionID}/rollbacks`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rollbacks** | [**List&lt;RedemptionRollback&gt;**](RedemptionRollback.md) | Contains the rollback redemption objects of the particular incentives. |  [optional] |
|**parentRollback** | [**RedemptionRollback**](RedemptionRollback.md) |  |  [optional] |
|**order** | [**OrderCalculatedNoCustomerData**](OrderCalculatedNoCustomerData.md) |  |  [optional] |



