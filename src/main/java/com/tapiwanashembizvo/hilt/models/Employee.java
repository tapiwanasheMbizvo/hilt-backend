package com.tapiwanashembizvo.hilt.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "business_employees")
public class Employee {

    @Id
    @Column(name = "employee_id")
    private  Integer id;
    private String employeeNumber;
    private  String employeeFirstName;
    private  String employeeLastName;
    private  String employeePhoneNumber;
    private  String employeeEmailAddress;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "department_id")
    @JsonBackReference
    private Department department;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<BankingInfo> bankingInfo;

    public Employee() {
    }

    public Employee(Integer id, String employeeNumber, String employeeFirstName, String employeeLastName, String employeePhoneNumber, String employeeEmailAddress, Department department, List<BankingInfo> bankingInfo) {
        this.id = id;
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmailAddress = employeeEmailAddress;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<BankingInfo> getBankingInfo() {
        return bankingInfo;
    }

    public void setBankingInfo(List<BankingInfo> bankingInfo) {
        this.bankingInfo = bankingInfo;
    }
}
