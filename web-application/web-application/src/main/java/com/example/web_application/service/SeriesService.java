package com.example.web_application.service;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Series;
import com.example.web_application.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;

    /**
     * Retrieves a paginated list of all series.
     *
     * @param page the page number to retrieve (zero-based).
     * @param size the number of series per page.
     * @return a PagedResponse containing a list of series on the specified page and pagination metadata.
     */
    public PagedResponse<Series> getAllSeries(int page, int size) {
        Page<Series> seriesPage = seriesRepository.findAll(PageRequest.of(page, size));
        boolean hasNextPage = seriesPage.hasNext();
        return new PagedResponse<>(seriesPage.getContent(), hasNextPage);
    }

    /**
     * Retrieves a paginated list of series by patient ID.
     *
     * @param patientId the ID of the patient whose series to retrieve.
     * @param page the page number to retrieve (zero-based).
     * @param size the number of series per page.
     * @return a PagedResponse containing a list of series for the specified patient on the specified page and pagination metadata.
     */
    public PagedResponse<Series> findSeriesByPatientId(Long patientId, int page, int size) {
        Page<Series> seriesPage = seriesRepository.findByPatientId(patientId, PageRequest.of(page, size));
        boolean hasNextPage = seriesPage.hasNext();
        return new PagedResponse<>(seriesPage.getContent(), hasNextPage);
    }
}
