package com.tapiwanashembizvo.hilt.dto;

public class BranchDto {

    private  Integer id;
    private String branchName;
    private  String branchLocation;



    public BranchDto() {
    }

    public BranchDto(Integer branchId, String branchName, String branchLocation) {
        this.id = branchId;
        this.branchName = branchName;
        this.branchLocation = branchLocation;

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

}
