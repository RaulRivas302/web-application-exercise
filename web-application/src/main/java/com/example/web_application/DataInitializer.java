package com.example.web_application;

import com.example.web_application.entity.Organization;
import com.example.web_application.service.OrganizationService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private OrganizationService organizationService;

    @Override
    public void run(String... args) throws Exception {
//        if (organizationService.findAll().isEmpty()) {
//            ObjectMapper mapper = new ObjectMapper();
//            TypeReference<List<Organization>> typeReference = new TypeReference<List<Organization>>() {};
//            InputStream inputStream = new ClassPathResource("dummy-data.json").getInputStream();
//            List<Organization> organizations = mapper.readValue(inputStream, typeReference);
//            organizationService.saveAll(organizations);
//            System.out.println("Dummy data loaded!");
//        }
    }
}
