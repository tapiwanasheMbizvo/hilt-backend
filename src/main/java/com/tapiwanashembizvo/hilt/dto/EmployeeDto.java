package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.BusinessUnit;

public class EmployeeDto {
    private  Integer employeeId;
    private String employeeNumber;
    private  String employeeFirstName;
    private  String employeeLastName;
    private  String employeePhoneNumber;
    private  String employeeEmailAddress;
    private BusinessUnit businessUnit;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer employeeId, String employeeNumber, String employeeFirstName, String employeeLastName, String employeePhoneNumber, String employeeEmailAddress, BusinessUnit businessUnit) {
        this.employeeId = employeeId;
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmailAddress = employeeEmailAddress;
        this.businessUnit = businessUnit;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeEmailAddress() {
        return employeeEmailAddress;
    }

    public void setEmployeeEmailAddress(String employeeEmailAddress) {
        this.employeeEmailAddress = employeeEmailAddress;
    }

    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }
}
