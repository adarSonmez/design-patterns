package com.creational.design;

public class S3Storage implements Storage {
    private final String id = "s3";

    S3Storage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on S3 storage");
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "S3 storage with id " + id;
    }
}
