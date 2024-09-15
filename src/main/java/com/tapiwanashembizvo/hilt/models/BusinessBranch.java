package com.tapiwanashembizvo.hilt.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "business_branches")
public class BusinessBranch {

    @Id
    private  Integer branchId;
    private String branchName;
    private  String branchLocation;

    @ManyToOne
    @JoinColumn(name = "business_unit_id")
    private BusinessUnit businessUnit;

    public BusinessBranch() {
    }

    public BusinessBranch(Integer branchId, String branchName, String branchLocation, BusinessUnit businessUnit) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.branchLocation = branchLocation;
        this.businessUnit = businessUnit;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }
}
