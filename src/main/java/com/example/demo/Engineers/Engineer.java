package com.example.demo.Engineers;

import jakarta.validation.constraints.NotEmpty;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "engineers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Engineer{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @NotEmpty
        private String firstName;


        @NotEmpty
        private String lastName;


        private String email;


        private String title;


        private Long experience;

        // @OneToMany
        @JoinColumn(name = "project.id")
        private Long projectId;

}
