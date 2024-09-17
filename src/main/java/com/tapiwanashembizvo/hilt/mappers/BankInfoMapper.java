package com.tapiwanashembizvo.hilt.mappers;


import com.tapiwanashembizvo.hilt.dto.BankingInfoDto;
import com.tapiwanashembizvo.hilt.models.BankingInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BankInfoMapper {
    BankInfoMapper INSTANCE = Mappers.getMapper(BankInfoMapper.class);
    BankingInfo dtoToModel(BankingInfoDto bankingInfoDto);
    BankingInfoDto modelToDto (BankingInfo bankingInfo);

}
