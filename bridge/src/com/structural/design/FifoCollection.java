package com.structural.design;

// This is the Abstraction
public interface FifoCollection<T> {
    void offer(T element);

    T poll();
}
