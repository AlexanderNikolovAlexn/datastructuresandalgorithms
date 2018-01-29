package com.samodeika.datastructuresandalgorithms.queue;

import java.util.NoSuchElementException;

/**
 * Created by Alexander Nikolov on 29.1.2018 г..
 */
public class QueueImpl<T> implements Queue<T> {

    private Node firstElement;
    private Node lastElement;

    @Override
    public boolean add(T element) {
        Node newNode = new Node(element);
        if(this.firstElement == null) {
            this.firstElement = newNode;
            this.lastElement = this.firstElement;
        }
        if(this.firstElement.getNextElement() == null) {
            this.firstElement.setNextElement(newNode);
        }
        this.lastElement.setNextElement(newNode);
        this.lastElement = newNode;
        return true;
    }

    @Override
    public T remove() {
        if(this.firstElement == null) {
            throw new NoSuchElementException();
        }
        Node result = this.firstElement;
        if(this.firstElement.nextElement != null) {
            this.firstElement = this.firstElement.nextElement;
        } else {
            this.firstElement = null;
            this.lastElement = null;
        }
        return result.getValue();
    }

    @Override
    public T element() {
        if(this.firstElement == null) {
            throw new NoSuchElementException();
        }
        return this.firstElement.getValue();
    }

    @Override
    public String toString() {
        return "QueueImpl{" +
                "firstElement=" + firstElement +
                ", lastElement=" + lastElement +
                '}';
    }

    class Node {

        T value;
        Node nextElement;

        public Node(T value) {
            this.value = value;
            this.nextElement = null;
        }

        public Node(T value, Node nextElement) {
            this.value = value;
            this.nextElement = nextElement;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node nextElement) {
            this.nextElement = nextElement;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", nextElement=" + nextElement +
                    '}';
        }
    }

}
