package com.creational.design;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message factoryMethod() {
        return new TextMessage();
    }
}
