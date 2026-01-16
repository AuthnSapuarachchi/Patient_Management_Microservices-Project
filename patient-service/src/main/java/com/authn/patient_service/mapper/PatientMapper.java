package com.authn.patient_service.mapper;

import com.authn.patient_service.dto.PatientResponseDTO;
import com.authn.patient_service.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setName(patient.getName());
        patientDTO.setName(patient.getEmail());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDataOfBirth(patient.getDateOfBirth().toString());

        return patientDTO;
    }

}
