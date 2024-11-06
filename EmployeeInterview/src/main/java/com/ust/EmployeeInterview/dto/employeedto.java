package com.ust.EmployeeInterview.dto;

import com.ust.EmployeeInterview.Model.Project;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class employeedto {
    private long employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeePhone;
    private String status;
    private long projectId;  // Reference to the project by ID


}
