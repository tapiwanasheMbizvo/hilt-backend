package com.tapiwanashembizvo.hilt.dto;


public class ProductCategoryDto {

    private  Integer id;
    private String categoryName;
    private  String categoryDesc;

    public ProductCategoryDto() {
    }

    public ProductCategoryDto(Integer categoryId, String categoryName, String categoryDesc) {
        this.id = categoryId;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;

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
