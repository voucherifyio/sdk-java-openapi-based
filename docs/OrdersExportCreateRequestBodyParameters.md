

# OrdersExportCreateRequestBodyParameters

List of available fields and filters that can be exported with an order along with the sorting order of the returned data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**order** | **ExportOrderOrder** |  |  [optional] |
|**fields** | **List&lt;ExportOrderFields&gt;** | Array of strings containing the data in the export. These fields define the headers in the CSV file. |  [optional] |
|**filters** | **Object** | Allowed additional properties must start with \&quot;metadata.\&quot; |  [optional] |



