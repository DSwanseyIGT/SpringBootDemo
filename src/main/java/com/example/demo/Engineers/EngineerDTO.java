package com.example.demo.Engineers;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// this takes care of the getters and setters, .toString
@Builder// allows you to call .builder and construct an instance of this class
@AllArgsConstructor// generates a constructor requiring arguments for every field
@NoArgsConstructor// generates a default constructor with no parameters
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
