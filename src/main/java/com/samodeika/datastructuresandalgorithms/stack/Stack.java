package com.samodeika.datastructuresandalgorithms.stack;

/**
 * Created by Alexander Nikolov on 26.1.2018 г..
 */
public interface Stack<T> {

    boolean isEmpty();
    T peek();
    T pop();
    void push(T item);

}
