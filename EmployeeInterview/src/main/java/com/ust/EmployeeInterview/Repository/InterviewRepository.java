package com.ust.EmployeeInterview.Repository;

import com.ust.EmployeeInterview.Model.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Long>{
}
