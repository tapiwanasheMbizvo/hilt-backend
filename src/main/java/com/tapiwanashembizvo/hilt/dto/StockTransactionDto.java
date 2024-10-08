package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.Branch;
import com.tapiwanashembizvo.hilt.models.Product;
import com.tapiwanashembizvo.hilt.models.enums.StockTransactionType;

import java.time.LocalDateTime;


public class StockTransactionDto {


    private Integer id;


    private Product product;


    private Branch branch;


    private StockTransactionType stockTransactionType;


    private Integer quantity;

    private LocalDateTime transactionDate;


    public Integer getTransactionId() {
        return id;
    }

    public void setTransactionId(Integer transactionId) {
        this.id = transactionId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public StockTransactionType getTransactionType() {
        return stockTransactionType;
    }

    public void setTransactionType(StockTransactionType transactionType) {
        this.stockTransactionType = transactionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public StockTransactionType getStockTransactionType() {
        return stockTransactionType;
    }

    public void setStockTransactionType(StockTransactionType stockTransactionType) {
        this.stockTransactionType = stockTransactionType;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
