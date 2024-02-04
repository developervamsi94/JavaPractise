package com.prac.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ListIterationDemo {

	public static void main(String[] args) {
		
		List<String> fruits = List.of("Apple", "Banana", "Grapes");
		
		// Here consumer is a functional interface
		Consumer<String> consumer = name-> System.out.println(name);
		// Function is passed as a parameter to the method.
		fruits.forEach(consumer);

	}

}
