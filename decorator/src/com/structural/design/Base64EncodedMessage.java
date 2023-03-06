package com.structural.design;

public class Base64EncodedMessage implements Message {
    private Message msg;

    public Base64EncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return base64Encode(msg.getContent());
    }

    private String base64Encode(String content) {
        return java.util.Base64.getEncoder().encodeToString(content.getBytes());
    }
}
