package edu.mum.pradip.libs;

import java.util.List;

public class Utils {

	public static void swap(List<Person> list, int i, int j) {
		if (i != j) {
			Person temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}
}
