package com.creational.design;

// Represents an abstract product
public interface Instance {
    enum Capacity {
        SMALL, MEDIUM, LARGE
    }

    void start();

    void attachStorage(Storage storage);

    void stop();
}
