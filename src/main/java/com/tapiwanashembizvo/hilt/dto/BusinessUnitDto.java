package com.tapiwanashembizvo.hilt.dto;

import lombok.*;


public class BusinessUnitDto {

    private String businessName;
    private String businessAddress;
    private String businessEmail;
    private String businessPhone;
    private  String businessWebsite;

    public BusinessUnitDto(String businessName, String businessAddress, String businessEmail, String businessPhone, String businessWebsite) {
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessEmail = businessEmail;
        this.businessPhone = businessPhone;
        this.businessWebsite = businessWebsite;
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
}
