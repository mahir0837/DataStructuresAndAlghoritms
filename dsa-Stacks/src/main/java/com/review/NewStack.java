package com.review;

public class NewStack<T> {

    MySinglyLinkedList<T> list = new MySinglyLinkedList<>();

    void push(T t) {
        list.addFirst(t);
    }

    T pop() {
        return list.removeFirst();
    }


    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size;
    }
}
