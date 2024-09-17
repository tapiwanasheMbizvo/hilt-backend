package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.enums.BankAccountType;
import com.tapiwanashembizvo.hilt.models.enums.BankName;

public class BankingInfoDto {


    private Integer id;


    private String branchCode;


    private String accountNumber;


    private String accountName;


    private BankAccountType bankAccountType;


    private BankName bankName;

    public BankingInfoDto() {
    }

    public BankingInfoDto(Integer id, String branchCode, String accountNumber, String accountName, BankAccountType bankAccountType, BankName bankName) {
        this.id = id;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.bankAccountType = bankAccountType;
        this.bankName = bankName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public BankName getBankName() {
        return bankName;
    }

    public void setBankName(BankName bankName) {
        this.bankName = bankName;
    }
}
