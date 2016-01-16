package edu.mum.pradip;

import java.util.Arrays;

import edu.mum.pradip.libs.RandomIntegerList;
import edu.mum.pradip.libs.Utils;

public class SelectionSort {

	public static int minValuePosition(int[] array, int startIndex, int length) {
		int minValue = array[startIndex];
		int minValueIndex = startIndex;

		for (int i = startIndex + 1; i < length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				minValueIndex = i;
			}
		}
		return minValueIndex;
	}

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int nextMinPos = minValuePosition(array, i, array.length);
			Utils.swap(array, i, nextMinPos);
		}
	}

	public static void main(String[] args) {
		int[] array = RandomIntegerList.generate(5);
		long startTime, endTime, time;

		System.out.println(Arrays.toString(array));

		startTime = System.nanoTime();
		selectionSort(array);
		endTime = System.nanoTime();

		System.out.println(Arrays.toString(array));

		time = endTime - startTime;
		System.out.println("Time taken: " + time / 1000);

	}

}
