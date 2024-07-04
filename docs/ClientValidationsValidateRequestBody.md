

# ClientValidationsValidateRequestBody

Response body schema for **POST** `/validations`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redeemables** | [**List&lt;StackableValidateRedeemBaseRedeemablesItem&gt;**](StackableValidateRedeemBaseRedeemablesItem.md) |  |  |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**session** | [**Session**](Session.md) |  |  [optional] |
|**trackingId** | **String** | Is correspondent to Customer&#39;s source_id |  [optional] |
|**metadata** | **Object** | A set of key/value pairs that you can attach to a redemption object. It can be useful for storing additional information about the redemption in a structured format. |  [optional] |
|**options** | [**ClientValidationsValidateRequestBodyAllOfOptions**](ClientValidationsValidateRequestBodyAllOfOptions.md) |  |  [optional] |



