package edu.mum.pradip;

import edu.mum.pradip.libs.Utils;

public class QuickSort {

	private int getRandomPivot(int[] array, int startIndex, int endIndex) {
		int randomPivot = startIndex + (int) Math.floor(Math.random() * (endIndex - startIndex));
		Utils.swap(array, randomPivot, endIndex);
		return endIndex;
	}

	private int partition(int[] array, int startIndex, int endIndex) {
		int pivot = getRandomPivot(array, startIndex, endIndex);
		int wall = startIndex;
		for (int i = startIndex; i <= endIndex; i++) {
			if (array[i] < array[pivot]) {
				Utils.swap(array, i, wall);
				wall++;
			}
		}
		Utils.swap(array, pivot, wall);
		pivot = wall;
		return pivot;
	}

	public void sort(int[] array, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivot = partition(array, startIndex, endIndex);

			sort(array, startIndex, pivot - 1);
			sort(array, pivot + 1, endIndex);
		}
	}
}
