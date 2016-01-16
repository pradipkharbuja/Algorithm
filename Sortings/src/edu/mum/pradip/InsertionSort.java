package edu.mum.pradip;

import java.util.Arrays;

import edu.mum.pradip.libs.RandomIntegerList;

public class InsertionSort {

	public static void insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int element = array[i];
			int j = i;
			while (j > 0 && element < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = element;
		}
	}

	public static void main(String[] args) {
		int[] array = RandomIntegerList.generate(5);
		long startTime, endTime, time;

		System.out.println(Arrays.toString(array));

		startTime = System.nanoTime();
		insertionSort(array);
		endTime = System.nanoTime();

		System.out.println(Arrays.toString(array));

		time = endTime - startTime;
		System.out.println("Time taken: " + time / 1000);

	}

}
