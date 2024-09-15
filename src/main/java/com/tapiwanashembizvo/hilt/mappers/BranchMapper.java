package com.tapiwanashembizvo.hilt.mappers;


import com.tapiwanashembizvo.hilt.dto.BranchDto;
import com.tapiwanashembizvo.hilt.models.Branch;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BranchMapper {
    BranchMapper INSTANCE = Mappers.getMapper(BranchMapper.class);
    Branch dtoToModel(BranchDto branchDto);
    BranchDto modelToDto (Branch branch);

}
