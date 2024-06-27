package com.example.web_application.controller;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Patient;
import com.example.web_application.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    /**
     * Handles GET requests to retrieve all patients with pagination.
     *
     * @param page the page number to retrieve (default is 0).
     * @param size the number of patients per page (default is 10).
     * @return a PagedResponse containing a list of patients on the specified page and pagination metadata.
     */
    @GetMapping
    public PagedResponse<Patient> getAllPatients(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return patientService.getAllPatients(page, size);
    }

    /**
     * Handles GET requests to retrieve patients by name with pagination.
     *
     * @param name the name of the patient to search for.
     * @param page the page number to retrieve (default is 0).
     * @param size the number of patients per page (default is 10).
     * @return a PagedResponse containing a list of patients matching the specified name on the specified page and pagination metadata.
     */
    @GetMapping("/search")
    public PagedResponse<Patient> searchPatientsByName(
            @RequestParam String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return patientService.searchPatientsByName(name, page, size);
    }
}
