package com.example.web_application.controller;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Organization;
import com.example.web_application.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    /**
     * Handles GET requests to retrieve all organizations with pagination.
     *
     * @param page the page number to retrieve (default is 0).
     * @param size the number of organizations per page (default is 10).
     * @return a PagedResponse containing a list of organizations on the specified page and pagination metadata.
     */
    @GetMapping
    public PagedResponse<Organization> getAllOrganizations(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return organizationService.getAllOrganizations(page, size);
    }

    /**
     * Handles GET requests to search for organizations by name with pagination.
     *
     * @param name the name of the organization to search for.
     * @param page the page number to retrieve (default is 0).
     * @param size the number of organizations per page (default is 10).
     * @return a PagedResponse containing a list of organizations matching the specified name on the specified page and pagination metadata.
     */
    @GetMapping("/search")
    public PagedResponse<Organization> searchOrganizationsByName(
            @RequestParam String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return organizationService.findByOrganizationNameContaining(name, page, size);
    }
}
