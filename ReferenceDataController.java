package com.example.reference;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@RestController
@RequestMapping("/referenceData")
public class ReferenceDataController {

    private final ReferenceDataService referenceDataService;
    private final JdbcTemplate jdbcTemplate;

    public ReferenceDataController(ReferenceDataService referenceDataService, JdbcTemplate jdbcTemplate) {
        this.referenceDataService = referenceDataService;
        this.jdbcTemplate = jdbcTemplate;
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
        String sql = "SELECT * FROM reference_data WHERE id = ?";
        return jdbcTemplate.query(sql, new Object[]{id}, new ReferenceDataRowMapper());
    }
}