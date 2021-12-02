package com.roytuts.java.foreach.lambda.expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaForEachExample {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(5);
		integers.add(7);
		integers.add(11);

		System.out.println("Iterating over List");
		System.out.println("-------------------");
		System.out.println();

		System.out.println("Accessing elements without using stream API");
		System.out.println("Print elements using method reference:");
		integers.forEach(System.out::println);

		System.out.println("Printing elements after multiplying each element by 2: ");
		integers.forEach(i -> System.out.print((i * 2) + ","));

		System.out.println("\n");

		System.out.println("Accessing elements using stream API");

		System.out.println("Print elements using method reference:");
		integers.stream().forEach(System.out::println);

		System.out.println("Printing elements after multiplying each element by 2: ");

		integers.stream().forEach(i -> System.out.print((i * 2) + ","));

		System.out.println();
		System.out.println("Printing elements using parallel stream, order is not guranteed: ");

		integers.parallelStream().forEach(i -> System.out.print((i * 2) + ","));

		System.out.println("\n");

		System.out.println("Iterating over Map");
		System.out.println("------------------");
		System.out.println();

		Map<String, String> map = new HashMap<>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		map.put("d", "D");
		map.put("e", "E");
		map.put("f", "F");
		map.put("g", "G");

		System.out.println("Print map elements");

		map.forEach((k, v) -> System.out.print(k + " : " + v + ", "));
	}

}
