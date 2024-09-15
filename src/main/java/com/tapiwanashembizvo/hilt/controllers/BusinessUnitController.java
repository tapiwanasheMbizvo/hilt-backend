package com.tapiwanashembizvo.hilt.controllers;


import com.tapiwanashembizvo.hilt.dto.BusinessUnitDto;
import com.tapiwanashembizvo.hilt.services.core.BusinessActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/business-unit")

public class BusinessUnitController {


    private final BusinessActivityService businessActivityService;

    public BusinessUnitController(BusinessActivityService businessActivityService) {
        this.businessActivityService = businessActivityService;
    }

    @GetMapping
    public ResponseEntity<List<BusinessUnitDto>> getBusinessUnits() {

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

