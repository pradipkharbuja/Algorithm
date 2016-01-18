package edu.mum.pradip;

import java.util.ArrayList;
import java.util.List;

import edu.mum.pradip.libs.Person;

public class QuickSort {

	public static int partition(List<Person> listPerson, int left, int right) {
		int i = left, j = right;
		Person pivotPerson = listPerson.get((left + right) / 2);

		while (i <= j) {
			while (listPerson.get(i).getId() < pivotPerson.getId()) {
				i++;
			}
			while (listPerson.get(j).getId() > pivotPerson.getId()) {
				j--;
			}

			Person pivot = listPerson.get(i);
			listPerson.set(i, listPerson.get(j));
			listPerson.set(j, pivot);
			i++;
			j--;
		}
		return i;
	}

	public static void doQuickSort(List<Person> listPerson, int left, int right) {
		int index = partition(listPerson, left, right);
		if (left < index - 1) {
			doQuickSort(listPerson, left, index - 1);
		}
		if (index < right) {
			doQuickSort(listPerson, index, right);
		}
	}

	public static void main(String[] args) {
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(new Person(10, "Mark"));
		listPerson.add(new Person(10, "Emily"));
		listPerson.add(new Person(10, "Steve"));
		listPerson.add(new Person(5, "Bill"));

		System.out.println(listPerson);
		System.out.println();

		doQuickSort(listPerson, 0, listPerson.size() - 1);

		System.out.println(listPerson);
	}
}
