package com.project.submission.repository;

import com.project.submission.entity.StudentProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentProjectRepository extends JpaRepository<StudentProject, Long> {
}
