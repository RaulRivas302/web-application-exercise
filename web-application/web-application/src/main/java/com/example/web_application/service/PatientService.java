package com.example.web_application.service;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Patient;
import com.example.web_application.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    /**
     * Retrieves a paginated list of all patients.
     *
     * @param page the page number to retrieve (zero-based).
     * @param size the number of patients per page.
     * @return a PagedResponse containing a list of patients on the specified page and pagination metadata.
     */
    public PagedResponse<Patient> getAllPatients(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Patient> patientPage = patientRepository.findAll(pageable);
        boolean hasNextPage = patientPage.hasNext();
        return new PagedResponse<>(patientPage.getContent(), hasNextPage);
    }

    /**
     * Searches for patients by name with pagination.
     *
     * @param name the substring to search for within the patient names.
     * @param page the page number to retrieve (zero-based).
     * @param size the number of patients per page.
     * @return a PagedResponse containing a list of patients matching the specified name on the specified page and pagination metadata.
     */
    public PagedResponse<Patient> searchPatientsByName(String name, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Patient> patientPage = patientRepository.findByPatientNameContaining(name, pageable);
        boolean hasNextPage = patientPage.hasNext();
        return new PagedResponse<>(patientPage.getContent(), hasNextPage);
    }
}
