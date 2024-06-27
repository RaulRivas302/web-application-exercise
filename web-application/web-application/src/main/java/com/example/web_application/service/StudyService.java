package com.example.web_application.service;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Study;
import com.example.web_application.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class StudyService {

    @Autowired
    private StudyRepository studyRepository;

    /**
     * Retrieves a paginated list of all studies.
     *
     * @param page the page number to retrieve (zero-based).
     * @param size the number of studies per page.
     * @return a PagedResponse containing a list of studies on the specified page and pagination metadata.
     */
    public PagedResponse<Study> getAllStudies(int page, int size) {
        Page<Study> studiesPage = studyRepository.findAll(PageRequest.of(page, size));
        boolean hasNextPage = studiesPage.hasNext();
        return new PagedResponse<>(studiesPage.getContent(), hasNextPage);
    }

    /**
     * Finds a paginated list of studies by patient ID.
     *
     * @param patientId the ID of the patient whose studies to retrieve.
     * @param page the page number to retrieve (zero-based).
     * @param size the number of studies per page.
     * @return a PagedResponse containing a list of studies for the specified patient on the specified page and pagination metadata.
     */
    public PagedResponse<Study> findStudyByPatientId(Long patientId, int page, int size) {
        Page<Study> studiesPage = studyRepository.findByPatientId(patientId, PageRequest.of(page, size));
        boolean hasNextPage = studiesPage.hasNext();
        return new PagedResponse<>(studiesPage.getContent(), hasNextPage);
    }
}
