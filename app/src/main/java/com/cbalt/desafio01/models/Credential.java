package com.cbalt.desafio01.models;

public class Credential {

    private String department, jobTitle, name;

    public Credential() {
    }

    public Credential(String department, String jobTitle, String name) {
        this.department = department;
        this.jobTitle = jobTitle;
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
