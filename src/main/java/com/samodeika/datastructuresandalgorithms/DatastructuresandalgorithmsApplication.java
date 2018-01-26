package com.samodeika.datastructuresandalgorithms;

import com.samodeika.datastructuresandalgorithms.stack.Stack;
import com.samodeika.datastructuresandalgorithms.stack.StackImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatastructuresandalgorithmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatastructuresandalgorithmsApplication.class, args);

		Stack<Integer> stack = new StackImpl<>();
		System.out.println(stack.isEmpty());
		stack.push(1);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack);
	}
}
