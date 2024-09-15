package com.tapiwanashembizvo.hilt.services.messaging.models;




public class BusinessMessage {

    private String receiver;
    private String header;
    private String body;

    public BusinessMessage() {
    }

    public BusinessMessage(String receiver, String header, String body) {
        this.receiver = receiver;
        this.header = header;
        this.body = body;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
