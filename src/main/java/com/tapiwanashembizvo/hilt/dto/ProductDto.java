package com.tapiwanashembizvo.hilt.dto;

public class ProductDto {

    private Integer id;
    private String productName;
    private String productDesc;
    private Double productPrice;



    public ProductDto() {
    }

    public ProductDto(Integer id, String productName, String productDesc, Double productPrice) {
        this.id = id;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

}
