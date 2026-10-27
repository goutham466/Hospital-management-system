package com.health_management.Hospital_Management.Service;

import com.health_management.Hospital_Management.entity.patient;
import com.health_management.Hospital_Management.repository.patientrepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class patient_service {

    private final patientrepo re;

    // Get all patients
    public List<patient> getAll() {
        return re.findAll();
    }

    // Add patient
    public patient add(patient pat) {

        if (re.findByCode(pat.getCode()).isPresent()) {
            throw new RuntimeException("Patient code already exists");
        }

        if (re.findByEmail(pat.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        if (re.findByPhoneNumber(pat.getPhoneNumber()).isPresent()) {
            throw new RuntimeException("Phone number already exists");
        }

        if (re.findByAadhar(pat.getAadhar()).isPresent()) {
            throw new RuntimeException("Aadhar number already exists");
        }

        patient saved = re.save(pat);
        log.info("Patient added successfully");

        return saved;
    }

    // Get patient by ID
    public patient getId(Long id) {
        return re.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Patient not found with ID: " + id));
    }

    // Update patient
    public patient update(patient pat, Long id) {

        patient existing = re.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Patient not found with ID: " + id));

        existing.setCode(pat.getCode());
        existing.setFirst_name(pat.getFirst_name());
        existing.setLast_name(pat.getLast_name());
        existing.setAge(pat.getAge());
        existing.setAadhar(pat.getAadhar());
        existing.setEmail(pat.getEmail());
        existing.setPhoneNumber(pat.getPhoneNumber());
        existing.setAddress(pat.getAddress());
        existing.setEmergencyContact(pat.getEmergencyContact());
        existing.setAdmitDate(pat.getAdmitDate());

        return re.save(existing);
    }

    // Delete patient
    public void delete(Long id) {

        patient existing = re.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Patient not found with ID: " + id));

        re.delete(existing);
        log.info("Patient deleted successfully with ID: {}", id);
    }
}