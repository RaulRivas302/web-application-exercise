package com.example.web_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionVerifier implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            String sql = "SELECT 1 FROM DUAL";
            jdbcTemplate.queryForObject(sql, Integer.class);
            System.out.println("Successfully connected to the database!");
        } catch (Exception e) {
            System.err.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}
