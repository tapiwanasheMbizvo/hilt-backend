package com.tapiwanashembizvo.hilt.configuration;


import com.tapiwanashembizvo.hilt.dto.StockTransactionDto;
import com.tapiwanashembizvo.hilt.models.Branch;
import com.tapiwanashembizvo.hilt.models.Product;
import com.tapiwanashembizvo.hilt.models.enums.StockTransactionType;
import com.tapiwanashembizvo.hilt.repositories.BranchRepository;
import com.tapiwanashembizvo.hilt.repositories.ProductRepository;
import com.tapiwanashembizvo.hilt.services.stock.ProductStockService;
import com.tapiwanashembizvo.hilt.services.stock.StockTransactionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Populating implements CommandLineRunner {

    private final StockTransactionService stockTransactionService;

    private final BranchRepository branchRepository;
    private final ProductRepository productRepository;

    public Populating(StockTransactionService stockTransactionService, BranchRepository branchRepository, ProductRepository productRepository) {
        this.stockTransactionService = stockTransactionService;
        this.branchRepository = branchRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        StockTransactionDto stockTransactionDto = new StockTransactionDto();
        var product = productRepository.findById(2).get();
        var branch = branchRepository.findById(2).get();

        System.out.println("branch::::::::::"+ branch);
        stockTransactionDto.setTransactionDate(LocalDateTime.now());
        stockTransactionDto.setProduct(product);
        stockTransactionDto.setTransactionType(StockTransactionType.RECEIVE);
        stockTransactionDto.setQuantity(100);
        stockTransactionDto.setBranch(branch);

       // stockTransactionService.saveStockTransaction(stockTransactionDto);


    }
}
