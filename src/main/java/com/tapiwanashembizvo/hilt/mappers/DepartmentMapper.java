package com.tapiwanashembizvo.hilt.mappers;

import com.tapiwanashembizvo.hilt.dto.BankingInfoDto;
import com.tapiwanashembizvo.hilt.dto.DepartmentDto;

import com.tapiwanashembizvo.hilt.models.BankingInfo;
import com.tapiwanashembizvo.hilt.models.Department;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {
    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
    BankingInfo map(BankingInfoDto value);
    Department dtoToModel(DepartmentDto departmentDto);
    DepartmentDto modelToDto (Department department);

}
