package com.ust.EmployeeInterview.Repository;

import com.ust.EmployeeInterview.Model.Employee;
import com.ust.EmployeeInterview.Model.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByproject_projectId(Long projectId);


}
