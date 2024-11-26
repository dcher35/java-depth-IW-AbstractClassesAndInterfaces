package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicQueueTest {
    //Тест для перевірки методу enqueue() на коректне додавання елементів в чергу
    @Test
    public void testEnqueue() {
        DynamicQueue<Integer> queue = new DynamicQueue<>();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        assertEquals(3, queue.size(), "The queue size should be 3 after adding three elements");
    }

    //Тест для перевірки методу dequeue() на коректне видалення елементу з черги
    @Test
    public void testDequeue() {
        DynamicQueue<Integer> queue = new DynamicQueue<>();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        int removed = queue.dequeue();

        assertEquals(5, removed, "The removed element should be 5");
        assertEquals(2, queue.size(), "The queue size should be 2 after removing one element");
    }

    //Тест для перевірки методу isEmpty() на правильність визначення порожньої черги
    @Test
    public void testIsEmpty() {
        DynamicQueue<Integer> queue = new DynamicQueue<>();
        assertTrue(queue.isEmpty(), "The queue should be empty");

        queue.enqueue(1);
        assertFalse(queue.isEmpty(), "The queue must not be empty after adding an element");

        queue.dequeue();
        assertTrue(queue.isEmpty(), "The queue should be empty after all elements are removed");
    }

    //Тест для перевірки ітератора
    @Test
    public void testQueueIterator() {
        DynamicQueue<Integer> queue = new DynamicQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        DynamicQueue<Integer>.QueueIterator iterator = queue.iterator();
        StringBuilder result = new StringBuilder();

        while (iterator.hasNext()) {
            result.append(iterator.next()).append(" ");
        }

        assertEquals("1 2 3 ", result.toString(), "The iterator must go through all the elements in the correct order");
    }

    //Тест для перевірки методу dequeue() на виняток, якщо черга є порожня
    @Test
    public void testDequeueOnEmptyQueue() {
        DynamicQueue<Integer> queue = new DynamicQueue<>();
        assertThrows(IllegalStateException.class, queue::dequeue, "An exception should be thrown when removing from an empty queue");
    }
}