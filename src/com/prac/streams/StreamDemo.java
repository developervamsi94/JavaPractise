package com.prac.streams;

import java.util.List;
import java.util.Optional;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = List.of("Apple", "Banana", "Grapes", "Guava");
		Optional<String> fruitsOptional = fruits.stream().filter(name-> name.startsWith("App")).findAny();
		if(fruitsOptional.isPresent()) {
			System.out.println("Fruit name:"+fruitsOptional.get());
		}

	}

}
