package edu.mum.pradip;

import java.util.List;

import edu.mum.pradip.libs.Person;
import edu.mum.pradip.libs.Utils;

public class BubbleSort {

	private List<Person> personList;

	public BubbleSort(List<Person> personList) {
		this.personList = personList;
	}

	public List<Person> doSort() {
		for (int i = 0; i < personList.size(); i++) {
			for (int j = 0; j < personList.size() - 1; j++) {
				if (personList.get(j).getAge() > personList.get(j + 1).getAge()) {
					Utils.swap(personList, j, j + 1);
				}
			}
		}

		return personList;
	}
}
