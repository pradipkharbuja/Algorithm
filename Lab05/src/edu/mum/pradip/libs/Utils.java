package edu.mum.pradip.libs;

import java.util.List;
import java.util.Random;

public class Utils {

	public static void swap(List<Person> list, int i, int j) {
		if (i != j) {
			Person temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}

	public static int[] generate(int n) {
		int[] array = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(100);
		}
		return array;
	}
}
