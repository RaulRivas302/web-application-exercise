package com.example.web_application.controller;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Study;
import com.example.web_application.service.StudyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/studies")
public class StudyController {

    @Autowired
    private StudyService studyService;

    /**
     * Handles GET requests to retrieve all studies with pagination.
     *
     * @param page the page number to retrieve (default is 0).
     * @param size the number of studies per page (default is 10).
     * @return a PagedResponse containing a list of studies on the specified page and pagination metadata.
     */
    @GetMapping
    public PagedResponse<Study> getAllStudies(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return studyService.getAllStudies(page, size);
    }

    /**
     * Handles GET requests to retrieve studies by patient ID with pagination.
     *
     * @param patientId the ID of the patient whose studies to retrieve.
     * @param page the page number to retrieve (default is 0).
     * @param size the number of studies per page (default is 10).
     * @return a PagedResponse containing a list of studies for the specified patient on the specified page and pagination metadata.
     */
    @GetMapping("/search")
    public PagedResponse<Study> searchStudyByPatientId(
            @RequestParam Long patientId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return studyService.findStudyByPatientId(patientId, page, size);
    }
}
