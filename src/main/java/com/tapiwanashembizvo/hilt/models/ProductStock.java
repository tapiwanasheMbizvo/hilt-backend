package com.tapiwanashembizvo.hilt.models;

import com.tapiwanashembizvo.hilt.models.Product;
import jakarta.persistence.*;

@Entity
@Table(name = "product_stock")
public class ProductStock {
    @Id
    @Column(name = "product_stock_id ")
    private Integer id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "product_id")
   // @Column(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "total_quantity", nullable = false)
    private Integer totalQuantity;

    public ProductStock() {
    }

    public ProductStock(Integer id, Product product, Integer totalQuantity) {
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
