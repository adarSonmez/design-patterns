package com.creational.design;

public class GoogleCloudStorage implements Storage {
    private final String id = "gcs";

    GoogleCloudStorage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Google Cloud Storage with id " + id;
    }
}
