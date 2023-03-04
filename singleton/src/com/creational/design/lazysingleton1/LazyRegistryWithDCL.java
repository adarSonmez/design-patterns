package com.creational.design.lazysingleton1;

// Lazy Initialization with Double-Checked Locking
public class LazyRegistryWithDCL {
    // volatile keyword guarantees that value of the volatile variable will always be read from
    // main memory and not from Thread's local cache.
    private static volatile LazyRegistryWithDCL INSTANCE;

    private LazyRegistryWithDCL() {
    }

    public static LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class) {
                // Double-Checked Locking
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
