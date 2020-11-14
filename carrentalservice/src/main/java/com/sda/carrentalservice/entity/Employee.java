package com.sda.carrentalservice.entity;

public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private String jobPosition;
    private String workingBranch;

    public Employee(String firstName, String lastName, String jobPosition, String workingBranch) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        this.workingBranch = workingBranch;
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getWorkingBranch() {
        return workingBranch;
    }

    public void setWorkingBranch(String workingBranch) {
        this.workingBranch = workingBranch;
    }
}