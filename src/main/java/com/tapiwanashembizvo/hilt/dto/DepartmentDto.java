package com.tapiwanashembizvo.hilt.dto;



import lombok.*;

import java.util.List;



public class DepartmentDto {


    private Integer id;

    private String departmentName;
    private String departmentDesc;


    private List<EmployeeDto> employees;

    public DepartmentDto() {
    }

    public DepartmentDto(Integer id, String departmentName, String departmentDesc,  List<EmployeeDto> employees) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentDesc = departmentDesc;

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



    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }


}
