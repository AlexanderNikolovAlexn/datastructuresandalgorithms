package com.samodeika.datastructuresandalgorithms.queue;

/**
 * Created by Alexander Nikolov on 29.1.2018 г..
 */
public interface Queue<T> {

    boolean add(T t);
    T remove();
    T element();

}
