package com.example.web_application.controller;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Image;
import com.example.web_application.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    /**
     * Handles GET requests to retrieve all images with pagination.
     *
     * @param page the page number to retrieve (default is 0).
     * @param size the number of images per page (default is 10).
     * @return a PagedResponse containing a list of images on the specified page and pagination metadata.
     */
    @GetMapping
    public PagedResponse<Image> getAllImages(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return imageService.getAllImages(page, size);
    }

    /**
     * Handles GET requests to retrieve images by patient ID with pagination
     *
     * @param patientId the ID of the patient whose images to retrieve.
     * @param page the page number to retrieve (default is 0).
     * @param size the number of images per page (default is 10).
     * @return a PagedResponse containing a list of images for the specified patient on the specified page and pagination metadata.
     */
    @GetMapping("/search")
    public PagedResponse<Image> searchImageByPatientId(
            @RequestParam Long patientId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return imageService.findByPatientId(patientId, page, size);
    }
}
