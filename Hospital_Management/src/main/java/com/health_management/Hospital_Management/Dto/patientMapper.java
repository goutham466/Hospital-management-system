package com.health_management.Hospital_Management.Dto;

import com.health_management.Hospital_Management.entity.patient;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring",builder = @Builder(disableBuilder = true))

public interface patientMapper{
    patient toEnter(patient_request pt);
    patient_response toResponde(patient s);

    void updatePatientFromRequest(patient_response Req,@MappingTarget patient pt);
}
