package com.structural.design;

public class Client {
    public static void main(String[] args) {
        Message message = new TextMessage("<p>Hello World</p>");
        System.out.println(message.getContent());

        message = new HtmlEncodedMessage(message);
        System.out.println(message.getContent());

        Message message2 = new TextMessage("Hello World");

        message2 = new Base64EncodedMessage(message2);
        System.out.println(message2.getContent());
    }
}
