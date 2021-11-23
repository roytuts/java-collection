package com.roytuts.java.hashset.unique.objects;

import java.util.HashSet;
import java.util.Set;

public class HashsetApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(1000, "Liton", "Falakata");
		Employee e2 = new Employee(1001, "Liton", "Falakata");
		Employee e3 = new Employee(1000, "Liton", "Falakata");
		Employee e4 = new Employee(1003, "Debabrata", "Birati");
		Employee e5 = new Employee(1000, "Souvik", "Kalighat");

		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);

		// for (Employee employee : set) {
		// System.out.println(employee);
		// }

		set.stream().forEach(s -> System.out.println(s));
	}

}
