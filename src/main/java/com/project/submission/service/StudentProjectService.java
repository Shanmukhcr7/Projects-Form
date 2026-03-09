package com.project.submission.service;

import com.project.submission.entity.StudentProject;
import com.project.submission.repository.StudentProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentProjectService {

    private final StudentProjectRepository repository;

    @Autowired
    public StudentProjectService(StudentProjectRepository repository) {
        this.repository = repository;
    }

    public StudentProject saveProject(StudentProject project) {
        return repository.save(project);
    }

    public java.util.List<StudentProject> getAllProjects() {
        return repository.findAll();
    }
}
