package com.tapiwanashembizvo.hilt.repositories;


import com.tapiwanashembizvo.hilt.models.Product;
import com.tapiwanashembizvo.hilt.models.StockTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockTransactionRepository extends JpaRepository<StockTransaction, Integer> {


    List<StockTransaction> findByBranchId(Integer branchId);
}
