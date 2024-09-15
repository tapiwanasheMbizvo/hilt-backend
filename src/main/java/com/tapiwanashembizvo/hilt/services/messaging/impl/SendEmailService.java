package com.tapiwanashembizvo.hilt.services.messaging.impl;


import com.tapiwanashembizvo.hilt.services.messaging.BusinessCoreMessaging;
import com.tapiwanashembizvo.hilt.services.messaging.models.BusinessMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service

public class SendEmailService implements BusinessCoreMessaging {
    @Override
    public void sendMessage(BusinessMessage businessMessage) {

        System.out.printf("sending email");
    }
}
