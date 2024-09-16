package com.tapiwanashembizvo.hilt.dto;

import com.tapiwanashembizvo.hilt.models.Product;

public class ProductStockDto {

    private Integer id;
    private Product product;
    private Integer totalQuantity;


    public ProductStockDto() {
    }

    public ProductStockDto(Integer id, Product product, Integer totalQuantity) {
        this.id = id;
        this.product = product;
        this.totalQuantity = totalQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
}
