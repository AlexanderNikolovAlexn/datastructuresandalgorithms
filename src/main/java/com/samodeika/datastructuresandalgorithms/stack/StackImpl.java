package com.samodeika.datastructuresandalgorithms.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by Alexander Nikolov on 26.1.2018 г..
 */
public class StackImpl<T> implements Stack<T> {

    private T[] array;
    private int size;
    private static final int INITIAL_ARRAY_SIZE = 2;

    public StackImpl() {
        this.array = (T[])new Object[INITIAL_ARRAY_SIZE];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return this.array[this.size - 1];
    }

    @Override
    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        T element = this.array[this.size - 1];
        this.array[this.size - 1] = null;
        this.size--;
        return element;
    }

    @Override
    public void push(T item) {
        if(this.size == this.array.length) {
            resizeArray(this.array.length * 2);
        }
        this.array[this.size++] = item;
    }

    private void resizeArray(int newLenght){
        T[] newArray = (T[])new Object[newLenght];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    @Override
    public String toString() {
        return "StackImpl{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
