package com.tapiwanashembizvo.hilt.services.stock;


import com.tapiwanashembizvo.hilt.dto.ProductDto;
import com.tapiwanashembizvo.hilt.mappers.ProductMapper;
import com.tapiwanashembizvo.hilt.models.Product;
import com.tapiwanashembizvo.hilt.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private  final ProductRepository repository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository repository, ProductMapper productMapper) {
        this.repository = repository;
        this.productMapper = productMapper;
    }


    public ProductDto getProductDto(Integer id){
        return  productMapper.modelToDto(repository.findById(id).get());
    }

    public Optional<Product> getProduct(Integer id){
        return  repository.findById(id);
    }
}
