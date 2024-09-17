package com.tapiwanashembizvo.hilt.mappers;

import com.tapiwanashembizvo.hilt.dto.BusinessUnitDto;
import com.tapiwanashembizvo.hilt.dto.DepartmentDto;
import com.tapiwanashembizvo.hilt.models.BusinessUnit;
import com.tapiwanashembizvo.hilt.models.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BusinessUnitMapper {

    BusinessUnitMapper INSTANCE = Mappers.getMapper(BusinessUnitMapper.class);

    Department dtoToModel(DepartmentDto departmentDto);
    DepartmentDto modelToDto (Department department);
    BusinessUnitDto modelToDto(BusinessUnit businessUnit);

    BusinessUnit dtoModel(BusinessUnitDto businessUnitDto);

}
