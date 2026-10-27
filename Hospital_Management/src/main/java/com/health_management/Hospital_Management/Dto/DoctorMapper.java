package com.health_management.Hospital_Management.Dto;


import com.health_management.Hospital_Management.entity.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    Doctor toEntity(doctor_request request);

    doctor_response toResponse(Doctor doctor);
}

