package com.project.submission.controller;

import com.project.submission.entity.StudentProject;
import com.project.submission.service.StudentProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectSubmissionController {

    private final StudentProjectService service;

    @Autowired
    public ProjectSubmissionController(StudentProjectService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("project", new StudentProject());
        return "submission-form";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid @ModelAttribute("project") StudentProject project,
            BindingResult bindingResult,
            Model model) {
        if (bindingResult.hasErrors()) {
            return "submission-form";
        }

        service.saveProject(project);
        model.addAttribute("message", "Project submitted successfully!");
        model.addAttribute("studentName", project.getStudentName());

        return "success";
    }

    @GetMapping("/dashboard")
    public String showDashboard(jakarta.servlet.http.HttpSession session, Model model) {
        if (session.getAttribute("adminLoggedIn") == null || !(boolean) session.getAttribute("adminLoggedIn")) {
            return "redirect:/login";
        }
        model.addAttribute("projects", service.getAllProjects());
        return "dashboard";
    }
}
