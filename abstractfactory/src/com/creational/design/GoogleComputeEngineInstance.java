package com.creational.design;

public class GoogleComputeEngineInstance implements Instance{
    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created " + capacity + " Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Starting Google Compute Engine instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attaching " + storage + " to Google Compute Engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Google Compute Engine instance");
    }

    @Override
    public String toString() {
        return "Google Compute Engine instance";
    }
}
