package com.structural.design;

// A concrete implementation
public class SinglyLinkedList<T> implements LinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void addFirst(T element) {
        Node node = new Node();
        node.data = element;
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        Node node = new Node();
        node.data = element;
        node.next = null;
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
        size++;
    }

    @Override
    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) {
            return null;
        }
        return tail.data;
    }

    @Override
    public T removeFirst() {
        if (head == null) {
            return null;
        }
        T element = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return element;
    }

    @Override
    public T removeLast() {
        if (tail == null) {
            return null;
        }
        T element = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node node = head;
            while (node.next != tail) {
                node = node.next;
            }
            node.next = null;
            tail = node;
        }
        size--;
        return element;
    }

    private class Node {
        T data;
        Node next;
    }
}
