package com.ust.Projectinfo.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;



@Document(collection = "Project")
public class Project {

    @Id
    private long projectID;
    private String projectName;
    private List<String> technologyStack;
    private long companyCode;

    public Project(long projectID, String projectName, List<String> technologyStack, long companyCode) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.technologyStack = technologyStack;
        this.companyCode = companyCode;
    }

    public Project() {
    }

    public long getProjectID() {
        return projectID;
    }

    public void setProjectID(long projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<String> getTechnologyStack() {
        return technologyStack;
    }

    public void setTechnologyStack(List<String> technologyStack) {
        this.technologyStack = technologyStack;
    }

    public long getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(long companyCode) {
        this.companyCode = companyCode;
    }
}
