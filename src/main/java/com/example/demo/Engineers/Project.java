package com.example.demo.Engineers;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "projects")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String site;

        // @OneToMany
        @JoinColumn(name = "engineer.id")
        private Long projectmanagerid;
}
