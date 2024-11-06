package com.ust.Projectinfo.dto;


import jakarta.validation.constraints.NotNull;



import java.util.List;


public class Projectdto {

    private long projectID;

    @NotNull(message = "project name cannot be null")
    private String projectName;

    @NotNull(message = "project name cannot be null")
    private List<String> technologyStack;

    private long companyCode;

    public Projectdto(long projectID, String projectName, List<String> technologyStack, long companyCode) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.technologyStack = technologyStack;
        this.companyCode = companyCode;
    }

    public Projectdto() {
    }

    public long getProjectID() {
        return projectID;
    }

    public void setProjectID(long projectID) {
        this.projectID = projectID;
    }

    public @NotNull(message = "project name cannot be null") String getProjectName() {
        return projectName;
    }

    public void setProjectName(@NotNull(message = "project name cannot be null") String projectName) {
        this.projectName = projectName;
    }

    public @NotNull(message = "project name cannot be null") List<String> getTechnologyStack() {
        return technologyStack;
    }

    public void setTechnologyStack(@NotNull(message = "project name cannot be null") List<String> technologyStack) {
        this.technologyStack = technologyStack;
    }

    public long getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(long companyCode) {
        this.companyCode = companyCode;
    }
}





