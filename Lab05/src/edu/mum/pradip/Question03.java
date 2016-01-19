package edu.mum.pradip;

import java.util.Arrays;

import edu.mum.pradip.libs.Utils;

public class Question03 {

	public static void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];

			int j = i;
			while (j > 0 && temp < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = temp;
		}
	}

	public static void merge(int[] temp, int lower, int upperPointer, int upper) {

		int i = lower, j = upperPointer, mid = upperPointer - 1, k = 0;

		while (i <= mid && j <= upper) {
			if (array[i] <= array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = array[i++];
		}
		while (j <= upper) {
			temp[k++] = array[j++];
		}

		int n = upper - lower + 1;
		for (j = 0; j < n; ++j) {
			array[lower + j] = temp[j];
		}
	}

	public static void mergeSort(int[] array, int lower, int upper) {
		if (lower == upper) {
			return;
		} else {
			int mid = (lower + upper) / 2;

			mergeSort(array, lower, mid);
			mergeSort(array, mid + 1, upper);

			merge(array, lower, mid + 1, upper);
		}
	}

	public static void mergeSortPlus(int[] array) {
		if(array.length <=8){
			mergeSort(array, 0, array.length - 1);
		} else {
			insertionSort(array);
		}
	}

	public static int[] array;

	public static void main(String[] args) {

		int[] data = Utils.generate(50);
		array = Arrays.copyOf(data, data.length);
		int[] array2;
		long startTime, endTime, totalTime;

		array2 = Arrays.copyOf(data, data.length);
		System.out.println("Merge Sort Plus: \nBefore Sorting: " + Arrays.toString(array2));
		startTime = System.nanoTime();
		mergeSortPlus(array2);
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000;
		System.out.println("After Sorting: " + Arrays.toString(array2));
		System.out.println("Time Elapsed: " + totalTime);
		
		System.out.println();
		
		array2 = Arrays.copyOf(data, data.length);
		System.out.println("Merge Sort: \nBefore Sorting: " + Arrays.toString(array2));
		startTime = System.nanoTime();
		mergeSort(array2, 0, array2.length - 1);
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000;
		System.out.println("After Sorting: " + Arrays.toString(array2));
		System.out.println("Time Elapsed: " + totalTime);
	}
}
