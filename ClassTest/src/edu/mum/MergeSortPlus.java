package edu.mum;

import java.util.Arrays;

public class MergeSortPlus {

	int[] theArray; // this array is populated with two sorted sections of ints
	int comparison;	//stores the number of comparison

	public void merge(int[] tempStorage, int lowerPointer, int upperPointer,
			int upperBound) {
		int j = 0; // tempStorage index
		int lowerBound = lowerPointer;
		// total number of elements to rearrange
		int n = upperBound - lowerBound + 1;
		// view the range [lowerBound,upperBound] as two arrays
		// [lowerBound, mid], [mid+1,upperBound] to be merged
		int mid = upperPointer - 1;
		while (lowerPointer <= mid && upperPointer <= upperBound) {
		
			//counting the number of comparison			
			comparison++;
			
			if (theArray[lowerPointer] <= theArray[upperPointer]) {
				tempStorage[j++] = theArray[lowerPointer++];
			} else {
				tempStorage[j++] = theArray[upperPointer++];
			}
		}// left array may still have elements
		while (lowerPointer <= mid) {
			tempStorage[j++] = theArray[lowerPointer++];
		}
		// right array may still have elements
		while (upperPointer <= upperBound) {
			tempStorage[j++] = theArray[upperPointer++];
		}
		// replace the range [lowerBound,upperBound] in theArray with
		// the range [0,n-1] just created in tempStorage
		for (j = 0; j < n; ++j) {
			theArray[lowerBound + j] = tempStorage[j];
		}
	}

	// public sorter
	public int[] sort(int[] input) {
		int n = input.length;
		int[] tempStorage = new int[n];
		theArray = input;
		mergeSort(tempStorage, 0, n - 1);

		//Displaying the number of comparison
		System.out.println("No. of comparision: " + comparison);
		return theArray;
	}

	void mergeSort(int[] temp, int lower, int upper) {
		if (lower == upper) {
			return;
		} else {
			int mid = (lower + upper) / 2;
			mergeSort(temp, lower, mid);
			mergeSort(temp, mid + 1, upper);
			merge(temp, lower, mid + 1, upper);
		}
	}

	//Finding the number of inversion
	public int countNumberOfInversion(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] array = {20, 5, 9, 22};

		System.out.println(Arrays.toString(array));

		MergeSortPlus mergeSortPlus = new MergeSortPlus();
		System.out.println("No. of Inversion: "
				+ mergeSortPlus.countNumberOfInversion(array));

		mergeSortPlus.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
