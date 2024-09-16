package com.tapiwanashembizvo.hilt.dto;


import com.tapiwanashembizvo.hilt.models.Product;

import java.util.List;

public class ProductCategoryDto {

    private  Integer id;
    private String categoryName;
    private  String categoryDesc;

    private List<Product> products;
    public ProductCategoryDto() {
    }

    public ProductCategoryDto(Integer id, String categoryName, String categoryDesc, List<Product> products) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

}
