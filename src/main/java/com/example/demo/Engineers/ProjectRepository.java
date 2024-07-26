package com.example.demo.Engineers;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Optional<Project> getProjectsById(Long id);

    Project getDeleteById(Long id);

    List<Project> getProjectsByProjectmanagerid(Long id);

}
