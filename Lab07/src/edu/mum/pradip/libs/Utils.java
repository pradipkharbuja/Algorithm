package edu.mum.pradip.libs;

import java.util.Random;

public class Utils {

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static int[] generateRandom(int n) {
		int[] array = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(100);
		}
		return array;
	}
}
