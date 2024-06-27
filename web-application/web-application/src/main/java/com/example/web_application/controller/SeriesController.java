package com.example.web_application.controller;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Series;
import com.example.web_application.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/series")
public class SeriesController {

    @Autowired
    private SeriesService seriesService;

    /**
     * Handles GET requests to retrieve all series with pagination.
     *
     * @param page the page number to retrieve (default is 0).
     * @param size the number of series per page (default is 10).
     * @return a PagedResponse containing a list of series on the specified page and pagination metadata.
     */
    @GetMapping
    public PagedResponse<Series> getAllSeries(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return seriesService.getAllSeries(page, size);
    }

    /**
     * Handles GET requests to retrieve series by patient ID with pagination.
     *
     * @param patientId the ID of the patient whose consultation's series to retrieve.
     * @param page the page number to retrieve (default is 0).
     * @param size the number of series per page (default is 10).
     * @return a PagedResponse containing a list of series for the specified consultation on the specified page and pagination metadata.
     */
    @GetMapping("/search")
    public PagedResponse<Series> searchSeriesByPatientId(
            @RequestParam Long patientId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return seriesService.findSeriesByPatientId(patientId, page, size);
    }
}
