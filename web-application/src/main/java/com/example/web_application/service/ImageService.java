package com.example.web_application.service;

import com.example.web_application.dto.PagedResponse;
import com.example.web_application.entity.Image;
import com.example.web_application.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    /**
     * Retrieves a paginated list of all images.
     *
     * @param page the page number to retrieve (zero-based).
     * @param size the number of images per page.
     * @return a PagedResponse containing a list of images on the specified page and pagination metadata.
     */
    public PagedResponse<Image> getAllImages(int page, int size) {
        Page<Image> imagePage = imageRepository.findAll(PageRequest.of(page, size));
        boolean hasNextPage = imagePage.hasNext();
        return new PagedResponse<>(imagePage.getContent(), hasNextPage);
    }

    /**
     * Retrieves a paginated list of images by patient ID.
     *
     * @param patientId the ID of the patient whose images to retrieve.
     * @param page the page number to retrieve (zero-based).
     * @param size the number of images per page.
     * @return a PagedResponse containing a list of images for the specified patient on the specified page and pagination metadata.
     */
    public PagedResponse<Image> findByPatientId(Long patientId, int page, int size) {
        Page<Image> imagePage = imageRepository.findByPatientId(patientId, PageRequest.of(page, size));
        boolean hasNextPage = imagePage.hasNext();
        return new PagedResponse<>(imagePage.getContent(), hasNextPage);
    }
}
