 ```markdown
## `deleteReferenceData(String referenceDataId)`

### Description
The `deleteReferenceData` method in `ReferenceDataController` deletes a reference data by its ID.

### Parameters
The `deleteReferenceData` method accepts the following parameters:

* `referenceDataId`: The ID of the reference data to be deleted.

### Return Value
The `deleteReferenceData` method returns a `ResponseEntity` object that contains the HTTP status code and the response body. The response body is a `String` object that contains a message indicating whether the reference data was deleted successfully.

### Exceptions
The `deleteReferenceData` method throws the following exceptions:

* `ResourceNotFoundException`: If the reference data with the specified ID does not exist.

### Example
The following code sample shows you how to use the `deleteReferenceData` method:
```java
import com.example.demo.controller.ReferenceDataController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReferenceDataController {

    @Autowired
    private ReferenceDataService referenceDataService;

    @DeleteMapping("/reference-data/{referenceDataId}")
    public ResponseEntity<String> deleteReferenceData(@PathVariable String referenceDataId) {
        referenceDataService.deleteReferenceData(referenceDataId);
        return ResponseEntity.ok("Reference data deleted successfully.");
    }
}
```