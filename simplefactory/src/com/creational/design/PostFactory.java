package com.creational.design;

public class PostFactory {

    // some developers not consider simple factory as a design pattern
    // not that: simple factory don't have to be a class it can be a method
    public static Post createPost(String type) {
        return switch (type) {
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            case "blog" -> new BlogPost();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}

