package com.example.demoDb.controller;

import com.example.demoDb.entity.Employee;
import com.example.demoDb.entity.Project;
import com.example.demoDb.repository.EmployeeRepository;
import com.example.demoDb.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value ="/project")
    public List<Project> getProjects()
    {
        return projectRepository.findAll();
    }
    @PostMapping(value ="/project")
    public Project addNewProject(@RequestBody Project project)
    {
        return projectRepository.save(project);
    }

    @GetMapping(value = "/project/{projectId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Project> getProjectById(@PathVariable Integer projectId)
    {
        return projectRepository.findByProjectId(projectId);

    }

}
