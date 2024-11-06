package com.ust.spring_sec_demo2.Repository;


import com.ust.spring_sec_demo2.model.ProjectInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectInfoRepository extends MongoRepository<ProjectInfo, Integer> {
}
