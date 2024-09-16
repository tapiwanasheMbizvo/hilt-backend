package com.tapiwanashembizvo.hilt.mappers;

import com.tapiwanashembizvo.hilt.dto.ProductStockDto;
import com.tapiwanashembizvo.hilt.dto.StockTransactionDto;
import com.tapiwanashembizvo.hilt.models.ProductStock;
import com.tapiwanashembizvo.hilt.models.StockTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductStockMapper {
    ProductStockMapper INSTANCE = Mappers.getMapper(ProductStockMapper.class);

    ProductStock dtoToModel(ProductStockDto productStockDto);

    ProductStockDto modelToDto(ProductStock productStock);

}
