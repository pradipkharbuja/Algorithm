package edu.mum.pradip;

import java.util.ArrayList;
import java.util.List;

import edu.mum.pradip.libs.Person;

public class SelectionSortPerson {

	private static List<Person> list = new ArrayList<>();

	public static int minValuePosition(int startIndex, int length) {
		Person person = list.get(startIndex);
		int minValueIndex = startIndex;

		for (int i = startIndex + 1; i < length; i++) {
			//Making the algorithm stable
			if (list.get(i).getId() < person.getId()) {
				person = list.get(i);
				minValueIndex = i;
			}
		}
		return minValueIndex;
	}

	public static void selectionSort() {
		for (int i = 0; i < list.size(); i++) {
			int nextMinPos = minValuePosition(i, list.size() - 1);
			swap(i, nextMinPos);
		}
	}

	public static void swap(int i, int j) {
		Person temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	public static void main(String[] args) {

		list.add(new Person(20, "Ronaldo"));
		list.add(new Person(10, "John"));
		list.add(new Person(20, "Messi"));
		list.add(new Person(30, "Rooney"));

		long startTime, endTime, time;

		System.out.println(list);

		startTime = System.nanoTime();
		selectionSort();
		endTime = System.nanoTime();

		System.out.println(list);

		time = endTime - startTime;
		System.out.println("Time taken: " + time / 1000);

	}

}
