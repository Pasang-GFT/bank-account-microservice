 ```markdown
# ReferenceDataController#instance-init

The `#instance-init` method in `reference_data_controller.rb` is an initializer for the ReferenceDataController class.
It sets the `@reference_data_service` instance variable to the value of the `reference_data_service` parameter.

## Parameters

| Name | Type | Description |
|---|---|---|
| `reference_data_service` | <span class='object_link'><a href="ReferenceDataService" title="ReferenceDataService (class)">ReferenceDataService</a></span> | The reference data service to use. |

## Returns

| Type | Description |
|---|---|
| <span class='object_link'><a href="ReferenceDataController" title="ReferenceDataController (class)">ReferenceDataController</a></span> | The initialized ReferenceDataController object. |

## Example

```ruby
require "reference_data_controller"

reference_data_service = ReferenceDataService.new
reference_data_controller = ReferenceDataController.new(reference_data_service)
```

## See Also

* <span class='object_link'><a href="ReferenceDataController" title="ReferenceDataController (class)">ReferenceDataController</a></span>
* <span class='object_link'><a href="ReferenceDataService" title="ReferenceDataService (class)">ReferenceDataService</a></span>
```