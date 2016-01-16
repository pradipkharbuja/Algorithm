package edu.mum;

import java.util.Random;

public class Utils {
	public static int[] generateRandom(int n) {
		int[] array = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(100);
		}
		return array;
	}
}
