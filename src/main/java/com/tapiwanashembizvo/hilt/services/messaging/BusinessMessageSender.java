package com.tapiwanashembizvo.hilt.services.messaging;

import com.tapiwanashembizvo.hilt.services.messaging.models.BusinessMessage;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BusinessMessageSender {

    private final BusinessCoreMessaging businessCoreEmailMessaging;
    private final BusinessCoreMessaging businessCoreSMSMessaging;

    public BusinessMessageSender(@Qualifier("emailMessaging") BusinessCoreMessaging businessCoreEmailMessaging,
                                 @Qualifier("emailMessaging") BusinessCoreMessaging businessCoreSMSMessaging) {
        this.businessCoreEmailMessaging = businessCoreEmailMessaging;
        this.businessCoreSMSMessaging = businessCoreSMSMessaging;
    }

    public void sendSMS(BusinessMessage businessMessage) {

        businessCoreSMSMessaging.sendMessage(businessMessage);
    }

    public void sendEmail(BusinessMessage businessMessage) {

        businessCoreEmailMessaging.sendMessage(businessMessage);
    }
}

