package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.Branch;
import com.tapiwanashembizvo.hilt.models.Employee;
import com.tapiwanashembizvo.hilt.models.ProductCategory;

import java.time.LocalDateTime;
import java.util.List;


public class BusinessUnitDto {
    private Integer id;
    private String businessName;
    private String businessAddress;
    private String businessEmail;
    private String businessPhone;
    private  String businessWebsite;

    private List<Branch> branches;
    private Boolean isDeleted;
    private LocalDateTime deletedOn;

    private List<Employee> employees;
    private List<ProductCategory> productCategories;

    public BusinessUnitDto(Integer id, String businessName, String businessAddress, String businessEmail, String businessPhone, String businessWebsite, List<Branch> branches, Boolean isDeleted, LocalDateTime deletedOn, List<Employee> employees, List<ProductCategory> productCategories) {
        this.id = id;
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessEmail = businessEmail;
        this.businessPhone = businessPhone;
        this.businessWebsite = businessWebsite;
        this.branches = branches;
        this.isDeleted = isDeleted;
        this.deletedOn = deletedOn;
        this.employees = employees;
        this.productCategories = productCategories;
    }

    public BusinessUnitDto() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessEmail() {
        return businessEmail;
    }

    public void setBusinessEmail(String businessEmail) {
        this.businessEmail = businessEmail;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getBusinessWebsite() {
        return businessWebsite;
    }

    public void setBusinessWebsite(String businessWebsite) {
        this.businessWebsite = businessWebsite;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public LocalDateTime getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(LocalDateTime deletedOn) {
        this.deletedOn = deletedOn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }
}
