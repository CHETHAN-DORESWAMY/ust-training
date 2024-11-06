package com.ust.EmployeeInterview.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.GenerationType;


@Entity
@Table(name = "Employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeePhone;

    @Pattern(regexp = "^(PASS|FAIL)$", message = "provide either pass or fail in captital letter")
    private String status;

    @ManyToOne
    @JsonIgnore
    private Project project;


}
