package com.health_management.Hospital_Management.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class doctor_response{

        private Long id;
        private String doctorCode;
        private String firstName;
        private String lastName;
        private String specialization;
        private Integer experience;
        private String qualification;
        private String phoneno;
        private String email;
        private String licenseNo;
        private String address;
    }

