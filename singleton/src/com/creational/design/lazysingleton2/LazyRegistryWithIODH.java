package com.creational.design.lazysingleton2;

// Lazy Initialization with Inner-Static Holder
public class LazyRegistryWithIODH {
    private LazyRegistryWithIODH() {
    }

    private static class RegistryHolder {
        private static final LazyRegistryWithIODH INSTANCE = new LazyRegistryWithIODH();
    }

    public static LazyRegistryWithIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
