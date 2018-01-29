package com.samodeika.datastructuresandalgorithms;

import com.samodeika.datastructuresandalgorithms.queue.Queue;
import com.samodeika.datastructuresandalgorithms.queue.QueueImpl;
import com.samodeika.datastructuresandalgorithms.stack.Stack;
import com.samodeika.datastructuresandalgorithms.stack.StackImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatastructuresandalgorithmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatastructuresandalgorithmsApplication.class, args);

		//Stack examples
//		Stack<Integer> stack = new StackImpl<>();
//		System.out.println(stack.isEmpty());
//		stack.push(1);
//		System.out.println(stack.peek());
//		System.out.println(stack.isEmpty());
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
//		System.out.println(stack);

	    //Queue examples
        Queue<Integer> queue = new QueueImpl<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        System.out.println("Element method: " + queue.element());
        System.out.println("Remove method: " + queue.remove());
        System.out.println(queue);
        System.out.println("Remove method: " + queue.remove());
        System.out.println(queue);
	}
}
