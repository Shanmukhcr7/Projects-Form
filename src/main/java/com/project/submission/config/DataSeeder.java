package com.project.submission.config;

import com.project.submission.entity.Admin;
import com.project.submission.repository.AdminRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner initDatabase(AdminRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Admin defaultAdmin = new Admin();
                defaultAdmin.setUsername("admin");
                defaultAdmin.setPassword("admin123");
                repository.save(defaultAdmin);
                System.out.println("Default admin user created: admin / admin123");
            }
        };
    }
}
