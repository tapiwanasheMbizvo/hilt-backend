package com.tapiwanashembizvo.hilt.dto;


import com.tapiwanashembizvo.hilt.models.Product;

import java.util.List;

public class ProductCategoryDto {

    private  Integer id;
    private String categoryName;
    private  String categoryDesc;

    private List<ProductDto> products;
    public ProductCategoryDto() {
    }

    public ProductCategoryDto(Integer id, String categoryName, String categoryDesc, List<ProductDto> products) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
        this.products = products;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
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
