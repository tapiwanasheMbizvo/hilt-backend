package com.tapiwanashembizvo.hilt.services;

import com.tapiwanashembizvo.hilt.dto.ProductCategoryDto;
import com.tapiwanashembizvo.hilt.mappers.ProductCategoryMapper;
import com.tapiwanashembizvo.hilt.repositories.ProductCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductCategoryService {

    private  final ProductCategoryRepository productCategoryRepository;
    private  final ProductCategoryMapper productCategoryMapper;
    public ProductCategoryService(ProductCategoryRepository productCategoryRepository, ProductCategoryMapper productCategoryMapper) {
        this.productCategoryRepository = productCategoryRepository;
        this.productCategoryMapper = productCategoryMapper;
    }

    public List<ProductCategoryDto> getCategoriesForBu(Integer businessUnitId) {

         return  productCategoryRepository.findByBusinessUnitId(businessUnitId).get()
                 .stream().map(productCategoryMapper::modelToDto).collect(Collectors.toList());
    }
}
