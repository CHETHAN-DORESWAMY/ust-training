package com.ust.spring_sec_demo2.Service;

import com.ust.spring_sec_demo2.Repository.ProjectInfoRepository;
import com.ust.spring_sec_demo2.model.ProjectInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectInfoRepository repo;

    public ProjectInfo addProject(ProjectInfo projectInfo) {
        return repo.save(projectInfo);
    }

    public List<ProjectInfo> getProjects() {
        return repo.findAll();
    }
}
