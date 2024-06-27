package com.example.web_application.repository;

import com.example.web_application.entity.Series;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {

    /**
     * Finds a paginated list of series by patient ID.
     *
     * @param patientId the ID of the patient whose series to retrieve.
     * @param pageable the pagination information.
     * @return a page of series for the specified patient.
     */
    Page<Series> findByPatientId(Long patientId, Pageable pageable);
}

