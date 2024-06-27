package com.example.web_application.repository;

import com.example.web_application.entity.Organization;
import com.example.web_application.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    /**
     * Finds a paginated list of organizations where the organization name contains the specified string.
     *
     * @param name the substring to search for within the organization names.
     * @param pageable the pagination information.
     * @return a page of organizations whose names contain the specified substring.
     */
    Page<Organization> findByOrganizationNameContaining(String name, Pageable pageable);
}
