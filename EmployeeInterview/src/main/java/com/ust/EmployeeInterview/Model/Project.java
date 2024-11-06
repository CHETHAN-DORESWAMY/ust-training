package com.ust.EmployeeInterview.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Table(name = "Project")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String projectName;
    private String projectDescription;
    private String projectManager;

    @OneToMany(mappedBy = "project")
    private List<Employee> employees;





}
