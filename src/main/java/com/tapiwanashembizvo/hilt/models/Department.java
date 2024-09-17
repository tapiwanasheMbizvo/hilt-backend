package com.tapiwanashembizvo.hilt.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "department_id")
    private Integer id;

    private String departmentName;
    private String departmentDesc;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "business_unit_id")
    @JsonBackReference
    private BusinessUnit businessUnit;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Employee> employees;

    public Department() {
    }

    public Department(Integer id, String departmentName, String departmentDesc, BusinessUnit businessUnit, List<Employee> employees) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentDesc = departmentDesc;
        this.businessUnit = businessUnit;
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }

    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
