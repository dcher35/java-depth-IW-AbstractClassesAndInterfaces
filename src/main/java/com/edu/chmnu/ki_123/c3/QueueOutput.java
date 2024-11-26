package com.edu.chmnu.ki_123.c3;

public class QueueOutput {
    public static void main(String[] args) {
        DynamicQueue<Integer> queue = new DynamicQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue size: " + queue.size());

        System.out.println("Deleting an element: " + queue.dequeue());
        System.out.println("Queue size after deletion: " + queue.size());

        DynamicQueue<Integer>.QueueIterator iterator = queue.iterator();
        System.out.println("Queue elements: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}