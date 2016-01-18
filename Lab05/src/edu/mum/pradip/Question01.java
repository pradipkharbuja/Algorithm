package edu.mum.pradip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.mum.pradip.libs.Person;

public class Question01 {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(5, "John"));
		list.add(new Person(5, "Adam"));
		list.add(new Person(1, "Marie"));

		List<Person> personList = new ArrayList<>(list);
		System.out.println("Before sorting: " + personList);
		System.out.println();
		
		long startTime;
		
		Collections.copy(personList, list);
		startTime = System.nanoTime();		
		System.out.println("After sorting: " +new BubbleSort(personList).doSort());
		System.out.println("Time Elapsed: " + (System.nanoTime() - startTime) / 1000);
		System.out.println();
		
		Collections.copy(personList, list);
		startTime = System.nanoTime();		
		System.out.println("After sorting: " +new SelectionSort(personList).doSort());
		System.out.println("Time Elapsed: " + (System.nanoTime() - startTime) / 1000);
		System.out.println();
		
		Collections.copy(personList, list);
		startTime = System.nanoTime();		
		System.out.println("After sorting: " +new InsertionSort(personList).doSort());
		System.out.println("Time Elapsed: " + (System.nanoTime() - startTime) / 1000);
		System.out.println();
	}

}
