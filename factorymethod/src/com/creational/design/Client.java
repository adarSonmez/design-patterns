package com.creational.design;

public class Client {
    public static void main(String[] args) {
        printMessage(new TextMessageCreator());
        printMessage(new JSONMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message message = creator.getMessage();
        System.out.println(message.getContent());
    }
}
