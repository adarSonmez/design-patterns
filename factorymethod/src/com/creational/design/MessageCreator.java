package com.creational.design;

public abstract class MessageCreator {
    public abstract Message factoryMethod();

    public Message getMessage() {
        Message message = factoryMethod();
        message.addDefaultHeader();
        message.encrypt();
        return message;
    }
}
