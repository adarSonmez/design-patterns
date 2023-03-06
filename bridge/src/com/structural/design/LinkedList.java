package com.structural.design;

// this is implementor
public interface LinkedList<T> {

    void addFirst(T element);

    void addLast(T element);

    T getFirst();

    T getLast();

    T removeFirst();

    T removeLast();
}
