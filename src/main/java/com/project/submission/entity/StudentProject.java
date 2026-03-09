package com.project.submission.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "student_projects")
public class StudentProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Roll No is required")
    @Column(name = "roll_no", nullable = false)
    private String rollNo;

    @NotBlank(message = "Name is required")
    @Column(name = "student_name", nullable = false)
    private String studentName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(name = "email_id", nullable = false)
    private String emailId;

    @NotBlank(message = "Branch is required")
    @Column(name = "branch", nullable = false)
    private String branch;

    @NotBlank(message = "Section is required")
    @Column(name = "section", nullable = false)
    private String section;

    @NotBlank(message = "Project Abstract is required")
    @Column(name = "project_abstract", nullable = false)
    private String projectAbstract;

    @NotBlank(message = "About Project is required")
    @Size(max = 2000, message = "Description must be less than 2000 characters")
    @Column(name = "about_project", nullable = false, length = 2000)
    private String aboutProject;

    @NotBlank(message = "Project Drive Link is required")
    @Column(name = "drive_link", nullable = false)
    private String projectDriveLink;

    @NotBlank(message = "Trainer Name is required")
    @Column(name = "trainer_name", nullable = false)
    private String trainerName;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getProjectAbstract() {
        return projectAbstract;
    }

    public void setProjectAbstract(String projectAbstract) {
        this.projectAbstract = projectAbstract;
    }

    public String getAboutProject() {
        return aboutProject;
    }

    public void setAboutProject(String aboutProject) {
        this.aboutProject = aboutProject;
    }

    public String getProjectDriveLink() {
        return projectDriveLink;
    }

    public void setProjectDriveLink(String projectDriveLink) {
        this.projectDriveLink = projectDriveLink;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
}
