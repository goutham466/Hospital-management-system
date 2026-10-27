package com.health_management.Hospital_Management.Dto;

import com.health_management.Hospital_Management.Enum.Bloodgroup;
import com.health_management.Hospital_Management.Enum.gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class patient_request {
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class patient_request {
        @NotBlank(message = "required")
        private String patientCode;
        @NotBlank(message="name is required")
        private String firstName;
        @NotBlank(message = "required")
        private String lastName;
        @NotNull(message = "age is required")
        private String age;
        @NotNull(message = "gender is required")
        private gender gender;
        @Pattern(regexp = "^[6_9]\\d{9}$",message ="invalid phone")
        private String phoneNumber;
        @Email(message = "invalid")
        private String email;
        @NotBlank(message = "required")
        private Bloodgroup bloodgroup;
        @NotBlank(message = "required")
        private String aadhar;
        @NotBlank (message = "required")
        private String adress;


    }
}
