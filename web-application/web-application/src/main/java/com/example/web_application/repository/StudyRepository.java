package com.example.web_application.repository;

import com.example.web_application.entity.Study;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends JpaRepository<Study, Long> {
    /**
     * Finds a paginated list of studies by patient ID.
     *
     * @param patientId the ID of the patient whose studies to retrieve.
     * @param pageable the pagination information.
     * @return a page of studies for the specified patient.
     */
    Page<Study> findByPatientId(Long patientId, Pageable pageable);
}

