package com.example.web_application.repository;

import com.example.web_application.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PatientRepository extends JpaRepository<Patient, Long> {
    /**
     * Finds a paginated list of patients where the patient name contains the specified string.
     *
     * @param name the substring to search for within the patient names.
     * @param pageable the pagination information.
     * @return a page of patients whose names contain the specified substring.
     */
    Page<Patient> findByPatientNameContaining(String name, Pageable pageable);
}
