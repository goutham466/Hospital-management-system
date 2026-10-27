package com.health_management.Hospital_Management.repository;

import com.health_management.Hospital_Management.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface patientrepo
        extends JpaRepository<patient, Long> {

    Optional<patient> findByCode(Long code);

    Optional<patient> findByEmail(String email);

    Optional<patient> findByPhoneNumber(String phoneNumber);

    Optional<patient> findByAadhar(Long aadhar);
}