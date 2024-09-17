package com.tapiwanashembizvo.hilt.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tapiwanashembizvo.hilt.models.enums.BankAccountType;
import com.tapiwanashembizvo.hilt.models.enums.BankName;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "banking_information")
public class BankingInfo {


    @Id
    @Column(name = "bank_info_id")
    private  Integer id;

    @Column(name = "branch_code")
    private String branchCode;


    @Column(name = "account_number")
    private String accountNumber;


    @Column(name = "account_name")
    private  String accountName;

    @JdbcTypeCode(SqlTypes.NAMED_ENUM)
    @Column(name = "bank_account_type")
    private BankAccountType bankAccountType;

    @JdbcTypeCode(SqlTypes.NAMED_ENUM)
    @Column(name = "bank_name", nullable = false)
    private BankName bankName;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "employee_id")
    @JsonBackReference
    private Employee employee;

    public BankingInfo() {
    }

    public BankingInfo(Integer id, String branchCode, String accountNumber, String accountName, BankAccountType bankAccountType, BankName bankName, Employee employee) {
        this.id = id;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.bankAccountType = bankAccountType;
        this.bankName = bankName;
        this.employee = employee;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
