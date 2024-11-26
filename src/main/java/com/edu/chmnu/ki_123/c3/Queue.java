package com.edu.chmnu.ki_123.c3;

public interface Queue<T> {
    void enqueue(T element);
    T dequeue();

    boolean isEmpty();
    int size();
}