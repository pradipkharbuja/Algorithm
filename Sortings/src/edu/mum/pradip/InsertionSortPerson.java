package edu.mum.pradip;

import java.util.ArrayList;
import java.util.List;

import edu.mum.pradip.libs.Person;

public class InsertionSortPerson {

	private static List<Person> list = new ArrayList<>();

	public static void insertionSort() {

		for (int i = 1; i < list.size(); i++) {
			Person person = list.get(i);
			int j = i;
			while (j > 0 && person.getId() < list.get(j - 1).getId()) {
				list.set(j, list.get(j - 1));				
				j--;
			}
			list.set(j, person);
		}
	}

	public static void main(String[] args) {

		list.add(new Person(20, "Ronaldo"));
		list.add(new Person(10, "John"));
		list.add(new Person(20, "Messi"));
		list.add(new Person(30, "Rooney"));

		long startTime, endTime, time;

		System.out.println(list);

		startTime = System.nanoTime();
		insertionSort();
		endTime = System.nanoTime();

		System.out.println(list);

		time = endTime - startTime;
		System.out.println("Time taken: " + time / 1000);

	}

}
