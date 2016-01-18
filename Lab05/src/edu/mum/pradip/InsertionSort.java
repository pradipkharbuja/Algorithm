package edu.mum.pradip;

import java.util.List;

import edu.mum.pradip.libs.Person;

public class InsertionSort {
	private List<Person> personList;

	public InsertionSort(List<Person> personList) {
		this.personList = personList;
	}

	public List<Person> doSort() {

		for(int i = 0; i < personList.size(); i++){
			Person temp = personList.get(i);
			
			int j = i;			
			while(j > 0 && temp.getAge() < personList.get(j - 1).getAge()){
				personList.set( j, personList.get(j - 1));
				j--;
			}
			
			personList.set(j, temp);
		}

		return personList;
	}
}
