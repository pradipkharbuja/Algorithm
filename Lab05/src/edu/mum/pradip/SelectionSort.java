package edu.mum.pradip;

import java.util.List;

import edu.mum.pradip.libs.Person;
import edu.mum.pradip.libs.Utils;

//Selection Sort: Find the position of minimum value and change the current position with it
public class SelectionSort {

	private List<Person> personList;

	public SelectionSort(List<Person> personList) {
		this.personList = personList;
	}

	public List<Person> doSort() {

		for (int i = 0; i < personList.size(); i++) {
			Person min = personList.get(i);
			int minIndex = i;
			for (int j = i; j < personList.size(); j++) {
				if (min.getAge() >= personList.get(j).getAge()) {
					min = personList.get(j);
					minIndex = j;
				}
			}
			
			Utils.swap(personList, i, minIndex);
		}

		return personList;
	}

}
