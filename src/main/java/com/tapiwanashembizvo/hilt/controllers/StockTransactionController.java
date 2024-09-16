package com.tapiwanashembizvo.hilt.controllers;


import com.tapiwanashembizvo.hilt.dto.StockTransactionDto;
import com.tapiwanashembizvo.hilt.services.stock.StockTransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/stock-transactions")
public class StockTransactionController {

    private final StockTransactionService stockTransactionService;

    public StockTransactionController(StockTransactionService stockTransactionService) {
        this.stockTransactionService = stockTransactionService;
    }

    @GetMapping("/branch/{id}")
    public ResponseEntity<List<StockTransactionDto>> getStockTransactionsForBranch(@PathVariable Integer id) {

        return ResponseEntity.ok(stockTransactionService.getTransactionsForBranch(id));

    }

    @PostMapping
    public  ResponseEntity<StockTransactionDto> saveStockTransaction(@RequestBody StockTransactionDto stockTransactionDto){

        return  ResponseEntity.ok(stockTransactionService.saveStockTransaction(stockTransactionDto));
    }
}
