package com.tapiwanashembizvo.hilt.repositories;


import com.tapiwanashembizvo.hilt.models.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    Optional<List<ProductCategory>> findByBusinessUnitId(Integer businessUnitId);

}
