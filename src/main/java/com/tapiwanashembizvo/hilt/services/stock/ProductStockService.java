package com.tapiwanashembizvo.hilt.services.stock;


import com.tapiwanashembizvo.hilt.dto.ProductStockDto;
import com.tapiwanashembizvo.hilt.mappers.ProductStockMapper;
import com.tapiwanashembizvo.hilt.models.ProductStock;
import com.tapiwanashembizvo.hilt.repositories.ProductStockRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductStockService {

    private final ProductStockRepository repository;
    private final ProductStockMapper productStockMapper;

    public ProductStockService(ProductStockRepository repository, ProductStockMapper productStockMapper) {
        this.repository = repository;
        this.productStockMapper = productStockMapper;
    }


    public Integer getCurrentStockValue(Integer productId) {

        return repository.findByProductId(productId).get().getTotalQuantity();
    }

    public ProductStockDto reduceCurrentStock(Integer productId, Integer reducingQuality) {

        ProductStock productStock = repository.findByProductId(productId).get();

        Number currentQ = productStock.getTotalQuantity();
        productStock.setTotalQuantity(currentQ.intValue() - reducingQuality);
        return productStockMapper.modelToDto(repository.save(productStock));
    }


    public ProductStockDto increaseCurrentStock(Integer productId, Integer increasingQuantity) {

        ProductStock productStock = repository.findByProductId(productId).get();

        Number currentQ = productStock.getTotalQuantity();
        productStock.setTotalQuantity(currentQ.intValue() + increasingQuantity);
        return productStockMapper.modelToDto(repository.save(productStock));
    }


}
