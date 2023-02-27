package com.creational.design;

public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message factoryMethod() {
        return new JSONMessage();
    }
}
