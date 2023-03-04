package com.creational.design;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {
    private final BlockingDeque<T> availablePool;

    public ObjectPool(Supplier<T> factory, int size) {
        availablePool = new LinkedBlockingDeque<>(size);
        for (int i = 0; i < size; i++) {
            availablePool.add(factory.get());
        }
    }

    public T get() {
        T instance = null;
        try {
            instance = availablePool.take();
        } catch (InterruptedException e) {
            System.err.println("take() interrupted");
        }
        return instance;
    }

    public void release(T instance) {
        instance.reset();
        try {
            availablePool.put(instance);
        } catch (InterruptedException e) {
            System.err.println("put() interrupted");
        }
    }
}
