 ```
# updateReferenceData

The `updateReferenceData` method in `LReferenceDataController` updates a reference data.

## Request Parameters

| Name | Type | Description |
|---|---|---|
| referenceData | `LReferenceData` | The reference data to update. |

## Response

| Status Code | Description |
|---|---|
| 200 | OK | The reference data was updated successfully. |

## Implementation Details

The following code sample shows you how to use the `updateReferenceData` method:
```java
import com.example.bankaccountmicroservice.model.LReferenceData;
import com.example.bankaccountmicroservice.service.ReferenceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reference-data")
public class ReferenceDataController {

    @Autowired
    private ReferenceDataService referenceDataService;

    @PutMapping("/{id}")
    public ResponseEntity<LReferenceData> updateReferenceData(@RequestBody LReferenceData referenceData) {
        LReferenceData updatedReferenceData = referenceDataService.updateReferenceData(referenceData);
        return new ResponseEntity<>(updatedReferenceData, HttpStatus.OK);
    }
}
```