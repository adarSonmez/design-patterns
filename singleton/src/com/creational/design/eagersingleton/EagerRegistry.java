package com.creational.design.eagersingleton;

public class EagerRegistry {
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    private EagerRegistry() {
    }

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}
