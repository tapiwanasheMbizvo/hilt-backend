package com.tapiwanashembizvo.hilt.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.ToString;


@Entity
@Table(name = "business_branches")
public class Branch {

    @Id
    @Column(name = "branch_id")
    private  Integer id;
    private String branchName;
    private  String branchLocation;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "business_unit_id")
    @JsonBackReference
    private BusinessUnit businessUnit;

    public Branch() {
    }

    public Branch(Integer branchId, String branchName, String branchLocation, BusinessUnit businessUnit) {
        this.id = branchId;
        this.branchName = branchName;
        this.branchLocation = branchLocation;
        this.businessUnit = businessUnit;
    }



    public Integer getBranchId() {
        return id;
    }

    public void setBranchId(Integer branchId) {
        this.id = branchId;
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

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", branchName='" + branchName + '\'' +
                ", branchLocation='" + branchLocation + '\'' +
                ", businessUnit=" + businessUnit +
                '}';
    }
}
