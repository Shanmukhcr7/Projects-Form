package com.project.submission.service;

import com.project.submission.entity.Admin;
import com.project.submission.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository repository;

    @Autowired
    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }

    public boolean authenticate(String username, String password) {
        Admin admin = repository.findByUsername(username);
        // Using plain text for simplicity per request. In a real app, use BCrypt.
        if (admin != null && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
