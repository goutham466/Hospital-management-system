package com.health_management.Hospital_Management.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class patient {
    @Column(name="slno")
    private Long id;
    @Id
    @Column(name="Patient_code")
    private Long code;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private int age;
    @Column(unique = true,nullable = false)
    private Long aadhar;
    @Column(unique = true,nullable = false)
    private String Email;
    @Column(nullable = false,unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String emergencyContact;
    @Column(nullable = false)
    private String admitDate;





}
