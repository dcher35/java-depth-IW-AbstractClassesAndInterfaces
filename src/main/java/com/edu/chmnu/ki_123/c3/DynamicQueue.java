package com.edu.chmnu.ki_123.c3;

import java.util.ArrayList;

public class DynamicQueue<T> implements Queue<T> {
    private final ArrayList<T> list;

    public DynamicQueue() {
        this.list = new ArrayList<>();
    }

    @Override
    public void enqueue(T element) {
        list.add(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty. Unable to delete item.");
        }
        return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    public class  QueueIterator{
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < list.size();
        }

        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more items in the queue.");
            }
            return list.get(currentIndex++);
        }
    }

    public QueueIterator iterator() {
        return new QueueIterator();
    }
}
