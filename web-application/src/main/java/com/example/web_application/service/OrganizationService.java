package com.example.web_application.service;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Organization;
import com.example.web_application.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    /**
     * Retrieves a paginated list of all organizations.
     *
     * @param page the page number to retrieve (zero-based).
     * @param size the number of organizations per page.
     * @return a PagedResponse containing a list of organizations on the specified page and pagination metadata.
     */
    public PagedResponse<Organization> getAllOrganizations(int page, int size) {
        Page<Organization> organizationPage = organizationRepository.findAll(PageRequest.of(page, size));
        boolean hasNextPage = organizationPage.hasNext();
        return new PagedResponse<>(organizationPage.getContent(), hasNextPage);
    }

    /**
     * Searches for organizations by name with pagination.
     *
     * @param name the substring to search for within the organization names.
     * @param page the page number to retrieve (zero-based).
     * @param size the number of organizations per page.
     * @return a PagedResponse containing a list of organizations matching the specified name on the specified page and pagination metadata.
     */
    public PagedResponse<Organization> findByOrganizationNameContaining(String name, int page, int size) {
        Page<Organization> organizationsPage = organizationRepository.findByOrganizationNameContaining(name, PageRequest.of(page, size));
        boolean hasNextPage = organizationsPage.hasNext();
        return new PagedResponse<>(organizationsPage.getContent(), hasNextPage);
    }
}
