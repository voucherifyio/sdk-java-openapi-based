

# ManagementProjectListResponseBody

Object containing a list of projects.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The type of the object represented by JSON. This object stores information about the projects in a dictionary. |  |
|**dataRef** | [**DataRefEnum**](#DataRefEnum) | Identifies the name of the attribute that contains the array of project objects. |  |
|**data** | [**List&lt;ManagementProjectsResponseBody&gt;**](ManagementProjectsResponseBody.md) | Array of project objects. |  |
|**total** | **Integer** | The total number of projects. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



## Enum: DataRefEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |



