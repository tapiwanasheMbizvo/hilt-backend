package com.tapiwanashembizvo.hilt.services.messaging;

import com.tapiwanashembizvo.hilt.services.messaging.models.BusinessMessage;

public interface BusinessCoreMessaging {

    void sendMessage(BusinessMessage businessMessage);

}
