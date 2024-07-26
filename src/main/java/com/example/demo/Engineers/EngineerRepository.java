package com.example.demo.Engineers;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EngineerRepository extends JpaRepository<Engineer, Long> {
    Optional<Engineer> getEngineerById(Long id);

    Engineer getDeleteById(Long id);// this returns the engineer to be deleted


    List<Engineer> getEngineerByProjectId(Long id);


}
