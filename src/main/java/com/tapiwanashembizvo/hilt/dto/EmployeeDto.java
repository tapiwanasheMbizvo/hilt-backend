package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.BusinessUnit;

import java.util.List;

public class EmployeeDto {
    private Integer id;
    private String employeeNumber;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeePhoneNumber;
    private String employeeEmailAddress;
    private List<BankingInfoDto> bankingInfo;

    public EmployeeDto() {
    }

    public EmployeeDto(Integer id, String employeeNumber, String employeeFirstName, String employeeLastName, String employeePhoneNumber, String employeeEmailAddress, List<BankingInfoDto> bankingInfo) {
        this.id = id;
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmailAddress = employeeEmailAddress;
        this.bankingInfo = bankingInfo;
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

    public List<BankingInfoDto> getBankingInfo() {
        return bankingInfo;
    }

    public void setBankingInfo(List<BankingInfoDto> bankingInfo) {
        this.bankingInfo = bankingInfo;
    }
}
