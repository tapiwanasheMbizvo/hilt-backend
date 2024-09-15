package com.tapiwanashembizvo.hilt.mappers;


import com.tapiwanashembizvo.hilt.dto.BusinessBranchDto;
import com.tapiwanashembizvo.hilt.models.BusinessBranch;
import org.mapstruct.Mapper;

@Mapper
public interface BusinessBranchMapper {

    BusinessBranch dtoToModel(BusinessBranchDto businessBranchDto);
    BusinessBranchDto modelToDto (BusinessBranch businessBranch);

}
