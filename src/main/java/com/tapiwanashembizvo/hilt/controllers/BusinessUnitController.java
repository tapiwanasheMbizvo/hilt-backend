package com.tapiwanashembizvo.hilt.controllers;


import com.tapiwanashembizvo.hilt.dto.BusinessUnitDto;
import com.tapiwanashembizvo.hilt.services.core.BusinessActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
