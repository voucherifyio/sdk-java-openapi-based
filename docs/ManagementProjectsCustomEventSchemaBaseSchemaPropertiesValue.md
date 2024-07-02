

# ManagementProjectsCustomEventSchemaBaseSchemaPropertiesValue

Custom event metadata name.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of the custom event. |  |
|**optional** | **Boolean** | Indicates if this property is optional or not for the resource. |  |
|**deleted** | **Boolean** | Indicates if the property has been deleted from the schema. A deleted schema is inactive, but it can be restored. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| NUMBER | &quot;number&quot; |
| DATE | &quot;date&quot; |
| DATETIME | &quot;datetime&quot; |
| BOOLEAN | &quot;boolean&quot; |



