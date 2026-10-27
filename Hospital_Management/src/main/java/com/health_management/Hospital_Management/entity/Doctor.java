package com.health_management.Hospital_Management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctor")

public class Doctor {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true, nullable = false)
        private String doctorCode;

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        @Column(nullable = false)
        private String specialization;

        @Column(nullable = false)
        private Integer experience;

        @Column(nullable = false)
        private String qualification;

        private String phoneno;

        private String email;

        @Column(nullable = false, unique = true)
        private String licenseNo;

        private String address;
    }

