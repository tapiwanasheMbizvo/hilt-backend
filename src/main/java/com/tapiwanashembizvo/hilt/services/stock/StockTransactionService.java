package com.tapiwanashembizvo.hilt.services.stock;

import com.tapiwanashembizvo.hilt.dto.StockTransactionDto;
import com.tapiwanashembizvo.hilt.mappers.StockTransactionMapper;
import com.tapiwanashembizvo.hilt.repositories.StockTransactionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.tapiwanashembizvo.hilt.models.enums.StockTransactionType.RECEIVE;
import static com.tapiwanashembizvo.hilt.models.enums.StockTransactionType.SELL;

@Service
public class StockTransactionService {

    private final StockTransactionMapper stockTransactionMapper;

    private final StockTransactionRepository stockTransactionRepository;

    private final ProductStockService productStockService;

    public StockTransactionService(StockTransactionMapper stockTransactionMapper,
                                   StockTransactionRepository stockTransactionRepository,
                                   ProductStockService productStockService) {
        this.stockTransactionMapper = stockTransactionMapper;
        this.stockTransactionRepository = stockTransactionRepository;
        this.productStockService = productStockService;
    }

    @Transactional
    public StockTransactionDto saveStockTransaction(StockTransactionDto stockTransactionDto) {

        Integer stockTransactionDtoQuantity =stockTransactionDto.getQuantity();
        if (stockTransactionDto.getStockTransactionType().equals(SELL)) {

            Integer currentStockValue = productStockService.getCurrentStockValue(stockTransactionDto.getProduct().getId());
            if (currentStockValue > stockTransactionDtoQuantity) {

                productStockService.reduceCurrentStock(stockTransactionDto.getProduct().getId(), stockTransactionDtoQuantity);

            } else {
                throw new RuntimeException("Insufficient Stock to effect Sale");
            }
        } else if (stockTransactionDto.getStockTransactionType().equals(RECEIVE)) {

            productStockService.increaseCurrentStock(stockTransactionDto.getProduct().getId(), stockTransactionDtoQuantity);
        }
        return stockTransactionMapper
                .modelToDto(stockTransactionRepository
                        .save(stockTransactionMapper.dtoToModel(stockTransactionDto)));


    }

    public List<StockTransactionDto> getTransactionsForBranch(Integer branchId) {
        return stockTransactionRepository.findByBranchId(branchId).stream().map(stockTransactionMapper::modelToDto).collect(Collectors.toList());
    }
}
