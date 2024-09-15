package com.tapiwanashembizvo.hilt.services.messaging.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BusinessMessage {

    private String receiver;
    private String header;
    private String body;
}
