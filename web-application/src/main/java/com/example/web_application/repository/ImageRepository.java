package com.example.web_application.repository;

import com.example.web_application.entity.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
    /**
     * Finds a paginated list of images by patient ID.
     *
     * @param patientId the ID of the patient whose images to retrieve.
     * @param pageable the pagination information.
     * @return a page of images for the specified patient.
     */
    Page<Image> findByPatientId(Long patientId, Pageable pageable);
}
