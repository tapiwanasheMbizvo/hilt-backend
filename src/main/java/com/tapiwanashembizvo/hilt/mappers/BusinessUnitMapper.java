package com.tapiwanashembizvo.hilt.mappers;

import com.tapiwanashembizvo.hilt.dto.BusinessUnitDto;
import com.tapiwanashembizvo.hilt.models.BusinessUnit;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BusinessUnitMapper {

    BusinessUnitMapper INSTANCE = Mappers.getMapper(BusinessUnitMapper.class);

    BusinessUnitDto modelToDto(BusinessUnit businessUnit);

    BusinessUnit dtoModel(BusinessUnitDto businessUnitDto);

}
