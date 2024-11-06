package com.ust.EmployeeInterview.Service;

import com.ust.EmployeeInterview.Model.Project;
import com.ust.EmployeeInterview.Repository.ProjectRepository;
import com.ust.EmployeeInterview.dto.projectdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project addProject(projectdto project) {
        Project project1 = new Project();
        project1.setProjectName(project.getProjectName());
        project1.setProjectDescription(project.getProjectDescription());
        project1.setProjectManager(project.getProjectManager());
        projectRepository.save(project1);
        return project1;
    }
}
