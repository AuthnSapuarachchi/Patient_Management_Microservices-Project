package com.authn.patient_service.service;

import com.authn.patient_service.dto.PatientResponseDTO;
import com.authn.patient_service.mapper.PatientMapper;
import com.authn.patient_service.model.Patient;
import com.authn.patient_service.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients () {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(PatientMapper::toDTO).toList();
    }

}
