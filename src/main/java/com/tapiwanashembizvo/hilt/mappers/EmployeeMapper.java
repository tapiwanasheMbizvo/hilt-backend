package com.tapiwanashembizvo.hilt.mappers;


import com.tapiwanashembizvo.hilt.dto.BranchDto;
import com.tapiwanashembizvo.hilt.dto.EmployeeDto;
import com.tapiwanashembizvo.hilt.models.Branch;
import com.tapiwanashembizvo.hilt.models.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    Employee dtoToModel(EmployeeDto employeeDto);
    EmployeeDto modelToDto (Employee employee);

}
