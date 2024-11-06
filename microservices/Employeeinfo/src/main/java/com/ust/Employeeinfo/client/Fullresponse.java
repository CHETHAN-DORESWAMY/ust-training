package com.ust.Employeeinfo.client;



import java.util.List;

public class Fullresponse {

    private long companyCode;
    private String name;
    private List<String> skills;
    private String email;
    private String phone;
    private String address;

    public List<Project> projects;

    public Fullresponse(long companyCode, String name, List<String> skills, String email, String phone, String address, List<Project> projects) {
        this.companyCode = companyCode;
        this.name = name;
        this.skills = skills;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.projects = projects;
    }

    public Fullresponse() {
    }


    public long getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(long companyCode) {
        this.companyCode = companyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
