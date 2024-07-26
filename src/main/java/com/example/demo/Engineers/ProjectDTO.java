package com.example.demo.Engineers;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO {
    Long id;
    String site;
    Long projectManagerId;

}