package com.example.demo.Engineers;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EngineerDTO {
    Long id;
    String firstName;
    String lastName;
    String email;
    String title;
    Long experience;
    Long projectId;
    // Project project;

}
