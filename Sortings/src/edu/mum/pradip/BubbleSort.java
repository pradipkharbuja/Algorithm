package edu.mum.pradip;

import java.util.Arrays;

import edu.mum.pradip.libs.RandomIntegerList;
import edu.mum.pradip.libs.Utils;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					Utils.swap(array, j, j + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = RandomIntegerList.generate(5);
		long startTime, endTime, time;

		System.out.println(Arrays.toString(array));

		startTime = System.nanoTime();
		bubbleSort(array);
		endTime = System.nanoTime();

		System.out.println(Arrays.toString(array));

		time = endTime - startTime;
		System.out.println("Time taken: " + time / 1000);

	}

}
