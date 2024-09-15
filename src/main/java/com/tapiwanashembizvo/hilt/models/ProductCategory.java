package com.tapiwanashembizvo.hilt.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity
@Table(name = "product_categories")
public class ProductCategory {

    @Id
    @Column(name = "category_id")
    private  Integer id;
    private String categoryName;
    private  String categoryDesc;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "business_unit_id")
    @JsonBackReference
    private BusinessUnit businessUnit;

    public ProductCategory() {
    }

    public ProductCategory(Integer id, String categoryName, String categoryDesc, BusinessUnit businessUnit) {
        this.id = id;
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
        this.businessUnit = businessUnit;
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

    public BusinessUnit getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }
}
