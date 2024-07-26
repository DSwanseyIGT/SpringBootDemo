package com.example.demo.Engineers;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;
    private final EngineerService engineerService;


    public ProjectController(ProjectService projectService, EngineerService engineerService) {
        this.projectService = projectService;
        this.engineerService = engineerService;
    }

    @GetMapping("")
    List<ProjectDTO> findAll() { return projectService.getAllProjects(); }

    @GetMapping("/{id}")
    ProjectDTO findById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @GetMapping("/project/{id}")
    List<ProjectDTO> findByProjectManagerId(@PathVariable Long id) {
        return projectService.getByProjectManagerId(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@Valid @RequestBody ProjectDTO project) {
        projectService.addProject(project);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@Valid @RequestBody ProjectDTO project, @PathVariable Long id) {
        projectService.updateProject(project, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        projectService.delete(id);
    }

    @GetMapping("/manager/{id}")
    EngineerDTO getManagerById(@PathVariable Long id) {
        return engineerService.getEngineerById(id);
    }




}
