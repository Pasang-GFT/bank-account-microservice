 ```markdown
## ReferenceDataController#createReferenceData(LReferenceData;)LResponseEntity;

### Description
The `createReferenceData` method in `ReferenceDataController` creates a new reference data.

### Parameters
| Parameter | Type | Description |
|---|---|---|
| referenceData | `LReferenceData;` | The reference data to be created. |

### Return Value
Returns a `LResponseEntity` object.

### Exceptions
| Exception | Description |
|---|---|
| `BadRequestException` | Thrown when the request is invalid. |
| `InternalServerErrorException` | Thrown when an internal server error occurs. |

### Example
The following code sample shows you how to use the `createReferenceData` method:
```java
import com.example.referenceData.model.LReferenceData;
import com.example.referenceData.controller.ReferenceDataController;

public class ReferenceDataControllerExample {

    public static void main(String[] args) {
        // Create a new reference data
        LReferenceData referenceData = new LReferenceData();
        referenceData.setName("My reference data");
        referenceData.setValue("My reference data value");

        // Create a new reference data controller
        ReferenceDataController controller = new ReferenceDataController();

        // Create the reference data
        LResponseEntity response = controller.createReferenceData(referenceData);

        // Check the response status
        if (response.getStatusCode() == HttpStatus.CREATED) {
            // The reference data was created successfully
            System.out.println("Reference data created successfully");
        } else {
            // An error occurred
            System.out.println("Error creating reference data");
        }
    }
}
```