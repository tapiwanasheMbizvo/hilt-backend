package com.tapiwanashembizvo.hilt.services;


import com.tapiwanashembizvo.hilt.repositories.BusinessUnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusinessUnitService {

    private final BusinessUnitRepository businessUnitRepository;
}
