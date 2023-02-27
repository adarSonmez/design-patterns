package com.creational.design;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityMib) {
        return new GoogleCloudStorage(capacityMib);
    }
}
