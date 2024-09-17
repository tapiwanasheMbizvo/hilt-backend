package com.tapiwanashembizvo.hilt.controllers;


import com.tapiwanashembizvo.hilt.dto.BusinessUnitDto;
import com.tapiwanashembizvo.hilt.dto.ProductCategoryDto;
import com.tapiwanashembizvo.hilt.services.ProductCategoryService;
import com.tapiwanashembizvo.hilt.services.core.BusinessActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/business-units")

public class BusinessUnitController {


    private final BusinessActivityService businessActivityService;
    private final ProductCategoryService productCategoryService;

    public BusinessUnitController(BusinessActivityService businessActivityService, ProductCategoryService productCategoryService) {
        this.businessActivityService = businessActivityService;
        this.productCategoryService = productCategoryService;
    }

    @GetMapping
    public ResponseEntity<List<BusinessUnitDto>> getBusinessUnits() {

        return ResponseEntity.ok(businessActivityService.getAllBusinessUnits());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<BusinessUnitDto> getSingleBusinessUnit(@PathVariable Integer id){

        return  ResponseEntity.ok(businessActivityService.getSingleBusinessUnit(id));
    }

    @GetMapping("/{id}/product-categories")
    public  ResponseEntity<List<ProductCategoryDto>> getCategoriesForBU(@PathVariable Integer id){

        return  ResponseEntity.ok(productCategoryService.getCategoriesForBu(id));
    }

    @GetMapping("/{id}/product-categories/{catId}")
    public  ResponseEntity<ProductCategoryDto> getCategoryForBU(@PathVariable Integer id, @PathVariable Integer catId){

        return  ResponseEntity.ok(productCategoryService.getCategoryForBu(id, catId));
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

