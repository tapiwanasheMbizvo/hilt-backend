/*
package com.tapiwanashembizvo.hilt.controllers;


import com.tapiwanashembizvo.hilt.dto.BusinessUnitDto;
import com.tapiwanashembizvo.hilt.services.ProductActivityService;
import com.tapiwanashembizvo.hilt.services.core.BusinessActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/product-categories")

public class ProductCategoryController {


    private final ProductActivityService productActivityService;

    public ProductCategoryController(ProductActivityService productActivityService) {
        this.productActivityService = productActivityService;
    }

    @GetMapping
    public ResponseEntity<List<BusinessUnitDto>> getAllProductCatego() {

        return ResponseEntity.ok(businessActivityService.getAllBusinessUnits());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<BusinessUnitDto> getSingleBusinessUnit(@PathVariable Integer id){

        return  ResponseEntity.ok(businessActivityService.getSingleBusinessUnit(id));
    }


    @PostMapping
    public  ResponseEntity<BusinessUnitDto> saveOneBusinessUnit(@RequestBody BusinessUnitDto businessUnitDto){

        return  ResponseEntity.ok(businessActivityService.createBusinessUnit(businessUnitDto));
    }


    @DeleteMapping("/{id}")
    public void  deleteBusinessUnit(@PathVariable Integer id){

        businessActivityService.deleteBusinessUnit(id);
    }

    @PutMapping
    public  ResponseEntity<BusinessUnitDto> updateBusinessUnit(@RequestBody BusinessUnitDto businessUnitDto){

        return  ResponseEntity.ok(businessActivityService.updateBusinessUnit(businessUnitDto));
    }


}

*/
