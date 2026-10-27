package com.health_management.Hospital_Management.Controller;

import org.springframework.web.bind.annotation.RestController;



import com.health_management.Hospital_Management.Service.patient_service;
import com.health_management.Hospital_Management.entity.patient;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*

    @RestController
    @RequestMapping("/api/patients")
    @RequiredArgsConstructor
    public class patient_controller {

        private final patient_service ps;

        // Get all patients
        @GetMapping
        public ResponseEntity<List<patient>> getAll() {
            return ResponseEntity.ok(ps.getAll());
        }

        // Add a new patient
        @PostMapping
        public ResponseEntity<patient> add(
                @RequestBody patient pat) {

            patient savedPatient = ps.add(pat);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(savedPatient);
        }

        // Get patient by ID
        @GetMapping("/{id}")
        public ResponseEntity<patient> getId(
                @PathVariable Long id) {

            return ResponseEntity.ok(ps.getId(id));
        }

        // Update patient
        @PutMapping("/{id}")
        public ResponseEntity<patient> update(
                @PathVariable Long id,
                @RequestBody patient pat) {

            return ResponseEntity.ok(ps.update(pat, id));
        }

        // Delete patient
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> delete(
                @PathVariable Long id) {

            ps.delete(id);

            return ResponseEntity.noContent().build();
        }
    }
}
