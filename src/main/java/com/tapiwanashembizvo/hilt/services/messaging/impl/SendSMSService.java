package com.tapiwanashembizvo.hilt.services.messaging.impl;


import com.tapiwanashembizvo.hilt.services.messaging.BusinessCoreMessaging;
import com.tapiwanashembizvo.hilt.services.messaging.models.BusinessMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SendSMSService implements BusinessCoreMessaging {
    @Override
    public void sendMessage(BusinessMessage businessMessage) {

        log.info("Sending SMS to " + businessMessage.getReceiver());
    }
}
