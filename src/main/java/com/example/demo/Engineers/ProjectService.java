package com.example.demo.Engineers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Component
@Service
@Transactional
@CrossOrigin
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectDTO getProjectById(Long id) {
        Optional<Project> project = projectRepository.getProjectsById(id);

        if(project.isEmpty()) {
            return null;
        } else {
            Project proj = project.get();

            return ProjectDTO.builder()
                    .id(proj.getId())
                    .site(proj.getSite())
                    .projectManagerId(proj.getProjectmanagerid()).build();
        }
    }

    public List<ProjectDTO> getByProjectManagerId(Long id) {
        List<ProjectDTO> project = projectRepository.getProjectsByProjectmanagerid(id).stream().map(proj -> ProjectDTO.builder()
                .id(proj.getId())
                .site(proj.getSite())
                .projectManagerId(proj.getProjectmanagerid()).build()).toList();
        return project;
    }

    public List<ProjectDTO> getAllProjects() {
        List<ProjectDTO> projects = projectRepository.findAll().stream().map(proj -> ProjectDTO.builder()
                .id(proj.getId())
                .site(proj.getSite())
                .projectManagerId(proj.getProjectmanagerid()).build()).toList();

        return projects;

    }

    public void addProject(ProjectDTO project) {
        Project proj = new Project();
        proj.setSite(project.getSite());
        proj.setProjectmanagerid(project.getProjectManagerId());
        projectRepository.save(proj);
    }

    public void delete(Long id) {
        Project project = projectRepository.getDeleteById(id);

        if(project != null) projectRepository.delete(project);
    }

    public void updateProject(ProjectDTO project, Long id) {
        Project proj = new Project();
        proj.setId(id);
        proj.setSite(project.getSite());
        proj.setProjectmanagerid(project.getProjectManagerId());

        projectRepository.save(proj);
    }



}
