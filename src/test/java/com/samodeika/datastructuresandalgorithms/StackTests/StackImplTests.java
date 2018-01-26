package com.samodeika.datastructuresandalgorithms.StackTests;

import com.samodeika.datastructuresandalgorithms.stack.Stack;
import com.samodeika.datastructuresandalgorithms.stack.StackImpl;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by Alexander Nikolov on 26.1.2018 г..
 */
public class StackImplTests {

    private static final Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void regularTest() {
        Stack<Integer> stack = new StackImpl<>();
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

}
