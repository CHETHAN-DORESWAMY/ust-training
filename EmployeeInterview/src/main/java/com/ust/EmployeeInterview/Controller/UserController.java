package com.ust.EmployeeInterview.Controller;

import com.ust.EmployeeInterview.Model.Employee;
import com.ust.EmployeeInterview.Model.Project;
import com.ust.EmployeeInterview.Repository.EmployeeRepository;
import com.ust.EmployeeInterview.Repository.ProjectRepository;
import com.ust.EmployeeInterview.Service.EmployeeService;
import com.ust.EmployeeInterview.Service.ProjectService;
import com.ust.EmployeeInterview.dto.employeedto;
import com.ust.EmployeeInterview.dto.projectdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/home")
public class UserController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody employeedto employee) {
        return ResponseEntity.ok(employeeService.addEmployee(employee, employee.getProjectId()));
    }

    @PostMapping("/addProject")
    public ResponseEntity<Project> addProject(@RequestBody projectdto project) {
        return ResponseEntity.ok(projectService.addProject(project));
    }

    @GetMapping("/getEmployee/{Projectid}")
    public ResponseEntity<List<Employee>> getEmployee(@PathVariable Long Projectid) {
        return ResponseEntity.ok(employeeService.getEmployeeByProjectId(Projectid));
    }

    @GetMapping("/getEmployee/{status}/{projectID}")
    public ResponseEntity<List<Employee>> getEmployeeByStatus(@PathVariable String status, @PathVariable Long projectID) {
        return ResponseEntity.ok(employeeService.findByStatusAndproject_projectId(status, projectID));
    }
}
