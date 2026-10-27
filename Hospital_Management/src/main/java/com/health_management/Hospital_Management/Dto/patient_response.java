package com.health_management.Hospital_Management.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class patient_response {

        private long id;
        private String patientCode;
        private String firstName;
        private String lastName;
        private String age;
        private String gender;
        private String phoneno;
        private String email;
        private String bloodgroup;
        private String adress;
}
