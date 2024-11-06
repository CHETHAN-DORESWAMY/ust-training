package com.ust.Projectinfo.repository;

import com.ust.Projectinfo.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends MongoRepository<Project, Long> {
    List<Project> findByCompanyCode(long code);
}
