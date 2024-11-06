package com.ust.Employeeinfo.repository;

import com.ust.Employeeinfo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface Employeerepository extends MongoRepository<Employee, Long> {
    Optional<Employee> findByCompanyCode(long companyCode);
}
