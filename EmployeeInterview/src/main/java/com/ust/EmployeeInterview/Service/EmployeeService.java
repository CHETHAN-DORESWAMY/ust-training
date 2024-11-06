package com.ust.EmployeeInterview.Service;

import com.ust.EmployeeInterview.Model.Employee;
import com.ust.EmployeeInterview.Model.Project;
import com.ust.EmployeeInterview.Repository.EmployeeRepository;
import com.ust.EmployeeInterview.Repository.ProjectRepository;
import com.ust.EmployeeInterview.dto.employeedto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    public Employee addEmployee(employeedto employee, long projectId) {
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found"));
        Employee employee1 = new Employee();
        employee1.setEmployeeName(employee.getEmployeeName());
        employee1.setEmployeeEmail(employee.getEmployeeEmail());
        employee1.setStatus(employee.getStatus());
        employee1.setEmployeePhone(employee.getEmployeePhone());

        employee1.setProject(project);
        return employeeRepository.save(employee1);
    }

    public List<Employee> getEmployeeByProjectId(Long projectid) {
        return employeeRepository.findByproject_projectId(projectid);
    }

    public List<Employee> findByStatusAndproject_projectId(String status, Long projectID) {
        List<Employee> employeeList = getEmployeeByProjectId(projectID);
        return employeeList.stream().filter(employee -> employee.getStatus().equals(status)).toList();
    }
}
