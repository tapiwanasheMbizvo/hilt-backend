package com.tapiwanashembizvo.hilt.mappers;

import com.tapiwanashembizvo.hilt.dto.ProductCategoryDto;
import com.tapiwanashembizvo.hilt.dto.ProductDto;
import com.tapiwanashembizvo.hilt.models.Product;
import com.tapiwanashembizvo.hilt.models.ProductCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product dtoToModel(ProductDto productDto);
    ProductDto modelToDto (Product product);

}
