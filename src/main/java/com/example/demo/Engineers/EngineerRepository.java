package com.example.demo.Engineers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface EngineerRepository extends JpaRepository<Engineer, Long> {
    Optional<Engineer> getEngineerById(Long id);

    Engineer getDeleteById(Long id);


    List<Engineer> getEngineerByProjectId(Long id);


}
