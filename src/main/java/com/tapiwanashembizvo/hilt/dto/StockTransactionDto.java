package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.Product;
import com.tapiwanashembizvo.hilt.models.enums.StockTransactionType;
import jakarta.persistence.*;

import java.time.LocalDateTime;


public class StockTransactionDto {

    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_type", nullable = false)
    private StockTransactionType stockTransactionType;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "transaction_date", nullable = false)
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
