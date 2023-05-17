package com.sakcode.old;

public class Professor {
    protected String name;
    private String employeeId;
    private Boolean status;

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setName(String lastName, String firstName) {
        this.name = lastName + " " + firstName;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
