package com.tapiwanashembizvo.hilt.repositories;


import com.tapiwanashembizvo.hilt.models.ProductStock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductStockRepository extends JpaRepository<ProductStock, Integer> {

    Optional<ProductStock> findByProductId(Integer productId);
}
