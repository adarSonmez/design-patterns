package com.structural.design;

public class HtmlEncodedMessage implements Message {
    private Message msg;

    public HtmlEncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return htmlEncode(msg.getContent());
    }

    private String htmlEncode(String content) {
        return content.replace("<", "&lt;").replace(">", "&gt;");
    }
}
