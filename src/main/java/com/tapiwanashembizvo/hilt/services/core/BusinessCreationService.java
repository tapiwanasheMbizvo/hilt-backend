package com.tapiwanashembizvo.hilt.services.core;


import com.tapiwanashembizvo.hilt.dto.BusinessUnitDto;
import com.tapiwanashembizvo.hilt.mappers.BusinessUnitMapper;
import com.tapiwanashembizvo.hilt.models.BusinessUnit;
import com.tapiwanashembizvo.hilt.repositories.BusinessUnitRepository;
import com.tapiwanashembizvo.hilt.services.core.exception.BusinessNameEmailCombinationExistsException;
import com.tapiwanashembizvo.hilt.services.messaging.BusinessCoreMessaging;
import com.tapiwanashembizvo.hilt.services.messaging.BusinessMessageSender;
import com.tapiwanashembizvo.hilt.services.messaging.models.BusinessMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BusinessCreationService {

    private final BusinessUnitRepository businessUnitRepository;
    private final BusinessUnitMapper businessUnitMapper;
    private final BusinessMessageSender businessMessageSender;


    public BusinessCreationService(BusinessUnitRepository businessUnitRepository,
                                   BusinessUnitMapper businessUnitMapper,
                                   BusinessMessageSender businessMessageSender) {
        this.businessUnitRepository = businessUnitRepository;
        this.businessUnitMapper = businessUnitMapper;
        this.businessMessageSender = businessMessageSender;
    }

    public BusinessUnitDto createBusinessUnit(BusinessUnitDto businessUnitDto) throws BusinessNameEmailCombinationExistsException {


        var byBusinessNameAndBusinessEmail = businessUnitRepository
                .findByBusinessNameAndBusinessEmail(
                        businessUnitDto.getBusinessEmail(), businessUnitDto.getBusinessName()
                );

        if (byBusinessNameAndBusinessEmail.isEmpty()) {
            var savedBusinessUnit = businessUnitRepository.save(businessUnitMapper.dtoModel(businessUnitDto));

            var businessMessage = new BusinessMessage();
            businessMessage.setBody("Business Account has been created !!!");
            businessMessage.setHeader("Congratulations and Welcome");
            businessMessage.setReceiver(businessUnitDto.getBusinessPhone());

            businessMessageSender.sendSMS(businessMessage);
            return businessUnitMapper.modelToDto(savedBusinessUnit);

        } else {
            throw new BusinessNameEmailCombinationExistsException("Business with that name and Email combination already exists");
        }

    }
}
