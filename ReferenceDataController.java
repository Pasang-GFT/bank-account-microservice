import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/referenceData")
public class ReferenceDataController {

    private final ReferenceDataService referenceDataService;

    public ReferenceDataController(ReferenceDataService referenceDataService) {
        this.referenceDataService = referenceDataService;
    }

    @GetMapping
    public ResponseEntity<List<ReferenceData>> getAllReferenceData() {
        List<ReferenceData> referenceData = referenceDataService.getAllReferenceData();
        return new ResponseEntity<>(referenceData, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ReferenceData> updateReferenceData(@RequestBody ReferenceData referenceData) {
        ReferenceData updatedReferenceData = referenceDataService.updateReferenceData(referenceData);
        return new ResponseEntity<>(updatedReferenceData, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ReferenceData> createReferenceData(@RequestBody ReferenceData referenceData) {
        ReferenceData createdReferenceData = referenceDataService.createReferenceData(referenceData);
        return new ResponseEntity<>(createdReferenceData, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReferenceData(@PathVariable String id) {
        referenceDataService.deleteReferenceData(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/vulnerable")
    public List<ReferenceData> getReferenceDataByVulnerableMethod(@RequestParam String id) {
        // WARNING: This is a simulated SQL Injection vulnerability for demonstration purposes only.
        // Never use raw user input in SQL queries in a real application.
        return jdbcTemplate.query("SELECT * FROM reference_data WHERE id = " + id, new ReferenceDataRowMapper());
    }
}