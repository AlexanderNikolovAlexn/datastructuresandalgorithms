package com.samodeika.datastructuresandalgorithms.StackTests;

import com.samodeika.datastructuresandalgorithms.stack.Stack;
import com.samodeika.datastructuresandalgorithms.stack.StackImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * Created by Alexander Nikolov on 26.1.2018 г..
 */
public class StackImplTests {

    private static final Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    private Stack<Integer> stack;

    @Before
    public void setUp() {
       this.stack = new StackImpl<>();
    }

    @Test
    public void complexTest() {
        assertEquals(true, stack.isEmpty());
        stack.push(intArray[1]);
        assertEquals(false, stack.isEmpty());
        assertEquals(intArray[1], stack.peek());
        assertEquals(false, stack.isEmpty());
        stack.push(intArray[1]);
        stack.push(intArray[1]);
        stack.push(intArray[1]);
        assertEquals(false, stack.isEmpty());
        assertEquals(intArray[1], stack.pop());
        assertEquals(intArray[1], stack.pop());
        assertEquals(intArray[1], stack.pop());
        assertEquals(intArray[1], stack.pop());
    }

    @Test
    public void isEmptyTest(){
        Stack<Integer> stack = new StackImpl<>();
        assertEquals(true, stack.isEmpty());
        stack.push(intArray[1]);
        assertEquals(false, stack.isEmpty());
        assertEquals(intArray[1], stack.peek());
        assertEquals(false, stack.isEmpty());
        stack.push(intArray[1]);
        assertEquals(false, stack.isEmpty());
        assertEquals(intArray[1], stack.pop());
        assertEquals(intArray[1], stack.pop());
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void peekTest() {
        stack.push(intArray[6]);
        assertEquals(intArray[6], stack.peek());
    }

    @Test
    public void popTest() {
        stack.push(intArray[6]);
        assertEquals(intArray[6], stack.pop());
    }

    @Test
    public void pushTest() {
        stack.push(intArray[6]);
        stack.push(intArray[6]);
        stack.push(intArray[6]);
        assertEquals(3, stack.getSize());
    }

    @Test
    public void getSizeTest() {
        stack.push(intArray[6]);
        stack.push(intArray[6]);
        stack.push(intArray[6]);
        assertEquals(3, stack.getSize());
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(0, stack.getSize());
    }

    @Test
    public void popEmptyStackTest() {
        stack.push(intArray[2]);
        stack.pop();
        try {
            stack.pop();
        } catch (EmptyStackException e) {

        }
    }

}
