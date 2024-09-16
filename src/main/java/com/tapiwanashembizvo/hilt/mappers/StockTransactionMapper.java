package com.tapiwanashembizvo.hilt.mappers;

import com.tapiwanashembizvo.hilt.dto.StockTransactionDto;
import com.tapiwanashembizvo.hilt.models.StockTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StockTransactionMapper {
    StockTransactionMapper INSTANCE = Mappers.getMapper(StockTransactionMapper.class);

    StockTransaction dtoToModel(StockTransactionDto stockTransactionDto);

    StockTransactionDto modelToDto(StockTransaction stockTransaction);

}
