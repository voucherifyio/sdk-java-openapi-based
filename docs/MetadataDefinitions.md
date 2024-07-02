

# MetadataDefinitions

Custom definition name. This is also shown in **Project Settings** > **Metadata Schema** in the Voucherify Dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of metadata. Note that &#x60;\&quot;geopoint\&quot;&#x60; type is a paid feature. |  |
|**optional** | **Boolean** | Indicates if this definition is optional or not for the resource. |  |
|**array** | **List&lt;Boolean&gt;** | Indicates if the definition is an array. |  |
|**deleted** | **Boolean** | Indicates if the definition has been deleted from the schema. |  [optional] |
|**objectType** | **String** | The name of the custom resource (i.e. a nested object) if the resource has been previously defined. Otherwise, it is &#x60;null&#x60; for other types. |  [optional] |
|**minLength** | **Integer** | Value indicating the minimum length. Available only for the &#x60;string&#x60; type. |  [optional] |
|**maxLength** | **Integer** | Value indicating the maximum length. Available only for the &#x60;string&#x60; type. |  [optional] |
|**exactLength** | **Integer** | Value indicating the exact length. Available only for the &#x60;string&#x60; type. |  [optional] |
|**eq** | [**List&lt;MetadataDefinitionsEqInner&gt;**](MetadataDefinitionsEqInner.md) | Array of values that are allowed. Available only for the &#x60;string&#x60; and &#x60;number&#x60; types. |  [optional] |
|**ne** | **List&lt;BigDecimal&gt;** | Array of values that are not allowed. Available only for the &#x60;number&#x60; type. |  [optional] |
|**lt** | **BigDecimal** | A property of the &#x60;number&#x60; type must have &#x60;less than&#x60; this value. The value should be up to two decimal places. |  [optional] |
|**lte** | **BigDecimal** | A property of the &#x60;number&#x60; type must be &#x60;less than or equal&#x60; to this value. The value should be up to two decimal places. |  [optional] |
|**gt** | **BigDecimal** | A property of &#x60;number&#x60; type must be &#x60;greater than&#x60; this value. The value should be up to two decimal places. |  [optional] |
|**gte** | **BigDecimal** | A property of &#x60;number&#x60; type must be &#x60;greater than or equal&#x60; to this value. The value should be up to two decimal places. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| NUMBER | &quot;number&quot; |
| OBJECT | &quot;object&quot; |
| DATE | &quot;date&quot; |
| DATETIME | &quot;datetime&quot; |
| GEOPOINT | &quot;geopoint&quot; |
| BOOLEAN | &quot;boolean&quot; |
| IMAGE_URL | &quot;image_url&quot; |



