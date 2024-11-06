package com.ust.Employeeinfo.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



public class Project {

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public long getProjectID() {
        return projectID;
    }

    public void setProjectID(long projectID) {
        this.projectID = projectID;
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
