package com.samodeika.datastructuresandalgorithms.StackTests;

import com.samodeika.datastructuresandalgorithms.queue.Queue;
import com.samodeika.datastructuresandalgorithms.queue.QueueImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alexander Nikolov on 29.1.2018 г..
 */
public class QueueImplTests {

    private static final Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private Queue<Integer> queue;

    @Before
    public void setUp() {
        this.queue = new QueueImpl<>();
    }

    @Test
    public void addTest() {
        queue.add(intArray[1]);
        queue.add(intArray[2]);
        queue.add(intArray[3]);
        assertEquals(intArray[1], queue.element());
    }

    @Test
    public void elementTest() {
        queue.add(intArray[1]);
        queue.add(intArray[2]);
        queue.add(intArray[3]);
        assertEquals(intArray[1], queue.element());
    }

    @Test
    public void removeTest() {
        queue.add(intArray[1]);
        queue.add(intArray[2]);
        queue.add(intArray[3]);
        assertEquals(intArray[1], queue.remove());
        assertEquals(intArray[2], queue.remove());
        assertEquals(intArray[3], queue.remove());
    }

    @Test
    public void removeEmptyQueueTest() {
        try {
            queue.remove();
        } catch (NoSuchElementException e) {

        }
    }

    @Test
    public void complexTest() {
        queue.add(intArray[1]);
        queue.add(intArray[2]);
        queue.add(intArray[3]);
        queue.add(intArray[4]);
        queue.add(intArray[5]);
        queue.add(intArray[6]);
        queue.add(intArray[7]);
        queue.add(intArray[8]);
        queue.add(intArray[9]);

        assertEquals(intArray[1], queue.remove());
        assertEquals(intArray[2], queue.remove());
        assertEquals(intArray[3], queue.remove());
        assertEquals(intArray[4], queue.remove());
        assertEquals(intArray[5], queue.remove());
        assertEquals(intArray[6], queue.remove());
        assertEquals(intArray[7], queue.remove());
        assertEquals(intArray[8], queue.remove());
        assertEquals(intArray[9], queue.remove());

        queue.add(intArray[0]);
        assertEquals(intArray[0], queue.element());

    }

}
