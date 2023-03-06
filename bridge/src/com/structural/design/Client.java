package com.structural.design;

public class Client {
    public static void main(String[] args) {
        FifoCollection<Integer> queue = new Queue<>(new SinglyLinkedList<>());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
