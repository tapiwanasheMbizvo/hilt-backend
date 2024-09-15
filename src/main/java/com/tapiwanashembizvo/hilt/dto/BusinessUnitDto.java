package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.BusinessBranch;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


public class BusinessUnitDto {

    private String businessName;
    private String businessAddress;
    private String businessEmail;
    private String businessPhone;
    private  String businessWebsite;

    private List<BusinessBranch> branches;
    private Boolean isDeleted;
    private LocalDateTime deletedOn;

    public BusinessUnitDto(String businessName, String businessAddress, String businessEmail, String businessPhone, String businessWebsite, List<BusinessBranch> branches) {
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessEmail = businessEmail;
        this.businessPhone = businessPhone;
        this.businessWebsite = businessWebsite;
        this.branches = branches;
    }

    public BusinessUnitDto() {
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

    public List<BusinessBranch> getBranches() {
        return branches;
    }

    public void setBranches(List<BusinessBranch> branches) {
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


}
