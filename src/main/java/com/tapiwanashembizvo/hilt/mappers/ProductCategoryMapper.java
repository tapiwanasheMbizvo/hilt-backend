package com.tapiwanashembizvo.hilt.mappers;

import com.tapiwanashembizvo.hilt.dto.ProductCategoryDto;
import com.tapiwanashembizvo.hilt.models.ProductCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductCategoryMapper {
    ProductCategoryMapper INSTANCE = Mappers.getMapper(ProductCategoryMapper.class);
    ProductCategory dtoToModel(ProductCategoryDto productCategoryDto);
    ProductCategoryDto modelToDto (ProductCategory productCategory);

}
