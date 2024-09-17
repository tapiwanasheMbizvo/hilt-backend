package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.BusinessUnit;

public class EmployeeDto {
    private  Integer id;
    private String employeeNumber;
    private  String employeeFirstName;
    private  String employeeLastName;
    private  String employeePhoneNumber;
    private  String employeeEmailAddress;
    private DepartmentDto departmentDto;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer employeeId, String employeeNumber, String employeeFirstName, String employeeLastName, String employeePhoneNumber, String employeeEmailAddress, DepartmentDto departmentDto) {
        this.id = employeeId;
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmailAddress = employeeEmailAddress;
        this.departmentDto = departmentDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public DepartmentDto getBusinessUnit() {
        return departmentDto;
    }

    public void setBusinessUnit(DepartmentDto departmentDto) {
        this.departmentDto = departmentDto;
    }
}
